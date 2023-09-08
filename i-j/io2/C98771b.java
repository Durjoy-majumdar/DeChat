package io2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C60216z4;
import java.util.Map;
import nj3.C76912y0;
import zt3.C119157j;

/* renamed from: io2.b */
public class C98771b {

    /* renamed from: io2.b$a */
    public interface C98772a {
        /* renamed from: a */
        void mo130218a(String str, int i, int i2, Object obj);
    }

    /* renamed from: io2.b$b */
    public static abstract class C98773b {

        /* renamed from: a */
        public final String f289585a;

        /* renamed from: b */
        public final int f289586b;

        /* renamed from: c */
        public final C98772a f289587c;

        /* renamed from: io2.b$b$a */
        public class C98774a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f289588d;

            /* renamed from: e */
            public final /* synthetic */ C98772a f289589e;

            /* renamed from: f */
            public final /* synthetic */ Object f289590f;

            public C98774a(int i, C98772a aVar, Object obj) {
                this.f289588d = i;
                this.f289589e = aVar;
                this.f289590f = obj;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback$1");
                try {
                    Log.m105924i("SnsAd.FinderLivingRequest", "onResult:: snsId = " + C98773b.this.f289585a + ", action type = " + C98773b.this.f289586b + ", errorCode = " + this.f289588d);
                    C98772a aVar = this.f289589e;
                    C98773b bVar = C98773b.this;
                    aVar.mo130218a(bVar.f289585a, bVar.f289586b, this.f289588d, this.f289590f);
                } catch (Throwable unused) {
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback$1");
            }
        }

        public C98773b(String str, int i, C98772a aVar) {
            this.f289585a = str;
            this.f289586b = i;
            this.f289587c = aVar;
        }

        /* renamed from: b */
        public void mo138151b(int i, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback");
            C98772a aVar = this.f289587c;
            if (aVar != null) {
                try {
                    ((C119157j) C119157j.f356862d).mo183895z(new C98774a(i, aVar, obj));
                } catch (Throwable unused) {
                }
            }
            SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestCallback");
        }
    }

    /* renamed from: io2.b$c */
    public static class C98775c extends C98773b implements C60216z4.C8821a<Integer> {
        public C98775c(String str, int i, C98772a aVar) {
            super(str, i, aVar);
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            int i;
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
            Integer num = (Integer) obj;
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
            int i2 = -1;
            if (num == null) {
                i = -1;
            } else {
                try {
                    i = num.intValue();
                } catch (Throwable unused) {
                }
            }
            if (i != 0) {
                i2 = i;
            }
            Log.m105924i("SnsAd.FinderLivingRequest", "onCallback err, errCode=" + i2);
            mo138151b(i2, (Object) null);
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
        }
    }

    /* renamed from: io2.b$d */
    public static class C98776d extends C98773b implements C60216z4.C8821a<Boolean> {
        public C98776d(String str, int i, C98772a aVar) {
            super(str, i, aVar);
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
            Boolean bool = (Boolean) obj;
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
            if (bool == null) {
                try {
                    Log.m105928w("SnsAd.FinderLivingRequest", "the RequestSuccessCallBack value is null");
                } catch (Throwable unused) {
                }
            }
            mo138153c(0, bool == null ? false : bool.booleanValue());
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
        }

