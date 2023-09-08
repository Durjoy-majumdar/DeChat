package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.BasePanelKeybordLayout;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.luckymoney.model.C69206d2;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72834u0;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter */
public class LuckyMoneyWishFooter extends BasePanelKeybordLayout {

    /* renamed from: n */
    public MMActivity f200834n;

    /* renamed from: o */
    public ImageButton f200835o;

    /* renamed from: p */
    public MMEditText f200836p;

    /* renamed from: q */
    public Button f200837q;

    /* renamed from: r */
    public ChatFooterPanel f200838r;

    /* renamed from: s */
    public int f200839s = 0;

    /* renamed from: t */
    public boolean f200840t = false;

    /* renamed from: u */
    public boolean f200841u = true;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter$a */
    public class C69549a implements Runnable {
        public C69549a() {
        }

        public void run() {
            LuckyMoneyWishFooter.this.f200838r.setVisibility(4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter$b */
    public class C69550b extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C69552d f200843g;

        public C69550b(C69552d dVar) {
            this.f200843g = dVar;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C69552d dVar = this.f200843g;
            String obj = LuckyMoneyWishFooter.this.f200836p.getText().toString();
            C69636m mVar = (C69636m) dVar;
            mVar.getClass();
            if (!Util.isNullOrNil(obj) && !Util.isNullOrNil(mVar.f201009a.f199683D)) {
                LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI = mVar.f201009a;
                mVar.f201009a.doSceneProgress(new C69206d2(luckyMoneyBusiDetailUI.f199682C, obj, luckyMoneyBusiDetailUI.f199683D, "v1.0"));
                mVar.f201009a.mo95531J7();
            }
            LuckyMoneyWishFooter.this.f200836p.setText("");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter$c */
    public interface C69551c {
        /* renamed from: a */
        void mo95827a();
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter$d */
    public interface C69552d {
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter$e */
    public interface C69553e {
        void onShow();
    }

    public LuckyMoneyWishFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MMActivity mMActivity = (MMActivity) context;
        this.f200834n = mMActivity;
        ViewGroup viewGroup = (ViewGroup) View.inflate(mMActivity, C0966R.C0971layout.b_f, this);
        this.f200837q = (Button) viewGroup.findViewById(C0966R.C0970id.gjo);
        mo95816e(false);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(C0966R.C0970id.gjn);
        this.f200835o = imageButton;
        imageButton.setOnClickListener(new C69635l5(this));
        MMEditText mMEditText = (MMEditText) viewGroup.findViewById(C0966R.C0970id.gjl);
        this.f200836p = mMEditText;
        mMEditText.setOnTouchListener(new C69642m5(this));
        if (C30699x0.m39154a() == null) {
            this.f200838r = new C72834u0(this.f200834n);
            return;
        }
        ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
        this.f200838r = si02;
        si02.setEntranceScene(0);
        this.f200838r.setVisibility(8);
        ((LinearLayout) findViewById(C0966R.C0970id.iwc)).addView(this.f200838r, -1, 0);
        this.f200838r.mo100191d();
        this.f200838r.mo100197i();
        this.f200838r.setOnTextOperationListener(new C69653n5(this));
    }

    /* renamed from: b */
    public void mo68189b(int i) {
        super.mo68189b(i);
    }

    /* renamed from: e */
    public final void mo95816e(boolean z) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2456di);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2461dn);
        loadAnimation.setDuration(150);
        loadAnimation2.setDuration(150);
        Button button = this.f200837q;
        if (button != null) {
            if (z) {
                if (button.getVisibility() != 8 && this.f200837q.getVisibility() != 4) {
                    this.f200837q.startAnimation(loadAnimation2);
                    this.f200837q.setVisibility(8);
                }
            } else if (button.getVisibility() != 0 && this.f200837q.getVisibility() != 0) {
                this.f200837q.startAnimation(loadAnimation);
                this.f200837q.setVisibility(0);
            }
        }
    }

    public List<View> getPanelView() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f200838r);
        return arrayList;
    }

    /* renamed from: i */
    public final void mo95817i() {
        if (this.f200839s == 0) {
            this.f200836p.requestFocus();
            this.f200834n.getWindow().setSoftInputMode(16);
            this.f200834n.showVKB();
            this.f200838r.postDelayed(new C69549a(), 200);
            return;
        }
        this.f200836p.requestFocus();
        this.f200834n.getWindow().setSoftInputMode(32);
        this.f200834n.hideVKB();
        this.f200838r.mo100197i();
        this.f200838r.postDelayed(new C69628k5(this), 200);
        ViewGroup.LayoutParams layoutParams = this.f200838r.getLayoutParams();
        if ((layoutParams != null && layoutParams.height <= 0) || (layoutParams != null && KeyBoardUtil.isPortOrientation(getContext()) && this.f200841u)) {
            layoutParams.height = KeyBoardUtil.getValidPanelHeight(getContext());
            this.f200838r.setLayoutParams(layoutParams);
            this.f200841u = false;
        }
    }

    public void setHint(String str) {
        this.f200836p.setHint(str);
    }

    public void setMaxLength(int i) {
        this.f200836p.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setModeClick(boolean z) {
        this.f200840t = z;
    }

    public void setOnEditTouchListener(C69551c cVar) {
    }

    public void setOnSmileyShowListener(C69553e eVar) {
    }

    public void setOnWishSendImp(C69552d dVar) {
        this.f200837q.setOnClickListener(new C69550b(dVar));
    }

    public void setText(String str) {
        MMEditText mMEditText = this.f200836p;
        if (mMEditText != null) {
            mMEditText.setText("");
            this.f200836p.mo98046o(str);
        }
    }

    public void setVisibility(int i) {
        this.f200839s = 0;
        boolean z = i == 0;
        if (this.f200838r != null) {
            Log.m105924i("MicroMsg.SnsCommentFooter", "showState " + z);
            if (!z) {
                Log.m105918d("MicroMsg.SnsCommentFooter", "" + Util.getStack());
                this.f200838r.setVisibility(8);
                this.f200835o.setImageResource(C0966R.raw.icons_outlined_emoji);
                this.f200834n.hideVKB();
                setModeClick(true);
                requestLayout();
            } else {
                mo95817i();
                this.f200841u = false;
            }
        }
        super.setVisibility(i);
    }
}
