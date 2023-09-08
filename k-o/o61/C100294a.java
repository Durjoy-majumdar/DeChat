package o61;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.plugin.emoji.model.C93101b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i61.C98605n;
import j20.C117292a;
import java.util.ArrayList;
import q61.C101037a;
import te3.C101754a80;
import te3.C101824o80;

/* renamed from: o61.a */
public final class C100294a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100295b f293802d;

    /* renamed from: e */
    public final /* synthetic */ int f293803e;

    /* renamed from: f */
    public final /* synthetic */ C93101b f293804f;

    public C100294a(C100295b bVar, int i, C93101b bVar2) {
        this.f293802d = bVar;
        this.f293803e = i;
        this.f293804f = bVar2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f293802d.f293807f;
        Log.m105918d(str, "click banner item pos: " + this.f293803e);
        C100295b bVar = this.f293802d;
        C93101b bVar2 = bVar.f293806e.get(this.f293803e);
        bVar.getClass();
        if (bVar2 != null) {
            if (bVar2.f268229c) {
                C98605n.m128199a(bVar.f293805d, bVar2.f268227a, true);
            } else {
                C101824o80 o802 = bVar2.f268228b.f145151d;
                C87412m.m108593f(o802, "banner.banner.BannerSummary");
                String str2 = bVar.f293807f;
                Log.m105918d(str2, "banner productId: " + o802.f298994d);
                C115669n.INSTANCE.mo160131h(11929, 0);
                C98605n.m128201c(bVar.f293805d, o802, false, 15, -1, -1, "", 8);
            }
        }
        C100295b bVar3 = this.f293802d;
        if (bVar3.f293810i) {
            C93101b bVar4 = this.f293804f;
            int i = this.f293803e;
            int i2 = bVar3.f293809h;
            if (bVar4 != null) {
                String a = C101037a.m132403a(bVar4);
                C101754a80 a802 = bVar4.f268227a;
                String str3 = a802 != null ? a802.f297839e : null;
                if (str3 == null) {
                    str3 = "null";
                }
                EmoticonStoreActionStruct emoticonStoreActionStruct = new EmoticonStoreActionStruct();
                emoticonStoreActionStruct.mo126613s(String.valueOf(i));
                emoticonStoreActionStruct.f265474j = (long) i2;
                emoticonStoreActionStruct.f265468d = C101037a.f295825a;
                emoticonStoreActionStruct.f265469e = 1;
                emoticonStoreActionStruct.f265470f = 3;
                emoticonStoreActionStruct.mo126618x(a);
                emoticonStoreActionStruct.mo126614t(str3);
                emoticonStoreActionStruct.mo86054n();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
