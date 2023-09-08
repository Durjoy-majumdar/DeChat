package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94879h0;
import com.tencent.p014mm.plugin.sns.model.C94974y1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WCWebUpdater;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76912y0;
import os2.C100422y;
import os2.C100423z;
import p910lj.C76701a;
import qo3.C47883u;
import qo3.C77426q;
import tc0.C77885p;
import te3.C101816mt2;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI */
public class SnsSettingUI extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f82073g = 0;

    /* renamed from: d */
    public String f82074d = "MicroMsg.SnsSettingUI";

    /* renamed from: e */
    public LinkedList f82075e = new LinkedList();

    /* renamed from: f */
    public C30460s f82076f = new C30460s();

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$a */
    public class C30432a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$a$a */
        public class C30433a implements C47883u {

            /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$a$a$a */
            public class C30434a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ int f82079d;

                /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$a$a$a$a */
                public class C30435a implements Runnable {
                    public C30435a() {
                    }

                    public void run() {
                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$10$1$1$1");
                        C76701a.makeText((Context) SnsSettingUI.this.getContext(), (CharSequence) "原db为空，去朋友圈页面拉一下feed再继续！", 1).show();
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$10$1$1$1");
                    }
                }

                /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$a$a$a$b */
                public class C30436b implements Runnable {

                    /* renamed from: d */
                    public final /* synthetic */ long f82082d;

                    /* renamed from: e */
                    public final /* synthetic */ long f82083e;

                    public C30436b(long j, long j2) {
                        this.f82082d = j;
                        this.f82083e = j2;
                    }

                    public void run() {
                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$10$1$1$2");
                        Log.m105925i(SnsSettingUI.m39086H7(SnsSettingUI.this), "cleanSnsTablesByTimeLimit finish add snsinfoStg, origin:%s, new:%s", Long.valueOf(this.f82082d), Long.valueOf(this.f82083e));
                        C76701a.makeText((Context) SnsSettingUI.this.getContext(), (CharSequence) String.format("insert snsinfo, origin:%s, new:%s", new Object[]{Long.valueOf(this.f82082d), Long.valueOf(this.f82083e)}), 1).show();
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$10$1$1$2");
                    }
                }

                public C30434a(int i) {
                    this.f82079d = i;
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$10$1$1");
                    try {
                        SnsInfo mL = C94866e1.Yx0().mo139826mL(MultiProcessMMKV.getMMKV("CleanExpireFileSystem").getLong("CleanExpireCurrentExpireTime", 0) / 1000);
                        if (mL == null) {
                            C94866e1.ly0().post(new C30435a());
                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$10$1$1");
                            return;
                        }
                        long h302 = C94866e1.Yx0().h30();
                        for (int i = 0; i < this.f82079d; i++) {
                            mL.field_snsId++;
                            mL.field_createTime -= new Random().nextInt();
                            C94866e1.Yx0().insertNotify(mL, false);
                        }
                        C94866e1.ly0().post(new C30436b(h302, C94866e1.Yx0().h30()));
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$10$1$1");
                    } catch (Exception e) {
                        Log.m105921e(SnsSettingUI.m39086H7(SnsSettingUI.this), "test insert db error. %s", e);
                    }
                }
            }

            public C30433a() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$10$1");
                SnsSettingUI.this.hideVKB();
                if (z) {
                    int i = -1;
                    try {
                        i = Util.getInt(str, -1);
                    } catch (Exception unused) {
                    }
                    C94866e1.my0().post(new C30434a(i));
                }
                SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$10$1");
            }
        }

        public C30432a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$10");
            C77426q qVar = new C77426q(SnsSettingUI.this.getContext());
            qVar.mo107606r("要插入多少条");
            qVar.mo107594f(Boolean.TRUE);
            qVar.mo107590b(new C30433a());
            qVar.mo107603o();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$10");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$b */
    public class C30437b implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$b$a */
        public class C30438a implements C47883u {
            public C30438a() {
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|4|5|6) */
            /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
                r14 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.m39086H7(r13.f82086a.f82085d), "cleanSnsTablesByTimeLimit error. %s", r14);
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0016 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo353a(boolean r14, java.lang.String r15) {
                /*
                    r13 = this;
                    java.lang.String r0 = "onDialogClick"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSettingUI$11$1"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    com.tencent.mm.plugin.sns.ui.SnsSettingUI$b r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.C30437b.this
                    com.tencent.mm.plugin.sns.ui.SnsSettingUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.this
                    r2.hideVKB()
                    if (r14 == 0) goto L_0x003f
                    r14 = -1
                    int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r14)     // Catch:{ Exception -> 0x0016 }
                L_0x0016:
                    com.tencent.p014mm.plugin.sns.model.C94866e1.Sx0()     // Catch:{ Exception -> 0x002b }
                    android.os.CancellationSignal r2 = new android.os.CancellationSignal     // Catch:{ Exception -> 0x002b }
                    r2.<init>()     // Catch:{ Exception -> 0x002b }
                    long r3 = (long) r14     // Catch:{ Exception -> 0x002b }
                    r5 = 0
                    r7 = 0
                    r9 = 0
                    r11 = 0
                    mr2.C99960a.m130597b(r2, r3, r5, r7, r9, r11)     // Catch:{ Exception -> 0x002b }
                    goto L_0x003f
                L_0x002b:
                    r14 = move-exception
                    com.tencent.mm.plugin.sns.ui.SnsSettingUI$b r15 = com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.C30437b.this
                    com.tencent.mm.plugin.sns.ui.SnsSettingUI r15 = com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.this
                    java.lang.String r15 = com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.m39086H7(r15)
                    r2 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    r2[r3] = r14
                    java.lang.String r14 = "cleanSnsTablesByTimeLimit error. %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r14, r2)
                L_0x003f:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.C30437b.C30438a.mo353a(boolean, java.lang.String):void");
            }
        }

        public C30437b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$11");
            C77426q qVar = new C77426q(SnsSettingUI.this.getContext());
            qVar.mo107606r("清理多少（分钟）以前的朋友圈");
            qVar.mo107594f(Boolean.TRUE);
            qVar.mo107590b(new C30438a());
            qVar.mo107603o();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$11");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$c */
    public class C30439c implements View.OnClickListener {
        public C30439c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$12");
            C77426q qVar = new C77426q(SnsSettingUI.this.getContext());
            qVar.mo107606r("（单位:秒）");
            qVar.mo107594f(Boolean.TRUE);
            qVar.mo107590b(new SnsSettingUI$c$$a(this));
            qVar.mo107603o();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$12");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$d */
    public class C30440d implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$d$a */
        public class C30441a implements C47883u {
            public C30441a() {
            }

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0016 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo353a(boolean r5, java.lang.String r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "onDialogClick"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSettingUI$13$1"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    com.tencent.mm.plugin.sns.ui.SnsSettingUI$d r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.C30440d.this
                    com.tencent.mm.plugin.sns.ui.SnsSettingUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.this
                    r2.hideVKB()
                    if (r5 == 0) goto L_0x0037
                    r5 = -1
                    int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r5)     // Catch:{ Exception -> 0x0016 }
                L_0x0016:
                    com.tencent.p014mm.plugin.sns.model.C94866e1.Sx0()     // Catch:{ Exception -> 0x0023 }
                    android.os.CancellationSignal r6 = new android.os.CancellationSignal     // Catch:{ Exception -> 0x0023 }
                    r6.<init>()     // Catch:{ Exception -> 0x0023 }
                    long r2 = (long) r5     // Catch:{ Exception -> 0x0023 }
                    mr2.C99960a.m130598c(r6, r2)     // Catch:{ Exception -> 0x0023 }
                    goto L_0x0037
                L_0x0023:
                    r5 = move-exception
                    com.tencent.mm.plugin.sns.ui.SnsSettingUI$d r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.C30440d.this
                    com.tencent.mm.plugin.sns.ui.SnsSettingUI r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.this
                    java.lang.String r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.m39086H7(r6)
                    r2 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    r2[r3] = r5
                    java.lang.String r5 = "cleanSnsTablesByTimeLimit error. %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r5, r2)
                L_0x0037:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI.C30440d.C30441a.mo353a(boolean, java.lang.String):void");
            }
        }

        public C30440d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$13");
            C77426q qVar = new C77426q(SnsSettingUI.this.getContext());
            qVar.mo107606r("清理多少（分钟）以前的朋友圈");
            qVar.mo107594f(Boolean.TRUE);
            qVar.mo107590b(new C30441a());
            qVar.mo107603o();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$13");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$e */
    public class C30442e implements View.OnClickListener {
        public C30442e(SnsSettingUI snsSettingUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$14");
            C94866e1.Sx0().mo139304a();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$14");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$f */
    public class C30443f implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$f$a */
        public class C30444a implements C47883u {
            public C30444a() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$15$1");
                SnsSettingUI.this.hideVKB();
                if (z) {
                    C101816mt2 mt22 = new C101816mt2();
                    mt22.f298873d = str;
                    mt22.f298874e = 0;
                    ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(230, mt22));
                }
                SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$15$1");
            }
        }

        public C30443f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$15");
            C77426q qVar = new C77426q(SnsSettingUI.this.getContext());
            qVar.mo107606r("微信号username");
            qVar.mo107594f(Boolean.TRUE);
            qVar.mo107590b(new C30444a());
            qVar.mo107603o();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$15");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$g */
    public class C30445g implements View.OnClickListener {
        public C30445g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$16");
            Log.m105924i(SnsSettingUI.m39086H7(SnsSettingUI.this), "reset STOP_MSG_NOTIFY count ");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_REMAINDER_SHOW_COUNT_INT, 3);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_USED_AFTER_BOOLEAN, Boolean.FALSE);
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "Done!", 0).show();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$16");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$h */
    public class C30446h implements View.OnClickListener {
        public C30446h(SnsSettingUI snsSettingUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$17");
            C94866e1.Bx0().mo124433c((String) null);
            SnsMethodCalculate.markStartTimeMs("simulationDBDamage", "com.tencent.mm.plugin.sns.model.SnsCore");
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
                C94866e1.Ax0().f274892U = true;
            }
            SnsMethodCalculate.markEndTimeMs("simulationDBDamage", "com.tencent.mm.plugin.sns.model.SnsCore");
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "模拟db损坏Done!", 0).show();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$17");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$i */
    public class C30447i implements MenuItem.OnMenuItemClickListener {
        public C30447i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$18");
            SnsSettingUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$18");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$j */
    public class C30448j implements View.OnClickListener {
        public C30448j(SnsSettingUI snsSettingUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$1");
            C94974y1 fy02 = C94866e1.fy0();
            fy02.getClass();
            SnsMethodCalculate.markStartTimeMs("removeAll", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            try {
                C86013q1.m106447h(fy02.f275346a);
            } catch (Exception e) {
                Log.m105929w("MicroMsg.SnsUnreadTipManager", "removeLastFault error:%s", e.getMessage());
            }
            SnsMethodCalculate.markEndTimeMs("removeAll", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "好了", 1).show();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$k */
    public class C30449k implements View.OnClickListener {
        public C30449k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$2");
            C95713a5.f279145k = 1;
            C76879j.m92748s(SnsSettingUI.this, "已调整到套图下载，即刻生效！", "");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$l */
    public class C30450l implements View.OnClickListener {
        public C30450l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$3");
            C95713a5.f279145k = 2;
            C76879j.m92748s(SnsSettingUI.this, "已调整到单图下载，即刻生效！", "");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$m */
    public class C30451m implements View.OnClickListener {
        public C30451m() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$4");
            int i = C95713a5.f279145k;
            if (i == 1) {
                C76879j.m92748s(SnsSettingUI.this, "套图下载", "");
            } else if (i == 2) {
                C76879j.m92748s(SnsSettingUI.this, "单图下载", "");
            } else if (C95713a5.m122518a()) {
                C76879j.m92748s(SnsSettingUI.this, "套图下载", "");
            } else {
                C76879j.m92748s(SnsSettingUI.this, "单图下载", "");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$4");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$n */
    public class C30452n implements View.OnClickListener {
        public C30452n() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$5");
            if (C86709a0.m107522a()) {
                C86709a0.m107529k().f251779b.mo123460f(new C94879h0());
            }
            C76879j.m92748s(SnsSettingUI.this, "妥了", "");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$o */
    public class C30453o implements View.OnClickListener {
        public C30453o() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$6");
            C86709a0.m107528h();
            C100422y Yt = C94866e1.Ux0().mo139909Yt((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null));
            Yt.field_type = 0;
            C94866e1.Ux0().mo139910bD(Yt, true);
            C76879j.m92748s(SnsSettingUI.this, "妥了", "");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$6");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$p */
    public class C30454p implements View.OnClickListener {
        public C30454p() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$7");
            C86709a0.m107528h();
            C100422y Yt = C94866e1.Ux0().mo139909Yt((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null));
            Yt.field_type = 5;
            C94866e1.Ux0().mo139910bD(Yt, true);
            C76879j.m92748s(SnsSettingUI.this, "妥了", "");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$7");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$q */
    public class C30455q implements View.OnClickListener {
        public C30455q() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$8");
            C100423z Ux0 = C94866e1.Ux0();
            C86709a0.m107528h();
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
            Ux0.getClass();
            SnsMethodCalculate.markStartTimeMs("removeSnsCover", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            C87412m.m108594g(str, "userName");
            Log.m105924i("MicroMsg.SnsCoverStorage", "removeSnsCover " + str);
            Ux0.delete(Ux0.mo139909Yt(str), new String[0]);
            Ux0.f294199e.clear();
            SnsMethodCalculate.markEndTimeMs("removeSnsCover", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            C76879j.m92748s(SnsSettingUI.this, "妥了", "");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$8");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$r */
    public class C30456r implements View.OnClickListener {
        public C30456r() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$9");
            MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVUploadUrl", "");
            C76879j.m92748s(SnsSettingUI.this, "妥了", "");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$9");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$t */
    public class C30457t implements C30462v {

        /* renamed from: a */
        public String f82102a;

        /* renamed from: b */
        public List<String> f82103b;

        /* renamed from: c */
        public C72994y1.C72995a f82104c;

        /* renamed from: d */
        public Object f82105d;

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$t$a */
        public class C30458a implements C76879j.C76888o {
            public C30458a() {
            }

            /* renamed from: a */
            public void mo5759a(int i, int i2) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem$1");
                try {
                    Object obj = C30457t.this.f82105d;
                    if (obj instanceof int[]) {
                        int i3 = ((int[]) obj)[i];
                        if (C86709a0.m107522a()) {
                            C86709a0.m107535s().mo121142i().mo119677K(C30457t.this.f82104c, Integer.valueOf(i3));
                        }
                    } else if (obj instanceof long[]) {
                        long j = ((long[]) obj)[i];
                        if (C86709a0.m107522a()) {
                            C86709a0.m107535s().mo121142i().mo119677K(C30457t.this.f82104c, Long.valueOf(j));
                        }
                    }
                    SnsSettingUI snsSettingUI = SnsSettingUI.this;
                    int i4 = SnsSettingUI.f82073g;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
                    C30460s sVar = snsSettingUI.f82076f;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
                    sVar.notifyDataSetChanged();
                } catch (Exception e) {
                    Log.printErrStackTrace(SnsSettingUI.m39086H7(SnsSettingUI.this), e, "", new Object[0]);
                }
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem$1");
            }
        }

        public C30457t(String str, C72994y1.C72995a aVar, List<String> list, Object obj) {
            this.f82102a = str;
            this.f82104c = aVar;
            this.f82103b = list;
            this.f82105d = obj;
        }

        /* renamed from: a */
        public String mo57415a() {
            SnsMethodCalculate.markStartTimeMs(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
            String str = this.f82102a;
            SnsMethodCalculate.markEndTimeMs(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
            return str;
        }

        /* renamed from: b */
        public void mo57416b(View view) {
            SnsMethodCalculate.markStartTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            for (int i = 0; i < this.f82103b.size(); i++) {
                linkedList.add(this.f82103b.get(i));
                linkedList2.add(Integer.valueOf(i));
            }
            C76879j.m92732c(SnsSettingUI.this, "", linkedList, linkedList2, "", new C30458a());
            SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
        }

        public String value() {
            String str;
            SnsMethodCalculate.markStartTimeMs("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
            Object obj = this.f82105d;
            int i = 0;
            if (obj instanceof int[]) {
                if (C86709a0.m107522a()) {
                    int j = C86709a0.m107535s().mo121142i().mo119689j(this.f82104c, 0);
                    str = this.f82103b.get(0);
                    while (true) {
                        Object obj2 = this.f82105d;
                        if (i < ((int[]) obj2).length) {
                            if (j == ((int[]) obj2)[i] && i < this.f82103b.size()) {
                                str = this.f82103b.get(i);
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
                    return str;
                }
            } else if ((obj instanceof long[]) && C86709a0.m107522a()) {
                long G = C86709a0.m107535s().mo121142i().mo119673G(this.f82104c, 0);
                String str2 = this.f82103b.get(0);
                while (true) {
                    Object obj3 = this.f82105d;
                    if (i < ((long[]) obj3).length) {
                        if (G == ((long[]) obj3)[i] && i < this.f82103b.size()) {
                            str = this.f82103b.get(i);
                            break;
                        }
                        i++;
                    } else {
                        str = str2;
                        break;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
                return str;
            }
            str = "";
            SnsMethodCalculate.markEndTimeMs("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem");
            return str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$u */
    public class C30459u implements C30462v {

        /* renamed from: a */
        public String f82108a;

        /* renamed from: b */
        public String f82109b;

        /* renamed from: c */
        public View.OnClickListener f82110c;

        public C30459u(SnsSettingUI snsSettingUI, String str, String str2, View.OnClickListener onClickListener) {
            this.f82108a = str;
            this.f82109b = str2;
            this.f82110c = onClickListener;
        }

        /* renamed from: a */
        public String mo57415a() {
            SnsMethodCalculate.markStartTimeMs(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
            String str = this.f82108a;
            SnsMethodCalculate.markEndTimeMs(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
            return str;
        }

        /* renamed from: b */
        public void mo57416b(View view) {
            SnsMethodCalculate.markStartTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
            this.f82110c.onClick(view);
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "ClickItem Done", 1).show();
            SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
        }

        public String value() {
            SnsMethodCalculate.markStartTimeMs("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
            String str = this.f82109b;
            SnsMethodCalculate.markEndTimeMs("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
            return str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$s */
    public class C30460s extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$s$a */
        public class C30461a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C30462v f82112d;

            /* renamed from: e */
            public final /* synthetic */ TextView f82113e;

            public C30461a(C30460s sVar, C30462v vVar, TextView textView) {
                this.f82112d = vVar;
                this.f82113e = textView;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$ChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter$1");
                this.f82112d.mo57416b(this.f82113e);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$ChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C30460s() {
        }

        public int getCount() {
            SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
            SnsSettingUI snsSettingUI = SnsSettingUI.this;
            int i = SnsSettingUI.f82073g;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            LinkedList linkedList = snsSettingUI.f82075e;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            int size = linkedList.size();
            SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
            return size;
        }

        public Object getItem(int i) {
            SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
            SnsSettingUI snsSettingUI = SnsSettingUI.this;
            int i2 = SnsSettingUI.f82073g;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            LinkedList linkedList = snsSettingUI.f82075e;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            Object obj = linkedList.get(i);
            SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
            return obj;
        }

        public long getItemId(int i) {
            SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
            SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
            TextView textView = new TextView(SnsSettingUI.this);
            C30462v vVar = (C30462v) getItem(i);
            textView.setTag(vVar);
            textView.setText(vVar.mo57415a() + "->:" + vVar.value());
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setHeight(C76577a.m92151b(MMApplicationContext.getContext(), 50));
            if (i % 2 == 1) {
                textView.setBackgroundColor(Color.parseColor("#e2efda"));
            }
            textView.setOnClickListener(new C30461a(this, vVar, textView));
            SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSettingUI$v */
    public interface C30462v {
        /* renamed from: a */
        String mo57415a();

        /* renamed from: b */
        void mo57416b(View view);

        String value();
    }

    /* renamed from: H7 */
    public static /* synthetic */ String m39086H7(SnsSettingUI snsSettingUI) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        String str = snsSettingUI.f82074d;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        return str;
    }

    /* renamed from: I7 */
    public final List<String> mo57392I7(String... strArr) {
        SnsMethodCalculate.markStartTimeMs("items", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        ArrayList arrayList = new ArrayList();
        for (String add : strArr) {
            arrayList.add(add);
        }
        SnsMethodCalculate.markEndTimeMs("items", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        return arrayList;
    }

    /* renamed from: J7 */
    public final int[] mo57393J7(int... iArr) {
        SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = iArr[i];
        }
        SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        return iArr2;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        return C0966R.C0971layout.c47;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        super.onCreate(bundle);
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
            ((ListView) findViewById(C0966R.C0970id.jvg)).setAdapter(this.f82076f);
            this.f82075e.add(new C30459u(this, "清空朋友圈漏读提醒", "点我", new C30448j(this)));
            this.f82075e.add(new C30459u(this, "朋友圈缩略图下载", "进行套图下载", new C30449k()));
            this.f82075e.add(new C30459u(this, "朋友圈缩略图下载", "进行单图下载", new C30450l()));
            this.f82075e.add(new C30459u(this, "朋友圈缩略图下载", "目前状态", new C30451m()));
            this.f82075e.add(new C30459u(this, "朋友圈预加载cgi触发", "点我", new C30452n()));
            this.f82075e.add(new C30457t("朋友圈微商折叠辅助工具", C72994y1.C72995a.USERINFO_SNS_WS_FOLD_DEBUG_INT_SYNC, mo57392I7("关", "开"), mo57393J7(0, 1)));
            this.f82075e.add(new C30457t("视频码率切换", C72994y1.C72995a.USERINFO_SNS_VDIEO_DOWNLOAD_INT_SYNC, mo57392I7("默认", "打开，根据模型预测拉流", "打开，默认高清", "打开，默认拉取低清", "关闭"), mo57393J7(0, 1, 2, -2, 3)));
            this.f82075e.add(new C30457t("朋友圈视频边下边播", C72994y1.C72995a.USERINFO_SNS_VDIEO_PLAYTYPE_INT_SYNC, mo57392I7("默认", "边下边播", "完全下载后播放"), mo57393J7(-1, 0, 1)));
            this.f82075e.add(new C30457t("新版封面", C72994y1.C72995a.USERINFO_SNS_COVER_NEW_INT_SYNC, mo57392I7("默认", "开", "关"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("feed优化开关", C72994y1.C72995a.USERINFO_SNS_FEED_NEW_INT_SYNC, mo57392I7("默认", "开", "关"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("插装优化开关", C72994y1.C72995a.USERINFO_SNS_ASM_INT_SYNC, mo57392I7("默认", "开", "关"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("feed优化标记", C72994y1.C72995a.USERINFO_SNS_FEED_NEW_SHOW_DEBUG_INT_SYNC, mo57392I7("默认", "开", "关"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("封面finder立刻检查", C72994y1.C72995a.USERINFO_SNS_COVER_FINDER_CHECK_INT_SYNC, mo57392I7("默认", "开", "关"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("封面展示debug信息", C72994y1.C72995a.USERINFO_SNS_COVER_DEBUG_INT_SYNC, mo57392I7("关", "开"), mo57393J7(0, 1)));
            this.f82075e.add(new C30457t("微商折叠槽位内视频自动播放", C72994y1.C72995a.USERINFO_SNS_WS_FOLD_AUTOPLAY_INT_SYNC, mo57392I7("X实验", "开", "关"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30459u(this, "本地设置默认封面", "点我", new C30453o()));
            this.f82075e.add(new C30459u(this, "本地设置打击封面", "点我", new C30454p()));
            this.f82075e.add(new C30457t("上传原始封面", C72994y1.C72995a.USERINFO_SNS_COVER_UPLOAD_SOURCE_INT_SYNC, mo57392I7("关", "开"), mo57393J7(0, 1)));
            this.f82075e.add(new C30459u(this, "清空封面信息", "点我", new C30455q()));
            this.f82075e.add(new C30459u(this, "清空重复url记录", "点我", new C30456r()));
            this.f82075e.add(new C30459u(this, "随机插入sns db条数", "点我", new C30432a()));
            this.f82075e.add(new C30459u(this, "清理sns db（用户侧正常清理）", "点我", new C30437b()));
            this.f82075e.add(new C30459u(this, "设置发表视频中间文件清理间隔", "点我", new C30439c()));
            this.f82075e.add(new C30459u(this, "清理sns db（测试用，会删自己发表的）", "点我", new C30440d()));
            this.f82075e.add(new C30459u(this, "删除sns db", "点我", new C30442e(this)));
            this.f82075e.add(new C30459u(this, "重置不折叠ta标记位", "点我", new C30443f()));
            this.f82075e.add(new C30457t("不再通知tips开关(DEBUG)", C72994y1.C72995a.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_TRIGGER_DEBUG_INT, mo57392I7("关", "开"), mo57393J7(0, 1)));
            this.f82075e.add(new C30457t("不再通知tips点赞触发阈值(默认5)", C72994y1.C72995a.USERINFO_SNS_THRESHOLD_MSG_STOP_REMIND_UNREAD_LIKE_NOT_MINE_FEED_DEBUG_INT, mo57392I7(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, "3", "2", "1"), mo57393J7(5, 4, 3, 2, 1)));
            this.f82075e.add(new C30459u(this, "重置不再通知tips剩余次数到3(默认)和提示后的使用记录", "点我", new C30445g()));
            this.f82075e.add(new C30457t("使用新互动样式", C72994y1.C72995a.USERINFO_SNS_USE_NEW_GALLERY_FOOTER_INT_SYNC, mo57392I7("默认", "关", "开"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("和谁一起", C72994y1.C72995a.USERINFO_SNS_WITH_TA_INT, mo57392I7("默认", "关", "开"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("分组优化+动态标签", C72994y1.C72995a.USERINFO_SNS_GROUP_INT_SYNC, mo57392I7("默认", "关", "开"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("拍摄器适配固定分辨率9:16", C72994y1.C72995a.USERINFO_SNS_USE_NEW_RECORD_INT_SYNC, mo57392I7("默认", "关", "开"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("指定输出视频分辨率", C72994y1.C72995a.USERINFO_VC_OUTPPUT_SIZE_INT_SYNC, mo57392I7("默认", "540x960", "720x1280", "1080x1920"), mo57393J7(0, 1, 2, 3)));
            this.f82075e.add(new C30459u(this, "朋友圈模拟db发生损坏", "点我", new C30446h(this)));
            this.f82075e.add(new C30457t("朋友圈db损坏弹框重启微信", C72994y1.C72995a.USERINFO_SNS_USE_DB_DAMAGE_DIALOG_INT_SYNC, mo57392I7("默认", "关", "开"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("发表页V2 + 输入区域扩展", C72994y1.C72995a.USERINFO_SNS_USE_V2_UPLOAD_UI_INT_SYNC, mo57392I7("默认", "关", "开"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("使用ImproveUI", C72994y1.C72995a.USERINFO_SNS_USE_IMPROVEUI_INT_SYNC, mo57392I7("默认", "关", "开"), mo57393J7(0, 1, 2)));
            this.f82075e.add(new C30457t("ImproveUI不弹JankDialog", C72994y1.C72995a.USERINFO_SNS_USE_IMPROVEUI_DISABLE_JANK_DIALOG_INT_SYNC, mo57392I7("默认", "不弹出"), mo57393J7(0, 1)));
            this.f82075e.add(new C30457t("朋友圈评论输入更改为AdjustNothing", C72994y1.C72995a.USERINFO_SNS_COMMENT_USE_ADJUST_NOTHING_INT_SYNC, mo57392I7("默认", "关", "开"), mo57393J7(0, 1, 2)));
            setBackBtn(new C30447i());
            SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            return;
        }
        finish();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
    }
}
