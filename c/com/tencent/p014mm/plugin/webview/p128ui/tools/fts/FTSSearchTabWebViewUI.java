package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.search.WebSearchView;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.vendor.MIUI;
import com.tencent.xweb.WCWebUpdater;
import java.util.ArrayList;
import kg3.C76577a;
import p206nj.C11171e;
import u73.C22613h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI */
public class FTSSearchTabWebViewUI extends FTSBaseWebViewUI {
    /* renamed from: P8 */
    public void mo68252P8(int i) {
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null && mMWebView.getSettings() != null) {
            SharedPreferences sharedPreferences = getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
            C76577a.m92172w(getContext());
            float f = sharedPreferences.getFloat("current_text_size_scale_key", 1.0f);
            if (f >= C76577a.m92170u(getContext())) {
                this.f118523f.getSettings().setTextZoom(140);
            } else if (f >= C76577a.m92169t(getContext())) {
                this.f118523f.getSettings().setTextZoom(140);
            } else if (f >= C76577a.m92168s(getContext())) {
                this.f118523f.getSettings().setTextZoom(140);
            } else if (f >= C76577a.m92167r(getContext())) {
                this.f118523f.getSettings().setTextZoom(130);
            } else if (f >= C76577a.m92174y(getContext())) {
                this.f118523f.getSettings().setTextZoom(120);
            } else if (f >= C76577a.m92171v(getContext())) {
                this.f118523f.getSettings().setTextZoom(110);
            } else {
                C76577a.m92172w(getContext());
                if (f >= 1.0f) {
                    this.f118523f.getSettings().setTextZoom(100);
                } else if (f >= C76577a.m92173x(getContext())) {
                    this.f118523f.getSettings().setTextZoom(90);
                } else {
                    this.f118523f.getSettings().setTextZoom(80);
                }
            }
        }
    }

    /* renamed from: U9 */
    public Drawable mo68476U9(int i) {
        return this.f118890i3 ? getResources().getDrawable(C0966R.raw.icons_outlined_wechat_search_one_search) : super.mo68476U9(i);
    }

    /* renamed from: aa */
    public String mo63386aa() {
        if (!Util.isNullOrNil(this.f118891j3)) {
            return this.f118891j3;
        }
        boolean z = this.f118890i3;
        int i = C0966R.string.m_r;
        if (!z) {
            String stringExtra = getIntent().getStringExtra("key_search_input_hint");
            if (!TextUtils.isEmpty(stringExtra)) {
                return stringExtra;
            }
            int i2 = this.f118938t3;
            if (i2 == 1) {
                i = C0966R.string.ih6;
            } else if (i2 == 2) {
                i = C0966R.string.ih5;
            } else if (i2 != 8) {
                if (i2 != 16) {
                    if (i2 != 64) {
                        if (i2 == 128) {
                            i = C0966R.string.f2t;
                        } else if (i2 == 256 || i2 == 384) {
                            i = C0966R.string.f2s;
                        } else if (i2 == 512) {
                            i = C0966R.string.f360825f32;
                        } else if (i2 == 1024) {
                            i = C0966R.string.f360826f33;
                        } else if (i2 != 262208) {
                            i = -1;
                        }
                    }
                    i = C0966R.string.f7674nk;
                } else {
                    i = C0966R.string.f360827f34;
                }
            }
            if (this.f118940v3 == 56) {
                i = C0966R.string.ihu;
            }
            if (i < 0) {
                return MMApplicationContext.getContext().getResources().getString(C0966R.string.a2p);
            }
            return MMApplicationContext.getContext().getResources().getString(C0966R.string.ih4, new Object[]{MMApplicationContext.getContext().getResources().getString(i)});
        } else if (this.f118938t3 != 8) {
            return MMApplicationContext.getContext().getResources().getString(C0966R.string.a2p);
        } else {
            return MMApplicationContext.getContext().getResources().getString(C0966R.string.a2p) + getString(C0966R.string.m_r);
        }
    }

    public int getForceUIMode() {
        if (this.f118939u3) {
            return 1;
        }
        return super.getForceUIMode();
    }

    public void onClickCancelBtn(View view) {
        if (!Util.isNullOrNil(this.f118884c3)) {
            this.f118894m3.put(SearchIntents.EXTRA_QUERY, this.f118884c3);
        } else {
            this.f118894m3.put(SearchIntents.EXTRA_QUERY, mo68489ba());
        }
        this.f118894m3.put("exittype", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
        super.onClickCancelBtn(view);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C11171e.m11046c(23) && !MIUI.isMIUIV8()) {
            if (this.f118939u3) {
                mo68302p9(getResources().getColor(C0966R.color.f2947a4), false);
            } else {
                mo68302p9(getResources().getColor(C0966R.color.al6), !C85875k4.m106211z());
            }
        }
        if (this.f118939u3) {
            Log.m105924i("MicroMsg.WebSearch.FTSSearchTabWebViewUI", "isforceShowNightMode.");
            WebSearchView webSearchView = this.f118935q3;
            if (webSearchView != null && webSearchView.getFtsEditText() != null) {
                this.f118935q3.getFtsEditText().f122157f.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
            }
        }
    }

    public void onPause() {
        super.onPause();
        C22613h1.m26488n();
    }

    public void onResume() {
        MMWebView mMWebView;
        if (this.f118939u3 && (mMWebView = this.f118523f) != null) {
            mMWebView.getSettings().setForceDarkMode(2);
        }
        super.onResume();
        C22613h1.m26487m();
    }

    /* renamed from: y */
    public boolean mo3009y() {
        ArrayList<String> stringArrayListExtra;
        WebSearchView webSearchView = this.f118935q3;
        if (webSearchView != null) {
            webSearchView.getFtsEditText().mo70335c();
        }
        int intExtra = getIntent().getIntExtra(C74928u.C45093i.f122322n, 0);
        if (!(intExtra == 0 || (stringArrayListExtra = getIntent().getStringArrayListExtra(C74928u.C45093i.f122323o)) == null)) {
            C115669n.INSTANCE.mo160131h(intExtra, stringArrayListExtra);
        }
        super.mo3009y();
        return false;
    }
}
