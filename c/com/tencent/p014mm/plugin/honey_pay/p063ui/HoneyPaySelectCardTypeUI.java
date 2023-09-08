package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.honey_pay.model.HoneyPayCardType;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import de3.C75355a0;
import eb0.C75592q0;
import fy3.C32226l;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import ob0.C117747y;
import q02.C47738b;
import t02.C48527c;
import te3.C51687ve2;
import te3.C52302zt;
import te3.C77933g43;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI */
public class HoneyPaySelectCardTypeUI extends HoneyPayBaseUI {

    /* renamed from: i */
    public static final /* synthetic */ int f114927i = 0;

    /* renamed from: f */
    public LinearLayout f114928f;

    /* renamed from: g */
    public List<C51687ve2> f114929g;

    /* renamed from: h */
    public int f114930h;

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI$a */
    public class C42455a implements C75113f0.C75114a {
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI$b */
    public class C42456b implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47738b f114931a;

        public C42456b(C47738b bVar) {
            this.f114931a = bVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            try {
                C77933g43 g432 = this.f114931a.f128252r.f146209o;
                String encodeToString = g432 != null ? Base64.encodeToString(g432.toByteArray(), 2) : "";
                HoneyPaySelectCardTypeUI honeyPaySelectCardTypeUI = HoneyPaySelectCardTypeUI.this;
                C47738b bVar = this.f114931a;
                C52302zt ztVar = bVar.f128252r;
                HoneyPaySelectCardTypeUI.m46127I7(honeyPaySelectCardTypeUI, ztVar.f146204g, ztVar.f146203f, ztVar.f146205h, ztVar.f146206i, bVar.f128253s, ztVar.f146207j, ztVar.f146208n, encodeToString);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.HoneyPaySelectCardTypeUI", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI$c */
    public class C42457c {

        /* renamed from: a */
        public WeImageView f114933a;

        /* renamed from: b */
        public TextView f114934b;

        /* renamed from: c */
        public TextView f114935c;

        /* renamed from: d */
        public CdnImageView f114936d;

        /* renamed from: e */
        public TextView f114937e;

        /* renamed from: f */
        public ImageView f114938f;

        /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI$c$a */
        public class C42458a extends C7089c0 {

            /* renamed from: g */
            public final /* synthetic */ C51687ve2 f114940g;

            public C42458a(C51687ve2 ve22) {
                this.f114940g = ve22;
            }

            /* renamed from: a */
            public void mo2066a(View view) {
                Log.m105924i("MicroMsg.HoneyPaySelectCardTypeUI", "card type clicked");
                HoneyPaySelectCardTypeUI honeyPaySelectCardTypeUI = HoneyPaySelectCardTypeUI.this;
                int i = HoneyPaySelectCardTypeUI.f114927i;
                honeyPaySelectCardTypeUI.getClass();
                HoneyPaySelectCardTypeUI honeyPaySelectCardTypeUI2 = HoneyPaySelectCardTypeUI.this;
                honeyPaySelectCardTypeUI2.f114930h = this.f114940g.f143457h;
                honeyPaySelectCardTypeUI2.getClass();
                Log.m105924i("MicroMsg.HoneyPaySelectCardTypeUI", "go to select contact");
                Intent intent = new Intent();
                intent.putExtra("list_attr", C74560s1.m89278g(16, 1, 2, 4, 16384));
                intent.putExtra("block_contact", C75592q0.m90789s());
                intent.putExtra("titile", honeyPaySelectCardTypeUI2.getString(C0966R.string.fl_));
                C88144b.m109802t(honeyPaySelectCardTypeUI2, ".ui.contact.SelectContactUI", intent, 1);
            }
        }

        public C42457c(C42455a aVar) {
        }

        /* renamed from: a */
        public final void mo66541a(View view, C51687ve2 ve22) {
            this.f114933a = (WeImageView) view.findViewById(C0966R.C0970id.f0p);
            this.f114934b = (TextView) view.findViewById(C0966R.C0970id.f0r);
            this.f114935c = (TextView) view.findViewById(C0966R.C0970id.f0q);
            this.f114938f = (ImageView) view.findViewById(C0966R.C0970id.f0o);
            this.f114933a.setImageResource(C48527c.m53907c(ve22.f143457h));
            if (ve22.f143456g) {
                this.f114933a.setIconColor(HoneyPaySelectCardTypeUI.this.getContext().getResources().getColor(C0966R.color.FG_2));
            } else {
                this.f114933a.setIconColor(HoneyPaySelectCardTypeUI.this.getContext().getResources().getColor(C0966R.color.f2976b7));
            }
            this.f114934b.setText(ve22.f143453d);
            this.f114935c.setText(ve22.f143454e);
            if (ve22.f143456g) {
                Log.m105924i("MicroMsg.HoneyPaySelectCardTypeUI", "disable this card");
                view.setEnabled(false);
                this.f114938f.setVisibility(8);
                this.f114934b.setTextColor(HoneyPaySelectCardTypeUI.this.getContext().getResources().getColor(C0966R.color.FG_2));
                this.f114935c.setTextColor(HoneyPaySelectCardTypeUI.this.getContext().getResources().getColor(C0966R.color.FG_2));
                return;
            }
            view.setOnClickListener(new C42458a(ve22));
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI$d */
    public static class C42459d extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI$d$a */
        public class C42460a implements C32226l<View, String> {
            public C42460a(C42459d dVar) {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return ((TextView) view.findViewById(C0966R.C0970id.f0r)).getText().toString() + ((TextView) view.findViewById(C0966R.C0970id.f0q)).getText();
            }
        }

        /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI$d$b */
        public class C42461b implements Runnable {
            public C42461b() {
            }

            public void run() {
                TextView textView = (TextView) C42459d.this.findViewById(C0966R.C0970id.f0t);
                if (textView != null) {
                    textView.sendAccessibilityEvent(8);
                }
            }
        }

        public C42459d(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            root(C0966R.C0970id.f0y).view(C0966R.C0970id.f0v).desc((C32226l<? super View, String>) new C42460a(this)).type(ViewType.Button);
            focusFirst(C0966R.C0970id.f0t);
            C119179t tVar = C119157j.f356862d;
            C42461b bVar = new C42461b();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(bVar, 300, false);
        }
    }

    /* renamed from: I7 */
    public static void m46127I7(HoneyPaySelectCardTypeUI honeyPaySelectCardTypeUI, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6) {
        honeyPaySelectCardTypeUI.getClass();
        Log.m105924i("MicroMsg.HoneyPaySelectCardTypeUI", "go to give card");
        Intent intent = new Intent(honeyPaySelectCardTypeUI, HoneyPayGiveCardUI.class);
        intent.putExtra("key_max_credit_line", j);
        intent.putExtra("key_min_credit_line", j2);
        intent.putExtra("key_true_name", str);
        intent.putExtra("key_take_message", str2);
        intent.putExtra("key_username", str3);
        intent.putExtra("key_wishing", str4);
        intent.putExtra("key_icon_url", str5);
        intent.putExtra("key_cardtype", honeyPaySelectCardTypeUI.f114930h);
        if (!Util.isNullOrNil(str6)) {
            intent.putExtra("key_notice_item", str6);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(honeyPaySelectCardTypeUI, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPaySelectCardTypeUI", "gotoGiveCardUI", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        honeyPaySelectCardTypeUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(honeyPaySelectCardTypeUI, "com/tencent/mm/plugin/honey_pay/ui/HoneyPaySelectCardTypeUI", "gotoGiveCardUI", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.azu;
    }

    public void initView() {
        this.f114928f = (LinearLayout) mo176895$(C0966R.C0970id.f0y);
    }

    public boolean needExecuteBackListener() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                Log.m105925i("MicroMsg.HoneyPaySelectCardTypeUI", "select friend: %s", stringExtra);
                Log.m105925i("MicroMsg.HoneyPaySelectCardTypeUI", "do check user: %s", stringExtra);
                C47738b bVar = new C47738b(stringExtra, this.f114930h);
                bVar.mo104821m1(this);
                doSceneProgress(bVar, true);
            } else {
                Log.m105924i("MicroMsg.HoneyPaySelectCardTypeUI", "cancel add friend");
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        View view;
        this.f114713e = C0966R.color.f3565xw;
        super.onCreate(bundle);
        addSceneEndListener(2618);
        addSceneEndListener(2926);
        setMMTitle("");
        ArrayList<HoneyPayCardType> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_card_type_list");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            this.f114929g = new ArrayList();
            try {
                for (HoneyPayCardType honeyPayCardType : parcelableArrayListExtra) {
                    C51687ve2 ve22 = new C51687ve2();
                    ve22.parseFrom(honeyPayCardType.f114711d);
                    this.f114929g.add(ve22);
                }
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.HoneyPaySelectCardTypeUI", e, "", new Object[0]);
            }
        }
        initView();
        this.f114928f.removeAllViews();
        List<C51687ve2> list = this.f114929g;
        if (list != null && !list.isEmpty()) {
            for (C51687ve2 next : this.f114929g) {
                C42457c cVar = new C42457c((C42455a) null);
                if (next.f143458i == null) {
                    AppCompatActivity context = getContext();
                    view = LayoutInflater.from(context).inflate(C0966R.C0971layout.azs, this.f114928f, false);
                    cVar.mo66541a(view, next);
                } else {
                    AppCompatActivity context2 = getContext();
                    View inflate = LayoutInflater.from(context2).inflate(C0966R.C0971layout.azt, this.f114928f, false);
                    cVar.mo66541a(inflate, next);
                    cVar.f114936d = (CdnImageView) inflate.findViewById(C0966R.C0970id.f0w);
                    cVar.f114937e = (TextView) inflate.findViewById(C0966R.C0970id.f0x);
                    cVar.f114936d.setUrl(next.f143458i.f142813g);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(next.f143458i.f142810d);
                    spannableStringBuilder.append(next.f143458i.f142811e);
                    spannableStringBuilder.setSpan(new C72476y0(2, (C72476y0.C72477a) new C42462c(cVar, next, context2)), next.f143458i.f142810d.length(), spannableStringBuilder.length(), 34);
                    cVar.f114937e.setOnTouchListener(new C75355a0(context2));
                    cVar.f114937e.setClickable(true);
                    cVar.f114937e.setText(spannableStringBuilder);
                    view = inflate;
                }
                this.f114928f.addView(view);
            }
        }
    }

    public void onDestroy() {
        removeSceneEndListener(2618);
        removeSceneEndListener(2926);
        super.onDestroy();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C47738b)) {
            return true;
        }
        C47738b bVar = (C47738b) yVar;
        bVar.mo104823q1(new C42456b(bVar));
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C42459d.class);
    }
}
