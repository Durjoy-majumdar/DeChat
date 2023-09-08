package com.tencent.p014mm.plugin.rtos.p320ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RtosWatchGetQuickReplyEvent;
import com.tencent.p014mm.autogen.events.RtosWatchSaveQuickReplyEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import hk2.C32939b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import mk2.C34585h;
import ok2.C35183a;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.rtos.ui.RepairerRtosWatchUI */
public final class RepairerRtosWatchUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RepairerRtosWatchUI$a */
    public static final class C30363a implements View.OnClickListener {

        /* renamed from: d */
        public static final C30363a f81934d = new C30363a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C32939b) C86312j.m106911c(C32939b.class)).mo33888DL();
            C117292a.m165361g(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RepairerRtosWatchUI$b */
    public static final class C30364b implements View.OnClickListener {

        /* renamed from: d */
        public static final C30364b f81935d = new C30364b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C32939b) C86312j.m106911c(C32939b.class)).mo33887Cl();
            C117292a.m165361g(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RepairerRtosWatchUI$c */
    public static final class C30365c implements View.OnClickListener {

        /* renamed from: d */
        public static final C30365c f81936d = new C30365c();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C41166r1.Jx0().mo59901Yt(new C35183a());
            C35183a aVar = new C35183a();
            aVar.field_orderIndex = 3;
            aVar.field_quickMsg = "稍后回复";
            C41166r1.Jx0().mo59901Yt(aVar);
            C35183a aVar2 = new C35183a();
            aVar2.field_quickMsg = "稍后";
            C41166r1.Jx0().mo59901Yt(aVar2);
            C35183a aVar3 = new C35183a();
            aVar3.field_orderIndex = 1;
            aVar3.field_quickMsg = "稍后回复1";
            C41166r1.Jx0().mo59901Yt(aVar3);
            C35183a aVar4 = new C35183a();
            aVar4.field_orderIndex = 2;
            aVar4.field_quickMsg = "稍后回复2";
            C41166r1.Jx0().mo59901Yt(aVar4);
            ArrayList<C35183a> Lo = C41166r1.Jx0().mo59900Lo();
            if (!Lo.isEmpty()) {
                Iterator<C35183a> it = Lo.iterator();
                while (it.hasNext()) {
                    Log.m105924i("MicroMsg.Rtos.RepairerRtosWatchUI", it.next().toString());
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RepairerRtosWatchUI$d */
    public static final class C30366d implements View.OnClickListener {

        /* renamed from: d */
        public static final C30366d f81937d = new C30366d();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.Rtos.RepairerRtosWatchUI", "save quick reply.");
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < 4; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FirebaseAnalytics.C113379b.INDEX, i);
                jSONObject.put("msg", "Quick Reply " + i);
                jSONArray.put(jSONObject);
            }
            RtosWatchSaveQuickReplyEvent rtosWatchSaveQuickReplyEvent = new RtosWatchSaveQuickReplyEvent();
            rtosWatchSaveQuickReplyEvent.f78957d.f78959a = jSONArray.toString();
            rtosWatchSaveQuickReplyEvent.publish();
            Log.m105924i("MicroMsg.Rtos.RepairerRtosWatchUI", rtosWatchSaveQuickReplyEvent.f78958e.f78960a);
            C117292a.m165361g(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RepairerRtosWatchUI$e */
    public static final class C30367e implements View.OnClickListener {

        /* renamed from: d */
        public static final C30367e f81938d = new C30367e();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.Rtos.RepairerRtosWatchUI", "save quick reply.");
            RtosWatchGetQuickReplyEvent rtosWatchGetQuickReplyEvent = new RtosWatchGetQuickReplyEvent();
            rtosWatchGetQuickReplyEvent.publish();
            Log.m105924i("MicroMsg.Rtos.RepairerRtosWatchUI", rtosWatchGetQuickReplyEvent.f78954d.f78955a);
            Log.m105924i("MicroMsg.Rtos.RepairerRtosWatchUI", rtosWatchGetQuickReplyEvent.f78954d.f78956b);
            Log.m105924i("MicroMsg.Rtos.RepairerRtosWatchUI", new JSONArray(rtosWatchGetQuickReplyEvent.f78954d.f78956b).toString());
            C117292a.m165361g(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RepairerRtosWatchUI$f */
    public static final class C30368f implements View.OnClickListener {

        /* renamed from: d */
        public static final C30368f f81939d = new C30368f();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C34585h hVar = C34585h.f93003a;
            C86013q1.m106445f(hVar.mo59647c("wechat_rtos_service"));
            MultiProcessMMKV.getDefault().putString("patch_id", "");
            Log.m105924i("MicroMsg.Rtos.RepairerRtosWatchUI", "clean so " + hVar.mo59647c("wechat_rtos_service"));
            C117292a.m165361g(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.ui.RepairerRtosWatchUI$g */
    public static final class C30369g implements View.OnClickListener {

        /* renamed from: d */
        public static final C30369g f81940d = new C30369g();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINOF_WATCH_READ_PRIVACY_BOOLEAN_SYNC, Boolean.FALSE);
            C117292a.m165361g(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cwc;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.Rtos.RepairerRtosWatchUI", "onCreate");
        Button button = (Button) findViewById(C0966R.C0970id.mxn);
        if (button != null) {
            button.setOnClickListener(C30363a.f81934d);
        }
        Button button2 = (Button) findViewById(C0966R.C0970id.mxr);
        if (button2 != null) {
            button2.setOnClickListener(C30364b.f81935d);
        }
        Button button3 = (Button) findViewById(C0966R.C0970id.n4e);
        if (button3 != null) {
            button3.setOnClickListener(C30365c.f81936d);
        }
        Button button4 = (Button) findViewById(C0966R.C0970id.n3r);
        if (button4 != null) {
            button4.setOnClickListener(C30366d.f81937d);
        }
        Button button5 = (Button) findViewById(C0966R.C0970id.n1b);
        if (button5 != null) {
            button5.setOnClickListener(C30367e.f81938d);
        }
        Button button6 = (Button) findViewById(C0966R.C0970id.mxq);
        if (button6 != null) {
            button6.setOnClickListener(C30368f.f81939d);
        }
        Button button7 = (Button) findViewById(C0966R.C0970id.mxp);
        if (button7 != null) {
            button7.setOnClickListener(C30369g.f81940d);
        }
    }
}
