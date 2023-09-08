package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.remittance.model.C42840f;
import com.tencent.p014mm.plugin.remittance.model.C42841g;
import com.tencent.p014mm.plugin.remittance.model.C57179r0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import cr3.C75296i;
import di3.C86312j;
import f40.C86709a0;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import q43.C77302a;
import te3.C49039cr;
import te3.C49885ir;
import te3.C50298lr;
import te3.cz4;
import te3.dz4;
import te3.ez4;
import ub3.C78144b;
import v53.C78348k0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceUI */
public class RemittanceUI extends RemittanceNewBaseUI {

    /* renamed from: M1 */
    public static final /* synthetic */ int f205196M1 = 0;

    /* renamed from: L1 */
    public String f205197L1;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceUI$b */
    public class C42866b implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C42840f f116079a;

        public C42866b(C42840f fVar) {
            this.f116079a = fVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            ez4 ez4;
            C49039cr crVar = this.f116079a.f116018r;
            Log.m105919d("MicroMsg.RemittanceUI", "mask_name: %s truename_extend %s", crVar.f131913f, crVar.f131914g);
            RemittanceUI remittanceUI = RemittanceUI.this;
            C42840f fVar = this.f116079a;
            C49039cr crVar2 = fVar.f116018r;
            remittanceUI.f204952L = crVar2.f131913f;
            remittanceUI.f205197L1 = crVar2.f131914g;
            remittanceUI.f204970X = crVar2.f131916i;
            remittanceUI.f204958R = crVar2.f131917j;
            remittanceUI.getClass();
            dz4 dz4 = fVar.f116018r.f131918n;
            if (dz4 == null || dz4.f132590d != 1 || (ez4 = dz4.f132591e) == null || Util.isNullOrNil(ez4.f133210d)) {
                Log.m105924i("MicroMsg.RemittanceNewBaseUI", "  do not show WarningView");
                remittanceUI.f204986g1.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) remittanceUI.f204935C.getLayoutParams();
                layoutParams.topMargin = C76577a.m92151b(remittanceUI.getContext(), 0);
                remittanceUI.f204935C.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) remittanceUI.f204994l1.getLayoutParams();
                layoutParams2.topMargin = C76577a.m92151b(remittanceUI.getContext(), 32);
                remittanceUI.f204994l1.setLayoutParams(layoutParams2);
            } else {
                dz4 dz42 = fVar.f116018r.f131918n;
                ez4 ez42 = dz42.f132591e;
                remittanceUI.f204986g1.setVisibility(0);
                Log.m105925i("MicroMsg.RemittanceNewBaseUI", "warning textInfo.wording:%s", ez42.f133210d);
                remittanceUI.f204990i1.setText(ez42.f133210d);
                if (!C85875k4.m106211z() || Util.isNullOrNil(dz42.f132593g)) {
                    remittanceUI.f204990i1.setTextColor(C75228t.m90235a0(dz42.f132592f));
                } else {
                    remittanceUI.f204990i1.setTextColor(C75228t.m90235a0(dz42.f132593g));
                }
                int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(remittanceUI, 20.0f);
                int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(remittanceUI, 8.0f);
                int fromDPToPix3 = BackwardSupportUtil.BitmapFactory.fromDPToPix(remittanceUI, 16.0f);
                if (!C85875k4.m106211z() || Util.isNullOrNil(dz42.f132595i)) {
                    remittanceUI.f204992j1.mo100288c(dz42.f132594h, fromDPToPix, fromDPToPix, -1);
                } else {
                    remittanceUI.f204992j1.mo100288c(dz42.f132595i, fromDPToPix, fromDPToPix, -1);
                }
                if (!C85875k4.m106211z() || Util.isNullOrNil(dz42.f132597n)) {
                    remittanceUI.f204993k1.mo100288c(dz42.f132596j, fromDPToPix2, fromDPToPix3, -1);
                } else {
                    remittanceUI.f204993k1.mo100288c(dz42.f132597n, fromDPToPix2, fromDPToPix3, -1);
                }
                remittanceUI.f204986g1.postDelayed(new Runnable() {
                    public void run() {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) RemittanceNewBaseUI.this.f204988h1.getLayoutParams();
                        layoutParams.width = RemittanceNewBaseUI.this.f204993k1.getRight() + C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 8);
                        layoutParams.height = C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 36);
                        RemittanceNewBaseUI.this.f204988h1.setLayoutParams(layoutParams);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) RemittanceNewBaseUI.this.f204935C.getLayoutParams();
                        layoutParams2.topMargin = C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 16);
                        RemittanceNewBaseUI.this.f204935C.setLayoutParams(layoutParams2);
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) RemittanceNewBaseUI.this.f204994l1.getLayoutParams();
                        layoutParams3.topMargin = C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 0);
                        RemittanceNewBaseUI.this.f204994l1.setLayoutParams(layoutParams3);
                        RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                        remittanceNewBaseUI.f204990i1.setMaxWidth((((remittanceNewBaseUI.f204986g1.getWidth() - C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 20)) - C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 8)) - C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 12)) - C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 16));
                    }
                }, 10);
                remittanceUI.f204988h1.setClickable(true);
                remittanceUI.f204988h1.setOnClickListener(new C7089c0(ez42) {

                    /* renamed from: g */
                    public final /* synthetic */ ez4 f116073g;

                    {
                        this.f116073g = r2;
                    }

                    /* renamed from: a */
                    public void mo2066a(View view) {
                        ez4 ez4 = this.f116073g;
                        Log.m105925i("MicroMsg.RemittanceNewBaseUI", " click option item : %s ,type:%s", ez4.f133210d, Integer.valueOf(ez4.f133211e.f132043d));
                        cz4 cz4 = this.f116073g.f133211e;
                        int i = cz4.f132043d;
                        if (i == 1) {
                            Log.m105925i("MicroMsg.RemittanceNewBaseUI", " textInfo.jumpInfo.url ：%s", cz4.f132044e);
                            C75228t.m90219L(RemittanceNewBaseUI.this.getContext(), this.f116073g.f133211e.f132044e, false);
                        } else if (i == 2) {
                            Log.m105925i("MicroMsg.RemittanceNewBaseUI", " textInfo.jumpInfo.username ：%s", cz4.f132045f);
                            cz4 cz42 = this.f116073g.f133211e;
                            C75228t.m90224Q(cz42.f132045f, cz42.f132046g, 0, 1000);
                        } else if (i != 3) {
                            Log.m105920e("MicroMsg.RemittanceNewBaseUI", "unknow text info type");
                        } else {
                            Log.m105920e("MicroMsg.RemittanceNewBaseUI", " text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
                        }
                    }
                });
            }
            RemittanceUI.this.mo97437T7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceUI$c */
    public class C42867c implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C42841g f116081a;

        public C42867c(C42841g gVar) {
            this.f116081a = gVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105919d("MicroMsg.RemittanceUI", "before union  transfer: %s, %s, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            C49885ir irVar = this.f116081a.f116019r;
            if (irVar == null || Util.isNullOrNil(irVar.f135601i)) {
                RemittanceUI remittanceUI = RemittanceUI.this;
                remittanceUI.f204978c1 = remittanceUI.getString(C0966R.string.n5w);
            } else {
                RemittanceUI.this.f204978c1 = this.f116081a.f116019r.f135601i;
            }
            RemittanceUI.this.mo97437T7();
            C49885ir irVar2 = this.f116081a.f116019r;
            if (irVar2 != null && irVar2.f135596d == 268492929) {
                RemittanceUI remittanceUI2 = RemittanceUI.this;
                remittanceUI2.mo97443Z7(remittanceUI2, irVar2.f135597e, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceUI$d */
    public class C42868d implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C42841g f116083a;

        public C42868d(C42841g gVar) {
            this.f116083a = gVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Class cls = C78144b.class;
            Log.m105919d("MicroMsg.RemittanceUI", "union before receiver_merchant_desc", this.f116083a.f116019r.f135601i);
            ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_WALLET_UNION_TRANSFER_TITLE_STRING_SYNC, this.f116083a.f116019r.f135604o);
            ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_WALLET_UNION_TRANSFER_SUBTITLE_STRING_SYNC, this.f116083a.f116019r.f135602j);
            ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_WALLET_UNION_TRANSFER_MERCHANT_STRING_SYNC, this.f116083a.f116019r.f135605p);
            C49885ir irVar = this.f116083a.f116019r;
            if (irVar == null || Util.isNullOrNil(irVar.f135601i)) {
                RemittanceUI remittanceUI = RemittanceUI.this;
                remittanceUI.f204978c1 = remittanceUI.getString(C0966R.string.n5w);
            } else {
                RemittanceUI.this.f204978c1 = this.f116083a.f116019r.f135601i;
            }
            if (!Util.isNullOrNil(this.f116083a.f116019r.f135603n)) {
                RemittanceUI.this.f204977b1 = this.f116083a.f116019r.f135603n;
            }
            C42841g gVar = this.f116083a;
            C49885ir irVar2 = gVar.f116019r;
            String str2 = irVar2.f135598f;
            if (str2 != null) {
                RemittanceUI.this.f204970X = str2;
            }
            RemittanceUI remittanceUI2 = RemittanceUI.this;
            remittanceUI2.f204958R = irVar2.f135599g;
            remittanceUI2.getClass();
            C50298lr lrVar = gVar.f116019r.f135600h;
            if (lrVar == null || lrVar.f137601d != 1 || lrVar.f137602e == null) {
                Log.m105924i("MicroMsg.RemittanceNewBaseUI", "  do not show WarningView");
                remittanceUI2.f204986g1.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) remittanceUI2.f204935C.getLayoutParams();
                layoutParams.topMargin = C76577a.m92151b(remittanceUI2.getContext(), 0);
                remittanceUI2.f204935C.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) remittanceUI2.f204994l1.getLayoutParams();
                layoutParams2.topMargin = C76577a.m92151b(remittanceUI2.getContext(), 32);
                remittanceUI2.f204994l1.setLayoutParams(layoutParams2);
            } else {
                remittanceUI2.f204986g1.setVisibility(0);
                Log.m105925i("MicroMsg.RemittanceNewBaseUI", "warning textInfo.wording:%s", lrVar.f137602e);
                remittanceUI2.f204990i1.setText(lrVar.f137602e);
                int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(remittanceUI2, 20.0f);
                remittanceUI2.f204992j1.mo100288c(lrVar.f137603f, fromDPToPix, fromDPToPix, -1);
                remittanceUI2.f204986g1.postDelayed(new Runnable() {
                    public void run() {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) RemittanceNewBaseUI.this.f204988h1.getLayoutParams();
                        layoutParams.width = RemittanceNewBaseUI.this.f204993k1.getRight() + C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 8);
                        layoutParams.height = C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 36);
                        RemittanceNewBaseUI.this.f204988h1.setLayoutParams(layoutParams);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) RemittanceNewBaseUI.this.f204935C.getLayoutParams();
                        layoutParams2.topMargin = C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 16);
                        RemittanceNewBaseUI.this.f204935C.setLayoutParams(layoutParams2);
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) RemittanceNewBaseUI.this.f204994l1.getLayoutParams();
                        layoutParams3.topMargin = C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 0);
                        RemittanceNewBaseUI.this.f204994l1.setLayoutParams(layoutParams3);
                        RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                        remittanceNewBaseUI.f204990i1.setMaxWidth((((remittanceNewBaseUI.f204986g1.getWidth() - C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 20)) - C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 8)) - C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 12)) - C76577a.m92151b(RemittanceNewBaseUI.this.getContext(), 16));
                    }
                }, 10);
                remittanceUI2.f204988h1.setClickable(true);
                remittanceUI2.f204988h1.setOnClickListener(new C7089c0(lrVar) {

                    /* renamed from: g */
                    public final /* synthetic */ C50298lr f116076g;

                    {
                        this.f116076g = r2;
                    }

                    /* renamed from: a */
                    public void mo2066a(View view) {
                        C50298lr lrVar = this.f116076g;
                        Log.m105925i("MicroMsg.RemittanceNewBaseUI", " click option item:%s, url:%s", lrVar.f137602e, lrVar.f137604g);
                        C75228t.m90219L(RemittanceNewBaseUI.this.getContext(), this.f116076g.f137604g, false);
                    }
                });
            }
            RemittanceUI.this.mo97437T7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceUI$a */
    public class C70846a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WalletGetBulletinEvent f205198d;

        public C70846a(WalletGetBulletinEvent walletGetBulletinEvent) {
            this.f205198d = walletGetBulletinEvent;
        }

        public void run() {
            if (!Util.isNullOrNil(this.f205198d.f79043e.f79046a)) {
                WalletGetBulletinEvent.C28848b bVar = this.f205198d.f79043e;
                C75228t.m90247g0((View) null, (TextView) RemittanceUI.this.findViewById(C0966R.C0970id.a7l), bVar.f79046a, bVar.f79047b, bVar.f79048c);
                return;
            }
            Log.m105924i("MicroMsg.RemittanceUI", "no bulletin data");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceUI$e */
    public class C70847e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f205200d;

        public C70847e(boolean z) {
            this.f205200d = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (this.f205200d) {
                RemittanceUI.this.finish();
            }
        }
    }

    /* renamed from: L7 */
    public void mo97429L7() {
        int i = this.f204989i;
        if (i == 0 || i == 2) {
            mo97514n8();
            if (Util.isNullOrNil(this.f204953M) || Util.isNullOrNil(this.f204954N)) {
                C78348k0.m94629j1(true, (C75296i) null, new C70942r1(this));
            } else {
                C78348k0.m94629j1(false, (C75296i) null, new C70946s1(this));
            }
            Log.m105918d("MicroMsg.RemittanceUI", "do before transfer");
            doSceneProgress(new C42840f(this.f204985g, this.f204968W), false);
        }
    }

    /* renamed from: M7 */
    public void mo97430M7(String str, int i, String str2, String str3, String str4, String str5, String str6, F2fDynamicStartPayEvent f2fDynamicStartPayEvent) {
        mo97431N7(str, i, str2, str3, str4, str5, str6, f2fDynamicStartPayEvent, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013d  */
    /* renamed from: N7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97431N7(java.lang.String r38, int r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent r45, java.lang.String r46) {
        /*
            r37 = this;
            r0 = r37
            q43.a r1 = r0.f204979d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001f
            r4 = 3
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r6 = r0.f204991j
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r3] = r6
            double r6 = r0.f204981e
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r5[r2] = r6
            r1.mo107447b(r4, r5)
        L_0x001f:
            android.content.Intent r1 = r37.getIntent()
            r4 = -1
            java.lang.String r5 = "pay_channel"
            int r21 = r1.getIntExtra(r5, r4)
            java.lang.String[] r1 = new java.lang.String[r3]
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r1)
            java.lang.String r4 = "MicroMsg.RemittanceUI"
            java.lang.String r5 = ""
            if (r1 != 0) goto L_0x006e
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r6 = r0.f204985g
            com.tencent.mm.storage.z1 r1 = r1.mo69664N2(r6)
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = r1.mo62898f()
            r25 = r1
            goto L_0x0070
        L_0x0055:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "can not found contact for user::"
            r1.append(r6)
            java.lang.String r6 = r0.f204985g
            r1.append(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
        L_0x006e:
            r25 = r5
        L_0x0070:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r44)
            if (r1 == 0) goto L_0x0079
            r0.f205018x0 = r2
            goto L_0x007b
        L_0x0079:
            r0.f205018x0 = r3
        L_0x007b:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)
            r1[r3] = r6
            java.lang.String r6 = "doSceneGenRemittance, channel: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r1)
            int r1 = r0.f204940E1
            r4 = 4
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r1, (int) r4)
            if (r1 == 0) goto L_0x00bd
            double r6 = r0.f204942F1
            java.lang.Double r1 = java.lang.Double.valueOf(r6)
            double r6 = r0.f204981e
            java.lang.Double r4 = java.lang.Double.valueOf(r6)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.Object) r1, (java.lang.Object) r4)
            java.lang.String r4 = r0.f204944G1
            r14 = r38
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r14)
            java.lang.String r6 = r0.f204946H1
            r15 = r42
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r15)
            r1 = r1 ^ r2
            if (r4 != 0) goto L_0x00b6
            r1 = r1 | 2
        L_0x00b6:
            if (r6 != 0) goto L_0x00ba
            r1 = r1 | 4
        L_0x00ba:
            r34 = r1
            goto L_0x00c3
        L_0x00bd:
            r14 = r38
            r15 = r42
            r34 = 0
        L_0x00c3:
            android.content.Context r1 = r37.mo97434Q7()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.remittance.p098ui.RemittanceLargeMoneyUI
            if (r1 == 0) goto L_0x00cd
            r0.f204966V = r5
        L_0x00cd:
            com.tencent.mm.plugin.remittance.model.h0 r1 = new com.tencent.mm.plugin.remittance.model.h0
            r6 = r1
            double r7 = r0.f204981e
            java.lang.String r10 = r0.f204985g
            java.lang.String r4 = r0.f204952L
            r11 = r4
            r26 = r4
            int r12 = r0.f204991j
            int r13 = r0.f204989i
            java.lang.String r4 = r0.f204998o
            r20 = r4
            java.lang.String r4 = r0.f204962T
            r22 = r4
            java.lang.String r4 = r0.f204983f
            r24 = r4
            java.lang.String r4 = r0.f204966V
            r28 = r4
            java.lang.String r4 = r0.f204964U
            r29 = r4
            java.lang.String r4 = r0.f205197L1
            r30 = r4
            java.lang.String r4 = r0.f204970X
            r31 = r4
            int r4 = r0.f204940E1
            r32 = r4
            java.lang.String r4 = r0.f204948I1
            r33 = r4
            java.lang.String r4 = r0.f204968W
            r35 = r4
            java.lang.String r9 = "1"
            r14 = r38
            r15 = r39
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r43
            r23 = r44
            r27 = r45
            r36 = r46
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            java.lang.String r4 = "RemittanceProcess"
            r1.setProcessName(r4)
            boolean r4 = r0.mKindaEnable
            if (r4 == 0) goto L_0x013d
            android.content.Context r2 = r37.mo97434Q7()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.remittance.p098ui.RemittanceLargeMoneyUI
            if (r2 == 0) goto L_0x0136
            com.tencent.p014mm.plugin.remittance.p098ui.C70905k0.m83420b()
            com.tencent.mm.plugin.remittance.ui.k0 r2 = com.tencent.p014mm.plugin.remittance.p098ui.C70905k0.C70906a.f205332a
            r2.mo97576d()
            goto L_0x0139
        L_0x0136:
            r37.showLoading()
        L_0x0139:
            r0.doSceneProgress(r1, r3)
            goto L_0x014a
        L_0x013d:
            com.tencent.p014mm.plugin.remittance.p098ui.C70905k0.m83420b()
            com.tencent.mm.plugin.remittance.ui.k0 r3 = com.tencent.p014mm.plugin.remittance.p098ui.C70905k0.C70906a.f205332a
            boolean r3 = r3.mo97576d()
            r2 = r2 ^ r3
            r0.doSceneProgress(r1, r2)
        L_0x014a:
            r0.f204966V = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceUI.mo97431N7(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.autogen.events.F2fDynamicStartPayEvent, java.lang.String):void");
    }

    /* renamed from: O7 */
    public void mo97432O7() {
        int i = this.f204989i;
        if (i == 0 || i == 2) {
            Log.m105918d("MicroMsg.RemittanceUI", "do before union transfer");
            doSceneProgress(new C42841g(this.f204985g, this.f204968W), false);
        }
    }

    /* renamed from: P7 */
    public void mo97433P7(String str, String str2) {
        Log.m105925i("MicroMsg.RemittanceUI", "doUnionTransferPlaceOrder, userName:%s groupName:%s", this.f204985g, this.f204968W);
        C77302a aVar = this.f204979d;
        if (aVar != null) {
            aVar.mo107447b(3, Integer.valueOf(this.f204991j), Double.valueOf(this.f204981e));
        }
        C57179r0 r0Var = new C57179r0(this.f204985g, this.f204968W, this.f204981e, this.f204970X, str, str2);
        if (this.mKindaEnable) {
            showLoading();
            doSceneProgress(r0Var, false);
        } else {
            doSceneProgress(r0Var);
        }
        this.f204966V = "";
    }

    /* renamed from: Z7 */
    public void mo97443Z7(MMActivity mMActivity, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = mMActivity.getString(C0966R.string.l_3);
        }
        C76879j.m92713G(mMActivity, str, (String) null, false, new C70847e(z));
    }

    /* renamed from: a8 */
    public void mo97444a8() {
        C76912y0.makeText((Context) getContext(), (int) C0966R.string.hzn, 0).show();
    }

    public boolean convertActivityFromTranslucent() {
        return false;
    }

    /* renamed from: i8 */
    public void mo97451i8() {
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = "7";
        walletGetBulletinEvent.callback = new C70846a(walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
    }

    /* renamed from: n8 */
    public final void mo97514n8() {
        C86709a0.m107528h();
        this.f204953M = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_CONFIRM_WORDING_STRING, "");
        C86709a0.m107528h();
        this.f204954N = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_DESC_URL_STRING, "");
        C86709a0.m107528h();
        this.f204955P = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_DESC_URL_FLAG_INT, 0)).intValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C115669n.INSTANCE.mo160131h(15386, 1, 1);
        addSceneEndListener(2783);
        addSceneEndListener(4465);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2783);
        removeSceneEndListener(4465);
        hideLoading();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C42840f) {
            C42840f fVar = (C42840f) yVar;
            fVar.mo104823q1(new C42866b(fVar));
            if (fVar.f221040j) {
                int i3 = fVar.f221034d;
                int i4 = fVar.f221035e;
                Log.m105919d("MicroMsg.RemittanceUI", "before transfer: %s, %s, %s", Integer.valueOf(i3), Integer.valueOf(i4), fVar.f221037g);
            }
            if (fVar.f221039i) {
                Log.m105921e("MicroMsg.RemittanceUI", "net error: %s", fVar);
            }
            return true;
        } else if (!(yVar instanceof C42841g)) {
            return super.onSceneEnd(i, i2, str, yVar);
        } else {
            hideLoading();
            C42841g gVar = (C42841g) yVar;
            gVar.mo104823q1(new C42868d(gVar));
            gVar.mo104820l1(new C42867c(gVar));
            if (gVar.f221039i) {
                Log.m105921e("MicroMsg.RemittanceUI", "union net error: %s", gVar);
                C49885ir irVar = gVar.f116019r;
                if (irVar == null || Util.isNullOrNil(irVar.f135601i)) {
                    this.f204978c1 = getString(C0966R.string.n5w);
                } else {
                    this.f204978c1 = gVar.f116019r.f135601i;
                }
                mo97437T7();
            }
            return true;
        }
    }

    public boolean shouldEnsureSoterConnection() {
        return true;
    }
}
