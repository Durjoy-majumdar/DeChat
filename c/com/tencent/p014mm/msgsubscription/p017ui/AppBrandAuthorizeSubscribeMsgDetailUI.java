package com.tencent.p014mm.msgsubscription.p017ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import ce0.C113319b;
import ce0.C80017c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.voice.PlayVoiceData;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.SelectPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import pj3.C47511g;
import qo3.C77398g;
import zd0.C119096a;
import zd0.C119098d;
import zd0.C119099e;
import zd0.C16135b;
import zd0.C79321c;

/* renamed from: com.tencent.mm.msgsubscription.ui.AppBrandAuthorizeSubscribeMsgDetailUI */
public class AppBrandAuthorizeSubscribeMsgDetailUI extends MMPreference {

    /* renamed from: q */
    public static final /* synthetic */ int f344104q = 0;

    /* renamed from: d */
    public C47511g f344105d;

    /* renamed from: e */
    public SubscribeMsgTmpItem f344106e = null;

    /* renamed from: f */
    public boolean f344107f;

    /* renamed from: g */
    public SelectPreference f344108g;

    /* renamed from: h */
    public SelectPreference f344109h;

    /* renamed from: i */
    public SelectPreference f344110i;

    /* renamed from: j */
    public SelectPreference f344111j;

    /* renamed from: n */
    public SelectPreference f344112n = null;

    /* renamed from: o */
    public SelectPreference f344113o = null;

    /* renamed from: p */
    public final AtomicLong f344114p = new AtomicLong(0);

    /* renamed from: com.tencent.mm.msgsubscription.ui.AppBrandAuthorizeSubscribeMsgDetailUI$a */
    public class C68148a extends Preference {

        /* renamed from: J */
        public View.OnClickListener f195831J;

        /* renamed from: com.tencent.mm.msgsubscription.ui.AppBrandAuthorizeSubscribeMsgDetailUI$a$a */
        public class C68149a implements View.OnClickListener {
            public C68149a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/msgsubscription/ui/AppBrandAuthorizeSubscribeMsgDetailUI$ShowSamplePreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                View.OnClickListener onClickListener = C68148a.this.f195831J;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/AppBrandAuthorizeSubscribeMsgDetailUI$ShowSamplePreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C68148a(Context context, View.OnClickListener onClickListener) {
            super(context);
            this.f195831J = onClickListener;
            this.f121271G = C0966R.C0971layout.bze;
        }

        /* renamed from: w */
        public void mo1086w(View view) {
            super.mo1086w(view);
        }

