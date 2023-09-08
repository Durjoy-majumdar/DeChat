package jq2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import br2.C54550e;
import co2.C92450s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsAdLivingStreamJumpEvent;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import j20.C117292a;
import java.util.ArrayList;
import jp2.C98963o;
import up2.C102064e;
import vr2.C102236a0;

/* renamed from: jq2.y */
public class C99012y {

    /* renamed from: a */
    public Context f290280a;

    /* renamed from: b */
    public int f290281b;

    /* renamed from: c */
    public RoundedCornerFrameLayout f290282c;

    /* renamed from: d */
    public ImageView f290283d;

    /* renamed from: e */
    public ImageView f290284e;

    /* renamed from: f */
    public TextView f290285f;

    /* renamed from: g */
    public C92450s f290286g;

    /* renamed from: h */
    public C102064e f290287h;

    /* renamed from: i */
    public SnsInfo f290288i;

    /* renamed from: j */
    public View.OnClickListener f290289j = new C99013a();

    /* renamed from: jq2.y$a */
    public class C99013a implements View.OnClickListener {
        public C99013a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/helper/TimelineTagBtnHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper$1");
            C99012y yVar = C99012y.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
            C92450s sVar = yVar.f290286g;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
            if (sVar != null) {
                C99012y yVar2 = C99012y.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                C92450s sVar2 = yVar2.f290286g;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                if (sVar2.f264600p) {
                    C99012y yVar3 = C99012y.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                    SnsInfo snsInfo = yVar3.f290288i;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                    if (C54550e.m61296a(snsInfo)) {
                        SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new SnsAdLivingStreamJumpEvent();
                        SnsAdLivingStreamJumpEvent.C55163a aVar = snsAdLivingStreamJumpEvent.f154872d;
                        C99012y yVar4 = C99012y.this;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                        SnsInfo snsInfo2 = yVar4.f290288i;
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                        aVar.f154873a = C102236a0.m134728W(snsInfo2);
                        snsAdLivingStreamJumpEvent.publish();
                    }
                    C99012y yVar5 = C99012y.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                    C102064e eVar = yVar5.f290287h;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                    eVar.mo141556e(view);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/helper/TimelineTagBtnHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C99012y(Context context, int i, C98963o oVar, RoundedCornerFrameLayout roundedCornerFrameLayout, C102064e.C102069c cVar) {
        this.f290280a = context;
        this.f290281b = i;
        this.f290282c = roundedCornerFrameLayout;
        this.f290283d = (ImageView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.jr6);
        this.f290284e = (ImageView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.jr8);
        this.f290285f = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.jr9);
        this.f290282c.setOnClickListener(this.f290289j);
        this.f290287h = new C102064e(this.f290280a, this.f290281b, oVar, (C102064e.C102068b) null, cVar);
    }
}
