package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GetHbCoverStateEvent;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import eb0.C31543z5;
import java.io.Serializable;
import lo2.C99525b0;
import qs2.C101267h;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp */
public class AdLandingPageGetHBCoverBtnComp extends C95108i0 implements Serializable {

    /* renamed from: B */
    public C101267h f275836B;

    /* renamed from: C */
    public boolean f275837C = false;

    /* renamed from: D */
    public AdLandingPagesProxy.C94830p f275838D = new C95044a();

    /* renamed from: E */
    public IListener<GetHbCoverStateEvent> f275839E;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$a */
    public class C95044a implements AdLandingPagesProxy.C94830p {
        public C95044a() {
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$1");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$1");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$1");
            int intValue = ((Integer) obj).intValue();
            Log.m105924i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "onCallback, errType=" + i + ", errNo=" + i2 + ", state=" + intValue);
            if (intValue == 0) {
                String str = AdLandingPageGetHBCoverBtnComp.this.f275836B.f296597a0 + AdLandingPagesProxy.getInstance().getUin();
                SnsMethodCalculate.markStartTimeMs("saveString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
                if (TextUtils.isEmpty(str)) {
                    SnsMethodCalculate.markEndTimeMs("saveString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
                } else {
                    MMApplicationContext.getContext().getSharedPreferences("adLandingPageSp", 0).edit().putString(str, "0").commit();
                    Log.m105918d("AdLandingPageSp", "saveString, key=" + str + ", value=" + "0");
                    SnsMethodCalculate.markEndTimeMs("saveString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
                }
                GetHbCoverStateEvent getHbCoverStateEvent = new GetHbCoverStateEvent();
                GetHbCoverStateEvent.C92524a aVar = getHbCoverStateEvent.f264892d;
                aVar.f264893a = AdLandingPageGetHBCoverBtnComp.this.f275836B.f296597a0;
                aVar.f264894b = intValue;
                getHbCoverStateEvent.publish();
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$1");
        }
    }

    public AdLandingPageGetHBCoverBtnComp(Context context, C101267h hVar, ViewGroup viewGroup) {
        super(context, hVar, viewGroup);
        C950432 r1 = new IListener<GetHbCoverStateEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1796244288;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2");
                GetHbCoverStateEvent getHbCoverStateEvent = (GetHbCoverStateEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2");
                try {
                    Log.m105924i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "GetHbCoverStateEvent callback, hbCoverId=" + getHbCoverStateEvent.f264892d.f264893a + ", state=" + getHbCoverStateEvent.f264892d.f264894b);
                    if (AdLandingPageGetHBCoverBtnComp.this.f275836B.f296597a0.equals(getHbCoverStateEvent.f264892d.f264893a) && getHbCoverStateEvent.f264892d.f264894b == 0) {
                        MMHandlerThread.postToMainThread(new C95286y0(this));
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AdLandingPageGetHBCoverBtnComp", "GetHbCoverStateEvent exp:" + e.toString());
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2");
                return false;
            }
        };
        this.f275839E = r1;
        this.f275836B = hVar;
        r1.alive();
    }

    /* renamed from: b0 */
    public static boolean m120808b0(int i) {
        SnsMethodCalculate.markStartTimeMs("isFromSourcesSupportHbCover", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        boolean z = true;
        if (!(i == 1 || i == 16 || i == 2)) {
            z = false;
        }
        Log.m105924i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "isFromSourcesSupportHbCover, source=" + i + ", ret=" + z);
        SnsMethodCalculate.markEndTimeMs("isFromSourcesSupportHbCover", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        return z;
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        super.mo124360B();
        if (this.f275837C) {
            Log.m105924i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "viewWillAppear, isClicked=true, doGetHbCoverState");
            this.f275837C = false;
            AdLandingPagesProxy.getInstance().doGetHbCoverState(this.f275836B.f296597a0, this.f275838D);
        }
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        super.mo67235C();
        this.f275839E.dead();
        Log.m105924i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "viewWillDestroy");
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
    }

    /* renamed from: P */
    public void mo130182P() {
        SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        super.mo130182P();
        this.f275837C = true;
        SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
    }

    /* renamed from: c0 */
    public void mo131532c0() {
        SnsMethodCalculate.markStartTimeMs("setBtnDisabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        this.f276027v.setEnabled(false);
        this.f276027v.setTextColor(Color.parseColor("#33000000"));
        this.f276027v.setBackgroundColor(Color.parseColor("#0d000000"));
        C99525b0.m129881d(this.f276579d, mo131626O(), this.f276027v);
        SnsMethodCalculate.markEndTimeMs("setBtnDisabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        super.mo67240g();
        if (!m120808b0(mo131854m().mo140742i())) {
            Log.m105924i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "fillItem, from source unSupport");
            mo131532c0();
        } else {
            String str = this.f275836B.f296597a0 + AdLandingPagesProxy.getInstance().getUin();
            SnsMethodCalculate.markStartTimeMs("getString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
            String str2 = "";
            boolean z = false;
            if (TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markEndTimeMs("getString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
            } else {
                str2 = MMApplicationContext.getContext().getSharedPreferences("adLandingPageSp", 0).getString(str, str2);
                Log.m105918d("AdLandingPageSp", "getString, key=" + str + ", value=" + str2);
                SnsMethodCalculate.markEndTimeMs("getString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
            }
            boolean equals = "0".equals(str2);
            Log.m105924i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "fillItem, hasGetHbCober=" + equals);
            if (equals) {
                this.f276027v.setText(this.f275836B.f296596Z);
                mo131532c0();
            } else {
                C101267h hVar = this.f275836B;
                hVar.getClass();
                SnsMethodCalculate.markStartTimeMs("isExpired", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompGetHBCoverBtnInfo");
                try {
                    long e = (long) (C31543z5.m39455e() * 1000);
                    long j = hVar.f296598b0;
                    if (j > 0 && j < e) {
                        z = true;
                    }
                    SnsMethodCalculate.markEndTimeMs("isExpired", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompGetHBCoverBtnInfo");
                } catch (Throwable unused) {
                    SnsMethodCalculate.markEndTimeMs("isExpired", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompGetHBCoverBtnInfo");
                }
                if (!z) {
                    Log.m105924i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "fillItem, doGetHbCoverState");
                    AdLandingPagesProxy.getInstance().doGetHbCoverState(this.f275836B.f296597a0, this.f275838D);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
    }
}
