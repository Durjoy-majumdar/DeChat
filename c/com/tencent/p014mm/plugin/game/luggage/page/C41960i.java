package com.tencent.p014mm.plugin.game.luggage.page;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.game.luggage.page.C41954g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import ex0.C45696d;
import f40.C86709a0;
import j20.C117292a;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.i */
public class C41960i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C41954g f113030d;

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.i$a */
    public class C41961a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f113031d;

        public C41961a(String str) {
            this.f113031d = str;
        }

        public void onClick(View view) {
            Class cls = C45696d.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/luggage/page/GameWebActionBar$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String q4 = ((C45696d) C86709a0.m107533q(cls)).mo71011q4(C41960i.this.f113030d.f113020R);
            Bundle bundle = new Bundle();
            bundle.putString("userName", C41960i.this.f113030d.f113020R);
            bundle.putString("exportId", q4);
            bundle.putString("byPass", C41960i.this.f113030d.f113024V);
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, bundle, C41954g.C41959d.class, (C1256g) null);
            int gg02 = ((C45696d) C86709a0.m107533q(cls)).gg0(C41960i.this.f113030d.f113020R);
            C115669n.INSTANCE.mo160131h(23044, 2, C41960i.this.f113030d.f113020R, 0, 0, q4, Integer.valueOf(gg02), 2, this.f113031d, Integer.valueOf(C41960i.this.f113030d.f113022T));
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/luggage/page/GameWebActionBar$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C41960i(C41954g gVar) {
        this.f113030d = gVar;
    }

    public void run() {
        Class cls = C45696d.class;
        String q4 = ((C45696d) C86709a0.m107533q(cls)).mo71011q4(this.f113030d.f113020R);
        if (!Util.isNullOrNil(q4)) {
            String str = this.f113030d.f113020R;
            if ((Util.isNullOrNil(str) || !((C45696d) C86709a0.m107533q(cls)).ou0()) ? false : ((C45696d) C86709a0.m107533q(cls)).mo71015wL(str)) {
                this.f113030d.f117998n.setVisibility(8);
                if (this.f113030d.f113017N.getParent() == null) {
                    int gg02 = ((C45696d) C86709a0.m107533q(cls)).gg0(this.f113030d.f113020R);
                    C41954g gVar = this.f113030d;
                    String str2 = gVar.f113023U;
                    String str3 = gVar.f113021S;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", str2);
                        jSONObject.put("reportStr", str3);
                    } catch (JSONException unused) {
                    }
                    String encode = URLEncoder.encode(jSONObject.toString());
                    C115669n.INSTANCE.mo160131h(23044, 1, this.f113030d.f113020R, 0, 0, q4, Integer.valueOf(gg02), 2, encode, Integer.valueOf(this.f113030d.f113022T));
                    C41954g gVar2 = this.f113030d;
                    gVar2.f117994g.addView(gVar2.f113017N);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f113030d.f113017N.getLayoutParams();
                    layoutParams.addRule(13);
                    this.f113030d.f113017N.setLayoutParams(layoutParams);
                    C41954g gVar3 = this.f113030d;
                    gVar3.f113019Q.setText(gVar3.getContext().getString(C0966R.string.aok));
                    this.f113030d.f113018P.setBackgroundResource(C0966R.C0969drawable.b2r);
                    this.f113030d.f113019Q.setTextSize(1, 13.0f);
                    C85875k4.m106193l0(this.f113030d.f113019Q.getPaint());
                    this.f113030d.f113017N.setOnClickListener(new C41961a(encode));
                    return;
                }
                return;
            }
        }
        if (this.f113030d.f113017N.getParent() != null) {
            ((ViewGroup) this.f113030d.f113017N.getParent()).removeView(this.f113030d.f113017N);
        }
        this.f113030d.f117998n.setVisibility(0);
    }
}
