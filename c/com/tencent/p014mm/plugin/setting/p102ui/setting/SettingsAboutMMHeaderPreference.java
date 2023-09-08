package com.tencent.p014mm.plugin.setting.p102ui.setting;

import a70.C112760b;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdcard_migrate.C85730f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.xweb.XWebSdk;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import p03.C21912d;
import p564iq.C87790d;
import p773yy.C79168k;
import qe3.C89625d;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference */
public class SettingsAboutMMHeaderPreference extends Preference {

    /* renamed from: J */
    public String f205658J = "";

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference$a */
    public class C71056a implements View.OnClickListener {

        /* renamed from: d */
        public long f205659d = 0;

        public C71056a() {
        }

        public void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMMHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long nowMilliSecond = Util.nowMilliSecond();
            long j = this.f205659d;
            if (j > nowMilliSecond || nowMilliSecond - j > 300) {
                this.f205659d = nowMilliSecond;
                C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMMHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            this.f205659d = nowMilliSecond;
            Context context = SettingsAboutMMHeaderPreference.this.f121274d;
            StringBuilder sb = new StringBuilder();
            int i = C89625d.f257841g;
            sb.append(String.format("[ver  ] %s %08X\n", new Object[]{ChannelUtil.formatVersion(context, i, true), Integer.valueOf(i)}));
            sb.append(BuildInfo.info());
            sb.append(String.format("[storage] %s|%s\n", new Object[]{C112760b.m154230f0(), Integer.valueOf(C85730f.m105911a(C112760b.m154223c()) ? 1 : 0)}));
            sb.append(String.format("[cid  ] %d\n", new Object[]{Integer.valueOf(ChannelUtil.channelId)}));
            sb.append(String.format("[target.ver] %d\n", new Object[]{Integer.valueOf(MMApplicationContext.getContext().getApplicationInfo().targetSdkVersion)}));
            sb.append(String.format("[s.ver] %d\n", new Object[]{Integer.valueOf(C43471q.m46977a(0))}));
            sb.append(String.format("[t.ver] %d\n", new Object[]{Integer.valueOf(C43471q.m46977a(6))}));
            sb.append(String.format("[l.ver] %d %s\n", new Object[]{Integer.valueOf(C43471q.m46977a(1)), ((C21912d) C86312j.m106911c(C21912d.class)).mo34965kw()}));
            sb.append(String.format("[w.ver] %d\n", new Object[]{Integer.valueOf(C43471q.m46977a(3))}));
            sb.append(String.format("[box.ver] %d\n", new Object[]{Integer.valueOf(C43471q.m46977a(2))}));
            sb.append(String.format("[pardus.ver] %d\n", new Object[]{Integer.valueOf(C43471q.m46977a(5))}));
            sb.append(String.format("[ts.ver] %d\n", new Object[]{Long.valueOf(((C79168k) C86312j.m106911c(C79168k.class)).mo74118OU())}));
            sb.append(String.format("[r.ver] %s\n", new Object[]{BuildInfo.curClientVersion}));
            Object[] objArr = new Object[1];
            SettingsAboutMMHeaderPreference.this.getClass();
            Class cls = C87790d.class;
            if (((C87790d) C86312j.m106911c(cls)).needObbRes()) {
                str = "not found";
                String obbInfo = ((C87790d) C86312j.m106911c(cls)).getObbInfo();
                if (!TextUtils.isEmpty(obbInfo)) {
                    str = obbInfo;
                } else {
                    String lastObbErrorInfo = ((C87790d) C86312j.m106911c(cls)).getLastObbErrorInfo();
                    if (!TextUtils.isEmpty(lastObbErrorInfo)) {
                        str = str + "(" + lastObbErrorInfo + ")";
                    }
                }
            } else {
                str = "disabled";
            }
            objArr[0] = str;
            sb.append(String.format("[exp.ver] %s\n", objArr));
            sb.append(String.format("[app.usrid] %s\n", new Object[]{Integer.valueOf(ScopedStorageUtil.WorkProfiles.getAppUserId())}));
            sb.append(String.format("[app.usrinfo] %s\n", new Object[]{ScopedStorageUtil.WorkProfiles.getAppUserInfo(MMApplicationContext.getContext())}));
            sb.append(String.format("[app.profile] %s\n", new Object[]{ScopedStorageUtil.WorkProfiles.getAppProfile(MMApplicationContext.getContext())}));
            sb.append(String.format("[application] %s\n", new Object[]{SettingsAboutMMHeaderPreference.this.f121274d.getPackageName()}));
            sb.append(String.format("[brand] %d %s\n", new Object[]{Integer.valueOf(WeChatBrands.UserInfo.xagreementId), WeChatBrands.AppInfo.lang}));
            sb.append(String.format("[xweb] %s %s %s\n", new Object[]{Integer.valueOf(XWebSdk.getXWebSdkVersion()), Integer.valueOf(XWebSdk.getInstalledNewstVersion(MMApplicationContext.getContext())), Integer.valueOf(XWebSdk.getWebViewModeCommandForMM().ordinal())}));
            TextView textView = new TextView(context);
            textView.setText(sb);
            textView.setGravity(19);
            textView.setTextSize(1, 10.0f);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            textView.setTextColor(SettingsAboutMMHeaderPreference.this.f121274d.getResources().getColor(C0966R.color.FG_0));
            textView.setTypeface(Typeface.MONOSPACE);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            C76879j.m92746q(context, (String) null, textView, (DialogInterface.OnClickListener) null);
            long currentTimeMillis = System.currentTimeMillis();
            C119179t tVar = C119157j.f356862d;
            SettingsAboutMMHeaderPreference$a$$a settingsAboutMMHeaderPreference$a$$a = new SettingsAboutMMHeaderPreference$a$$a(currentTimeMillis);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183887r(settingsAboutMMHeaderPreference$a$$a, 0, "SettingsAboutHeader");
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMMHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public SettingsAboutMMHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.l49);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.f5295b7);
        if (textView != null) {
            textView.getPaint().setFakeBoldText(true);
            textView.setText(MMApplicationContext.getResources().getString(C0966R.string.imi));
        }
        ((TextView) view.findViewById(C0966R.C0970id.f5294b6)).setText(String.format("%s %s", new Object[]{"Version", this.f205658J}));
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C71056a());
        }
    }

    public SettingsAboutMMHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettingsAboutMMHeaderPreference(Context context) {
        super(context);
    }
}
