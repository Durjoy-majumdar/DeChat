package com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription;

import android.app.Application;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.TextView;
import be0.C16783a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestDialogUiData;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.WordingInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32226l;
import fy3.C32228q;
import gt0.C87370k0;
import gt0.C87372l0;
import gy3.C87412m;
import gy3.C87413o;
import hr0.C87584b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import p224ra.C89909e;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64186f0;
import wt0.C78650e;
import zd0.C16142r;
import zd0.C23466p;
import zd0.C23489q;
import zd0.C91663l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/GetSubscribeMsgListExecutor;", "Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/ISubscribeMsgCGIExecutor;", "b", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor */
public final class GetSubscribeMsgListExecutor implements ISubscribeMsgCGIExecutor {
    public static final Parcelable.Creator<GetSubscribeMsgListExecutor> CREATOR = new C17911a();

    /* renamed from: d */
    public final String f49384d;

    /* renamed from: e */
    public final List<String> f49385e;

    /* renamed from: f */
    public final String f49386f;

    /* renamed from: g */
    public final int f49387g;

    /* renamed from: h */
    public C16783a.C16784a f49388h = C17912a.f49411a;

    /* renamed from: i */
    public C17906b f49389i;

    /* renamed from: j */
    public C23466p f49390j;

    /* renamed from: n */
    public C78650e f49391n;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor$b */
    public interface C17906b {
        /* renamed from: a */
        void mo22175a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult);

        /* renamed from: b */
        void mo22176b(C87370k0 k0Var);

        /* renamed from: c */
        void mo22177c(C87370k0 k0Var, C87372l0 l0Var);

