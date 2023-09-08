package com.tencent.p014mm.p136ui.websearch;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.websearch.WebSearchVoiceInputPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import fo3.C116890a;
import in3.C46279a;
import in3.C87763b;
import nj3.C88989a;

@C88989a(7)
/* renamed from: com.tencent.mm.ui.websearch.WebSearchVoiceUI */
public class WebSearchVoiceUI extends MMActivity {

    /* renamed from: d */
    public WebSearchVoiceInputPanel f348666d;

    /* renamed from: e */
    public View f348667e;

    /* renamed from: f */
    public String f348668f;

    /* renamed from: g */
    public String f348669g;

    /* renamed from: h */
    public int f348670h;

    /* renamed from: i */
    public int f348671i;

    /* renamed from: j */
    public C87763b f348672j = null;

    /* renamed from: com.tencent.mm.ui.websearch.WebSearchVoiceUI$a */
    public class C116176a implements MenuItem.OnMenuItemClickListener {
        public C116176a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WebSearchVoiceUI.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.chs;
    }

    public boolean initNavigationSwipeBack() {
        boolean initNavigationSwipeBack = super.initNavigationSwipeBack();
        if (!isSupportNavigationSwipeBack()) {
            C46279a.m51577a(getContentView(), getResources().getColor(C0966R.color.akk), true);
        }
        return initNavigationSwipeBack;
    }

    public void initSwipeBack() {
        super.initSwipeBack();
        if (getSwipeBackLayout() != null && getSwipeBackLayout().getChildCount() > 0) {
            View childAt = getSwipeBackLayout().getChildAt(0);
            getSwipeBackLayout().removeView(childAt);
            C87763b bVar = new C87763b(this);
            this.f348672j = bVar;
            bVar.addView(childAt, new FrameLayout.LayoutParams(-1, -1));
            getSwipeBackLayout().addView(this.f348672j);
            getSwipeBackLayout().setContentView(this.f348672j);
        }
        C46279a.m51577a(getContentView(), getResources().getColor(C0966R.color.akk), true);
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtnColorFilter(C0966R.color.BW_0);
        setMMTitleColor(-16777216);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91099j().setBackgroundColor(getResources().getColor(C0966R.color.akk));
            getSupportActionBar().mo91112w(new ColorDrawable(getResources().getColor(C0966R.color.akk)));
        }
        setBackBtn(new C116176a());
        if (getIntent() != null) {
            this.f348668f = getIntent().getStringExtra("sessionId");
            this.f348669g = getIntent().getStringExtra("subSessionId");
            this.f348670h = getIntent().getIntExtra("key_scene", -1);
            this.f348671i = getIntent().getIntExtra("key_is_nav_voice", 0);
        }
        this.f348667e = findViewById(C0966R.C0970id.f359521lc0);
        this.mController.mo177043E();
        if (this.f348666d == null) {
            WebSearchVoiceInputPanel webSearchVoiceInputPanel = new WebSearchVoiceInputPanel(getContext(), false, (MMEditText) null);
            this.f348666d = webSearchVoiceInputPanel;
            webSearchVoiceInputPanel.setCallback(new C116890a(this));
        }
        this.f348666d.mo25395d();
        WebSearchVoiceInputPanel webSearchVoiceInputPanel2 = this.f348666d;
        Log.m105919d("MicroMsg.VoiceInputPanel", "refreshHeight DISPLAY_HEIGHT_PORT_IN_PX %s,needRefreshProtHeight %s", Integer.valueOf(webSearchVoiceInputPanel2.f55414G), Boolean.valueOf(webSearchVoiceInputPanel2.f55415H));
        if (webSearchVoiceInputPanel2.f55415H) {
            webSearchVoiceInputPanel2.f55415H = false;
            View findViewById = webSearchVoiceInputPanel2.findViewById(C0966R.C0970id.laj);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i = webSearchVoiceInputPanel2.f55414G;
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(-1, i);
            }
            layoutParams.height = i;
            findViewById.setLayoutParams(layoutParams);
            webSearchVoiceInputPanel2.mo25397f();
            webSearchVoiceInputPanel2.requestLayout();
        }
        this.f348666d.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        ((ViewGroup) findViewById(C0966R.C0970id.iwc)).addView(this.f348666d, layoutParams2);
        C115669n.INSTANCE.mo160131h(15178, 1, Long.valueOf(System.currentTimeMillis()), "", this.f348668f, this.f348669g, Integer.valueOf(this.f348670h), Integer.valueOf(this.f348671i));
    }

    public void onDestroy() {
        super.onDestroy();
        WebSearchVoiceInputPanel webSearchVoiceInputPanel = this.f348666d;
        if (webSearchVoiceInputPanel != null) {
            webSearchVoiceInputPanel.mo25394c();
        }
    }
}
