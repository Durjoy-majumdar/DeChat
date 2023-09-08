package com.tencent.p014mm.plugin.teenmode.p111ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;

/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainOther */
public class SettingsTeenModeMainOther extends MMActivity {

    /* renamed from: d */
    public WeImageView f21537d;

    /* renamed from: e */
    public MMImageView f21538e;

    /* renamed from: f */
    public TextView f21539f;

    /* renamed from: g */
    public TextView f21540g;

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainOther$a */
    public class C5613a implements MenuItem.OnMenuItemClickListener {
        public C5613a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsTeenModeMainOther.this.onBackPressed();
            return true;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.by6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0147, code lost:
        r3 = com.tencent.p014mm.C0966R.color.f2933h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0177, code lost:
        r0 = r3;
        r3 = com.tencent.p014mm.C0966R.color.f2966ao;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x018d, code lost:
        r3 = com.tencent.p014mm.C0966R.color.f2960ag;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0190, code lost:
        r6 = r1;
        r1 = r0;
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0194, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0195, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0197, code lost:
        if (r2 <= 0) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x019f, code lost:
        if (r7.f21537d.getVisibility() != 0) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01a1, code lost:
        r7.f21537d.setImageDrawable(kg3.C76577a.m92158i(getContext(), r2));
        r7.f21537d.setIconColor(kg3.C76577a.m92153d(getContext(), r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01bf, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r1) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01c1, code lost:
        r7.f21539f.setText(r1);
        r7.f21539f.setContentDescription(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01cf, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0) != false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01d1, code lost:
        r7.f21540g.setText(r0);
        r7.f21540g.setContentDescription(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01db, code lost:
        setBackBtn(new com.tencent.p014mm.plugin.teenmode.p111ui.SettingsTeenModeMainOther.C5613a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01e3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init() {
        /*
            r7 = this;
            java.lang.String r0 = ""
            r7.setMMTitle((java.lang.String) r0)
            r7.hideActionbarLine()
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131101833(0x7f060889, float:1.7816087E38)
            int r1 = r1.getColor(r2)
            r7.setActionbarColor(r1)
            r1 = 2131306235(0x7f0926fb, float:1.8230663E38)
            android.view.View r1 = r7.findViewById(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r7.f21537d = r1
            r1 = 2131305527(0x7f092437, float:1.8229227E38)
            android.view.View r1 = r7.findViewById(r1)
            com.tencent.mm.ui.MMImageView r1 = (com.tencent.p014mm.p136ui.MMImageView) r1
            r7.f21538e = r1
            r1 = 2131315432(0x7f094ae8, float:1.8249317E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.f21539f = r1
            r1 = 2131300854(0x7f0911f6, float:1.821975E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.f21540g = r1
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r2 = "biz_type"
            r3 = 0
            int r1 = r1.getIntExtra(r2, r3)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2[r3] = r4
            java.lang.String r4 = "MicroMsg.SettingsTeenModeMainOther"
            java.lang.String r5 = "type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)
            r2 = -1
            r4 = 2131099897(0x7f0600f9, float:1.781216E38)
            switch(r1) {
                case 1: goto L_0x017c;
                case 2: goto L_0x0166;
                case 3: goto L_0x014b;
                case 4: goto L_0x0136;
                case 5: goto L_0x0124;
                case 6: goto L_0x0112;
                case 7: goto L_0x00f8;
                case 8: goto L_0x00c9;
                case 9: goto L_0x007a;
                case 10: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x0194
        L_0x0067:
            r0 = 2131837768(0x7f114348, float:1.930874E38)
            java.lang.String r0 = r7.getString(r0)
            r1 = 2131837748(0x7f114334, float:1.93087E38)
            java.lang.String r1 = r7.getString(r1)
            r2 = 2131756291(0x7f100503, float:1.9143485E38)
            goto L_0x018d
        L_0x007a:
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r7.f21537d
            androidx.appcompat.app.AppCompatActivity r3 = r7.getContext()
            r4 = 2131756316(0x7f10051c, float:1.9143536E38)
            android.graphics.drawable.Drawable r3 = kg3.C76577a.m92158i(r3, r4)
            r1.setImageDrawable(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r7.f21537d
            androidx.appcompat.app.AppCompatActivity r3 = r7.getContext()
            r4 = 2131101164(0x7f0605ec, float:1.781473E38)
            int r3 = kg3.C76577a.m92153d(r3, r4)
            r1.setIconColor(r3)
            android.widget.TextView r1 = r7.f21539f
            r3 = 2131837770(0x7f11434a, float:1.9308744E38)
            r1.setText(r3)
            android.widget.TextView r1 = r7.f21540g
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131824615(0x7f110fe7, float:1.9282063E38)
            java.lang.String r3 = r3.getString(r4)
            r1.setText(r3)
            android.widget.TextView r1 = r7.f21540g
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r4)
            r1.setContentDescription(r3)
            goto L_0x0194
        L_0x00c9:
            java.lang.Class<gt1.b> r0 = gt1.C20838b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt1.b r0 = (gt1.C20838b) r0
            boolean r0 = r0.mo32540ag()
            if (r0 == 0) goto L_0x00e6
            r0 = 2131837775(0x7f11434f, float:1.9308755E38)
            java.lang.String r0 = r7.getString(r0)
            r1 = 2131824619(0x7f110feb, float:1.9282071E38)
            java.lang.String r1 = r7.getString(r1)
            goto L_0x00f4
        L_0x00e6:
            r0 = 2131837774(0x7f11434e, float:1.9308753E38)
            java.lang.String r0 = r7.getString(r0)
            r1 = 2131824618(0x7f110fea, float:1.928207E38)
            java.lang.String r1 = r7.getString(r1)
        L_0x00f4:
            r2 = 2131756335(0x7f10052f, float:1.9143575E38)
            goto L_0x0147
        L_0x00f8:
            r2 = 2131756494(0x7f1005ce, float:1.9143897E38)
            r0 = 2131099756(0x7f06006c, float:1.7811874E38)
            r1 = 2131837780(0x7f114354, float:1.9308765E38)
            java.lang.String r1 = r7.getString(r1)
            r3 = 2131824623(0x7f110fef, float:1.928208E38)
            java.lang.String r3 = r7.getString(r3)
            r0 = r3
            r3 = 2131099756(0x7f06006c, float:1.7811874E38)
            goto L_0x0197
        L_0x0112:
            r2 = 2131756450(0x7f1005a2, float:1.9143808E38)
            r0 = 2131837778(0x7f114352, float:1.930876E38)
            java.lang.String r1 = r7.getString(r0)
            r0 = 2131824621(0x7f110fed, float:1.9282075E38)
            java.lang.String r3 = r7.getString(r0)
            goto L_0x0177
        L_0x0124:
            r0 = 2131837777(0x7f114351, float:1.9308759E38)
            java.lang.String r0 = r7.getString(r0)
            r1 = 2131824620(0x7f110fec, float:1.9282073E38)
            java.lang.String r1 = r7.getString(r1)
            r2 = 2131756446(0x7f10059e, float:1.91438E38)
            goto L_0x0147
        L_0x0136:
            r0 = 2131837773(0x7f11434d, float:1.930875E38)
            java.lang.String r0 = r7.getString(r0)
            r1 = 2131824617(0x7f110fe9, float:1.9282067E38)
            java.lang.String r1 = r7.getString(r1)
            r2 = 2131756382(0x7f10055e, float:1.914367E38)
        L_0x0147:
            r3 = 2131099737(0x7f060059, float:1.7811836E38)
            goto L_0x0190
        L_0x014b:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r7.f21537d
            r1 = 8
            r0.setVisibility(r1)
            com.tencent.mm.ui.MMImageView r0 = r7.f21538e
            r0.setVisibility(r3)
            r0 = 2131837771(0x7f11434b, float:1.9308746E38)
            java.lang.String r0 = r7.getString(r0)
            r1 = 2131824616(0x7f110fe8, float:1.9282065E38)
            java.lang.String r1 = r7.getString(r1)
            goto L_0x0195
        L_0x0166:
            r2 = 2131756443(0x7f10059b, float:1.9143794E38)
            r0 = 2131837767(0x7f114347, float:1.9308738E38)
            java.lang.String r1 = r7.getString(r0)
            r0 = 2131824614(0x7f110fe6, float:1.928206E38)
            java.lang.String r3 = r7.getString(r0)
        L_0x0177:
            r0 = r3
            r3 = 2131099897(0x7f0600f9, float:1.781216E38)
            goto L_0x0197
        L_0x017c:
            r0 = 2131837779(0x7f114353, float:1.9308763E38)
            java.lang.String r0 = r7.getString(r0)
            r1 = 2131824622(0x7f110fee, float:1.9282077E38)
            java.lang.String r1 = r7.getString(r1)
            r2 = 2131756384(0x7f100560, float:1.9143674E38)
        L_0x018d:
            r3 = 2131099865(0x7f0600d9, float:1.7812095E38)
        L_0x0190:
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0197
        L_0x0194:
            r1 = r0
        L_0x0195:
            r3 = -1
            goto L_0x0190
        L_0x0197:
            if (r2 <= 0) goto L_0x01bb
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r7.f21537d
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x01bb
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r7.f21537d
            androidx.appcompat.app.AppCompatActivity r5 = r7.getContext()
            android.graphics.drawable.Drawable r2 = kg3.C76577a.m92158i(r5, r2)
            r4.setImageDrawable(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r7.f21537d
            androidx.appcompat.app.AppCompatActivity r4 = r7.getContext()
            int r3 = kg3.C76577a.m92153d(r4, r3)
            r2.setIconColor(r3)
        L_0x01bb:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x01cb
            android.widget.TextView r2 = r7.f21539f
            r2.setText(r1)
            android.widget.TextView r2 = r7.f21539f
            r2.setContentDescription(r1)
        L_0x01cb:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x01db
            android.widget.TextView r1 = r7.f21540g
            r1.setText(r0)
            android.widget.TextView r1 = r7.f21540g
            r1.setContentDescription(r0)
        L_0x01db:
            com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainOther$a r0 = new com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainOther$a
            r0.<init>()
            r7.setBackBtn(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.teenmode.p111ui.SettingsTeenModeMainOther.init():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }
}
