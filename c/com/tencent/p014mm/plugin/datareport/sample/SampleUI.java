package com.tencent.p014mm.plugin.datareport.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import l31.C61212e;
import l31.C61213g;
import m31.C117520a;
import n31.C61612b;
import o31.C11345b;
import o31.C76986a;
import q31.C118148a;
import u24.C90599h;
import vo3.C90852c;

@C117520a(bizGroupId = C76986a.Finder, pageId = C11345b.SampleUI, policy = 40, routeRule = 24184)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.datareport.sample.SampleUI */
public class SampleUI extends MMActivity implements View.OnClickListener {

    /* renamed from: d */
    public LinearLayout f158287d;

    /* renamed from: e */
    public Button f158288e;

    /* renamed from: f */
    public Button f158289f;

    /* renamed from: g */
    public Button f158290g;

    /* renamed from: h */
    public Button f158291h;

    /* renamed from: i */
    public Button f158292i;

    /* renamed from: j */
    public Button f158293j;

    /* renamed from: com.tencent.mm.plugin.datareport.sample.SampleUI$a */
    public class C55599a implements C61612b {
        public C55599a(SampleUI sampleUI) {
        }

        /* renamed from: a */
        public void mo77120a(long j, String str, Map<String, Object> map) {
            Log.m105920e("", "");
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.SampleUI$b */
    public class C55600b implements MenuItem.OnMenuItemClickListener {
        public C55600b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SampleUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.SampleUI$c */
    public class C55601c implements C61213g.C61215b {
        public C55601c(SampleUI sampleUI) {
        }

        /* renamed from: J */
        public void mo77122J(View view, int i) {
        }

        /* renamed from: l */
        public void mo77123l(View view, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.SampleUI$d */
    public class C55602d implements C118148a {
        public C55602d(SampleUI sampleUI) {
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            HashMap hashMap = new HashMap();
            if (C90599h.m113509b(str, "page_in")) {
                hashMap.put("sampleui_dynamicparams", "页面动态参数");
            }
            return hashMap;
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.SampleUI$e */
    public class C55603e implements C118148a {
        public C55603e(SampleUI sampleUI) {
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            HashMap hashMap = new HashMap();
            if (C90599h.m113509b(str, "page_in")) {
                hashMap.put("sampleui_dynamicparams", "页面动态参数");
            }
            return hashMap;
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.SampleUI$f */
    public class C55604f implements C118148a {
        public C55604f(SampleUI sampleUI) {
        }

        /* renamed from: a */
        public boolean mo36a(Object obj, String str, int i) {
            return (obj instanceof View) && C90599h.m113509b(str, "view_clk") && i == 24184;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            HashMap hashMap = new HashMap();
            if (C90599h.m113509b(str, "dr_click1")) {
                hashMap.put("btn1_dynamicparams", "控件动态参数");
            }
            return hashMap;
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.SampleUI$g */
    public class C55605g implements C118148a {
        public C55605g(SampleUI sampleUI) {
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            HashMap hashMap = new HashMap();
            if (C90599h.m113509b(str, "btn2_click")) {
                hashMap.put("btn2_dynamicparams", "控件动态参数");
            }
            return hashMap;
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.SampleUI$h */
    public class C55606h implements C118148a {
        public C55606h(SampleUI sampleUI) {
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            HashMap hashMap = new HashMap();
            if (C90599h.m113509b(str, "btn3_click")) {
                hashMap.put("btn3_dynamicparams", "控件动态参数");
            }
            return hashMap;
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.SampleUI$i */
    public class C55607i implements C118148a {
        public C55607i(SampleUI sampleUI) {
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            HashMap hashMap = new HashMap();
            if (C90599h.m113509b(str, "btn4_click")) {
                hashMap.put("btn4_dynamicparams", "控件动态参数");
            }
            return hashMap;
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.SampleUI$j */
    public class C55608j implements C118148a {
        public C55608j(SampleUI sampleUI) {
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public Map<String, Object> mo37b(String str) {
            HashMap hashMap = new HashMap();
            if (C90599h.m113509b(str, "btn5_click")) {
                hashMap.put("btn5_dynamicparams", "控件动态参数");
            }
            return hashMap;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cw_;
    }

    public void onClick(View view) {
        Class<ScrollSampleUI> cls = ScrollSampleUI.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/datareport/sample/SampleUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == this.f158288e) {
            HashMap hashMap = new HashMap();
            hashMap.put("visible_item", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("dr_click1", view, hashMap, 24184);
        } else if (view == this.f158289f) {
            Intent intent = new Intent();
            intent.setClass(this, KotlinSampleUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/datareport/sample/SampleUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/datareport/sample/SampleUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (view == this.f158290g) {
            Intent intent2 = new Intent();
            intent2.setClass(this, cls);
            intent2.putExtra("type", 1);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/datareport/sample/SampleUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/datareport/sample/SampleUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (view == this.f158291h) {
            Intent intent3 = new Intent();
            intent3.setClass(this, cls);
            intent3.putExtra("type", 2);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent3);
            C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/datareport/sample/SampleUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/datareport/sample/SampleUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (view == this.f158292i) {
            Intent intent4 = new Intent();
            intent4.setClass(this, cls);
            intent4.putExtra("type", 3);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(intent4);
            C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/datareport/sample/SampleUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar4.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/datareport/sample/SampleUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (view == this.f158293j) {
            Intent intent5 = new Intent();
            intent5.setClass(this, ViewLayoutSampleUI.class);
            intent5.putExtra("type", 3);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(intent5);
            C117292a.m165358d(this, aVar5.mo10232b(), "com/tencent/mm/plugin/datareport/sample/SampleUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar5.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/datareport/sample/SampleUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/datareport/sample/SampleUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        setMMTitle("数据上报SDK示例页面");
        setBackBtn(new C55600b());
        this.f158287d = (LinearLayout) mo176895$(C0966R.C0970id.n5a);
        LinearLayout linearLayout = (LinearLayout) mo176895$(C0966R.C0970id.n5b);
        this.f158288e = (Button) mo176895$(C0966R.C0970id.anr);
        this.f158289f = (Button) mo176895$(C0966R.C0970id.ans);
        this.f158290g = (Button) mo176895$(C0966R.C0970id.ant);
        this.f158291h = (Button) mo176895$(C0966R.C0970id.anu);
        this.f158292i = (Button) mo176895$(C0966R.C0970id.jby);
        this.f158293j = (Button) mo176895$(C0966R.C0970id.jcj);
        this.f158288e.setOnClickListener(this);
        this.f158289f.setOnClickListener(this);
        this.f158290g.setOnClickListener(this);
        this.f158291h.setOnClickListener(this);
        this.f158292i.setOnClickListener(this);
        this.f158293j.setOnClickListener(this);
        ((C61213g) C86312j.m106911c(C61213g.class)).mo86190mV(this.f158292i, new C55601c(this));
        ((C61212e) C86312j.m106911c(cls)).mo86163dt(this);
        C11345b bVar = C11345b.SampleUI;
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, bVar);
        ((C61212e) C86312j.m106911c(cls)).y50(this, "nickname", "菲灵小仙子");
        ((C61212e) C86312j.m106911c(cls)).y50(this, "signture", "记录点点滴滴！感谢有你，希望遇见下一个你");
        ((C61212e) C86312j.m106911c(cls)).y50(this, "finder_username", "v2_060000231003b20faec8c5ea8c1dc6d7ce02e930b0779d6ecdd67f6e73fe2f48401eb2aef3bf@finder");
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C55602d(this));
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86163dt(this).mo86178qr(this, bVar).y50(this, "nickname", "菲灵小仙子").y50(this, "signture", "记录点点滴滴！感谢有你，希望遇见下一个你").y50(this, "finder_username", "v2_060000231003b20faec8c5ea8c1dc6d7ce02e930b0779d6ecdd67f6e73fe2f48401eb2aef3bf@finder").E60(this, new C55603e(this)).mo86148No(this, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86131CH(this);
        ((C61212e) C86312j.m106911c(cls)).ea0(this, "channel_id", "1-1-20-2cf48b5d7ab34f5b8ffb59e72530e948");
        ((C61212e) C86312j.m106911c(cls)).ea0(this, "behaviour_session_id", "143_1628342664409#$2_1628342663385#");
        ((C61212e) C86312j.m106911c(cls)).se0(this.f158287d);
        ((C61212e) C86312j.m106911c(cls)).se0(this.f158288e);
        ((C61212e) C86312j.m106911c(cls)).se0(this.f158289f);
        ((C61212e) C86312j.m106911c(cls)).se0(this.f158290g);
        ((C61212e) C86312j.m106911c(cls)).se0(this.f158291h);
        ((C61212e) C86312j.m106911c(cls)).se0(this.f158292i);
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158287d, "sample_wrapper");
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158288e, "sample_btn1");
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158289f, "sample_btn2");
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158290g, "sample_btn3");
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158291h, "sample_btn4");
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158292i, "sample_btn5");
        ((C61212e) C86312j.m106911c(cls)).o30(this.f158293j, "sample_btn6");
        Button button = this.f158288e;
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(button, MimeTypes.BASE_TYPE_TEXT, button.getText());
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158288e, "color", "红色");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158289f, MimeTypes.BASE_TYPE_TEXT, this.f158288e.getText());
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158289f, "color", "黄色");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158290g, MimeTypes.BASE_TYPE_TEXT, this.f158288e.getText());
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158290g, "color", "白色");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158291h, MimeTypes.BASE_TYPE_TEXT, this.f158288e.getText());
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158291h, "color", "灰色");
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158291h, MimeTypes.BASE_TYPE_TEXT, this.f158288e.getText());
        ((C61212e) C86312j.m106911c(cls)).mo86176qF(this.f158291h, "color", "灰色");
        ((C61212e) C86312j.m106911c(cls)).E60(this.f158288e, new C55604f(this));
        ((C61212e) C86312j.m106911c(cls)).E60(this.f158289f, new C55605g(this));
        ((C61212e) C86312j.m106911c(cls)).E60(this.f158290g, new C55606h(this));
        ((C61212e) C86312j.m106911c(cls)).E60(this.f158291h, new C55607i(this));
        ((C61212e) C86312j.m106911c(cls)).E60(this.f158292i, new C55608j(this));
        ((C61212e) C86312j.m106911c(cls)).mo86141Ky(this.f158288e, 0.5d);
        ((C61212e) C86312j.m106911c(cls)).mo86162dW(this.f158288e, 3000);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f158288e, 168, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f158289f, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f158290g, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f158291h, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f158292i, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).mo86152UM(this, "next_biz_param", "next_biz_param");
        ((C61212e) C86312j.m106911c(cls)).mo86144M8(this, new HashMap());
        ((C61212e) C86312j.m106911c(cls)).K70(this, "next_biz_param");
        ((C61212e) C86312j.m106911c(cls)).kq0(this);
        ((C61212e) C86312j.m106911c(cls)).Lg0(this);
        ((C61212e) C86312j.m106911c(cls)).U60(this, "next_session_param", "next_session_param");
        ((C61212e) C86312j.m106911c(cls)).I20(this, new HashMap());
        ((C61212e) C86312j.m106911c(cls)).Fb0(this, "next_session_param");
        ((C61212e) C86312j.m106911c(cls)).mo86154XC(this);
        ((C61212e) C86312j.m106911c(cls)).rf0(this);
        ((C61212e) C86312j.m106911c(cls)).mo86155XH(this, "page_in", "event_param", "event_param");
        ((C61212e) C86312j.m106911c(cls)).mo86166fz(this, "page_in", new HashMap());
        ((C61212e) C86312j.m106911c(cls)).mo86159cA(this, "page_in", "event_param");
        ((C61212e) C86312j.m106911c(cls)).mo86133EI(this, "page_in");
        ((C61212e) C86312j.m106911c(cls)).r80(this.f158293j, 40, new C55599a(this));
    }
}
