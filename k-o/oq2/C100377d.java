package oq2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import co2.C92443k;
import co2.C92444l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C96983o3;
import er2.C97693b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import rq2.C101419f;
import rq2.C101425k;
import rq2.C101432s;
import rq2.C13098l;
import te3.C101804kv2;

/* renamed from: oq2.d */
public class C100377d extends RecyclerView.C16613e<C100378e> implements View.OnClickListener {

    /* renamed from: d */
    public RecyclerView f293996d;

    /* renamed from: e */
    public List<C92444l> f293997e;

    /* renamed from: f */
    public SnsInfo f293998f;

    /* renamed from: g */
    public Context f293999g;

    /* renamed from: h */
    public C97693b f294000h;

    public C100377d(RecyclerView recyclerView, SnsInfo snsInfo) {
        if (recyclerView != null) {
            this.f293996d = recyclerView;
            this.f293999g = recyclerView.getContext();
        } else {
            this.f293999g = MMApplicationContext.getContext();
        }
        SnsMethodCalculate.markStartTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        if (snsInfo != null) {
            try {
                if (snsInfo.getAdXml() != null) {
                    ADXml adXml = snsInfo.getAdXml();
                    C92443k kVar = adXml.adFinderTopicInfo;
                    if (kVar != null) {
                        if (!C101425k.m133097a(kVar.f264544f)) {
                            this.f293998f = snsInfo;
                            this.f293997e = adXml.adFinderTopicInfo.f264544f;
                            SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                            return;
                        }
                    }
                    Log.m105928w("SnsAd.RecyclerViewAdapter", "the adFinderTopicInfo or resource info list is null, initialize adapter failed!!!");
                    SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        Log.m105928w("SnsAd.RecyclerViewAdapter", "the sns info is null, initialize adapter failed!");
        SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    /* renamed from: F4 */
    public C92444l mo139656F4(int i) {
        SnsMethodCalculate.markStartTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        try {
            List<C92444l> list = this.f293997e;
            if (list != null && i >= 0 && i < ((ArrayList) list).size()) {
                C92444l lVar = (C92444l) ((ArrayList) this.f293997e).get(i);
                SnsMethodCalculate.markEndTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                return lVar;
            }
        } catch (Throwable th) {
            Log.m105928w("SnsAd.RecyclerViewAdapter", "the getResInfo has something wrong " + th.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return null;
    }

    /* renamed from: G4 */
    public void mo139657G4(C100378e eVar, C92444l lVar, int i) {
        GradientDrawable gradientDrawable;
        SnsMethodCalculate.markStartTimeMs("processBottomBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        float b = ((float) (i - C76577a.m92151b(this.f293999g, 76))) - C101432s.m133119a(eVar.f294006F, lVar.f264547c);
        C101432s.m133128j(eVar.f294006F, lVar.f264547c);
        C101432s.m133127i(eVar.f294007G, (int) (b + 0.5f));
        C101432s.m133128j(eVar.f294007G, lVar.f264548d);
        ViewGroup viewGroup = eVar.f294005E;
        float b2 = (float) C76577a.m92151b(this.f293999g, 100);
        float f = lVar.f264550f;
        if (f <= 0.0f) {
            f = 0.8f;
        }
        int a = C13098l.m12543a(lVar.f264549e, -352965);
        SnsMethodCalculate.markStartTimeMs("setRoundBackground", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (viewGroup == null) {
            SnsMethodCalculate.markEndTimeMs("setRoundBackground", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        } else {
            try {
                Drawable background = viewGroup.getBackground();
                if (background instanceof GradientDrawable) {
                    gradientDrawable = (GradientDrawable) background;
                    gradientDrawable.mutate();
                } else {
                    gradientDrawable = new GradientDrawable();
                }
                gradientDrawable.setShape(0);
                gradientDrawable.setAlpha((int) ((f * 255.0f) + 0.5f));
                gradientDrawable.setColor(a);
                gradientDrawable.setCornerRadius(b2);
                viewGroup.setBackground(gradientDrawable);
            } catch (Throwable unused) {
                Log.m105928w("ViewUtils", "setRoundBackground error.");
            }
            SnsMethodCalculate.markEndTimeMs("setRoundBackground", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        }
        SnsMethodCalculate.markEndTimeMs("processBottomBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    /* renamed from: O4 */
    public void mo139658O4(C100378e eVar, C92444l lVar) {
        SnsMethodCalculate.markStartTimeMs("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        if (lVar.mo126434a()) {
            Log.m105924i("SnsAd.RecyclerViewAdapter", "the resInfo is sight");
            SnsMethodCalculate.markStartTimeMs("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            C94901o Fx0 = C94866e1.Fx0();
            C101804kv2 kv22 = lVar.f264553i;
            ImageView imageView = eVar.f294008z;
            int hashCode = this.f293999g.hashCode();
            C96983o3 o3Var = C96983o3.f284140l;
            o3Var.f284145b = this.f293998f.getTimeLine().CreateTime;
            Fx0.mo131114e0(kv22, imageView, -1, hashCode, o3Var);
            C101432s.m133132n(eVar.f294001A, true);
            SnsMethodCalculate.markEndTimeMs("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        } else {
            C101419f.m133081d(lVar.f264553i.f298694i, eVar.f294008z, 3);
        }
        SnsMethodCalculate.markEndTimeMs("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    /* renamed from: g5 */
    public void mo139659g5(C100378e eVar, C92444l lVar, int i) {
        SnsMethodCalculate.markStartTimeMs("processTopBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        C101419f.m133081d(lVar.f264545a, eVar.f294002B, 1);
        C101432s.m133128j(eVar.f294003C, lVar.f264546b);
        C101432s.m133127i(eVar.f294003C, (int) ((((float) (i - C76577a.m92151b(this.f293999g, 80))) - C101432s.m133119a(eVar.f294003C, lVar.f264551g)) + 0.5f));
        if (!TextUtils.isEmpty(lVar.f264551g)) {
            C101432s.m133132n(eVar.f294004D, true);
            C101432s.m133128j(eVar.f294004D, lVar.f264551g);
        } else {
            C101432s.m133132n(eVar.f294004D, false);
        }
        SnsMethodCalculate.markEndTimeMs("processTopBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    public int getItemCount() {
        SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        List<C92444l> list = this.f293997e;
        if (list != null) {
            int size = ((ArrayList) list).size();
            SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            return size;
        }
        SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return 0;
    }

    public long getItemId(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        long j = (long) i;
        SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return j;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        C100378e eVar = (C100378e) zVar;
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        try {
            Log.m105918d("SnsAd.RecyclerViewAdapter", "onBindViewHolder:: the pos is " + i);
            C92444l F4 = mo139656F4(i);
            RecyclerView recyclerView = this.f293996d;
            if (!(F4 == null || recyclerView == null)) {
                if (eVar != null) {
                    int width = recyclerView.getWidth();
                    SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardSubItemViewHolder");
                    C101432s.m133130l(eVar.f294004D);
                    C101432s.m133130l(eVar.f294001A);
                    SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardSubItemViewHolder");
                    mo139659g5(eVar, F4, width);
                    mo139657G4(eVar, F4, width);
                    mo139658O4(eVar, F4);
                    SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                    SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                }
            }
            Log.m105928w("SnsAd.RecyclerViewAdapter", "the res info or recyclerView is null!!!!");
            SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        try {
            C97693b bVar = this.f294000h;
            RecyclerView recyclerView = this.f293996d;
            if (view == null || recyclerView == null || bVar == null) {
                Log.m105928w("SnsAd.RecyclerViewAdapter", "the recycler view or click listener is null!!!");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (view.getParent() != recyclerView) {
                Log.m105920e("SnsAd.RecyclerViewAdapter", "are you cray?!! the parent of the clicked view is not same as the input recycler view!!");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                RecyclerView.C16631z P0 = recyclerView.mo17031P0(view);
                if (P0 == null) {
                    Log.m105920e("SnsAd.RecyclerViewAdapter", "I think the statement can't be reached, why?");
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                bVar.mo136948c(recyclerView, view, P0.mo17363j());
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        } catch (Throwable unused) {
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C100378e eVar;
        SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        try {
            Log.m105918d("SnsAd.RecyclerViewAdapter", "mRecyclerView width is " + viewGroup.getWidth());
            View f = C101432s.m133124f(this.f293999g, C0966R.C0971layout.c0r, viewGroup, false);
            int b = C76577a.m92151b(this.f293999g, 8);
            if (f instanceof RoundedCornerFrameLayout) {
                float f2 = (float) b;
                ((RoundedCornerFrameLayout) f).mo153905b(f2, f2, 0.0f, 0.0f);
            }
            if (f != null) {
                f.setOnClickListener(this);
                eVar = new C100378e(f);
                SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            } else {
                Log.m105920e("SnsAd.RecyclerViewAdapter", "the inflated view is null????");
                C100378e eVar2 = new C100378e(new View(viewGroup.getContext()));
                SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                eVar = eVar2;
            }
        } catch (Throwable unused) {
            Log.m105920e("SnsAd.RecyclerViewAdapter", "onCreateViewHolder failed????");
            eVar = new C100378e(new View(MMApplicationContext.getContext()));
            SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        }
        SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return eVar;
    }

    public void onViewDetachedFromWindow(RecyclerView.C16631z zVar) {
        SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        C100378e eVar = (C100378e) zVar;
        SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        super.onViewDetachedFromWindow(eVar);
        try {
            Log.m105918d("SnsAd.RecyclerViewAdapter", "the onViewDetachedFromWindow is called , position is " + eVar.mo17363j());
            C101432s.m133121c(eVar.f294001A);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }
}
