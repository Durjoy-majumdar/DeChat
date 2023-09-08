package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.vfs.C86013q1;
import lu3.C88654b;
import ps2.C100880k;
import ps2.C100891r;
import qs2.C101255a0;
import qs2.C101268h0;
import rq2.C101419f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h2 */
public class C95100h2 extends C95295z {

    /* renamed from: s */
    public TextView f276011s;

    /* renamed from: t */
    public ViewGroup f276012t;

    /* renamed from: u */
    public C88654b f276013u;

    /* renamed from: v */
    public volatile boolean f276014v = false;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h2$a */
    public class C95101a extends C88654b {

        /* renamed from: e */
        public final /* synthetic */ String f276015e;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h2$a$a */
        public class C95102a implements Html.ImageGetter {

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h2$a$a$a */
            public class C95103a implements C100880k.C100881a {

                /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h2$a$a$a$a */
                public class C95104a implements Html.ImageGetter {
                    public C95104a() {
                    }

                    public Drawable getDrawable(String str) {
                        Drawable drawable;
                        SnsMethodCalculate.markStartTimeMs("getDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1$1");
                        String l = C100891r.m132217l("adId", str);
                        if (Util.isNullOrNil(l) || !C86013q1.m106450k(l)) {
                            drawable = null;
                        } else {
                            drawable = C101419f.m133082e(C95100h2.m120947E(C95100h2.this).getResources(), l);
                            if (drawable != null) {
                                drawable.setBounds(0, 0, drawable.getIntrinsicHeight() != 0 ? (drawable.getIntrinsicWidth() * ((int) C95100h2.m120948G(C95100h2.this).f296599A)) / drawable.getIntrinsicHeight() : drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() != 0 ? (int) C95100h2.m120948G(C95100h2.this).f296599A : drawable.getIntrinsicHeight());
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("getDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1$1");
                        return drawable;
                    }
                }

                /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h2$a$a$a$b */
                public class C95105b implements Runnable {

                    /* renamed from: d */
                    public final /* synthetic */ Spanned f276020d;

                    public C95105b(Spanned spanned) {
                        this.f276020d = spanned;
                    }

                    public void run() {
                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1$2");
                        C95100h2.m120947E(C95100h2.this).setText(this.f276020d);
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1$2");
                    }
                }

                public C95103a() {
                }

                /* renamed from: a */
                public void mo76113a() {
                    SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1");
                    SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1");
                }

                /* renamed from: b */
                public void mo76114b() {
                    SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1");
                    SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1");
                }

                /* renamed from: c */
                public void mo76115c(String str) {
                    SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1");
                    try {
                        MMHandlerThread.postToMainThread(new C95105b(Html.fromHtml(C95101a.this.f276015e, new C95104a(), (Html.TagHandler) null)));
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.Sns.AdLandingPageTextComponent", "the backgroundCoverUrl is set error ,because " + e.toString());
                    }
                    SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1");
                }
            }

            public C95102a() {
            }

            public Drawable getDrawable(String str) {
                Drawable drawable;
                SnsMethodCalculate.markStartTimeMs("getDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1");
                String l = C100891r.m132217l("adId", str);
                if (Util.isNullOrNil(l) || !C86013q1.m106450k(l)) {
                    C100891r.m132207b("adId", str, false, 0, 0, new C95103a());
                    drawable = null;
                } else {
                    drawable = C101419f.m133082e(C95100h2.m120947E(C95100h2.this).getResources(), l);
                    if (drawable != null) {
                        drawable.setBounds(0, 0, drawable.getIntrinsicHeight() != 0 ? (drawable.getIntrinsicWidth() * ((int) C95100h2.m120948G(C95100h2.this).f296599A)) / drawable.getIntrinsicHeight() : drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() != 0 ? (int) C95100h2.m120948G(C95100h2.this).f296599A : drawable.getIntrinsicHeight());
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1");
                return drawable;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h2$a$b */
        public class C95106b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Spanned f276022d;

            public C95106b(Spanned spanned) {
                this.f276022d = spanned;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$2");
                C95100h2.m120947E(C95100h2.this).setText(C96963p0.wx0().mo83004M(C95100h2.this.f276579d, this.f276022d));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$2");
            }
        }

        public C95101a(String str) {
            this.f276015e = str;
        }

        public String getKey() {
            SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1");
            SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1");
            return "MicroMsg.Sns.AdLandingPageTextComponent";
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1");
            C95100h2 h2Var = C95100h2.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
            boolean z = h2Var.f276014v;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
            if (z) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1");
                return;
            }
            MMHandlerThread.postToMainThread(new C95106b(Html.fromHtml(this.f276015e, new C95102a(), (Html.TagHandler) null)));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1");
        }
    }

