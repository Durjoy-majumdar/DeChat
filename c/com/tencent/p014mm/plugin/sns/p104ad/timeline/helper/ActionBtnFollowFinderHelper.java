package com.tencent.p014mm.plugin.sns.p104ad.timeline.helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import co2.C92442i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FollowUserEvent;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import jq2.C46567a;
import jq2.C98983b;
import qo3.C77407n;
import qo3.C89779i0;
import rq2.C101419f;
import up2.C102064e;

/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper */
public class ActionBtnFollowFinderHelper {

    /* renamed from: t */
    public static String f274158t;

    /* renamed from: a */
    public Context f274159a;

    /* renamed from: b */
    public ViewGroup f274160b;

    /* renamed from: c */
    public C77407n f274161c;

    /* renamed from: d */
    public C89779i0 f274162d;

    /* renamed from: e */
    public SnsInfo f274163e;

    /* renamed from: f */
    public AdClickActionInfo f274164f;

    /* renamed from: g */
    public C92442i f274165g;

    /* renamed from: h */
    public AdLandingPagesProxy.C94830p f274166h;

    /* renamed from: i */
    public FollowUserEventListener f274167i;

    /* renamed from: j */
    public View f274168j;

    /* renamed from: k */
    public Button f274169k;

    /* renamed from: l */
    public ImageView f274170l;

    /* renamed from: m */
    public TextView f274171m;

    /* renamed from: n */
    public TextView f274172n;

    /* renamed from: o */
    public TextView f274173o;

    /* renamed from: p */
    public TextView f274174p;

    /* renamed from: q */
    public C102064e.C102068b f274175q;

    /* renamed from: r */
    public int f274176r;

    /* renamed from: s */
    public String f274177s;

    /* renamed from: com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener */
    public static class FollowUserEventListener extends IListener<FollowUserEvent> {

        /* renamed from: d */
        public WeakReference<ActionBtnFollowFinderHelper> f164240d;

        public FollowUserEventListener(ActionBtnFollowFinderHelper actionBtnFollowFinderHelper) {
            super(C40008f.f107254d);
            this.f164240d = new WeakReference<>(actionBtnFollowFinderHelper);
            this.__eventId = 398763182;
        }

        public boolean callback(IEvent iEvent) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener");
            FollowUserEvent followUserEvent = (FollowUserEvent) iEvent;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener");
            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper = this.f164240d.get();
            if (actionBtnFollowFinderHelper == null) {
                Log.m105928w("ActionBtnFollowFinderHelper", "FollowUserEventListener, helper==null");
                dead();
            } else if (followUserEvent == null || followUserEvent.f154820d == null) {
                Log.m105928w("ActionBtnFollowFinderHelper", "FollowUserEventListener, event.data==null");
            } else {
                Log.m105924i("ActionBtnFollowFinderHelper", "FollowUserEventListener, result=" + followUserEvent.f154820d.f154823c + ", opType=" + followUserEvent.f154820d.f154822b + ", opScene=" + followUserEvent.f154820d.f154824d + ", finderUserName=" + followUserEvent.f154820d.f154821a);
                FollowUserEvent.C55139a aVar = followUserEvent.f154820d;
                if (aVar.f154822b == 1 && aVar.f154824d == 102 && actionBtnFollowFinderHelper.mo130395b().equals(followUserEvent.f154820d.f154821a)) {
                    MMHandlerThread.postToMainThread(new C57335a(this, followUserEvent, actionBtnFollowFinderHelper));
                } else {
                    Log.m105928w("ActionBtnFollowFinderHelper", "FollowUserEventListener, event from other");
                }
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener");
            return true;
        }
    }

    public ActionBtnFollowFinderHelper(Context context, ViewGroup viewGroup, int i, C102064e.C102068b bVar) {
        this.f274159a = context;
        this.f274160b = viewGroup;
        this.f274176r = i;
        this.f274175q = bVar;
    }