        /* renamed from: c */
        public final void mo138153c(int i, boolean z) {
            int i2;
            SnsMethodCalculate.markStartTimeMs("onSuccessCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
            int i3 = this.f289586b;
            if (i3 == 1) {
                SnsMethodCalculate.markStartTimeMs("getNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                if (z) {
                    i2 = 513;
                    SnsMethodCalculate.markEndTimeMs("getNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                } else {
                    i2 = 257;
                    SnsMethodCalculate.markEndTimeMs("getNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                }
            } else if (i3 == 3) {
                SnsMethodCalculate.markStartTimeMs("getLiveState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                if (z) {
                    i2 = 770;
                    SnsMethodCalculate.markEndTimeMs("getLiveState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                } else {
                    i2 = 771;
                    SnsMethodCalculate.markEndTimeMs("getLiveState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                }
            } else {
                i2 = 0;
            }
            mo138151b(i, Integer.valueOf(i2));
            SnsMethodCalculate.markEndTimeMs("onSuccessCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
        }
    }

    /* renamed from: io2.b$e */
    public static class C98777e extends C98773b implements C60216z4.C8821a<Void> {
        public C98777e(String str, int i, C98772a aVar) {
            super(str, i, aVar);
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBackWithoutParam");
            Void voidR = (Void) obj;
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBackWithoutParam");
            try {
                Log.m105924i("SnsAd.FinderLivingRequest", "onCallback succ");
                mo138151b(0, (Object) null);
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBackWithoutParam");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBackWithoutParam");
        }
    }

    /* renamed from: a */
    public static C60216z4 m128552a() {
        SnsMethodCalculate.markStartTimeMs("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        if (t1Var != null) {
            C60216z4 l7 = t1Var.mo76861l7();
            SnsMethodCalculate.markEndTimeMs("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            return l7;
        }
        SnsMethodCalculate.markEndTimeMs("getFinderUtilApi", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        return null;
    }

    /* renamed from: b */
    public static void m128553b(Context context, int i) {
        SnsMethodCalculate.markStartTimeMs("promptResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            Log.m105924i("SnsAd.FinderLivingRequest", "promptResult, errCode=" + i);
            if (context == null) {
                SnsMethodCalculate.markEndTimeMs("promptResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
                return;
            }
            if (i == 0) {
                C76912y0.m92768g(context, context.getString(C0966R.string.j_c));
            } else if (i == -200045) {
                C76912y0.m92767f(context, context.getString(C0966R.string.j_a));
            } else if (i == -200023) {
                C76912y0.m92767f(context, context.getString(C0966R.string.j__));
            } else {
                C76912y0.m92767f(context, context.getString(C0966R.string.j_b));
            }
            SnsMethodCalculate.markEndTimeMs("promptResult", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static void m128554c(String str, String str2, String str3, C98772a aVar) {
        SnsMethodCalculate.markStartTimeMs("requestLivingNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            C60216z4 a = m128552a();
            if (a == null) {
                Log.m105920e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in requestLivingNoticeState, is there something wrong in wechat??!!");
                SnsMethodCalculate.markEndTimeMs("requestLivingNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
                return;
            }
            a.mo83765L5(str2, str3, new C98776d(str, 1, aVar), new C98775c(str, 1, aVar));
            SnsMethodCalculate.markEndTimeMs("requestLivingNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        } catch (Throwable unused) {
            Log.m105920e("SnsAd.FinderLivingRequest", "requestLivingNoticeState is failed: sns id = " + str);
        }
    }

    /* renamed from: d */
    public static void m128555d(Context context, String str, String str2, String str3, String str4, Map<String, Object> map, String str5, C98772a aVar) {
        String str6 = str5;
        C98772a aVar2 = aVar;
        SnsMethodCalculate.markStartTimeMs("showLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1837, 6);
            Log.m105924i("SnsAd.FinderLivingRequest", "showLivingRoom, liveId=" + str2 + ", username=" + str + ", snsId=" + str6);
            C60216z4 a = m128552a();
            if (a == null) {
                Log.m105920e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in showLivingRoom, is there something wrong in wechat??!!, snsId=" + str6);
                SnsMethodCalculate.markEndTimeMs("showLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
                return;
            }
            long safeParseLong = Util.safeParseLong(str2);
            if (safeParseLong != 0) {
                a.mo83793k6(context, str, safeParseLong, str3, str4, map, new C98777e(str6, 4, aVar2), new C98775c(str6, 4, aVar2));
            } else {
                Log.m105920e("SnsAd.FinderLivingRequest", "is the liveId not number in showLivingRoom????, snsId=" + str6 + ", livingId=" + safeParseLong);
                nVar.mo175911u(1837, 5);
            }
            SnsMethodCalculate.markEndTimeMs("showLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static void m128556e(String str, String str2, String str3, C98772a aVar) {
        SnsMethodCalculate.markStartTimeMs("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            C60216z4 a = m128552a();
            if (a == null) {
                Log.m105920e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in subscribeLivingNotice, is there something wrong in wechat??!!");
                SnsMethodCalculate.markEndTimeMs("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
                return;
            }
            a.mo83764K5(str2, str3, true, new C98777e(str, 2, aVar), new C98775c(str, 2, aVar));
            SnsMethodCalculate.markEndTimeMs("subscribeLivingNotice", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        } catch (Throwable unused) {
            Log.m105920e("SnsAd.FinderLivingRequest", "subscribeLivingNotice is failed: sns id = " + str);
        }
    }
}
