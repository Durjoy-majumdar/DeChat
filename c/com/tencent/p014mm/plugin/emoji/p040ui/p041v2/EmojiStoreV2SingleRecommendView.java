package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EmotionStateChangeEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.emoji.model.C93108e0;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiStoreDetailUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import di3.C86312j;
import f40.C86709a0;
import gc0.C20828a;
import i61.C98601f;
import j20.C117292a;
import j61.C46439j;
import java.util.ArrayList;
import k20.C9556a;
import p441aq.C92054g;
import te3.C101824o80;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView */
public class EmojiStoreV2SingleRecommendView extends ChatFooterPanel.RecommendView implements C93108e0.C93111c, View.OnClickListener {

    /* renamed from: t */
    public static final /* synthetic */ int f268931t = 0;

    /* renamed from: d */
    public ViewGroup f268932d;

    /* renamed from: e */
    public ImageView f268933e;

    /* renamed from: f */
    public ImageView f268934f;

    /* renamed from: g */
    public TextView f268935g;

    /* renamed from: h */
    public TextView f268936h;

    /* renamed from: i */
    public Button f268937i;

    /* renamed from: j */
    public ProgressBar f268938j;

    /* renamed from: n */
    public String f268939n;

    /* renamed from: o */
    public EmojiGroupInfo f268940o;

    /* renamed from: p */
    public C46439j f268941p;

    /* renamed from: q */
    public boolean f268942q = true;

    /* renamed from: r */
    public MMHandler f268943r = new C93244a();

