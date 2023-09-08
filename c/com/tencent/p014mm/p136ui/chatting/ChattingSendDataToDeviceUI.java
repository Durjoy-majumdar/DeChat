package com.tencent.p014mm.p136ui.chatting;

import android.content.res.Configuration;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C103834d;
import androidx.transition.Slide;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExDeviceCancelNetworkDeviceTaskEvent;
import com.tencent.p014mm.autogen.events.ExDeviceCheckNetworkDeviceUploadCdnEvent;
import com.tencent.p014mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent;
import com.tencent.p014mm.autogen.events.ExDeviceStopScanNetworkDeviceEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.exdevice.model.C93366l1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di0.C86295k;
import di0.C86299o;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kr0.C76630x0;
import nj3.C88989a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qo3.C77398g;
import qo3.C77426q;
import rx3.C13598b0;
import te3.C64454it2;
import te3.C64478jt2;
import z04.C112550d0;
import z04.C112551y;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "b", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI */
public final class ChattingSendDataToDeviceUI extends MMActivity {

    /* renamed from: A */
    public RecyclerView f284235A;

    /* renamed from: B */
    public C77426q f284236B;

    /* renamed from: C */
    public C77426q f284237C;

    /* renamed from: D */
    public WxRecyclerAdapter<C93366l1> f284238D;

    /* renamed from: E */
    public WxRecyclerAdapter<C93366l1> f284239E;

    /* renamed from: F */
    public WxRecyclerAdapter<C93366l1> f284240F;

    /* renamed from: G */
    public boolean f284241G;

    /* renamed from: H */
    public String f284242H;

    /* renamed from: I */
    public ArrayList<C93366l1> f284243I = new ArrayList<>();

    /* renamed from: J */
    public ArrayList<C93366l1> f284244J = new ArrayList<>();

    /* renamed from: K */
    public ArrayList<C93366l1> f284245K = new ArrayList<>();

    /* renamed from: L */
    public long f284246L;

    /* renamed from: M */
    public C72963f4 f284247M;

    /* renamed from: N */
    public C68070l.C68072b f284248N;

    /* renamed from: P */
    public int f284249P;

    /* renamed from: Q */
    public boolean f284250Q;

    /* renamed from: Q0 */
    public final String f284251Q0;

    /* renamed from: R */
    public long f284252R;

    /* renamed from: R0 */
    public final String f284253R0;

    /* renamed from: S */
    public String f284254S;

    /* renamed from: S0 */
    public final String f284255S0;

    /* renamed from: T */
    public C64454it2 f284256T;

    /* renamed from: T0 */
    public final String f284257T0;

    /* renamed from: U */
    public C20937c f284258U;

    /* renamed from: U0 */
    public final String f284259U0;

    /* renamed from: V */
    public C97003b f284260V;

    /* renamed from: V0 */
    public final int f284261V0;

    /* renamed from: W */
    public boolean f284262W;

    /* renamed from: W0 */
    public final int f284263W0;

    /* renamed from: X */
    public C93366l1 f284264X;

    /* renamed from: X0 */
    public int f284265X0;

    /* renamed from: Y */
    public int f284266Y;

    /* renamed from: Y0 */
    public final String f284267Y0;

    /* renamed from: Z */
    public int f284268Z;

    /* renamed from: Z0 */
    public final IListener<ExDeviceScanNetworkDeviceResultEvent> f284269Z0;

    /* renamed from: a1 */
    public final IListener<ExDeviceSendDataToNetworkDeviceStateEvent> f284270a1;

    /* renamed from: b1 */
    public final View.OnClickListener f284271b1;

    /* renamed from: c1 */
    public final View.OnClickListener f284272c1;

    /* renamed from: d */
    public final String f284273d = "MicroMsg.chatting.ChattingSendDataToDeviceUI";

    /* renamed from: e */
    public ViewGroup f284274e;

    /* renamed from: f */
    public ViewGroup f284275f;

    /* renamed from: g */
    public ViewGroup f284276g;

    /* renamed from: h */
    public View f284277h;

    /* renamed from: i */
    public ImageView f284278i;

    /* renamed from: j */
    public ViewGroup f284279j;

    /* renamed from: n */
    public ViewGroup f284280n;

    /* renamed from: o */
    public ImageView f284281o;

    /* renamed from: p */
    public ImageView f284282p;

    /* renamed from: p0 */
    public boolean f284283p0;

    /* renamed from: q */
    public ImageView f284284q;

    /* renamed from: r */
    public ViewGroup f284285r;

    /* renamed from: s */
    public TextView f284286s;

    /* renamed from: t */
    public TextView f284287t;

    /* renamed from: u */
    public Button f284288u;

    /* renamed from: v */
    public Button f284289v;

    /* renamed from: w */
    public TextView f284290w;

    /* renamed from: x */
    public ProgressBar f284291x;

    /* renamed from: x0 */
    public final String f284292x0;

    /* renamed from: y */
    public RecyclerView f284293y;

    /* renamed from: y0 */
    public final String f284294y0;

    /* renamed from: z */
    public RecyclerView f284295z;

    /* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$e */
    public static final class C6772e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ChattingSendDataToDeviceUI f24305d;

        public C6772e(ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
            this.f24305d = chattingSendDataToDeviceUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C86299o oVar = new C86299o();
            oVar.f250930b = "wxd930c3b7cf7c92e6";
            oVar.f250934f = "pages/device-discovery/device-discovery.html";
            oVar.f250932d = 0;
            oVar.f250931c = 0;
            oVar.f250939k = 1112;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f24305d.getContext(), oVar);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$g */
    public static final class C6773g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ChattingSendDataToDeviceUI f24306d;

