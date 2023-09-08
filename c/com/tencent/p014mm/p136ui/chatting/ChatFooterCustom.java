package com.tencent.p014mm.p136ui.chatting;

import a70.C112760b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import c00.C0405n;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.plugin.C40030e;
import com.tencent.p014mm.autogen.events.ExDeviceOpInChattingUIEvent;
import com.tencent.p014mm.autogen.events.PublishLocationEvent;
import com.tencent.p014mm.autogen.events.PublishScanCodeResultEvent;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.base.MMListPopupWindow;
import com.tencent.p014mm.p136ui.chatting.component.biz.BizComponent;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.C5177x;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C45629t0;
import eb0.C75592q0;
import eb0.C86497v5;
import eb0.C97625j3;
import ie3.C87716k;
import j20.C117292a;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jc2.C117343c;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76630x0;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C35136m;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import p140cw.C7138g;
import p182kk.C61104a;
import p248ug.C52558c;
import p626nv.C109759g;
import p626nv.C47299e;
import p629ny.C76979h;
import rb0.C47988l0;
import rb0.C47996o;
import sf0.C48374j0;
import sf0.C77702q0;
import te3.C49618gw;
import te3.tg4;
import u73.C101987v0;
import wc3.C15134f0;
import wc3.C90945m;

/* renamed from: com.tencent.mm.ui.chatting.ChatFooterCustom */
public class ChatFooterCustom extends LinearLayout implements View.OnClickListener, C86497v5.C86498c {

    /* renamed from: B */
    public static final /* synthetic */ int f215244B = 0;

    /* renamed from: A */
    public Object f215245A;

    /* renamed from: d */
    public LinearLayout f215246d;

    /* renamed from: e */
    public ImageView f215247e;

    /* renamed from: f */
    public ImageView f215248f;

    /* renamed from: g */
    public LinearLayout f215249g;

    /* renamed from: h */
    public C73832q0 f215250h;

    /* renamed from: i */
    public ChatFooter$$n1 f215251i;

    /* renamed from: j */
    public BizComponent.C44804m f215252j;

    /* renamed from: n */
    public Boolean f215253n;

    /* renamed from: o */
    public Map<String, C73850t4> f215254o;

    /* renamed from: p */
    public List<C73850t4> f215255p;

    /* renamed from: q */
    public int f215256q;

    /* renamed from: r */
    public String f215257r;

    /* renamed from: s */
    public C72996z1 f215258s;

    /* renamed from: t */
    public C52558c f215259t;

    /* renamed from: u */
    public GetLocationListener f215260u;

    /* renamed from: v */
    public GetScanCodeListener f215261v;

    /* renamed from: w */
    public MMFragment f215262w;

    /* renamed from: x */
    public List<String> f215263x;

    /* renamed from: y */
    public HashSet<String> f215264y;

    /* renamed from: z */
    public C47996o f215265z;

