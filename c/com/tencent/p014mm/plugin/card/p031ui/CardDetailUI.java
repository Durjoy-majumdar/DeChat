package com.tencent.p014mm.plugin.card.p031ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import c00.C0405n;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.autogen.events.AcceptCouponCardEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82613z;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83113m;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.p014mm.plugin.card.sharecard.p317ui.CardConsumeSuccessUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import di3.C86312j;
import dz0.C20483c;
import dz0.C31352e;
import f40.C86709a0;
import fy3.C32226l;
import gz0.C20867d;
import gz0.C20871g;
import gz0.C20872j;
import gz0.C32626c;
import gz0.C45985e;
import gz0.C45988h;
import gz0.C45991n;
import gz0.C45998p;
import hl0.C87552j;
import hz0.C21039z;
import hz0.C46144e;
import hz0.C46153l0;
import hz0.C46159v;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import jl0.C9464d;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76901s0;
import ob0.C11385n;
import p447aw.C103918d;
import p702ts.C78085c;
import qo3.C89779i0;
import rz0.C22280a;
import rz0.C22286g;
import te3.C48884bn2;
import te3.C49029co;
import te3.xa4;
import vz0.C22813c;
import vz0.C22818f0;
import vz0.C22819h;
import vz0.C22821l;
import vz0.C53056u;
import wz0.C22945n;
import wz0.C53247c;
import wz0.C53248d;
import wz0.C53260j;
import xz0.C23145a;
import xz0.C23154i;

/* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI */
public class CardDetailUI extends MMActivity implements C11385n, C45985e.C45986a, C45991n.C45993b, C20867d.C20870c, ScreenShotUtil.ScreenShotCallback {

    /* renamed from: S */
    public static final /* synthetic */ int f51728S = 0;

    /* renamed from: A */
    public ArrayList<C49029co> f51729A;

    /* renamed from: B */
    public int f51730B = 3;

    /* renamed from: C */
    public int f51731C = 0;

    /* renamed from: D */
    public int f51732D = -1;

    /* renamed from: E */
    public boolean f51733E = false;

    /* renamed from: F */
    public Vibrator f51734F;

    /* renamed from: G */
    public boolean f51735G = true;

    /* renamed from: H */
    public long f51736H = 0;

    /* renamed from: I */
    public boolean f51737I = false;

    /* renamed from: J */
    public boolean f51738J = false;

    /* renamed from: K */
    public boolean f51739K = false;

    /* renamed from: L */
    public C92411b f51740L;

    /* renamed from: M */
    public float f51741M = -85.0f;

    /* renamed from: N */
    public float f51742N = -1000.0f;

    /* renamed from: P */
    public String f51743P = "";

    /* renamed from: Q */
    public C20872j f51744Q = new C20872j();

    /* renamed from: R */
    public C92411b.C92412a f51745R = new C18561a();

    /* renamed from: d */
    public C89779i0 f51746d = null;

    /* renamed from: e */
    public CardDetailUIContoller f51747e;

    /* renamed from: f */
    public C20483c f51748f;

    /* renamed from: g */
    public String f51749g = "";

    /* renamed from: h */
    public String f51750h = "";

    /* renamed from: i */
    public String f51751i = "";

    /* renamed from: j */
    public String f51752j = "";

    /* renamed from: n */
    public String f51753n = "";

    /* renamed from: o */
    public String f51754o = "";

    /* renamed from: p */
    public String f51755p = "";

    /* renamed from: q */
    public boolean f51756q = false;

    /* renamed from: r */
    public boolean f51757r = false;

    /* renamed from: s */
    public boolean f51758s = false;

    /* renamed from: t */
    public boolean f51759t = false;

    /* renamed from: u */
    public String f51760u = "";

    /* renamed from: v */
    public String f51761v = "";

    /* renamed from: w */
    public View f51762w;

    /* renamed from: x */
    public boolean f51763x = false;

    /* renamed from: y */
    public MMHandler f51764y = new MMHandler();