    public C95100h2(Context context, C101268h0 h0Var, ViewGroup viewGroup) {
        super(context, h0Var, viewGroup);
    }

    /* renamed from: E */
    public static /* synthetic */ TextView m120947E(C95100h2 h2Var) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        TextView textView = h2Var.f276011s;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        return textView;
    }

    /* renamed from: G */
    public static /* synthetic */ C101268h0 m120948G(C95100h2 h2Var) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        C101268h0 H = h2Var.mo131617H();
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        return H;
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        super.mo67235C();
        C88654b bVar = this.f276013u;
        if (bVar != null) {
            bVar.mo97819a();
        }
        this.f276014v = true;
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        super.mo124361D();
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }

    /* renamed from: H */
    public final C101268h0 mo131617H() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        C101268h0 h0Var = (C101268h0) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        return h0Var;
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        View view = this.f276586n;
        view.setBackgroundColor(this.f276581f);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.jq5);
        this.f276012t = viewGroup;
        viewGroup.setBackgroundColor(this.f276581f);
        view.findViewById(C0966R.C0970id.jq6).setBackgroundColor(this.f276581f);
        this.f276011s = (TextView) view.findViewById(C0966R.C0970id.jq6);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        if (mo131617H().f296599A > 0.0f) {
            this.f276011s.setTextSize(0, mo131617H().f296599A);
        }
        if (mo131617H().f296504j == 1) {
            if (!Util.isNullOrNil(mo131617H().f296609z)) {
                String replace = mo131617H().f296609z.trim().replace("<icon", "<img");
                C88654b bVar = this.f276013u;
                if (bVar != null) {
                    bVar.mo97819a();
                }
                C95101a aVar = new C95101a(replace);
                this.f276013u = aVar;
                ((C119157j) C119157j.f356862d).mo183875f(aVar);
            }
        } else if (!Util.isNullOrNil(mo131617H().f296609z)) {
            this.f276011s.setText(C96963p0.wx0().mo83004M(this.f276579d, mo131617H().f296609z.trim()));
        }
        if (mo131617H().f296600B == 0) {
            this.f276011s.setGravity(3);
        } else if (mo131617H().f296600B == 1) {
            this.f276011s.setGravity(17);
        } else if (mo131617H().f296600B == 2) {
            this.f276011s.setGravity(5);
        }
        int i = mo131617H().f296608J;
        if (i != 0) {
            try {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f276012t.getLayoutParams();
                this.f276011s.setIncludeFontPadding(false);
                if (i == 1) {
                    layoutParams.addRule(10, -1);
                } else if (i == 2) {
                    layoutParams.addRule(15, -1);
                } else if (i == 3) {
                    layoutParams.addRule(12, -1);
                }
                this.f276012t.setLayoutParams(layoutParams);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageTextComponent", "textVerticalAlignment is " + i + ", " + th.toString());
            }
        }
        if (mo131617H().f296601C == null || mo131617H().f296601C.length() <= 0) {
            this.f276011s.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            try {
                this.f276011s.setTextColor(Color.parseColor(mo131617H().f296601C));
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageTextComponent", "parse the color is error : " + mo131617H().f296601C);
            }
        }
        if (mo131617H().f296607I > 0.0f) {
            this.f276011s.setLineSpacing(0.0f, mo131617H().f296607I + 1.0f);
        }
        TextPaint paint = this.f276011s.getPaint();
        if (mo131617H().f296602D) {
            paint.setFakeBoldText(true);
        }
        if (mo131617H().f296603E) {
            paint.setTextSkewX(-0.25f);
        }
        if (mo131617H().f296604F) {
            paint.setUnderlineText(true);
        }
        if (mo131617H().f296605G > 0) {
            this.f276011s.setMaxLines(mo131617H().f296605G);
        }
        if (mo131617H().f296606H == 1) {
            TextView textView = this.f276011s;
            Context context = this.f276579d;
            SnsMethodCalculate.markStartTimeMs("getWechatNumTypeFace", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            if (C95198o2.f276254a == null) {
                C95198o2.f276254a = Typeface.createFromAsset(context.getAssets(), "fonts/WeChatNum.ttf");
            }
            Typeface typeface = C95198o2.f276254a;
            SnsMethodCalculate.markEndTimeMs("getWechatNumTypeFace", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            textView.setTypeface(typeface);
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        return C0966R.C0971layout.c1k;
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C101255a0 a0Var = this.f276580e;
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) a0Var.f296499e, (int) a0Var.f296497c, (int) a0Var.f296500f, (int) a0Var.f296498d);
        }
        this.f276586n.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent");
    }
}