    /* renamed from: com.tencent.mm.ui.chatting.ChatFooterCustom$c */
    public class C6770c implements View.OnClickListener {
        public C6770c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChatFooterCustom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChatFooterCustom.this.f215250h.mo102866a();
            ImageView imageView = (ImageView) view;
            if (imageView.getTag() != null) {
                imageView.setTag((Object) null);
                imageView.setImageResource(C0966R.C0969drawable.agy);
                int i = 0;
                while (true) {
                    ChatFooterCustom chatFooterCustom = ChatFooterCustom.this;
                    if (i >= chatFooterCustom.f215256q) {
                        break;
                    }
                    View childAt = chatFooterCustom.f215246d.getChildAt(i);
                    int i2 = i < 3 ? 0 : 8;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i2));
                    C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(childAt, "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i++;
                }
            } else {
                imageView.setTag(new Object());
                imageView.setImageResource(C0966R.C0969drawable.agz);
                int i3 = 0;
                while (true) {
                    ChatFooterCustom chatFooterCustom2 = ChatFooterCustom.this;
                    if (i3 >= chatFooterCustom2.f215256q) {
                        break;
                    }
                    View childAt2 = chatFooterCustom2.f215246d.getChildAt(i3);
                    int i4 = i3 >= 3 ? 0 : 8;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i4));
                    C117292a.m165358d(childAt2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(childAt2, "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i3++;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChatFooterCustom$d */
    public class C6771d implements AdapterView.OnItemClickListener {
        public C6771d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChatFooterCustom$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            ChatFooterCustom.this.onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChatFooterCustom$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChatFooterCustom$GetLocationListener */
    public class GetLocationListener extends IListener<PublishLocationEvent> {
        public GetLocationListener() {
            super(C40008f.f107254d);
            this.__eventId = 82634054;
        }

        public boolean callback(IEvent iEvent) {
            PublishLocationEvent publishLocationEvent = (PublishLocationEvent) iEvent;
            int i = publishLocationEvent.f193834d.f193836a;
            if (i == 0) {
                ChatFooterCustom.this.mo102050f(1005, publishLocationEvent);
                return false;
            } else if (i != 1) {
                return false;
            } else {
                ChatFooterCustom.this.mo102050f(1006, publishLocationEvent);
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChatFooterCustom$GetScanCodeListener */
    public class GetScanCodeListener extends IListener<PublishScanCodeResultEvent> {
        public GetScanCodeListener() {
            super(C40008f.f107254d);
            this.__eventId = 1233251508;
        }

        public boolean callback(IEvent iEvent) {
            PublishScanCodeResultEvent publishScanCodeResultEvent = (PublishScanCodeResultEvent) iEvent;
            int i = publishScanCodeResultEvent.f193844d.f193846a;
            if (i == 0) {
                ChatFooterCustom.this.mo102050f(1003, publishScanCodeResultEvent);
                return false;
            } else if (i != 1) {
                return false;
            } else {
                ChatFooterCustom.this.mo102050f(1004, publishScanCodeResultEvent);
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChatFooterCustom$a */
    public class C73266a implements C76879j.C11180n {
        public C73266a() {
        }

        /* renamed from: j */
        public void mo782j(int i) {
            if (i == 0) {
                ChatFooterCustom chatFooterCustom = ChatFooterCustom.this;
                int i2 = ChatFooterCustom.f215244B;
                chatFooterCustom.mo102059m();
            } else if (i == 1) {
                ChatFooterCustom chatFooterCustom2 = ChatFooterCustom.this;
                int i3 = ChatFooterCustom.f215244B;
                chatFooterCustom2.mo102058l();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ChatFooterCustom$b */
    public class C73267b implements View.OnClickListener {
        public C73267b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChatFooterCustom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChatFooterCustom chatFooterCustom = ChatFooterCustom.this;
            int i = ChatFooterCustom.f215244B;
            chatFooterCustom.getClass();
            Log.m105924i("ChatCustomFooter", "switch footer");
            if (chatFooterCustom.f215251i != null) {
                chatFooterCustom.f215250h.mo102866a();
                chatFooterCustom.f215251i.mo70088a(true);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChatFooterCustom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public ChatFooterCustom(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private String getSender() {
        Log.m105924i("ChatCustomFooter", "getSender " + true + " " + C75592q0.m90789s());
        return C75592q0.m90789s();
    }

    /* renamed from: C1 */
    public void mo23909C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo23910Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        Log.m105924i("ChatCustomFooter", "SysCmdMsgExtension:" + g);
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(new StringReader(g));
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 0 || eventType == 2) {
                    String name = newPullParser.getName();
                    if ("sysmsg".equals(name)) {
                        if ("type".equals(newPullParser.getAttributeName(0))) {
                            newPullParser.getAttributeValue(0);
                        }
                    } else if ("username".equals(name)) {
                        newPullParser.nextText();
                    } else if ("data".equals(name)) {
                        newPullParser.nextText();
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("ChatCustomFooter", e, "", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo102045a(C47996o oVar) {
        String str = "" + oVar.f128721a + oVar.f128724d;
        synchronized (this.f215245A) {
            ((LinkedList) this.f215263x).add(str);
        }
        Log.m105925i("ChatCustomFooter", "addToMenuClickCmdList %s %d", str, Integer.valueOf(((LinkedList) this.f215263x).size()));
    }

    /* renamed from: b */
    public void mo102046b() {
        C72996z1 z1Var = this.f215258s;
        if (z1Var != null && z1Var.f149511R0 == 1) {
            C30783v3 w = C97625j3.m125812b().mo105908w();
            String username = this.f215258s.getUsername();
            C44660i2 i2Var = (C44660i2) w;
            i2Var.getClass();
            if (username == null || username.length() <= 0) {
                Log.m105920e("MicroMsg.ConversationStorage", "setMoveUp conversation failed");
            } else {
                i2Var.mo69764f0(i2Var.mo69771j(username));
            }
        }
    }

    /* renamed from: c */
    public final void mo102047c(C47996o oVar) {
        Log.m105924i("ChatCustomFooter", oVar.mo72786b());
        C97625j3.m125815e().mo123460f(new C47988l0(this.f215257r, 1, oVar.mo72786b(), (LinkedList<C49618gw>) null, getContext() instanceof Activity ? ((Activity) getContext()).getIntent().getStringExtra("uinserve_search_click_id") : ""));
    }

    /* renamed from: d */
    public final boolean mo102048d(Object obj) {
        if (!(obj instanceof PublishLocationEvent)) {
            Log.m105920e("ChatCustomFooter", "send current location data type error!");
            return true;
        }
        PublishLocationEvent.C67758a aVar = ((PublishLocationEvent) obj).f193834d;
        double d = aVar.f193837b;
        double d2 = aVar.f193838c;
        int i = aVar.f193839d;
        String str = aVar.f193840e;
        String str2 = aVar.f193841f;
        Log.m105925i("ChatCustomFooter", "lat:%f , lng:%f , scale: %d , label:%s , poiname:%s", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i), str, str2);
        C47996o oVar = this.f215265z;
        if (oVar == null || oVar.f128729i != 105) {
            Log.m105920e("ChatCustomFooter", "cache lost or location type is not correct");
            return true;
        }
        oVar.f128728h = "menu_action_success";
        oVar.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", String.valueOf(d));
            jSONObject.put("y", String.valueOf(d2));
            jSONObject.put("scale", i);
            jSONObject.put("label", str);
            jSONObject.put("poiname", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FirebaseAnalytics.C113379b.LOCATION, jSONObject);
            String jSONObject3 = jSONObject2.toString();
            oVar.f128730j = jSONObject3;
            Log.m105926v("MicroMsg.BizMenuItem", jSONObject3);
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.BizMenuItem", e.toString());
        }
        if (mo102061o(this.f215265z)) {
            mo102047c(this.f215265z);
            mo102056j(this.f215265z);
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo102049e(Object obj) {
        int i;
        if (obj != null && (obj instanceof PublishScanCodeResultEvent)) {
            PublishScanCodeResultEvent.C67760a aVar = ((PublishScanCodeResultEvent) obj).f193844d;
            String str = aVar.f193847b;
            String str2 = aVar.f193848c;
            if (!C5177x.m5206c(str)) {
                str2 = str + "," + str2;
            }
            C47996o oVar = this.f215265z;
            if (oVar == null || !((i = oVar.f128729i) == 100 || i == 101)) {
                Log.m105920e("ChatCustomFooter", "null pointer in cache or type error");
            } else {
                Log.m105925i("ChatCustomFooter", "scan type: %s , scan result:%s", str, str2);
                C47996o oVar2 = this.f215265z;
                oVar2.f128728h = "menu_action_success";
                String str3 = C5177x.m5206c(str) ? "qrcode" : "barcode";
                oVar2.getClass();
                Log.m105927v("MicroMsg.BizMenuItem", "type is %s , result is %s", str3, str2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scan_type", str3);
                    jSONObject.put("scan_result", str2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scan_code", jSONObject);
                    String jSONObject3 = jSONObject2.toString();
                    oVar2.f128730j = jSONObject3;
                    Log.m105927v("MicroMsg.BizMenuItem", "content: %s", jSONObject3);
                } catch (JSONException e) {
                    Log.m105920e("MicroMsg.BizMenuItem", e.toString());
                }
                if (mo102061o(this.f215265z)) {
                    mo102047c(this.f215265z);
                    mo102056j(this.f215265z);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo102050f(int i, Object obj) {
        int i2;
        int i3;
        if (obj == null) {
            Log.m105920e("ChatCustomFooter", "returned data is null, maybe serve for UI");
            return true;
        }
        if (i == 201 || i == 203) {
            i = 1001;
        } else if (i == 217) {
            i = 1002;
        }
        switch (i) {
            case 1001:
                Log.m105924i("ChatCustomFooter", "return from camera");
                if (!(obj instanceof Intent)) {
                    Log.m105920e("ChatCustomFooter", "type error");
                    return true;
                }
                String stringExtra = ((Intent) obj).getStringExtra("CropImage_OutputPath");
                if (stringExtra == null) {
                    Log.m105920e("ChatCustomFooter", "return null path");
                    return true;
                }
                C86009m1 m1Var = new C86009m1(stringExtra);
                if (!m1Var.mo119967g() || !m1Var.mo119978p()) {
                    Log.m105921e("ChatCustomFooter", "%s cannot be retrieved as file or is directory!!", stringExtra);
                } else {
                    Log.m105925i("ChatCustomFooter", "%s retrieved!", stringExtra);
                    String q = C86013q1.m106456q(m1Var.mo119976n());
                    Log.m105925i("ChatCustomFooter", "MD5 is %s", q);
                    C47996o oVar = this.f215265z;
                    if (oVar == null || !((i2 = oVar.f128729i) == 102 || i2 == 103)) {
                        Log.m105920e("ChatCustomFooter", "camera photo cache lost or temp type error! cannot pass info!");
                        return true;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(q);
                    C47996o oVar2 = this.f215265z;
                    oVar2.f128728h = "menu_action_success";
                    oVar2.mo72785a(arrayList);
                    if (mo102061o(this.f215265z)) {
                        mo102047c(this.f215265z);
                        mo102056j(this.f215265z);
                    }
                }
                return true;
            case 1002:
                Log.m105924i("ChatCustomFooter", "return from albumn");
                if (!(obj instanceof Intent)) {
                    Log.m105920e("ChatCustomFooter", "type error");
                    return true;
                }
                ArrayList<String> stringArrayListExtra = ((Intent) obj).getStringArrayListExtra("CropImage_OutputPath_List");
                ArrayList arrayList2 = new ArrayList();
                if (!(stringArrayListExtra == null || stringArrayListExtra.size() == 0)) {
                    Iterator<String> it = stringArrayListExtra.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        Log.m105925i("ChatCustomFooter", "retrieving bitmap path %s", next);
                        if (next != null) {
                            C86009m1 m1Var2 = new C86009m1(next);
                            if (!m1Var2.mo119967g() || !m1Var2.mo119978p()) {
                                Log.m105921e("ChatCustomFooter", "%s cannot be retrieved as file or is directory!!", next);
                            } else {
                                Log.m105925i("ChatCustomFooter", "%s retrieved!", next);
                                String q2 = C86013q1.m106456q(m1Var2.mo119976n());
                                arrayList2.add(q2);
                                Log.m105925i("ChatCustomFooter", "MD5 is %s", q2);
                            }
                        } else {
                            Log.m105920e("ChatCustomFooter", "no file contained!");
                        }
                    }
                    C47996o oVar3 = this.f215265z;
                    if (oVar3 == null || !((i3 = oVar3.f128729i) == 104 || i3 == 103 || i3 == 102)) {
                        Log.m105920e("ChatCustomFooter", "albumn photo cache lost or temp type error! cannot pass info!");
                    } else {
                        oVar3.f128728h = "menu_action_success";
                        oVar3.mo72785a(arrayList2);
                        if (mo102061o(this.f215265z)) {
                            mo102047c(this.f215265z);
                            mo102056j(this.f215265z);
                        }
                    }
                }
                return true;
            case 1003:
                Log.m105924i("ChatCustomFooter", "send qrcode wait msg");
                if (!mo102049e(obj)) {
                    return true;
                }
                ((BizComponent.C44791a) this.f215252j).mo70081a();
                return true;
            case 1004:
                Log.m105924i("ChatCustomFooter", "send qrcode direct");
                mo102049e(obj);
                return true;
            case 1005:
                Log.m105924i("ChatCustomFooter", "send current");
                mo102048d(obj);
                return true;
            case 1006:
                Log.m105924i("ChatCustomFooter", "send selected");
                mo102048d(obj);
                return true;
            default:
                return true;
        }
    }

    /* renamed from: g */
    public void mo102051g(ViewGroup viewGroup) {
        this.f215246d = (LinearLayout) findViewById(C0966R.C0970id.b57);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.b5b);
        this.f215249g = linearLayout;
        linearLayout.setVisibility(0);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.b5a);
        this.f215248f = imageView;
        imageView.setVisibility(0);
        this.f215248f.setOnClickListener(new C73267b());
        ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.b56);
        this.f215247e = imageView2;
        imageView2.setOnClickListener(new C6770c());
        C73832q0 q0Var = new C73832q0(getContext(), viewGroup);
        this.f215250h = q0Var;
        q0Var.f216649d = new C6771d();
    }

    public C72996z1 getTalker() {
        return this.f215258s;
    }

    public String getTalkerUserName() {
        C72996z1 z1Var = this.f215258s;
        if (z1Var == null) {
            return null;
        }
        return z1Var.getUsername();
    }

    /* renamed from: h */
    public final void mo102054h(C47996o oVar) {
        Class cls = C0405n.class;
        String str = oVar.f128725e;
        C72996z1 z1Var = this.f215258s;
        String username = z1Var != null ? z1Var.getUsername() : "";
        Log.m105925i("ChatCustomFooter", "bizMenu jumpToSearch username: %s, suggestData: %s", username, str);
        Intent O20 = ((C0405n) C86312j.m106911c(cls)).O20();
        O20.putExtra("ftsneedkeyboard", true);
        O20.putExtra("ftsbizscene", 75);
        O20.putExtra("ftsType", 2);
        Map<String, String> hn = ((C0405n) C86312j.m106911c(cls)).mo280hn(75, false, 2);
        hn.put("userName", username);
        if (!C77702q0.m93719b(str)) {
            hn.put("thirdExtParam", str);
        }
        O20.putExtra("rawUrl", C101987v0.m134270d(hn, 0));
        O20.putExtra("key_load_js_without_delay", true);
        O20.putExtra("ftsbizusername", username);
        O20.addFlags(67108864);
        C88144b.m109806x(getContext(), O20, (Bundle) null);
    }

    /* renamed from: i */
    public final void mo102055i(C47996o oVar, String str) {
        String str2 = this.f215257r;
        mo102063p(str2, oVar.f128721a + "", oVar.f128724d, "menu_click", 0, 0, 0, oVar.f128723c, "", str);
    }

    /* renamed from: j */
    public final void mo102056j(C47996o oVar) {
        String str = this.f215257r;
        mo102063p(str, oVar.f128721a + "", oVar.f128724d, "menu_action_success", 0, 0, 0, oVar.f128723c, "", oVar.f128725e);
    }

    /* renamed from: k */
    public void mo102057k(MMFragment mMFragment, C52558c cVar, String str) {
        String str2;
        C52558c.C52560b.C52563c cVar2;
        int i;
        int i2;
        C52558c cVar3 = cVar;
        String str3 = str;
        C52558c.C52560b.C52563c c = cVar3.mo73500r2(false).mo73510c();
        Class cls = C109759g.class;
        if (c == null || c.f146826b == null || str3 == null) {
            throw new IllegalArgumentException(" menuInfo or username is null ! ");
        }
        String str4 = "gh_3dfda90e39d6";
        int i3 = 1;
        this.f215253n = Boolean.valueOf(str3.equals("gh_f0a92aa7146c") || str3.equals(str4));
        int i4 = 6;
        this.f215256q = Math.min(c.f146826b.size(), 6);
        Log.m105924i("ChatCustomFooter", "setMenus, count:" + this.f215256q);
        int i5 = this.f215256q;
        if (i5 >= 1) {
            int i6 = 3;
            int i7 = 8;
            if (i5 > 3) {
                this.f215247e.setVisibility(0);
            } else {
                this.f215247e.setVisibility(8);
            }
            this.f215246d.setWeightSum((float) Math.min(this.f215256q, 3));
            int i8 = 0;
            while (i8 < i4) {
                FrameLayout frameLayout = (FrameLayout) this.f215246d.getChildAt(i8);
                TextView textView = (TextView) frameLayout.findViewById(C0966R.C0970id.b59);
                textView.setTextSize(i3, Math.min(1.125f, C76577a.m92165p(getContext())) * 17.0f);
                ImageView imageView = (ImageView) frameLayout.findViewById(C0966R.C0970id.b58);
                imageView.setVisibility(i7);
                int i9 = this.f215256q;
                if (i8 < i9) {
                    C47996o oVar = c.f146826b.get(i8);
                    frameLayout.setTag(oVar);
                    textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), oVar.f128723c));
                    if (oVar.f128722b == 0) {
                        int textSize = (((int) textView.getTextSize()) * 2) / i6;
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        layoutParams.height = textSize;
                        layoutParams.width = textSize;
                        imageView.setLayoutParams(layoutParams);
                        imageView.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.biz_menu_show_sub_menu_icon, getContext().getResources().getColor(C0966R.color.FG_2)));
                        i = 0;
                        imageView.setVisibility(0);
                    } else {
                        i = 0;
                    }
                    frameLayout.setOnClickListener(this);
                    frameLayout.setVisibility(i);
                    if (str3.equals(str4) && !C77702q0.m93719b(oVar.f128724d) && !C77702q0.m93719b(oVar.f128723c) && !this.f215264y.contains(oVar.f128723c)) {
                        this.f215264y.add(oVar.f128723c);
                        Pair<C115631n, tg4> c2 = ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175764c(new C117343c(oVar.f128724d));
                        C115669n.INSTANCE.mo160131h(27779, 2, oVar.f128723c, Integer.valueOf((c2.first != C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT || c2.second == null) ? 0 : 1), 0);
                    }
                    if (this.f215253n.booleanValue()) {
                        Log.m105924i("ChatCustomFooter", "needShowRedDot：register RedDotComponent");
                        String str5 = "registerRedDotComponentForMenu key：%s，name：%s";
                        Log.m105925i("ChatCustomFooter", str5, oVar.f128724d, oVar.f128723c);
                        String str6 = "this key has register";
                        if (((ConcurrentHashMap) this.f215254o).containsKey(oVar.f128724d)) {
                            Log.m105918d("ChatCustomFooter", str6);
                            cVar2 = c;
                            i2 = 1;
                        } else {
                            cVar2 = c;
                            C73850t4 t4Var = new C73850t4(getContext(), oVar.f128724d, new C73767o0(this, textView, oVar));
                            ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175770k(t4Var);
                            ((ConcurrentHashMap) this.f215254o).put(oVar.f128724d, t4Var);
                            ((ArrayList) this.f215255p).add(t4Var);
                            i2 = 1;
                            Log.m105919d("ChatCustomFooter", "mRedDotCompoentList：%s,mRedDotCompoents:%s", Integer.valueOf(((ConcurrentHashMap) this.f215254o).size()), Integer.valueOf(((ArrayList) this.f215255p).size()));
                        }
                        C73832q0 q0Var = this.f215250h;
                        q0Var.getClass();
                        Object[] objArr = new Object[i2];
                        objArr[0] = Integer.valueOf(oVar.f128727g.size());
                        Log.m105919d("MicroMsg.ChatFooterCustomSubmenu", "registerRedDotComponentForSubMenu subMeubConut：%s", objArr);
                        q0Var.f216650e = Boolean.TRUE;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= oVar.f128727g.size()) {
                                str2 = str4;
                                break;
                            }
                            C47996o oVar2 = oVar.f128727g.get(i15);
                            str2 = str4;
                            Log.m105919d("MicroMsg.ChatFooterCustomSubmenu", str5, oVar2.f128724d, oVar2.f128723c);
                            if (((ConcurrentHashMap) q0Var.f216653h).containsKey(oVar2.f128724d)) {
                                Log.m105918d("MicroMsg.ChatFooterCustomSubmenu", str6);
                                break;
                            }
                            C73850t4 t4Var2 = new C73850t4(q0Var.f216655j, oVar2.f128724d, new C73772p0(q0Var));
                            ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175770k(t4Var2);
                            ((ConcurrentHashMap) q0Var.f216653h).put(oVar2.f128724d, t4Var2);
                            ((ArrayList) q0Var.f216654i).add(t4Var2);
                            Log.m105919d("MicroMsg.ChatFooterCustomSubmenu", " Register key ：%s", oVar2.f128724d);
                            i15++;
                            str4 = str2;
                            str5 = str5;
                            str6 = str6;
                        }
                        Log.m105919d("MicroMsg.ChatFooterCustomSubmenu", "mRedDotCompoentList：%s,mRedDotCompoents:%s", Integer.valueOf(((ConcurrentHashMap) q0Var.f216653h).size()), Integer.valueOf(((ArrayList) q0Var.f216654i).size()));
                    } else {
                        cVar2 = c;
                        str2 = str4;
                    }
                } else {
                    cVar2 = c;
                    str2 = str4;
                    if (i8 < 3 || i9 <= 3) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setTag((Object) null);
                        textView.setText("");
                        imageView.setVisibility(8);
                        frameLayout.setOnClickListener((View.OnClickListener) null);
                        frameLayout.setVisibility(0);
                    }
                }
                i8++;
                c = cVar2;
                str4 = str2;
                i3 = 1;
                i4 = 6;
                i6 = 3;
                i7 = 8;
            }
            this.f215262w = mMFragment;
            this.f215257r = str3;
            this.f215259t = cVar3;
            GetLocationListener getLocationListener = this.f215260u;
            if (getLocationListener != null) {
                getLocationListener.dead();
            }
            GetScanCodeListener getScanCodeListener = this.f215261v;
            if (getScanCodeListener != null) {
                getScanCodeListener.dead();
            }
            this.f215260u = new GetLocationListener();
            this.f215261v = new GetScanCodeListener();
            this.f215260u.alive();
            this.f215261v.alive();
            return;
        }
        throw new IllegalArgumentException(" mTabCount is invalid ! ");
    }

    /* renamed from: l */
    public final void mo102058l() {
        if (this.f215262w != null && this.f215258s != null && !C77702q0.m93719b(this.f215257r)) {
            ((C7138g) C86312j.m106911c(C7138g.class)).mo8325q7(this.f215262w, 217, 9, 3, this.f215257r, this.f215258s.getUsername());
        }
    }

    /* renamed from: m */
    public final void mo102059m() {
        Uri n = C116299g2.m163858n(C112760b.m154240l());
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                z = l2.f348991a.mo119937g(l2.f348992b);
            }
            if (!z) {
                Toast.makeText((Activity) getContext(), getContext().getString(C0966R.string.f360273bc2), 1).show();
                return;
            }
        }
        if (this.f215262w != null) {
            MMFragment mMFragment = this.f215262w;
            String l3 = C112760b.m154240l();
            if (!((C7138g) C86312j.m106911c(C7138g.class)).hh0(mMFragment, l3, "microMsg." + System.currentTimeMillis() + ".jpg", 201)) {
                Toast.makeText((Activity) getContext(), getContext().getString(C0966R.string.ik5), 1).show();
            }
        }
    }

    /* renamed from: n */
    public final void mo102060n() {
        Class cls = C109759g.class;
        Log.m105924i("ChatCustomFooter", " releaseRedDotResource()");
        C73832q0 q0Var = this.f215250h;
        if (q0Var != null) {
            q0Var.getClass();
            Log.m105924i("MicroMsg.ChatFooterCustomSubmenu", "releaseRedDotResource()");
            q0Var.f216651f = "";
            q0Var.f216652g = false;
            Map<String, C73850t4> map = q0Var.f216653h;
            if (map != null && ((ConcurrentHashMap) map).size() > 0) {
                ((ConcurrentHashMap) q0Var.f216653h).clear();
            }
            List<C73850t4> list = q0Var.f216654i;
            if (list != null && ((ArrayList) list).size() > 0) {
                Iterator it = ((ArrayList) q0Var.f216654i).iterator();
                while (it.hasNext()) {
                    ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175776r((C73850t4) it.next());
                }
                ((ArrayList) q0Var.f216654i).clear();
            }
        }
        Map<String, C73850t4> map2 = this.f215254o;
        if (map2 != null && ((ConcurrentHashMap) map2).size() > 0) {
            ((ConcurrentHashMap) this.f215254o).clear();
        }
        List<C73850t4> list2 = this.f215255p;
        if (list2 != null && ((ArrayList) list2).size() > 0) {
            Iterator it4 = ((ArrayList) this.f215255p).iterator();
            while (it4.hasNext()) {
                ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175776r((C73850t4) it4.next());
            }
            ((ArrayList) this.f215255p).clear();
        }
    }

    /* renamed from: o */
    public boolean mo102061o(C47996o oVar) {
        if (oVar == null) {
            return false;
        }
        String str = "" + oVar.f128721a + oVar.f128724d;
        synchronized (this.f215245A) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= ((LinkedList) this.f215263x).size()) {
                    break;
                } else if (((String) ((LinkedList) this.f215263x).get(i2)).equals(str)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i >= 0) {
                ((LinkedList) this.f215263x).remove(i);
                Log.m105921e("ChatCustomFooter", "removeOneFromMenuClickCmdList success %s %d", str, Integer.valueOf(((LinkedList) this.f215263x).size()));
                return true;
            }
            Log.m105921e("ChatCustomFooter", "removeOneFromMenuClickCmdList fail %s %d", str, Integer.valueOf(((LinkedList) this.f215263x).size()));
            return false;
        }
    }

    public synchronized void onClick(View view) {
        View view2 = view;
        Class cls = C109759g.class;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChatFooterCustom", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object tag = view.getTag();
            if (!(tag instanceof C47996o)) {
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChatFooterCustom", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87716k.f253994a = 8;
            C47996o oVar = (C47996o) tag;
            boolean z = true;
            if (!C77702q0.m93719b(this.f215257r) && this.f215257r.equals("gh_3dfda90e39d6") && !C77702q0.m93719b(oVar.f128724d) && !C77702q0.m93719b(oVar.f128723c)) {
                Pair<C115631n, tg4> c = ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175764c(new C117343c(oVar.f128724d));
                boolean z2 = c.first == C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT && c.second != null;
                C47299e V40 = ((C109759g) C86312j.m106911c(cls)).V40();
                String str = oVar.f128724d;
                C115627l lVar = (C115627l) V40;
                lVar.getClass();
                lVar.mo175763b(new C117343c(str));
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[4];
                objArr[0] = 2;
                objArr[1] = oVar.f128723c;
                objArr[2] = Integer.valueOf(z2 ? 1 : 0);
                objArr[3] = 1;
                nVar.mo160131h(27779, objArr);
            } else if (this.f215253n.booleanValue()) {
                C47299e V402 = ((C109759g) C86312j.m106911c(cls)).V40();
                String str2 = oVar.f128724d;
                C115627l lVar2 = (C115627l) V402;
                lVar2.getClass();
                lVar2.mo175763b(new C117343c(str2));
                C115669n.INSTANCE.mo160131h(19541, 2, oVar.f128724d);
            }
            oVar.f128730j = "";
            String str3 = null;
            switch (oVar.f128722b) {
                case 0:
                    int[] iArr = new int[2];
                    view2.getLocationInWindow(iArr);
                    Log.m105925i("ChatCustomFooter", "show/dismiss submenu, pos:(%d, %d), view width:%d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(view.getWidth()));
                    C73832q0 q0Var = this.f215250h;
                    int width = iArr[0] + (view.getWidth() / 2);
                    int i = iArr[1];
                    MMListPopupWindow mMListPopupWindow = q0Var.f216659q;
                    if (mMListPopupWindow == null || !mMListPopupWindow.f214823g.isShowing()) {
                        z = false;
                    }
                    if (z) {
                        q0Var.mo102866a();
                        C47996o oVar2 = q0Var.f216662t;
                        if (oVar2.f128721a != oVar.f128721a || !oVar2.f128724d.equals(oVar.f128724d)) {
                            q0Var.mo102867b(oVar, width, i, false);
                            break;
                        }
                    } else {
                        q0Var.mo102867b(oVar, width, i, false);
                        break;
                    }
                    break;
                case 1:
                    Log.m105924i("ChatCustomFooter", "get latest message");
                    mo102046b();
                    this.f215250h.mo102866a();
                    oVar.f128728h = "menu_click";
                    mo102055i(oVar, oVar.f128725e);
                    mo102047c(oVar);
                    ((BizComponent.C44791a) this.f215252j).mo70081a();
                    if (C72996z1.m85805J5(getTalkerUserName()) && WeChatSomeFeatureSwitch.hardcodeWeChatUSTeam() && oVar.f128724d.equalsIgnoreCase("rselfmenu_2") && oVar.f128725e.contains("weixin://dl/")) {
                        C90945m.m114062l(getContext(), oVar.f128725e);
                        break;
                    }
                case 2:
                    Log.m105924i("ChatCustomFooter", "start webview url");
                    mo102046b();
                    this.f215250h.mo102866a();
                    oVar.f128728h = "menu_click";
                    mo102055i(oVar, oVar.f128726f);
                    mo102047c(oVar);
                    if (!((C40030e) C15134f0.C15135a.m14248a()).mo62720d(getContext(), oVar.f128725e, new Object[0]) && !C73750m0.m87347a(oVar.f128726f, getContext(), this.f215262w, this.f215257r)) {
                        Intent intent = new Intent();
                        intent.putExtra("KPublisherId", "custom_menu");
                        intent.putExtra("pre_username", this.f215257r);
                        intent.putExtra("prePublishId", "custom_menu");
                        intent.putExtra("preUsername", this.f215257r);
                        intent.putExtra("preChatName", this.f215257r);
                        String str4 = this.f215257r;
                        intent.putExtra("preChatTYPE", C45629t0.m50815b(str4, str4));
                        intent.putExtra("rawUrl", oVar.f128725e);
                        intent.putExtra("geta8key_username", this.f215257r);
                        intent.putExtra("from_scence", 1);
                        intent.putExtra("key_enable_teen_mode_check", true);
                        C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                        break;
                    }
                case 3:
                    Log.m105924i("ChatCustomFooter", "switch to input");
                    this.f215250h.mo102866a();
                    Log.m105924i("ChatCustomFooter", "switch footer");
                    if (this.f215251i != null) {
                        this.f215250h.mo102866a();
                        this.f215251i.mo70088a(true);
                    }
                    oVar.f128728h = "menu_click";
                    mo102055i(oVar, oVar.f128725e);
                    mo102047c(oVar);
                    break;
                case 4:
                    Log.m105924i("ChatCustomFooter", "MM_BIZ_CUSTOM_MENU_TYPE_CUSTOM_CLICK");
                    mo102046b();
                    this.f215250h.mo102866a();
                    oVar.f128728h = "menu_action_start";
                    mo102045a(oVar);
                    String str5 = this.f215257r;
                    mo102063p(str5, oVar.f128721a + "", oVar.f128724d, "menu_action_start", 0, 0, 0, oVar.f128723c, "", oVar.f128725e);
                    this.f215265z = oVar;
                    switch (oVar.f128729i) {
                        case 100:
                            Intent intent2 = new Intent();
                            intent2.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
                            intent2.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
                            intent2.putExtra("key_set_result_after_scan", true);
                            intent2.putExtra("key_is_hide_right_btn", true);
                            intent2.putExtra("key_scan_report_enter_scene", 2);
                            if (!C61104a.m71651g(getContext()) && !C61104a.m71667w(getContext()) && !C61104a.m71647c(getContext(), true)) {
                                C88144b.m109791i(getContext(), "scanner", ".ui.BaseScanUI", intent2, (Bundle) null);
                                break;
                            }
                        case 101:
                            Intent intent3 = new Intent();
                            intent3.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
                            intent3.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
                            intent3.putExtra("key_set_result_after_scan", false);
                            intent3.putExtra("key_is_hide_right_btn", true);
                            intent3.putExtra("key_scan_report_enter_scene", 2);
                            if (!C61104a.m71651g(getContext()) && !C61104a.m71667w(getContext()) && !C61104a.m71647c(getContext(), true)) {
                                C88144b.m109791i(getContext(), "scanner", ".ui.BaseScanUI", intent3, (Bundle) null);
                                break;
                            }
                        case 102:
                            mo102059m();
                            break;
                        case 103:
                            mo102065r();
                            break;
                        case 104:
                            mo102058l();
                            break;
                        case 105:
                            mo102064q(true);
                            break;
                        case 106:
                            ExDeviceOpInChattingUIEvent exDeviceOpInChattingUIEvent = new ExDeviceOpInChattingUIEvent();
                            ExDeviceOpInChattingUIEvent.C40076a aVar = exDeviceOpInChattingUIEvent.f107475d;
                            aVar.f107476a = 1;
                            aVar.f107477b = this.f215258s.getUsername();
                            exDeviceOpInChattingUIEvent.f107475d.f107478c = getContext();
                            exDeviceOpInChattingUIEvent.publish();
                            break;
                        case 107:
                            ExDeviceOpInChattingUIEvent exDeviceOpInChattingUIEvent2 = new ExDeviceOpInChattingUIEvent();
                            ExDeviceOpInChattingUIEvent.C40076a aVar2 = exDeviceOpInChattingUIEvent2.f107475d;
                            aVar2.f107476a = 2;
                            aVar2.f107477b = this.f215258s.getUsername();
                            exDeviceOpInChattingUIEvent2.f107475d.f107478c = getContext();
                            exDeviceOpInChattingUIEvent2.publish();
                            break;
                    }
                    break;
                case 5:
                    mo102046b();
                    this.f215250h.mo102866a();
                    oVar.f128728h = "menu_click";
                    mo102055i(oVar, oVar.f128725e);
                    mo102047c(oVar);
                    if (!TextUtils.isEmpty(oVar.f128725e)) {
                        try {
                            JSONObject jSONObject = new JSONObject(oVar.f128725e);
                            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                            appBrandStatObject.f245533f = 1035;
                            int length = !C77702q0.m93719b(oVar.f128724d) ? oVar.f128724d.length() - oVar.f128724d.replace("_", "").length() : 0;
                            Object[] objArr2 = new Object[5];
                            objArr2[0] = this.f215257r;
                            objArr2[1] = Integer.valueOf(length);
                            objArr2[2] = oVar.f128723c;
                            objArr2[3] = jSONObject.optString("pagePath");
                            C52558c cVar = this.f215259t;
                            objArr2[4] = cVar == null ? "" : cVar.field_appId;
                            String format = String.format("%s:%s:%s:%s:%s", objArr2);
                            appBrandStatObject.f245534g = format;
                            Log.m105919d("ChatCustomFooter", "sceneNote = %s", format);
                            C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
                            Context context = getContext();
                            String optString = jSONObject.optString("userName");
                            String optString2 = jSONObject.optString("pagePath");
                            C52558c cVar2 = this.f215259t;
                            if (cVar2 != null) {
                                str3 = cVar2.field_appId;
                            }
                            x0Var.Rg0(context, optString, (String) null, 0, 0, optString2, appBrandStatObject, str3);
                            break;
                        } catch (JSONException e) {
                            Log.m105920e("ChatCustomFooter", e.getMessage());
                            break;
                        }
                    }
                    break;
                case 6:
                    Log.m105924i("ChatCustomFooter", "jump to search");
                    mo102046b();
                    this.f215250h.mo102866a();
                    oVar.f128728h = "menu_click";
                    mo102055i(oVar, oVar.f128725e);
                    mo102047c(oVar);
                    mo102054h(oVar);
                    break;
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChatFooterCustom", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: p */
    public void mo102063p(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5, String str6, String str7) {
        Log.m105919d("ChatCustomFooter", "brandUsername:%s, menuId:%s, menuKey:%s, status:%s, content:%s, actionType:%d, nativescene:%d, titleInfo:%s, indexInfo:%s, actionInfo:%s", str, str2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str5, str6, str7);
        C115669n.INSTANCE.mo160131h(10809, str, str2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str5, str6, str7);
    }

    /* renamed from: q */
    public final void mo102064q(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("map_view_type", 0);
        intent.putExtra("map_indoor_support", 1);
        intent.putExtra("map_sender_name", getSender());
        intent.putExtra("map_talker_name", getTalkerUserName());
        if (!z) {
            intent.putExtra("view_type_key", 0);
            intent.putExtra("key_get_location_type", 0);
        } else {
            intent.putExtra("view_type_key", 1);
            intent.putExtra("key_get_location_type", 1);
        }
        C88144b.m109791i(getContext(), FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, (Bundle) null);
    }

    /* renamed from: r */
    public final void mo102065r() {
        if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92772k(getContext());
            return;
        }
        C76879j.m92736g(getContext(), (String) null, new String[]{getContext().getString(C0966R.string.b7g), getContext().getString(C0966R.string.b7f)}, (String) null, new C73266a());
    }

    public void setOnFooterSwitchListener(ChatFooter$$n1 chatFooter$$n1) {
        this.f215251i = chatFooter$$n1;
    }

    public void setOnProcessClickListener(BizComponent.C44804m mVar) {
        this.f215252j = mVar;
    }

    public void setTalker(C72996z1 z1Var) {
        this.f215258s = z1Var;
    }

    public ChatFooterCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f215246d = null;
        this.f215247e = null;
        this.f215248f = null;
        this.f215249g = null;
        this.f215250h = null;
        this.f215251i = null;
        this.f215252j = null;
        this.f215253n = Boolean.FALSE;
        this.f215254o = new ConcurrentHashMap();
        this.f215255p = new ArrayList();
        this.f215256q = 0;
        this.f215263x = new LinkedList();
        this.f215264y = new HashSet<>();
        this.f215245A = new Object();
    }
}
