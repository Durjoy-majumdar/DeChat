package f02;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import c02.C92331c;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.p1099ui.FloatBallProxyUI;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.plugin.multitask.C105918j;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import g02.C98064a;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;
import p646pn.C110234e;
import rx3.C13604l;
import te3.C110964i13;
import te3.C64459j13;

/* renamed from: f02.c */
public final class C97776c {

    /* renamed from: a */
    public final Map<String, HandOff> f286853a = new LinkedHashMap();

    /* renamed from: b */
    public final Map<String, HandOff> f286854b = new LinkedHashMap();

    /* renamed from: c */
    public final Map<String, Boolean> f286855c = new LinkedHashMap();

    /* renamed from: d */
    public final C97777b f286856d;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lf02/c$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: f02.c$a */
    public static final class C31789a implements C80916r<Bundle, IPCBoolean> {
        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, "data");
            BallInfo ballInfo = (BallInfo) bundle.getParcelable("ballInfo");
            return ballInfo != null ? new IPCBoolean(((C92331c) C86312j.m106911c(C92331c.class)).mo58366gP(ballInfo, bundle.getBoolean("enterFloatBall"))) : new IPCBoolean(false);
        }
    }

    /* renamed from: f02.c$b */
    public static final class C97777b extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ C97776c f286857a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97777b(Looper looper, C97776c cVar) {
            super(looper);
            this.f286857a = cVar;
        }

        public void handleMessage(Message message) {
            Message message2 = message;
            C87412m.m108594g(message2, "msg");
            if (message2.what == 1) {
                Log.m105918d("HandOff.RequestProcessor", "handle commit message");
                C97776c cVar = this.f286857a;
                Class cls = C92331c.class;
                Class cls2 = C105918j.class;
                Class cls3 = C110234e.class;
                Map<String, HandOff> map = cVar.f286854b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    if (C87412m.m108589b(((LinkedHashMap) cVar.f286855c).get((String) entry.getKey()), Boolean.TRUE)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                try {
                    for (HandOff id : linkedHashMap.values()) {
                        HandOff cv = ((C92331c) C86312j.m106911c(cls)).mo58364cv(id.getId());
                        if (cv != null) {
                            if (C85875k4.m106163T()) {
                                MultiTaskInfo nm02 = ((C105918j) C86312j.m106911c(cls2)).nm0(cv.getKey());
                                if (nm02 != null) {
                                    Log.m105924i("HandOff.RequestProcessor", "processDelRequest multiTask");
                                    ((C105918j) C86312j.m106911c(cls2)).mo151020Ub(nm02.field_id);
                                    ((C92331c) C86312j.m106911c(cls)).m50();
                                }
                            } else {
                                int dataType = cv.getDataType();
                                BallInfo m0 = ((C110234e) C86312j.m106911c(cls3)).mo161399pY().mo149134m0(new BallInfo(dataType != 1 ? dataType != 2 ? dataType != 3 ? 0 : 1 : 2 : 4, cv.getKey(), (JSONObject) null));
                                if (m0 != null) {
                                    Log.m105924i("HandOff.RequestProcessor", "processDelRequest ballInfo");
                                    ((C110234e) C86312j.m106911c(cls3)).mo161399pY().mo149108Z(m0);
                                    ((C92331c) C86312j.m106911c(cls)).m50();
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.m105918d("HandOff.RequestProcessor", "delete handoff fail: " + e.getLocalizedMessage());
                }
                Map<String, HandOff> map2 = cVar.f286853a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : ((LinkedHashMap) map2).entrySet()) {
                    if (C87412m.m108589b(((LinkedHashMap) cVar.f286855c).get((String) entry2.getKey()), Boolean.FALSE)) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                try {
                    for (HandOff handOff : linkedHashMap2.values()) {
                        int a = C98064a.m126668a();
                        if (a <= 0) {
                            Log.m105924i("HandOff.RequestProcessor", "cannot add float ball, availableCount = " + a);
                            FloatBallProxyUI.m140993I7((Context) null, 3, (BallInfo) null, false, C97778d.f286858a);
                        } else if (C85875k4.m106163T()) {
                            C13604l<C64459j13, byte[]> createMultiTaskInfo = handOff.createMultiTaskInfo();
                            if (createMultiTaskInfo != null) {
                                int dataType2 = handOff.getDataType();
                                int i = dataType2 != 1 ? dataType2 != 2 ? dataType2 != 3 ? 0 : 1 : 2 : 4;
                                Log.m105924i("HandOff.RequestProcessor", "processAddRequest multiTask");
                                ((C105918j) C86312j.m106911c(cls2)).r40(handOff.getKey(), i, (C64459j13) createMultiTaskInfo.f38555d, (byte[]) createMultiTaskInfo.f38556e, (C110964i13) null);
                                ((C92331c) C86312j.m106911c(cls)).m50();
                            }
                        } else {
                            BallInfo createBallInfo = handOff.createBallInfo();
                            if (createBallInfo != null) {
                                Log.m105924i("HandOff.RequestProcessor", "processAddRequest ballInfo");
                                ((C110234e) C86312j.m106911c(cls3)).mo161399pY().mo149095M(createBallInfo);
                                ((C92331c) C86312j.m106911c(cls)).m50();
                            }
                        }
                    }
                } catch (Exception e2) {
                    Log.m105918d("HandOff.RequestProcessor", "add handoff fail: " + e2.getLocalizedMessage());
                }
                ((LinkedHashMap) cVar.f286853a).clear();
                ((LinkedHashMap) cVar.f286854b).clear();
                ((LinkedHashMap) cVar.f286855c).clear();
                return;
            }
        }
    }

    static {
        String str = WeChatProcess.PROCESS_PACKAGE_NAME;
    }

    public C97776c(Looper looper) {
        C87412m.m108594g(looper, "looper");
        this.f286856d = new C97777b(looper, this);
    }
}
