package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.base.CardBaseUI;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import dz0.C20483c;
import f40.C86709a0;
import hz0.C46153l0;
import hz0.C46154m;
import hz0.C46157t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ob0.C117747y;
import te3.C50289lo;
import te3.xa4;
import wz0.C53248d;
import wz0.C53262l;

/* renamed from: com.tencent.mm.plugin.card.ui.CardViewUI */
public class CardViewUI extends CardBaseUI {

    /* renamed from: A */
    public String f109845A = "";

    /* renamed from: B */
    public String f109846B = "";

    /* renamed from: C */
    public int f109847C;

    /* renamed from: D */
    public int f109848D;

    /* renamed from: w */
    public int f109849w = 1;

    /* renamed from: x */
    public LinkedList<C50289lo> f109850x = new LinkedList<>();

    /* renamed from: y */
    public String f109851y;

    /* renamed from: z */
    public View f109852z;

    /* renamed from: H7 */
    public BaseAdapter mo63746H7() {
        return this.f109849w == 0 ? new C40887x(getApplicationContext()) : super.mo63746H7();
    }

    /* renamed from: I7 */
    public C46154m mo63747I7() {
        return C46154m.CAN_GIFT_TYPE;
    }

    /* renamed from: J7 */
    public void mo63748J7() {
        int i = this.f109849w;
        if (i == 0) {
            setMMTitle((int) C0966R.string.b2a);
        } else if (i == 1) {
            setMMTitle((int) C0966R.string.axz);
        }
        C86709a0.m107529k().f251779b.mo123455a(1099, this);
        int i2 = this.f109849w;
        int i3 = C0966R.string.avn;
        if (i2 == 0) {
            mo63761W7(true);
            xa4 xa4 = new xa4();
            String str = this.f109845A;
            xa4.f144572d = str;
            Log.m105925i("MicroMsg.CardViewUI", "doBatchGetCardItemByTpInfo templateId:%s", str);
            C86709a0.m107529k().f251779b.mo123460f(new C46157t(this.f109850x, xa4, this.f109847C));
        } else if (i2 == 1) {
            View inflate = View.inflate(this, C0966R.C0971layout.f6751nj, (ViewGroup) null);
            this.f109852z = inflate;
            LinearLayout linearLayout = this.f109703h;
            if (linearLayout != null) {
                linearLayout.addView(inflate);
            }
            i3 = C0966R.string.b1l;
        }
        View findViewById = findViewById(C0966R.C0970id.hg9);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardViewUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/CardViewUI", "initBaseUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) findViewById(C0966R.C0970id.hga)).setText(i3);
    }

    /* renamed from: L7 */
    public boolean mo63750L7() {
        if (this.f109849w == 1) {
            return false;
        }
        return !(this instanceof ShareCardListUI);
    }

    /* renamed from: N7 */
    public void mo63752N7(CardInfo cardInfo) {
        if (this.f109849w == 1) {
            this.f109708p = cardInfo;
            mo63762X7(this.f109851y, 1, true);
            return;
        }
        super.mo63752N7(cardInfo);
        if (this.f109708p != null) {
            C115669n nVar = C115669n.INSTANCE;
            CardInfo cardInfo2 = this.f109708p;
            nVar.mo160131h(11582, "OperGift", 4, Integer.valueOf(this.f109708p.mo23264L0().f64141i), cardInfo2.field_card_tp_id, cardInfo2.field_card_id, this.f109851y);
        }
    }

    /* renamed from: O7 */
    public void mo63753O7(C20483c cVar, int i) {
        if (this.f109849w == 0) {
            CardInfo cardInfo = (CardInfo) cVar;
            C46153l0.yx0().f124011b = cardInfo;
            Intent intent = new Intent(this, CardDetailUI.class);
            intent.putExtra("key_card_id", cardInfo.field_card_id);
            intent.putExtra("key_from_scene", 51);
            intent.putExtra("key_from_appbrand_type", this.f109848D);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardViewUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/card/ui/CardViewUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        super.mo63753O7(cVar, i);
    }

    /* renamed from: P7 */
    public void mo63754P7() {
    }

    /* renamed from: Q7 */
    public void mo63755Q7(C20483c cVar, int i) {
        if (this.f109849w == 1) {
            mo63752N7((CardInfo) cVar);
        } else {
            super.mo63755Q7(cVar, i);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            Log.m105920e("MicroMsg.CardViewUI", "onCreate intent is null");
            finish();
            return;
        }
        this.f109847C = intent.getIntExtra("key_previous_scene", 7);
        this.f109848D = intent.getIntExtra("key_from_appbrand_type", 0);
        this.f109849w = intent.getIntExtra(XWalkReaderBasePlugin.PARAM_KEY_VIEW_TYPE, 0);
        this.f109851y = intent.getStringExtra("user_name");
        this.f109846B = intent.getStringExtra("key_app_id");
        String stringExtra = intent.getStringExtra("card_list");
        this.f109845A = getIntent().getStringExtra("key_template_id");
        if (this.f109849w == 0) {
            if (TextUtils.isEmpty(stringExtra)) {
                Log.m105920e("MicroMsg.CardViewUI", "oncreate card_list is empty");
                finish();
                return;
            }
            LinkedList<C50289lo> a = C53262l.m59699a(stringExtra, this.f109847C, this.f109846B);
            if (a != null && a.size() > 0) {
                this.f109850x.clear();
                this.f109850x.addAll(a);
            }
        }
        initView();
    }

    public void onDestroy() {
        C86709a0.m107529k().f251779b.mo123470p(1099, this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C46157t) {
            mo63761W7(false);
            if (i == 0 && i2 == 0) {
                LinkedList<CardInfo> linkedList = ((C46157t) yVar).f124429f;
                if (linkedList != null && linkedList.size() > 0) {
                    BaseAdapter baseAdapter = this.f109700e;
                    if (baseAdapter instanceof C40887x) {
                        C40887x xVar = (C40887x) baseAdapter;
                        ((ArrayList) xVar.f109958e).clear();
                        ((ArrayList) xVar.f109958e).addAll(linkedList);
                        ((ArrayList) xVar.f109959f).clear();
                        for (int i3 = 0; i3 < linkedList.size(); i3++) {
                            ((ArrayList) xVar.f109959f).add(new Boolean(true));
                        }
                    }
                    this.f109700e.notifyDataSetChanged();
                    return;
                }
                return;
            }
            C53248d.m59684d(this, str, i2);
            return;
        }
        super.onSceneEnd(i, i2, str, yVar);
    }

    public void onSwipeBack() {
        super.onSwipeBack();
        if (this.f109847C == 26) {
            overridePendingTransition(0, 0);
        }
    }
}