        public C6773g(ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
            this.f24306d = chattingSendDataToDeviceUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f24306d.finish();
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$a */
    public final class C97002a extends C60896i<C93366l1> {
        public C97002a() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.cwe;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C93366l1 l1Var = (C93366l1) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(l1Var, "item");
            ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.f2a);
            if (l1Var.f269431n) {
                imageView.setColorFilter(ChattingSendDataToDeviceUI.this.f284265X0, PorterDuff.Mode.SRC_IN);
            } else {
                imageView.setColorFilter((ColorFilter) null);
            }
            if (!l1Var.f269431n || !C87412m.m108589b(l1Var.f269424d, ChattingSendDataToDeviceUI.this.f284267Y0)) {
                C20828a.m22825b().mo32519h(l1Var.f269427g, imageView, ChattingSendDataToDeviceUI.this.f284258U);
            } else {
                imageView.setImageResource(C0966R.C0969drawable.cgw);
            }
            oVar.mo85812D(C0966R.C0970id.f2b).setOnClickListener(new C97185y2(l1Var, ChattingSendDataToDeviceUI.this));
            ((TextView) oVar.mo85812D(C0966R.C0970id.h_d)).setText(l1Var.f269426f);
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$b */
    public final class C97003b {
        public C97003b() {
        }

        /* renamed from: a */
        public final boolean mo135703a(IEvent iEvent) {
            if (iEvent instanceof ExDeviceScanNetworkDeviceResultEvent) {
                Log.m105924i(ChattingSendDataToDeviceUI.this.f284273d, "on scan event");
                C87412m.m108592e(iEvent, "null cannot be cast to non-null type com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent");
                List list = ((ExDeviceScanNetworkDeviceResultEvent) iEvent).f264720d.f264722a;
                C87412m.m108592e(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>?>");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) list;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    C93366l1 l1Var = new C93366l1();
                    Object obj = arrayList2.get(i);
                    C87412m.m108591d(obj);
                    l1Var.f269425e = (String) ((Map) obj).get("deviceType");
                    Object obj2 = arrayList2.get(i);
                    C87412m.m108591d(obj2);
                    l1Var.f269424d = (String) ((Map) obj2).get("deviceID");
                    Object obj3 = arrayList2.get(i);
                    C87412m.m108591d(obj3);
                    l1Var.f269426f = (String) ((Map) obj3).get("displayName");
                    Object obj4 = arrayList2.get(i);
                    C87412m.m108591d(obj4);
                    l1Var.f269427g = (String) ((Map) obj4).get("iconUrl");
                    Object obj5 = arrayList2.get(i);
                    C87412m.m108591d(obj5);
                    l1Var.f269428h = (String) ((Map) obj5).get("ability");
                    Object obj6 = arrayList2.get(i);
                    C87412m.m108591d(obj6);
                    l1Var.f269429i = (String) ((Map) obj6).get("abilityInf");
                    ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = ChattingSendDataToDeviceUI.this;
                    l1Var.f269430j = chattingSendDataToDeviceUI.f284292x0;
                    if (!chattingSendDataToDeviceUI.f284241G || !chattingSendDataToDeviceUI.mo135698J7(l1Var, chattingSendDataToDeviceUI.f284242H)) {
                        ChattingSendDataToDeviceUI chattingSendDataToDeviceUI2 = ChattingSendDataToDeviceUI.this;
                        if (!chattingSendDataToDeviceUI2.f284241G) {
                            if (!chattingSendDataToDeviceUI2.mo135697I7(l1Var)) {
                            }
                        }
                    }
                    arrayList.add(l1Var);
                }
                if (ChattingSendDataToDeviceUI.this.f284245K.size() != arrayList.size()) {
                    ChattingSendDataToDeviceUI chattingSendDataToDeviceUI3 = ChattingSendDataToDeviceUI.this;
                    chattingSendDataToDeviceUI3.runOnUiThread(new C97188z2(chattingSendDataToDeviceUI3, arrayList));
                    ChattingSendDataToDeviceUI.this.mo135701M7();
                }
                return true;
            }
            if (iEvent instanceof ExDeviceSendDataToNetworkDeviceStateEvent) {
                ChattingSendDataToDeviceUI chattingSendDataToDeviceUI4 = ChattingSendDataToDeviceUI.this;
                chattingSendDataToDeviceUI4.runOnUiThread(new C97013a3(iEvent, chattingSendDataToDeviceUI4));
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$c */
    public static final class C97004c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ChattingSendDataToDeviceUI f284298d;

        public C97004c(ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
            this.f284298d = chattingSendDataToDeviceUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$backClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.iko) {
                ViewGroup viewGroup = this.f284298d.f284280n;
                String str = null;
                if (viewGroup == null) {
                    C87412m.m108603p("sendingDeviceLayout");
                    throw null;
                } else if (viewGroup.getVisibility() == 0) {
                    ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f284298d;
                    C93366l1 l1Var = chattingSendDataToDeviceUI.f284264X;
                    if (l1Var != null) {
                        str = l1Var.f269430j;
                    }
                    if (!C87412m.m108589b(str, chattingSendDataToDeviceUI.f284255S0)) {
                        this.f284298d.finish();
                        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$backClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                }
            }
            this.f284298d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$backClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$d */
    public static final class C97005d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ChattingSendDataToDeviceUI f284299d;

        /* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$d$a */
        public static final class C97006a implements C86295k {

            /* renamed from: d */
            public final /* synthetic */ JSONObject f284300d;

            public C97006a(JSONObject jSONObject) {
                this.f284300d = jSONObject;
            }

            /* renamed from: a */
            public final String mo3693a() {
                return new JSONObject().put("iot", this.f284300d).toString();
            }
        }

        public C97005d(ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
            this.f284299d = chattingSendDataToDeviceUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$confirmListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f284299d;
            C93366l1 l1Var = chattingSendDataToDeviceUI.f284264X;
            if (l1Var == null) {
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$confirmListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (C87412m.m108589b(l1Var.f269430j, chattingSendDataToDeviceUI.f284294y0)) {
                ChattingSendDataToDeviceUI chattingSendDataToDeviceUI2 = this.f284299d;
                chattingSendDataToDeviceUI2.getClass();
                try {
                    ChattingSendDataToDeviceUI.m124692O7(chattingSendDataToDeviceUI2, chattingSendDataToDeviceUI2.f284255S0, (C64454it2) null, (C64478jt2) null, (String) null, 8, (Object) null);
                    chattingSendDataToDeviceUI2.mo135700L7(3);
                    ExDeviceSendDataToNetworkDeviceEvent exDeviceSendDataToNetworkDeviceEvent = new ExDeviceSendDataToNetworkDeviceEvent();
                    ExDeviceSendDataToNetworkDeviceEvent.C92485a aVar = exDeviceSendDataToNetworkDeviceEvent.f264724d;
                    aVar.f264726a = l1Var.f269424d;
                    aVar.f264727b = l1Var.f269425e;
                    aVar.f264729d = chattingSendDataToDeviceUI2.f284254S;
                    aVar.f264728c = l1Var.f269428h;
                    aVar.f264733h = l1Var.f269431n;
                    aVar.f264734i = l1Var.f269432o;
                    aVar.f264735j = l1Var.f269433p;
                    boolean z = chattingSendDataToDeviceUI2.f284241G;
                    if (z) {
                        aVar.f264731f = chattingSendDataToDeviceUI2.f284242H;
                        aVar.f264732g = z;
                    } else {
                        aVar.f264730e = chattingSendDataToDeviceUI2.f284246L;
                    }
                    exDeviceSendDataToNetworkDeviceEvent.publish();
                    if (!exDeviceSendDataToNetworkDeviceEvent.f264725e.f264736a) {
                        String str = chattingSendDataToDeviceUI2.f284253R0;
                        ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = new ExDeviceSendDataToNetworkDeviceStateEvent();
                        exDeviceSendDataToNetworkDeviceStateEvent.f264737d.f264739a = str;
                        exDeviceSendDataToNetworkDeviceStateEvent.publish();
                        Log.m105920e(chattingSendDataToDeviceUI2.f284273d, " e.result.isSuccess is false, send fail!");
                    }
                } catch (Exception e) {
                    String str2 = chattingSendDataToDeviceUI2.f284253R0;
                    ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent2 = new ExDeviceSendDataToNetworkDeviceStateEvent();
                    exDeviceSendDataToNetworkDeviceStateEvent2.f264737d.f264739a = str2;
                    exDeviceSendDataToNetworkDeviceStateEvent2.publish();
                    Log.m105921e(chattingSendDataToDeviceUI2.f284273d, "send to device item click exception %s", e);
                }
            } else if (C87412m.m108589b(l1Var.f269430j, this.f284299d.f284253R0) || C87412m.m108589b(l1Var.f269430j, this.f284299d.f284257T0) || C87412m.m108589b(l1Var.f269430j, this.f284299d.f284251Q0) || C87412m.m108589b(l1Var.f269430j, this.f284299d.f284259U0)) {
                if (this.f284299d.f284256T != null) {
                    C86299o oVar = new C86299o();
                    C64454it2 it22 = this.f284299d.f284256T;
                    oVar.f250930b = it22 != null ? it22.f183737e : null;
                    C87412m.m108591d(it22);
                    oVar.f250934f = it22.f183738f;
                    C64454it2 it23 = this.f284299d.f284256T;
                    C87412m.m108591d(it23);
                    oVar.f250932d = it23.f183739g;
                    oVar.f250931c = 2;
                    try {
                        C64454it2 it24 = this.f284299d.f284256T;
                        C87412m.m108591d(it24);
                        oVar.f250937i = new C97006a(new JSONObject(it24.f183736d));
                    } catch (JSONException unused) {
                    }
                    String str3 = this.f284299d.f284273d;
                    StringBuilder sb = new StringBuilder();
                    sb.append("appid: ");
                    sb.append(oVar.f250930b);
                    sb.append(", path: ");
                    sb.append(oVar.f250934f);
                    sb.append(", arg: ");
                    C86295k kVar = oVar.f250937i;
                    C87412m.m108591d(kVar);
                    sb.append(kVar.mo3693a());
                    Log.m105918d(str3, sb.toString());
                    oVar.f250939k = 1226;
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f284299d.getContext(), oVar);
                }
                this.f284299d.finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$confirmListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$f */
    public static final class C97007f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ChattingSendDataToDeviceUI f284301d;

        public C97007f(ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
            this.f284301d = chattingSendDataToDeviceUI;
        }

        public final void run() {
            this.f284301d.mo135702N7();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$h */
    public static final class C97008h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ChattingSendDataToDeviceUI f284302d;

        public C97008h(ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
            this.f284302d = chattingSendDataToDeviceUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f284302d;
            ViewGroup viewGroup = chattingSendDataToDeviceUI.f284274e;
            if (viewGroup != null) {
                ChattingSendDataToDeviceUI.m124693P7(chattingSendDataToDeviceUI, viewGroup, 0, 0, 2, (Object) null);
                ChattingSendDataToDeviceUI chattingSendDataToDeviceUI2 = this.f284302d;
                ViewGroup viewGroup2 = chattingSendDataToDeviceUI2.f284279j;
                if (viewGroup2 != null) {
                    ChattingSendDataToDeviceUI.m124693P7(chattingSendDataToDeviceUI2, viewGroup2, 8, 0, 2, (Object) null);
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C87412m.m108603p("otherDeviceLayout");
                throw null;
            }
            C87412m.m108603p("deviceMainLayout");
            throw null;
        }
    }

    public ChattingSendDataToDeviceUI() {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59359o = C0966R.C0969drawable.cgw;
        this.f284258U = bVar.mo32666a();
        this.f284266Y = 2;
        this.f284268Z = -1;
        this.f284292x0 = "send_data_idle";
        this.f284294y0 = "send_data_click";
        this.f284251Q0 = "send_data_sucess";
        this.f284253R0 = "send_data_failed";
        this.f284255S0 = "send_data_sending";
        this.f284257T0 = "send_data_outdate";
        this.f284259U0 = "send_data_too_large";
        this.f284261V0 = 1;
        this.f284263W0 = 2;
        this.f284265X0 = -1;
        this.f284267Y0 = "ohter_entrance";
        C40008f fVar = C40008f.f107254d;
        this.f284269Z0 = new C97009x4ce9c235(this, fVar);
        this.f284270a1 = new C97010x431581cb(this, fVar);
        this.f284271b1 = new C97004c(this);
        this.f284272c1 = new C97005d(this);
    }

    /* renamed from: O7 */
    public static void m124692O7(ChattingSendDataToDeviceUI chattingSendDataToDeviceUI, String str, C64454it2 it22, C64478jt2 jt22, String str2, int i, Object obj) {
        C77398g gVar;
        ChattingSendDataToDeviceUI chattingSendDataToDeviceUI2 = chattingSendDataToDeviceUI;
        String str3 = str;
        C64478jt2 jt23 = jt22;
        String str4 = (i & 8) != 0 ? "" : str2;
        chattingSendDataToDeviceUI.getClass();
        C87412m.m108594g(str3, "newSendState");
        C87412m.m108594g(str4, "msgHint");
        C93366l1 l1Var = chattingSendDataToDeviceUI2.f284264X;
        if (l1Var != null) {
            if (C87412m.m108589b(l1Var.f269430j, str3)) {
                String str5 = chattingSendDataToDeviceUI2.f284273d;
                Log.m105928w(str5, "duplicate state " + str3);
                return;
            }
            String str6 = chattingSendDataToDeviceUI2.f284273d;
            Log.m105928w(str6, "new state " + str3);
            l1Var.f269430j = str3;
            chattingSendDataToDeviceUI2.f284256T = it22;
            if (C87412m.m108589b(str3, chattingSendDataToDeviceUI2.f284294y0)) {
                ViewGroup viewGroup = chattingSendDataToDeviceUI2.f284279j;
                if (viewGroup != null) {
                    m124693P7(chattingSendDataToDeviceUI, viewGroup, 8, 0, 2, (Object) null);
                    ViewGroup viewGroup2 = chattingSendDataToDeviceUI2.f284274e;
                    if (viewGroup2 != null) {
                        m124693P7(chattingSendDataToDeviceUI, viewGroup2, 8, 0, 2, (Object) null);
                        ViewGroup viewGroup3 = chattingSendDataToDeviceUI2.f284280n;
                        if (viewGroup3 != null) {
                            m124693P7(chattingSendDataToDeviceUI, viewGroup3, 0, 0, 2, (Object) null);
                            ImageView imageView = chattingSendDataToDeviceUI2.f284281o;
                            if (imageView != null) {
                                imageView.setVisibility(0);
                                ViewGroup viewGroup4 = chattingSendDataToDeviceUI2.f284285r;
                                if (viewGroup4 != null) {
                                    viewGroup4.setVisibility(0);
                                    if (l1Var.f269431n) {
                                        ImageView imageView2 = chattingSendDataToDeviceUI2.f284284q;
                                        if (imageView2 != null) {
                                            imageView2.setColorFilter(chattingSendDataToDeviceUI2.f284265X0, PorterDuff.Mode.SRC_IN);
                                        } else {
                                            C87412m.m108603p("sendingCurIv");
                                            throw null;
                                        }
                                    } else {
                                        ImageView imageView3 = chattingSendDataToDeviceUI2.f284284q;
                                        if (imageView3 != null) {
                                            imageView3.setColorFilter((ColorFilter) null);
                                        } else {
                                            C87412m.m108603p("sendingCurIv");
                                            throw null;
                                        }
                                    }
                                    C20828a b = C20828a.m22825b();
                                    String str7 = l1Var.f269427g;
                                    ImageView imageView4 = chattingSendDataToDeviceUI2.f284284q;
                                    if (imageView4 != null) {
                                        b.mo32519h(str7, imageView4, chattingSendDataToDeviceUI2.f284258U);
                                        Button button = chattingSendDataToDeviceUI2.f284288u;
                                        if (button != null) {
                                            button.setVisibility(0);
                                            Button button2 = chattingSendDataToDeviceUI2.f284288u;
                                            if (button2 != null) {
                                                button2.setText(C0966R.string.f361261il0);
                                                TextView textView = chattingSendDataToDeviceUI2.f284286s;
                                                if (textView != null) {
                                                    textView.setVisibility(0);
                                                    TextView textView2 = chattingSendDataToDeviceUI2.f284286s;
                                                    if (textView2 != null) {
                                                        String string = chattingSendDataToDeviceUI.getContext().getString(C0966R.string.mcj);
                                                        C87412m.m108593f(string, "context.getString(R.string.exdevice_send)");
                                                        Object[] objArr = new Object[2];
                                                        objArr[0] = chattingSendDataToDeviceUI.mo135696H7();
                                                        String str8 = l1Var.f269426f;
                                                        objArr[1] = str8 == null || str8.length() == 0 ? chattingSendDataToDeviceUI.getContext().getString(C0966R.string.cdk) : l1Var.f269426f;
                                                        String format = String.format(string, Arrays.copyOf(objArr, 2));
                                                        C87412m.m108593f(format, "format(format, *args)");
                                                        textView2.setText(format);
                                                        ImageView imageView5 = chattingSendDataToDeviceUI2.f284282p;
                                                        if (imageView5 != null) {
                                                            imageView5.setVisibility(8);
                                                            Button button3 = chattingSendDataToDeviceUI2.f284289v;
                                                            if (button3 != null) {
                                                                button3.setVisibility(8);
                                                                TextView textView3 = chattingSendDataToDeviceUI2.f284290w;
                                                                if (textView3 != null) {
                                                                    textView3.setVisibility(8);
                                                                    TextView textView4 = chattingSendDataToDeviceUI2.f284287t;
                                                                    if (textView4 != null) {
                                                                        textView4.setVisibility(8);
                                                                        ProgressBar progressBar = chattingSendDataToDeviceUI2.f284291x;
                                                                        if (progressBar != null) {
                                                                            progressBar.setVisibility(8);
                                                                        } else {
                                                                            C87412m.m108603p("sendingProgress");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C87412m.m108603p("sendingHintTv");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    C87412m.m108603p("sendingSettingTv");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                C87412m.m108603p("sendingFinishBtn");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C87412m.m108603p("sendingStatusIv");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("sendingStatusTv");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("sendingStatusTv");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("sendingConfirmBtn");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("sendingConfirmBtn");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("sendingCurIv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("sendingCurLayout");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("sendingBackIv");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("sendingDeviceLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("deviceMainLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("otherDeviceLayout");
                    throw null;
                }
            } else {
                if (C87412m.m108589b(str3, chattingSendDataToDeviceUI2.f284253R0) ? true : C87412m.m108589b(str3, chattingSendDataToDeviceUI2.f284257T0) ? true : C87412m.m108589b(str3, chattingSendDataToDeviceUI2.f284259U0)) {
                    ViewGroup viewGroup5 = chattingSendDataToDeviceUI2.f284279j;
                    if (viewGroup5 != null) {
                        String str9 = "wordingInfo.subtitle_wording";
                        m124693P7(chattingSendDataToDeviceUI, viewGroup5, 8, 0, 2, (Object) null);
                        ViewGroup viewGroup6 = chattingSendDataToDeviceUI2.f284274e;
                        if (viewGroup6 != null) {
                            m124693P7(chattingSendDataToDeviceUI, viewGroup6, 8, 0, 2, (Object) null);
                            ViewGroup viewGroup7 = chattingSendDataToDeviceUI2.f284280n;
                            if (viewGroup7 != null) {
                                m124693P7(chattingSendDataToDeviceUI, viewGroup7, 0, 0, 2, (Object) null);
                                ImageView imageView6 = chattingSendDataToDeviceUI2.f284282p;
                                if (imageView6 != null) {
                                    imageView6.setImageResource(C0966R.raw.exdevice_send_failed);
                                    ImageView imageView7 = chattingSendDataToDeviceUI2.f284282p;
                                    if (imageView7 != null) {
                                        imageView7.setVisibility(0);
                                        Button button4 = chattingSendDataToDeviceUI2.f284289v;
                                        if (button4 != null) {
                                            button4.setVisibility(0);
                                            if (jt23 != null) {
                                                Log.m105924i(chattingSendDataToDeviceUI2.f284273d, jt23.f183839d);
                                                TextView textView5 = chattingSendDataToDeviceUI2.f284286s;
                                                if (textView5 != null) {
                                                    textView5.setText(jt23.f183839d);
                                                    String str10 = jt23.f183840e;
                                                    C87412m.m108593f(str10, str9);
                                                    if (!C112551y.m153811k(str10)) {
                                                        TextView textView6 = chattingSendDataToDeviceUI2.f284287t;
                                                        if (textView6 != null) {
                                                            textView6.setText(jt23.f183840e);
                                                            TextView textView7 = chattingSendDataToDeviceUI2.f284287t;
                                                            if (textView7 != null) {
                                                                textView7.setVisibility(0);
                                                            } else {
                                                                C87412m.m108603p("sendingHintTv");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C87412m.m108603p("sendingHintTv");
                                                            throw null;
                                                        }
                                                    }
                                                } else {
                                                    C87412m.m108603p("sendingStatusTv");
                                                    throw null;
                                                }
                                            } else if (C87412m.m108589b(l1Var.f269430j, chattingSendDataToDeviceUI2.f284259U0)) {
                                                TextView textView8 = chattingSendDataToDeviceUI2.f284286s;
                                                if (textView8 != null) {
                                                    textView8.setText(C0966R.string.mqc);
                                                } else {
                                                    C87412m.m108603p("sendingStatusTv");
                                                    throw null;
                                                }
                                            } else {
                                                TextView textView9 = chattingSendDataToDeviceUI2.f284286s;
                                                if (textView9 != null) {
                                                    textView9.setText(C0966R.string.mcq);
                                                } else {
                                                    C87412m.m108603p("sendingStatusTv");
                                                    throw null;
                                                }
                                            }
                                            ViewGroup viewGroup8 = chattingSendDataToDeviceUI2.f284285r;
                                            if (viewGroup8 != null) {
                                                viewGroup8.setVisibility(8);
                                                Button button5 = chattingSendDataToDeviceUI2.f284288u;
                                                if (button5 != null) {
                                                    button5.setVisibility(8);
                                                    ImageView imageView8 = chattingSendDataToDeviceUI2.f284281o;
                                                    if (imageView8 != null) {
                                                        imageView8.setVisibility(8);
                                                        ProgressBar progressBar2 = chattingSendDataToDeviceUI2.f284291x;
                                                        if (progressBar2 != null) {
                                                            progressBar2.setVisibility(8);
                                                        } else {
                                                            C87412m.m108603p("sendingProgress");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("sendingBackIv");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("sendingConfirmBtn");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("sendingCurLayout");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("sendingFinishBtn");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("sendingStatusIv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("sendingStatusIv");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("sendingDeviceLayout");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("deviceMainLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("otherDeviceLayout");
                        throw null;
                    }
                } else if (C87412m.m108589b(str3, chattingSendDataToDeviceUI2.f284255S0)) {
                    ViewGroup viewGroup9 = chattingSendDataToDeviceUI2.f284279j;
                    if (viewGroup9 != null) {
                        m124693P7(chattingSendDataToDeviceUI, viewGroup9, 8, 0, 2, (Object) null);
                        ViewGroup viewGroup10 = chattingSendDataToDeviceUI2.f284274e;
                        if (viewGroup10 != null) {
                            m124693P7(chattingSendDataToDeviceUI, viewGroup10, 8, 0, 2, (Object) null);
                            ViewGroup viewGroup11 = chattingSendDataToDeviceUI2.f284280n;
                            if (viewGroup11 != null) {
                                m124693P7(chattingSendDataToDeviceUI, viewGroup11, 0, 0, 2, (Object) null);
                                TextView textView10 = chattingSendDataToDeviceUI2.f284286s;
                                if (textView10 != null) {
                                    textView10.setText(C0966R.string.ilt);
                                    TextView textView11 = chattingSendDataToDeviceUI2.f284286s;
                                    if (textView11 != null) {
                                        textView11.setVisibility(0);
                                        ProgressBar progressBar3 = chattingSendDataToDeviceUI2.f284291x;
                                        if (progressBar3 != null) {
                                            progressBar3.setVisibility(0);
                                            ImageView imageView9 = chattingSendDataToDeviceUI2.f284281o;
                                            if (imageView9 != null) {
                                                imageView9.setVisibility(0);
                                                ViewGroup viewGroup12 = chattingSendDataToDeviceUI2.f284285r;
                                                if (viewGroup12 != null) {
                                                    viewGroup12.setVisibility(8);
                                                    TextView textView12 = chattingSendDataToDeviceUI2.f284290w;
                                                    if (textView12 != null) {
                                                        textView12.setVisibility(8);
                                                        Button button6 = chattingSendDataToDeviceUI2.f284288u;
                                                        if (button6 != null) {
                                                            button6.setVisibility(8);
                                                            Button button7 = chattingSendDataToDeviceUI2.f284289v;
                                                            if (button7 != null) {
                                                                button7.setVisibility(8);
                                                                TextView textView13 = chattingSendDataToDeviceUI2.f284287t;
                                                                if (textView13 != null) {
                                                                    textView13.setVisibility(8);
                                                                    ImageView imageView10 = chattingSendDataToDeviceUI2.f284282p;
                                                                    if (imageView10 != null) {
                                                                        imageView10.setVisibility(8);
                                                                    } else {
                                                                        C87412m.m108603p("sendingStatusIv");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    C87412m.m108603p("sendingHintTv");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                C87412m.m108603p("sendingFinishBtn");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C87412m.m108603p("sendingConfirmBtn");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("sendingSettingTv");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("sendingCurLayout");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("sendingBackIv");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("sendingProgress");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("sendingStatusTv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("sendingStatusTv");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("sendingDeviceLayout");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("deviceMainLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("otherDeviceLayout");
                        throw null;
                    }
                } else if (C87412m.m108589b(str3, chattingSendDataToDeviceUI2.f284251Q0)) {
                    ViewGroup viewGroup13 = chattingSendDataToDeviceUI2.f284279j;
                    if (viewGroup13 != null) {
                        String str11 = "wordingInfo.subtitle_wording";
                        m124693P7(chattingSendDataToDeviceUI, viewGroup13, 8, 0, 2, (Object) null);
                        ViewGroup viewGroup14 = chattingSendDataToDeviceUI2.f284274e;
                        if (viewGroup14 != null) {
                            m124693P7(chattingSendDataToDeviceUI, viewGroup14, 8, 0, 2, (Object) null);
                            ViewGroup viewGroup15 = chattingSendDataToDeviceUI2.f284280n;
                            if (viewGroup15 != null) {
                                m124693P7(chattingSendDataToDeviceUI, viewGroup15, 0, 0, 2, (Object) null);
                                ImageView imageView11 = chattingSendDataToDeviceUI2.f284282p;
                                if (imageView11 != null) {
                                    imageView11.setVisibility(0);
                                    Button button8 = chattingSendDataToDeviceUI2.f284288u;
                                    if (button8 != null) {
                                        button8.setVisibility(0);
                                        TextView textView14 = chattingSendDataToDeviceUI2.f284286s;
                                        if (textView14 != null) {
                                            textView14.setVisibility(0);
                                            Button button9 = chattingSendDataToDeviceUI2.f284289v;
                                            if (button9 != null) {
                                                button9.setVisibility(0);
                                                if (chattingSendDataToDeviceUI2.f284256T != null || jt23 == null) {
                                                    TextView textView15 = chattingSendDataToDeviceUI2.f284286s;
                                                    if (textView15 != null) {
                                                        textView15.setText(C0966R.string.bbt);
                                                    } else {
                                                        C87412m.m108603p("sendingStatusTv");
                                                        throw null;
                                                    }
                                                } else {
                                                    TextView textView16 = chattingSendDataToDeviceUI2.f284286s;
                                                    if (textView16 != null) {
                                                        textView16.setText(jt23.f183839d);
                                                        String str12 = jt23.f183840e;
                                                        C87412m.m108593f(str12, str11);
                                                        if (!C112551y.m153811k(str12)) {
                                                            TextView textView17 = chattingSendDataToDeviceUI2.f284287t;
                                                            if (textView17 != null) {
                                                                textView17.setText(jt23.f183840e);
                                                                TextView textView18 = chattingSendDataToDeviceUI2.f284287t;
                                                                if (textView18 != null) {
                                                                    textView18.setVisibility(0);
                                                                } else {
                                                                    C87412m.m108603p("sendingHintTv");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                C87412m.m108603p("sendingHintTv");
                                                                throw null;
                                                            }
                                                        }
                                                    } else {
                                                        C87412m.m108603p("sendingStatusTv");
                                                        throw null;
                                                    }
                                                }
                                                if (chattingSendDataToDeviceUI2.f284256T != null) {
                                                    Button button10 = chattingSendDataToDeviceUI2.f284289v;
                                                    if (button10 != null) {
                                                        button10.setText(C0966R.string.mt6);
                                                        TextView textView19 = chattingSendDataToDeviceUI2.f284287t;
                                                        if (textView19 != null) {
                                                            textView19.setVisibility(0);
                                                            TextView textView20 = chattingSendDataToDeviceUI2.f284287t;
                                                            if (textView20 != null) {
                                                                String string2 = chattingSendDataToDeviceUI.getContext().getString(C0966R.string.muw);
                                                                C87412m.m108593f(string2, "context.getString(R.string.exdevice_send_finish2)");
                                                                Object[] objArr2 = new Object[1];
                                                                String str13 = l1Var.f269426f;
                                                                objArr2[0] = str13 == null || str13.length() == 0 ? chattingSendDataToDeviceUI.getContext().getString(C0966R.string.cdk) : l1Var.f269426f;
                                                                String format2 = String.format(string2, Arrays.copyOf(objArr2, 1));
                                                                C87412m.m108593f(format2, "format(format, *args)");
                                                                textView20.setText(format2);
                                                            } else {
                                                                C87412m.m108603p("sendingHintTv");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C87412m.m108603p("sendingHintTv");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("sendingFinishBtn");
                                                        throw null;
                                                    }
                                                } else {
                                                    Button button11 = chattingSendDataToDeviceUI2.f284289v;
                                                    if (button11 != null) {
                                                        button11.setText(C0966R.string.f8028zq);
                                                    } else {
                                                        C87412m.m108603p("sendingFinishBtn");
                                                        throw null;
                                                    }
                                                }
                                                Button button12 = chattingSendDataToDeviceUI2.f284288u;
                                                if (button12 != null) {
                                                    button12.setVisibility(8);
                                                    TextView textView21 = chattingSendDataToDeviceUI2.f284290w;
                                                    if (textView21 != null) {
                                                        textView21.setVisibility(8);
                                                        ViewGroup viewGroup16 = chattingSendDataToDeviceUI2.f284285r;
                                                        if (viewGroup16 != null) {
                                                            viewGroup16.setVisibility(8);
                                                            ProgressBar progressBar4 = chattingSendDataToDeviceUI2.f284291x;
                                                            if (progressBar4 != null) {
                                                                progressBar4.setVisibility(8);
                                                                ImageView imageView12 = chattingSendDataToDeviceUI2.f284281o;
                                                                if (imageView12 != null) {
                                                                    imageView12.setVisibility(8);
                                                                    ImageView imageView13 = chattingSendDataToDeviceUI2.f284282p;
                                                                    if (imageView13 != null) {
                                                                        imageView13.setImageResource(C0966R.raw.exdevice_send_success);
                                                                        C77426q qVar = chattingSendDataToDeviceUI2.f284236B;
                                                                        if (qVar != null && (gVar = qVar.f225839c) != null) {
                                                                            String string3 = gVar.getContext().getString(C0966R.string.mcs);
                                                                            C87412m.m108593f(string3, "context.getString(R.string.exdevice_send_finish)");
                                                                            String format3 = String.format(string3, Arrays.copyOf(new Object[]{chattingSendDataToDeviceUI.mo135696H7()}, 1));
                                                                            C87412m.m108593f(format3, "format(format, *args)");
                                                                            gVar.mo107533r(format3);
                                                                            gVar.mo107529i(-2, false);
                                                                            gVar.mo107542x(chattingSendDataToDeviceUI2.getString(C0966R.string.a18), true, new C6775c3(chattingSendDataToDeviceUI2));
                                                                            C13598b0 b0Var = C13598b0.f38549a;
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    C87412m.m108603p("sendingStatusIv");
                                                                    throw null;
                                                                }
                                                                C87412m.m108603p("sendingBackIv");
                                                                throw null;
                                                            }
                                                            C87412m.m108603p("sendingProgress");
                                                            throw null;
                                                        }
                                                        C87412m.m108603p("sendingCurLayout");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("sendingSettingTv");
                                                    throw null;
                                                }
                                                C87412m.m108603p("sendingConfirmBtn");
                                                throw null;
                                            }
                                            C87412m.m108603p("sendingFinishBtn");
                                            throw null;
                                        }
                                        C87412m.m108603p("sendingStatusTv");
                                        throw null;
                                    }
                                    C87412m.m108603p("sendingConfirmBtn");
                                    throw null;
                                }
                                C87412m.m108603p("sendingStatusIv");
                                throw null;
                            }
                            C87412m.m108603p("sendingDeviceLayout");
                            throw null;
                        }
                        C87412m.m108603p("deviceMainLayout");
                        throw null;
                    }
                    C87412m.m108603p("otherDeviceLayout");
                    throw null;
                }
            }
        }
    }

    /* renamed from: P7 */
    public static void m124693P7(ChattingSendDataToDeviceUI chattingSendDataToDeviceUI, View view, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 300;
        }
        chattingSendDataToDeviceUI.getClass();
        C87412m.m108594g(view, "<this>");
        if (i != view.getVisibility()) {
            if (i == 8) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI", "slideVisibility", "(Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI", "slideVisibility", "(Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            Slide slide = new Slide(80);
            slide.f306715f = j;
            slide.mo145326c(view);
            ViewParent parent = view.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C103834d.m138407a((ViewGroup) parent, slide);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            View view3 = view;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI", "slideVisibility", "(Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI", "slideVisibility", "(Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: H7 */
    public final String mo135696H7() {
        switch (this.f284268Z) {
            case 1:
                String string = getContext().getString(C0966R.string.f7982ya);
                C87412m.m108593f(string, "context.getString(com.te…R.string.app_field_music)");
                return string;
            case 2:
                String string2 = getContext().getString(C0966R.string.gav);
                C87412m.m108593f(string2, "context.getString(com.te…compat.R.string.location)");
                return string2;
            case 3:
                String string3 = getContext().getString(C0966R.string.lm8);
                C87412m.m108593f(string3, "context.getString(com.te…ibmmui.R.string.wv_image)");
                return string3;
            case 4:
                String string4 = getContext().getString(C0966R.string.f7974y1);
                C87412m.m108593f(string4, "context.getString(com.te….R.string.app_field_file)");
                return string4;
            case 5:
                String string5 = getContext().getString(C0966R.string.mct);
                C87412m.m108593f(string5, "context.getString(R.string.exdevice_url)");
                return string5;
            case 6:
                String string6 = getContext().getString(C0966R.string.f7997yr);
                C87412m.m108593f(string6, "context.getString(com.te…R.string.app_field_video)");
                return string6;
            default:
                String string7 = getContext().getString(C0966R.string.f7974y1);
                C87412m.m108593f(string7, "context.getString(com.te….R.string.app_field_file)");
                return string7;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d6 A[RETURN, SYNTHETIC] */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo135697I7(com.tencent.p014mm.plugin.exdevice.model.C93366l1 r11) {
        /*
            r10 = this;
            long r0 = r10.f284246L
            r2 = 0
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.tencent.mm.storage.f4 r0 = r10.f284247M
            if (r0 != 0) goto L_0x000f
            return r2
        L_0x000f:
            java.lang.String r1 = r11.f269428h
            long r3 = r0.getMsgId()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0119
            boolean r3 = r11.f269431n
            if (r3 != 0) goto L_0x0021
            if (r1 == 0) goto L_0x0119
        L_0x0021:
            if (r3 == 0) goto L_0x002f
            java.util.LinkedList<java.lang.Integer> r3 = r11.f269433p
            if (r3 == 0) goto L_0x0119
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002f
            goto L_0x0119
        L_0x002f:
            int r3 = r0.getType()
            java.lang.String r4 = r0.getContent()
            boolean r0 = r0.mo101020w3()
            r5 = 6
            r6 = 2
            java.lang.String r7 = "wxmsg_image"
            r8 = 3
            r9 = 1
            if (r0 == 0) goto L_0x00c0
            r0 = 0
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r0)
            if (r0 != 0) goto L_0x0053
            java.lang.String r11 = r10.f284273d
            java.lang.String r0 = "get content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            return r2
        L_0x0053:
            int r3 = r0.f195582i
            if (r3 == r8) goto L_0x00a8
            r4 = 76
            if (r3 != r4) goto L_0x005c
            goto L_0x00a8
        L_0x005c:
            r4 = 4
            if (r3 != r4) goto L_0x0063
            boolean r11 = r11.f269431n
            goto L_0x0119
        L_0x0063:
            if (r3 != r5) goto L_0x007d
            boolean r0 = r11.f269431n
            if (r0 != 0) goto L_0x0076
            gy3.C87412m.m108591d(r1)
            java.lang.String r11 = "wxmsg_file"
            boolean r11 = z04.C112550d0.m153801u(r1, r11, r2)
            if (r11 == 0) goto L_0x0119
            goto L_0x00d6
        L_0x0076:
            boolean r11 = r11.mo128152a(r4)
            if (r11 == 0) goto L_0x0119
            goto L_0x00d6
        L_0x007d:
            r4 = 5
            if (r3 != r4) goto L_0x0098
            boolean r1 = r11.f269431n
            if (r1 != 0) goto L_0x0091
            java.lang.String r0 = r0.f195586j
            java.lang.String r1 = "content.url"
            gy3.C87412m.m108593f(r0, r1)
            boolean r2 = r10.mo135699K7(r0, r11)
            goto L_0x0119
        L_0x0091:
            boolean r11 = r11.mo128152a(r4)
            if (r11 == 0) goto L_0x0119
            goto L_0x00d6
        L_0x0098:
            if (r3 != r6) goto L_0x0119
            boolean r11 = r11.f269431n
            if (r11 != 0) goto L_0x0119
            gy3.C87412m.m108591d(r1)
            boolean r11 = z04.C112550d0.m153801u(r1, r7, r2)
            if (r11 == 0) goto L_0x0119
            goto L_0x00d6
        L_0x00a8:
            boolean r0 = r11.f269431n
            if (r0 != 0) goto L_0x00b9
            gy3.C87412m.m108591d(r1)
            java.lang.String r11 = "wxmsg_music"
            boolean r11 = z04.C112550d0.m153801u(r1, r11, r2)
            if (r11 == 0) goto L_0x0119
            goto L_0x00d6
        L_0x00b9:
            boolean r11 = r11.mo128152a(r9)
            if (r11 == 0) goto L_0x0119
            goto L_0x00d6
        L_0x00c0:
            if (r3 != r8) goto L_0x00d8
            boolean r0 = r11.f269431n
            if (r0 != 0) goto L_0x00d0
            gy3.C87412m.m108591d(r1)
            boolean r11 = z04.C112550d0.m153801u(r1, r7, r2)
            if (r11 == 0) goto L_0x0119
            goto L_0x00d6
        L_0x00d0:
            boolean r11 = r11.mo128152a(r8)
            if (r11 == 0) goto L_0x0119
        L_0x00d6:
            r2 = 1
            goto L_0x0119
        L_0x00d8:
            r0 = 48
            if (r3 != r0) goto L_0x00f4
            boolean r0 = r11.f269431n
            if (r0 != 0) goto L_0x00ed
            gy3.C87412m.m108591d(r1)
            java.lang.String r11 = "wxmsg_poi"
            boolean r11 = z04.C112550d0.m153801u(r1, r11, r2)
            if (r11 == 0) goto L_0x0119
            goto L_0x00d6
        L_0x00ed:
            boolean r11 = r11.mo128152a(r6)
            if (r11 == 0) goto L_0x0119
            goto L_0x00d6
        L_0x00f4:
            r0 = 43
            if (r3 != r0) goto L_0x0104
            boolean r0 = r11.f269431n
            if (r0 != 0) goto L_0x00fd
            goto L_0x0119
        L_0x00fd:
            boolean r11 = r11.mo128152a(r5)
            if (r11 == 0) goto L_0x0119
            goto L_0x00d6
        L_0x0104:
            r0 = 62
            if (r3 != r0) goto L_0x0119
            boolean r11 = r11.f269431n
            if (r11 != 0) goto L_0x0119
            gy3.C87412m.m108591d(r1)
            java.lang.String r11 = "wxmsg_video"
            boolean r11 = z04.C112550d0.m153801u(r1, r11, r2)
            if (r11 == 0) goto L_0x0119
            goto L_0x00d6
        L_0x0119:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.ChattingSendDataToDeviceUI.mo135697I7(com.tencent.mm.plugin.exdevice.model.l1):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo135698J7(com.tencent.p014mm.plugin.exdevice.model.C93366l1 r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent r1 = new com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent
            r1.<init>()
            com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent$a r2 = r1.f264897d
            r2.f264899a = r8
            r1.publish()
            com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent$b r8 = r1.f264898e
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r8.f264900a
            te3.j00 r1 = r8.ContentObj
            int r1 = r1.f298424e
            java.lang.String r2 = r6.f284273d
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4[r0] = r5
            java.lang.String r5 = "isNeedToShowSnsInfo contentStyle %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            java.lang.String r2 = r7.f269428h
            if (r2 != 0) goto L_0x0035
            java.lang.String r7 = r6.f284273d
            java.lang.String r8 = "ability is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r8)
            return r0
        L_0x0035:
            if (r1 == r3) goto L_0x0078
            r4 = 15
            if (r1 == r4) goto L_0x006e
            r4 = 42
            if (r1 == r4) goto L_0x0064
            r4 = 3
            java.lang.String r5 = "timeLineObject.ContentObj.Url"
            if (r1 == r4) goto L_0x0058
            r4 = 4
            if (r1 == r4) goto L_0x0064
            r2 = 5
            if (r1 == r2) goto L_0x004c
            goto L_0x0082
        L_0x004c:
            te3.j00 r8 = r8.ContentObj
            java.lang.String r8 = r8.f298426g
            gy3.C87412m.m108593f(r8, r5)
            boolean r0 = r6.mo135699K7(r8, r7)
            goto L_0x0082
        L_0x0058:
            te3.j00 r8 = r8.ContentObj
            java.lang.String r8 = r8.f298426g
            gy3.C87412m.m108593f(r8, r5)
            boolean r0 = r6.mo135699K7(r8, r7)
            goto L_0x0082
        L_0x0064:
            java.lang.String r7 = "wxmsg_music"
            boolean r7 = z04.C112550d0.m153801u(r2, r7, r0)
            if (r7 == 0) goto L_0x0082
            goto L_0x0081
        L_0x006e:
            java.lang.String r7 = "wxmsg_video"
            boolean r7 = z04.C112550d0.m153801u(r2, r7, r0)
            if (r7 == 0) goto L_0x0082
            goto L_0x0081
        L_0x0078:
            java.lang.String r7 = "wxmsg_image"
            boolean r7 = z04.C112550d0.m153801u(r2, r7, r0)
            if (r7 == 0) goto L_0x0082
        L_0x0081:
            r0 = 1
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.ChattingSendDataToDeviceUI.mo135698J7(com.tencent.mm.plugin.exdevice.model.l1, java.lang.String):boolean");
    }

    /* renamed from: K7 */
    public final boolean mo135699K7(String str, C93366l1 l1Var) {
        String str2 = l1Var.f269428h;
        String str3 = l1Var.f269429i;
        String host = Uri.parse(str).getHost();
        if (str3 != null) {
            if ((str3.length() > 0) && str2 != null && C112550d0.m153801u(str2, "wxmsg_url", false)) {
                try {
                    JSONArray jSONArray = new JSONObject(str3).getJSONArray("wxmsg_url");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        C87412m.m108593f(string, "jsonArrayUrls.getString(i)");
                        if (C87412m.m108589b(string, host)) {
                            return true;
                        }
                    }
                } catch (JSONException e) {
                    Log.printErrStackTrace(this.f284273d, e, str3, new Object[0]);
                }
            }
        }
        return false;
    }

    /* renamed from: L7 */
    public final void mo135700L7(int i) {
        C68070l.C68072b u;
        String str = "";
        if (this.f284241G) {
            C115669n.INSTANCE.mo160131h(13197, Integer.valueOf(i), Integer.valueOf(this.f284268Z), str, 2, Integer.valueOf(this.f284266Y));
            return;
        }
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(this.f284268Z);
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f284246L);
        if (b002.getMsgId() != 0) {
            String content = b002.getContent();
            if (b002.getType() == 49 && (u = C68070l.C68072b.m80422u(content, (String) null)) != null && u.f195582i == 6) {
                str = u.f195602n;
            }
        }
        objArr[2] = str;
        objArr[3] = 1;
        objArr[4] = Integer.valueOf(this.f284266Y);
        nVar.mo160131h(13197, objArr);
    }

    /* renamed from: M7 */
    public final void mo135701M7() {
        View view = this.f284277h;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (!this.f284244J.isEmpty() || !this.f284243I.isEmpty()) {
                layoutParams2.topMargin = C79406f.m96347a(this, 24.0f);
                layoutParams2.bottomMargin = C79406f.m96347a(this, 30.0f);
            } else {
                layoutParams2.topMargin = C79406f.m96347a(this, 40.0f);
                layoutParams2.bottomMargin = C79406f.m96347a(this, 59.0f);
            }
            View view2 = this.f284277h;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            } else {
                C87412m.m108603p("nearbyBtn");
                throw null;
            }
        } else {
            C87412m.m108603p("nearbyBtn");
            throw null;
        }
    }

    /* renamed from: N7 */
    public final void mo135702N7() {
        C93366l1 l1Var = this.f284264X;
        if (l1Var != null) {
            l1Var.f269430j = this.f284292x0;
        }
        this.f284264X = null;
        ViewGroup viewGroup = this.f284279j;
        if (viewGroup != null) {
            m124693P7(this, viewGroup, 8, 0, 2, (Object) null);
            ViewGroup viewGroup2 = this.f284280n;
            if (viewGroup2 != null) {
                m124693P7(this, viewGroup2, 8, 0, 2, (Object) null);
                ViewGroup viewGroup3 = this.f284274e;
                if (viewGroup3 != null) {
                    m124693P7(this, viewGroup3, 0, 0, 2, (Object) null);
                } else {
                    C87412m.m108603p("deviceMainLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("sendingDeviceLayout");
                throw null;
            }
        } else {
            C87412m.m108603p("otherDeviceLayout");
            throw null;
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2327o);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cuq;
    }

    public void onBackPressed() {
        if (!isFinishing()) {
            ViewGroup viewGroup = this.f284280n;
            if (viewGroup == null) {
                C87412m.m108603p("sendingDeviceLayout");
                throw null;
            } else if (viewGroup.getVisibility() == 0) {
                C93366l1 l1Var = this.f284264X;
                if (l1Var == null || C87412m.m108589b(l1Var.f269430j, this.f284294y0) || C87412m.m108589b(l1Var.f269430j, this.f284253R0)) {
                    mo135702N7();
                } else if (C87412m.m108589b(l1Var.f269430j, this.f284255S0)) {
                    ExDeviceCheckNetworkDeviceUploadCdnEvent exDeviceCheckNetworkDeviceUploadCdnEvent = new ExDeviceCheckNetworkDeviceUploadCdnEvent();
                    ExDeviceCheckNetworkDeviceUploadCdnEvent.C92479a aVar = exDeviceCheckNetworkDeviceUploadCdnEvent.f264705d;
                    aVar.f264708b = l1Var.f269424d;
                    aVar.f264709c = l1Var.f269431n;
                    aVar.f264707a = this.f284246L;
                    exDeviceCheckNetworkDeviceUploadCdnEvent.publish();
                    if (exDeviceCheckNetworkDeviceUploadCdnEvent.f264706e.f264710a) {
                        Log.m105924i(this.f284273d, "upload dialog");
                        if (this.f284236B == null && this.f284237C == null) {
                            C77426q qVar = new C77426q(this);
                            this.f284236B = qVar;
                            qVar.mo107595g(getString(C0966R.string.bbn));
                            qVar.mo107598j(getString(C0966R.string.bbo));
                            qVar.mo107602n(getString(C0966R.string.bbp));
                            qVar.mo107589a(false);
                            qVar.mo107590b(new C97017d3(this));
                            qVar.mo107603o();
                            return;
                        }
                        return;
                    }
                    Log.m105924i(this.f284273d, "quit dialog");
                    if (this.f284236B == null && this.f284237C == null) {
                        C77426q qVar2 = new C77426q(this);
                        this.f284237C = qVar2;
                        qVar2.mo107595g(getString(C0966R.string.mca));
                        qVar2.mo107598j(getString(C0966R.string.mcg));
                        qVar2.mo107602n(getString(C0966R.string.bfj));
                        qVar2.mo107589a(false);
                        qVar2.mo107590b(new C97014b3(this));
                        qVar2.mo107603o();
                    }
                } else {
                    finish();
                }
            } else {
                ViewGroup viewGroup2 = this.f284279j;
                if (viewGroup2 == null) {
                    C87412m.m108603p("otherDeviceLayout");
                    throw null;
                } else if (viewGroup2.getVisibility() == 0) {
                    mo135702N7();
                } else {
                    finish();
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Log.m105924i(this.f284273d, "config change");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:194:0x066e, code lost:
        if (r1 != 4) goto L_0x064b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x06ea, code lost:
        if (r4 == 43) goto L_0x0677;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            super.onCreate(r18)
            r2 = 2131308848(0x7f093130, float:1.8235963E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.main_device)"
            gy3.C87412m.m108593f(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f284274e = r2
            r2 = 2131309257(0x7f0932c9, float:1.8236793E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.mine_device)"
            gy3.C87412m.m108593f(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f284275f = r2
            r2 = 2131311536(0x7f093bb0, float:1.8241415E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.public_device)"
            gy3.C87412m.m108593f(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f284276g = r2
            r2 = 2131310679(0x7f093857, float:1.8239677E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.other_device)"
            gy3.C87412m.m108593f(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f284279j = r2
            r2 = 2131313202(0x7f094232, float:1.8244794E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.sending_device)"
            gy3.C87412m.m108593f(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f284280n = r2
            r2 = 2131309258(0x7f0932ca, float:1.8236795E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.mine_device_list)"
            gy3.C87412m.m108593f(r2, r3)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r0.f284293y = r2
            r2 = 2131311537(0x7f093bb1, float:1.8241417E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.public_device_list)"
            gy3.C87412m.m108593f(r2, r3)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r0.f284295z = r2
            r2 = 2131310680(0x7f093858, float:1.8239679E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.other_device_list)"
            gy3.C87412m.m108593f(r2, r3)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r0.f284235A = r2
            r2 = 2131308853(0x7f093135, float:1.8235973E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.main_iv_back)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f284278i = r2
            r2 = 2131313206(0x7f094236, float:1.8244802E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.sending_iv_back)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f284281o = r2
            r2 = 2131313205(0x7f094235, float:1.82448E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.sending_iv)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f284282p = r2
            r2 = 2131313209(0x7f094239, float:1.8244808E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.sending_tv)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f284286s = r2
            r2 = 2131313200(0x7f094230, float:1.824479E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.sending_cur_icon)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f284284q = r2
            r2 = 2131313201(0x7f094231, float:1.8244792E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.sending_cur_layout)"
            gy3.C87412m.m108593f(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f284285r = r2
            r2 = 2131313204(0x7f094234, float:1.8244798E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.sending_hint_tv)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f284287t = r2
            r2 = 2131313199(0x7f09422f, float:1.8244788E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.sending_btn)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.Button r2 = (android.widget.Button) r2
            r0.f284288u = r2
            r2 = 2131313203(0x7f094233, float:1.8244796E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.sending_error_btn)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.Button r2 = (android.widget.Button) r2
            r0.f284289v = r2
            r2 = 2131313208(0x7f094238, float:1.8244806E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.sending_setting_tv)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0.f284290w = r2
            r2 = 2131313207(0x7f094237, float:1.8244804E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.sending_progress)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r0.f284291x = r2
            r2 = 2131310029(0x7f0935cd, float:1.8238359E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.nearby_device)"
            gy3.C87412m.m108593f(r2, r3)
            r0.f284277h = r2
            r2 = 2131100316(0x7f06029c, float:1.781301E38)
            int r2 = p385u2.C111105a.m151500b(r0, r2)
            r0.f284265X0 = r2
            android.view.View r2 = r0.f284277h
            r3 = 0
            if (r2 == 0) goto L_0x077b
            com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$e r4 = new com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$e
            r4.<init>(r0)
            r2.setOnClickListener(r4)
            android.view.ViewGroup r2 = r0.f284274e
            if (r2 == 0) goto L_0x0775
            com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$f r4 = new com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$f
            r4.<init>(r0)
            r2.post(r4)
            r2 = 1
            r0.setFinishOnTouchOutside(r2)
            r4 = 0
            r0.f284262W = r4
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r5 = r0.f284243I
            r5.clear()
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r5 = r0.f284244J
            r5.clear()
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r5 = r0.f284245K
            r5.clear()
            android.content.Intent r5 = r17.getIntent()
            android.os.Bundle r5 = r5.getExtras()
            if (r5 == 0) goto L_0x018f
            java.lang.String r6 = "sns_send_data_ui_activity"
            boolean r5 = r5.getBoolean(r6, r4)
            goto L_0x0190
        L_0x018f:
            r5 = 0
        L_0x0190:
            r0.f284241G = r5
            android.content.Intent r5 = r17.getIntent()
            android.os.Bundle r5 = r5.getExtras()
            gy3.C87412m.m108591d(r5)
            java.lang.String r6 = "exdevice_open_scene_type"
            r7 = 2
            int r5 = r5.getInt(r6, r7)
            r0.f284266Y = r5
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent r5 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent
            r5.<init>()
            boolean r6 = r0.f284241G
            r9 = 0
            r11 = -1
            r14 = 5
            r15 = 4
            r8 = 3
            if (r6 == 0) goto L_0x01e0
            android.content.Intent r6 = r17.getIntent()
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto L_0x01c8
            java.lang.String r7 = "sns_local_id"
            java.lang.String r6 = r6.getString(r7)
            goto L_0x01c9
        L_0x01c8:
            r6 = r3
        L_0x01c9:
            r0.f284242H = r6
            if (r6 == 0) goto L_0x01dd
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$a r7 = r5.f236178d
            r7.f236181b = r6
            java.lang.String r7 = r0.f284273d
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r4] = r6
            java.lang.String r6 = "mSnsLocalId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r13)
        L_0x01dd:
            r4 = r5
            goto L_0x0369
        L_0x01e0:
            java.lang.Class<gt.k> r6 = p158gt.C98201k.class
            android.content.Intent r7 = r17.getIntent()
            android.os.Bundle r7 = r7.getExtras()
            gy3.C87412m.m108591d(r7)
            java.lang.String r13 = "Retr_Msg_Id"
            r16 = r5
            long r4 = r7.getLong(r13)
            r0.f284246L = r4
            int r7 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x01fd
            goto L_0x0361
        L_0x01fd:
            k40.a r4 = f40.C86709a0.m107533q(r1)
            f62.k0 r4 = (f62.C75700k0) r4
            g62.l r4 = r4.mo96095LE()
            long r11 = r0.f284246L
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            com.tencent.mm.storage.f4 r4 = r4.b00(r11)
            r0.f284247M = r4
            long r11 = r4.getMsgId()
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x021b
            goto L_0x0361
        L_0x021b:
            int r5 = r4.getType()
            r0.f284249P = r5
            java.lang.String r5 = r4.mo108768t()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
            r0.f284250Q = r5
            java.lang.String r5 = r4.getContent()
            r0.f284254S = r5
            boolean r5 = r0.f284250Q
            if (r5 == 0) goto L_0x0253
            int r5 = r4.mo108769t2()
            if (r5 != 0) goto L_0x0253
            boolean r5 = r0.f284250Q
            if (r5 == 0) goto L_0x0253
            com.tencent.mm.message.l$b r5 = r0.f284248N
            if (r5 == 0) goto L_0x0253
            int r5 = r4.mo108769t2()
            if (r5 != 0) goto L_0x0253
            java.lang.String r5 = r4.getContent()
            java.lang.String r5 = eb0.C75604z3.m90849u(r5)
            r0.f284254S = r5
        L_0x0253:
            int r5 = r4.getType()
            r7 = 49
            if (r5 != r7) goto L_0x02e5
            java.lang.String r5 = r0.f284254S
            com.tencent.mm.message.l$b r5 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r5, r3)
            r0.f284248N = r5
            if (r5 != 0) goto L_0x026e
            java.lang.String r4 = r0.f284273d
            java.lang.String r5 = "initParams content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            goto L_0x0361
        L_0x026e:
            int r7 = r5.f195582i
            if (r7 != r8) goto L_0x0274
            r11 = 1
            goto L_0x0275
        L_0x0274:
            r11 = 0
        L_0x0275:
            if (r11 == 0) goto L_0x027d
            r4 = 16
            r0.f284252R = r4
            goto L_0x034f
        L_0x027d:
            if (r7 != r15) goto L_0x0281
            r11 = 1
            goto L_0x0282
        L_0x0281:
            r11 = 0
        L_0x0282:
            if (r11 == 0) goto L_0x028a
            r4 = 8
            r0.f284252R = r4
            goto L_0x034f
        L_0x028a:
            if (r7 != r14) goto L_0x028e
            r11 = 1
            goto L_0x028f
        L_0x028e:
            r11 = 0
        L_0x028f:
            if (r11 == 0) goto L_0x0297
            r4 = 32
            r0.f284252R = r4
            goto L_0x034f
        L_0x0297:
            r11 = 6
            if (r7 != r11) goto L_0x029c
            r11 = 1
            goto L_0x029d
        L_0x029c:
            r11 = 0
        L_0x029d:
            if (r11 == 0) goto L_0x02b8
            java.lang.String r4 = r5.f195602n
            java.lang.Long r4 = wc3.C102428i.m135144a(r4)
            if (r4 != 0) goto L_0x02b0
            java.lang.String r4 = r0.f284273d
            java.lang.String r5 = "initParams TYPE_FILE getContentTypeFlag null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            goto L_0x0361
        L_0x02b0:
            long r4 = r4.longValue()
            r0.f284252R = r4
            goto L_0x034f
        L_0x02b8:
            r5 = 2
            if (r7 != r5) goto L_0x02bd
            r5 = 1
            goto L_0x02be
        L_0x02bd:
            r5 = 0
        L_0x02be:
            if (r5 == 0) goto L_0x02dc
            r11 = 2
            r0.f284252R = r11
            di3.d r5 = di3.C86312j.m106911c(r6)
            gt.k r5 = (p158gt.C98201k) r5
            gt.m r5 = r5.mo137277xi()
            com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
            com.tencent.mm.modelimage.k r4 = r5.mo127198uP(r4)
            if (r4 == 0) goto L_0x034f
            java.lang.String r4 = r4.f267393t
            r0.f284254S = r4
            goto L_0x034f
        L_0x02dc:
            java.lang.String r4 = r0.f284273d
            java.lang.String r5 = "initParams APPMSG not support type"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            goto L_0x0361
        L_0x02e5:
            int r5 = r4.getType()
            if (r5 != r8) goto L_0x0302
            di3.d r5 = di3.C86312j.m106911c(r6)
            gt.k r5 = (p158gt.C98201k) r5
            gt.m r5 = r5.mo137277xi()
            com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
            com.tencent.mm.modelimage.k r4 = r5.mo127198uP(r4)
            if (r4 == 0) goto L_0x0328
            java.lang.String r4 = r4.f267393t
            r0.f284254S = r4
            goto L_0x0328
        L_0x0302:
            int r5 = r4.getType()
            r6 = 43
            if (r5 != r6) goto L_0x0328
            java.lang.Class<rz.s> r5 = p682rz.C101488s.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            rz.s r5 = (p682rz.C101488s) r5
            rz.t r5 = r5.Kj0()
            java.lang.String r4 = r4.mo108765s2()
            hd0.o0 r5 = (hd0.C98410o0) r5
            hd0.n0 r4 = r5.mo137720f(r4)
            if (r4 == 0) goto L_0x0328
            java.lang.String r4 = r4.mo137705i()
            r0.f284254S = r4
        L_0x0328:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r0.f284249P
            r4.append(r5)
            java.lang.String r5 = ""
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Long r4 = wc3.C102428i.m135144a(r4)
            if (r4 != 0) goto L_0x0349
            java.lang.String r4 = r0.f284273d
            java.lang.String r5 = "initParams not appmsg getContentTypeFlag null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            goto L_0x0361
        L_0x0349:
            long r4 = r4.longValue()
            r0.f284252R = r4
        L_0x034f:
            java.lang.String r4 = r0.f284273d
            java.lang.Object[] r5 = new java.lang.Object[r2]
            long r6 = r0.f284252R
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = "contentFlag: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
        L_0x0361:
            r4 = r16
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$a r5 = r4.f236178d
            long r6 = r0.f284246L
            r5.f236180a = r6
        L_0x0369:
            r4.publish()
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$b r4 = r4.f236179e
            boolean r4 = r4.f236182a
            java.lang.String r5 = "mineDeviceLayout"
            r6 = 8
            if (r4 == 0) goto L_0x070b
            r0.f284283p0 = r2
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent> r4 = r0.f284269Z0
            r4.alive()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent> r4 = r0.f284270a1
            r4.alive()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$initNetworkDeviceView$1 r7 = new com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$initNetworkDeviceView$1
            r7.<init>(r0)
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r11 = r0.f284243I
            r12 = 0
            r4.<init>(r7, r11, r12)
            r0.f284238D = r4
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$initNetworkDeviceView$2 r7 = new com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$initNetworkDeviceView$2
            r7.<init>(r0)
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r11 = r0.f284244J
            r4.<init>(r7, r11, r12)
            r0.f284239E = r4
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$initNetworkDeviceView$3 r7 = new com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$initNetworkDeviceView$3
            r7.<init>(r0)
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r11 = r0.f284245K
            r4.<init>(r7, r11, r12)
            r0.f284240F = r4
            androidx.recyclerview.widget.RecyclerView r4 = r0.f284293y
            java.lang.String r7 = "mineDeviceListView"
            if (r4 == 0) goto L_0x0707
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.exdevice.model.l1> r11 = r0.f284238D
            r4.setAdapter(r11)
            androidx.recyclerview.widget.RecyclerView r4 = r0.f284293y
            if (r4 == 0) goto L_0x0703
            androidx.recyclerview.widget.LinearLayoutManager r7 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.appcompat.app.AppCompatActivity r11 = r17.getContext()
            r7.<init>(r11, r12, r12)
            r4.setLayoutManager(r7)
            androidx.recyclerview.widget.RecyclerView r4 = r0.f284295z
            java.lang.String r7 = "publicDeviceListView"
            if (r4 == 0) goto L_0x06ff
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.exdevice.model.l1> r11 = r0.f284239E
            r4.setAdapter(r11)
            androidx.recyclerview.widget.RecyclerView r4 = r0.f284295z
            if (r4 == 0) goto L_0x06fb
            androidx.recyclerview.widget.LinearLayoutManager r7 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.appcompat.app.AppCompatActivity r11 = r17.getContext()
            r7.<init>(r11, r12, r12)
            r4.setLayoutManager(r7)
            androidx.recyclerview.widget.RecyclerView r4 = r0.f284235A
            java.lang.String r7 = "otherDeviceListView"
            if (r4 == 0) goto L_0x06f7
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.exdevice.model.l1> r11 = r0.f284240F
            r4.setAdapter(r11)
            androidx.recyclerview.widget.RecyclerView r4 = r0.f284235A
            if (r4 == 0) goto L_0x06f3
            androidx.recyclerview.widget.LinearLayoutManager r7 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.appcompat.app.AppCompatActivity r11 = r17.getContext()
            r7.<init>(r11, r12, r12)
            r4.setLayoutManager(r7)
            com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent r4 = new com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent
            r4.<init>()
            boolean r7 = r0.f284241G
            if (r7 == 0) goto L_0x043a
            android.content.Intent r7 = r17.getIntent()
            android.os.Bundle r7 = r7.getExtras()
            gy3.C87412m.m108591d(r7)
            java.lang.String r11 = "sns_send_data_ui_image_path"
            java.lang.String r7 = r7.getString(r11)
            android.content.Intent r11 = r17.getIntent()
            android.os.Bundle r11 = r11.getExtras()
            gy3.C87412m.m108591d(r11)
            java.lang.String r12 = "sns_send_data_ui_image_media_id"
            java.lang.String r11 = r11.getString(r12)
            com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent$a r12 = r4.f264711d
            java.lang.String r13 = r0.f284242H
            r12.f264714b = r13
            r12.f264715c = r7
            r12.f264716d = r11
            goto L_0x0440
        L_0x043a:
            com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent$a r7 = r4.f264711d
            long r11 = r0.f284246L
            r7.f264713a = r11
        L_0x0440:
            r4.publish()
            com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent$b r7 = r4.f264712e
            boolean r11 = r7.f264719c
            if (r11 == 0) goto L_0x0642
            java.util.List r7 = r7.f264717a
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>?>"
            gy3.C87412m.m108592e(r7, r11)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r11 = r7.size()
            java.lang.String r12 = r0.f284273d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "oldDeviceInfo size ="
            r13.append(r14)
            com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent$b r14 = r4.f264712e
            java.util.List r14 = r14.f264718b
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r14 = r14.size()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            r12 = 0
        L_0x0479:
            if (r12 >= r11) goto L_0x051d
            com.tencent.mm.plugin.exdevice.model.l1 r13 = new com.tencent.mm.plugin.exdevice.model.l1
            r13.<init>()
            java.lang.Object r14 = r7.get(r12)
            gy3.C87412m.m108591d(r14)
            java.util.Map r14 = (java.util.Map) r14
            java.lang.String r9 = "deviceType"
            java.lang.Object r9 = r14.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r13.f269425e = r9
            java.lang.Object r9 = r7.get(r12)
            gy3.C87412m.m108591d(r9)
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r10 = "deviceID"
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            r13.f269424d = r9
            java.lang.Object r9 = r7.get(r12)
            gy3.C87412m.m108591d(r9)
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r10 = "displayName"
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            r13.f269426f = r9
            java.lang.Object r9 = r7.get(r12)
            gy3.C87412m.m108591d(r9)
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r10 = "iconUrl"
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            r13.f269427g = r9
            java.lang.Object r9 = r7.get(r12)
            gy3.C87412m.m108591d(r9)
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r10 = "ability"
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            r13.f269428h = r9
            java.lang.Object r9 = r7.get(r12)
            gy3.C87412m.m108591d(r9)
            java.util.Map r9 = (java.util.Map) r9
            java.lang.String r10 = "abilityInf"
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            r13.f269429i = r9
            java.lang.String r9 = r0.f284292x0
            r13.f269430j = r9
            boolean r9 = r0.f284241G
            if (r9 == 0) goto L_0x0508
            java.lang.String r9 = r0.f284242H
            boolean r9 = r0.mo135698J7(r13, r9)
            if (r9 == 0) goto L_0x0508
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r9 = r0.f284245K
            r9.add(r13)
            goto L_0x0517
        L_0x0508:
            boolean r9 = r0.f284241G
            if (r9 != 0) goto L_0x0517
            boolean r9 = r0.mo135697I7(r13)
            if (r9 == 0) goto L_0x0517
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r9 = r0.f284245K
            r9.add(r13)
        L_0x0517:
            int r12 = r12 + 1
            r9 = 0
            goto L_0x0479
        L_0x051d:
            boolean r7 = r0.f284241G
            if (r7 != 0) goto L_0x05a3
            com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent$b r7 = r4.f264712e
            java.util.List r7 = r7.f264718b
            if (r7 == 0) goto L_0x05a3
            java.lang.String r7 = r0.f284273d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "iotDeviceInfo size ="
            r9.append(r10)
            com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent$b r10 = r4.f264712e
            java.util.List r10 = r10.f264718b
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent$b r4 = r4.f264712e
            java.util.List r4 = r4.f264718b
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.protocal.protobuf.MMIotDeviceInfo>"
            gy3.C87412m.m108592e(r4, r7)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0558:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x05a3
            java.lang.Object r7 = r4.next()
            te3.at2 r7 = (te3.C48759at2) r7
            com.tencent.mm.plugin.exdevice.model.l1 r9 = new com.tencent.mm.plugin.exdevice.model.l1
            r9.<init>()
            java.lang.String r10 = r7.f130758e
            r9.f269424d = r10
            int r10 = r7.f130757d
            r9.f269432o = r10
            java.lang.String r10 = r7.f130759f
            r9.f269426f = r10
            java.lang.String r10 = r7.f130760g
            r9.f269427g = r10
            java.util.LinkedList<java.lang.Integer> r7 = r7.f130761h
            r9.f269433p = r7
            r9.f269431n = r2
            boolean r7 = r0.mo135697I7(r9)
            if (r7 == 0) goto L_0x0558
            java.lang.String r7 = r0.f284273d
            java.lang.String r10 = "need show"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            int r7 = r9.f269432o
            int r10 = r0.f284261V0
            if (r7 != r10) goto L_0x0599
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r7 = r0.f284243I
            r7.add(r9)
            goto L_0x0558
        L_0x0599:
            int r10 = r0.f284263W0
            if (r7 != r10) goto L_0x0558
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r7 = r0.f284244J
            r7.add(r9)
            goto L_0x0558
        L_0x05a3:
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r4 = r0.f284245K
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x05c5
            com.tencent.mm.plugin.exdevice.model.l1 r4 = new com.tencent.mm.plugin.exdevice.model.l1
            r4.<init>()
            r4.f269431n = r2
            java.lang.String r7 = r0.f284267Y0
            r4.f269424d = r7
            r7 = 2131825294(0x7f11128e, float:1.928344E38)
            java.lang.String r7 = r0.getString(r7)
            r4.f269426f = r7
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r7 = r0.f284243I
            r7.add(r4)
        L_0x05c5:
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r4 = r0.f284243I
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x05d4
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.exdevice.model.l1> r4 = r0.f284238D
            if (r4 == 0) goto L_0x05d4
            r4.notifyDataSetChanged()
        L_0x05d4:
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r4 = r0.f284244J
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x05e3
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.exdevice.model.l1> r4 = r0.f284239E
            if (r4 == 0) goto L_0x05e3
            r4.notifyDataSetChanged()
        L_0x05e3:
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r4 = r0.f284245K
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x05f2
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.exdevice.model.l1> r4 = r0.f284240F
            if (r4 == 0) goto L_0x05f2
            r4.notifyDataSetChanged()
        L_0x05f2:
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r4 = r0.f284243I
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x060e
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r4 = r0.f284245K
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x060e
            android.view.ViewGroup r4 = r0.f284275f
            if (r4 == 0) goto L_0x060a
            r4.setVisibility(r6)
            goto L_0x0616
        L_0x060a:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x060e:
            android.view.ViewGroup r4 = r0.f284275f
            if (r4 == 0) goto L_0x063e
            r7 = 0
            r4.setVisibility(r7)
        L_0x0616:
            java.util.ArrayList<com.tencent.mm.plugin.exdevice.model.l1> r4 = r0.f284244J
            boolean r4 = r4.isEmpty()
            java.lang.String r5 = "publicDeviceLayout"
            if (r4 == 0) goto L_0x062e
            android.view.ViewGroup r4 = r0.f284276g
            if (r4 == 0) goto L_0x062a
            r4.setVisibility(r6)
            r6 = 0
            goto L_0x0636
        L_0x062a:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x062e:
            android.view.ViewGroup r4 = r0.f284276g
            if (r4 == 0) goto L_0x063a
            r6 = 0
            r4.setVisibility(r6)
        L_0x0636:
            r17.mo135701M7()
            goto L_0x0643
        L_0x063a:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x063e:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x0642:
            r6 = 0
        L_0x0643:
            boolean r4 = r0.f284241G
            if (r4 == 0) goto L_0x067d
            java.lang.String r1 = r0.f284242H
            if (r1 != 0) goto L_0x064e
        L_0x064b:
            r4 = 0
            goto L_0x06ed
        L_0x064e:
            com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent r4 = new com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent
            r4.<init>()
            com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent$a r5 = r4.f264897d
            r5.f264899a = r1
            r4.publish()
            com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent$b r1 = r4.f264898e
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.f264900a
            te3.j00 r1 = r1.ContentObj
            int r1 = r1.f298424e
            if (r1 == r2) goto L_0x067a
            r4 = 15
            if (r1 == r4) goto L_0x0677
            r4 = 42
            if (r1 == r4) goto L_0x0674
            if (r1 == r8) goto L_0x0671
            if (r1 == r15) goto L_0x0674
            goto L_0x064b
        L_0x0671:
            r4 = 5
            goto L_0x06ed
        L_0x0674:
            r4 = 1
            goto L_0x06ed
        L_0x0677:
            r4 = 6
            goto L_0x06ed
        L_0x067a:
            r4 = 3
            goto L_0x06ed
        L_0x067d:
            long r4 = r0.f284246L
            r9 = -1
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x064b
            r9 = -9223372036854775808
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x068c
            goto L_0x064b
        L_0x068c:
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r1 = r1.b00(r4)
            long r4 = r1.getMsgId()
            r9 = 0
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x06a7
            goto L_0x064b
        L_0x06a7:
            int r4 = r1.getType()
            java.lang.String r5 = r1.getContent()
            boolean r1 = r1.mo101020w3()
            if (r1 == 0) goto L_0x06d8
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r5, r3)
            if (r1 != 0) goto L_0x06c3
            java.lang.String r1 = r0.f284273d
            java.lang.String r4 = "get content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
            goto L_0x064b
        L_0x06c3:
            int r1 = r1.f195582i
            r5 = 2
            if (r1 == r5) goto L_0x067a
            if (r1 == r8) goto L_0x0674
            if (r1 == r15) goto L_0x06d6
            r4 = 5
            if (r1 == r4) goto L_0x06ed
            r7 = 6
            if (r1 == r7) goto L_0x06d4
            goto L_0x064b
        L_0x06d4:
            r4 = 4
            goto L_0x06ed
        L_0x06d6:
            r7 = 6
            goto L_0x0677
        L_0x06d8:
            r5 = 2
            r7 = 6
            if (r4 != r8) goto L_0x06dd
            goto L_0x067a
        L_0x06dd:
            r1 = 48
            if (r4 != r1) goto L_0x06e3
            r4 = 2
            goto L_0x06ed
        L_0x06e3:
            r1 = 62
            if (r4 != r1) goto L_0x06e8
            goto L_0x0677
        L_0x06e8:
            r1 = 43
            if (r4 != r1) goto L_0x064b
            goto L_0x0677
        L_0x06ed:
            r0.f284268Z = r4
            r0.mo135700L7(r2)
            goto L_0x0712
        L_0x06f3:
            gy3.C87412m.m108603p(r7)
            throw r3
        L_0x06f7:
            gy3.C87412m.m108603p(r7)
            throw r3
        L_0x06fb:
            gy3.C87412m.m108603p(r7)
            throw r3
        L_0x06ff:
            gy3.C87412m.m108603p(r7)
            throw r3
        L_0x0703:
            gy3.C87412m.m108603p(r7)
            throw r3
        L_0x0707:
            gy3.C87412m.m108603p(r7)
            throw r3
        L_0x070b:
            android.view.ViewGroup r1 = r0.f284275f
            if (r1 == 0) goto L_0x0771
            r1.setVisibility(r6)
        L_0x0712:
            r1 = 2131312112(0x7f093df0, float:1.8242583E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.View$OnClickListener r2 = r0.f284271b1
            r1.setOnClickListener(r2)
            android.widget.ImageView r1 = r0.f284281o
            if (r1 == 0) goto L_0x076a
            android.view.View$OnClickListener r2 = r0.f284271b1
            r1.setOnClickListener(r2)
            android.widget.Button r1 = r0.f284288u
            if (r1 == 0) goto L_0x0763
            android.view.View$OnClickListener r2 = r0.f284272c1
            r1.setOnClickListener(r2)
            android.widget.Button r1 = r0.f284289v
            if (r1 == 0) goto L_0x075c
            android.view.View$OnClickListener r2 = r0.f284272c1
            r1.setOnClickListener(r2)
            android.widget.ImageView r1 = r0.f284278i
            if (r1 == 0) goto L_0x0755
            com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$g r2 = new com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$g
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            r1 = 2131297518(0x7f0904ee, float:1.8212983E38)
            android.view.View r1 = r0.findViewById(r1)
            com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$h r2 = new com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI$h
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            return
        L_0x0755:
            java.lang.String r1 = "mainBackIv"
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x075c:
            java.lang.String r1 = "sendingFinishBtn"
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x0763:
            java.lang.String r1 = "sendingConfirmBtn"
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x076a:
            java.lang.String r1 = "sendingBackIv"
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x0771:
            gy3.C87412m.m108603p(r5)
            throw r3
        L_0x0775:
            java.lang.String r1 = "deviceMainLayout"
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x077b:
            java.lang.String r1 = "nearbyBtn"
            gy3.C87412m.m108603p(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.ChattingSendDataToDeviceUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i(this.f284273d, "onDestroy");
        C93366l1 l1Var = this.f284264X;
        String str = l1Var != null ? l1Var.f269424d : null;
        if (str != null) {
            ExDeviceCancelNetworkDeviceTaskEvent exDeviceCancelNetworkDeviceTaskEvent = new ExDeviceCancelNetworkDeviceTaskEvent();
            exDeviceCancelNetworkDeviceTaskEvent.f264701d.f264703a = str;
            exDeviceCancelNetworkDeviceTaskEvent.publish();
        }
        if (this.f284283p0) {
            if (!this.f284262W) {
                mo135700L7(2);
            }
            this.f284269Z0.dead();
            this.f284270a1.dead();
            ExDeviceStopScanNetworkDeviceEvent exDeviceStopScanNetworkDeviceEvent = new ExDeviceStopScanNetworkDeviceEvent();
            exDeviceStopScanNetworkDeviceEvent.publish();
            if (exDeviceStopScanNetworkDeviceEvent.f264744d.f264745a) {
                Log.m105924i(this.f284273d, "Stop scan Network success!");
            }
        }
    }
}