    /* renamed from: z */
    public CardDetailUIContoller.C18575g f51765z;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI$d */
    public class C2151d implements DialogInterface.OnClickListener {
        public C2151d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(CardDetailUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI$a */
    public class C18561a implements C92411b.C92412a {
        public C18561a() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            if (!z) {
                return true;
            }
            CardDetailUI cardDetailUI = CardDetailUI.this;
            if (cardDetailUI.f51741M == -85.0f && cardDetailUI.f51742N == -1000.0f) {
                cardDetailUI.f51741M = f2;
                cardDetailUI.f51742N = f;
                C45998p Jx0 = C46153l0.Jx0();
                CardDetailUI cardDetailUI2 = CardDetailUI.this;
                float f3 = cardDetailUI2.f51741M;
                float f4 = cardDetailUI2.f51742N;
                Jx0.f124035d = f3;
                Jx0.f124036e = f4;
                Jx0.f124037f = System.currentTimeMillis() / 1000;
            }
            CardDetailUI cardDetailUI3 = CardDetailUI.this;
            C20872j jVar = cardDetailUI3.f51744Q;
            float f5 = cardDetailUI3.f51742N;
            float f6 = cardDetailUI3.f51741M;
            synchronized (jVar.f58980i) {
                jVar.f58983o = f6;
                jVar.f58984p = f5;
            }
            CardDetailUI cardDetailUI4 = CardDetailUI.this;
            if (cardDetailUI4.f51739K) {
                cardDetailUI4.mo23341H7();
                CardDetailUI.this.f51739K = false;
            }
            CardDetailUI cardDetailUI5 = CardDetailUI.this;
            C92411b bVar = cardDetailUI5.f51740L;
            if (bVar != null) {
                bVar.mo126408b(cardDetailUI5.f51745R);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI$b */
    public class C18562b implements MenuItem.OnMenuItemClickListener {
        public C18562b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardDetailUI cardDetailUI = CardDetailUI.this;
            int i = CardDetailUI.f51728S;
            cardDetailUI.mo23356q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI$c */
    public class C18563c implements CardDetailUIContoller.C18581j {
        public C18563c() {
        }

        /* renamed from: a */
        public void mo23358a(boolean z) {
            Log.m105924i("MicroMsg.CardDetailUI", "doMark()");
            CardDetailUI cardDetailUI = CardDetailUI.this;
            cardDetailUI.f51758s = true;
            cardDetailUI.mo23351Q7(true);
            CardDetailUI cardDetailUI2 = CardDetailUI.this;
            cardDetailUI2.f51759t = z;
            if (cardDetailUI2.f51748f.mo23286i2()) {
                C45991n Ax0 = C46153l0.Ax0();
                CardDetailUI cardDetailUI3 = CardDetailUI.this;
                Ax0.mo71397b(cardDetailUI3.f51749g, C22945n.m27026z(cardDetailUI3.f51748f.mo23280e()), 1, 2);
                return;
            }
            C45991n Ax02 = C46153l0.Ax0();
            CardDetailUI cardDetailUI4 = CardDetailUI.this;
            Ax02.mo71397b(cardDetailUI4.f51749g, C22945n.m27026z(cardDetailUI4.f51748f.mo23280e()), 1, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI$e */
    public class C18564e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f51769d;

        public C18564e(String str) {
            this.f51769d = str;
        }

        public void run() {
            CardDetailUI cardDetailUI = CardDetailUI.this;
            String str = this.f51769d;
            int i = CardDetailUI.f51728S;
            synchronized (cardDetailUI) {
                if (cardDetailUI.f51763x) {
                    Log.m105920e("MicroMsg.CardDetailUI", "has start CardConsumeSuccessUI!");
                    return;
                }
                Log.m105924i("MicroMsg.CardDetailUI", "startConsumedSuccUI() ");
                cardDetailUI.f51763x = true;
                Intent intent = new Intent(cardDetailUI, CardConsumeSuccessUI.class);
                intent.putExtra("KEY_CARD_ID", cardDetailUI.f51748f.getCardId());
                intent.putExtra("KEY_CARD_CONSUMED_JSON", str);
                intent.putExtra("KEY_CARD_COLOR", cardDetailUI.f51748f.mo23264L0().f64145p);
                intent.putExtra("key_stastic_scene", cardDetailUI.f51730B);
                intent.putExtra("key_from_scene", 0);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(cardDetailUI, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardDetailUI", "startConsumedSuccUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                cardDetailUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(cardDetailUI, "com/tencent/mm/plugin/card/ui/CardDetailUI", "startConsumedSuccUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI$f */
    public static class C18565f extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI$f$a */
        public class C18566a implements C32226l<View, String> {
            public C18566a(C18565f fVar) {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return ((TextView) view.findViewById(C0966R.C0970id.f357619at2)).getText().toString() + ((TextView) view.findViewById(C0966R.C0970id.f357618at1)).getText().toString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI$f$b */
        public class C18567b implements C32226l<View, String> {
            public C18567b(C18565f fVar) {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return ((TextView) view.findViewById(C0966R.C0970id.f357619at2)).getText().toString() + ((TextView) view.findViewById(C0966R.C0970id.f357618at1)).getText().toString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI$f$c */
        public class C18568c implements C32226l<View, String> {
            public C18568c(C18565f fVar) {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return ((TextView) view.findViewById(C0966R.C0970id.j7i)).getText().toString() + ' ' + ((TextView) view.findViewById(C0966R.C0970id.j7f)).getText().toString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI$f$d */
        public class C18569d implements C32226l<View, String> {
            public C18569d(C18565f fVar) {
            }

            public Object invoke(Object obj) {
                return ((TextView) ((View) obj).findViewById(C0966R.C0970id.awc)).getText().toString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.CardDetailUI$f$e */
        public class C18570e implements C32226l<View, String> {
            public C18570e() {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return ((TextView) C18565f.this.findViewById(C0966R.C0970id.f6056w3)).getText().toString() + ' ' + ((TextView) C18565f.this.findViewById(C0966R.C0970id.axi)).getText().toString() + ' ' + ((TextView) C18565f.this.findViewById(C0966R.C0970id.bfz)).getText().toString();
            }
        }

        public C18565f(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        /* renamed from: c3 */
        public void mo23360c3(boolean z) {
            root(C0966R.C0971layout.f6756no).view(C0966R.C0970id.f357632aw3).desc((C32226l<? super View, String>) new C18570e()).type(z ? ViewType.Button : ViewType.TextView).clickAs(C0966R.C0970id.at_);
        }

        public void initConfig() {
            ViewSetter desc = root(C0966R.C0970id.ayf).view(C0966R.C0970id.f357617at0).desc((C32226l<? super View, String>) new C18566a(this));
            ViewType viewType = ViewType.Button;
            desc.type(viewType);
            root(C0966R.C0970id.ayf).view(C0966R.C0970id.asv).desc((C32226l<? super View, String>) new C18567b(this)).type(viewType);
            root(C0966R.C0971layout.f6766ny).view(C0966R.C0970id.f357633ax0).desc((C32226l<? super View, String>) new C18568c(this));
            root(C0966R.C0970id.axt).view(C0966R.C0970id.awc).desc((C32226l<? super View, String>) new C18569d(this)).type(viewType);
        }
    }

    /* renamed from: C */
    public void mo23305C() {
        Log.m105924i("MicroMsg.CardDetailUI", "code change");
        C22819h hVar = this.f51747e.f51805p;
        if (hVar instanceof C53056u) {
            ((C53056u) hVar).f148101l = C46153l0.wx0().mo32570b();
            this.f51747e.mo23367h();
        }
    }

    /* renamed from: F6 */
    public void mo23306F6() {
        Log.m105924i("MicroMsg.CardDetailUI", "onFinishUI");
    }

    /* renamed from: H7 */
    public final void mo23341H7() {
        String str;
        if (!TextUtils.isEmpty(this.f51748f.mo23270R0())) {
            str = this.f51748f.mo23270R0();
        } else if (!TextUtils.isEmpty(this.f51749g)) {
            str = this.f51749g;
        } else {
            Log.m105920e("MicroMsg.CardDetailUI", "doNetSceneCardShopLBS card id is null, return");
            return;
        }
        C20483c cVar = this.f51748f;
        if (cVar == null || cVar.mo23264L0().f64154x != 1) {
            C20483c cVar2 = this.f51748f;
            if (cVar2 == null || cVar2.mo23264L0().f64154x <= 1) {
                C20483c cVar3 = this.f51748f;
                if (cVar3 != null) {
                    cVar3.mo23262G0((C49029co) null);
                    mo23343J7();
                    if (this.f51748f.mo23272T0()) {
                        ShareCardInfo jo = C46153l0.Lx0().mo72543jo(this.f51749g);
                        if (jo != null) {
                            jo.mo23262G0((C49029co) null);
                            C46153l0.Lx0().update(jo, this.f51749g);
                            return;
                        }
                        return;
                    }
                    CardInfo Lo = C46153l0.Gx0().mo71595Lo(this.f51749g);
                    if (Lo != null) {
                        Lo.mo23262G0((C49029co) null);
                        C46153l0.Gx0().update(Lo, this.f51749g);
                        return;
                    }
                    return;
                }
                return;
            }
            float f = this.f51741M;
            if (f != -85.0f) {
                float f2 = this.f51742N;
                if (f2 != -1000.0f) {
                    this.f51739K = false;
                    C86709a0.m107529k().f251779b.mo123460f(new C46159v(str, f2, f, this.f51748f.getCardId()));
                    return;
                }
            }
            if (!this.f51739K) {
                this.f51739K = true;
                if (this.f51738J) {
                    if (this.f51740L == null) {
                        this.f51740L = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
                    }
                    mo23348O7();
                    return;
                }
                return;
            }
            return;
        }
        float f3 = this.f51741M;
        float f4 = this.f51742N;
        if (f3 == -85.0f || f4 == -1000.0f) {
            f3 = C46153l0.Jx0().f124035d;
            f4 = C46153l0.Jx0().f124036e;
        }
        C86709a0.m107529k().f251779b.mo123460f(new C46159v(str, f4, f3, this.f51748f.getCardId()));
    }

    /* renamed from: I7 */
    public final void mo23342I7() {
        xa4 xa4 = new xa4();
        String str = this.f51760u;
        xa4.f144572d = str;
        xa4.f144573e = this.f51761v;
        Log.m105925i("MicroMsg.CardDetailUI", "GetCardItemInfo templateId:%s", str);
        C86709a0.m107529k().f251779b.mo123460f(new C21039z(this.f51749g, this.f51730B, this.f51750h, this.f51752j, this.f51753n, this.f51754o, this.f51731C, this.f51755p, xa4));
    }

    /* renamed from: J7 */
    public final void mo23343J7() {
        CardDetailUIContoller.C18575g gVar = this.f51765z;
        gVar.f51822a = this.f51730B;
        gVar.f51823b = this.f51732D;
        gVar.f51824c = this.f51749g;
        CardDetailUIContoller cardDetailUIContoller = this.f51747e;
        C20483c cVar = this.f51748f;
        ArrayList<C49029co> arrayList = this.f51729A;
        cardDetailUIContoller.f51776E = cVar;
        cardDetailUIContoller.f51791U = gVar;
        cardDetailUIContoller.f51777F = arrayList;
        if (cVar != null && cVar.mo23284h()) {
            cardDetailUIContoller.f51807r.f51950g = true;
        }
        this.f51747e.mo23367h();
        C46153l0.xx0().f124007i = this.f51748f;
    }

    /* renamed from: K7 */
    public final void mo23344K7(boolean z, int i) {
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtra("key_code", this.f51743P);
            intent.putExtra("key_card_id", this.f51749g);
            intent.putExtra("key_finish_action", i);
            setResult(-1, intent);
            if (z) {
                finish();
                return;
            }
            return;
        }
        int i2 = this.f51732D;
        if ((i2 == 7 || i2 == 8 || i2 == 16 || i2 == 26) && this.f51730B == 3) {
            Intent intent2 = new Intent();
            intent2.putExtra("key_code", this.f51743P);
            if (i > 0) {
                intent2.putExtra("key_card_id", this.f51749g);
                intent2.putExtra("key_finish_action", i);
            }
            setResult(-1, intent2);
            if (z) {
                finish();
            }
        } else if ((i2 == 7 && this.f51730B == 7) || ((i2 == 16 && this.f51730B == 16) || ((i2 == 8 && this.f51730B == 8) || (i2 == 26 && this.f51730B == 26)))) {
            setResult(0);
            if (z) {
                finish();
            }
        } else if (z) {
            finish();
        }
    }

    /* renamed from: L7 */
    public final void mo23345L7(int i, String str, int i2, String str2) {
        Log.m105920e("MicroMsg.CardDetailUI", "handleAcceptError, errCode = " + i + " errMsg = " + str + " ret_code:" + i2 + " ret_msg:" + str2);
        if (i2 == 10000) {
            if (TextUtils.isEmpty(str2)) {
                str2 = getString(C0966R.string.avs);
            }
            this.f51748f.mo23263J0().f63942d = 4;
            mo23343J7();
        } else if (i2 == 10001) {
            if (TextUtils.isEmpty(str2)) {
                str2 = getString(C0966R.string.avw);
            }
            this.f51748f.mo23263J0().f63942d = 5;
            mo23343J7();
        } else if (i2 == 10002) {
            if (TextUtils.isEmpty(str2)) {
                str2 = getString(C0966R.string.b05);
            }
        } else if (TextUtils.isEmpty(str2)) {
            str2 = getString(C0966R.string.avq);
        }
        C53248d.m59683c(this, str2);
    }

    /* renamed from: M7 */
    public final void mo23346M7() {
        int i = this.f51730B;
        this.f51732D = i;
        CardDetailUIContoller.C18575g gVar = new CardDetailUIContoller.C18575g();
        this.f51765z = gVar;
        gVar.f51822a = i;
        gVar.f51823b = i;
        gVar.f51824c = this.f51749g;
        gVar.f51825d = this.f51750h;
        gVar.f51827f = this.f51752j;
        gVar.f51826e = this.f51751i;
        this.f51765z.getClass();
        CardDetailUIContoller.C18575g gVar2 = this.f51765z;
        gVar2.f51828g = this.f51756q;
        gVar2.f51829h = getIntent().getIntExtra("key_from_appbrand_type", 0);
    }

    /* renamed from: N7 */
    public final void mo23347N7(int i) {
        int i2 = this.f51732D;
        if (i2 == 7 || i2 == 16) {
            LinkedList linkedList = new LinkedList();
            C46144e eVar = new C46144e();
            eVar.f144151d = this.f51748f.mo23270R0();
            eVar.f144152e = this.f51752j;
            eVar.f124354f = this.f51743P;
            linkedList.add(eVar);
            AcceptCouponCardEvent acceptCouponCardEvent = new AcceptCouponCardEvent();
            AcceptCouponCardEvent.C67655a aVar = acceptCouponCardEvent.f193467d;
            aVar.f193469b = i;
            if (i == -1) {
                aVar.f193468a = C53260j.m59692b(linkedList, true, this.f51732D);
            } else {
                aVar.f193468a = C53260j.m59692b(linkedList, false, this.f51732D);
            }
            acceptCouponCardEvent.publish();
            return;
        }
        Log.m105924i("MicroMsg.CardDetailUI", "mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_JSAPI and mPreviousScene != ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_NEARBY_PEOPLE_JSAPI ,don't push accept event");
    }

    /* renamed from: O7 */
    public final void mo23348O7() {
        C48884bn2 tp = ((C0405n) C86312j.m106911c(C0405n.class)).mo284tp();
        if (this.f51741M == -85.0f && this.f51742N == -1000.0f) {
            if (tp != null) {
                this.f51741M = tp.f131220e;
                this.f51742N = tp.f131219d;
            } else {
                this.f51741M = 0.0f;
                this.f51742N = 0.0f;
            }
            C45998p Jx0 = C46153l0.Jx0();
            float f = this.f51741M;
            float f2 = this.f51742N;
            Jx0.f124035d = f;
            Jx0.f124036e = f2;
            Jx0.f124037f = System.currentTimeMillis() / 1000;
        }
        Log.m105925i("MicroMsg.CardDetailUI", "refreshLbs lbsLatitude:%s，lbsLongitude：%s", Float.valueOf(this.f51741M), Float.valueOf(this.f51742N));
        C20872j jVar = this.f51744Q;
        float f3 = this.f51742N;
        float f4 = this.f51741M;
        synchronized (jVar.f58980i) {
            jVar.f58983o = f4;
            jVar.f58984p = f3;
        }
        if (this.f51739K) {
            mo23341H7();
            this.f51739K = false;
        }
        C92411b bVar = this.f51740L;
        if (bVar != null) {
            bVar.mo126408b(this.f51745R);
        }
    }

    /* renamed from: P7 */
    public final void mo23349P7() {
        C86709a0.m107529k().f251779b.mo123455a(1057, this);
        C86709a0.m107529k().f251779b.mo123455a(1037, this);
        C86709a0.m107529k().f251779b.mo123455a(1058, this);
        C86709a0.m107529k().f251779b.mo123455a(1045, this);
        C86709a0.m107529k().f251779b.mo123455a(C87552j.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123455a(1099, this);
        C86709a0.m107529k().f251779b.mo123455a(C82613z.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123455a(1051, this);
        C86709a0.m107529k().f251779b.mo123455a(C83113m.CTRL_INDEX, this);
    }

    /* renamed from: Q0 */
    public void mo23350Q0(String str, C45991n.C45994c cVar) {
        if (TextUtils.isEmpty(str) || str.equals(this.f51749g)) {
            this.f51757r = false;
        } else {
            Log.m105920e("MicroMsg.CardDetailUI", "onUnmarkSuccess(), the mark card id is diff from current id!");
        }
    }

    /* renamed from: Q7 */
    public final void mo23351Q7(boolean z) {
        if (z) {
            this.f51746d = C89779i0.m112248e(this, getString(C0966R.string.gas), true, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        C89779i0 i0Var = this.f51746d;
        if (i0Var != null && i0Var.isShowing()) {
            this.f51746d.dismiss();
            this.f51746d = null;
        }
    }

    /* renamed from: R7 */
    public final void mo23352R7() {
        C20483c cVar;
        if (!this.f51737I && (cVar = this.f51748f) != null) {
            this.f51737I = true;
            if (this.f51756q) {
                C115669n.INSTANCE.mo160131h(11324, "ShareCardDetailUI", Integer.valueOf(cVar.mo23264L0().f64141i), this.f51748f.mo23270R0(), this.f51748f.getCardId(), 0, Integer.valueOf(this.f51732D), this.f51750h, Integer.valueOf(this.f51748f.mo23277X0() ? 1 : 0), "");
                return;
            }
            C115669n.INSTANCE.mo160131h(11324, "CardDetailView", Integer.valueOf(cVar.mo23264L0().f64141i), this.f51748f.mo23270R0(), this.f51748f.getCardId(), 0, Integer.valueOf(this.f51732D), this.f51750h, Integer.valueOf(this.f51748f.mo23277X0() ? 1 : 0), "");
        }
    }

    /* renamed from: S7 */
    public final void mo23353S7() {
        C86709a0.m107529k().f251779b.mo123470p(1057, this);
        C86709a0.m107529k().f251779b.mo123470p(1037, this);
        C86709a0.m107529k().f251779b.mo123470p(1058, this);
        C86709a0.m107529k().f251779b.mo123470p(1045, this);
        C86709a0.m107529k().f251779b.mo123470p(C87552j.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123470p(1099, this);
        C86709a0.m107529k().f251779b.mo123470p(C82613z.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123470p(1051, this);
        C86709a0.m107529k().f251779b.mo123470p(C83113m.CTRL_INDEX, this);
    }

    /* renamed from: V6 */
    public void mo23307V6(String str) {
        C22286g gVar = this.f51747e.f51798f;
        if (!(gVar == null ? false : ((C22280a) gVar).f63174d)) {
            Log.m105920e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onStartConsumedSuccUI");
            return;
        }
        Log.m105924i("MicroMsg.CardDetailUI", "onStartConsumedSuccUI");
        this.f51764y.post(new C18564e(str));
    }

    /* renamed from: W5 */
    public void mo23308W5() {
        Log.m105924i("MicroMsg.CardDetailUI", "onVibrate");
        this.f51734F.vibrate(300);
    }

    /* renamed from: d2 */
    public void mo23354d2(String str, C45991n.C45994c cVar, String str2) {
        if (TextUtils.isEmpty(str) || str.equals(this.f51749g)) {
            Log.m105924i("MicroMsg.CardDetailUI", "onMarkFail()");
            this.f51757r = false;
            this.f51758s = false;
            mo23351Q7(false);
            if (TextUtils.isEmpty(str2)) {
                str2 = getString(C0966R.string.azl);
            }
            C53248d.m59683c(this, str2);
            return;
        }
        Log.m105920e("MicroMsg.CardDetailUI", "onMarkFail(), the mark card id is diff from current id!");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6708md;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x02a7, code lost:
        r4 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, "msg", (java.lang.String) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x05ef  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x067b  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0681  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x069b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<ts.c> r1 = p702ts.C78085c.class
            com.tencent.mm.plugin.card.ui.CardDetailUI$b r2 = new com.tencent.mm.plugin.card.ui.CardDetailUI$b
            r2.<init>()
            r0.setBackBtn(r2)
            java.lang.String r2 = "vibrator"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.os.Vibrator r2 = (android.os.Vibrator) r2
            r0.f51734F = r2
            r2 = 2131298760(0x7f0909c8, float:1.8215502E38)
            android.view.View r2 = r0.findViewById(r2)
            r0.f51762w = r2
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r2 = r0.f51747e
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = -1
            if (r2 != 0) goto L_0x018b
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r2 = new com.tencent.mm.plugin.card.ui.CardDetailUIContoller
            android.view.View r7 = r18.getContentView()
            r2.<init>(r0, r7)
            r0.f51747e = r2
            com.tencent.mm.plugin.card.ui.g0 r7 = new com.tencent.mm.plugin.card.ui.g0
            com.tencent.mm.ui.MMActivity r8 = r2.f51797e
            r7.<init>(r8)
            r2.f51774C = r7
            com.tencent.mm.ui.MMActivity r8 = r7.f51919a
            android.view.Window r8 = r8.getWindow()
            android.view.WindowManager$LayoutParams r8 = r8.getAttributes()
            float r8 = r8.screenBrightness
            r7.f51933o = r8
            nj3.s0 r8 = r7.f51924f
            if (r8 == 0) goto L_0x0050
            goto L_0x00d6
        L_0x0050:
            com.tencent.mm.ui.MMActivity r8 = r7.f51919a
            r9 = 2131493528(0x7f0c0298, float:1.8610539E38)
            android.view.View r8 = android.view.View.inflate(r8, r9, r4)
            r9 = 2131311103(0x7f0939ff, float:1.8240537E38)
            android.view.View r9 = r8.findViewById(r9)
            r7.f51925g = r9
            r9 = 2131311102(0x7f0939fe, float:1.8240535E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r7.f51926h = r9
            r9 = 2131311105(0x7f093a01, float:1.824054E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r7.f51927i = r9
            r9 = 2131311104(0x7f093a00, float:1.8240539E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r7.f51928j = r9
            r9 = 2131311099(0x7f0939fb, float:1.8240529E38)
            android.view.View r9 = r8.findViewById(r9)
            r7.f51929k = r9
            r9 = 2131311098(0x7f0939fa, float:1.8240527E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r7.f51930l = r9
            r9 = 2131316120(0x7f094d98, float:1.8250713E38)
            android.view.View r9 = r8.findViewById(r9)
            com.tencent.mm.ui.base.MMVerticalTextView r9 = (com.tencent.p014mm.p136ui.base.MMVerticalTextView) r9
            r7.f51931m = r9
            r9 = 2131316121(0x7f094d99, float:1.8250715E38)
            android.view.View r9 = r8.findViewById(r9)
            com.tencent.mm.ui.base.MMVerticalTextView r9 = (com.tencent.p014mm.p136ui.base.MMVerticalTextView) r9
            r7.f51932n = r9
            com.tencent.mm.plugin.card.ui.h0 r9 = new com.tencent.mm.plugin.card.ui.h0
            r9.<init>(r7)
            r8.setOnClickListener(r9)
            nj3.s0 r9 = new nj3.s0
            r9.<init>(r8, r6, r6, r5)
            r7.f51924f = r9
            r9.update()
            nj3.s0 r8 = r7.f51924f
            android.graphics.drawable.ColorDrawable r9 = new android.graphics.drawable.ColorDrawable
            r10 = 16777215(0xffffff, float:2.3509886E-38)
            r9.<init>(r10)
            r8.setBackgroundDrawable(r9)
            nj3.s0 r8 = r7.f51924f
            com.tencent.mm.plugin.card.ui.i0 r9 = new com.tencent.mm.plugin.card.ui.i0
            r9.<init>(r7)
            r8.setOnDismissListener(r9)
        L_0x00d6:
            com.tencent.mm.ui.MMActivity r7 = r2.f51797e
            java.lang.String r8 = ""
            r7.setMMTitle((java.lang.String) r8)
            com.tencent.mm.ui.MMActivity r7 = r2.f51797e
            android.content.res.Resources r8 = r7.getResources()
            r9 = 2131101833(0x7f060889, float:1.7816087E38)
            int r8 = r8.getColor(r9)
            r7.setActionbarColor(r8)
            gz0.g r7 = new gz0.g
            com.tencent.mm.ui.MMActivity r8 = r2.f51797e
            r7.<init>(r8)
            r2.f51779H = r7
            com.tencent.mm.ui.MMActivity r7 = r2.f51797e
            r7.mmSetOnActivityResultCallback(r2)
            com.tencent.mm.sdk.event.IListener r2 = r2.f51795Y
            r2.alive()
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r2 = r0.f51747e
            vz0.l r7 = r2.f51799g
            if (r7 != 0) goto L_0x0110
            vz0.b0 r7 = new vz0.b0
            r7.<init>()
            r2.f51799g = r7
            r7.mo35968a(r2)
        L_0x0110:
            vz0.l r7 = r2.f51801i
            if (r7 != 0) goto L_0x011e
            vz0.s r7 = new vz0.s
            r7.<init>()
            r2.f51801i = r7
            r7.mo35968a(r2)
        L_0x011e:
            vz0.l r7 = r2.f51802j
            if (r7 != 0) goto L_0x012c
            vz0.a r7 = new vz0.a
            r7.<init>()
            r2.f51802j = r7
            r7.mo35968a(r2)
        L_0x012c:
            r7 = 2131298932(0x7f090a74, float:1.8215851E38)
            android.view.View r8 = r2.f51796d
            android.view.View r7 = r8.findViewById(r7)
            android.widget.ListView r7 = (android.widget.ListView) r7
            r2.f51806q = r7
            com.tencent.mm.plugin.card.ui.l0 r7 = new com.tencent.mm.plugin.card.ui.l0
            com.tencent.mm.ui.MMActivity r8 = r2.f51797e
            androidx.appcompat.app.AppCompatActivity r8 = r8.getContext()
            r7.<init>(r8)
            r2.f51807r = r7
            android.widget.ListView r8 = r2.f51806q
            r8.setAdapter(r7)
            com.tencent.mm.plugin.card.ui.l0 r7 = r2.f51807r
            r7.notifyDataSetChanged()
            android.widget.ListView r7 = r2.f51806q
            com.tencent.mm.plugin.card.ui.g r8 = new com.tencent.mm.plugin.card.ui.g
            r8.<init>(r2)
            r7.setOnItemClickListener(r8)
            java.lang.String r7 = "MicroMsg.CardDetailUIContoller"
            java.lang.String r8 = "initMenu"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            com.tencent.mm.ui.MMActivity r7 = r2.f51797e
            com.tencent.mm.plugin.card.ui.h r8 = new com.tencent.mm.plugin.card.ui.h
            r8.<init>(r2)
            r9 = 2131756370(0x7f100552, float:1.9143646E38)
            r7.addIconOptionMenu(r3, r9, r8)
            r7 = 2131305941(0x7f0925d5, float:1.8230067E38)
            android.view.View r8 = r2.f51796d
            android.view.View r7 = r8.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r2.f51804o = r7
            vz0.e r7 = new vz0.e
            r7.<init>()
            r2.f51772A = r7
            r7.mo35968a(r2)
            com.tencent.mm.plugin.card.ui.g0 r7 = r2.f51774C
            dz0.c r2 = r2.f51776E
            r7.f51935q = r2
        L_0x018b:
            android.content.Intent r2 = r18.getIntent()
            java.lang.String r7 = "key_from_scene"
            int r2 = r2.getIntExtra(r7, r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6[r3] = r7
            java.lang.String r7 = "MicroMsg.CardDetailUI"
            java.lang.String r8 = "scene:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
            java.lang.String r6 = "key_card_app_msg"
            r8 = 2
            java.lang.String r10 = ".msg.appmsg.fromusername"
            java.lang.String r11 = "msg"
            r12 = 15
            r13 = 21
            r14 = 17
            r15 = 4
            r9 = 5
            r3 = 6
            if (r2 == r8) goto L_0x0462
            if (r2 == r3) goto L_0x0462
            if (r2 != r9) goto L_0x01bd
            goto L_0x0462
        L_0x01bd:
            boolean r17 = wz0.C22945n.m27023w(r2)
            java.lang.String r9 = "key_template_id"
            java.lang.String r3 = "key_card_ext"
            r8 = 3
            java.lang.String r4 = "key_card_id"
            if (r17 != 0) goto L_0x037e
            if (r2 == 0) goto L_0x037e
            if (r2 == r5) goto L_0x037e
            if (r2 == r8) goto L_0x037e
            if (r2 == r15) goto L_0x037e
            r15 = 9
            if (r2 == r15) goto L_0x037e
            r15 = 12
            if (r2 == r15) goto L_0x037e
            if (r2 == r12) goto L_0x037e
            if (r2 == r14) goto L_0x037e
            if (r2 != r13) goto L_0x01e2
            goto L_0x037e
        L_0x01e2:
            r15 = 50
            r12 = 51
            r13 = 27
            java.lang.String r14 = "key_previous_scene"
            r5 = 26
            if (r2 == r15) goto L_0x02ba
            if (r2 != r13) goto L_0x01f2
            goto L_0x02ba
        L_0x01f2:
            if (r2 != r12) goto L_0x0254
            android.content.Intent r2 = r18.getIntent()
            int r2 = r2.getIntExtra(r14, r12)
            if (r2 != r5) goto L_0x0201
            r0.f51730B = r5
            goto L_0x0203
        L_0x0201:
            r0.f51730B = r8
        L_0x0203:
            android.content.Intent r2 = r18.getIntent()
            java.lang.String r2 = r2.getStringExtra(r4)
            r0.f51749g = r2
            gz0.f r2 = hz0.C46153l0.yx0()
            com.tencent.mm.plugin.card.model.CardInfo r2 = r2.f124011b
            r0.f51748f = r2
            if (r2 != 0) goto L_0x0223
            hz0.c r2 = hz0.C46153l0.Gx0()
            java.lang.String r3 = r0.f51749g
            com.tencent.mm.plugin.card.model.CardInfo r2 = r2.mo71595Lo(r3)
            r0.f51748f = r2
        L_0x0223:
            r18.mo23346M7()
            dz0.c r2 = r0.f51748f
            if (r2 != 0) goto L_0x0234
            java.lang.String r2 = "initData, mCardId is null from scene == ConstantsProtocal.MM_CARD_ITEM_FROM_SCENE_VIEW_UI"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
            r18.mo23356q()
            goto L_0x0665
        L_0x0234:
            r18.mo23341H7()
            r18.mo23343J7()
            r18.mo23352R7()
            dz0.c r2 = r0.f51748f
            boolean r2 = r2.mo23278d0()
            if (r2 == 0) goto L_0x0665
            gz0.d r2 = hz0.C46153l0.wx0()
            dz0.c r3 = r0.f51748f
            java.lang.String r3 = r3.getCardId()
            r2.mo32569a(r3)
            goto L_0x0665
        L_0x0254:
            if (r2 != r5) goto L_0x026e
            r0.f51730B = r2
            android.content.Intent r5 = r18.getIntent()
            java.lang.String r4 = r5.getStringExtra(r4)
            r0.f51749g = r4
            android.content.Intent r4 = r18.getIntent()
            java.lang.String r3 = r4.getStringExtra(r3)
            r0.f51752j = r3
            goto L_0x04db
        L_0x026e:
            r0.f51730B = r2
            android.content.Intent r5 = r18.getIntent()
            java.lang.String r5 = r5.getStringExtra(r6)
            hz0.d r6 = wz0.C22944i.m26987d(r5)
            if (r6 == 0) goto L_0x028b
            java.lang.String r3 = r6.f59509b
            r0.f51749g = r3
            java.lang.String r3 = r6.f59508a
            r0.f51750h = r3
            java.lang.String r3 = r6.f59515h
            r0.f51752j = r3
            goto L_0x029f
        L_0x028b:
            android.content.Intent r6 = r18.getIntent()
            java.lang.String r4 = r6.getStringExtra(r4)
            r0.f51749g = r4
            android.content.Intent r4 = r18.getIntent()
            java.lang.String r3 = r4.getStringExtra(r3)
            r0.f51752j = r3
        L_0x029f:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x02a7
        L_0x02a5:
            r4 = 0
            goto L_0x02b6
        L_0x02a7:
            r3 = 0
            java.util.Map r4 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r11, r3)
            if (r4 != 0) goto L_0x02af
            goto L_0x02a5
        L_0x02af:
            java.lang.Object r3 = r4.get(r10)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
        L_0x02b6:
            r0.f51751i = r4
            goto L_0x04db
        L_0x02ba:
            android.content.Intent r2 = r18.getIntent()
            int r2 = r2.getIntExtra(r14, r15)
            r0.f51730B = r2
            if (r2 == r5) goto L_0x02ca
            if (r2 == r13) goto L_0x02ca
            r0.f51730B = r8
        L_0x02ca:
            android.content.Intent r2 = r18.getIntent()
            java.lang.String r2 = r2.getStringExtra(r9)
            r0.f51760u = r2
            int r2 = r0.f51730B
            if (r2 != r13) goto L_0x0314
            android.content.Intent r2 = r18.getIntent()
            java.lang.String r3 = "key_card_info"
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            dz0.c r2 = (dz0.C20483c) r2
            if (r2 == 0) goto L_0x030c
            r0.f51748f = r2
            java.lang.String r2 = r2.getCardId()
            r0.f51749g = r2
            r18.mo23346M7()
            r18.mo23341H7()
            dz0.c r2 = r0.f51748f
            boolean r2 = r2.mo23278d0()
            if (r2 == 0) goto L_0x0309
            gz0.d r2 = hz0.C46153l0.wx0()
            dz0.c r3 = r0.f51748f
            java.lang.String r3 = r3.getCardId()
            r2.mo32569a(r3)
        L_0x0309:
            r18.mo23343J7()
        L_0x030c:
            r18.mo23352R7()
            wz0.C22945n.m26997J()
            goto L_0x0665
        L_0x0314:
            android.content.Intent r2 = r18.getIntent()
            java.lang.String r3 = "card_list"
            java.lang.String r2 = r2.getStringExtra(r3)
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_app_id"
            java.lang.String r3 = r3.getStringExtra(r4)
            int r4 = r0.f51730B
            java.util.LinkedList r2 = wz0.C53262l.m59699a(r2, r4, r3)
            if (r2 == 0) goto L_0x0371
            int r3 = r2.size()
            if (r3 != 0) goto L_0x0337
            goto L_0x0371
        L_0x0337:
            r3 = 1
            r0.mo23351Q7(r3)
            r4 = 0
            java.lang.Object r5 = r2.get(r4)
            te3.lo r5 = (te3.C50289lo) r5
            java.lang.String r5 = r5.f137530d
            r0.f51749g = r5
            android.content.Intent r5 = r18.getIntent()
            int r5 = r5.getIntExtra(r14, r12)
            te3.xa4 r6 = new te3.xa4
            r6.<init>()
            java.lang.String r8 = r0.f51760u
            r6.f144572d = r8
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r4] = r8
            java.lang.String r3 = "doBatchGetCardItemByTpInfo templateId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r9)
            hz0.t r3 = new hz0.t
            java.lang.String r4 = r0.f51749g
            r3.<init>(r2, r6, r5, r4)
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r2.mo123460f(r3)
            goto L_0x0379
        L_0x0371:
            java.lang.String r2 = "initData tempList size is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
            r18.mo23356q()
        L_0x0379:
            r18.mo23346M7()
            goto L_0x0665
        L_0x037e:
            r0.f51730B = r2
            android.content.Intent r5 = r18.getIntent()
            java.lang.String r4 = r5.getStringExtra(r4)
            r0.f51749g = r4
            android.content.Intent r4 = r18.getIntent()
            java.lang.String r3 = r4.getStringExtra(r3)
            r0.f51752j = r3
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_is_share_card"
            r5 = 0
            boolean r3 = r3.getBooleanExtra(r4, r5)
            r0.f51756q = r3
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_stastic_scene"
            int r3 = r3.getIntExtra(r4, r5)
            r0.f51731C = r3
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_consumed_card_id"
            java.lang.String r3 = r3.getStringExtra(r4)
            r0.f51755p = r3
            r3 = 7
            if (r2 == r3) goto L_0x043d
            r3 = 16
            if (r2 != r3) goto L_0x03c2
            goto L_0x043d
        L_0x03c2:
            boolean r3 = r0.f51756q
            if (r3 == 0) goto L_0x042a
            if (r2 != r8) goto L_0x042a
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_card_tp_id"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.lang.String r4 = r0.f51749g
            java.lang.String r5 = "MicroMsg.ShareCardDataMgr"
            java.lang.String r6 = "initShareUserCardId()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            if (r3 == 0) goto L_0x0421
            java.util.ArrayList r3 = oz0.C47407b.m52745h(r3)
            int r6 = r3.size()
            if (r6 <= 0) goto L_0x041b
            r6 = 0
            java.lang.Object r3 = r3.get(r6)
            pz0.q r3 = (pz0.C47725q) r3
            if (r3 == 0) goto L_0x0415
            java.util.ArrayList<java.lang.String> r8 = r3.f128232d
            if (r8 == 0) goto L_0x0415
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0415
            java.util.ArrayList<java.lang.String> r8 = r3.f128232d
            java.lang.Object r8 = r8.get(r6)
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x0415
            java.util.ArrayList<java.lang.String> r3 = r3.f128232d
            java.lang.Object r3 = r3.get(r6)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = "initShareUserCardId(), mCardId is not first!, reset it"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            goto L_0x0426
        L_0x0415:
            java.lang.String r3 = "initShareUserCardId(), mCardId is first!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            goto L_0x0426
        L_0x041b:
            java.lang.String r3 = "initShareUserCardId(), shareUserInfoList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
            goto L_0x0426
        L_0x0421:
            java.lang.String r3 = "initShareUserCardId(), card_tp_id is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
        L_0x0426:
            r0.f51749g = r4
            goto L_0x04db
        L_0x042a:
            r3 = 8
            if (r2 != r3) goto L_0x04db
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_is_sms_add_card"
            r5 = 0
            boolean r3 = r3.getBooleanExtra(r4, r5)
            r0.f51733E = r3
            goto L_0x04db
        L_0x043d:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "src_username"
            java.lang.String r3 = r3.getStringExtra(r4)
            r0.f51753n = r3
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "js_url"
            java.lang.String r3 = r3.getStringExtra(r4)
            r0.f51754o = r3
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r3 = r3.getStringExtra(r9)
            r0.f51760u = r3
            goto L_0x04db
        L_0x0462:
            r0.f51730B = r2
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r3 = r3.getStringExtra(r6)
            hz0.d r4 = wz0.C22944i.m26987d(r3)
            if (r4 == 0) goto L_0x04c2
            java.lang.String r5 = r4.f59509b
            r0.f51749g = r5
            java.lang.String r5 = r4.f59508a
            r0.f51750h = r5
            java.lang.String r5 = r4.f59515h
            r0.f51752j = r5
            int r5 = r4.f59516i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "scene is "
            r6.append(r8)
            r6.append(r2)
            java.lang.String r8 = ", isRecommend is "
            r6.append(r8)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            r6 = 1
            if (r5 != r6) goto L_0x04a7
            r5 = 2
            if (r2 != r5) goto L_0x04a7
            r5 = 23
            r0.f51730B = r5
        L_0x04a7:
            java.lang.String r4 = r4.f59517j
            r0.f51761v = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "recommend_card_id is "
            r4.append(r5)
            java.lang.String r5 = r0.f51761v
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
        L_0x04c2:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x04ca
            r4 = 0
            goto L_0x04d9
        L_0x04ca:
            r4 = 0
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r11, r4)
            if (r3 != 0) goto L_0x04d2
            goto L_0x04d9
        L_0x04d2:
            java.lang.Object r3 = r3.get(r10)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
        L_0x04d9:
            r0.f51751i = r4
        L_0x04db:
            r18.mo23346M7()
            java.lang.String r3 = r0.f51749g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x04f0
            java.lang.String r2 = "initData, mCardId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
            r18.mo23356q()
            goto L_0x0665
        L_0x04f0:
            r3 = 2
            if (r2 == r3) goto L_0x0545
            r3 = 6
            if (r2 == r3) goto L_0x0545
            r3 = 4
            if (r2 != r3) goto L_0x04fd
            boolean r3 = r0.f51756q
            if (r3 == 0) goto L_0x0545
        L_0x04fd:
            r3 = 5
            if (r2 == r3) goto L_0x0545
            r3 = 17
            if (r2 == r3) goto L_0x0545
            r3 = 21
            if (r2 == r3) goto L_0x0545
            r3 = 23
            if (r2 != r3) goto L_0x050d
            goto L_0x0545
        L_0x050d:
            r3 = 15
            if (r2 != r3) goto L_0x0526
            gz0.f r2 = hz0.C46153l0.yx0()
            java.lang.String r3 = "key_accept_card_info"
            java.lang.Object r2 = r2.mo71382a(r3)
            if (r2 == 0) goto L_0x0545
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.card.model.CardInfo
            if (r3 == 0) goto L_0x0545
            com.tencent.mm.plugin.card.model.CardInfo r2 = (com.tencent.p014mm.plugin.card.model.CardInfo) r2
            r0.f51748f = r2
            goto L_0x0543
        L_0x0526:
            boolean r2 = r0.f51756q
            if (r2 == 0) goto L_0x0537
            pz0.j r2 = hz0.C46153l0.Lx0()
            java.lang.String r3 = r0.f51749g
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r2 = r2.mo72543jo(r3)
            r0.f51748f = r2
            goto L_0x0543
        L_0x0537:
            hz0.c r2 = hz0.C46153l0.Gx0()
            java.lang.String r3 = r0.f51749g
            com.tencent.mm.plugin.card.model.CardInfo r2 = r2.mo71595Lo(r3)
            r0.f51748f = r2
        L_0x0543:
            r2 = 0
            goto L_0x0546
        L_0x0545:
            r2 = 1
        L_0x0546:
            java.lang.String r3 = " isShareCard is "
            if (r2 != 0) goto L_0x05f6
            dz0.c r4 = r0.f51748f
            if (r4 != 0) goto L_0x0550
            goto L_0x05f6
        L_0x0550:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "initData(), cardId = "
            r4.append(r5)
            java.lang.String r5 = r0.f51749g
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r4)
            dz0.c r4 = r0.f51748f
            te3.co r4 = r4.mo23260A1()
            if (r4 == 0) goto L_0x0578
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.f51729A = r5
            r5.add(r4)
        L_0x0578:
            r18.mo23343J7()
            dz0.c r4 = r0.f51748f
            boolean r4 = r4.mo23278d0()
            if (r4 == 0) goto L_0x0590
            gz0.d r4 = hz0.C46153l0.wx0()
            dz0.c r5 = r0.f51748f
            java.lang.String r5 = r5.getCardId()
            r4.mo32569a(r5)
        L_0x0590:
            boolean r4 = r0.f51756q
            if (r4 == 0) goto L_0x0598
            r4 = 1
            r0.f51735G = r4
            goto L_0x05c5
        L_0x0598:
            long r4 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r8
            int r5 = (int) r4
            long r4 = (long) r5
            dz0.c r6 = r0.f51748f
            long r8 = r6.mo23290n0()
            long r4 = r4 - r8
            r8 = 86400(0x15180, double:4.26873E-319)
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x05b2
            r16 = 1
            goto L_0x05b4
        L_0x05b2:
            r16 = 0
        L_0x05b4:
            if (r16 == 0) goto L_0x05ba
            r4 = 1
            r0.f51735G = r4
            goto L_0x05c5
        L_0x05ba:
            r4 = 1
            dz0.c r5 = r0.f51748f
            boolean r5 = r5.mo23276W1()
            if (r5 == 0) goto L_0x05c6
            r0.f51735G = r4
        L_0x05c5:
            r2 = 1
        L_0x05c6:
            if (r2 == 0) goto L_0x05ef
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "initData fail, isNeedDoNetScene2 is true or no cardinfo with cardId = "
            r2.append(r4)
            java.lang.String r4 = r0.f51749g
            r2.append(r4)
            r2.append(r3)
            boolean r3 = r0.f51756q
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            boolean r2 = r0.f51756q
            if (r2 == 0) goto L_0x05eb
            goto L_0x05f2
        L_0x05eb:
            r18.mo23342I7()
            goto L_0x05f2
        L_0x05ef:
            r18.mo23341H7()
        L_0x05f2:
            r18.mo23352R7()
            goto L_0x0665
        L_0x05f6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "initData fail, isNeedDoNetScene1 is true or no cardinfo with cardId = "
            r2.append(r4)
            java.lang.String r4 = r0.f51749g
            r2.append(r4)
            r2.append(r3)
            boolean r3 = r0.f51756q
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            r2 = 1
            r0.mo23351Q7(r2)
            android.view.View r2 = r0.f51762w
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r11.mo10233c(r4)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/card/ui/CardDetailUI"
            java.lang.String r6 = "initData"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r2
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = 0
            java.lang.Object r3 = r11.mo10231a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/card/ui/CardDetailUI"
            java.lang.String r5 = "initData"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r2
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = r0.f51756q
            if (r2 == 0) goto L_0x0662
            goto L_0x0665
        L_0x0662:
            r18.mo23342I7()
        L_0x0665:
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r2 = r0.f51747e
            dz0.c r3 = r0.f51748f
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller$g r4 = r0.f51765z
            java.util.ArrayList<te3.co> r5 = r0.f51729A
            r2.f51776E = r3
            r2.f51791U = r4
            r2.f51777F = r5
            if (r3 == 0) goto L_0x0681
            boolean r3 = r3.mo23284h()
            if (r3 == 0) goto L_0x0681
            com.tencent.mm.plugin.card.ui.l0 r2 = r2.f51807r
            r3 = 1
            r2.f51950g = r3
            goto L_0x0682
        L_0x0681:
            r3 = 1
        L_0x0682:
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r2 = r0.f51747e
            com.tencent.mm.plugin.card.ui.CardDetailUI$c r4 = new com.tencent.mm.plugin.card.ui.CardDetailUI$c
            r4.<init>()
            r2.f51790T = r4
            r0.f51738J = r3
            di3.d r2 = di3.C86312j.m106911c(r1)
            ts.c r2 = (p702ts.C78085c) r2
            cc0.b r2 = r2.mo108056ms()
            r0.f51740L = r2
            if (r2 != 0) goto L_0x06a7
            di3.d r1 = di3.C86312j.m106911c(r1)
            ts.c r1 = (p702ts.C78085c) r1
            cc0.b r1 = r1.mo108056ms()
            r0.f51740L = r1
        L_0x06a7:
            r18.mo23348O7()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.CardDetailUI.initView():void");
    }

    /* renamed from: k1 */
    public void mo23309k1(C20483c cVar) {
        if (cVar == null) {
            Log.m105920e("MicroMsg.CardDetailUI", "cardInfo is empty, not to do onDataChange");
            return;
        }
        C20483c cVar2 = this.f51748f;
        if (cVar2 == null || !cVar2.getCardId().equals(cVar.getCardId())) {
            Log.m105920e("MicroMsg.CardDetailUI", "is not the same card, not to do onDataChange");
            return;
        }
        C22286g gVar = this.f51747e.f51798f;
        if (!(gVar == null ? false : ((C22280a) gVar).f63174d)) {
            Log.m105920e("MicroMsg.CardDetailUI", "because the card is not accept, not to do onDataChange");
            return;
        }
        Log.m105924i("MicroMsg.CardDetailUI", "onDataChange");
        this.f51748f = cVar;
        this.f51749g = cVar.getCardId();
        if (this.f51748f.mo23278d0() && C46153l0.wx0().mo32571c()) {
            C46153l0.wx0().mo32569a(this.f51748f.getCardId());
        }
        mo23343J7();
    }

    /* renamed from: l6 */
    public void mo23355l6(String str, C45991n.C45994c cVar) {
        if (TextUtils.isEmpty(str) || str.equals(this.f51749g)) {
            mo23351Q7(false);
            Log.m105924i("MicroMsg.CardDetailUI", "onMarkSuccess()");
            Log.m105924i("MicroMsg.CardDetailUI", "markSucc:" + cVar.f124028b + " markCardId: " + cVar.f124029c);
            this.f51758s = false;
            if (cVar.f124028b != 1) {
                this.f51757r = false;
                C53248d.m59683c(this, getString(C0966R.string.azm));
            } else if (TextUtils.isEmpty(cVar.f124029c) || this.f51748f.getCardId().equals(cVar.f124029c)) {
                Log.m105924i("MicroMsg.CardDetailUI", "markCardId is same as now id!");
                this.f51757r = true;
                if (this.f51747e.f51792V) {
                    Log.m105924i("MicroMsg.CardDetailUI", "UI is pause, not to jumpMarkUI()");
                    return;
                }
                Log.m105924i("MicroMsg.CardDetailUI", "jumpMarkUI()");
                this.f51747e.mo23365e(this.f51759t, cVar, true);
            } else {
                Log.m105924i("MicroMsg.CardDetailUI", "markCardId is diff as now id!");
                if (this.f51748f.mo23272T0()) {
                    ShareCardInfo jo = C46153l0.Lx0().mo72543jo(cVar.f124029c);
                    if (jo != null) {
                        this.f51748f = jo;
                        this.f51749g = cVar.f124029c;
                        mo23343J7();
                        C45985e xx02 = C46153l0.xx0();
                        C20483c cVar2 = this.f51748f;
                        xx02.f124007i = cVar2;
                        if (xx02.f124008j && cVar2 != null && cVar2.getCardId() != null && !cVar2.getCardId().equals(xx02.f124007i.getCardId())) {
                            xx02.f124008j = false;
                        }
                        if (xx02.f124003e != null) {
                            for (int i = 0; i < ((ArrayList) xx02.f124003e).size(); i++) {
                                WeakReference weakReference = (WeakReference) ((ArrayList) xx02.f124003e).get(i);
                                if (weakReference != null) {
                                    C45985e.C45986a aVar = (C45985e.C45986a) weakReference.get();
                                    Boolean bool = xx02.f124004f.get(aVar);
                                    if (!(aVar == null || bool == null || bool.booleanValue())) {
                                        aVar.mo23309k1(cVar2);
                                    }
                                }
                            }
                        }
                        Log.m105924i("MicroMsg.CardDetailUI", "update the mCardInfo");
                        this.f51757r = true;
                        if (this.f51747e.f51792V) {
                            Log.m105924i("MicroMsg.CardDetailUI", "UI is pause, not to jumpMarkUI()");
                            return;
                        }
                        Log.m105924i("MicroMsg.CardDetailUI", "jumpMarkUI()");
                        this.f51747e.mo23365e(this.f51759t, cVar, true);
                        return;
                    }
                    Log.m105920e("MicroMsg.CardDetailUI", "The mark card id not exist the card info in DB!， mark failed!");
                    C53248d.m59683c(this, getString(C0966R.string.azl));
                    this.f51757r = false;
                }
            }
        } else {
            Log.m105920e("MicroMsg.CardDetailUI", "onMarkSuccess(), the mark card id is diff from current id!");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f51736H = System.currentTimeMillis();
        mo23349P7();
        C45985e xx02 = C46153l0.xx0();
        AppCompatActivity context = getContext();
        xx02.getClass();
        C86709a0.m107529k().f251779b.mo123455a(C9464d.CTRL_INDEX, xx02);
        C46153l0.Kx0().mo60219d(xx02);
        C32626c vx02 = C46153l0.vx0();
        if (vx02.f86608h == null) {
            vx02.f86608h = new ArrayList();
        }
        ((ArrayList) vx02.f86608h).add(new WeakReference(xx02));
        xx02.f124002d = new WeakReference<>(context);
        C45985e xx03 = C46153l0.xx0();
        if (xx03.f124003e == null) {
            xx03.f124003e = new ArrayList();
        }
        ((ArrayList) xx03.f124003e).add(new WeakReference(this));
        C45991n Ax0 = C46153l0.Ax0();
        if (Ax0.f124017d == null) {
            Ax0.f124017d = new ArrayList();
        }
        ((ArrayList) Ax0.f124017d).add(new WeakReference(this));
        C20867d wx02 = C46153l0.wx0();
        wx02.getClass();
        C86709a0.m107529k().f251779b.mo123455a(577, wx02);
        wx02.f58958f.clear();
        wx02.f58959g = 0;
        C20867d wx03 = C46153l0.wx0();
        if (wx03.f58956d == null) {
            wx03.f58956d = new ArrayList();
        }
        ((ArrayList) wx03.f58956d).add(new WeakReference(this));
        initView();
    }

    public void onDestroy() {
        C20483c cVar;
        C45988h.C45990b bVar;
        C31352e eVar;
        C45985e xx02 = C46153l0.xx0();
        if (xx02.f124004f == null) {
            xx02.f124004f = new HashMap<>();
        }
        xx02.f124004f.remove(this);
        mo23353S7();
        C46153l0.xx0().mo71381f(this);
        C45985e xx03 = C46153l0.xx0();
        xx03.getClass();
        C86709a0.m107529k().f251779b.mo123470p(C9464d.CTRL_INDEX, xx03);
        C46153l0.Kx0().mo60220e(xx03);
        C32626c vx02 = C46153l0.vx0();
        if (vx02.f86608h != null) {
            int i = 0;
            while (true) {
                if (i < ((ArrayList) vx02.f86608h).size()) {
                    WeakReference weakReference = (WeakReference) ((ArrayList) vx02.f86608h).get(i);
                    if (weakReference != null && (eVar = (C31352e) weakReference.get()) != null && eVar.equals(xx03)) {
                        ((ArrayList) vx02.f86608h).remove(weakReference);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        ((ArrayList) xx03.f124003e).clear();
        xx03.f124004f.clear();
        xx03.f124006h.clear();
        xx03.f124008j = false;
        C46153l0.Ax0().mo71401f(this);
        C46153l0.wx0().mo32575g(this);
        C20867d wx02 = C46153l0.wx0();
        wx02.getClass();
        C86709a0.m107529k().f251779b.mo123470p(577, wx02);
        wx02.f58958f.clear();
        wx02.f58964o = false;
        wx02.f58957e = "";
        wx02.f58959g = 0;
        wx02.f58960h = 0;
        wx02.f58961i = 0;
        wx02.f58962j = 0;
        Log.m105924i("MicroMsg.CardCodeMgr", "stopRequestCodeTimer!");
        if (!wx02.f58965p.stopped()) {
            wx02.f58965p.stopTimer();
        }
        wx02.mo32574f();
        CardDetailUIContoller cardDetailUIContoller = this.f51747e;
        C20871g gVar = cardDetailUIContoller.f51779H;
        gVar.f58970b = null;
        ((ArrayList) gVar.f58972d).clear();
        cardDetailUIContoller.f51779H = null;
        C18596g0 g0Var = cardDetailUIContoller.f51774C;
        C22945n.m26993F(g0Var.f51923e);
        int size = g0Var.f51934p.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C22945n.m26993F(g0Var.f51934p.remove(size));
        }
        g0Var.f51934p.clear();
        if (g0Var.f51924f.isShowing()) {
            g0Var.f51924f.dismiss();
        }
        g0Var.f51924f = null;
        float f = g0Var.f51933o;
        WindowManager.LayoutParams attributes = g0Var.f51919a.getWindow().getAttributes();
        attributes.screenBrightness = f;
        g0Var.f51919a.getWindow().setAttributes(attributes);
        g0Var.f51919a = null;
        g0Var.f51935q = null;
        cardDetailUIContoller.f51774C = null;
        C23154i iVar = cardDetailUIContoller.f51803n;
        if (iVar != null) {
            C23145a aVar = (C23145a) iVar;
            aVar.f66477f = null;
            aVar.f66473b = null;
        }
        cardDetailUIContoller.f51797e.mmSetOnActivityResultCallback((MMActivity.C6739d) null);
        cardDetailUIContoller.f51795Y.dead();
        cardDetailUIContoller.f51799g.f65616a = null;
        cardDetailUIContoller.f51802j.f65616a = null;
        cardDetailUIContoller.f51801i.f65616a = null;
        cardDetailUIContoller.f51772A.f65616a = null;
        C22821l lVar = cardDetailUIContoller.f51773B;
        if (lVar != null) {
            C22813c cVar2 = (C22813c) lVar;
            cVar2.f65616a = null;
            cVar2.f65594e = null;
            cVar2.f65595f = null;
        }
        C22821l lVar2 = cardDetailUIContoller.f51809t;
        if (lVar2 != null) {
            lVar2.f65616a = null;
        }
        C22821l lVar3 = cardDetailUIContoller.f51808s;
        if (lVar3 != null) {
            lVar3.f65616a = null;
        }
        C22821l lVar4 = cardDetailUIContoller.f51810u;
        if (lVar4 != null) {
            lVar4.f65616a = null;
        }
        C22821l lVar5 = cardDetailUIContoller.f51811v;
        if (lVar5 != null) {
            lVar5.f65616a = null;
        }
        C22821l lVar6 = cardDetailUIContoller.f51812w;
        if (lVar6 != null) {
            lVar6.f65616a = null;
        }
        C22821l lVar7 = cardDetailUIContoller.f51813x;
        if (lVar7 != null) {
            lVar7.f65616a = null;
        }
        C22821l lVar8 = cardDetailUIContoller.f51814y;
        if (lVar8 != null) {
            lVar8.f65616a = null;
        }
        C22821l lVar9 = cardDetailUIContoller.f51815z;
        if (lVar9 != null) {
            lVar9.f65616a = null;
        }
        C22819h hVar = cardDetailUIContoller.f51805p;
        if (hVar != null) {
            hVar.mo35960f();
        }
        cardDetailUIContoller.f51798f = null;
        C45988h zx02 = C46153l0.zx0();
        if (zx02.f124012d != null) {
            int i2 = 0;
            while (true) {
                if (i2 < ((ArrayList) zx02.f124012d).size()) {
                    WeakReference weakReference2 = (WeakReference) ((ArrayList) zx02.f124012d).get(i2);
                    if (weakReference2 != null && (bVar = (C45988h.C45990b) weakReference2.get()) != null && bVar.equals(cardDetailUIContoller)) {
                        ((ArrayList) zx02.f124012d).remove(weakReference2);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        C45988h zx03 = C46153l0.zx0();
        zx03.f124014f = 0;
        zx03.mo71395l();
        Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", "removeNetSceneListener!");
        C86709a0.m107529k().f251779b.mo123470p(1382, zx03);
        C86709a0.m107529k().f251779b.mo123470p(1275, zx03);
        this.f51734F.cancel();
        C92411b bVar2 = this.f51740L;
        if (bVar2 != null) {
            bVar2.mo126408b(this.f51745R);
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f51736H;
        if (this.f51748f != null) {
            C115669n.INSTANCE.mo160131h(13219, "CardDetailView", Integer.valueOf(this.f51730B), this.f51748f.mo23270R0(), this.f51748f.getCardId(), Long.valueOf(currentTimeMillis));
        } else {
            C115669n nVar = C115669n.INSTANCE;
            String str = this.f51749g;
            nVar.mo160131h(13219, "CardDetailView", Integer.valueOf(this.f51730B), str, str, Long.valueOf(currentTimeMillis));
        }
        if ((this.f51757r || this.f51758s) && (cVar = this.f51748f) != null && cVar.mo23272T0()) {
            if (this.f51748f.mo23286i2()) {
                C46153l0.Ax0().mo71399d(this.f51749g, 0, 0, 2);
            } else {
                C46153l0.Ax0().mo71399d(this.f51749g, 0, 0, 1);
            }
        }
        C20872j jVar = this.f51744Q;
        jVar.getClass();
        Log.m105924i("MicroMsg.CardLbsOrBluetooth", "uninit");
        C20872j.C20874b bVar3 = jVar.f58987s;
        if (bVar3 != null) {
            if (bVar3.f58997e == null) {
                Log.m105920e("MicroMsg.CardLbsOrBluetooth", "bluetoothStateListener null, return");
            } else {
                MMApplicationContext.getContext().unregisterReceiver(bVar3.f58997e);
                bVar3.f58997e = null;
            }
            jVar.f58987s = null;
        }
        jVar.mo32585f();
        jVar.f58991w = null;
        jVar.f58975d = null;
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Log.m105920e("MicroMsg.CardDetailUI", "onKeyDown finishUI");
            mo23344K7(false, -1);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        mo23353S7();
        super.onPause();
        boolean z = true;
        this.f51747e.f51792V = true;
        C46153l0.xx0().mo71380e(this, false);
        ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
        C20872j jVar = this.f51744Q;
        if (!jVar.f58981j && !jVar.f58985q) {
            z = false;
        }
        if (z) {
            Log.m105924i("MicroMsg.CardLbsOrBluetooth", "stop");
            C20872j.C20874b bVar = jVar.f58987s;
            if (bVar != null) {
                bVar.mo32588c();
            }
            jVar.mo32585f();
            C86709a0.m107529k().f251779b.mo123470p(2574, jVar);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Class cls = C78085c.class;
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.CardDetailUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.CardDetailUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 69) {
            if (iArr[0] == 0) {
                Log.m105924i("MicroMsg.CardDetailUI", "onMPermissionGranted LocationPermissionGranted " + this.f51738J);
                if (!this.f51738J) {
                    this.f51738J = true;
                    C92411b ms = ((C78085c) C86312j.m106911c(cls)).mo108056ms();
                    this.f51740L = ms;
                    if (ms == null) {
                        this.f51740L = ((C78085c) C86312j.m106911c(cls)).mo108056ms();
                    }
                    mo23348O7();
                    return;
                }
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.bj_), false, new C2151d(), (DialogInterface.OnClickListener) null);
        }
    }

    public void onResume() {
        C53247c cVar = C53247c.CARDCODEREFRESHACTION_DOREFRESH;
        super.onResume();
        mo23349P7();
        mo23348O7();
        boolean z = false;
        this.f51747e.f51792V = false;
        ScreenShotUtil.setScreenShotCallback(this, this);
        C46153l0.xx0().mo71380e(this, true);
        if ((this.f51757r || this.f51758s) && this.f51748f.mo23272T0()) {
            if (this.f51748f.mo23286i2()) {
                C46153l0.Ax0().mo71399d(this.f51749g, 0, 0, 2);
                C45985e xx02 = C46153l0.xx0();
                Boolean bool = xx02.f124006h.get(this.f51749g);
                if (bool != null && bool.booleanValue()) {
                    z = true;
                }
                if (!z || TextUtils.isEmpty(C46153l0.xx0().f124009n)) {
                    Log.m105924i("MicroMsg.CardDetailUI", "onResume, not need launch succ ui or jsonRet is empty!");
                } else {
                    Log.m105924i("MicroMsg.CardDetailUI", "onResume, do launch succ UI!");
                    mo23307V6(C46153l0.xx0().f124009n);
                }
                this.f51747e.f51805p.mo35966l(cVar);
            } else {
                C46153l0.Ax0().mo71399d(this.f51749g, 0, 0, 1);
                C22819h hVar = this.f51747e.f51805p;
                if (hVar != null) {
                    hVar.mo35966l(cVar);
                }
            }
        }
        if (this.f51744Q.f58978g) {
            this.f51744Q.mo32583d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:273:0x074d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0275  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r21, int r22, java.lang.String r23, ob0.C117747y r24) {
        /*
            r20 = this;
            r7 = r20
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onSceneEnd, errType = "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r6 = " errCode = "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r8 = "MicroMsg.CardDetailUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            r4 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            if (r0 != 0) goto L_0x06eb
            if (r1 != 0) goto L_0x06eb
            r7.mo23351Q7(r4)
            android.view.View r0 = r7.f51762w
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r12)
            java.lang.Object[] r13 = r5.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/card/ui/CardDetailUI"
            java.lang.String r15 = "onSceneEnd"
            java.lang.String r16 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r0
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.setVisibility(r5)
            java.lang.String r13 = "com/tencent/mm/plugin/card/ui/CardDetailUI"
            java.lang.String r14 = "onSceneEnd"
            java.lang.String r15 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r3 instanceof hz0.C21039z
            java.lang.String r5 = "mCardId:%s, mCardTpId:%s is different, error"
            r12 = 3
            r13 = 1
            r14 = 2
            if (r0 == 0) goto L_0x012e
            r0 = r3
            hz0.z r0 = (hz0.C21039z) r0
            java.lang.String r0 = r0.f59531f
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0092
            java.lang.String r0 = "onSceneEnd, NetSceneGetCardItemInfo return json is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return
        L_0x0092:
            dz0.c r1 = r7.f51748f
            com.tencent.mm.plugin.card.model.CardInfo r2 = new com.tencent.mm.plugin.card.model.CardInfo
            r2.<init>()
            wz0.C22943h.m26972i(r2, r0)
            java.lang.String r0 = r2.field_card_id
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = r2.field_card_id
            r7.f51749g = r0
            goto L_0x00c9
        L_0x00a9:
            java.lang.String r0 = r2.field_card_id
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = r7.f51749g
            java.lang.String r3 = r2.field_card_tp_id
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00c9
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.String r1 = r7.f51749g
            r0[r4] = r1
            java.lang.String r1 = r2.field_card_tp_id
            r0[r13] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r5, r0)
            return
        L_0x00c9:
            r7.f51748f = r2
            r20.mo23341H7()
            int r0 = r7.f51730B
            if (r0 != r12) goto L_0x0102
            if (r1 == 0) goto L_0x00f3
            dz0.c r0 = r7.f51748f
            r2 = r0
            com.tencent.mm.plugin.card.model.CardInfo r2 = (com.tencent.p014mm.plugin.card.model.CardInfo) r2
            r3 = r1
            com.tencent.mm.plugin.card.model.CardInfo r3 = (com.tencent.p014mm.plugin.card.model.CardInfo) r3
            java.lang.String r4 = r3.field_stickyAnnouncement
            r2.field_stickyAnnouncement = r4
            int r4 = r3.field_stickyEndTime
            r2.field_stickyEndTime = r4
            int r4 = r3.field_stickyIndex
            r2.field_stickyIndex = r4
            java.lang.String r3 = r3.field_label_wording
            r2.field_label_wording = r3
            te3.co r1 = r1.mo23260A1()
            r0.mo23262G0(r1)
        L_0x00f3:
            boolean r0 = r7.f51735G
            if (r0 == 0) goto L_0x00fd
            dz0.c r0 = r7.f51748f
            wz0.C22945n.m27000M(r0)
            goto L_0x0102
        L_0x00fd:
            java.lang.String r0 = "onSceneEnd(), NetSceneGetCardItemInfo updateDataToDB is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x0102:
            r20.mo23343J7()
            r20.mo23352R7()
            dz0.c r0 = r7.f51748f
            boolean r0 = r0.mo23278d0()
            if (r0 == 0) goto L_0x011d
            gz0.d r0 = hz0.C46153l0.wx0()
            dz0.c r1 = r7.f51748f
            java.lang.String r1 = r1.getCardId()
            r0.mo32569a(r1)
        L_0x011d:
            gz0.j r1 = r7.f51744Q
            java.lang.String r3 = r7.f51749g
            dz0.c r4 = r7.f51748f
            float r5 = r7.f51741M
            float r6 = r7.f51742N
            r2 = r20
            r1.mo32581b(r2, r3, r4, r5, r6)
            goto L_0x075f
        L_0x012e:
            boolean r0 = r3 instanceof hz0.C21036o
            java.lang.String r14 = "key_code"
            r10 = 7
            r11 = 26
            r6 = 0
            r15 = -1
            if (r0 == 0) goto L_0x0293
            int r0 = r7.f51732D
            if (r0 != r11) goto L_0x0140
            r7.mo23351Q7(r4)
        L_0x0140:
            r0 = r3
            hz0.o r0 = (hz0.C21036o) r0
            java.lang.String r3 = r0.f59520f
            int r5 = r0.f59521g
            java.lang.String r0 = r0.f59522h
            if (r5 == 0) goto L_0x014f
            r7.mo23345L7(r1, r2, r5, r0)
            goto L_0x015d
        L_0x014f:
            android.content.res.Resources r0 = r20.getResources()
            r1 = 2131823003(0x7f11099b, float:1.9278793E38)
            java.lang.String r0 = r0.getString(r1)
            nj3.C76879j.m92726T(r7, r0)
        L_0x015d:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0169
            java.lang.String r0 = "onSceneEnd, NetSceneAcceptCardItem return json is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return
        L_0x0169:
            r7.f51730B = r12
            dz0.c r0 = r7.f51748f
            if (r0 != 0) goto L_0x0176
            com.tencent.mm.plugin.card.model.CardInfo r0 = new com.tencent.mm.plugin.card.model.CardInfo
            r0.<init>()
            r7.f51748f = r0
        L_0x0176:
            dz0.c r0 = r7.f51748f
            com.tencent.mm.plugin.card.model.CardInfo r0 = (com.tencent.p014mm.plugin.card.model.CardInfo) r0
            wz0.C22943h.m26972i(r0, r3)
            dz0.c r0 = r7.f51748f
            java.lang.String r0 = r0.getCardId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0191
            dz0.c r0 = r7.f51748f
            java.lang.String r0 = r0.getCardId()
            r7.f51749g = r0
        L_0x0191:
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r7.f51747e
            gz0.g r0 = r0.f51779H
            if (r0 != 0) goto L_0x0199
        L_0x0197:
            r1 = 0
            goto L_0x01a4
        L_0x0199:
            hz0.b r1 = r0.f58973e
            if (r1 != 0) goto L_0x019f
            r1 = 0
            goto L_0x01a1
        L_0x019f:
            boolean r1 = r1.f59504w
        L_0x01a1:
            if (r1 == 0) goto L_0x0197
            r1 = 1
        L_0x01a4:
            if (r1 != r13) goto L_0x01b0
            if (r0 != 0) goto L_0x01a9
            goto L_0x01b0
        L_0x01a9:
            hz0.b r0 = r0.f58973e
            if (r0 != 0) goto L_0x01ae
            goto L_0x01b0
        L_0x01ae:
            r0.f59503v = r4
        L_0x01b0:
            int r0 = r7.f51732D
            if (r0 == r11) goto L_0x01ba
            r20.mo23341H7()
            r20.mo23343J7()
        L_0x01ba:
            wz0.C22945n.m26997J()
            dz0.c r0 = r7.f51748f
            boolean r1 = r0.mo23291o()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            if (r1 == 0) goto L_0x01ee
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_IS_SHOW_MEMBERSHIP_TIP_INT_SYNC
            java.lang.Object r1 = r1.mo119685f(r3, r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x01e2
            int r1 = r1.intValue()
            if (r1 != r13) goto L_0x01e2
            goto L_0x0238
        L_0x01e2:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r1.mo119677K(r3, r2)
            goto L_0x0213
        L_0x01ee:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r3 = 282884(0x45104, float:3.96405E-40)
            java.lang.Object r1 = r1.mo119684e(r3, r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0208
            int r1 = r1.intValue()
            if (r1 != r13) goto L_0x0208
            goto L_0x0238
        L_0x0208:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r1.mo119676J(r3, r2)
        L_0x0213:
            boolean r1 = wz0.C22945n.m26988A()
            if (r1 == 0) goto L_0x0229
            r1 = 2131493543(0x7f0c02a7, float:1.861057E38)
            r2 = 2131823000(0x7f110998, float:1.9278787E38)
            te3.ko r0 = r0.mo23264L0()
            java.lang.String r0 = r0.f64156y
            wz0.C53248d.m59686f(r7, r1, r2, r0)
            goto L_0x0238
        L_0x0229:
            r1 = 2131493542(0x7f0c02a6, float:1.8610567E38)
            r2 = 2131822999(0x7f110997, float:1.9278785E38)
            te3.ko r0 = r0.mo23264L0()
            java.lang.String r0 = r0.f64156y
            wz0.C53248d.m59686f(r7, r1, r2, r0)
        L_0x0238:
            dz0.c r0 = r7.f51748f
            java.lang.String r0 = r0.mo23274W()
            r7.f51743P = r0
            int r0 = r7.f51732D
            if (r0 == r10) goto L_0x025d
            r1 = 16
            if (r0 != r1) goto L_0x0249
            goto L_0x025d
        L_0x0249:
            boolean r1 = r7.f51733E
            if (r1 != 0) goto L_0x0255
            r1 = 8
            if (r0 != r1) goto L_0x0255
            r20.mo23356q()
            goto L_0x026d
        L_0x0255:
            if (r0 != r11) goto L_0x026d
            if (r5 != 0) goto L_0x026d
            r20.mo23356q()
            goto L_0x026d
        L_0x025d:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r7.f51743P
            r0.putExtra(r14, r1)
            r7.setResult(r15, r0)
            r7.mo23347N7(r15)
        L_0x026d:
            dz0.c r0 = r7.f51748f
            boolean r0 = r0.mo23278d0()
            if (r0 == 0) goto L_0x0282
            gz0.d r0 = hz0.C46153l0.wx0()
            dz0.c r1 = r7.f51748f
            java.lang.String r1 = r1.getCardId()
            r0.mo32569a(r1)
        L_0x0282:
            gz0.j r1 = r7.f51744Q
            java.lang.String r3 = r7.f51749g
            dz0.c r4 = r7.f51748f
            float r5 = r7.f51741M
            float r6 = r7.f51742N
            r2 = r20
            r1.mo32581b(r2, r3, r4, r5, r6)
            goto L_0x075f
        L_0x0293:
            boolean r0 = r3 instanceof hz0.C46159v
            if (r0 == 0) goto L_0x0360
            r0 = r3
            hz0.v r0 = (hz0.C46159v) r0
            java.util.ArrayList<te3.co> r0 = r0.f124436g
            r7.f51729A = r0
            dz0.c r1 = r7.f51748f
            if (r1 == 0) goto L_0x030e
            if (r0 == 0) goto L_0x030e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x030e
            dz0.c r0 = r7.f51748f
            java.util.ArrayList<te3.co> r1 = r7.f51729A
            java.lang.Object r1 = r1.get(r4)
            te3.co r1 = (te3.C49029co) r1
            r0.mo23262G0(r1)
            r20.mo23343J7()
            dz0.c r0 = r7.f51748f
            boolean r0 = r0.mo23272T0()
            if (r0 == 0) goto L_0x02e8
            pz0.j r0 = hz0.C46153l0.Lx0()
            java.lang.String r1 = r7.f51749g
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r0 = r0.mo72543jo(r1)
            if (r0 == 0) goto L_0x075f
            java.util.ArrayList<te3.co> r1 = r7.f51729A
            java.lang.Object r1 = r1.get(r4)
            te3.co r1 = (te3.C49029co) r1
            r0.mo23262G0(r1)
            pz0.j r1 = hz0.C46153l0.Lx0()
            java.lang.String[] r2 = new java.lang.String[r13]
            java.lang.String r3 = r7.f51749g
            r2[r4] = r3
            r1.update(r0, (java.lang.String[]) r2)
            goto L_0x075f
        L_0x02e8:
            hz0.c r0 = hz0.C46153l0.Gx0()
            java.lang.String r1 = r7.f51749g
            com.tencent.mm.plugin.card.model.CardInfo r0 = r0.mo71595Lo(r1)
            if (r0 == 0) goto L_0x075f
            java.util.ArrayList<te3.co> r1 = r7.f51729A
            java.lang.Object r1 = r1.get(r4)
            te3.co r1 = (te3.C49029co) r1
            r0.mo23262G0(r1)
            hz0.c r1 = hz0.C46153l0.Gx0()
            java.lang.String[] r2 = new java.lang.String[r13]
            java.lang.String r3 = r7.f51749g
            r2[r4] = r3
            r1.update(r0, (java.lang.String[]) r2)
            goto L_0x075f
        L_0x030e:
            dz0.c r0 = r7.f51748f
            if (r0 == 0) goto L_0x075f
            java.util.ArrayList<te3.co> r1 = r7.f51729A
            if (r1 != 0) goto L_0x075f
            r0.mo23262G0(r6)
            r20.mo23343J7()
            dz0.c r0 = r7.f51748f
            boolean r0 = r0.mo23272T0()
            if (r0 == 0) goto L_0x0342
            pz0.j r0 = hz0.C46153l0.Lx0()
            java.lang.String r1 = r7.f51749g
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r0 = r0.mo72543jo(r1)
            if (r0 == 0) goto L_0x075f
            r0.mo23262G0(r6)
            pz0.j r1 = hz0.C46153l0.Lx0()
            java.lang.String[] r2 = new java.lang.String[r13]
            java.lang.String r3 = r7.f51749g
            r2[r4] = r3
            r1.update(r0, (java.lang.String[]) r2)
            goto L_0x075f
        L_0x0342:
            hz0.c r0 = hz0.C46153l0.Gx0()
            java.lang.String r1 = r7.f51749g
            com.tencent.mm.plugin.card.model.CardInfo r0 = r0.mo71595Lo(r1)
            if (r0 == 0) goto L_0x075f
            r0.mo23262G0(r6)
            hz0.c r1 = hz0.C46153l0.Gx0()
            java.lang.String[] r2 = new java.lang.String[r13]
            java.lang.String r3 = r7.f51749g
            r2[r4] = r3
            r1.update(r0, (java.lang.String[]) r2)
            goto L_0x075f
        L_0x0360:
            boolean r0 = r3 instanceof hz0.C46145e0
            if (r0 == 0) goto L_0x03ba
            r0 = r3
            hz0.e0 r0 = (hz0.C46145e0) r0
            int r1 = r0.f124359h
            java.lang.String r2 = r0.f124358g
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r1 != r3) goto L_0x0380
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x037c
            r0 = 2131823054(0x7f1109ce, float:1.9278897E38)
            java.lang.String r2 = r7.getString(r0)
        L_0x037c:
            wz0.C53248d.m59683c(r7, r2)
            return
        L_0x0380:
            java.lang.String r0 = r0.f124357f
            r7.f51752j = r0
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r0 = r7.f51747e
            java.lang.String r1 = r0.f51781J
            java.lang.String r0 = r0.f51780I
            wz0.C22945n.m26995H(r1, r0)
            dz0.c r0 = r7.f51748f
            te3.hn r0 = r0.mo23263J0()
            r0.f63942d = r12
            dz0.c r1 = r7.f51748f
            r1.mo23273U0(r0)
            dz0.c r0 = r7.f51748f
            wz0.C22945n.m27000M(r0)
            r20.mo23343J7()
            int r0 = r7.f51732D
            if (r0 != r12) goto L_0x03ac
            r1 = 2
            r7.mo23344K7(r13, r1)
            goto L_0x075f
        L_0x03ac:
            r1 = 15
            if (r0 != r1) goto L_0x075f
            com.tencent.mm.autogen.events.ShakeCardGiftedEvent r0 = new com.tencent.mm.autogen.events.ShakeCardGiftedEvent
            r0.<init>()
            r0.publish()
            goto L_0x075f
        L_0x03ba:
            boolean r0 = r3 instanceof hz0.C46156r
            r1 = 2131823029(0x7f1109b5, float:1.9278846E38)
            if (r0 == 0) goto L_0x03d9
            android.content.res.Resources r0 = r20.getResources()
            java.lang.String r0 = r0.getString(r1)
            nj3.C76879j.m92726T(r7, r0)
            gz0.c r0 = hz0.C46153l0.vx0()
            r1 = 4
            r0.mo58722a(r1)
            r7.mo23344K7(r13, r13)
            goto L_0x075f
        L_0x03d9:
            boolean r0 = r3 instanceof hz0.C46157t
            if (r0 == 0) goto L_0x043e
            r0 = r3
            hz0.t r0 = (hz0.C46157t) r0
            java.util.LinkedList<com.tencent.mm.plugin.card.model.CardInfo> r1 = r0.f124429f
            if (r1 == 0) goto L_0x0436
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x0436
            java.lang.Object r1 = r1.get(r4)
            dz0.c r1 = (dz0.C20483c) r1
            if (r1 == 0) goto L_0x040b
            java.lang.String r2 = r7.f51749g
            java.lang.String r3 = r0.f124430g
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x040b
            r2 = 2
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = r7.f51749g
            r1[r4] = r2
            java.lang.String r0 = r0.f124430g
            r1[r13] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r5, r1)
            return
        L_0x040b:
            r7.f51748f = r1
            if (r1 == 0) goto L_0x042d
            java.lang.String r0 = r1.getCardId()
            r7.f51749g = r0
            r20.mo23341H7()
            dz0.c r0 = r7.f51748f
            boolean r0 = r0.mo23278d0()
            if (r0 == 0) goto L_0x042d
            gz0.d r0 = hz0.C46153l0.wx0()
            dz0.c r1 = r7.f51748f
            java.lang.String r1 = r1.getCardId()
            r0.mo32569a(r1)
        L_0x042d:
            int r0 = r7.f51730B
            if (r0 != r11) goto L_0x0433
            r7.f51730B = r12
        L_0x0433:
            r20.mo23343J7()
        L_0x0436:
            r20.mo23352R7()
            wz0.C22945n.m26997J()
            goto L_0x075f
        L_0x043e:
            boolean r0 = r3 instanceof pz0.C22061g
            java.lang.String r2 = "MicroMsg.CardInfoParser"
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x05a9
            r0 = r3
            pz0.g r0 = (pz0.C22061g) r0
            java.lang.String r1 = r0.f62438f
            int r3 = r0.f62439g
            java.lang.String r0 = r0.f62440h
            if (r3 == 0) goto L_0x046b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x045e
            r0 = 2131822991(0x7f11098f, float:1.927877E38)
            java.lang.String r0 = r7.getString(r0)
        L_0x045e:
            wz0.C53248d.m59683c(r7, r0)
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r1[r4] = r0
            java.lang.String r0 = "NetSceneShareCardItem onSceneEnd, accept card error, ret_msg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r0, r1)
            return
        L_0x046b:
            android.content.res.Resources r0 = r20.getResources()
            r3 = 2131822995(0x7f110993, float:1.9278777E38)
            java.lang.String r0 = r0.getString(r3)
            nj3.C76879j.m92726T(r7, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0485
            java.lang.String r0 = "NetSceneShareCardItem onSceneEnd, json is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return
        L_0x0485:
            r7.f51730B = r12
            dz0.c r0 = r7.f51748f
            if (r0 != 0) goto L_0x0493
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r0 = new com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo
            r0.<init>()
            r7.f51748f = r0
            goto L_0x049e
        L_0x0493:
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.card.model.CardInfo
            if (r0 == 0) goto L_0x049e
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r0 = new com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo
            r0.<init>()
            r7.f51748f = r0
        L_0x049e:
            dz0.c r0 = r7.f51748f
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r0 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r0
            wz0.C22943h.m26980q(r0, r1)
            dz0.c r0 = r7.f51748f
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r0 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r0
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x04b6
            java.lang.String r0 = "parserShareCardItemEncryptCodeForSingle jsonContent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x04f3
        L_0x04b6:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x04e6 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x04e6 }
            java.lang.String r1 = "card_list"
            org.json.JSONArray r1 = r3.optJSONArray(r1)     // Catch:{ JSONException -> 0x04e6 }
            if (r1 == 0) goto L_0x04f3
            org.json.JSONObject r1 = r1.optJSONObject(r4)     // Catch:{ JSONException -> 0x04e6 }
            java.lang.String r3 = "encrypt_code"
            java.lang.String r1 = r1.optString(r3)     // Catch:{ JSONException -> 0x04e6 }
            r0.f51617y0 = r1     // Catch:{ JSONException -> 0x04e6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x04e6 }
            r1.<init>()     // Catch:{ JSONException -> 0x04e6 }
            java.lang.String r3 = "encrypt_code:"
            r1.append(r3)     // Catch:{ JSONException -> 0x04e6 }
            java.lang.String r0 = r0.f51617y0     // Catch:{ JSONException -> 0x04e6 }
            r1.append(r0)     // Catch:{ JSONException -> 0x04e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ JSONException -> 0x04e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ JSONException -> 0x04e6 }
            goto L_0x04f3
        L_0x04e6:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r1)
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x04f3:
            dz0.c r0 = r7.f51748f
            java.lang.String r0 = r0.getCardId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0507
            dz0.c r0 = r7.f51748f
            java.lang.String r0 = r0.getCardId()
            r7.f51749g = r0
        L_0x0507:
            dz0.c r0 = r7.f51748f
            java.lang.String r0 = r0.mo23280e()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x051d
            dz0.c r0 = r7.f51748f
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r0 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r0
            java.lang.String r1 = eb0.C75592q0.m90789s()
            r0.field_from_username = r1
        L_0x051d:
            dz0.c r0 = r7.f51748f
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r0 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r0
            wz0.C22945n.m26992E(r0)
            r20.mo23341H7()
            r20.mo23343J7()
            wz0.C22945n.m26998K()
            oz0.a r0 = hz0.C46153l0.Kx0()
            r0.mo60218c()
            dz0.c r0 = r7.f51748f
            java.lang.String r0 = r0.mo23274W()
            r7.f51743P = r0
            int r0 = r7.f51732D
            if (r0 == r10) goto L_0x0551
            r1 = 16
            if (r0 != r1) goto L_0x0545
            goto L_0x0551
        L_0x0545:
            boolean r1 = r7.f51733E
            if (r1 != 0) goto L_0x0561
            r1 = 8
            if (r0 != r1) goto L_0x0561
            r20.mo23356q()
            goto L_0x0561
        L_0x0551:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r7.f51743P
            r0.putExtra(r14, r1)
            r7.setResult(r15, r0)
            r7.mo23347N7(r15)
        L_0x0561:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_IS_SHOW_SHARE_CARD_TIP_INT_SYNC
            java.lang.Object r0 = r0.mo119685f(r1, r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x057a
            int r0 = r0.intValue()
            if (r0 != r13) goto L_0x057a
            goto L_0x0592
        L_0x057a:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r0.mo119677K(r1, r2)
            r0 = 2131493545(0x7f0c02a9, float:1.8610573E38)
            r1 = 2131823194(0x7f110a5a, float:1.927918E38)
            wz0.C53248d.m59686f(r7, r0, r1, r5)
        L_0x0592:
            dz0.c r0 = r7.f51748f
            boolean r0 = r0.mo23278d0()
            if (r0 == 0) goto L_0x075f
            gz0.d r0 = hz0.C46153l0.wx0()
            dz0.c r1 = r7.f51748f
            java.lang.String r1 = r1.getCardId()
            r0.mo32569a(r1)
            goto L_0x075f
        L_0x05a9:
            boolean r0 = r3 instanceof pz0.C12022c
            if (r0 == 0) goto L_0x069e
            r0 = r3
            pz0.c r0 = (pz0.C12022c) r0
            r0.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x05bf
            java.lang.String r0 = "onSceneEnd, NetSceneGetShareCard json is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return
        L_0x05bf:
            dz0.c r1 = r7.f51748f
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r0 = new com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo
            r0.<init>()
            r7.f51748f = r0
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x05d5
            java.lang.String r0 = "parserShareCardItemJson jsonContent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x05e4
        L_0x05d5:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x05de }
            r3.<init>(r6)     // Catch:{ JSONException -> 0x05de }
            wz0.C22943h.m26981r(r0, r3)     // Catch:{ JSONException -> 0x05de }
            goto L_0x05e4
        L_0x05de:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r3)
        L_0x05e4:
            if (r1 == 0) goto L_0x0657
            java.lang.String r0 = r1.mo23280e()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05fb
            dz0.c r0 = r7.f51748f
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r0 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r0
            r2 = r1
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r2 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r2
            java.lang.String r2 = r2.field_from_username
            r0.field_from_username = r2
        L_0x05fb:
            dz0.c r0 = r7.f51748f
            r2 = r0
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r2 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r2
            r3 = r1
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r3 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r3
            java.lang.String r4 = r3.field_app_id
            r2.field_app_id = r4
            java.lang.String r4 = r3.field_consumer
            r2.field_consumer = r4
            long r4 = r3.field_share_time
            r2.field_share_time = r4
            long r4 = r3.field_updateTime
            r2.field_updateTime = r4
            long r4 = r3.field_begin_time
            r2.field_begin_time = r4
            long r4 = r3.field_end_time
            r2.field_end_time = r4
            long r4 = r3.field_block_mask
            r2.field_block_mask = r4
            te3.co r1 = r1.mo23260A1()
            r0.mo23262G0(r1)
            dz0.c r0 = r7.f51748f
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r0 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r0
            int r1 = r3.field_categoryType
            r0.field_categoryType = r1
            int r1 = r3.field_itemIndex
            r0.field_itemIndex = r1
            int r1 = r3.field_status
            int r0 = r0.field_status
            if (r1 == r0) goto L_0x0657
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getsharecared return, the status is "
            r0.append(r1)
            dz0.c r1 = r7.f51748f
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r1 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r1
            int r1 = r1.field_status
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            dz0.c r0 = r7.f51748f
            oz0.C47407b.m52748p(r7, r0)
        L_0x0657:
            dz0.c r0 = r7.f51748f
            java.lang.String r0 = r0.getCardId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x066b
            dz0.c r0 = r7.f51748f
            java.lang.String r0 = r0.getCardId()
            r7.f51749g = r0
        L_0x066b:
            r20.mo23343J7()
            r20.mo23341H7()
            r20.mo23352R7()
            int r0 = r7.f51730B
            if (r0 != r12) goto L_0x0687
            boolean r0 = r7.f51735G
            if (r0 == 0) goto L_0x0682
            dz0.c r0 = r7.f51748f
            wz0.C22945n.m27000M(r0)
            goto L_0x0687
        L_0x0682:
            java.lang.String r0 = "onSceneEnd() sharecard updateDataToDB is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x0687:
            dz0.c r0 = r7.f51748f
            boolean r0 = r0.mo23278d0()
            if (r0 == 0) goto L_0x075f
            gz0.d r0 = hz0.C46153l0.wx0()
            dz0.c r1 = r7.f51748f
            java.lang.String r1 = r1.getCardId()
            r0.mo32569a(r1)
            goto L_0x075f
        L_0x069e:
            boolean r0 = r3 instanceof pz0.C47716a
            if (r0 == 0) goto L_0x075f
            r0 = r3
            pz0.a r0 = (pz0.C47716a) r0
            int r0 = r0.f128192f
            if (r0 == 0) goto L_0x06b5
            r0 = 2131823027(0x7f1109b3, float:1.9278842E38)
            java.lang.String r0 = r7.getString(r0)
            wz0.C53248d.m59683c(r7, r0)
            goto L_0x075f
        L_0x06b5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "delete share card, card id is "
            r0.append(r2)
            dz0.c r2 = r7.f51748f
            java.lang.String r2 = r2.getCardId()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            dz0.c r0 = r7.f51748f
            oz0.C47407b.m52748p(r7, r0)
            android.content.res.Resources r0 = r20.getResources()
            java.lang.String r0 = r0.getString(r1)
            nj3.C76879j.m92726T(r7, r0)
            oz0.a r0 = hz0.C46153l0.Kx0()
            r0.mo60216a()
            r20.mo23356q()
            goto L_0x075f
        L_0x06eb:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r0)
            r9.append(r6)
            r9.append(r1)
            java.lang.String r0 = " cmd:"
            r9.append(r0)
            int r0 = r24.getType()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            r7.mo23351Q7(r4)
            boolean r0 = r3 instanceof hz0.C46145e0
            if (r0 == 0) goto L_0x072f
            r0 = r3
            hz0.e0 r0 = (hz0.C46145e0) r0
            int r1 = r0.f124359h
            java.lang.String r0 = r0.f124358g
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r1 != r3) goto L_0x0746
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0747
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            java.lang.String r0 = r7.getString(r1)
            goto L_0x0747
        L_0x072f:
            boolean r0 = r3 instanceof hz0.C21036o
            if (r0 == 0) goto L_0x0741
            r7.mo23347N7(r4)
            r0 = r3
            hz0.o r0 = (hz0.C21036o) r0
            int r3 = r0.f59521g
            java.lang.String r0 = r0.f59522h
            r7.mo23345L7(r1, r2, r3, r0)
            return
        L_0x0741:
            boolean r0 = r3 instanceof hz0.C46159v
            if (r0 == 0) goto L_0x0746
            return
        L_0x0746:
            r0 = r2
        L_0x0747:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0754
            r0 = 2131823235(0x7f110a83, float:1.9279264E38)
            java.lang.String r0 = r7.getString(r0)
        L_0x0754:
            androidx.appcompat.app.AppCompatActivity r1 = r20.getContext()
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r0, (int) r4)
            r0.show()
        L_0x075f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.CardDetailUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public void onScreenShot(String str, long j) {
        C22818f0 f0Var;
        ViewGroup viewGroup;
        C18596g0 g0Var;
        C76901s0 s0Var;
        C22819h hVar = this.f51747e.f51805p;
        if (hVar != null) {
            C20483c cVar = hVar.f65607d;
            if (cVar == null || (f0Var = hVar.f65611h) == null || (viewGroup = hVar.f65610g) == null) {
                Log.m105920e("MicroMsg.CardBaseCodeView", "onScreenShot is error! mCardInfo or codeContainer or targetView is null ");
            } else {
                f0Var.mo35957d(viewGroup, cVar);
                if (hVar.f65607d.mo23263J0().f63951p == 2 && (g0Var = hVar.f65606c) != null && (s0Var = g0Var.f51924f) != null && s0Var.isShowing()) {
                    g0Var.f51924f.dismiss();
                }
            }
        }
        C115669n.INSTANCE.mo160131h(16827, this.f51749g, Long.valueOf(System.currentTimeMillis() / 1000));
    }

    public void onSuccess() {
        C22819h hVar = this.f51747e.f51805p;
        if (hVar instanceof C53056u) {
            ((C53056u) hVar).f148101l = C46153l0.wx0().mo32570b();
            this.f51747e.mo23367h();
        }
        Log.m105924i("MicroMsg.CardDetailUI", "code get success");
    }

    /* renamed from: q */
    public final void mo23356q() {
        mo23344K7(true, -1);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C18565f.class);
    }

    /* renamed from: z */
    public void mo23312z(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            C53248d.m59685e(this, str, true);
        }
    }
}
