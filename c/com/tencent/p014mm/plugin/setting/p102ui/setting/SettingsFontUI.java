package com.tencent.p014mm.plugin.setting.p102ui.setting;

import an2.C54144b;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.setting.p102ui.widget.FontSelectorView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.HashSet;
import kg3.C76577a;
import lg3.C88494d;
import nj3.C88989a;
import p196ln.C76705f;
import qo3.C77426q;
import tm2.C78045b;

@C88989a(17)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI */
public class SettingsFontUI extends VASActivity {

    /* renamed from: d */
    public int f205716d = 0;

    /* renamed from: e */
    public int f205717e = 2;

    /* renamed from: f */
    public int f205718f = C76577a.m92151b(MMApplicationContext.getContext(), C0966R.dimen.f4284yo);

    /* renamed from: g */
    public float f205719g = 1.0f;

    /* renamed from: h */
    public float f205720h = 1.0f;

    /* renamed from: i */
    public float f205721i = 1.0f;

    /* renamed from: j */
    public int f205722j;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI$a */
    public class C71069a implements FontSelectorView.C57323a {

        /* renamed from: a */
        public final /* synthetic */ MMNeat7extView f205723a;

        /* renamed from: b */
        public final /* synthetic */ MMNeat7extView f205724b;

        /* renamed from: c */
        public final /* synthetic */ MMNeat7extView f205725c;

        /* renamed from: d */
        public final /* synthetic */ ImageView f205726d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f205727e;

        /* renamed from: f */
        public final /* synthetic */ ImageView f205728f;

