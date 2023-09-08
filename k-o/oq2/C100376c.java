package oq2;

import android.text.TextUtils;
import android.util.ArrayMap;
import co2.C92443k;
import com.tencent.p014mm.plugin.sns.p104ad.widget.stackup.StackUpLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import vr2.C102236a0;

/* renamed from: oq2.c */
public class C100376c implements StackUpLayout.C94784a {

    /* renamed from: e */
    public static final Map<String, int[]> f293990e = new ArrayMap();

    /* renamed from: f */
    public static final int[] f293991f = {0, 1, 2};

    /* renamed from: a */
    public String f293992a;

    /* renamed from: b */
    public C92443k f293993b;

    /* renamed from: c */
    public int[] f293994c = f293991f;

    /* renamed from: d */
    public String f293995d;

    /* renamed from: a */
    public final String mo139652a() {
        SnsMethodCalculate.markStartTimeMs("ensureUin", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        if (TextUtils.isEmpty(this.f293995d)) {
            this.f293995d = C86709a0.m107523b().mo121111i();
        }
        String str = this.f293995d;
        SnsMethodCalculate.markEndTimeMs("ensureUin", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        return str;
    }

    /* renamed from: b */
    public int mo139653b() {
        SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        try {
            C92443k kVar = this.f293993b;
            if (kVar == null) {
                SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                return 0;
            }
            List<String> list = kVar.f264543e;
            if (list == null) {
                SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                return 0;
            }
            int min = Math.min(((ArrayList) list).size(), 3);
            SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return min;
        } catch (Throwable unused) {
            Log.m105928w("SnsAd.Participants", "getItemCount error ");
            SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return 0;
        }
    }

    /* renamed from: c */
    public void mo139654c(StackUpLayout stackUpLayout, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("injectAdapter", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        try {
            mo139655d(stackUpLayout, snsInfo);
        } catch (Throwable th) {
            Log.m105928w("SnsAd.Participants", "injectAdapter error " + th.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("injectAdapter", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
    }

    /* renamed from: d */
    public final void mo139655d(StackUpLayout stackUpLayout, SnsInfo snsInfo) {
        C92443k kVar;
        int[] iArr;
        int[] iArr2;
        int nextInt;
        int nextInt2;
        SnsMethodCalculate.markStartTimeMs("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        if (stackUpLayout == null || snsInfo == null) {
            Log.m105928w("SnsAd.Participants", "the input layout or sns information is null!!");
            SnsMethodCalculate.markEndTimeMs("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return;
        }
        String W = C102236a0.m134728W(snsInfo);
        if (TextUtils.isEmpty(W) || W.equals(this.f293992a)) {
            Log.m105928w("SnsAd.Participants", "the sns id is empty or same as last one!!");
            SnsMethodCalculate.markEndTimeMs("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("getTopicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        if (snsInfo.getAdXml() == null) {
            Log.m105928w("SnsAd.Participants", "the sns info or ad xml is null!!");
            kVar = null;
            SnsMethodCalculate.markEndTimeMs("getTopicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        } else {
            kVar = snsInfo.getAdXml().adFinderTopicInfo;
            SnsMethodCalculate.markEndTimeMs("getTopicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        }
        if (kVar == null) {
            Log.m105928w("SnsAd.Participants", "i think you are crazy!!!! Why is the topic-info null?");
            SnsMethodCalculate.markEndTimeMs("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
            return;
        }
        this.f293992a = W;
        this.f293993b = kVar;
        List<String> list = kVar.f264543e;
        int size = list == null ? 0 : ((ArrayList) list).size();
        mo139652a();
        String a = mo139652a();
        SnsMethodCalculate.markStartTimeMs("getRandomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        if (TextUtils.isEmpty(W) || TextUtils.isEmpty(a) || size < 3) {
            iArr = f293991f;
            SnsMethodCalculate.markEndTimeMs("getRandomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        } else {
            iArr = (int[]) ((ArrayMap) f293990e).get(W);
            SnsMethodCalculate.markStartTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
            boolean z = iArr == null || iArr.length == 0;
            SnsMethodCalculate.markEndTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
            if (z) {
                String str = W + a + size;
                SnsMethodCalculate.markStartTimeMs("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                if (str == null || size <= 0) {
                    iArr2 = f293991f;
                    SnsMethodCalculate.markEndTimeMs("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                } else {
                    Random random = new Random((long) str.hashCode());
                    int nextInt3 = random.nextInt(size);
                    int i = 0;
                    do {
                        nextInt = random.nextInt(size);
                        i++;
                        if (nextInt3 != nextInt) {
                            break;
                        }
                    } while (i < 3);
                    if (i >= 3) {
                        nextInt = (nextInt3 + 1) % size;
                    }
                    int i2 = 0;
                    do {
                        nextInt2 = random.nextInt(size);
                        i2++;
                        if (nextInt2 != nextInt && nextInt2 != nextInt3) {
                            break;
                        }
                    } while (i2 < 3);
                    if (i2 >= 3) {
                        nextInt2 = (nextInt + 1) % size;
                    }
                    if (nextInt3 == nextInt || nextInt3 == nextInt2 || nextInt == nextInt2) {
                        iArr2 = f293991f;
                        SnsMethodCalculate.markEndTimeMs("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                    } else {
                        iArr2 = new int[]{nextInt3, nextInt, nextInt2};
                        SnsMethodCalculate.markEndTimeMs("randomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
                    }
                }
                iArr = iArr2;
                ((ArrayMap) f293990e).put(W, iArr);
            }
            SnsMethodCalculate.markEndTimeMs("getRandomIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
        }
        this.f293994c = iArr;
        stackUpLayout.setAdapter(this);
        SnsMethodCalculate.markEndTimeMs("injectAdapterInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardParticipantsHelper");
    }
}
