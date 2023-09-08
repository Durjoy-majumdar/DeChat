package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.BasePanelKeybordLayout;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.p014mm.plugin.report.kvdata.log_13905;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72834u0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.VoiceInputPanel;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import vd3.C22746h0;
import vd3.C22747i0;

/* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputFooter */
public class VoiceInputFooter extends BasePanelKeybordLayout {

    /* renamed from: x */
    public static final /* synthetic */ int f55006x = 0;

    /* renamed from: n */
    public MMActivity f55007n;

    /* renamed from: o */
    public ChatFooterPanel f55008o;

    /* renamed from: p */
    public VoiceInputPanel f55009p;

    /* renamed from: q */
    public MMEditText f55010q = null;

    /* renamed from: r */
    public ImageButton f55011r;

    /* renamed from: s */
    public ImageButton f55012s;

    /* renamed from: t */
    public LinearLayout f55013t;

    /* renamed from: u */
    public boolean f55014u = false;

    /* renamed from: v */
    public boolean f55015v = false;

    /* renamed from: w */
    public C19468a f55016w;

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputFooter$a */
    public interface C19468a {
    }

    public VoiceInputFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MMActivity mMActivity = (MMActivity) context;
        this.f55007n = mMActivity;
        ViewGroup viewGroup = (ViewGroup) C85868k2.m106137b(mMActivity).inflate(C0966R.C0971layout.cck, this);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(C0966R.C0970id.f5775oa);
        this.f55012s = imageButton;
        imageButton.setOnClickListener(new C22746h0(this));
        ImageButton imageButton2 = (ImageButton) viewGroup.findViewById(C0966R.C0970id.f5704mb);
        this.f55011r = imageButton2;
        imageButton2.setOnClickListener(new C22747i0(this));
        if (C30699x0.m39154a() == null) {
            this.f55008o = new C72834u0(this.f55007n);
            return;
        }
        ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
        this.f55008o = si02;
        si02.setEntranceScene(0);
        this.f55008o.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.iwc);
        this.f55013t = linearLayout;
        linearLayout.setOnClickListener((View.OnClickListener) null);
        this.f55013t.addView(this.f55008o, -1, KeyBoardUtil.getValidPanelHeight(getContext()));
        this.f55008o.mo100191d();
        this.f55008o.mo100197i();
        this.f55008o.setOnTextOperationListener(new C72745c(this));
        ViewGroup.LayoutParams layoutParams = this.f55008o.getLayoutParams();
        layoutParams.height = KeyBoardUtil.getValidPanelHeight(getContext());
        this.f55008o.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    public final void mo25231e() {
        this.f55015v = false;
        this.f55008o.mo100196h();
        this.f55008o.setVisibility(8);
    }

    public List<View> getPanelView() {
        return new ArrayList();
    }

    /* renamed from: i */
    public final void mo25233i() {
        this.f55014u = false;
        VoiceInputPanel voiceInputPanel = this.f55009p;
        if (voiceInputPanel != null) {
            voiceInputPanel.mo25280j();
            this.f55009p.setVisibility(8);
            this.f55012s.setImageResource(C0966R.C0969drawable.b0c);
            this.f55011r.setVisibility(0);
            C19468a aVar = this.f55016w;
            if (aVar != null) {
                VoiceInputUI.this.f55047e.setVisibility(0);
            }
        }
    }

    /* renamed from: j */
    public final void mo25234j(int i) {
        VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
        if (i == 1) {
            voiceInputBehavior.smileIconClick = 1;
        } else if (i == 2) {
            voiceInputBehavior.voiceIconClick = 1;
        } else {
            return;
        }
        Log.m105925i("MicroMsg.VoiceInputFooter", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", Integer.valueOf(voiceInputBehavior.cancel), Integer.valueOf(voiceInputBehavior.send), Integer.valueOf(voiceInputBehavior.click), Integer.valueOf(voiceInputBehavior.longClick), Long.valueOf(voiceInputBehavior.longClickTime), Integer.valueOf(voiceInputBehavior.textClick), Integer.valueOf(voiceInputBehavior.textChangeCount), Long.valueOf(voiceInputBehavior.textChangeTime), Integer.valueOf(voiceInputBehavior.textChangeReturn), Long.valueOf(voiceInputBehavior.voiceInputTime), Integer.valueOf(voiceInputBehavior.fail), Integer.valueOf(voiceInputBehavior.clear), Integer.valueOf(voiceInputBehavior.smileIconClick), Integer.valueOf(voiceInputBehavior.voiceIconClick), Integer.valueOf(voiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(voiceInputBehavior.fullScreenVoiceLongClickTime));
        log_13905 log_13905 = new log_13905();
        log_13905.viOp_ = voiceInputBehavior;
        C115669n.INSTANCE.mo175916z(13905, log_13905, false, false);
    }

    public void setVoiceInputFooterListener(C19468a aVar) {
        this.f55016w = aVar;
    }
}