        /* renamed from: x */
        public View mo1087x(ViewGroup viewGroup) {
            View x = super.mo1087x(viewGroup);
            View findViewById = x.findViewById(C0966R.C0970id.khj);
            findViewById.setOnClickListener(new C68149a());
            findViewById.setContentDescription(AppBrandAuthorizeSubscribeMsgDetailUI.this.getResources().getString(C0966R.string.ao9) + "," + AppBrandAuthorizeSubscribeMsgDetailUI.this.getResources().getString(C0966R.string.f360187ao2));
            return x;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo174409H7() {
        /*
            r5 = this;
            com.tencent.mm.ui.base.preference.SelectPreference r0 = r5.f344113o
            r1 = 0
            if (r0 == 0) goto L_0x008e
            com.tencent.mm.ui.base.preference.SelectPreference r2 = r5.f344112n
            if (r0 == r2) goto L_0x008e
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r0 = r0.f121285r
            r3[r1] = r0
            java.lang.String r0 = "MicroMsg.AppBrandAuthorizeDetailUI"
            java.lang.String r4 = "setResData, has changed, state:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r3)
            com.tencent.mm.ui.base.preference.SelectPreference r0 = r5.f344113o
            java.lang.String r0 = r0.f121285r
            r0.getClass()
            int r3 = r0.hashCode()
            r4 = -1
            switch(r3) {
                case -539313406: goto L_0x004a;
                case 1193881254: goto L_0x003f;
                case 1670060592: goto L_0x0034;
                case 1820626124: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            r0 = -1
            goto L_0x0054
        L_0x0029:
            java.lang.String r3 = "preference_key_accept"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            r0 = 3
            goto L_0x0054
        L_0x0034:
            java.lang.String r3 = "preference_key_accept_allow_play_voice"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x003d
            goto L_0x0027
        L_0x003d:
            r0 = 2
            goto L_0x0054
        L_0x003f:
            java.lang.String r3 = "preference_key_accept_allow_force_notify"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0048
            goto L_0x0027
        L_0x0048:
            r0 = 1
            goto L_0x0054
        L_0x004a:
            java.lang.String r3 = "preference_key_no_accept"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0053
            goto L_0x0027
        L_0x0053:
            r0 = 0
        L_0x0054:
            switch(r0) {
                case 0: goto L_0x006f;
                case 1: goto L_0x0068;
                case 2: goto L_0x0061;
                case 3: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x0077
        L_0x0058:
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r0 = r5.f344106e
            r0.f49033u = r1
            r0.f49036x = r1
            r5.f344107f = r2
            goto L_0x0077
        L_0x0061:
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r0 = r5.f344106e
            r0.f49033u = r2
            r5.f344107f = r2
            goto L_0x0077
        L_0x0068:
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r0 = r5.f344106e
            r0.f49036x = r2
            r5.f344107f = r2
            goto L_0x0077
        L_0x006f:
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r0 = r5.f344106e
            r0.f49033u = r1
            r0.f49036x = r1
            r5.f344107f = r1
        L_0x0077:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r1 = r5.f344106e
            java.lang.String r2 = "key_data"
            r0.putExtra(r2, r1)
            boolean r1 = r5.f344107f
            java.lang.String r2 = "key_status_subscribed"
            r0.putExtra(r2, r1)
            r5.setResult(r4, r0)
            goto L_0x0092
        L_0x008e:
            r0 = 0
            r5.setResult(r1, r0)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.msgsubscription.p017ui.AppBrandAuthorizeSubscribeMsgDetailUI.mo174409H7():void");
    }

    public int getResourceId() {
        return -1;
    }

    public void onBackPressed() {
        mo174409H7();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setBackBtn(new C119096a(this));
        Parcelable parcelableExtra = getIntent().getParcelableExtra("key_data");
        this.f344107f = getIntent().getBooleanExtra("key_status_subscribed", false);
        if (!(parcelableExtra instanceof SubscribeMsgTmpItem)) {
            finish();
        } else {
            this.f344106e = (SubscribeMsgTmpItem) parcelableExtra;
            if (getIntent() == null || Util.isNullOrNil(this.f344106e.f49020e)) {
                setMMTitle((int) C0966R.string.f7371ea);
            } else {
                setMMTitle(this.f344106e.f49020e);
            }
        }
        C47511g preferenceScreen = getPreferenceScreen();
        this.f344105d = preferenceScreen;
        preferenceScreen.removeAll();
        SelectPreference selectPreference = new SelectPreference(this);
        this.f344108g = selectPreference;
        selectPreference.mo26273A("preference_key_no_accept");
        this.f344108g.mo69923G(C0966R.string.aob);
        this.f344105d.mo72527k(this.f344108g);
        SelectPreference selectPreference2 = new SelectPreference(this);
        this.f344109h = selectPreference2;
        selectPreference2.mo26273A("preference_key_accept");
        this.f344109h.mo69923G(C0966R.string.ao_);
        this.f344105d.mo72527k(this.f344109h);
        this.f344110i = null;
        SubscribeMsgTmpItem subscribeMsgTmpItem = this.f344106e;
        if (subscribeMsgTmpItem.f49032t) {
            SelectPreference selectPreference3 = new SelectPreference(this);
            this.f344110i = selectPreference3;
            selectPreference3.mo26273A("preference_key_accept_allow_play_voice");
            this.f344110i.mo69923G(C0966R.string.aoa);
            this.f344105d.mo72527k(this.f344110i);
        } else if (subscribeMsgTmpItem.f49035w) {
            SelectPreference selectPreference4 = new SelectPreference(this);
            this.f344111j = selectPreference4;
            selectPreference4.mo26273A("preference_key_accept_allow_force_notify");
            this.f344111j.mo69923G(C0966R.string.f360185ao0);
            SelectPreference selectPreference5 = this.f344111j;
            selectPreference5.mo7746I(selectPreference5.f121274d.getResources().getString(C0966R.string.f360186ao1));
            this.f344105d.mo72527k(this.f344111j);
        }
        if (this.f344106e.f49024i.size() > 0) {
            this.f344105d.mo72527k(new C68148a(this, new C16135b(this)));
        }
        if (this.f344107f) {
            SubscribeMsgTmpItem subscribeMsgTmpItem2 = this.f344106e;
            if (subscribeMsgTmpItem2.f49032t && subscribeMsgTmpItem2.f49033u) {
                SelectPreference selectPreference6 = this.f344110i;
                if (selectPreference6 != null) {
                    selectPreference6.f24291M = true;
                    this.f344112n = selectPreference6;
                }
            } else if (!subscribeMsgTmpItem2.f49035w || !subscribeMsgTmpItem2.f49036x) {
                SelectPreference selectPreference7 = this.f344109h;
                selectPreference7.f24291M = true;
                this.f344112n = selectPreference7;
            } else {
                SelectPreference selectPreference8 = this.f344111j;
                if (selectPreference8 != null) {
                    selectPreference8.f24291M = true;
                    this.f344112n = selectPreference8;
                }
            }
        } else {
            SelectPreference selectPreference9 = this.f344108g;
            selectPreference9.f24291M = true;
            this.f344112n = selectPreference9;
        }
        this.f344105d.notifyDataSetChanged();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Log.m105925i("MicroMsg.AppBrandAuthorizeDetailUI", "onPreferenceTreeClick, key:%s", preference.f121285r);
        if (preference.f121285r.equalsIgnoreCase("preference_key_accept_allow_play_voice")) {
            this.f344108g.f24291M = false;
            this.f344109h.f24291M = false;
            SelectPreference selectPreference = this.f344110i;
            if (!selectPreference.f24291M) {
                selectPreference.f24291M = true;
                this.f344113o = selectPreference;
                if (!this.f344106e.f49034v.isEmpty()) {
                    C77398g gVar2 = new C77398g(this);
                    gVar2.setTitle((int) C0966R.string.aof);
                    gVar2.f225709z.setVisibility(0);
                    gVar2.f225697n.setVisibility(0);
                    gVar2.f225697n.setText(C0966R.string.aod);
                    gVar2.mo107534s(C0966R.string.aoc, new C79321c(this, gVar2));
                    gVar2.mo107542x(getString(C0966R.string.aoe), true, new C119098d(this));
                    gVar2.f225689M = new C119099e(this);
                    gVar2.show();
                } else {
                    Log.m105924i("MicroMsg.AppBrandAuthorizeDetailUI", "audioTemplateUrl is null, do not show audio sample dialog");
                }
            }
        } else if (preference.f121285r.equalsIgnoreCase("preference_key_accept_allow_force_notify")) {
            SelectPreference selectPreference2 = this.f344111j;
            selectPreference2.f24291M = true;
            this.f344108g.f24291M = false;
            this.f344109h.f24291M = false;
            this.f344113o = selectPreference2;
        } else if (preference.f121285r.equalsIgnoreCase("preference_key_accept")) {
            this.f344108g.f24291M = false;
            SelectPreference selectPreference3 = this.f344109h;
            selectPreference3.f24291M = true;
            SelectPreference selectPreference4 = this.f344110i;
            if (selectPreference4 != null) {
                selectPreference4.f24291M = false;
            }
            SelectPreference selectPreference5 = this.f344111j;
            if (selectPreference5 != null) {
                selectPreference5.f24291M = false;
            }
            this.f344113o = selectPreference3;
        } else if (preference.f121285r.equalsIgnoreCase("preference_key_no_accept")) {
            SelectPreference selectPreference6 = this.f344108g;
            selectPreference6.f24291M = true;
            this.f344109h.f24291M = false;
            SelectPreference selectPreference7 = this.f344110i;
            if (selectPreference7 != null) {
                selectPreference7.f24291M = false;
            }
            SelectPreference selectPreference8 = this.f344111j;
            if (selectPreference8 != null) {
                selectPreference8.f24291M = false;
            }
            this.f344113o = selectPreference6;
        }
        this.f344105d.notifyDataSetChanged();
        return false;
    }

    public void onStop() {
        super.onStop();
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new PlayVoiceData(this.f344114p.get(), "", 1), C80017c.class, C113319b.f339074d);
        this.f344114p.set(0);
    }
}