        public C71069a(MMNeat7extView mMNeat7extView, MMNeat7extView mMNeat7extView2, MMNeat7extView mMNeat7extView3, ImageView imageView, ImageView imageView2, ImageView imageView3) {
            this.f205723a = mMNeat7extView;
            this.f205724b = mMNeat7extView2;
            this.f205725c = mMNeat7extView3;
            this.f205726d = imageView;
            this.f205727e = imageView2;
            this.f205728f = imageView3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
            r3 = r3 * r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0082, code lost:
            r1 = r2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo97740a(int r7) {
            /*
                r6 = this;
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r0 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                r0.f205722j = r7
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                if (r0 != 0) goto L_0x0019
                java.lang.String r1 = "MicroMsg.FontSizeService"
                java.lang.String r2 = "onChangeFontSize get null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                xm2.f r1 = new xm2.f
                r1.<init>()
                goto L_0x00a2
            L_0x0019:
                if (r7 == 0) goto L_0x0084
                r1 = 1135869952(0x43b40000, float:360.0)
                r2 = 1135214592(0x43aa0000, float:340.0)
                switch(r7) {
                    case 2: goto L_0x0078;
                    case 3: goto L_0x0068;
                    case 4: goto L_0x0059;
                    case 5: goto L_0x004b;
                    case 6: goto L_0x003d;
                    case 7: goto L_0x002f;
                    default: goto L_0x0022;
                }
            L_0x0022:
                kg3.C76577a.m92172w(r0)
                r1 = 1065353216(0x3f800000, float:1.0)
                int r2 = lg3.C88494d.m110350g()
                float r2 = (float) r2
                r3 = 1137180672(0x43c80000, float:400.0)
                goto L_0x008f
            L_0x002f:
                float r1 = kg3.C76577a.m92170u(r0)
                int r3 = lg3.C88494d.m110350g()
                float r3 = (float) r3
                float r3 = r3 / r2
                r2 = 1070805811(0x3fd33333, float:1.65)
                goto L_0x0065
            L_0x003d:
                float r1 = kg3.C76577a.m92169t(r0)
                int r3 = lg3.C88494d.m110350g()
                float r3 = (float) r3
                float r3 = r3 / r2
                r2 = 1069966950(0x3fc66666, float:1.55)
                goto L_0x0065
            L_0x004b:
                float r1 = kg3.C76577a.m92168s(r0)
                int r3 = lg3.C88494d.m110350g()
                float r3 = (float) r3
                float r3 = r3 / r2
                r2 = 1068708659(0x3fb33333, float:1.4)
                goto L_0x0065
            L_0x0059:
                float r1 = kg3.C76577a.m92167r(r0)
                int r3 = lg3.C88494d.m110350g()
                float r3 = (float) r3
                float r3 = r3 / r2
                r2 = 1066401792(0x3f900000, float:1.125)
            L_0x0065:
                float r3 = r3 * r2
                goto L_0x0091
            L_0x0068:
                float r2 = kg3.C76577a.m92174y(r0)
                int r3 = lg3.C88494d.m110350g()
                float r3 = (float) r3
                float r3 = r3 / r1
                r1 = 1066359849(0x3f8f5c29, float:1.12)
                float r3 = r3 * r1
                goto L_0x0082
            L_0x0078:
                float r2 = kg3.C76577a.m92171v(r0)
                int r3 = lg3.C88494d.m110350g()
                float r3 = (float) r3
                float r3 = r3 / r1
            L_0x0082:
                r1 = r2
                goto L_0x0091
            L_0x0084:
                float r1 = kg3.C76577a.m92173x(r0)
                int r2 = lg3.C88494d.m110350g()
                float r2 = (float) r2
                r3 = 1138491392(0x43dc0000, float:440.0)
            L_0x008f:
                float r3 = r2 / r3
            L_0x0091:
                boolean r2 = kg3.C76577a.m92160k(r0)
                if (r2 != 0) goto L_0x0098
                r3 = r1
            L_0x0098:
                xm2.f r2 = new xm2.f
                r2.<init>()
                r2.f231709a = r1
                r2.f231710b = r3
                r1 = r2
            L_0x00a2:
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                float r3 = r1.f231709a
                r2.f205720h = r3
                float r1 = r1.f231710b
                r2.f205721i = r1
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r6.f205723a
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                r3 = 2131165591(0x7f070197, float:1.7945403E38)
                int r2 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r2, r3)
                float r2 = (float) r2
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r4 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                float r4 = r4.f205721i
                float r2 = r2 * r4
                r4 = 0
                r1.mo154994l(r4, r2)
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r6.f205724b
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                int r2 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r2, r3)
                float r2 = (float) r2
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r5 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                float r5 = r5.f205721i
                float r2 = r2 * r5
                r1.mo154994l(r4, r2)
                com.tencent.mm.ui.widget.MMNeat7extView r1 = r6.f205725c
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
                int r2 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r2, r3)
                float r2 = (float) r2
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r3 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                float r3 = r3.f205721i
                float r2 = r2 * r3
                r1.mo154994l(r4, r2)
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r1 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                r2 = 2131165186(0x7f070002, float:1.7944582E38)
                int r2 = kg3.C76577a.m92155f(r0, r2)
                float r2 = (float) r2
                float r0 = kg3.C76577a.m92161l(r0)
                float r2 = r2 * r0
                r1.setMMTitleSize(r2)
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r0 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                boolean r0 = kg3.C76577a.m92160k(r0)
                if (r0 == 0) goto L_0x0124
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r0 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                android.widget.ImageView r1 = r6.f205726d
                com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.m83542H7(r0, r1, r7)
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r0 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                android.widget.ImageView r1 = r6.f205727e
                com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.m83542H7(r0, r1, r7)
                com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI r0 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.this
                android.widget.ImageView r1 = r6.f205728f
                com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.m83542H7(r0, r1, r7)
            L_0x0124:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsFontUI.C71069a.mo97740a(int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI$b */
    public class C71070b implements MenuItem.OnMenuItemClickListener {
        public C71070b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C115669n.INSTANCE.mo160131h(11609, Integer.valueOf(SettingsFontUI.this.f205716d), Integer.valueOf(SettingsFontUI.this.f205717e), 0);
            Log.m105925i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%s , changeFontSize: %s, curFontSize:%s", 11609, Integer.valueOf(SettingsFontUI.this.f205716d), Integer.valueOf(SettingsFontUI.this.f205717e));
            SettingsFontUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI$c */
    public class C71071c implements MenuItem.OnMenuItemClickListener {
        public C71071c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsFontUI settingsFontUI = SettingsFontUI.this;
            float f = settingsFontUI.f205719g;
            if (settingsFontUI.f205720h != f) {
                C77426q qVar = new C77426q(settingsFontUI.getContext());
                qVar.mo107595g(settingsFontUI.getContext().getResources().getString(C0966R.string.io5));
                qVar.mo107589a(true);
                qVar.mo107590b(new C71146i2(settingsFontUI, f));
                qVar.mo107603o();
            } else {
                C115669n.INSTANCE.mo160131h(11609, Integer.valueOf(settingsFontUI.f205716d), Integer.valueOf(settingsFontUI.f205717e), 0);
                Log.m105925i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%s , changeFontSize: %s, curFontSize:%s", 11609, Integer.valueOf(settingsFontUI.f205716d), Integer.valueOf(settingsFontUI.f205717e));
                settingsFontUI.finish();
            }
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m83542H7(SettingsFontUI settingsFontUI, ImageView imageView, int i) {
        settingsFontUI.getClass();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        float g = ((float) C88494d.m110350g()) / ((float) C78045b.m94196b(i));
        if (layoutParams != null) {
            layoutParams.width = (int) (((float) C76577a.m92155f(settingsFontUI.getContext(), C0966R.dimen.f3948l7)) * g);
            layoutParams.height = (int) (((float) C76577a.m92155f(settingsFontUI.getContext(), C0966R.dimen.f3948l7)) * g);
            imageView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: I7 */
    public static float m83543I7(Context context) {
        float m = C76577a.m92162m(context);
        C76577a.m92172w(context);
        if (m == 1.0f || m == C76577a.m92173x(context) || m == C76577a.m92171v(context) || m == C76577a.m92174y(context) || m == C76577a.m92167r(context) || m == C76577a.m92168s(context) || m == C76577a.m92169t(context) || m == C76577a.m92170u(context)) {
            return m;
        }
        C76577a.m92172w(context);
        return 1.0f;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C115669n.INSTANCE.mo160131h(11609, Integer.valueOf(this.f205716d), Integer.valueOf(this.f205717e), 0);
        Log.m105925i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%s , changeFontSize: %s, curFontSize:%s", 11609, Integer.valueOf(this.f205716d), Integer.valueOf(this.f205717e));
        finish();
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxd;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.j0q);
        float I7 = m83543I7(getContext());
        this.f205719g = I7;
        this.f205720h = I7;
        Log.m105924i("MicroMsg.SettingsFontUI", "fontSizeBefore=" + this.f205719g);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.b3u);
        ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.a28);
        ImageView imageView3 = (ImageView) findViewById(C0966R.C0970id.a29);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) findViewById(C0966R.C0970id.jek);
        MMNeat7extView mMNeat7extView2 = (MMNeat7extView) findViewById(C0966R.C0970id.jei);
        MMNeat7extView mMNeat7extView3 = (MMNeat7extView) findViewById(C0966R.C0970id.jej);
        if (C86709a0.m107522a()) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, C75592q0.m90789s());
        }
        int f = (int) (((float) C76577a.m92155f(getContext(), C0966R.dimen.f4284yo)) / C88494d.f255615g);
        this.f205718f = f;
        mMNeat7extView2.setMaxWidth(f);
        mMNeat7extView3.setMaxWidth(this.f205718f);
        FontSelectorView fontSelectorView = (FontSelectorView) findViewById(C0966R.C0970id.ecw);
        float I72 = m83543I7(getContext());
        AppCompatActivity context = getContext();
        float f2 = 1.0f;
        int i = 0;
        if (context != null) {
            f2 = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getFloat("current_text_size_scale_key", 1.0f);
        }
        if (I72 != f2) {
            C78045b.m94198d(getContext(), I72);
        }
        if (I72 < C76577a.m92173x(getContext()) || I72 > C76577a.m92170u(getContext())) {
            I72 = C76577a.m92173x(getContext());
        }
        if (I72 != C76577a.m92173x(getContext())) {
            i = I72 == C76577a.m92171v(getContext()) ? 2 : I72 == C76577a.m92174y(getContext()) ? 3 : I72 == C76577a.m92167r(getContext()) ? 4 : I72 == C76577a.m92168s(getContext()) ? 5 : I72 == C76577a.m92169t(getContext()) ? 6 : I72 == C76577a.m92170u(getContext()) ? 7 : 1;
        }
        fontSelectorView.setSliderIndex(i);
        fontSelectorView.setOnChangeListener(new C71069a(mMNeat7extView, mMNeat7extView2, mMNeat7extView3, imageView, imageView2, imageView3));
        this.f205717e = C76577a.m92163n(getContext());
        setBackBtn(new C71070b());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C71071c(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return super.onKeyDown(i, keyEvent);
        }
        C115669n.INSTANCE.mo160131h(11609, Integer.valueOf(this.f205716d), Integer.valueOf(this.f205717e), 0);
        Log.m105925i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%s , changeFontSize: %s, curFontSize:%s", 11609, Integer.valueOf(this.f205716d), Integer.valueOf(this.f205717e));
        finish();
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C54144b.class);
    }
}