        /* renamed from: d */
        void mo22178d(String str, List<SubscribeMsgTmpItem> list, SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor$c */
    public static final class C17907c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f49392d;

        /* renamed from: e */
        public final /* synthetic */ List<C23466p.C23474i> f49393e;

        /* renamed from: f */
        public final /* synthetic */ GetSubscribeMsgListExecutor f49394f;

        /* renamed from: g */
        public final /* synthetic */ boolean f49395g;

        /* renamed from: h */
        public final /* synthetic */ boolean f49396h;

        /* renamed from: i */
        public final /* synthetic */ SubscribeMsgRequestResult f49397i;

        /* renamed from: j */
        public final /* synthetic */ int f49398j;

        /* renamed from: n */
        public final /* synthetic */ Map<Integer, Integer> f49399n;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor$c$a */
        public static final class C17908a implements C23466p.C23483m {

            /* renamed from: a */
            public final /* synthetic */ boolean f49400a;

            /* renamed from: b */
            public final /* synthetic */ C32228q<Integer, List<C23466p.C23474i>, Boolean, C13598b0> f49401b;

            /* renamed from: c */
            public final /* synthetic */ GetSubscribeMsgListExecutor f49402c;

            /* renamed from: d */
            public final /* synthetic */ Map<Integer, Integer> f49403d;

            /* renamed from: e */
            public final /* synthetic */ List<C23466p.C23474i> f49404e;

            /* renamed from: f */
            public final /* synthetic */ SubscribeMsgRequestResult f49405f;

            /* renamed from: g */
            public final /* synthetic */ Context f49406g;

            public C17908a(boolean z, C32228q<? super Integer, ? super List<C23466p.C23474i>, ? super Boolean, C13598b0> qVar, GetSubscribeMsgListExecutor getSubscribeMsgListExecutor, Map<Integer, Integer> map, List<C23466p.C23474i> list, SubscribeMsgRequestResult subscribeMsgRequestResult, Context context) {
                this.f49400a = z;
                this.f49401b = qVar;
                this.f49402c = getSubscribeMsgListExecutor;
                this.f49403d = map;
                this.f49404e = list;
                this.f49405f = subscribeMsgRequestResult;
                this.f49406g = context;
            }

            /* renamed from: a */
            public void mo22180a(C16142r rVar, boolean z, C23466p.C23474i iVar, boolean z2) {
                C87412m.m108594g(rVar, TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH);
                C87412m.m108594g(iVar, "item");
                if (rVar == C16142r.SWITCH_FORCE_NOTIFY && z && z2) {
                    GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f49402c;
                    Context context = this.f49406g;
                    C23466p c = getSubscribeMsgListExecutor.mo22172c();
                    getSubscribeMsgListExecutor.getClass();
                    if (context != null) {
                        C91663l lVar = new C91663l(context);
                        if (!MultiProcessMMKV.getDefault().getBoolean("appbrand_subscribe_msg_force_notify_template_show_guide", false)) {
                            C17906b bVar = getSubscribeMsgListExecutor.f49389i;
                            if (bVar != null) {
                                bVar.mo22177c(c, new C17916d(getSubscribeMsgListExecutor, lVar));
                            }
                            lVar.f262643g = new C17917e(getSubscribeMsgListExecutor, c);
                            MultiProcessMMKV.getDefault().putBoolean("appbrand_subscribe_msg_force_notify_template_show_guide", true);
                        }
                    }
                }
            }

            /* renamed from: b */
            public void mo22181b(int i, List<? extends C23466p.C23474i> list) {
                int i2 = i;
                List<? extends C23466p.C23474i> list2 = list;
                C87412m.m108594g(list2, "resultData");
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list2);
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    if (this.f49400a) {
                        this.f49401b.invoke(Integer.valueOf(i2 == 2 ? 3 : i2), arrayList, Boolean.valueOf(this.f49402c.mo22172c().f67304A.isChecked()));
                    } else {
                        this.f49401b.invoke(Integer.valueOf(i), arrayList, Boolean.valueOf(this.f49402c.mo22172c().f67304A.isChecked()));
                    }
                }
                List<T> y0 = C110818d0.m150953y0(this.f49403d.keySet());
                ArrayList arrayList2 = new ArrayList();
                for (T intValue : y0) {
                    Integer num = this.f49403d.get(Integer.valueOf(intValue.intValue()));
                    if (num != null) {
                        arrayList2.add(Integer.valueOf(num.intValue()));
                    }
                }
                GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f49402c;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f49405f.f49004h);
                C13598b0 b0Var = C13598b0.f38549a;
                List<C23466p.C23474i> list3 = this.f49404e;
                getSubscribeMsgListExecutor.getClass();
                C17915c cVar = new C17915c(list3);
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    SubscribeMsgTmpItem subscribeMsgTmpItem = (SubscribeMsgTmpItem) it.next();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("templateType", String.valueOf(subscribeMsgTmpItem.f49022g));
                    linkedHashMap.put("selected", String.valueOf(((Boolean) cVar.invoke(subscribeMsgTmpItem)).booleanValue()));
                    linkedHashMap.put("templateID", subscribeMsgTmpItem.f49021f);
                    arrayList4.add(linkedHashMap);
                }
                boolean isChecked = this.f49402c.mo22172c().f67304A.isChecked();
                int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 3 : 2 : 1;
                ArrayList arrayList5 = arrayList4;
                String S = C110818d0.m150921S(y0, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
                ArrayList arrayList6 = arrayList2;
                GetSubscribeMsgListExecutor getSubscribeMsgListExecutor2 = getSubscribeMsgListExecutor;
                String S2 = C110818d0.m150921S(arrayList6, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
                C87584b bVar = (C87584b) C89909e.m112439d(C87584b.class, true);
                if (bVar != null) {
                    bVar.mo121691h(17524, -1, Uri.encode(new JSONArray(arrayList5).toString()), Integer.valueOf(i3), Integer.valueOf(isChecked ? 1 : 0), -1, -1, getSubscribeMsgListExecutor2.f49384d, "", S, S2, 1, "", getSubscribeMsgListExecutor2.f49386f, Integer.valueOf(getSubscribeMsgListExecutor2.f49387g + 1000));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor$c$b */
        public static final class C17909b implements C23489q {

            /* renamed from: a */
            public final /* synthetic */ SubscribeMsgRequestResult f49407a;

            /* renamed from: b */
            public final /* synthetic */ Map<Integer, Integer> f49408b;

            public C17909b(SubscribeMsgRequestResult subscribeMsgRequestResult, Map<Integer, Integer> map) {
                this.f49407a = subscribeMsgRequestResult;
                this.f49408b = map;
            }

            /* renamed from: a */
            public void mo22182a(String str, boolean z, int i) {
                T t;
                C87412m.m108594g(str, "templateId");
                Iterator<T> it = this.f49407a.f49004h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (TextUtils.equals(((SubscribeMsgTmpItem) t).f49021f, str)) {
                        break;
                    }
                }
                if (((SubscribeMsgTmpItem) t) != null) {
                    Map<Integer, Integer> map = this.f49408b;
                    Integer valueOf = Integer.valueOf(i);
                    Integer num = map.get(Integer.valueOf(i));
                    map.put(valueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor$c$c */
        public static final class C17910c extends C87413o implements C32228q<Integer, List<C23466p.C23474i>, Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ GetSubscribeMsgListExecutor f49409d;

            /* renamed from: e */
            public final /* synthetic */ SubscribeMsgRequestResult f49410e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17910c(GetSubscribeMsgListExecutor getSubscribeMsgListExecutor, SubscribeMsgRequestResult subscribeMsgRequestResult) {
                super(3);
                this.f49409d = getSubscribeMsgListExecutor;
                this.f49410e = subscribeMsgRequestResult;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                int intValue = ((Number) obj).intValue();
                List list = (List) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                C87412m.m108594g(list, "items");
                SubscribeMsgRequestDialogUiData a = SubscribeMsgRequestDialogUiData.f48992g.mo21949a(intValue, list, booleanValue);
                GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f49409d;
                C17906b bVar = getSubscribeMsgListExecutor.f49389i;
                if (bVar != null) {
                    bVar.mo22178d(getSubscribeMsgListExecutor.f49384d, this.f49410e.f49004h, a);
                }
                return C13598b0.f38549a;
            }
        }

        public C17907c(Context context, List<C23466p.C23474i> list, GetSubscribeMsgListExecutor getSubscribeMsgListExecutor, boolean z, boolean z2, SubscribeMsgRequestResult subscribeMsgRequestResult, int i, Map<Integer, Integer> map) {
            this.f49392d = context;
            this.f49393e = list;
            this.f49394f = getSubscribeMsgListExecutor;
            this.f49395g = z;
            this.f49396h = z2;
            this.f49397i = subscribeMsgRequestResult;
            this.f49398j = i;
            this.f49399n = map;
        }

        public final void run() {
            String str;
            C17910c cVar = new C17910c(this.f49394f, this.f49397i);
            Context context = this.f49392d;
            if (context instanceof Application) {
                cVar.invoke(2, this.f49393e, Boolean.FALSE);
                Log.m105928w("AppBrandSubscribeMsg.GetSubscribeMsgListExecutor", "a context which is Application to perform show dialog will case [UnsupportedOperationException] here");
                return;
            }
            GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f49394f;
            List<C23466p.C23474i> list = this.f49393e;
            boolean z = this.f49396h;
            List<C23466p.C23474i> list2 = list;
            C17908a aVar = new C17908a(z, cVar, getSubscribeMsgListExecutor, this.f49399n, list2, this.f49397i, context);
            boolean z2 = this.f49395g;
            getSubscribeMsgListExecutor.getClass();
            getSubscribeMsgListExecutor.f49390j = new C23466p(context, list2, aVar, z2, z, new C68617b(getSubscribeMsgListExecutor));
            C23466p c = this.f49394f.mo22172c();
            String str2 = this.f49397i.f49013t;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            c.f67333p.setText(str2);
            C23466p c2 = this.f49394f.mo22172c();
            String str4 = this.f49397i.f49014u;
            if (str4 == null) {
                str4 = str3;
            }
            c2.mo36947h(str4);
            C23466p c3 = this.f49394f.mo22172c();
            String str5 = this.f49397i.f49002f;
            C87412m.m108594g(str5, "value");
            c3.f67332o.setText(str5);
            TextView textView = c3.f67332o;
            textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
            textView.getPaint().setStrokeWidth(0.8f);
            C23466p c4 = this.f49394f.mo22172c();
            WordingInfo wordingInfo = this.f49397i.f49007n;
            if (!(wordingInfo == null || (str = wordingInfo.f49041h) == null)) {
                str3 = str;
            }
            c4.f67315L = str3;
            C23466p c5 = this.f49394f.mo22172c();
            String str6 = this.f49397i.f49001e;
            C87412m.m108594g(str6, "value");
            c5.f67314K = str6;
            C23466p c6 = this.f49394f.mo22172c();
            WordingInfo wordingInfo2 = this.f49397i.f49007n;
            C87412m.m108591d(wordingInfo2);
            String str7 = wordingInfo2.f49037d;
            C87412m.m108594g(str7, "value");
            c6.f67331n.setText(str7);
            TextView textView2 = c6.f67331n;
            textView2.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
            textView2.getPaint().setStrokeWidth(0.8f);
            C23466p c7 = this.f49394f.mo22172c();
            WordingInfo wordingInfo3 = this.f49397i.f49007n;
            C87412m.m108591d(wordingInfo3);
            String str8 = wordingInfo3.f49038e;
            C87412m.m108594g(str8, "value");
            c7.f67336s.setText(str8);
            C23466p c8 = this.f49394f.mo22172c();
            WordingInfo wordingInfo4 = this.f49397i.f49007n;
            C87412m.m108591d(wordingInfo4);
            String str9 = wordingInfo4.f49039f;
            C87412m.m108594g(str9, "value");
            c8.f67335r.setText(str9);
            this.f49394f.mo22172c().f67321S = C0966R.C0969drawable.c8n;
            if (this.f49398j == 2) {
                C23466p c9 = this.f49394f.mo22172c();
                WordingInfo wordingInfo5 = this.f49397i.f49007n;
                C87412m.m108591d(wordingInfo5);
                c9.mo36943f(wordingInfo5.f49040g);
            }
            if (this.f49396h) {
                C23466p c15 = this.f49394f.mo22172c();
                c15.f67319Q = false;
                c15.f67342y.setVisibility(8);
            } else {
                C23466p c16 = this.f49394f.mo22172c();
                WordingInfo wordingInfo6 = this.f49397i.f49007n;
                C87412m.m108591d(wordingInfo6);
                String str10 = wordingInfo6.f49042i;
                C87412m.m108594g(str10, "value");
                c16.f67318P = str10;
                c16.f67342y.setVisibility(0);
                c16.f67342y.setText(c16.f67318P);
            }
            this.f49394f.mo22172c().f67313J = new C17909b(this.f49397i, this.f49399n);
            GetSubscribeMsgListExecutor getSubscribeMsgListExecutor2 = this.f49394f;
            C17906b bVar = getSubscribeMsgListExecutor2.f49389i;
            if (bVar != null) {
                bVar.mo22176b(getSubscribeMsgListExecutor2.mo22172c());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor$a */
    public static final class C17911a implements Parcelable.Creator<GetSubscribeMsgListExecutor> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            String str = "";
            if (readString == null) {
                readString = str;
            }
            List createStringArrayList = parcel.createStringArrayList();
            if (createStringArrayList == null) {
                createStringArrayList = C64186f0.f181907d;
            }
            String readString2 = parcel.readString();
            if (readString2 != null) {
                str = readString2;
            }
            return new GetSubscribeMsgListExecutor(readString, createStringArrayList, str, parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new GetSubscribeMsgListExecutor[i];
        }
    }

    public GetSubscribeMsgListExecutor(String str, List<String> list, String str2, int i) {
        this.f49384d = str;
        this.f49385e = list;
        this.f49386f = str2;
        this.f49387g = i;
    }

    /* renamed from: a */
    public void mo17818a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        C87412m.m108594g(str, "errMsg");
        C17906b bVar = this.f49389i;
        if (bVar != null) {
            bVar.mo22175a(i, i2, str, subscribeMsgRequestResult);
        }
    }

    /* renamed from: b */
    public void mo22171b(Context context, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        boolean z;
        SubscribeMsgRequestResult subscribeMsgRequestResult2 = subscribeMsgRequestResult;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(subscribeMsgRequestResult2, "result");
        if (subscribeMsgRequestResult2.f49004h.size() == 0) {
            C17906b bVar = this.f49389i;
            if (bVar != null) {
                bVar.mo22178d(this.f49384d, subscribeMsgRequestResult2.f49004h, (SubscribeMsgRequestDialogUiData) null);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<SubscribeMsgTmpItem> it = subscribeMsgRequestResult2.f49004h.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            SubscribeMsgTmpItem next = it.next();
            if (next.f49032t) {
                arrayList.add(new C23466p.C23482l(next.f49023h == 1, next.f49020e, next.f49024i, next.f49021f, next.f49034v, next.f49022g));
            } else if (next.f49035w) {
                arrayList.add(new C23466p.C23481k(next.f49023h == 1, next.f49020e, next.f49024i, next.f49021f, next.f49036x, next.f49022g));
            } else {
                arrayList.add(new C23466p.C23474i(next.f49023h == 1, next.f49020e, next.f49024i, next.f49021f, next.f49022g));
            }
        }
        boolean z2 = subscribeMsgRequestResult2.f49011r == 1;
        if (z2) {
            ((C23466p.C23474i) arrayList.get(0)).f67353a = true;
        }
        if (arrayList.size() != 1 || !(arrayList.get(0) instanceof C23466p.C23482l)) {
            z = false;
        }
        MMHandlerThread.postToMainThread(new C17907c(context, arrayList, this, z2, z, subscribeMsgRequestResult, subscribeMsgRequestResult2.f49004h.get(0).f49022g, new LinkedHashMap()));
    }

    /* renamed from: c */
    public final C23466p mo22172c() {
        C23466p pVar = this.f49390j;
        if (pVar != null) {
            return pVar;
        }
        C87412m.m108603p("subscribeMsgRequestDialog");
        throw null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.f49384d);
        }
        if (parcel != null) {
            parcel.writeStringList(this.f49385e);
        }
        if (parcel != null) {
            parcel.writeString(this.f49386f);
        }
        if (parcel != null) {
            parcel.writeInt(this.f49387g);
        }
    }
}