    /* renamed from: a */
    public static String m119938a(int i) {
        SnsMethodCalculate.markStartTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        if (f274158t == null) {
            f274158t = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        }
        if (f274158t == null) {
            f274158t = "";
        }
        if (i <= 0) {
            SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return "0";
        } else if (i <= 999) {
            String valueOf = String.valueOf(i);
            SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return valueOf;
        } else if (f274158t.equals("zh_CN") || f274158t.equals("zh_HK") || f274158t.equals("zh_TW")) {
            if (i <= 9999) {
                String valueOf2 = String.valueOf(i);
                SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                return valueOf2;
            } else if (i <= 990000) {
                String string = MMApplicationContext.getContext().getString(C0966R.string.jfh, new Object[]{Double.valueOf(((double) ((((float) i) * 1.0f) / 10000.0f)) - 0.05d)});
                SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                return string;
            } else {
                String string2 = MMApplicationContext.getContext().getString(C0966R.string.jfj, new Object[]{99});
                SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                return string2;
            }
        } else if (i <= 999000) {
            String string3 = MMApplicationContext.getContext().getString(C0966R.string.jfi, new Object[]{Double.valueOf(((double) ((((float) i) * 1.0f) / 1000.0f)) - 0.05d)});
            SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return string3;
        } else {
            String string4 = MMApplicationContext.getContext().getString(C0966R.string.jfk, new Object[]{999});
            SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return string4;
        }
    }

    /* renamed from: b */
    public String mo130395b() {
        String str;
        SnsMethodCalculate.markStartTimeMs("getFinderUserName", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        C92442i iVar = this.f274165g;
        if (iVar == null || (str = iVar.f264532a) == null) {
            SnsMethodCalculate.markEndTimeMs("getFinderUserName", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return "";
        }
        SnsMethodCalculate.markEndTimeMs("getFinderUserName", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        return str;
    }

    /* renamed from: c */
    public void mo130396c() {
        SnsMethodCalculate.markStartTimeMs("hideProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        C89779i0 i0Var = this.f274162d;
        if (i0Var != null && i0Var.isShowing()) {
            this.f274162d.dismiss();
            Log.m105924i("ActionBtnFollowFinderHelper", "hideProgressDlg");
        }
        SnsMethodCalculate.markEndTimeMs("hideProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
    }

    /* renamed from: d */
    public void mo130397d(C92442i iVar, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        if (this.f274161c == null) {
            ViewGroup viewGroup = this.f274160b;
            SnsMethodCalculate.markStartTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            View inflate = LayoutInflater.from(this.f274159a).inflate(C0966R.C0971layout.az5, viewGroup, false);
            View findViewById = inflate.findViewById(C0966R.C0970id.bem);
            this.f274169k = (Button) inflate.findViewById(C0966R.C0970id.ec5);
            this.f274170l = (ImageView) inflate.findViewById(C0966R.C0970id.a1p);
            this.f274171m = (TextView) inflate.findViewById(C0966R.C0970id.hft);
            this.f274172n = (TextView) inflate.findViewById(C0966R.C0970id.f357845c22);
            this.f274173o = (TextView) inflate.findViewById(C0966R.C0970id.ecf);
            this.f274174p = (TextView) inflate.findViewById(C0966R.C0970id.f358002cz0);
            this.f274168j = inflate;
            findViewById.setOnClickListener(new C46567a(this));
            this.f274169k.setOnClickListener(new C98983b(this));
            SnsMethodCalculate.markEndTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            C77407n nVar = new C77407n(this.f274159a, true, 0);
            this.f274161c = nVar;
            nVar.mo107569n(this.f274168j, true);
            C77407n nVar2 = this.f274161c;
            nVar2.f225776l1 = true;
            nVar2.mo107559d(true);
        }
        SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        this.f274171m.setText(iVar.f264534c);
        this.f274172n.setText(iVar.f264535d);
        if (this.f274176r == 1000) {
            this.f274169k.setText(Util.isNullOrNil(this.f274177s) ? "关注视频号" : this.f274177s);
        }
        if (i > 0) {
            this.f274173o.setText(this.f274159a.getResources().getString(C0966R.string.j_9, new Object[]{m119938a(i)}));
            this.f274173o.setVisibility(0);
        } else {
            this.f274173o.setVisibility(8);
        }
        if (i2 > 0) {
            this.f274174p.setText(this.f274159a.getResources().getString(C0966R.string.j_8, new Object[]{m119938a(i2)}));
            this.f274174p.setVisibility(0);
        } else {
            this.f274174p.setVisibility(8);
        }
        C101419f.m133080c(iVar.f264533b, this.f274170l);
        SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        if (!this.f274161c.mo107563h()) {
            this.f274161c.mo107573q();
        }
        SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
    }
}