    /* renamed from: s */
    public IListener f268944s = new IListener<EmotionStateChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = 449099204;
        }

        public boolean callback(IEvent iEvent) {
            EmotionStateChangeEvent emotionStateChangeEvent = (EmotionStateChangeEvent) iEvent;
            if (emotionStateChangeEvent instanceof EmotionStateChangeEvent) {
                EmojiStoreV2SingleRecommendView emojiStoreV2SingleRecommendView = EmojiStoreV2SingleRecommendView.this;
                String str = emotionStateChangeEvent.f264696d.f264700d;
                int i = EmojiStoreV2SingleRecommendView.f268931t;
                emojiStoreV2SingleRecommendView.getClass();
                if (!Util.isNullOrNil(emotionStateChangeEvent.f264696d.f264697a) && emotionStateChangeEvent.f264696d.f264697a.equalsIgnoreCase(EmojiStoreV2SingleRecommendView.this.f268939n)) {
                    EmojiStoreV2SingleRecommendView emojiStoreV2SingleRecommendView2 = EmojiStoreV2SingleRecommendView.this;
                    EmotionStateChangeEvent.C92476a aVar = emotionStateChangeEvent.f264696d;
                    String str2 = aVar.f264697a;
                    int i2 = aVar.f264698b;
                    int i3 = aVar.f264699c;
                    String str3 = aVar.f264700d;
                    emojiStoreV2SingleRecommendView2.getClass();
                    Log.m105919d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "[onExchange] productId:[%s] status:[%d] progress:[%d] cdnClientId:[%s]", str2, Integer.valueOf(i2), Integer.valueOf(i3), str3);
                    if (i2 == 6) {
                        Message obtain = Message.obtain();
                        obtain.getData().putString("product_id", str2);
                        obtain.getData().putInt("progress", i3);
                        obtain.what = 131075;
                        MMHandler mMHandler = emojiStoreV2SingleRecommendView2.f268943r;
                        if (mMHandler != null) {
                            mMHandler.sendMessage(obtain);
                        }
                    } else {
                        Log.m105925i("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product status:%d", Integer.valueOf(i2));
                        Message obtain2 = Message.obtain();
                        obtain2.getData().putString("product_id", str2);
                        obtain2.getData().putInt("status", i2);
                        obtain2.what = StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON;
                        MMHandler mMHandler2 = emojiStoreV2SingleRecommendView2.f268943r;
                        if (mMHandler2 != null) {
                            mMHandler2.sendMessage(obtain2);
                        }
                    }
                }
            }
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView$a */
    public class C93244a extends MMHandler {
        public C93244a() {
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 131075:
                    int i = message.getData().getInt("progress");
                    if (Util.isNullOrNil(message.getData().getString("product_id"))) {
                        Log.m105928w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
                        return;
                    }
                    Button button = EmojiStoreV2SingleRecommendView.this.f268937i;
                    if (button != null) {
                        button.setVisibility(8);
                    }
                    ProgressBar progressBar = EmojiStoreV2SingleRecommendView.this.f268938j;
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                        EmojiStoreV2SingleRecommendView.this.f268938j.setProgress(i);
                        return;
                    }
                    return;
                case StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON:
                    message.getData().getInt("status");
                    if (Util.isNullOrNil(message.getData().getString("product_id"))) {
                        Log.m105928w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
                        return;
                    }
                    Button button2 = EmojiStoreV2SingleRecommendView.this.f268937i;
                    if (button2 != null) {
                        button2.setVisibility(0);
                        EmojiStoreV2SingleRecommendView.this.getClass();
                    }
                    ProgressBar progressBar2 = EmojiStoreV2SingleRecommendView.this.f268938j;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(8);
                        EmojiStoreV2SingleRecommendView.this.f268938j.setProgress(0);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public EmojiStoreV2SingleRecommendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo127868a();
    }

    private void setTitleName(EmojiGroupInfo emojiGroupInfo) {
        Button button = this.f268937i;
        if (button != null) {
            int i = emojiGroupInfo.field_buttonType;
            if (i == 1) {
                button.setVisibility(0);
                this.f268937i.setText(C0966R.string.c8e);
            } else if (i != 2) {
                button.setVisibility(8);
            } else {
                button.setVisibility(0);
                this.f268937i.setText(C0966R.string.gs7);
            }
        }
        if (!Util.isNullOrNil(emojiGroupInfo.field_packName)) {
            this.f268935g.setText(emojiGroupInfo.field_packName);
        }
        if (this.f268936h == null) {
            return;
        }
        if (!Util.isNullOrNil(emojiGroupInfo.field_recommandWord)) {
            this.f268936h.setVisibility(0);
            this.f268936h.setText(emojiGroupInfo.field_recommandWord);
            return;
        }
        this.f268936h.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo127868a() {
        if (this.f268942q) {
            this.f268932d = (ViewGroup) C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a37, this);
        } else {
            this.f268932d = (ViewGroup) C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a38, this);
        }
        this.f268933e = (ImageView) this.f268932d.findViewById(C0966R.C0970id.cez);
        this.f268934f = (ImageView) this.f268932d.findViewById(C0966R.C0970id.cfr);
        this.f268935g = (TextView) this.f268932d.findViewById(C0966R.C0970id.ci_);
        this.f268936h = (TextView) this.f268932d.findViewById(C0966R.C0970id.cif);
        this.f268937i = (Button) this.f268932d.findViewById(C0966R.C0970id.cfg);
        this.f268938j = (ProgressBar) this.f268932d.findViewById(C0966R.C0970id.cfh);
    }

    /* renamed from: b */
    public final void mo127869b(C101824o80 o802) {
        Intent intent = new Intent();
        intent.setClass(getContext(), EmojiStoreDetailUI.class);
        intent.putExtra("extra_id", o802.f298994d);
        intent.putExtra("extra_name", o802.f298996f);
        intent.putExtra("extra_copyright", o802.f299004q);
        intent.putExtra("extra_coverurl", o802.f299002o);
        intent.putExtra("extra_description", o802.f298997g);
        intent.putExtra("extra_price", o802.f298999i);
        intent.putExtra("extra_type", o802.f299000j);
        intent.putExtra("extra_flag", o802.f299001n);
        intent.putExtra("extra_price_num", o802.f299007t);
        intent.putExtra("extra_price_type", o802.f299008u);
        intent.putExtra("preceding_scence", 108);
        intent.putExtra("call_by", 1);
        intent.putExtra("download_entrance_scene", 8);
        intent.putExtra("check_clickflag", false);
        intent.putExtra("extra_pack_wecoin_price", o802.f298990A);
        intent.putExtra("extra_wecoin_price", o802.f298991B);
        Context context = getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleRecommendView", "startDetailUIByID", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleRecommendView", "startDetailUIByID", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: c0 */
    public void mo127624c0(String str, String str2, String str3, String str4, String str5) {
        C86709a0.m107529k().f251779b.mo123460f(new C46439j(str, str2, str3, (String) null, str5));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "onAttachedToWindow");
        this.f268944s.alive();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleRecommendView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == this.f268933e) {
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            C30790w2.m39221h().mo57715b().mo142021Ow(this.f268939n);
            C115669n.INSTANCE.mo160131h(12068, 2, this.f268939n, Integer.valueOf(this.f268940o.field_recommandType));
        } else if (view == this.f268932d) {
            mo127869b(this.f268940o.mo135601l2());
            C115669n.INSTANCE.mo160131h(12068, 4, this.f268939n, Integer.valueOf(this.f268940o.field_recommandType));
        } else if (view == this.f268937i) {
            EmojiGroupInfo emojiGroupInfo = this.f268940o;
            int i = emojiGroupInfo.field_buttonType;
            if (i == 1) {
                this.f268941p = new C46439j(this.f268939n);
                C86709a0.m107529k().f251779b.mo123460f(this.f268941p);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(12068, 3, this.f268939n, Integer.valueOf(this.f268940o.field_recommandType));
                nVar.mo160131h(12066, 0, 8, "", this.f268939n);
            } else if (i == 2) {
                mo127869b(emojiGroupInfo.mo135601l2());
                C115669n.INSTANCE.mo160131h(12068, 4, this.f268939n, Integer.valueOf(this.f268940o.field_recommandType));
            } else {
                Log.m105924i("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "unknown buttonType do nothing.");
            }
        } else {
            Log.m105918d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "do nothing");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleRecommendView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "onDetachedFromWindow");
        this.f268944s.dead();
    }

    public void setProductID(String str) {
        this.f268939n = str;
        if (Util.isNullOrNil(str)) {
            this.f268932d.setVisibility(8);
            return;
        }
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        this.f268940o = C30790w2.m39221h().mo57715b().mo142025bF(this.f268939n, false);
        this.f268933e.setOnClickListener(this);
        this.f268937i.setOnClickListener(this);
        this.f268932d.setOnClickListener(this);
        setTitleName(this.f268940o);
        this.f268938j.setVisibility(8);
        C20828a b = C20828a.m22825b();
        String str2 = this.f268940o.field_BigIconUrl;
        b.mo32519h(str2, this.f268934f, C98601f.m128140e(this.f268939n, str2, true, new Object[0]));
    }

    /* renamed from: z4 */
    public void mo127625z4(boolean z) {
    }

    public EmojiStoreV2SingleRecommendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo127868a();
    }
}
