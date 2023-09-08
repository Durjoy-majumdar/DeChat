package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bp3.C104160f;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.QFadeImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.r5$$s;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96965r;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C96983o3;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import gy3.C87412m;
import h81.C32735h;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import os2.C100406i0;
import os2.C100416r;
import os2.C100417r0;
import p214om.C11502f;
import p629ny.C76979h;
import qc0.C101093a;
import qc0.C101106m;
import te3.C101789j00;
import te3.C101802kr2;
import te3.C101804kv2;
import te3.C101817mv2;
import te3.C101829pp1;
import te3.C101842st2;
import te3.C49399fa;
import te3.C64719t23;
import te3.d05;
import vr2.C102236a0;
import za2.C102984b;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5 */
public class C96198r5 extends BaseAdapter {

    /* renamed from: A */
    public String f281031A = "";

    /* renamed from: B */
    public int f281032B = Integer.MAX_VALUE;

    /* renamed from: C */
    public int f281033C = 0;

    /* renamed from: D */
    public long f281034D = 0;

    /* renamed from: E */
    public long f281035E = 0;

    /* renamed from: F */
    public boolean f281036F = false;

    /* renamed from: G */
    public boolean f281037G = false;

    /* renamed from: H */
    public int f281038H = 0;

    /* renamed from: I */
    public final boolean f281039I;

    /* renamed from: J */
    public int f281040J = -1;

    /* renamed from: K */
    public int f281041K = 0;

    /* renamed from: L */
    public View.OnClickListener f281042L = new r5$$e(this);

    /* renamed from: d */
    public Activity f281043d;

    /* renamed from: e */
    public String f281044e = "";

    /* renamed from: f */
    public C96983o3 f281045f;

    /* renamed from: g */
    public String f281046g;

    /* renamed from: h */
    public List<SnsInfo> f281047h = new ArrayList();

    /* renamed from: i */
    public Map<Integer, Integer> f281048i = new HashMap();

    /* renamed from: j */
    public Map<Integer, Integer> f281049j = new HashMap();

    /* renamed from: n */
    public Map<Integer, Integer> f281050n = new HashMap();

    /* renamed from: o */
    public int f281051o = 0;

    /* renamed from: p */
    public int f281052p = 0;

    /* renamed from: q */
    public r5$$s f281053q;

    /* renamed from: r */
    public boolean f281054r = false;

    /* renamed from: s */
    public String f281055s = "";

    /* renamed from: t */
    public boolean f281056t = false;

    /* renamed from: u */
    public long f281057u = 0;

    /* renamed from: v */
    public String f281058v = "";

    /* renamed from: w */
    public C96236u5 f281059w;

    /* renamed from: x */
    public C96245v5 f281060x;

    /* renamed from: y */
    public r5$$p f281061y;

    /* renamed from: z */
    public C44668u3 f281062z = null;

    public C96198r5(boolean z, Activity activity, r5$$s r5__s, String str, r5$$p r5__p) {
        this.f281039I = z;
        this.f281044e = str;
        this.f281043d = activity;
        this.f281053q = r5__s;
        this.f281061y = r5__p;
        this.f281062z = C94866e1.Jx0();
        SnsMethodCalculate.markStartTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(this.f281043d.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), this.f281043d);
        Log.m105918d("MicroMsg.SnsphotoAdapter", "filterLan temp " + loadApplicationLanguage);
        if (loadApplicationLanguage.equals("zh_CN") || loadApplicationLanguage.equals("en") || loadApplicationLanguage.equals("zh_TW")) {
            SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        } else {
            loadApplicationLanguage = loadApplicationLanguage.equals("zh_HK") ? "zh_TW" : "en";
            SnsMethodCalculate.markEndTimeMs("filterLan", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        }
        this.f281031A = loadApplicationLanguage;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        this.f281046g = LocaleUtil.loadApplicationLanguage(this.f281043d.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), this.f281043d);
        C86709a0.m107528h();
        if (this.f281044e.equals((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null))) {
            this.f281054r = true;
        }
        Log.m105918d("MicroMsg.SnsphotoAdapter", "SnsphotoAdapter : userName : " + this.f281044e + " country: " + this.f281046g);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (this.f281054r) {
            this.f281045f = new C96983o3("album_self");
        } else {
            C86709a0.m107528h();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            if (z1Var == null || !z1Var.mo62927s3()) {
                this.f281045f = new C96983o3("album_stranger");
            } else {
                this.f281045f = new C96983o3("album_friend");
            }
        }
        this.f281059w = new C96236u5(new r5$$f(this, r5__p), str, this.f281054r);
        this.f281060x = new C96245v5(new r5$$g(this, r5__p), str, this.f281054r);
        mo133836F(0);
        mo133831A(false);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m123298a(C96198r5 r5Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z = r5Var.f281036F;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z;
    }

    /* renamed from: b */
    public static /* synthetic */ List m123299b(C96198r5 r5Var) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        List<SnsInfo> list = r5Var.f281047h;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return list;
    }

    /* renamed from: d */
    public static void m123300d(C96198r5 r5Var) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        r5Var.getClass();
        SnsMethodCalculate.markStartTimeMs("findOutCorrectRecentLimitId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (r5Var.f281034D != 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= ((ArrayList) r5Var.f281047h).size()) {
                    break;
                }
                long j = ((SnsInfo) ((ArrayList) r5Var.f281047h).get(i2)).field_snsId;
                if (j <= r5Var.f281034D) {
                    r5Var.f281035E = j;
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i == 0 && !r5Var.f281037G) {
                r5Var.f281035E = 0;
            }
        }
        SnsMethodCalculate.markEndTimeMs("findOutCorrectRecentLimitId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    /* renamed from: f */
    public static /* synthetic */ Activity m123301f(C96198r5 r5Var) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        Activity activity = r5Var.f281043d;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return activity;
    }

    /* renamed from: A */
    public void mo133831A(boolean z) {
        SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        Log.m105918d("MicroMsg.SnsphotoAdapter", "limitSeq " + this.f281058v);
        C96236u5 u5Var = this.f281059w;
        if (u5Var != null) {
            if (this.f281036F) {
                C96245v5 v5Var = this.f281060x;
                v5Var.getClass();
                SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                v5Var.mo133228a(z);
                SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            } else {
                String str = this.f281058v;
                boolean z2 = this.f281056t;
                u5Var.getClass();
                SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                Log.m105918d("MicroMsg.SnsSelfHelper", "limitSeq " + str);
                u5Var.f281219h = str;
                u5Var.f281220i = z2;
                u5Var.mo133228a(z);
                SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            }
        }
        SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    /* renamed from: B */
    public final void mo133832B(View view) {
        SnsMethodCalculate.markStartTimeMs("resetLayoutParams", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        int intValue = ((Integer) view.getTag()).intValue();
        if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (intValue == 0) {
                layoutParams.topMargin = 0;
                view.setLayoutParams(layoutParams);
            } else {
                layoutParams.topMargin = this.f281043d.getResources().getDimensionPixelSize(C0966R.dimen.aoz);
                view.setLayoutParams(layoutParams);
            }
        }
        SnsMethodCalculate.markEndTimeMs("resetLayoutParams", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03e2  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133833C(int r27, com.tencent.p014mm.p136ui.widget.QFadeImageView r28, android.widget.TextView r29, android.widget.TextView r30, com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView r31, android.widget.TextView r32, int r33, boolean r34, com.tencent.p014mm.plugin.sns.p106ui.r5$$q r35, int r36) {
        /*
            r26 = this;
            r0 = r26
            r9 = r28
            r1 = r29
            r10 = r30
            r11 = r31
            r2 = r32
            r12 = r33
            r13 = r35
            com.tencent.mm.plugin.sns.model.o$h r6 = com.tencent.p014mm.plugin.sns.model.C94901o.C94911h.IMG_SCENE_SNSUSER
            java.lang.String r14 = "setImgInfo"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            java.lang.Object r3 = r26.getItem(r27)
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r3
            r4 = r27
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.mo133854r(r3, r4)
            if (r5 == 0) goto L_0x002a
            r8 = r5
            goto L_0x002b
        L_0x002a:
            r8 = r3
        L_0x002b:
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r8.getTimeLine()
            com.tencent.mm.protocal.protobuf.SnsObject r3 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120367e(r8)
            vr2.b0$a r5 = vr2.C65874b0.f189421a
            java.lang.String r4 = "MicroMsg.SnsphotoAdapter"
            r16 = r14
            r14 = 1
            r5.mo89928g(r4, r3, r14)
            int r14 = r3.ExtFlag
            boolean r5 = r5.mo89923b(r14)
            boolean r14 = r0.f281054r
            r17 = r15
            if (r14 == 0) goto L_0x0062
            if (r5 == 0) goto L_0x0062
            java.lang.String r14 = r0.f281044e
            if (r14 == 0) goto L_0x0062
            java.lang.String r15 = r8.getUserName()
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0062
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$a r14 = com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView.C5485a.Group
            r11.mo6500a(r14)
            r14 = 0
            r11.setVisibility(r14)
        L_0x0062:
            java.lang.String r14 = ""
            r15 = 1
            if (r12 != r15) goto L_0x00a8
            int r15 = r8.getLocalPrivate()
            boolean r10 = r0.f281054r
            boolean r10 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120371i(r15, r10)
            if (r10 == 0) goto L_0x00ec
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$a r10 = com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView.C5485a.Private
            r11.mo6500a(r10)
            r10 = 0
            r11.setVisibility(r10)
            com.tencent.mm.storage.u3 r10 = r0.f281062z
            java.lang.String r15 = r8.getUserName()
            com.tencent.mm.storage.z1 r10 = r10.get(r15)
            if (r10 != 0) goto L_0x008a
            r10 = r14
            goto L_0x008e
        L_0x008a:
            java.lang.String r10 = r10.mo62898f()
        L_0x008e:
            boolean r15 = r10.equals(r14)
            if (r15 != 0) goto L_0x00ea
            java.lang.String r15 = r0.f281044e
            java.lang.String r12 = r8.getUserName()
            boolean r12 = r15.equals(r12)
            if (r12 != 0) goto L_0x00ea
            r12 = 0
            r1.setVisibility(r12)
            r1.setText(r10)
            goto L_0x00ea
        L_0x00a8:
            int r10 = r8.getLocalPrivate()
            boolean r12 = r0.f281054r
            boolean r10 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120371i(r10, r12)
            if (r10 == 0) goto L_0x00ec
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$a r10 = com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView.C5485a.Private
            r11.mo6500a(r10)
            r10 = 0
            r11.setVisibility(r10)
            com.tencent.mm.storage.u3 r10 = r0.f281062z
            java.lang.String r12 = r8.getUserName()
            com.tencent.mm.storage.z1 r10 = r10.get(r12)
            if (r10 != 0) goto L_0x00cb
            r10 = r14
            goto L_0x00cf
        L_0x00cb:
            java.lang.String r10 = r10.mo62898f()
        L_0x00cf:
            if (r10 == 0) goto L_0x00ea
            boolean r12 = r10.equals(r14)
            if (r12 != 0) goto L_0x00ea
            java.lang.String r12 = r0.f281044e
            java.lang.String r15 = r8.getUserName()
            boolean r12 = r12.equals(r15)
            if (r12 != 0) goto L_0x00ea
            r12 = 0
            r1.setVisibility(r12)
            r1.setText(r10)
        L_0x00ea:
            r1 = 1
            goto L_0x00ed
        L_0x00ec:
            r1 = 0
        L_0x00ed:
            r10 = 6
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r27)
            r15 = 0
            r10[r15] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r33)
            r15 = 1
            r10[r15] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r34)
            r15 = 2
            r10[r15] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r36)
            r15 = 3
            r10[r15] = r12
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r12 = 4
            r10[r12] = r5
            r5 = 5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r10[r5] = r1
            java.lang.String r1 = "setImgInfo: fixPos:%d, linePos:%d, prePrivated:%b, position:%d , isShowGourp:%b, Private:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r10)
            int r1 = r8.localid
            com.tencent.mm.plugin.sns.ui.r5$$s$i r10 = new com.tencent.mm.plugin.sns.ui.r5$$s$i
            r10.<init>()
            r10.f281142b = r1
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r0.f281050n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r36)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L_0x014c
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r0.f281050n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r36)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r10.f281141a = r1
            goto L_0x014f
        L_0x014c:
            r1 = 0
            r10.f281141a = r1
        L_0x014f:
            r9.setTag(r10)
            boolean r1 = r0.f281039I
            if (r1 == 0) goto L_0x015b
            android.view.View r1 = r13.f281111t
            r1.setTag(r10)
        L_0x015b:
            com.tencent.mm.storage.o3 r5 = new com.tencent.mm.storage.o3
            com.tencent.mm.storage.o3 r1 = r0.f281045f
            java.lang.String r1 = r1.f284144a
            r5.<init>(r1)
            int r1 = r8.field_createTime
            r5.f284145b = r1
            te3.j00 r1 = r7.ContentObj
            int r4 = r1.f298424e
            r15 = 1
            if (r4 != r15) goto L_0x01ab
            r15 = 0
            r9.setVisibility(r15)
            com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r2 = r8.getSnsId()
            te3.j00 r3 = r7.ContentObj
            java.util.LinkedList<te3.kv2> r3 = r3.f298427h
            android.app.Activity r4 = r0.f281043d
            int r15 = r4.hashCode()
            r1.getClass()
            java.lang.String r4 = "setSnsGridList"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r12)
            r18 = 0
            r19 = r4
            r4 = r28
            r20 = r5
            r5 = r15
            r15 = r7
            r7 = r20
            r36 = r8
            r8 = r18
            r1.mo131107a0(r2, r3, r4, r5, r6, r7, r8)
            r1 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
        L_0x01a8:
            r12 = r36
            goto L_0x01f8
        L_0x01ab:
            r20 = r5
            r15 = r7
            r36 = r8
            r5 = 2
            if (r4 != r5) goto L_0x01c1
            java.lang.String r1 = r1.f298423d
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r14)
            r2.setText(r1)
            r1 = 0
            r2.setVisibility(r1)
            goto L_0x01a8
        L_0x01c1:
            r1 = 21
            if (r4 != r1) goto L_0x01a8
            r36.getPostInfo()
            boolean r1 = r0.f281054r
            if (r1 == 0) goto L_0x01cf
            r12 = r36
            goto L_0x01da
        L_0x01cf:
            r12 = r36
            boolean r1 = as2.C92086h.m115755b(r12, r3)
            if (r1 == 0) goto L_0x01da
            r1 = 0
            r8 = 0
            goto L_0x01dc
        L_0x01da:
            r1 = 0
            r8 = 1
        L_0x01dc:
            r9.setVisibility(r1)
            com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r2 = r12.getSnsId()
            te3.j00 r3 = r15.ContentObj
            java.util.LinkedList<te3.kv2> r3 = r3.f298427h
            android.app.Activity r4 = r0.f281043d
            int r5 = r4.hashCode()
            r4 = r28
            r7 = r20
            r1.mo131107a0(r2, r3, r4, r5, r6, r7, r8)
        L_0x01f8:
            boolean r1 = r12.isInValid()
            if (r1 == 0) goto L_0x0212
            boolean r1 = r12.isDieItem()
            if (r1 == 0) goto L_0x0212
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$a r1 = com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView.C5485a.Error
            r11.mo6500a(r1)
            r1 = 0
            r11.setVisibility(r1)
            r1 = 1
            r9.setLongClickable(r1)
            goto L_0x0213
        L_0x0212:
            r1 = 1
        L_0x0213:
            r2 = 8
            r3 = r33
            if (r3 != r1) goto L_0x035d
            te3.j00 r4 = r15.ContentObj
            java.util.LinkedList<te3.kv2> r4 = r4.f298427h
            if (r4 == 0) goto L_0x0294
            int r4 = r4.size()
            if (r4 <= r1) goto L_0x0294
            android.view.View r1 = r13.f281111t
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r5)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r21 = "setImgInfo"
            java.lang.String r22 = "(ILcom/tencent/mm/ui/widget/QFadeImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;Landroid/widget/TextView;IZLcom/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r20 = "setImgInfo"
            java.lang.String r21 = "(ILcom/tencent/mm/ui/widget/QFadeImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;Landroid/widget/TextView;IZLcom/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            r1 = r30
            r2 = 0
            r1.setVisibility(r2)
            te3.j00 r4 = r15.ContentObj
            java.util.LinkedList<te3.kv2> r4 = r4.f298427h
            int r4 = r4.size()
            android.app.Activity r5 = r0.f281043d
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131689504(0x7f0f0020, float:1.9008025E38)
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r8[r2] = r7
            java.lang.String r2 = r5.getQuantityString(r6, r4, r8)
            r1.setText(r2)
            goto L_0x0299
        L_0x0294:
            r1 = r30
            r1.setVisibility(r2)
        L_0x0299:
            java.lang.String r1 = r15.ContentDesc
            if (r1 == 0) goto L_0x030b
            boolean r2 = r1.equals(r14)
            if (r2 != 0) goto L_0x030b
            android.view.View r2 = r13.f281111t
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r6)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r21 = "setImgInfo"
            java.lang.String r22 = "(ILcom/tencent/mm/ui/widget/QFadeImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;Landroid/widget/TextView;IZLcom/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r20 = "setImgInfo"
            java.lang.String r21 = "(ILcom/tencent/mm/ui/widget/QFadeImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;Landroid/widget/TextView;IZLcom/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r13.f281106o
            r4 = 0
            r2.setVisibility(r4)
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r13.f281106o
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            android.app.Activity r5 = r0.f281043d
            com.tencent.mm.ui.widget.MMNeat7extView r6 = r13.f281106o
            float r6 = r6.getTextSize()
            android.text.SpannableString r1 = r4.yp0(r5, r1, r6)
            r2.mo104279b(r1)
            goto L_0x03ac
        L_0x030b:
            boolean r1 = r0.f281039I
            if (r1 == 0) goto L_0x03ac
            android.view.View r1 = r13.f281111t
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r5)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r21 = "setImgInfo"
            java.lang.String r22 = "(ILcom/tencent/mm/ui/widget/QFadeImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;Landroid/widget/TextView;IZLcom/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r20 = "setImgInfo"
            java.lang.String r21 = "(ILcom/tencent/mm/ui/widget/QFadeImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;Landroid/widget/TextView;IZLcom/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r13.f281106o
            r2 = 4
            r1.setVisibility(r2)
            goto L_0x03ac
        L_0x035d:
            boolean r1 = r0.f281039I
            if (r1 == 0) goto L_0x03ac
            android.view.View r1 = r13.f281111t
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r5)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r21 = "setImgInfo"
            java.lang.String r22 = "(ILcom/tencent/mm/ui/widget/QFadeImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;Landroid/widget/TextView;IZLcom/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r20 = "setImgInfo"
            java.lang.String r21 = "(ILcom/tencent/mm/ui/widget/QFadeImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;Landroid/widget/TextView;IZLcom/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r13.f281106o
            r1.setVisibility(r2)
        L_0x03ac:
            r1 = 2
            if (r3 != r1) goto L_0x03e2
            boolean r1 = r0.f281039I
            if (r1 == 0) goto L_0x03e2
            com.tencent.mm.ui.widget.QFadeImageView r1 = r13.f281105n
            r2 = 4
            r1.setVisibility(r2)
            com.tencent.mm.ui.widget.QFadeImageView r1 = r13.f281105n
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L_0x03cb
            r2 = r16
            r4 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            return
        L_0x03cb:
            r2 = r16
            r4 = r17
            r5 = 2131234949(0x7f081085, float:1.8086078E38)
            r1.setBackgroundResource(r5)
            r5 = 1
            r1.setClickable(r5)
            com.tencent.mm.plugin.sns.ui.r5$$a r5 = new com.tencent.mm.plugin.sns.ui.r5$$a
            r5.<init>(r0, r10)
            r1.setOnClickListener(r5)
            goto L_0x03e6
        L_0x03e2:
            r2 = r16
            r4 = r17
        L_0x03e6:
            r1 = 3
            if (r3 != r1) goto L_0x0482
            boolean r1 = r0.f281039I
            if (r1 == 0) goto L_0x0482
            android.view.View r1 = r13.f281112u
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r6)
            java.lang.Object[] r5 = r3.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r7 = "setImgInfo"
            java.lang.String r8 = "(ILcom/tencent/mm/ui/widget/QFadeImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;Landroid/widget/TextView;IZLcom/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder;I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r27 = r1
            r28 = r5
            r29 = r6
            r30 = r7
            r31 = r8
            r32 = r9
            r33 = r11
            r34 = r12
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r3 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r5 = "setImgInfo"
            java.lang.String r6 = "(ILcom/tencent/mm/ui/widget/QFadeImageView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/tencent/mm/plugin/sns/ui/widget/SnsAlbumThumbStateIconView;Landroid/widget/TextView;IZLcom/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder;I)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r28 = r3
            r29 = r5
            r30 = r6
            r31 = r7
            r32 = r8
            r33 = r9
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            android.view.View r1 = r13.f281112u
            r3 = 0
            r1.setBackgroundResource(r3)
            android.view.View r1 = r13.f281112u
            r3 = 1
            r1.setClickable(r3)
            com.tencent.mm.ui.widget.QFadeImageView r1 = r13.f281105n
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L_0x0468
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            return
        L_0x0468:
            android.view.View r3 = r13.f281112u
            com.tencent.mm.plugin.sns.ui.r5$$b r5 = new com.tencent.mm.plugin.sns.ui.r5$$b
            r5.<init>(r0, r10)
            r3.setOnClickListener(r5)
            r3 = 0
            r1.setBackgroundResource(r3)
            r3 = 1
            r1.setClickable(r3)
            com.tencent.mm.plugin.sns.ui.r5$$c r3 = new com.tencent.mm.plugin.sns.ui.r5$$c
            r3.<init>(r0, r10)
            r1.setOnClickListener(r3)
        L_0x0482:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96198r5.mo133833C(int, com.tencent.mm.ui.widget.QFadeImageView, android.widget.TextView, android.widget.TextView, com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView, android.widget.TextView, int, boolean, com.tencent.mm.plugin.sns.ui.r5$$q, int):void");
    }

    /* renamed from: D */
    public final void mo133834D(View view, View view2, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("setItemContentDescription", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        view2.setContentDescription(str2);
        if (Util.isNullOrNil(str)) {
            view.setContentDescription("");
        } else {
            view.setContentDescription(str + "," + str2);
        }
        SnsMethodCalculate.markEndTimeMs("setItemContentDescription", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e0  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo133835E(java.util.List<com.tencent.p014mm.plugin.sns.storage.SnsInfo> r9, java.util.Map<java.lang.Integer, java.lang.Integer> r10, java.util.Map<java.lang.Integer, java.lang.Integer> r11, java.util.Map<java.lang.Integer, java.lang.Integer> r12, int r13, int r14) {
        /*
            r8 = this;
            java.lang.String r0 = "setSnsList"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "setSnsList the thread id is "
            r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            long r3 = r3.getId()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.SnsphotoAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            if (r9 == 0) goto L_0x021e
            int r2 = r9.size()
            if (r2 > 0) goto L_0x0031
            goto L_0x021e
        L_0x0031:
            java.lang.String r2 = "copy list info"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            int r2 = r9.size()
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r4 = r8.f281047h
            r4.clear()
            java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r8.f281048i
            r4.clear()
            java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r8.f281049j
            r4.clear()
            java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r8.f281050n
            r4.clear()
            r4 = 0
            r5 = 0
        L_0x0050:
            if (r5 >= r2) goto L_0x0064
            java.lang.Object r6 = r9.get(r5)
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r6
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = com.tencent.p014mm.plugin.sns.storage.SnsInfo.getNewSnsInfo(r6)
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r7 = r8.f281047h
            r7.add(r6)
            int r5 = r5 + 1
            goto L_0x0050
        L_0x0064:
            java.util.Set r9 = r10.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x006c:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0098
            java.lang.Object r2 = r9.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r10.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r8.f281048i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.put(r2, r5)
            goto L_0x006c
        L_0x0098:
            java.util.Set r9 = r11.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x00a0:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00cc
            java.lang.Object r2 = r9.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r11.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r8.f281049j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.put(r2, r5)
            goto L_0x00a0
        L_0x00cc:
            java.util.Set r9 = r12.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x00d4:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0100
            java.lang.Object r2 = r9.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r12.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r8.f281050n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.put(r2, r5)
            goto L_0x00d4
        L_0x0100:
            r10.clear()
            r11.clear()
            boolean r9 = r8.f281054r
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1
            if (r9 == 0) goto L_0x0127
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r9 = r8.f281047h
            int r9 = r9.size()
            if (r9 > r11) goto L_0x011a
        L_0x0116:
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x013c
        L_0x011a:
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r9 = r8.f281047h
            java.lang.Object r9 = r9.get(r11)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r9
            int r9 = r9.getHead()
            goto L_0x013c
        L_0x0127:
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r9 = r8.f281047h
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0130
            goto L_0x0116
        L_0x0130:
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r9 = r8.f281047h
            java.lang.Object r9 = r9.get(r4)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r9
            int r9 = r9.getHead()
        L_0x013c:
            r8.f281032B = r4
            r12 = 0
        L_0x013f:
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r2 = r8.f281047h
            int r2 = r2.size()
            if (r12 >= r2) goto L_0x0174
            boolean r2 = r8.f281054r
            if (r2 == 0) goto L_0x014e
            if (r12 != 0) goto L_0x014e
            goto L_0x0171
        L_0x014e:
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r2 = r8.f281047h
            java.lang.Object r2 = r2.get(r12)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r2
            int r2 = r2.getHead()
            if (r9 == r2) goto L_0x015d
            goto L_0x0174
        L_0x015d:
            int r2 = r8.f281032B
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r5 = r8.f281047h
            java.lang.Object r5 = r5.get(r12)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r5
            int r5 = r5.getCreateTime()
            int r2 = java.lang.Math.max(r2, r5)
            r8.f281032B = r2
        L_0x0171:
            int r12 = r12 + 1
            goto L_0x013f
        L_0x0174:
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r9 = r8.f281047h
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0188
            boolean r9 = r8.f281054r
            if (r9 == 0) goto L_0x018a
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r9 = r8.f281047h
            int r9 = r9.size()
            if (r9 != r11) goto L_0x018a
        L_0x0188:
            r8.f281032B = r10
        L_0x018a:
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r9 = r8.f281047h
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0194
            r9 = 0
            goto L_0x01a5
        L_0x0194:
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r9 = r8.f281047h
            int r12 = r9.size()
            int r12 = r12 - r11
            java.lang.Object r9 = r9.get(r12)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r9
            int r9 = r9.getHead()
        L_0x01a5:
            r8.f281033C = r10
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r10 = r8.f281047h
            int r10 = r10.size()
            int r10 = r10 - r11
        L_0x01ae:
            if (r10 < 0) goto L_0x01d8
            if (r9 == 0) goto L_0x01d8
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r11 = r8.f281047h
            java.lang.Object r11 = r11.get(r10)
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r11
            int r11 = r11.getHead()
            if (r9 == r11) goto L_0x01c1
            goto L_0x01d8
        L_0x01c1:
            int r11 = r8.f281033C
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r12 = r8.f281047h
            java.lang.Object r12 = r12.get(r10)
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r12
            int r12 = r12.getCreateTime()
            int r11 = java.lang.Math.min(r11, r12)
            r8.f281033C = r11
            int r10 = r10 + -1
            goto L_0x01ae
        L_0x01d8:
            java.util.List<com.tencent.mm.plugin.sns.storage.SnsInfo> r9 = r8.f281047h
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x01e2
            r8.f281033C = r4
        L_0x01e2:
            r8.f281052p = r13
            r8.f281051o = r14
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "reallyCount "
            r9.append(r10)
            r9.append(r13)
            java.lang.String r10 = " icount "
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = " stTime "
            r9.append(r10)
            int r10 = r8.f281032B
            r9.append(r10)
            java.lang.String r10 = " edTIme "
            r9.append(r10)
            int r10 = r8.f281033C
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r9)
            r8.notifyDataSetChanged()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x021e:
            com.tencent.mm.plugin.sns.ui.r5$$p r9 = r8.f281061y
            if (r9 == 0) goto L_0x0227
            com.tencent.mm.plugin.sns.ui.SnsUserUI$a r9 = (com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI.C95688a) r9
            r9.mo133110a()
        L_0x0227:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96198r5.mo133835E(java.util.List, java.util.Map, java.util.Map, java.util.Map, int, int):void");
    }

    /* renamed from: F */
    public final void mo133836F(long j) {
        SnsMethodCalculate.markStartTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        String p0 = C102236a0.m134763p0(C94866e1.Yx0().Ab0(j, C94866e1.dy0().mo6418i(this.f281044e), this.f281044e, this.f281054r));
        if (this.f281055s.equals("")) {
            this.f281058v = p0;
        } else {
            if (p0.compareTo(this.f281055s) >= 0) {
                p0 = this.f281055s;
            }
            this.f281058v = p0;
        }
        long j2 = C94866e1.Xx0().mo139782Yt(this.f281044e).mo139769l2().f139085e;
        if (j2 == 0) {
            SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return;
        }
        String p05 = C102236a0.m134763p0(j2);
        if (this.f281058v.equals("")) {
            this.f281058v = p05;
            SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return;
        }
        if (p05.compareTo(this.f281058v) <= 0) {
            p05 = this.f281058v;
        }
        this.f281058v = p05;
        SnsMethodCalculate.markEndTimeMs("updateLimitSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    /* renamed from: g */
    public void mo133837g() {
        long j;
        SnsMethodCalculate.markStartTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        Log.m105918d("MicroMsg.SnsphotoAdapter", "i addSize ");
        if (((ArrayList) this.f281047h).isEmpty()) {
            j = 0;
        } else {
            List<SnsInfo> list = this.f281047h;
            j = ((SnsInfo) ((ArrayList) list).get(((ArrayList) list).size() - 1)).field_snsId;
        }
        mo133836F(j);
        SnsMethodCalculate.markEndTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        int i = this.f281051o;
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return i;
    }

    public Object getItem(int i) {
        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        Object obj = ((ArrayList) this.f281047h).get(i);
        SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return obj;
    }

    public long getItemId(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return 0;
    }

    public int getItemViewType(int i) {
        int i2;
        boolean z;
        SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z2 = false;
        if (!this.f281054r || i != 0 || ((z = this.f281036F) && (!z || !this.f281037G))) {
            int intValue = ((HashMap) this.f281048i).get(Integer.valueOf(i)) != null ? ((Integer) ((HashMap) this.f281048i).get(Integer.valueOf(i))).intValue() : -1;
            if (intValue == -1) {
                Log.m105920e("MicroMsg.SnsphotoAdapter", "unknow error " + intValue);
                SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 0;
            }
            SnsInfo snsInfo = (SnsInfo) getItem(intValue);
            if (snsInfo.getTimeLine().ContentObj.f298424e == 1) {
                Log.m105918d("MicroMsg.SnsphotoAdapter", "position " + i + " - " + 0);
                SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 0;
            } else if (snsInfo.getTimeLine().ContentObj.f298424e == 15) {
                Log.m105918d("MicroMsg.SnsphotoAdapter", "position " + i + " - " + 2);
                SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 2;
            } else if (snsInfo.getTimeLine().ContentObj.f298424e == 21) {
                SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 3;
            } else if (snsInfo.getTimeLine().ContentObj.f298424e == 28 || snsInfo.getTimeLine().ContentObj.f298424e == 29 || snsInfo.getTimeLine().ContentObj.f298424e == 37 || snsInfo.getTimeLine().ContentObj.f298424e == 38 || snsInfo.getTimeLine().ContentObj.f298424e == 34 || snsInfo.getTimeLine().ContentObj.f298424e == 45 || snsInfo.getTimeLine().ContentObj.f298424e == 43 || snsInfo.getTimeLine().ContentObj.f298424e == 36 || snsInfo.getTimeLine().ContentObj.f298424e == 44 || snsInfo.getTimeLine().ContentObj.f298424e == 46) {
                SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 4;
            } else if (snsInfo.getTimeLine().ContentObj.f298424e == 33) {
                SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 5;
            } else if (snsInfo.getTimeLine().ContentObj.f298424e == 4) {
                if (C87412m.m108589b("wx5aa333606550dfd5", snsInfo.getTimeLine().AppInfo != null ? snsInfo.getTimeLine().AppInfo.f299236d : "")) {
                    SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    return 6;
                }
                if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_new_music_type_flag, C104160f.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1) {
                    z2 = true;
                }
                if (!z2) {
                    SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    return 1;
                }
                SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 1;
            } else if (snsInfo.getTimeLine().ContentObj.f298424e == 42) {
                SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 6;
            } else if (snsInfo.getTimeLine().ContentObj.f298424e == 39 && ((i2 = snsInfo.getTimeLine().ContentObj.f298437u) == 3 || i2 == 100000000)) {
                SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 4;
            } else {
                SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return 1;
            }
        } else {
            Log.m105918d("MicroMsg.SnsphotoAdapter", "position isSelf " + i + " - " + 0);
            SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0669, code lost:
        r1 = r1.f298427h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0906, code lost:
        if (r10 != 0) goto L_0x090b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x068b  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x068f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x099c  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x09aa  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0a05  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0a18  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0a76  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0b09  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0b14  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0b62  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0b77  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0b7e  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0b94  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x05a5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x05d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r43, android.view.View r44, android.view.ViewGroup r45) {
        /*
            r42 = this;
            r11 = r42
            r12 = r43
            java.lang.String r13 = "getView"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            java.lang.String r15 = "createView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r14)
            int r0 = r42.getItemViewType(r43)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "position "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.SnsphotoAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r10 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.lang.String r5 = ""
            r10 = 2131314172(0x7f0945fc, float:1.8246762E38)
            r8 = 2131314041(0x7f094579, float:1.8246496E38)
            r9 = 2131313960(0x7f094528, float:1.8246332E38)
            r1 = 0
            r28 = 0
            if (r0 != 0) goto L_0x0711
            java.lang.String r2 = "createViewPhotos"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r14)
            if (r44 == 0) goto L_0x0067
            java.lang.Object r0 = r44.getTag()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r44.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.r5$$q
            if (r0 != 0) goto L_0x005c
            goto L_0x0067
        L_0x005c:
            java.lang.Object r0 = r44.getTag()
            com.tencent.mm.plugin.sns.ui.r5$$q r0 = (com.tencent.p014mm.plugin.sns.p106ui.r5$$q) r0
            r10 = r44
            r9 = r0
            goto L_0x01ed
        L_0x0067:
            com.tencent.mm.plugin.sns.ui.r5$$q r0 = new com.tencent.mm.plugin.sns.ui.r5$$q
            r0.<init>(r11)
            android.app.Activity r6 = r11.f281043d
            android.view.LayoutInflater r6 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r6)
            r7 = 2131497704(0x7f0c12e8, float:1.8619009E38)
            android.view.View r6 = r6.inflate(r7, r1)
            android.view.View r7 = r6.findViewById(r9)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f281078c = r7
            android.view.View r7 = r6.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f281077b = r7
            android.view.View r7 = r6.findViewById(r10)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f281079d = r7
            r7 = 2131306363(0x7f09277b, float:1.8230923E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.plugin.sns.ui.MaskImageView r7 = (com.tencent.p014mm.plugin.sns.p106ui.MaskImageView) r7
            r0.f281102k = r7
            r7 = 2131314903(0x7f0948d7, float:1.8248244E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.ui.widget.QFadeImageView r7 = (com.tencent.p014mm.p136ui.widget.QFadeImageView) r7
            r0.f281103l = r7
            r7 = 2131306364(0x7f09277c, float:1.8230925E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.plugin.sns.ui.MaskImageView r7 = (com.tencent.p014mm.plugin.sns.p106ui.MaskImageView) r7
            r0.f281104m = r7
            r7 = 2131306365(0x7f09277d, float:1.8230927E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.plugin.sns.ui.MaskImageView r7 = (com.tencent.p014mm.plugin.sns.p106ui.MaskImageView) r7
            r0.f281105n = r7
            r7 = 2131300828(0x7f0911dc, float:1.8219697E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.ui.widget.MMNeat7extView r7 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r7
            r0.f281106o = r7
            r7 = 2131317140(0x7f095194, float:1.8252781E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f281107p = r7
            r7 = 2131317141(0x7f095195, float:1.8252783E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f281108q = r7
            r7 = 2131317142(0x7f095196, float:1.8252785E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f281109r = r7
            r7 = 2131306375(0x7f092787, float:1.8230947E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f281110s = r7
            r7 = 2131300844(0x7f0911ec, float:1.821973E38)
            android.view.View r7 = r6.findViewById(r7)
            r0.f281111t = r7
            r7 = 2131309006(0x7f0931ce, float:1.8236284E38)
            android.view.View r7 = r6.findViewById(r7)
            r0.f281112u = r7
            r7 = 2131296700(0x7f0901bc, float:1.8211324E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f281082g = r7
            r7 = 2131307300(0x7f092b24, float:1.8232823E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0.f281080e = r7
            r7 = 2131308104(0x7f092e48, float:1.8234454E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0.f281081f = r7
            r7 = 2131307364(0x7f092b64, float:1.8232953E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0.f281083h = r7
            r7 = 2131307299(0x7f092b23, float:1.8232821E38)
            android.view.View r7 = r6.findViewById(r7)
            r0.f281084i = r7
            com.tencent.mm.ui.widget.QFadeImageView r7 = r0.f281103l
            com.tencent.mm.plugin.sns.ui.r5$$s r8 = r11.f281053q
            android.view.View$OnClickListener r8 = r8.f281124a
            r7.setOnClickListener(r8)
            com.tencent.mm.plugin.sns.ui.MaskImageView r7 = r0.f281102k
            com.tencent.mm.plugin.sns.ui.r5$$s r8 = r11.f281053q
            android.view.View$OnClickListener r8 = r8.f281124a
            r7.setOnClickListener(r8)
            com.tencent.mm.ui.widget.QFadeImageView r7 = r0.f281104m
            com.tencent.mm.plugin.sns.ui.r5$$s r8 = r11.f281053q
            android.view.View$OnClickListener r8 = r8.f281125b
            r7.setOnClickListener(r8)
            com.tencent.mm.ui.widget.QFadeImageView r7 = r0.f281105n
            com.tencent.mm.plugin.sns.ui.r5$$s r8 = r11.f281053q
            android.view.View$OnClickListener r8 = r8.f281126c
            r7.setOnClickListener(r8)
            com.tencent.mm.plugin.sns.ui.MaskImageView r7 = r0.f281102k
            com.tencent.mm.plugin.sns.ui.r5$$s r8 = r11.f281053q
            android.view.View$OnLongClickListener r8 = r8.f281131h
            r7.setOnLongClickListener(r8)
            com.tencent.mm.ui.widget.QFadeImageView r7 = r0.f281104m
            com.tencent.mm.plugin.sns.ui.r5$$s r8 = r11.f281053q
            android.view.View$OnLongClickListener r8 = r8.f281131h
            r7.setOnLongClickListener(r8)
            com.tencent.mm.ui.widget.QFadeImageView r7 = r0.f281105n
            com.tencent.mm.plugin.sns.ui.r5$$s r8 = r11.f281053q
            android.view.View$OnLongClickListener r8 = r8.f281131h
            r7.setOnLongClickListener(r8)
            r7 = 2131314318(0x7f09468e, float:1.8247058E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView r7 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView) r7
            r0.f281113v = r7
            r7 = 2131314319(0x7f09468f, float:1.824706E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView r7 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView) r7
            r0.f281114w = r7
            r7 = 2131314320(0x7f094690, float:1.8247062E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView r7 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView) r7
            r0.f281115x = r7
            r7 = 2131315649(0x7f094bc1, float:1.8249757E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f281116y = r7
            r7 = 2131315650(0x7f094bc2, float:1.824976E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f281117z = r7
            r7 = 2131315651(0x7f094bc3, float:1.8249761E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f281099A = r7
            r7 = 2131314031(0x7f09456f, float:1.8246476E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r7 = (com.tencent.p014mm.plugin.sns.p106ui.MaskLinearLayout) r7
            r0.f281100B = r7
            com.tencent.mm.plugin.sns.ui.MaskImageView r8 = r0.f281102k
            r7.mo132235b(r8)
            r7 = 2131305226(0x7f09230a, float:1.8228617E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0.f281085j = r7
            r7 = 2131314055(0x7f094587, float:1.8246524E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            com.tencent.mm.plugin.sns.ui.t5 r8 = new com.tencent.mm.plugin.sns.ui.t5
            r8.<init>(r11)
            r7.setOnClickListener(r8)
            r6.setTag(r0)
            r9 = r0
            r10 = r6
        L_0x01ed:
            com.tencent.mm.plugin.sns.model.o r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.MaskImageView r6 = r9.f281102k
            r0.mo131091K(r6)
            com.tencent.mm.plugin.sns.model.o r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.ui.widget.QFadeImageView r6 = r9.f281104m
            r0.mo131091K(r6)
            com.tencent.mm.plugin.sns.model.o r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.ui.widget.QFadeImageView r6 = r9.f281105n
            r0.mo131091K(r6)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r11.f281048i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L_0x022a
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r11.f281048i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8 = r0
            goto L_0x022b
        L_0x022a:
            r8 = -1
        L_0x022b:
            r9.mo133869a()
            android.widget.TextView r0 = r9.f281079d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r43)
            r0.setTag(r6)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r0 = r9.f281100B
            r6 = 0
            r0.settouchEnable(r6)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r0 = r9.f281100B
            r0.setBackgroundResource(r6)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r0 = r9.f281100B
            r7 = 131072(0x20000, float:1.83671E-40)
            r0.setDescendantFocusability(r7)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r0 = r9.f281100B
            r0.setClickable(r6)
            boolean r0 = r11.f281039I
            if (r0 == 0) goto L_0x0262
            android.view.View r0 = r9.f281111t
            r6 = 1
            r0.setClickable(r6)
            android.view.View r0 = r9.f281111t
            com.tencent.mm.plugin.sns.ui.r5$$s r7 = r11.f281053q
            android.view.View$OnClickListener r7 = r7.f281130g
            r0.setOnClickListener(r7)
            goto L_0x0263
        L_0x0262:
            r6 = 1
        L_0x0263:
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r9.f281102k
            r0.settouchEnable(r6)
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r9.f281102k
            r0.setClickable(r6)
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r9.f281102k
            r6 = 0
            r0.setLongClickable(r6)
            com.tencent.mm.ui.widget.QFadeImageView r0 = r9.f281104m
            r0.setLongClickable(r6)
            com.tencent.mm.ui.widget.QFadeImageView r0 = r9.f281105n
            r0.setLongClickable(r6)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r0 = r9.f281100B
            r0.setOnClickListener(r1)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r0 = r9.f281100B
            r0.setOnLongClickListener(r1)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r0 = r9.f281100B
            r0.setLongClickable(r6)
            int r0 = r11.f281052p
            if (r8 >= r0) goto L_0x06b7
            r0 = -1
            if (r8 != r0) goto L_0x0295
            goto L_0x06b7
        L_0x0295:
            int r0 = r8 + -1
            if (r0 < 0) goto L_0x02ae
            java.lang.Object r0 = r11.getItem(r0)
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r0
            int r1 = r0.getHead()
            int r0 = r0.getLocalPrivate()
            boolean r6 = r11.f281054r
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120371i(r0, r6)
            goto L_0x02b0
        L_0x02ae:
            r0 = 0
            r1 = -1
        L_0x02b0:
            android.widget.AbsListView$LayoutParams r6 = new android.widget.AbsListView$LayoutParams
            r44 = r0
            r0 = -1
            r7 = -2
            r6.<init>(r0, r7)
            r10.setLayoutParams(r6)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r0.mo10233c(r4)
            java.lang.Object[] r31 = r0.mo10232b()
            java.lang.String r32 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r33 = "createViewPhotos"
            java.lang.String r34 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            r30 = r10
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)
            r6 = 0
            java.lang.Object r0 = r0.mo10231a(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r10.setVisibility(r0)
            java.lang.String r31 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r32 = "createViewPhotos"
            java.lang.String r33 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            j20.C117292a.m165359e(r30, r31, r32, r33, r34, r35, r36)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r11.f281049j
            java.lang.Integer r6 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L_0x031c
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r11.f281049j
            java.lang.Integer r6 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7 = r0
            goto L_0x031d
        L_0x031c:
            r7 = 1
        L_0x031d:
            java.lang.Object r0 = r11.getItem(r8)
            r6 = r0
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r6
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r6.getTimeLine()
            r17 = r0
            boolean r0 = r11.f281054r
            if (r0 == 0) goto L_0x0330
            if (r12 == 0) goto L_0x0344
        L_0x0330:
            r0 = -1
            if (r1 == r0) goto L_0x0344
            int r0 = r6.getHead()
            if (r0 == r1) goto L_0x033a
            goto L_0x0344
        L_0x033a:
            r18 = r1
            r19 = r10
            r38 = r13
            r13 = r44
            goto L_0x03c0
        L_0x0344:
            r18 = r1
            long r0 = r6.field_snsId
            boolean r0 = r11.mo133846j(r12, r0)
            if (r0 == 0) goto L_0x035f
            int r0 = r6.getCreateTime()
            long r0 = (long) r0
            r19 = r10
            android.widget.TextView r10 = r9.f281077b
            r38 = r13
            android.widget.TextView r13 = r9.f281078c
            r11.mo133845i(r10, r13, r0)
            goto L_0x0363
        L_0x035f:
            r19 = r10
            r38 = r13
        L_0x0363:
            int r0 = r6.getHead()
            com.tencent.mm.pointers.PInt r1 = new com.tencent.mm.pointers.PInt
            r1.<init>()
            java.lang.String r0 = r11.mo133856t(r8, r0, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0381
            android.widget.TextView r1 = r9.f281082g
            r1.setText(r0)
            android.widget.TextView r0 = r9.f281082g
            r1 = 0
            r0.setVisibility(r1)
        L_0x0381:
            android.view.View r0 = r9.f281084i
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r4)
            java.lang.Object[] r31 = r1.mo10232b()
            java.lang.String r32 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r33 = "createViewPhotos"
            java.lang.String r34 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            r30 = r0
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)
            r10 = 0
            java.lang.Object r1 = r1.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r31 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r32 = "createViewPhotos"
            java.lang.String r33 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            j20.C117292a.m165359e(r30, r31, r32, r33, r34, r35, r36)
            r13 = 0
        L_0x03c0:
            long r0 = r11.f281035E
            int r10 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            r20 = r7
            if (r10 == 0) goto L_0x03d6
            r10 = r8
            long r7 = r6.field_snsId
            int r21 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r21 != 0) goto L_0x03d7
            android.widget.LinearLayout r0 = r9.f281085j
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x03df
        L_0x03d6:
            r10 = r8
        L_0x03d7:
            r1 = 0
            android.widget.LinearLayout r0 = r9.f281085j
            r7 = 8
            r0.setVisibility(r7)
        L_0x03df:
            android.widget.LinearLayout r0 = r9.f281080e
            r0.setVisibility(r1)
            boolean r0 = r11.f281054r
            if (r0 == 0) goto L_0x0503
            if (r12 != 0) goto L_0x0503
            boolean r0 = r11.f281036F
            if (r0 == 0) goto L_0x03f4
            if (r0 == 0) goto L_0x0503
            boolean r0 = r11.f281037G
            if (r0 == 0) goto L_0x0503
        L_0x03f4:
            com.tencent.mm.ui.widget.QFadeImageView r0 = r9.f281103l
            r1 = 0
            r0.setVisibility(r1)
            com.tencent.mm.ui.widget.QFadeImageView r0 = r9.f281103l
            android.app.Activity r1 = r11.f281043d
            r6 = 2131837192(0x7f114108, float:1.9307572E38)
            java.lang.String r1 = r1.getString(r6)
            r0.setContentDescription(r1)
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r9.f281102k
            r1 = 8
            r0.setVisibility(r1)
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r9.f281106o
            int r1 = r11.f281051o
            r6 = 1
            if (r1 != r6) goto L_0x0420
            android.app.Activity r1 = r11.f281043d
            r6 = 2131837256(0x7f114148, float:1.9307702E38)
            java.lang.String r1 = r1.getString(r6)
            goto L_0x0421
        L_0x0420:
            r1 = r5
        L_0x0421:
            r0.mo104279b(r1)
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r9.f281106o
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r9.f281111t
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r4)
            java.lang.Object[] r24 = r1.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r26 = "createViewPhotos"
            java.lang.String r27 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r0
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r4 = 0
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r24 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r25 = "createViewPhotos"
            java.lang.String r26 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = r11.f281039I
            if (r0 == 0) goto L_0x04aa
            android.view.View r0 = r9.f281111t
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r3)
            java.lang.Object[] r24 = r1.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r26 = "createViewPhotos"
            java.lang.String r27 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r0
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r8 = 0
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r24 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r25 = "createViewPhotos"
            java.lang.String r26 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x04aa:
            android.widget.TextView r0 = r9.f281110s
            r1 = 8
            r0.setVisibility(r1)
            com.tencent.mm.plugin.sns.model.o r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.ui.widget.QFadeImageView r1 = r9.f281103l
            r3 = 2131101555(0x7f060773, float:1.7815523E38)
            r4 = 2131235002(0x7f0810ba, float:1.8086186E38)
            android.app.Activity r6 = r11.f281043d
            int r6 = r6.hashCode()
            r0.mo131095O(r1, r3, r4, r6)
            com.tencent.mm.plugin.sns.ui.r5$$s$i r0 = new com.tencent.mm.plugin.sns.ui.r5$$s$i
            r0.<init>()
            r1 = -1
            r0.f281142b = r1
            r0.f281141a = r1
            com.tencent.mm.ui.widget.QFadeImageView r1 = r9.f281103l
            r1.setTag(r0)
            android.widget.LinearLayout r0 = r9.f281083h
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r1 = r9.f281100B
            android.widget.TextView r3 = r9.f281078c
            java.lang.String r3 = r11.mo133857u(r3)
            com.tencent.mm.ui.widget.QFadeImageView r4 = r9.f281103l
            java.lang.CharSequence r4 = r4.getContentDescription()
            if (r4 == 0) goto L_0x04f1
            com.tencent.mm.ui.widget.QFadeImageView r4 = r9.f281103l
            java.lang.CharSequence r4 = r4.getContentDescription()
            java.lang.String r5 = r4.toString()
        L_0x04f1:
            r11.mo133834D(r0, r1, r3, r5)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r0 = r9.f281100B
            r7 = 2
            r0.setImportantForAccessibility(r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r14)
            r12 = r14
            r13 = r15
            r0 = r19
            goto L_0x070b
        L_0x0503:
            r7 = 2
            r8 = 0
            android.widget.TextView r0 = r9.f281079d
            int r1 = r6.getHead()
            r3 = r18
            r11.mo133847k(r0, r3, r1)
            r5 = r20
            r4 = 1
            if (r5 < r4) goto L_0x0560
            com.tencent.mm.plugin.sns.ui.MaskImageView r3 = r9.f281102k
            android.widget.TextView r1 = r9.f281107p
            android.widget.TextView r0 = r9.f281110s
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView r7 = r9.f281113v
            android.widget.TextView r8 = r9.f281116y
            r16 = 1
            r12 = r17
            r17 = r0
            r0 = r42
            r18 = r1
            r1 = r10
            r23 = r15
            r15 = r2
            r2 = r3
            r3 = r18
            r18 = 1
            r4 = r17
            r17 = r5
            r5 = r7
            r7 = r6
            r6 = r8
            r22 = r14
            r8 = r17
            r14 = r7
            r17 = r15
            r15 = 2
            r7 = r16
            r39 = r8
            r16 = 0
            r8 = r13
            r44 = r9
            r15 = r10
            r40 = r19
            r10 = r43
            r0.mo133833C(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            java.lang.Object r1 = r11.getItem(r15)
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r1
            r0.mo131370c(r1)
            r10 = r39
            goto L_0x056f
        L_0x0560:
            r44 = r9
            r22 = r14
            r23 = r15
            r12 = r17
            r40 = r19
            r17 = r2
            r14 = r6
            r15 = r10
            r10 = r5
        L_0x056f:
            r0 = 2
            if (r10 < r0) goto L_0x059f
            int r9 = r15 + 1
            r8 = r44
            com.tencent.mm.ui.widget.QFadeImageView r2 = r8.f281104m
            android.widget.TextView r3 = r8.f281108q
            android.widget.TextView r4 = r8.f281110s
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView r5 = r8.f281114w
            android.widget.TextView r6 = r8.f281117z
            r7 = 2
            r0 = r42
            r1 = r9
            r8 = r13
            r41 = r9
            r9 = r44
            r16 = r12
            r12 = r10
            r10 = r43
            r0.mo133833C(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r8 = r41
            java.lang.Object r1 = r11.getItem(r8)
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r1
            r0.mo131370c(r1)
            goto L_0x05a2
        L_0x059f:
            r16 = r12
            r12 = r10
        L_0x05a2:
            r0 = 3
            if (r12 < r0) goto L_0x05cd
            int r10 = r15 + 2
            r9 = r44
            com.tencent.mm.ui.widget.QFadeImageView r2 = r9.f281105n
            android.widget.TextView r3 = r9.f281109r
            android.widget.TextView r4 = r9.f281110s
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView r5 = r9.f281115x
            android.widget.TextView r6 = r9.f281099A
            r7 = 3
            r0 = r42
            r1 = r10
            r8 = r13
            r13 = r9
            r18 = r14
            r14 = r10
            r10 = r43
            r0.mo133833C(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            java.lang.Object r1 = r11.getItem(r14)
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r1
            r0.mo131370c(r1)
            goto L_0x05d1
        L_0x05cd:
            r13 = r44
            r18 = r14
        L_0x05d1:
            r6 = 1
            if (r12 != r6) goto L_0x0662
            java.lang.Object r0 = r11.getItem(r15)
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r0
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r0.getTimeLine()
            java.lang.String r1 = r1.ContentDesc
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0662
            int r1 = r0.getTypeFlag()
            if (r1 != r6) goto L_0x0662
            boolean r1 = r11.f281039I
            if (r1 != 0) goto L_0x0616
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r1 = r13.f281100B
            r7 = 393216(0x60000, float:5.51013E-40)
            r1.setDescendantFocusability(r7)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r1 = r13.f281100B
            r1.setClickable(r6)
            com.tencent.mm.plugin.sns.ui.MaskImageView r1 = r13.f281102k
            r14 = 0
            r1.setClickable(r14)
            com.tencent.mm.plugin.sns.ui.MaskImageView r1 = r13.f281102k
            r1.settouchEnable(r14)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r1 = r13.f281100B
            com.tencent.mm.plugin.sns.ui.r5$$s r2 = r11.f281053q
            android.view.View$OnClickListener r2 = r2.f281124a
            r1.setOnClickListener(r2)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r1 = r13.f281100B
            r1.settouchEnable(r6)
            goto L_0x0617
        L_0x0616:
            r14 = 0
        L_0x0617:
            r1 = r18
            int r1 = r1.localid
            com.tencent.mm.plugin.sns.ui.r5$$s$i r2 = new com.tencent.mm.plugin.sns.ui.r5$$s$i
            r2.<init>()
            r2.f281142b = r1
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r11.f281050n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r3)
            if (r1 == 0) goto L_0x0645
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r11.f281050n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.f281141a = r1
            goto L_0x0647
        L_0x0645:
            r2.f281141a = r14
        L_0x0647:
            boolean r1 = r0.isInValid()
            if (r1 == 0) goto L_0x065c
            boolean r0 = r0.isDieItem()
            if (r0 == 0) goto L_0x065c
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r0 = r13.f281100B
            com.tencent.mm.plugin.sns.ui.r5$$s r1 = r11.f281053q
            android.view.View$OnLongClickListener r1 = r1.f281131h
            r0.setOnLongClickListener(r1)
        L_0x065c:
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r0 = r13.f281100B
            r0.setTag(r2)
            goto L_0x0663
        L_0x0662:
            r14 = 0
        L_0x0663:
            r0 = r16
            te3.j00 r1 = r0.ContentObj
            if (r1 == 0) goto L_0x0676
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            if (r1 == 0) goto L_0x0676
            int r1 = r1.size()
            int r7 = java.lang.Math.max(r1, r12)
            goto L_0x0677
        L_0x0676:
            r7 = r12
        L_0x0677:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.ContentDesc
            r1.append(r0)
            java.lang.String r0 = "，"
            r1.append(r0)
            android.app.Activity r0 = r11.f281043d
            if (r7 <= r6) goto L_0x068f
            r2 = 2131824455(0x7f110f47, float:1.9281738E38)
            goto L_0x0692
        L_0x068f:
            r2 = 2131824454(0x7f110f46, float:1.9281736E38)
        L_0x0692:
            java.lang.String r0 = r0.getString(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.LinearLayout r1 = r13.f281083h
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r2 = r13.f281100B
            android.widget.TextView r3 = r13.f281078c
            java.lang.String r3 = r11.mo133857u(r3)
            r11.mo133834D(r1, r2, r3, r0)
            r0 = r40
            r0.setDrawingCacheEnabled(r14)
            r1 = r17
            r12 = r22
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
            goto L_0x0709
        L_0x06b7:
            r1 = r2
            r0 = r10
            r38 = r13
            r12 = r14
            r23 = r15
            r6 = 1
            r14 = 0
            android.widget.AbsListView$LayoutParams r2 = new android.widget.AbsListView$LayoutParams
            r4 = -1
            r2.<init>(r4, r6)
            r0.setLayoutParams(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r2.mo10233c(r3)
            java.lang.Object[] r31 = r2.mo10232b()
            java.lang.String r32 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r33 = "createViewPhotos"
            java.lang.String r34 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            r30 = r0
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)
            java.lang.Object r2 = r2.mo10231a(r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r31 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r32 = "createViewPhotos"
            java.lang.String r33 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            j20.C117292a.m165359e(r30, r31, r32, r33, r34, r35, r36)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
        L_0x0709:
            r13 = r23
        L_0x070b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            r10 = r0
            goto L_0x0c4b
        L_0x0711:
            r38 = r13
            r12 = r14
            r13 = r15
            r6 = 1
            r7 = 393216(0x60000, float:5.51013E-40)
            r14 = 0
            r7 = 2
            if (r0 != r7) goto L_0x0c40
            java.lang.String r0 = "createViewSight"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r12)
            if (r44 == 0) goto L_0x073c
            java.lang.Object r7 = r44.getTag()
            if (r7 == 0) goto L_0x073c
            java.lang.Object r7 = r44.getTag()
            boolean r7 = r7 instanceof com.tencent.p014mm.plugin.sns.p106ui.r5$$r
            if (r7 != 0) goto L_0x0732
            goto L_0x073c
        L_0x0732:
            java.lang.Object r7 = r44.getTag()
            com.tencent.mm.plugin.sns.ui.r5$$r r7 = (com.tencent.p014mm.plugin.sns.p106ui.r5$$r) r7
            r6 = r44
            goto L_0x07fd
        L_0x073c:
            com.tencent.mm.plugin.sns.ui.r5$$r r7 = new com.tencent.mm.plugin.sns.ui.r5$$r
            r7.<init>(r11)
            android.app.Activity r15 = r11.f281043d
            android.view.LayoutInflater r15 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r15)
            r6 = 2131497725(0x7f0c12fd, float:1.8619051E38)
            android.view.View r6 = r15.inflate(r6, r1)
            android.view.View r9 = r6.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r7.f281078c = r9
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.f281077b = r8
            android.view.View r8 = r6.findViewById(r10)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.f281079d = r8
            r8 = 2131306363(0x7f09277b, float:1.8230923E38)
            android.view.View r8 = r6.findViewById(r8)
            com.tencent.mm.plugin.sns.ui.MaskImageView r8 = (com.tencent.p014mm.plugin.sns.p106ui.MaskImageView) r8
            r7.f281118k = r8
            r8 = 2131296700(0x7f0901bc, float:1.8211324E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.f281082g = r8
            r8 = 2131307300(0x7f092b24, float:1.8232823E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r7.f281080e = r8
            r8 = 2131308104(0x7f092e48, float:1.8234454E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r7.f281081f = r8
            r8 = 2131307364(0x7f092b64, float:1.8232953E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r7.f281083h = r8
            r8 = 2131307299(0x7f092b23, float:1.8232821E38)
            android.view.View r8 = r6.findViewById(r8)
            r7.f281084i = r8
            com.tencent.mm.plugin.sns.ui.MaskImageView r8 = r7.f281118k
            com.tencent.mm.plugin.sns.ui.r5$$s r9 = r11.f281053q
            android.view.View$OnClickListener r9 = r9.f281129f
            r8.setOnClickListener(r9)
            r8 = 2131314317(0x7f09468d, float:1.8247056E38)
            android.view.View r8 = r6.findViewById(r8)
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView r8 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView) r8
            r7.f281122o = r8
            r8 = 2131314031(0x7f09456f, float:1.8246476E38)
            android.view.View r8 = r6.findViewById(r8)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r8 = (com.tencent.p014mm.plugin.sns.p106ui.MaskLinearLayout) r8
            r7.f281119l = r8
            com.tencent.mm.plugin.sns.ui.MaskImageView r9 = r7.f281118k
            r8.mo132235b(r9)
            r8 = 2131300828(0x7f0911dc, float:1.8219697E38)
            android.view.View r8 = r6.findViewById(r8)
            com.tencent.mm.ui.widget.MMNeat7extView r8 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r8
            r7.f281120m = r8
            r8 = 2131300844(0x7f0911ec, float:1.821973E38)
            android.view.View r8 = r6.findViewById(r8)
            r7.f281121n = r8
            r8 = 2131305226(0x7f09230a, float:1.8228617E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r7.f281085j = r8
            r8 = 2131314055(0x7f094587, float:1.8246524E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            com.tencent.mm.plugin.sns.ui.s5 r9 = new com.tencent.mm.plugin.sns.ui.s5
            r9.<init>(r11)
            r8.setOnClickListener(r9)
            r6.setTag(r7)
        L_0x07fd:
            com.tencent.mm.plugin.sns.model.o r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.MaskImageView r9 = r7.f281118k
            r8.mo131091K(r9)
            java.util.Map<java.lang.Integer, java.lang.Integer> r8 = r11.f281048i
            java.lang.Integer r9 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r8 = r8.get(r9)
            if (r8 == 0) goto L_0x0827
            java.util.Map<java.lang.Integer, java.lang.Integer> r8 = r11.f281048i
            java.lang.Integer r9 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x0828
        L_0x0827:
            r8 = -1
        L_0x0828:
            r7.mo133869a()
            android.widget.TextView r9 = r7.f281079d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r43)
            r9.setTag(r10)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r9 = r7.f281119l
            r9.settouchEnable(r14)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r9 = r7.f281119l
            r9.setBackgroundResource(r14)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r9 = r7.f281119l
            r10 = 131072(0x20000, float:1.83671E-40)
            r9.setDescendantFocusability(r10)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r9 = r7.f281119l
            r9.setClickable(r14)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r9 = r7.f281119l
            r9.setOnClickListener(r1)
            boolean r1 = r11.f281039I
            if (r1 == 0) goto L_0x0863
            android.view.View r1 = r7.f281121n
            r9 = 1
            r1.setClickable(r9)
            android.view.View r1 = r7.f281121n
            com.tencent.mm.plugin.sns.ui.r5$$s r10 = r11.f281053q
            android.view.View$OnClickListener r10 = r10.f281130g
            r1.setOnClickListener(r10)
            goto L_0x0864
        L_0x0863:
            r9 = 1
        L_0x0864:
            com.tencent.mm.plugin.sns.ui.MaskImageView r1 = r7.f281118k
            r1.settouchEnable(r9)
            com.tencent.mm.plugin.sns.ui.MaskImageView r1 = r7.f281118k
            r1.setClickable(r9)
            int r1 = r11.f281052p
            if (r8 >= r1) goto L_0x0bec
            r1 = -1
            if (r8 != r1) goto L_0x0877
            goto L_0x0bec
        L_0x0877:
            int r1 = r8 + -1
            if (r1 < 0) goto L_0x088f
            java.lang.Object r1 = r11.getItem(r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r1
            int r3 = r1.getHead()
            int r1 = r1.getLocalPrivate()
            boolean r9 = r11.f281054r
            com.tencent.p014mm.plugin.sns.model.C94897n1.m120371i(r1, r9)
            goto L_0x0890
        L_0x088f:
            r3 = -1
        L_0x0890:
            android.widget.AbsListView$LayoutParams r1 = new android.widget.AbsListView$LayoutParams
            r9 = -2
            r10 = -1
            r1.<init>(r10, r9)
            r6.setLayoutParams(r1)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r1.mo10233c(r4)
            java.lang.Object[] r31 = r1.mo10232b()
            java.lang.String r32 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r33 = "createViewSight"
            java.lang.String r34 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            r30 = r6
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6.setVisibility(r1)
            java.lang.String r31 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r32 = "createViewSight"
            java.lang.String r33 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            j20.C117292a.m165359e(r30, r31, r32, r33, r34, r35, r36)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r11.f281049j
            java.lang.Integer r9 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r9)
            if (r1 == 0) goto L_0x08f6
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r11.f281049j
            java.lang.Integer r9 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.intValue()
        L_0x08f6:
            java.lang.Object r1 = r11.getItem(r8)
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r1
            com.tencent.mm.protocal.protobuf.TimeLineObject r9 = r1.getTimeLine()
            boolean r10 = r11.f281054r
            if (r10 == 0) goto L_0x0909
            r10 = r43
            if (r10 == 0) goto L_0x0918
            goto L_0x090b
        L_0x0909:
            r10 = r43
        L_0x090b:
            r15 = -1
            if (r3 == r15) goto L_0x0918
            int r15 = r1.getHead()
            if (r15 == r3) goto L_0x0915
            goto L_0x0918
        L_0x0915:
            r23 = r13
            goto L_0x098d
        L_0x0918:
            long r14 = r1.field_snsId
            boolean r14 = r11.mo133846j(r10, r14)
            if (r14 == 0) goto L_0x092f
            int r14 = r1.getCreateTime()
            long r14 = (long) r14
            android.widget.TextView r10 = r7.f281077b
            r23 = r13
            android.widget.TextView r13 = r7.f281078c
            r11.mo133845i(r10, r13, r14)
            goto L_0x0931
        L_0x092f:
            r23 = r13
        L_0x0931:
            int r10 = r1.getHead()
            com.tencent.mm.pointers.PInt r13 = new com.tencent.mm.pointers.PInt
            r13.<init>()
            java.lang.String r10 = r11.mo133856t(r8, r10, r13)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r13 != 0) goto L_0x094f
            android.widget.TextView r13 = r7.f281082g
            r13.setText(r10)
            android.widget.TextView r10 = r7.f281082g
            r13 = 0
            r10.setVisibility(r13)
        L_0x094f:
            android.view.View r10 = r7.f281084i
            k20.a r13 = new k20.a
            r13.<init>()
            r13.mo10233c(r4)
            java.lang.Object[] r31 = r13.mo10232b()
            java.lang.String r32 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r33 = "createViewSight"
            java.lang.String r34 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            r30 = r10
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)
            r14 = 0
            java.lang.Object r13 = r13.mo10231a(r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r10.setVisibility(r13)
            java.lang.String r31 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r32 = "createViewSight"
            java.lang.String r33 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            j20.C117292a.m165359e(r30, r31, r32, r33, r34, r35, r36)
        L_0x098d:
            android.widget.TextView r10 = r7.f281079d
            int r13 = r1.getHead()
            r11.mo133847k(r10, r3, r13)
            long r13 = r11.f281035E
            int r3 = (r13 > r28 ? 1 : (r13 == r28 ? 0 : -1))
            if (r3 == 0) goto L_0x09aa
            r10 = r2
            long r2 = r1.field_snsId
            int r15 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x09ab
            android.widget.LinearLayout r2 = r7.f281085j
            r3 = 0
            r2.setVisibility(r3)
            goto L_0x09b3
        L_0x09aa:
            r10 = r2
        L_0x09ab:
            r3 = 0
            android.widget.LinearLayout r2 = r7.f281085j
            r13 = 8
            r2.setVisibility(r13)
        L_0x09b3:
            android.widget.LinearLayout r2 = r7.f281080e
            r2.setVisibility(r3)
            com.tencent.mm.storage.o3 r2 = new com.tencent.mm.storage.o3
            com.tencent.mm.storage.o3 r13 = r11.f281045f
            java.lang.String r13 = r13.f284144a
            r2.<init>(r13)
            int r13 = r1.field_createTime
            r2.f284145b = r13
            com.tencent.mm.plugin.sns.ui.MaskImageView r13 = r7.f281118k
            r13.setVisibility(r3)
            com.tencent.mm.plugin.sns.model.o r24 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r25 = r1.getSnsId()
            te3.j00 r3 = r9.ContentObj
            java.util.LinkedList<te3.kv2> r3 = r3.f298427h
            com.tencent.mm.plugin.sns.ui.MaskImageView r13 = r7.f281118k
            android.app.Activity r14 = r11.f281043d
            int r28 = r14.hashCode()
            com.tencent.mm.plugin.sns.model.o$h r29 = com.tencent.p014mm.plugin.sns.model.C94901o.C94911h.IMG_SCENE_SNSUSER
            r24.getClass()
            java.lang.String r14 = "setSnsGridList"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            r31 = 0
            r26 = r3
            r27 = r13
            r30 = r2
            r24.mo131107a0(r25, r26, r27, r28, r29, r30, r31)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
            java.lang.Object r2 = r11.getItem(r8)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r2
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r11.mo133854r(r2, r8)
            if (r3 == 0) goto L_0x0a06
            r2 = r3
        L_0x0a06:
            com.tencent.mm.protocal.protobuf.SnsObject r3 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120368f(r2)
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r2.getTimeLine()
            java.lang.String r8 = r8.ContentDesc
            if (r8 == 0) goto L_0x0a76
            boolean r5 = r8.equals(r5)
            if (r5 != 0) goto L_0x0a76
            android.view.View r5 = r7.f281121n
            k20.a r13 = new k20.a
            r13.<init>()
            r13.mo10233c(r4)
            java.lang.Object[] r25 = r13.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r27 = "createViewSight"
            java.lang.String r28 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r5
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r4 = 0
            java.lang.Object r13 = r13.mo10231a(r4)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r4 = r13.intValue()
            r5.setVisibility(r4)
            java.lang.String r25 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r26 = "createViewSight"
            java.lang.String r27 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r7.f281120m
            r5 = 0
            r4.setVisibility(r5)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r7.f281120m
            java.lang.Class<ny.h> r5 = p629ny.C76979h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ny.h r5 = (p629ny.C76979h) r5
            android.app.Activity r13 = r11.f281043d
            com.tencent.mm.ui.widget.MMNeat7extView r14 = r7.f281120m
            float r14 = r14.getTextSize()
            android.text.SpannableString r5 = r5.yp0(r13, r8, r14)
            r4.mo104279b(r5)
            goto L_0x0abe
        L_0x0a76:
            boolean r5 = r11.f281039I
            if (r5 == 0) goto L_0x0abe
            android.view.View r5 = r7.f281121n
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r4)
            java.lang.Object[] r25 = r8.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r27 = "createViewSight"
            java.lang.String r28 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r5
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r4 = 0
            java.lang.Object r8 = r8.mo10231a(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r4 = r8.intValue()
            r5.setVisibility(r4)
            java.lang.String r25 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r26 = "createViewSight"
            java.lang.String r27 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r7.f281120m
            r5 = 4
            r4.setVisibility(r5)
        L_0x0abe:
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r4 = r7.f281119l
            r5 = 393216(0x60000, float:5.51013E-40)
            r4.setDescendantFocusability(r5)
            com.tencent.mm.plugin.sns.ui.MaskImageView r4 = r7.f281118k
            r5 = 0
            r4.setClickable(r5)
            com.tencent.mm.plugin.sns.ui.MaskImageView r4 = r7.f281118k
            r4.settouchEnable(r5)
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView r4 = r7.f281122o
            java.lang.String r5 = "setGroupIcon"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r12)
            vr2.b0$a r8 = vr2.C65874b0.f189421a
            int r13 = r3.ExtFlag
            boolean r13 = r8.mo89923b(r13)
            boolean r14 = r11.f281054r
            if (r14 == 0) goto L_0x0afd
            if (r13 == 0) goto L_0x0afd
            java.lang.String r14 = r11.f281044e
            if (r14 == 0) goto L_0x0afd
            java.lang.String r15 = r2.getUserName()
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0afd
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$a r14 = com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView.C5485a.Group
            r4.mo6500a(r14)
            r14 = 0
            r4.setVisibility(r14)
        L_0x0afd:
            int r14 = r2.getLocalPrivate()
            boolean r15 = r11.f281054r
            boolean r14 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120371i(r14, r15)
            if (r14 == 0) goto L_0x0b14
            com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView$a r14 = com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView.C5485a.Private
            r4.mo6500a(r14)
            r14 = 0
            r4.setVisibility(r14)
            r4 = 1
            goto L_0x0b16
        L_0x0b14:
            r14 = 0
            r4 = 0
        L_0x0b16:
            r15 = 1
            r8.mo89928g(r10, r3, r15)
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r8[r14] = r13
            java.lang.String r13 = r2.getSnsId()
            r8[r15] = r13
            int r13 = r2.localid
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 2
            r8[r14] = r13
            long r13 = r3.f283891Id
            java.lang.String r3 = java.lang.String.valueOf(r13)
            r13 = 3
            r8[r13] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r4 = 4
            r8[r4] = r3
            java.lang.String r3 = "setGroupIcon: isShowGroup:%b, snsId:%s, localId:%d, snsObjectId:%s, isShowPrivateIcon:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r12)
            int r1 = r1.localid
            com.tencent.mm.plugin.sns.ui.r5$$s$i r3 = new com.tencent.mm.plugin.sns.ui.r5$$s$i
            r3.<init>()
            r3.f281142b = r1
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r11.f281050n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L_0x0b77
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r11.f281050n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r43)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.f281141a = r1
            goto L_0x0b7a
        L_0x0b77:
            r1 = 0
            r3.f281141a = r1
        L_0x0b7a:
            boolean r1 = r11.f281039I
            if (r1 == 0) goto L_0x0b94
            com.tencent.mm.plugin.sns.ui.MaskImageView r1 = r7.f281118k
            r4 = 1
            r1.setClickable(r4)
            com.tencent.mm.plugin.sns.ui.MaskImageView r1 = r7.f281118k
            r1.settouchEnable(r4)
            com.tencent.mm.plugin.sns.ui.MaskImageView r1 = r7.f281118k
            r1.setTag(r3)
            android.view.View r1 = r7.f281121n
            r1.setTag(r3)
            goto L_0x0bad
        L_0x0b94:
            r4 = 1
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r1 = r7.f281119l
            r1.setClickable(r4)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r1 = r7.f281119l
            com.tencent.mm.plugin.sns.ui.r5$$s r5 = r11.f281053q
            android.view.View$OnClickListener r5 = r5.f281129f
            r1.setOnClickListener(r5)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r1 = r7.f281119l
            r1.settouchEnable(r4)
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r1 = r7.f281119l
            r1.setTag(r3)
        L_0x0bad:
            r1 = 0
            r6.setDrawingCacheEnabled(r1)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r1 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r1.mo131370c(r2)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r7.f281120m
            r2 = 2
            r1.setImportantForAccessibility(r2)
            android.widget.LinearLayout r1 = r7.f281083h
            com.tencent.mm.plugin.sns.ui.MaskLinearLayout r2 = r7.f281119l
            android.widget.TextView r3 = r7.f281078c
            java.lang.String r3 = r11.mo133857u(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r9.ContentDesc
            r4.append(r5)
            java.lang.String r5 = ","
            r4.append(r5)
            android.app.Activity r5 = r11.f281043d
            r7 = 2131824456(0x7f110f48, float:1.928174E38)
            java.lang.String r5 = r5.getString(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r11.mo133834D(r1, r2, r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
            goto L_0x0c39
        L_0x0bec:
            r23 = r13
            android.widget.AbsListView$LayoutParams r1 = new android.widget.AbsListView$LayoutParams
            r2 = -1
            r4 = 1
            r1.<init>(r2, r4)
            r6.setLayoutParams(r1)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r1.mo10233c(r3)
            java.lang.Object[] r31 = r1.mo10232b()
            java.lang.String r32 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r33 = "createViewSight"
            java.lang.String r34 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            r30 = r6
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6.setVisibility(r1)
            java.lang.String r31 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r32 = "createViewSight"
            java.lang.String r33 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            j20.C117292a.m165359e(r30, r31, r32, r33, r34, r35, r36)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
        L_0x0c39:
            r1 = r23
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
            r10 = r6
            goto L_0x0c4b
        L_0x0c40:
            r1 = r13
            r2 = 3
            if (r0 != r2) goto L_0x0c4e
            android.view.View r10 = r42.mo133849n(r43, r44)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
        L_0x0c4b:
            r0 = r38
            goto L_0x0c77
        L_0x0c4e:
            r2 = 4
            if (r0 != r2) goto L_0x0c59
            android.view.View r10 = r42.mo133848l(r43, r44)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
            goto L_0x0c4b
        L_0x0c59:
            r2 = 5
            if (r0 != r2) goto L_0x0c64
            android.view.View r10 = r42.mo133851o(r43, r44)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
            goto L_0x0c4b
        L_0x0c64:
            r2 = 6
            if (r0 != r2) goto L_0x0c6f
            android.view.View r10 = r42.mo133852p(r43, r44)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
            goto L_0x0c4b
        L_0x0c6f:
            android.view.View r10 = r42.mo133853q(r43, r44)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r12)
            goto L_0x0c4b
        L_0x0c77:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96198r5.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        SnsMethodCalculate.markStartTimeMs("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        SnsMethodCalculate.markEndTimeMs("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return 7;
    }

    /* renamed from: h */
    public final void mo133844h(TextView textView) {
        SnsMethodCalculate.markStartTimeMs("calculateYearHeight", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (this.f281038H <= 0) {
            textView.post(new r5$$h(this, textView));
        }
        SnsMethodCalculate.markEndTimeMs("calculateYearHeight", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133845i(android.widget.TextView r24, android.widget.TextView r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.String r3 = "cerateTimeView"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            android.app.Activity r5 = r0.f281043d
            r6 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r26
            java.lang.String r8 = r0.f281031A
            java.lang.String r9 = "en"
            boolean r8 = r8.equals(r9)
            r9 = 1
            r8 = r8 ^ r9
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.f281690a
            java.lang.String r10 = "formatTimeInGrid"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.SnsTimeUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.util.GregorianCalendar r12 = new java.util.GregorianCalendar
            r12.<init>()
            r13 = 3600000(0x36ee80, double:1.7786363E-317)
            java.lang.String r15 = ""
            r9 = 2
            int r16 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x003c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            r16 = r3
            r3 = r15
            goto L_0x00a4
        L_0x003c:
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar
            r16 = r3
            r14 = 1
            int r3 = r12.get(r14)
            int r14 = r12.get(r9)
            r9 = 5
            int r9 = r12.get(r9)
            r13.<init>(r3, r14, r9)
            long r17 = r13.getTimeInMillis()
            long r17 = r6 - r17
            r19 = 0
            r21 = 86400000(0x5265c00, double:4.2687272E-316)
            int r3 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            int r3 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r3 > 0) goto L_0x0071
            if (r8 == 0) goto L_0x0071
            r3 = 2131830360(0x7f112658, float:1.9293715E38)
            java.lang.String r3 = r5.getString(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            goto L_0x00a4
        L_0x0071:
            long r12 = r13.getTimeInMillis()
            long r12 = r6 - r12
            long r12 = r12 + r21
            int r3 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x008e
            int r3 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r3 > 0) goto L_0x008e
            if (r8 == 0) goto L_0x008e
            r3 = 2131830369(0x7f112661, float:1.9293733E38)
            java.lang.String r3 = r5.getString(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            goto L_0x00a4
        L_0x008e:
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar
            r3.<init>()
            r3.setTimeInMillis(r6)
            r3 = 2131830312(0x7f112628, float:1.9293618E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.CharSequence r3 = android.text.format.DateFormat.format(r3, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
        L_0x00a4:
            java.lang.String r3 = (java.lang.String) r3
            android.view.ViewParent r5 = r25.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.app.Activity r5 = r0.f281043d
            r6 = 2131165558(0x7f070176, float:1.7945337E38)
            int r5 = kg3.C76577a.m92155f(r5, r6)
            float r5 = (float) r5
            r6 = 0
            r2.setTextSize(r6, r5)
            android.app.Activity r5 = r0.f281043d
            r7 = 2131165261(0x7f07004d, float:1.7944734E38)
            int r5 = kg3.C76577a.m92155f(r5, r7)
            float r5 = (float) r5
            r1.setTextSize(r6, r5)
            java.lang.String r5 = ":"
            int r7 = r3.indexOf(r5)
            java.lang.String r8 = "0"
            r9 = 2131836842(0x7f113faa, float:1.9306862E38)
            if (r7 <= 0) goto L_0x0123
            java.lang.String[] r3 = r3.split(r5)
            r5 = 1
            r7 = r3[r5]
            int r7 = r7.length()
            r10 = 2
            if (r7 >= r10) goto L_0x00f5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            r8 = r3[r5]
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r3[r5] = r7
        L_0x00f5:
            r7 = r3[r6]
            r1.setText(r7)
            r7 = r3[r5]
            r2.setText(r7)
            r2.setVisibility(r6)
            r1.setVisibility(r6)
            android.app.Activity r1 = r0.f281043d
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r9)
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = r3[r6]
            r7[r6] = r8
            r3 = r3[r5]
            r7[r5] = r3
            java.lang.String r1 = java.lang.String.format(r1, r7)
            r2.setContentDescription(r1)
            goto L_0x0200
        L_0x0123:
            r5 = 1
            java.lang.String r7 = "/"
            int r10 = r3.indexOf(r7)
            if (r10 <= 0) goto L_0x01d9
            java.lang.String[] r3 = r3.split(r7)
            r7 = r3[r5]
            int r7 = r7.length()
            r10 = 2
            if (r7 >= r10) goto L_0x014c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            r8 = r3[r5]
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r3[r5] = r7
        L_0x014c:
            android.app.Activity r5 = r0.f281043d
            r7 = r3[r6]
            java.lang.String r8 = r0.f281031A
            java.lang.String r10 = "getMonth"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.f281690a
            java.util.HashMap r12 = (java.util.HashMap) r12
            java.lang.Object r12 = r12.get(r8)
            if (r12 != 0) goto L_0x0164
            com.tencent.p014mm.plugin.sns.p106ui.C96315x6.m123541g(r5, r8)
        L_0x0164:
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r6)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.f281690a
            java.util.HashMap r12 = (java.util.HashMap) r12
            java.lang.Object r12 = r12.get(r8)
            java.util.List r12 = (java.util.List) r12
            int r13 = r12.size()
            if (r7 >= r13) goto L_0x018a
            java.lang.Object r13 = r12.get(r7)
            if (r13 == 0) goto L_0x018a
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto L_0x018d
        L_0x018a:
            com.tencent.p014mm.plugin.sns.p106ui.C96315x6.m123541g(r5, r8)
        L_0x018d:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.f281690a
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r8)
            java.util.List r5 = (java.util.List) r5
            int r8 = r5.size()
            if (r7 >= r8) goto L_0x01a8
            java.lang.Object r5 = r5.get(r7)
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            goto L_0x01ab
        L_0x01a8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
        L_0x01ab:
            r3[r6] = r15
            r1.setText(r15)
            r5 = 1
            r7 = r3[r5]
            r2.setText(r7)
            r2.setVisibility(r6)
            r1.setVisibility(r6)
            android.app.Activity r1 = r0.f281043d
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r9)
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = r3[r6]
            r7[r6] = r8
            r3 = r3[r5]
            r7[r5] = r3
            java.lang.String r1 = java.lang.String.format(r1, r7)
            r2.setContentDescription(r1)
            goto L_0x0200
        L_0x01d9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r2.setContentDescription(r1)
            r2.setVisibility(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r2.setText(r1)
        L_0x0200:
            r1 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96198r5.mo133845i(android.widget.TextView, android.widget.TextView, long):void");
    }

    /* renamed from: j */
    public final boolean mo133846j(int i, long j) {
        SnsMethodCalculate.markStartTimeMs("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z = true;
        if (this.f281036F) {
            if (!(i == 0 && this.f281057u == j) && i <= 0 && !this.f281037G) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return true;
    }

    /* renamed from: k */
    public final void mo133847k(TextView textView, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("checkYearTvView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        int i3 = i / 10000;
        int i4 = i2 / 10000;
        mo133844h(textView);
        Log.m105919d("MicroMsg.SnsphotoAdapter", "preHead: %d, preYear: %d", Integer.valueOf(i), Integer.valueOf(i3));
        if (this.f281036F) {
            if (!(i3 == 0 || i4 == i3)) {
                mo133832B(textView);
                textView.setText(String.format(this.f281043d.getResources().getString(C0966R.string.f361397jk1), new Object[]{Integer.valueOf(i4)}));
                textView.setVisibility(0);
                mo133844h(textView);
            }
        } else if (i3 == 0) {
            if (C96315x6.m123540f() != i4) {
                mo133832B(textView);
                textView.setText(String.format(this.f281043d.getResources().getString(C0966R.string.f361397jk1), new Object[]{Integer.valueOf(i4)}));
                textView.setVisibility(0);
                mo133844h(textView);
            }
        } else if (i4 != i3) {
            mo133832B(textView);
            textView.setText(String.format(this.f281043d.getResources().getString(C0966R.string.f361397jk1), new Object[]{Integer.valueOf(i4)}));
            textView.setVisibility(0);
            mo133844h(textView);
        }
        SnsMethodCalculate.markEndTimeMs("checkYearTvView", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0680, code lost:
        if (r5 == 2) goto L_0x0686;
     */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0788  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x09b5  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x09c5  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x09d2  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0a00  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo133848l(int r35, android.view.View r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            com.tencent.mm.ui.widget.QImageView$a r2 = com.tencent.p014mm.p136ui.widget.QImageView.C97274a.CENTER_CROP
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            com.tencent.mm.plugin.sns.model.o$h r12 = com.tencent.p014mm.plugin.sns.model.C94901o.C94911h.IMG_SCENE_SNSUSER
            java.lang.String r13 = "createViewFinderFeed"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            if (r36 == 0) goto L_0x002f
            java.lang.Object r5 = r36.getTag()
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r36.getTag()
            boolean r5 = r5 instanceof com.tencent.p014mm.plugin.sns.p106ui.r5$$o
            if (r5 != 0) goto L_0x0024
            goto L_0x002f
        L_0x0024:
            java.lang.Object r5 = r36.getTag()
            com.tencent.mm.plugin.sns.ui.r5$$o r5 = (com.tencent.p014mm.plugin.sns.p106ui.r5$$o) r5
            r11 = r36
            r10 = r5
            goto L_0x0125
        L_0x002f:
            com.tencent.mm.plugin.sns.ui.r5$$o r5 = new com.tencent.mm.plugin.sns.ui.r5$$o
            r5.<init>(r0)
            android.app.Activity r6 = r0.f281043d
            android.view.LayoutInflater r6 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r6)
            r7 = 2131497703(0x7f0c12e7, float:1.8619007E38)
            r8 = 0
            android.view.View r6 = r6.inflate(r7, r8)
            r7 = 2131300403(0x7f091033, float:1.8218835E38)
            android.view.View r7 = r6.findViewById(r7)
            r5.f281076a = r7
            r7 = 2131313960(0x7f094528, float:1.8246332E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f281078c = r7
            r7 = 2131314041(0x7f094579, float:1.8246496E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f281077b = r7
            r7 = 2131314172(0x7f0945fc, float:1.8246762E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f281079d = r7
            r7 = 2131296700(0x7f0901bc, float:1.8211324E38)
            android.view.View r8 = r6.findViewById(r7)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r5.f281082g = r8
            r8 = 2131307299(0x7f092b23, float:1.8232821E38)
            android.view.View r8 = r6.findViewById(r8)
            r5.f281084i = r8
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f281082g = r7
            r7 = 2131307300(0x7f092b24, float:1.8232823E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r5.f281080e = r7
            r7 = 2131308104(0x7f092e48, float:1.8234454E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r5.f281081f = r7
            r7 = 2131307364(0x7f092b64, float:1.8232953E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r5.f281083h = r7
            r7 = 2131300854(0x7f0911f6, float:1.821975E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.ui.widget.MMNeat7extView r7 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r7
            r5.f281092k = r7
            r7 = 2131306309(0x7f092745, float:1.8230813E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.plugin.sns.ui.TagImageView r7 = (com.tencent.p014mm.plugin.sns.p106ui.TagImageView) r7
            r5.f281093l = r7
            r7 = 2131314316(0x7f09468c, float:1.8247054E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r5.f281095n = r7
            r7 = 2131315436(0x7f094aec, float:1.8249325E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f281096o = r7
            r7 = 2131312533(0x7f093f95, float:1.8243437E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f281097p = r7
            android.view.View r7 = r5.f281076a
            com.tencent.mm.plugin.sns.ui.r5$$s r8 = r0.f281053q
            android.view.View$OnClickListener r8 = r8.f281127d
            r7.setOnClickListener(r8)
            r7 = 2131309066(0x7f09320a, float:1.8236405E38)
            android.view.View r7 = r6.findViewById(r7)
            r5.f281098q = r7
            r7 = 2131300401(0x7f091031, float:1.821883E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f281094m = r7
            r7 = 2131305226(0x7f09230a, float:1.8228617E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r5.f281085j = r7
            r7 = 2131314055(0x7f094587, float:1.8246524E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            com.tencent.mm.plugin.sns.ui.r5$$k r8 = new com.tencent.mm.plugin.sns.ui.r5$$k
            r8.<init>(r0)
            r7.setOnClickListener(r8)
            r6.setTag(r5)
            com.tencent.mm.plugin.sns.ui.TagImageView r7 = r5.f281093l
            android.app.Activity r8 = r0.f281043d
            vr2.C102236a0.m134779x0(r7, r8)
            r10 = r5
            r11 = r6
        L_0x0125:
            android.widget.TextView r5 = r10.f281079d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r35)
            r5.setTag(r6)
            java.util.Map<java.lang.Integer, java.lang.Integer> r5 = r0.f281048i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r35)
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r6)
            r9 = -1
            if (r5 == 0) goto L_0x0150
            java.util.Map<java.lang.Integer, java.lang.Integer> r5 = r0.f281048i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r35)
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x0151
        L_0x0150:
            r5 = -1
        L_0x0151:
            r10.mo133869a()
            int r6 = r0.f281052p
            r15 = 0
            if (r5 >= r6) goto L_0x0a4e
            if (r5 != r9) goto L_0x015d
            goto L_0x0a4e
        L_0x015d:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r6.mo10233c(r7)
            java.lang.Object[] r16 = r6.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r18 = "createViewFinderFeed"
            java.lang.String r19 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r7 = 0
            r15 = r11
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r11.setVisibility(r6)
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r17 = "createViewFinderFeed"
            java.lang.String r18 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            int r6 = r5 + -1
            if (r6 < 0) goto L_0x01b7
            java.lang.Object r6 = r0.getItem(r6)
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r6
            int r15 = r6.getHead()
            int r6 = r6.getLocalPrivate()
            boolean r8 = r0.f281054r
            com.tencent.p014mm.plugin.sns.model.C94897n1.m120371i(r6, r8)
            r6 = r15
            goto L_0x01b8
        L_0x01b7:
            r6 = -1
        L_0x01b8:
            android.widget.AbsListView$LayoutParams r8 = new android.widget.AbsListView$LayoutParams
            r15 = -2
            r8.<init>(r9, r15)
            r11.setLayoutParams(r8)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            r8.mo10233c(r15)
            java.lang.Object[] r16 = r8.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r18 = "createViewFinderFeed"
            java.lang.String r19 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r11
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r8 = r8.mo10231a(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r11.setVisibility(r8)
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r17 = "createViewFinderFeed"
            java.lang.String r18 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r8 = r0.getItem(r5)
            r15 = r8
            com.tencent.mm.plugin.sns.storage.SnsInfo r15 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r15
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r15.getTimeLine()
            boolean r7 = r0.f281054r
            if (r7 == 0) goto L_0x0210
            if (r1 == 0) goto L_0x021e
        L_0x0210:
            if (r6 == r9) goto L_0x021e
            int r7 = r15.getHead()
            if (r7 == r6) goto L_0x0219
            goto L_0x021e
        L_0x0219:
            r17 = r4
            r7 = r10
            goto L_0x029f
        L_0x021e:
            r17 = r10
            long r9 = r15.field_snsId
            boolean r7 = r0.mo133846j(r1, r9)
            if (r7 == 0) goto L_0x0239
            int r7 = r15.getCreateTime()
            long r9 = (long) r7
            r7 = r17
            android.widget.TextView r1 = r7.f281077b
            r17 = r4
            android.widget.TextView r4 = r7.f281078c
            r0.mo133845i(r1, r4, r9)
            goto L_0x023d
        L_0x0239:
            r7 = r17
            r17 = r4
        L_0x023d:
            int r1 = r15.getHead()
            com.tencent.mm.pointers.PInt r4 = new com.tencent.mm.pointers.PInt
            r4.<init>()
            java.lang.String r1 = r0.mo133856t(r5, r1, r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x025c
            android.widget.TextView r4 = r7.f281082g
            r4.setText(r1)
            android.widget.TextView r1 = r7.f281082g
            r4 = 0
            r1.setVisibility(r4)
            goto L_0x025d
        L_0x025c:
            r4 = 0
        L_0x025d:
            android.view.View r1 = r7.f281084i
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r5.mo10233c(r9)
            java.lang.Object[] r24 = r5.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r26 = "createViewFinderFeed"
            java.lang.String r27 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r1
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r4 = 0
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = r5.intValue()
            r1.setVisibility(r4)
            java.lang.String r24 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r25 = "createViewFinderFeed"
            java.lang.String r26 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x029f:
            android.widget.TextView r1 = r7.f281079d
            int r4 = r15.getHead()
            r0.mo133847k(r1, r6, r4)
            long r4 = r0.f281035E
            r9 = 0
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x02bd
            long r9 = r15.field_snsId
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x02bd
            android.widget.LinearLayout r1 = r7.f281085j
            r4 = 0
            r1.setVisibility(r4)
            goto L_0x02c4
        L_0x02bd:
            android.widget.LinearLayout r1 = r7.f281085j
            r4 = 8
            r1.setVisibility(r4)
        L_0x02c4:
            com.tencent.mm.plugin.sns.ui.r5$$s$i r1 = new com.tencent.mm.plugin.sns.ui.r5$$s$i
            r1.<init>()
            int r4 = r15.localid
            r1.f281142b = r4
            java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r0.f281050n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r35)
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L_0x02f1
            java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r0.f281050n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r35)
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.f281141a = r4
            r4 = 0
            goto L_0x02f4
        L_0x02f1:
            r4 = 0
            r1.f281141a = r4
        L_0x02f4:
            android.view.View r5 = r7.f281076a
            r5.setTag(r1)
            java.lang.String r5 = r8.ContentDesc
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0320
            com.tencent.mm.ui.widget.MMNeat7extView r5 = r7.f281092k
            r5.setVisibility(r4)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r7.f281092k
            di3.d r5 = di3.C86312j.m106911c(r3)
            ny.h r5 = (p629ny.C76979h) r5
            android.app.Activity r6 = r0.f281043d
            java.lang.String r9 = r8.ContentDesc
            com.tencent.mm.ui.widget.MMNeat7extView r10 = r7.f281092k
            float r10 = r10.getTextSize()
            android.text.SpannableString r5 = r5.yp0(r6, r9, r10)
            r4.mo104279b(r5)
            goto L_0x0327
        L_0x0320:
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r7.f281092k
            r5 = 8
            r4.setVisibility(r5)
        L_0x0327:
            android.widget.LinearLayout r4 = r7.f281080e
            r5 = 0
            r4.setVisibility(r5)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r7.f281092k
            android.widget.TextView r4 = r4.getWrappedTextView()
            r6 = 1
            r4.setSingleLine(r6)
            android.view.View r4 = r7.f281098q
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r6.mo10233c(r9)
            java.lang.Object[] r24 = r6.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r26 = "createViewFinderFeed"
            java.lang.String r27 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r4
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 0
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r5 = r6.intValue()
            r4.setVisibility(r5)
            java.lang.String r24 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r25 = "createViewFinderFeed"
            java.lang.String r26 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            com.tencent.mm.storage.o3 r4 = new com.tencent.mm.storage.o3
            com.tencent.mm.storage.o3 r5 = r0.f281045f
            java.lang.String r5 = r5.f284144a
            r4.<init>(r5)
            int r5 = r15.field_createTime
            r4.f284145b = r5
            te3.j00 r5 = r8.ContentObj
            te3.rk1 r6 = r5.f298431o
            if (r6 != 0) goto L_0x03b3
            te3.nk1 r6 = r5.f298434r
            if (r6 != 0) goto L_0x03b3
            te3.tk1 r6 = r5.f298432p
            if (r6 != 0) goto L_0x03b3
            te3.p81 r6 = r5.f298435s
            if (r6 != 0) goto L_0x03b3
            te3.fw2 r6 = r5.f298436t
            if (r6 != 0) goto L_0x03b3
            te3.tk1 r6 = r5.f298438v
            if (r6 != 0) goto L_0x03b3
            te3.tk1 r6 = r5.f298442z
            if (r6 != 0) goto L_0x03b3
            te3.sk1 r5 = r5.f298440x
            if (r5 != 0) goto L_0x03b3
            java.lang.String r1 = "MicroMsg.SnsphotoAdapter"
            java.lang.String r2 = "finder share object or share topic is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return r11
        L_0x03b3:
            android.widget.TextView r5 = r7.f281096o
            android.app.Activity r6 = r0.f281043d
            android.content.res.Resources r6 = r6.getResources()
            r9 = 2131101252(0x7f060644, float:1.7814908E38)
            int r6 = r6.getColor(r9)
            r5.setTextColor(r6)
            java.lang.String r5 = "isDisplaySummary"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r14)
            int r6 = com.tencent.p014mm.plugin.sns.model.C5431p1.C5432a.m5339j()
            r9 = 1
            r6 = r6 & r9
            if (r6 > 0) goto L_0x03d5
            r6 = 1
            goto L_0x03d6
        L_0x03d5:
            r6 = 0
        L_0x03d6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            java.lang.String r5 = ""
            if (r6 == 0) goto L_0x03e6
            te3.j00 r6 = r8.ContentObj
            java.lang.String r6 = r6.f298426g
            java.lang.String r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122253o(r6)
            goto L_0x03e7
        L_0x03e6:
            r6 = r5
        L_0x03e7:
            te3.j00 r9 = r8.ContentObj
            te3.rk1 r10 = r9.f298431o
            r35 = r5
            if (r10 == 0) goto L_0x0456
            android.app.Activity r6 = r0.f281043d
            r9 = 1
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r10 = vr2.C102236a0.m134703A(r10)
            r16 = 0
            r5[r16] = r10
            r10 = 2131837137(0x7f1140d1, float:1.930746E38)
            java.lang.String r5 = r6.getString(r10, r5)
            te3.j00 r6 = r8.ContentObj
            te3.rk1 r6 = r6.f298431o
            int r10 = r6.f185188i
            r9 = 4
            if (r10 != r9) goto L_0x041f
            android.app.Activity r5 = r0.f281043d
            r10 = 1
            java.lang.Object[] r9 = new java.lang.Object[r10]
            java.lang.String r6 = vr2.C102236a0.m134703A(r6)
            r9[r16] = r6
            r6 = 2131837138(0x7f1140d2, float:1.9307463E38)
            java.lang.String r5 = r5.getString(r6, r9)
            goto L_0x0439
        L_0x041f:
            r20 = r5
            r5 = 1
            r9 = 2
            if (r10 != r9) goto L_0x0437
            android.app.Activity r9 = r0.f281043d
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.String r5 = vr2.C102236a0.m134703A(r6)
            r10[r16] = r5
            r5 = 2131837136(0x7f1140d0, float:1.9307459E38)
            java.lang.String r5 = r9.getString(r5, r10)
            goto L_0x0439
        L_0x0437:
            r5 = r20
        L_0x0439:
            te3.j00 r6 = r8.ContentObj
            te3.rk1 r6 = r6.f298431o
            java.lang.String r6 = vr2.C102236a0.m134703A(r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x053f
            android.app.Activity r5 = r0.f281043d
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131826159(0x7f1115ef, float:1.9285195E38)
            java.lang.String r5 = r5.getString(r6)
            goto L_0x053f
        L_0x0456:
            r5 = r9
            te3.nk1 r9 = r5.f298434r
            if (r9 == 0) goto L_0x045f
            java.lang.String r5 = r9.f184476e
            goto L_0x053f
        L_0x045f:
            te3.tk1 r9 = r5.f298432p
            r10 = 7
            if (r9 == 0) goto L_0x047f
            int r5 = r9.f185604e
            r6 = 1
            if (r5 != r6) goto L_0x046b
            java.lang.String r6 = r9.f185603d
        L_0x046b:
            if (r5 != r10) goto L_0x0476
            te3.bf0 r5 = r9.f185609j
            if (r5 == 0) goto L_0x0476
            java.lang.String r5 = com.tencent.p014mm.modelstat.C92859v.m117125c(r5)
            goto L_0x0478
        L_0x0476:
            java.lang.String r5 = r9.f185603d
        L_0x0478:
            te3.j00 r6 = r8.ContentObj
            te3.tk1 r6 = r6.f298432p
            java.lang.String r6 = r6.f185606g
            goto L_0x04a4
        L_0x047f:
            te3.tk1 r10 = r5.f298438v
            if (r10 == 0) goto L_0x049c
            int r5 = r10.f185604e
            r6 = 7
            if (r5 != r6) goto L_0x0493
            te3.bf0 r5 = r10.f185609j
            if (r5 == 0) goto L_0x0493
            te3.bf0 r5 = r9.f185609j
            java.lang.String r5 = com.tencent.p014mm.modelstat.C92859v.m117125c(r5)
            goto L_0x0495
        L_0x0493:
            java.lang.String r5 = r10.f185603d
        L_0x0495:
            te3.j00 r6 = r8.ContentObj
            te3.tk1 r6 = r6.f298432p
            java.lang.String r6 = r6.f185606g
            goto L_0x04a4
        L_0x049c:
            te3.tk1 r9 = r5.f298442z
            if (r9 == 0) goto L_0x04ab
            java.lang.String r5 = r9.f185603d
            java.lang.String r6 = r9.f185606g
        L_0x04a4:
            r33 = r6
            r6 = r5
            r5 = r33
            goto L_0x0556
        L_0x04ab:
            te3.p81 r9 = r5.f298435s
            if (r9 == 0) goto L_0x0510
            java.lang.String r5 = r9.f184781g
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x04ca
            te3.j00 r5 = r8.ContentObj
            te3.p81 r5 = r5.f298435s
            java.lang.String r5 = r5.f184782h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x04ca
            te3.j00 r5 = r8.ContentObj
            te3.p81 r5 = r5.f298435s
            java.lang.String r5 = r5.f184782h
            goto L_0x04f6
        L_0x04ca:
            te3.j00 r5 = r8.ContentObj
            te3.p81 r5 = r5.f298435s
            java.lang.String r5 = r5.f184782h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x04f9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            te3.j00 r9 = r8.ContentObj
            te3.p81 r9 = r9.f298435s
            java.lang.String r9 = r9.f184781g
            r5.append(r9)
            java.lang.String r9 = ": "
            r5.append(r9)
            te3.j00 r9 = r8.ContentObj
            te3.p81 r9 = r9.f298435s
            java.lang.String r9 = r9.f184782h
            r5.append(r9)
            java.lang.String r5 = r5.toString()
        L_0x04f6:
            r16 = 0
            goto L_0x055b
        L_0x04f9:
            android.app.Activity r5 = r0.f281043d
            r10 = 1
            java.lang.Object[] r9 = new java.lang.Object[r10]
            te3.j00 r10 = r8.ContentObj
            te3.p81 r10 = r10.f298435s
            java.lang.String r10 = r10.f184781g
            r16 = 0
            r9[r16] = r10
            r10 = 2131837139(0x7f1140d3, float:1.9307465E38)
            java.lang.String r5 = r5.getString(r10, r9)
            goto L_0x055b
        L_0x0510:
            r16 = 0
            te3.fw2 r9 = r5.f298436t
            if (r9 == 0) goto L_0x0542
            android.app.Activity r5 = r0.f281043d
            r6 = 1
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.String r6 = r9.f183243f
            r10[r16] = r6
            r6 = 2131837138(0x7f1140d2, float:1.9307463E38)
            java.lang.String r5 = r5.getString(r6, r10)
            te3.j00 r6 = r8.ContentObj
            te3.fw2 r6 = r6.f298436t
            java.lang.String r6 = r6.f183243f
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x053f
            android.app.Activity r5 = r0.f281043d
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131826159(0x7f1115ef, float:1.9285195E38)
            java.lang.String r5 = r5.getString(r6)
        L_0x053f:
            r10 = r35
            goto L_0x055c
        L_0x0542:
            te3.sk1 r5 = r5.f298440x
            if (r5 == 0) goto L_0x0559
            java.lang.String r5 = r5.f185424f
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0559
            te3.j00 r5 = r8.ContentObj
            te3.sk1 r5 = r5.f298440x
            java.lang.String r6 = r5.f185424f
            java.lang.String r5 = r5.f185429n
        L_0x0556:
            r10 = r5
            r5 = r6
            goto L_0x055c
        L_0x0559:
            r5 = r35
        L_0x055b:
            r10 = r6
        L_0x055c:
            int r6 = r5.length()
            r9 = 40
            if (r6 <= r9) goto L_0x057d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r35 = r10
            r10 = 0
            java.lang.String r5 = r5.substring(r10, r9)
            r6.append(r5)
            java.lang.String r5 = "..."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x057f
        L_0x057d:
            r35 = r10
        L_0x057f:
            r10 = r5
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r7.f281093l
            if (r5 == 0) goto L_0x0590
            r5.setTag(r1)
            com.tencent.mm.plugin.sns.ui.TagImageView r1 = r7.f281093l
            com.tencent.mm.plugin.sns.ui.r5$$s r5 = r0.f281053q
            android.view.View$OnClickListener r5 = r5.f281127d
            r1.setOnClickListener(r5)
        L_0x0590:
            android.widget.ImageView r1 = r7.f281095n
            r9 = 8
            r1.setVisibility(r9)
            te3.j00 r1 = r8.ContentObj
            te3.rk1 r5 = r1.f298431o
            if (r5 == 0) goto L_0x06a2
            int r1 = r5.f185188i
            r6 = 1
            if (r1 != r6) goto L_0x05ca
            com.tencent.mm.plugin.sns.ui.TagImageView r1 = r7.f281093l
            r6 = 8
            r1.setVisibility(r6)
            android.widget.TextView r1 = r7.f281094m
            r5 = 0
            r1.setVisibility(r5)
            android.widget.TextView r1 = r7.f281094m
            te3.j00 r5 = r8.ContentObj
            te3.rk1 r5 = r5.f298431o
            java.lang.String r5 = r5.f185187h
            r1.setText(r5)
            r1 = r8
            r36 = r10
            r32 = r11
            r23 = r13
            r9 = 1
            r10 = 2131756957(0x7f10079d, float:1.9144836E38)
            r13 = 2
            r11 = r7
            r7 = 0
            goto L_0x0703
        L_0x05ca:
            r1 = 0
            r6 = 8
            java.util.LinkedList<te3.pk1> r5 = r5.f185190n
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x066b
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r7.f281093l
            r5.setVisibility(r1)
            te3.kv2 r5 = new te3.kv2
            r5.<init>()
            te3.j00 r6 = r8.ContentObj
            te3.rk1 r6 = r6.f298431o
            java.util.LinkedList<te3.pk1> r6 = r6.f185190n
            java.lang.Object r6 = r6.get(r1)
            te3.pk1 r6 = (te3.C64628pk1) r6
            java.lang.String r6 = r6.f184828f
            r5.f298692g = r6
            te3.j00 r6 = r8.ContentObj
            te3.rk1 r6 = r6.f298431o
            java.util.LinkedList<te3.pk1> r6 = r6.f185190n
            java.lang.Object r6 = r6.get(r1)
            te3.pk1 r6 = (te3.C64628pk1) r6
            java.lang.String r1 = r6.f184828f
            r5.f298694i = r1
            r1 = 2
            r5.f298690e = r1
            r6 = 1
            r5.f298695j = r6
            te3.mv2 r1 = new te3.mv2
            r1.<init>()
            r5.f298698p = r1
            r5.f298693h = r6
            te3.j00 r6 = r8.ContentObj
            te3.rk1 r6 = r6.f298431o
            java.util.LinkedList<te3.pk1> r6 = r6.f185190n
            r9 = 0
            java.lang.Object r6 = r6.get(r9)
            te3.pk1 r6 = (te3.C64628pk1) r6
            float r6 = r6.f184829g
            r1.f298875d = r6
            te3.mv2 r1 = r5.f298698p
            te3.j00 r6 = r8.ContentObj
            te3.rk1 r6 = r6.f298431o
            java.util.LinkedList<te3.pk1> r6 = r6.f185190n
            java.lang.Object r6 = r6.get(r9)
            te3.pk1 r6 = (te3.C64628pk1) r6
            float r6 = r6.f184830h
            r1.f298876e = r6
            java.lang.String r1 = r15.getSnsId()
            r5.f298689d = r1
            com.tencent.mm.plugin.sns.model.o r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r6 = r15.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r9 = r7.f281093l
            r23 = r5
            android.app.Activity r5 = r0.f281043d
            int r24 = r5.hashCode()
            r21 = r23
            r23 = r13
            r13 = 4
            r5 = r1
            r1 = 2131756957(0x7f10079d, float:1.9144836E38)
            r19 = 8
            r22 = 1
            r16 = r7
            r1 = 0
            r7 = r21
            r1 = r8
            r8 = r9
            r9 = r24
            r36 = r10
            r31 = r16
            r10 = r12
            r32 = r11
            r11 = r4
            r5.mo131100T(r6, r7, r8, r9, r10, r11)
            goto L_0x0675
        L_0x066b:
            r31 = r7
            r1 = r8
            r36 = r10
            r32 = r11
            r23 = r13
            r13 = 4
        L_0x0675:
            te3.j00 r5 = r1.ContentObj
            te3.rk1 r5 = r5.f298431o
            int r5 = r5.f185188i
            if (r5 == r13) goto L_0x0683
            r13 = 2
            r11 = r31
            if (r5 != r13) goto L_0x071b
            goto L_0x0686
        L_0x0683:
            r13 = 2
            r11 = r31
        L_0x0686:
            android.widget.ImageView r5 = r11.f281095n
            r6 = 0
            r5.setVisibility(r6)
            android.widget.ImageView r5 = r11.f281095n
            android.content.Context r7 = r5.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131756957(0x7f10079d, float:1.9144836E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            r5.setImageDrawable(r7)
            goto L_0x071b
        L_0x06a2:
            r5 = r1
            r1 = r8
            r36 = r10
            r32 = r11
            r23 = r13
            r6 = 0
            r10 = 2131756957(0x7f10079d, float:1.9144836E38)
            r13 = 2
            r11 = r7
            te3.tk1 r5 = r5.f298438v
            if (r5 == 0) goto L_0x071b
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r11.f281093l
            r5.setVisibility(r6)
            te3.j00 r5 = r1.ContentObj
            te3.tk1 r5 = r5.f298438v
            java.lang.String r5 = r5.f185605f
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0705
            te3.kv2 r5 = new te3.kv2
            r5.<init>()
            te3.j00 r6 = r1.ContentObj
            te3.tk1 r6 = r6.f298438v
            java.lang.String r6 = r6.f185605f
            r5.f298692g = r6
            r5.f298694i = r6
            r5.f298690e = r13
            r9 = 1
            r5.f298695j = r9
            te3.mv2 r6 = new te3.mv2
            r6.<init>()
            r5.f298698p = r6
            r5.f298693h = r9
            r7 = 0
            r6.f298875d = r7
            r6.f298876e = r7
            java.lang.String r6 = r15.getSnsId()
            r5.f298689d = r6
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r11.f281093l
            r5.setScaleType(r2)
            di3.d r5 = di3.C86312j.m106911c(r17)
            ht1.t1 r5 = (ht1.C60200t1) r5
            te3.j00 r6 = r1.ContentObj
            te3.tk1 r6 = r6.f298438v
            java.lang.String r6 = r6.f185605f
            com.tencent.mm.plugin.sns.ui.TagImageView r8 = r11.f281093l
            r5.mo76882tg(r6, r8)
        L_0x0703:
            r7 = -1
            goto L_0x071d
        L_0x0705:
            r7 = 0
            r9 = 1
            com.tencent.mm.plugin.sns.model.o r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r11.f281093l
            r8 = 2131755877(0x7f100365, float:1.9142646E38)
            android.app.Activity r10 = r0.f281043d
            int r10 = r10.hashCode()
            r7 = -1
            r5.mo131095O(r6, r7, r8, r10)
            goto L_0x071d
        L_0x071b:
            r7 = -1
            r9 = 1
        L_0x071d:
            te3.j00 r5 = r1.ContentObj
            te3.tk1 r6 = r5.f298442z
            if (r6 == 0) goto L_0x0788
            com.tencent.mm.plugin.sns.ui.TagImageView r4 = r11.f281093l
            r5 = 0
            r4.setVisibility(r5)
            te3.j00 r4 = r1.ContentObj
            te3.tk1 r4 = r4.f298442z
            java.lang.String r4 = r4.f185605f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0773
            te3.kv2 r4 = new te3.kv2
            r4.<init>()
            te3.j00 r5 = r1.ContentObj
            te3.tk1 r5 = r5.f298442z
            java.lang.String r5 = r5.f185605f
            r4.f298692g = r5
            r4.f298694i = r5
            r4.f298690e = r13
            r4.f298695j = r9
            te3.mv2 r5 = new te3.mv2
            r5.<init>()
            r4.f298698p = r5
            r4.f298693h = r9
            r6 = 0
            r5.f298875d = r6
            r5.f298876e = r6
            java.lang.String r5 = r15.getSnsId()
            r4.f298689d = r5
            com.tencent.mm.plugin.sns.ui.TagImageView r4 = r11.f281093l
            r4.setScaleType(r2)
            di3.d r2 = di3.C86312j.m106911c(r17)
            ht1.t1 r2 = (ht1.C60200t1) r2
            te3.j00 r4 = r1.ContentObj
            te3.tk1 r4 = r4.f298442z
            java.lang.String r4 = r4.f185605f
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r11.f281093l
            r2.mo76882tg(r4, r5)
            goto L_0x0785
        L_0x0773:
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r4 = r11.f281093l
            r5 = 2131234159(0x7f080d6f, float:1.8084476E38)
            android.app.Activity r6 = r0.f281043d
            int r6 = r6.hashCode()
            r2.mo131095O(r4, r7, r5, r6)
        L_0x0785:
            r2 = 1
            goto L_0x088c
        L_0x0788:
            te3.tk1 r2 = r5.f298432p
            if (r2 == 0) goto L_0x07d5
            com.tencent.mm.plugin.sns.ui.TagImageView r2 = r11.f281093l
            r5 = 0
            r2.setVisibility(r5)
            te3.kv2 r7 = new te3.kv2
            r7.<init>()
            te3.j00 r2 = r1.ContentObj
            te3.tk1 r2 = r2.f298432p
            java.lang.String r2 = r2.f185605f
            r7.f298692g = r2
            r7.f298694i = r2
            r7.f298690e = r13
            r7.f298695j = r9
            te3.mv2 r2 = new te3.mv2
            r2.<init>()
            r7.f298698p = r2
            r7.f298693h = r9
            r5 = 0
            r2.f298875d = r5
            r2.f298876e = r5
            java.lang.String r2 = r15.getSnsId()
            r7.f298689d = r2
            com.tencent.mm.plugin.sns.model.o r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r6 = r15.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r8 = r11.f281093l
            android.app.Activity r2 = r0.f281043d
            int r2 = r2.hashCode()
            r10 = 1
            r9 = r2
            r2 = 1
            r10 = r12
            r12 = r11
            r11 = r4
            r5.mo131100T(r6, r7, r8, r9, r10, r11)
        L_0x07d2:
            r6 = 0
            goto L_0x0946
        L_0x07d5:
            r2 = 1
            te3.nk1 r6 = r5.f298434r
            if (r6 == 0) goto L_0x083f
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r11.f281093l
            r6 = 0
            r5.setVisibility(r6)
            te3.kv2 r7 = new te3.kv2
            r7.<init>()
            te3.j00 r5 = r1.ContentObj
            te3.nk1 r5 = r5.f298434r
            java.util.LinkedList<java.lang.String> r5 = r5.f184478g
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            te3.j00 r8 = r1.ContentObj
            te3.nk1 r8 = r8.f298434r
            java.util.LinkedList<java.lang.String> r8 = r8.f184479h
            java.lang.Object r8 = r8.get(r6)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r8)
            java.lang.String r5 = r6.toString()
            r7.f298692g = r5
            r7.f298694i = r5
            r7.f298690e = r13
            r7.f298695j = r2
            te3.mv2 r5 = new te3.mv2
            r5.<init>()
            r7.f298698p = r5
            r7.f298693h = r2
            r6 = 0
            r5.f298875d = r6
            r5.f298876e = r6
            java.lang.String r5 = r15.getSnsId()
            r7.f298689d = r5
            com.tencent.mm.plugin.sns.model.o r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r6 = r15.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r8 = r11.f281093l
            android.app.Activity r9 = r0.f281043d
            int r9 = r9.hashCode()
            r10 = r12
            r12 = r11
            r11 = r4
            r5.mo131100T(r6, r7, r8, r9, r10, r11)
            goto L_0x07d2
        L_0x083f:
            te3.p81 r6 = r5.f298435s
            if (r6 == 0) goto L_0x088f
            java.lang.String r4 = r6.f184783i
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x088c
            com.tencent.mm.plugin.sns.ui.TagImageView r4 = r11.f281093l
            r5 = 0
            r4.setVisibility(r5)
            te3.kv2 r4 = new te3.kv2
            r4.<init>()
            te3.j00 r5 = r1.ContentObj
            te3.p81 r5 = r5.f298435s
            java.lang.String r5 = r5.f184783i
            r4.f298692g = r5
            r4.f298694i = r5
            r4.f298690e = r13
            r4.f298695j = r2
            te3.mv2 r5 = new te3.mv2
            r5.<init>()
            r4.f298698p = r5
            r4.f298693h = r2
            te3.j00 r6 = r1.ContentObj
            te3.p81 r6 = r6.f298435s
            float r7 = r6.f184784j
            r5.f298875d = r7
            float r6 = r6.f184785n
            r5.f298876e = r6
            java.lang.String r5 = r15.getSnsId()
            r4.f298689d = r5
            di3.d r5 = di3.C86312j.m106911c(r17)
            ht1.t1 r5 = (ht1.C60200t1) r5
            java.lang.String r4 = r4.f298692g
            com.tencent.mm.plugin.sns.ui.TagImageView r6 = r11.f281093l
            r5.mo76882tg(r4, r6)
        L_0x088c:
            r2 = r11
            goto L_0x09af
        L_0x088f:
            te3.fw2 r6 = r5.f298436t
            if (r6 == 0) goto L_0x0948
            java.util.LinkedList<te3.ew2> r5 = r6.f183247j
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x092b
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r11.f281093l
            r6 = 0
            r5.setVisibility(r6)
            te3.kv2 r7 = new te3.kv2
            r7.<init>()
            te3.j00 r5 = r1.ContentObj
            te3.fw2 r5 = r5.f298436t
            java.util.LinkedList<te3.ew2> r5 = r5.f183247j
            java.lang.Object r5 = r5.get(r6)
            te3.ew2 r5 = (te3.C64350ew2) r5
            java.lang.String r5 = r5.f183043h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x08c9
            te3.j00 r5 = r1.ContentObj
            te3.fw2 r5 = r5.f298436t
            java.util.LinkedList<te3.ew2> r5 = r5.f183247j
            java.lang.Object r5 = r5.get(r6)
            te3.ew2 r5 = (te3.C64350ew2) r5
            java.lang.String r5 = r5.f183043h
            goto L_0x08d7
        L_0x08c9:
            te3.j00 r5 = r1.ContentObj
            te3.fw2 r5 = r5.f298436t
            java.util.LinkedList<te3.ew2> r5 = r5.f183247j
            java.lang.Object r5 = r5.get(r6)
            te3.ew2 r5 = (te3.C64350ew2) r5
            java.lang.String r5 = r5.f183040e
        L_0x08d7:
            r7.f298692g = r5
            r7.f298694i = r5
            r7.f298690e = r13
            r7.f298695j = r2
            te3.mv2 r5 = new te3.mv2
            r5.<init>()
            r7.f298698p = r5
            r7.f298693h = r2
            te3.j00 r6 = r1.ContentObj
            te3.fw2 r6 = r6.f298436t
            java.util.LinkedList<te3.ew2> r6 = r6.f183247j
            r8 = 0
            java.lang.Object r6 = r6.get(r8)
            te3.ew2 r6 = (te3.C64350ew2) r6
            float r6 = r6.f183041f
            r5.f298875d = r6
            te3.mv2 r5 = r7.f298698p
            te3.j00 r6 = r1.ContentObj
            te3.fw2 r6 = r6.f298436t
            java.util.LinkedList<te3.ew2> r6 = r6.f183247j
            java.lang.Object r6 = r6.get(r8)
            te3.ew2 r6 = (te3.C64350ew2) r6
            float r6 = r6.f183042g
            r5.f298876e = r6
            java.lang.String r5 = r15.getSnsId()
            r7.f298689d = r5
            com.tencent.mm.plugin.sns.model.o r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r6 = r15.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r8 = r11.f281093l
            android.app.Activity r9 = r0.f281043d
            int r9 = r9.hashCode()
            r2 = 2131756957(0x7f10079d, float:1.9144836E38)
            r10 = r12
            r12 = r11
            r11 = r4
            r5.mo131100T(r6, r7, r8, r9, r10, r11)
            goto L_0x092f
        L_0x092b:
            r12 = r11
            r2 = 2131756957(0x7f10079d, float:1.9144836E38)
        L_0x092f:
            android.widget.ImageView r4 = r12.f281095n
            r6 = 0
            r4.setVisibility(r6)
            android.widget.ImageView r4 = r12.f281095n
            android.content.Context r5 = r4.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.graphics.drawable.Drawable r2 = r5.getDrawable(r2)
            r4.setImageDrawable(r2)
        L_0x0946:
            r2 = r12
            goto L_0x09af
        L_0x0948:
            r2 = r11
            r6 = 0
            te3.sk1 r5 = r5.f298440x
            if (r5 == 0) goto L_0x09af
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r2.f281093l
            r5.setVisibility(r6)
            te3.j00 r5 = r1.ContentObj
            te3.sk1 r5 = r5.f298440x
            java.lang.String r5 = r5.f185427i
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x099d
            te3.kv2 r7 = new te3.kv2
            r7.<init>()
            te3.j00 r5 = r1.ContentObj
            te3.sk1 r5 = r5.f298440x
            java.lang.String r5 = r5.f185427i
            r7.f298692g = r5
            r7.f298694i = r5
            r7.f298690e = r13
            r5 = 1
            r7.f298695j = r5
            te3.mv2 r6 = new te3.mv2
            r6.<init>()
            r7.f298698p = r6
            r7.f298693h = r5
            r5 = 0
            r6.f298875d = r5
            r6.f298876e = r5
            java.lang.String r5 = r15.getSnsId()
            r7.f298689d = r5
            com.tencent.mm.plugin.sns.model.o r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            java.lang.String r6 = r15.getSnsId()
            com.tencent.mm.plugin.sns.ui.TagImageView r8 = r2.f281093l
            android.app.Activity r9 = r0.f281043d
            int r9 = r9.hashCode()
            r10 = r12
            r11 = r4
            r5.mo131100T(r6, r7, r8, r9, r10, r11)
            goto L_0x09af
        L_0x099d:
            com.tencent.mm.plugin.sns.model.o r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r2.f281093l
            r6 = 2131756337(0x7f100531, float:1.9143579E38)
            android.app.Activity r8 = r0.f281043d
            int r8 = r8.hashCode()
            r4.mo131095O(r5, r7, r6, r8)
        L_0x09af:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r35)
            if (r4 != 0) goto L_0x09c5
            android.widget.TextView r4 = r2.f281097p
            r5 = 0
            r4.setVisibility(r5)
            android.widget.TextView r4 = r2.f281097p
            r6 = r35
            r4.setText(r6)
            r5 = 8
            goto L_0x09cc
        L_0x09c5:
            android.widget.TextView r4 = r2.f281097p
            r5 = 8
            r4.setVisibility(r5)
        L_0x09cc:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r36)
            if (r4 != 0) goto L_0x0a00
            android.widget.TextView r4 = r2.f281097p
            int r4 = r4.getVisibility()
            if (r4 != r5) goto L_0x09e0
            android.widget.TextView r4 = r2.f281096o
            r4.setMaxLines(r13)
            goto L_0x09e6
        L_0x09e0:
            android.widget.TextView r4 = r2.f281096o
            r5 = 1
            r4.setMaxLines(r5)
        L_0x09e6:
            android.widget.TextView r4 = r2.f281096o
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.app.Activity r5 = r0.f281043d
            r6 = r36
            android.text.SpannableString r3 = r3.mo107057T1(r5, r6)
            r4.setText(r3)
            android.widget.TextView r3 = r2.f281096o
            r4 = 0
            r3.setVisibility(r4)
            goto L_0x0a06
        L_0x0a00:
            r4 = 0
            android.widget.TextView r3 = r2.f281096o
            r3.setVisibility(r5)
        L_0x0a06:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r3 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r3.mo131370c(r15)
            r6 = r32
            r6.setDrawingCacheEnabled(r4)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r2.f281092k
            r3.setImportantForAccessibility(r13)
            com.tencent.mm.plugin.sns.ui.TagImageView r3 = r2.f281093l
            r3.setImportantForAccessibility(r13)
            android.widget.LinearLayout r3 = r2.f281083h
            android.view.View r4 = r2.f281076a
            android.widget.TextView r5 = r2.f281078c
            java.lang.String r5 = r0.mo133857u(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = r1.ContentDesc
            r7.append(r1)
            java.lang.String r1 = "，"
            r7.append(r1)
            android.widget.TextView r1 = r2.f281096o
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r0.mo133834D(r3, r4, r5, r1)
            r1 = r23
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r14)
            return r6
        L_0x0a4e:
            r6 = r11
            r1 = r13
            r5 = 8
            r7 = -1
            android.widget.AbsListView$LayoutParams r2 = new android.widget.AbsListView$LayoutParams
            r3 = 1
            r2.<init>(r7, r3)
            r6.setLayoutParams(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.mo10233c(r3)
            java.lang.Object[] r16 = r2.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r18 = "createViewFinderFeed"
            java.lang.String r19 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r6
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6.setVisibility(r2)
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter"
            java.lang.String r17 = "createViewFinderFeed"
            java.lang.String r18 = "(ILandroid/view/View;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r14)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96198r5.mo133848l(int, android.view.View):android.view.View");
    }

    /* renamed from: n */
    public final View mo133849n(int i, View view) {
        View view2;
        r5$$q r5__q;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i;
        SnsMethodCalculate.markStartTimeMs("createViewHB", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (view == null || view.getTag() == null || !(view.getTag() instanceof r5$$q)) {
            r5$$q r5__q2 = new r5$$q(this);
            View inflate = C85868k2.m106137b(this.f281043d).inflate(C0966R.C0971layout.c3w, (ViewGroup) null);
            r5__q2.f281078c = (TextView) inflate.findViewById(C0966R.C0970id.jsu);
            r5__q2.f281077b = (TextView) inflate.findViewById(C0966R.C0970id.juc);
            r5__q2.f281079d = (TextView) inflate.findViewById(C0966R.C0970id.jxl);
            r5__q2.f281102k = (MaskImageView) inflate.findViewById(C0966R.C0970id.f5t);
            r5__q2.f281103l = (QFadeImageView) inflate.findViewById(C0966R.C0970id.kex);
            r5__q2.f281104m = (MaskImageView) inflate.findViewById(C0966R.C0970id.f5u);
            r5__q2.f281105n = (MaskImageView) inflate.findViewById(C0966R.C0970id.f5v);
            r5__q2.f281106o = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.f357845c22);
            r5__q2.f281107p = (TextView) inflate.findViewById(C0966R.C0970id.lqp);
            r5__q2.f281108q = (TextView) inflate.findViewById(C0966R.C0970id.lqq);
            r5__q2.f281109r = (TextView) inflate.findViewById(C0966R.C0970id.lqr);
            r5__q2.f281110s = (TextView) inflate.findViewById(C0966R.C0970id.f64);
            r5__q2.f281111t = inflate.findViewById(C0966R.C0970id.c2a);
            r5__q2.f281082g = (TextView) inflate.findViewById(C0966R.C0970id.f5608jp);
            r5__q2.f281080e = (LinearLayout) inflate.findViewById(C0966R.C0970id.fo_);
            r5__q2.f281081f = (ImageView) inflate.findViewById(C0966R.C0970id.f358628g52);
            r5__q2.f281083h = (LinearLayout) inflate.findViewById(C0966R.C0970id.fpg);
            r5__q2.f281084i = inflate.findViewById(C0966R.C0970id.fo9);
            r5__q2.f281103l.setOnClickListener(this.f281053q.f281128e);
            r5__q2.f281102k.setOnClickListener(this.f281053q.f281128e);
            r5__q2.f281113v = (SnsAlbumThumbStateIconView) inflate.findViewById(C0966R.C0970id.nz_);
            r5__q2.f281114w = (SnsAlbumThumbStateIconView) inflate.findViewById(C0966R.C0970id.nza);
            r5__q2.f281115x = (SnsAlbumThumbStateIconView) inflate.findViewById(C0966R.C0970id.nzb);
            r5__q2.f281116y = (TextView) inflate.findViewById(C0966R.C0970id.f359422kv0);
            r5__q2.f281117z = (TextView) inflate.findViewById(C0966R.C0970id.f359423kv1);
            r5__q2.f281099A = (TextView) inflate.findViewById(C0966R.C0970id.f359424kv2);
            MaskLinearLayout maskLinearLayout = (MaskLinearLayout) inflate.findViewById(C0966R.C0970id.ju8);
            r5__q2.f281100B = maskLinearLayout;
            maskLinearLayout.mo132235b(r5__q2.f281102k);
            r5__q2.f281085j = (LinearLayout) inflate.findViewById(C0966R.C0970id.eft);
            ((TextView) inflate.findViewById(C0966R.C0970id.jur)).setOnClickListener(new r5$$d(this));
            inflate.setTag(r5__q2);
            r5__q = r5__q2;
            view2 = inflate;
        } else {
            view2 = view;
            r5__q = (r5$$q) view.getTag();
        }
        C94866e1.Fx0().mo131091K(r5__q.f281102k);
        C94866e1.Fx0().mo131091K(r5__q.f281104m);
        C94866e1.Fx0().mo131091K(r5__q.f281105n);
        int intValue = ((HashMap) this.f281048i).get(Integer.valueOf(i)) != null ? ((Integer) ((HashMap) this.f281048i).get(Integer.valueOf(i))).intValue() : -1;
        r5__q.mo133869a();
        r5__q.f281079d.setTag(Integer.valueOf(i));
        r5__q.f281100B.settouchEnable(false);
        r5__q.f281100B.setBackgroundResource(0);
        r5__q.f281100B.setDescendantFocusability(131072);
        r5__q.f281100B.setClickable(false);
        r5__q.f281102k.settouchEnable(true);
        r5__q.f281102k.setClickable(true);
        r5__q.f281100B.setOnClickListener((View.OnClickListener) null);
        if (intValue >= this.f281052p || intValue == -1) {
            View view3 = view2;
            view3.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("createViewHB", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return view3;
        }
        int i4 = intValue - 1;
        if (i4 >= 0) {
            SnsInfo snsInfo = (SnsInfo) getItem(i4);
            i2 = snsInfo.getHead();
            z = C94897n1.m120371i(snsInfo.getLocalPrivate(), this.f281054r);
        } else {
            z = false;
            i2 = -1;
        }
        view2.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view5 = view2;
        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsInfo snsInfo2 = (SnsInfo) getItem(intValue);
        snsInfo2.getTimeLine();
        if ((!this.f281054r || i3 != 0) && i2 != -1 && snsInfo2.getHead() == i2) {
            z2 = z;
        } else {
            if (mo133846j(i3, snsInfo2.field_snsId)) {
                mo133845i(r5__q.f281077b, r5__q.f281078c, (long) snsInfo2.getCreateTime());
            }
            String t = mo133856t(intValue, snsInfo2.getHead(), new PInt());
            if (!Util.isNullOrNil(t)) {
                r5__q.f281082g.setText(t);
                r5__q.f281082g.setVisibility(0);
            }
            View view6 = r5__q.f281084i;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z2 = false;
        }
        mo133847k(r5__q.f281079d, i2, snsInfo2.getHead());
        long j = this.f281035E;
        if (j == 0 || snsInfo2.field_snsId != j) {
            r5__q.f281085j.setVisibility(8);
        } else {
            r5__q.f281085j.setVisibility(0);
        }
        r5__q.f281080e.setVisibility(0);
        if (!this.f281054r || i3 != 0) {
            r5$$q r5__q3 = r5__q;
            String str = "createViewHB";
            View view8 = view2;
            mo133833C(intValue, r5__q.f281102k, r5__q.f281107p, r5__q.f281110s, r5__q.f281113v, r5__q.f281116y, 1, z2, r5__q, i);
            SnsInfo snsInfo3 = (SnsInfo) getItem(intValue);
            if (Util.isNullOrNil(snsInfo3.getTimeLine().ContentDesc) || snsInfo3.getTypeFlag() != 1) {
                z3 = false;
            } else {
                r5$$q r5__q4 = r5__q3;
                r5__q4.f281100B.setDescendantFocusability(393216);
                r5__q4.f281100B.setClickable(true);
                z3 = false;
                r5__q4.f281102k.setClickable(false);
                r5__q4.f281102k.settouchEnable(false);
                r5__q4.f281100B.setOnClickListener(this.f281053q.f281128e);
                r5__q4.f281100B.settouchEnable(true);
                int i5 = snsInfo2.localid;
                r5$$s.C96207i iVar = new r5$$s.C96207i();
                iVar.f281142b = i5;
                if (((HashMap) this.f281050n).get(Integer.valueOf(i)) != null) {
                    iVar.f281141a = ((Integer) ((HashMap) this.f281050n).get(Integer.valueOf(i))).intValue();
                } else {
                    iVar.f281141a = 0;
                }
                r5__q4.f281100B.setTag(iVar);
            }
            SnsReportHelper.f275506m0.mo131370c(snsInfo3);
            view8.setDrawingCacheEnabled(z3);
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return view8;
        }
        r5__q.f281103l.setVisibility(0);
        r5__q.f281103l.setContentDescription(this.f281043d.getString(C0966R.string.jin));
        r5__q.f281102k.setVisibility(8);
        r5__q.f281106o.mo104279b(this.f281051o == 1 ? this.f281043d.getString(C0966R.string.f361398jk3) : "");
        r5__q.f281106o.setVisibility(0);
        View view9 = r5__q.f281111t;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view10 = view9;
        C117292a.m165358d(view10, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view10, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r5__q.f281110s.setVisibility(8);
        C94866e1.Fx0().mo131095O(r5__q.f281103l, C0966R.color.f356982ae0, C0966R.C0969drawable.au8, this.f281043d.hashCode());
        r5$$s.C96207i iVar2 = new r5$$s.C96207i();
        iVar2.f281142b = -1;
        iVar2.f281141a = -1;
        r5__q.f281103l.setTag(iVar2);
        SnsMethodCalculate.markEndTimeMs("createViewHB", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return view2;
    }

    public void notifyDataSetChanged() {
        SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        super.notifyDataSetChanged();
        SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }

    /* renamed from: o */
    public final View mo133851o(int i, View view) {
        View view2;
        r5$$o r5__o;
        int i2;
        int i3;
        int i4;
        String str;
        int i5 = i;
        Class cls = C76979h.class;
        SnsMethodCalculate.markStartTimeMs("createViewMpVideoFeed", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (view == null || view.getTag() == null || !(view.getTag() instanceof r5$$o)) {
            r5__o = new r5$$o(this);
            view2 = C85868k2.m106137b(this.f281043d).inflate(C0966R.C0971layout.c3v, (ViewGroup) null);
            r5__o.f281076a = view2.findViewById(C0966R.C0970id.bs4);
            r5__o.f281078c = (TextView) view2.findViewById(C0966R.C0970id.jsu);
            r5__o.f281077b = (TextView) view2.findViewById(C0966R.C0970id.juc);
            r5__o.f281079d = (TextView) view2.findViewById(C0966R.C0970id.jxl);
            r5__o.f281082g = (TextView) view2.findViewById(C0966R.C0970id.f5608jp);
            r5__o.f281084i = view2.findViewById(C0966R.C0970id.fo9);
            r5__o.f281082g = (TextView) view2.findViewById(C0966R.C0970id.f5608jp);
            r5__o.f281080e = (LinearLayout) view2.findViewById(C0966R.C0970id.fo_);
            r5__o.f281081f = (ImageView) view2.findViewById(C0966R.C0970id.f358628g52);
            r5__o.f281083h = (LinearLayout) view2.findViewById(C0966R.C0970id.fpg);
            r5__o.f281092k = (MMNeat7extView) view2.findViewById(C0966R.C0970id.c2h);
            r5__o.f281093l = (TagImageView) view2.findViewById(C0966R.C0970id.f4p);
            r5__o.f281095n = (ImageView) view2.findViewById(C0966R.C0970id.k0s);
            r5__o.f281096o = (TextView) view2.findViewById(C0966R.C0970id.kpq);
            r5__o.f281097p = (TextView) view2.findViewById(C0966R.C0970id.iub);
            r5__o.f281076a.setOnClickListener(this.f281053q.f281127d);
            r5__o.f281098q = view2.findViewById(C0966R.C0970id.f358729gq2);
            r5__o.f281094m = (TextView) view2.findViewById(C0966R.C0970id.f357791bs2);
            r5__o.f281085j = (LinearLayout) view2.findViewById(C0966R.C0970id.eft);
            ((TextView) view2.findViewById(C0966R.C0970id.jur)).setOnClickListener(new r5$$l(this));
            view2.setTag(r5__o);
            C102236a0.m134779x0(r5__o.f281093l, this.f281043d);
        } else {
            r5__o = (r5$$o) view.getTag();
            view2 = view;
        }
        r5__o.f281079d.setTag(Integer.valueOf(i));
        if (((HashMap) this.f281048i).get(Integer.valueOf(i)) != null) {
            i2 = ((Integer) ((HashMap) this.f281048i).get(Integer.valueOf(i))).intValue();
        } else {
            i2 = -1;
        }
        r5__o.mo133869a();
        if (i2 >= this.f281052p || i2 == -1) {
            view2.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMpVideoFeed", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMpVideoFeed", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("createViewMpVideoFeed", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return view2;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view2;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMpVideoFeed", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMpVideoFeed", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i6 = i2 - 1;
        if (i6 >= 0) {
            SnsInfo snsInfo = (SnsInfo) getItem(i6);
            int head = snsInfo.getHead();
            C94897n1.m120371i(snsInfo.getLocalPrivate(), this.f281054r);
            i3 = head;
        } else {
            i3 = -1;
        }
        view2.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view5 = view2;
        String str2 = "createViewMpVideoFeed";
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMpVideoFeed", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMpVideoFeed", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsInfo snsInfo2 = (SnsInfo) getItem(i2);
        TimeLineObject timeLine = snsInfo2.getTimeLine();
        if ((this.f281054r && i5 == 0) || i3 == -1 || snsInfo2.getHead() != i3) {
            if (mo133846j(i5, snsInfo2.field_snsId)) {
                mo133845i(r5__o.f281077b, r5__o.f281078c, (long) snsInfo2.getCreateTime());
            }
            String t = mo133856t(i2, snsInfo2.getHead(), new PInt());
            if (!Util.isNullOrNil(t)) {
                r5__o.f281082g.setText(t);
                r5__o.f281082g.setVisibility(0);
            }
            View view6 = r5__o.f281084i;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMpVideoFeed", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMpVideoFeed", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo133847k(r5__o.f281079d, i3, snsInfo2.getHead());
        long j = this.f281035E;
        if (j == 0 || snsInfo2.field_snsId != j) {
            i4 = 8;
            r5__o.f281085j.setVisibility(8);
        } else {
            r5__o.f281085j.setVisibility(0);
            i4 = 8;
        }
        r5$$s.C96207i iVar = new r5$$s.C96207i();
        iVar.f281142b = snsInfo2.localid;
        if (((HashMap) this.f281050n).get(Integer.valueOf(i)) != null) {
            iVar.f281141a = ((Integer) ((HashMap) this.f281050n).get(Integer.valueOf(i))).intValue();
        } else {
            iVar.f281141a = 0;
        }
        r5__o.f281076a.setTag(iVar);
        if (!Util.isNullOrNil(timeLine.ContentDesc)) {
            r5__o.f281092k.setVisibility(0);
            r5__o.f281092k.mo104279b(((C76979h) C86312j.m106911c(cls)).yp0(this.f281043d, timeLine.ContentDesc, r5__o.f281092k.getTextSize()));
        } else {
            r5__o.f281092k.setVisibility(i4);
        }
        r5__o.f281080e.setVisibility(0);
        r5__o.f281092k.getWrappedTextView().setSingleLine(true);
        View view8 = r5__o.f281098q;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(0);
        View view9 = view8;
        C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMpVideoFeed", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view9, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMpVideoFeed", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C96983o3 o3Var = new C96983o3(this.f281045f.f284144a);
        o3Var.f284145b = snsInfo2.field_createTime;
        if (timeLine.ContentObj.f298433q == null) {
            Log.m105928w("MicroMsg.SnsphotoAdapter", "finder share object or share topic is null!");
            SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return view2;
        }
        String str3 = str2;
        r5__o.f281096o.setTextColor(this.f281043d.getResources().getColor(C0966R.color.a7f));
        if (timeLine.ContentObj.f298433q != null) {
            r5__o.f281093l.setVisibility(0);
            str = timeLine.ContentObj.f298433q.f133369g;
            C101804kv2 kv22 = new C101804kv2();
            String str4 = timeLine.ContentObj.f298433q.f133370h;
            kv22.f298692g = str4;
            kv22.f298694i = str4;
            kv22.f298690e = 2;
            kv22.f298695j = 1;
            C101817mv2 mv22 = new C101817mv2();
            kv22.f298698p = mv22;
            kv22.f298693h = 1;
            C49399fa faVar = timeLine.ContentObj.f298433q;
            mv22.f298875d = (float) faVar.f133372j;
            mv22.f298876e = (float) faVar.f133373n;
            kv22.f298689d = snsInfo2.getSnsId();
            C94866e1.Fx0().mo131100T(snsInfo2.getSnsId(), kv22, r5__o.f281093l, this.f281043d.hashCode(), C94901o.C94911h.IMG_SCENE_SNSUSER, o3Var);
        } else {
            str = "";
        }
        if (str.length() > 40) {
            str = str.substring(0, 40) + "...";
        }
        TagImageView tagImageView = r5__o.f281093l;
        if (tagImageView != null) {
            tagImageView.setOnClickListener((View.OnClickListener) null);
        }
        r5__o.f281095n.setVisibility(0);
        ImageView imageView = r5__o.f281095n;
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_outlined_video_call, -1));
        r5__o.f281097p.setVisibility(8);
        if (!Util.isNullOrNil(str)) {
            if (r5__o.f281097p.getVisibility() == 8) {
                r5__o.f281096o.setMaxLines(2);
            } else {
                r5__o.f281096o.setMaxLines(1);
            }
            r5__o.f281096o.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f281043d, str));
            r5__o.f281096o.setVisibility(0);
        } else {
            r5__o.f281096o.setVisibility(8);
        }
        SnsReportHelper.f275506m0.mo131370c(snsInfo2);
        view2.setDrawingCacheEnabled(false);
        SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return view2;
    }

    /* renamed from: p */
    public final View mo133852p(int i, View view) {
        View view2;
        r5$$n r5__n;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        String str3;
        String str4;
        C64719t23 t232;
        int i5 = i;
        SnsMethodCalculate.markStartTimeMs("createViewMusicMv", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (view == null || view.getTag() == null || !(view.getTag() instanceof r5$$o)) {
            r5__n = new r5$$n(this);
            view2 = C85868k2.m106137b(this.f281043d).inflate(C0966R.C0971layout.c3u, (ViewGroup) null);
            r5__n.f281076a = view2.findViewById(C0966R.C0970id.bs4);
            r5__n.f281078c = (TextView) view2.findViewById(C0966R.C0970id.jsu);
            r5__n.f281077b = (TextView) view2.findViewById(C0966R.C0970id.juc);
            r5__n.f281079d = (TextView) view2.findViewById(C0966R.C0970id.jxl);
            r5__n.f281082g = (TextView) view2.findViewById(C0966R.C0970id.f5608jp);
            r5__n.f281084i = view2.findViewById(C0966R.C0970id.fo9);
            r5__n.f281082g = (TextView) view2.findViewById(C0966R.C0970id.f5608jp);
            r5__n.f281080e = (LinearLayout) view2.findViewById(C0966R.C0970id.fo_);
            r5__n.f281081f = (ImageView) view2.findViewById(C0966R.C0970id.f358628g52);
            r5__n.f281083h = (LinearLayout) view2.findViewById(C0966R.C0970id.fpg);
            r5__n.f281086k = (MMNeat7extView) view2.findViewById(C0966R.C0970id.c2h);
            r5__n.f281087l = (MMRoundCornerImageView) view2.findViewById(C0966R.C0970id.h5y);
            r5__n.f281089n = (TextView) view2.findViewById(C0966R.C0970id.h7b);
            r5__n.f281090o = (TextView) view2.findViewById(C0966R.C0970id.f358803h61);
            r5__n.f281088m = (WeImageView) view2.findViewById(C0966R.C0970id.h6r);
            r5__n.f281076a.setOnClickListener(this.f281053q.f281127d);
            r5__n.f281091p = view2.findViewById(C0966R.C0970id.f358729gq2);
            r5__n.f281085j = (LinearLayout) view2.findViewById(C0966R.C0970id.eft);
            ((TextView) view2.findViewById(C0966R.C0970id.jur)).setOnClickListener(new r5$$i(this));
            view2.setTag(r5__n);
        } else {
            r5__n = (r5$$n) view.getTag();
            view2 = view;
        }
        r5__n.f281079d.setTag(Integer.valueOf(i));
        if (((HashMap) this.f281048i).get(Integer.valueOf(i)) != null) {
            i2 = ((Integer) ((HashMap) this.f281048i).get(Integer.valueOf(i))).intValue();
        } else {
            i2 = -1;
        }
        r5__n.mo133869a();
        if (i2 >= this.f281052p || i2 == -1) {
            view2.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("createViewMusicMv", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return view2;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view2;
        String str5 = "createViewMusicMv";
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i6 = i2 - 1;
        if (i6 >= 0) {
            SnsInfo snsInfo = (SnsInfo) getItem(i6);
            int head = snsInfo.getHead();
            C94897n1.m120371i(snsInfo.getLocalPrivate(), this.f281054r);
            i3 = head;
        } else {
            i3 = -1;
        }
        view2.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view5 = view2;
        String str6 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter";
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((HashMap) this.f281049j).get(Integer.valueOf(i)) != null) {
            ((Integer) ((HashMap) this.f281049j).get(Integer.valueOf(i))).intValue();
        }
        SnsInfo snsInfo2 = (SnsInfo) getItem(i2);
        TimeLineObject timeLine = snsInfo2.getTimeLine();
        if ((this.f281054r && i5 == 0) || i3 == -1 || snsInfo2.getHead() != i3) {
            if (mo133846j(i5, snsInfo2.field_snsId)) {
                mo133845i(r5__n.f281077b, r5__n.f281078c, (long) snsInfo2.getCreateTime());
            }
            String t = mo133856t(i2, snsInfo2.getHead(), new PInt());
            if (!Util.isNullOrNil(t)) {
                r5__n.f281082g.setText(t);
                r5__n.f281082g.setVisibility(0);
            }
            View view6 = r5__n.f281084i;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo133847k(r5__n.f281079d, i3, snsInfo2.getHead());
        long j = this.f281035E;
        if (j == 0 || snsInfo2.field_snsId != j) {
            i4 = 8;
            r5__n.f281085j.setVisibility(8);
        } else {
            r5__n.f281085j.setVisibility(0);
            i4 = 8;
        }
        r5$$s.C96207i iVar = new r5$$s.C96207i();
        iVar.f281142b = snsInfo2.localid;
        if (((HashMap) this.f281050n).get(Integer.valueOf(i)) != null) {
            iVar.f281141a = ((Integer) ((HashMap) this.f281050n).get(Integer.valueOf(i))).intValue();
        } else {
            iVar.f281141a = 0;
        }
        r5__n.f281076a.setTag(iVar);
        if (!Util.isNullOrNil(timeLine.ContentDesc)) {
            r5__n.f281086k.setVisibility(0);
            r5__n.f281086k.mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f281043d, timeLine.ContentDesc, r5__n.f281086k.getTextSize()));
        } else {
            r5__n.f281086k.setVisibility(i4);
        }
        r5__n.f281080e.setVisibility(0);
        r5__n.f281086k.setMaxLines(1);
        r5__n.f281086k.getWrappedTextView().setSingleLine(true);
        View view7 = r5__n.f281091p;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(0);
        C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        String str7 = this.f281045f.f284144a;
        C101789j00 j002 = timeLine.ContentObj;
        String str8 = "";
        if (j002 == null || (t232 = j002.f298439w) == null) {
            str2 = str8;
            str = str2;
        } else {
            str2 = t232.f185462g;
            if (!Util.isNullOrNil(str2)) {
                Log.m105925i("MicroMsg.SnsphotoAdapter", "has mvInfo:%s", str2);
                r5__n.f281090o.setVisibility(0);
                r5__n.f281090o.setText(str2 + this.f281043d.getString(C0966R.string.h2w));
            }
            str = timeLine.ContentObj.f298439w.f185461f;
        }
        if (!Util.isNullOrNil(str)) {
            str3 = C102984b.m136166c(str);
        } else {
            if (!timeLine.ContentObj.f298427h.isEmpty()) {
                C101804kv2 kv22 = timeLine.ContentObj.f298427h.get(0);
                if (kv22 != null && !Util.isNullOrNil(kv22.f298694i)) {
                    str = kv22.f298694i;
                    str3 = C102984b.m136166c(str);
                } else if (kv22 != null) {
                    C100406i0 LL = C94866e1.ay0().mo139867LL((long) kv22.f298701s);
                    str = C94938q1.m120518e(C94866e1.m120262YO(), LL.mo139851e()) + C102236a0.m134733a0(LL.mo139851e());
                    str3 = str;
                }
            }
            str3 = str8;
        }
        Log.m105925i("MicroMsg.SnsphotoAdapter", "coverInfo, posterInfo:%s, coverUrl: %s, coverPath: %s", str2, str, str3);
        r5__n.f281087l.setImageDrawable(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.aiu));
        if (C85875k4.m106211z()) {
            r5__n.f281087l.setImageDrawable(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.ait));
        }
        if (!Util.isNullOrNil(str)) {
            r5__n.f281088m.setVisibility(0);
            View view8 = r5__n.f281091p;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view9 = view8;
            C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r5__n.f281089n.setMaxLines(1);
            r5__n.f281089n.setTextColor(this.f281043d.getResources().getColor(C0966R.color.ad8));
            if (!timeLine.ContentObj.f298427h.isEmpty()) {
                C101804kv2 kv23 = timeLine.ContentObj.f298427h.get(0);
                kv23.f298701s = snsInfo2.localid;
                String str9 = kv23.f298691f;
                str8 = kv23.f298697o;
                str4 = str9;
            } else {
                str4 = str8;
            }
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59350f = str3;
            bVar.f59346b = true;
            bVar.f59364t = true;
            bVar.f59345a = true;
            bVar.f59363s = true;
            bVar.f59365u = (float) C76577a.m92151b(MMApplicationContext.getContext(), 2);
            C20828a.m22825b().mo32519h(str, r5__n.f281087l, bVar.mo32666a());
            r5__n.f281088m.setPressed(false);
            if (mo133858v(timeLine.f283893Id)) {
                r5__n.f281088m.setImageResource(C0966R.raw.icons_outlined_pause2);
                r5__n.f281088m.setContentDescription(this.f281043d.getString(C0966R.string.jhg));
            } else {
                r5__n.f281088m.setImageResource(C0966R.raw.icons_outlined_play2);
                r5__n.f281088m.setContentDescription(this.f281043d.getString(C0966R.string.f361384jg1));
            }
            r5__n.f281088m.setIconColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3133gi));
            r5__n.f281088m.setTag(timeLine);
            r5__n.f281088m.setOnClickListener(this.f281042L);
            r5__n.f281091p.setTag(timeLine);
            r5__n.f281089n.setVisibility(0);
            if (!Util.isNullOrNil(str2)) {
                if (!Util.isNullOrNil(str4)) {
                    str8 = str8 + String.format("·%s", new Object[]{str4});
                }
                r5__n.f281089n.setText(str8);
            } else {
                r5__n.f281089n.setText(str8);
                C64719t23 t233 = timeLine.ContentObj.f298439w;
                if (t233 != null && !Util.isNullOrNil(t233.f185463h)) {
                    r5__n.f281090o.setVisibility(0);
                    r5__n.f281090o.setText(timeLine.ContentObj.f298439w.f185463h);
                } else if (!Util.isNullOrNil(str4)) {
                    r5__n.f281090o.setVisibility(0);
                    r5__n.f281090o.setText(str4);
                }
            }
            C101789j00 j003 = timeLine.ContentObj;
            if (j003.f298439w == null) {
                j003.f298439w = new C64719t23();
            }
            C64719t23 t234 = timeLine.ContentObj.f298439w;
            t234.f185472t = str3;
            StringBuffer stringBuffer = new StringBuffer(this.f281043d.getString(C0966R.string.jea));
            if (!Util.isNullOrNil(str8)) {
                stringBuffer.append(str8 + ",");
            }
            if (!Util.isNullOrNil(t234.f185463h)) {
                stringBuffer.append(t234.f185463h + ",");
            }
            String l5 = ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93159l5(this.f281043d, timeLine.AppInfo.f299236d);
            if (!Util.isNullOrNil(l5)) {
                stringBuffer.append(l5);
            }
            str8 = timeLine.ContentDesc + "，" + stringBuffer;
        } else {
            View view10 = r5__n.f281091p;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(Integer.valueOf(i4));
            View view11 = view10;
            C117292a.m165358d(view11, aVar7.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo133834D(r5__n.f281083h, r5__n.f281091p, mo133857u(r5__n.f281078c), str8);
        SnsMethodCalculate.markEndTimeMs(str5, str6);
        return view2;
    }

    /* renamed from: q */
    public final View mo133853q(int i, View view) {
        View view2;
        r5$$o r5__o;
        int i2;
        String str;
        r5$$o r5__o2;
        View view3;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        C94901o.C94911h hVar = C94901o.C94911h.IMG_SCENE_SNSUSER;
        SnsMethodCalculate.markStartTimeMs("createViewOthers", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (view == null || view.getTag() == null || !(view.getTag() instanceof r5$$o)) {
            r5$$o r5__o3 = new r5$$o(this);
            View inflate = C85868k2.m106137b(this.f281043d).inflate(C0966R.C0971layout.c3v, (ViewGroup) null);
            r5__o3.f281076a = inflate.findViewById(C0966R.C0970id.bs4);
            r5__o3.f281078c = (TextView) inflate.findViewById(C0966R.C0970id.jsu);
            r5__o3.f281077b = (TextView) inflate.findViewById(C0966R.C0970id.juc);
            r5__o3.f281079d = (TextView) inflate.findViewById(C0966R.C0970id.jxl);
            r5__o3.f281082g = (TextView) inflate.findViewById(C0966R.C0970id.f5608jp);
            r5__o3.f281084i = inflate.findViewById(C0966R.C0970id.fo9);
            r5__o3.f281082g = (TextView) inflate.findViewById(C0966R.C0970id.f5608jp);
            r5__o3.f281080e = (LinearLayout) inflate.findViewById(C0966R.C0970id.fo_);
            r5__o3.f281081f = (ImageView) inflate.findViewById(C0966R.C0970id.f358628g52);
            r5__o3.f281083h = (LinearLayout) inflate.findViewById(C0966R.C0970id.fpg);
            r5__o3.f281092k = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.c2h);
            r5__o3.f281093l = (TagImageView) inflate.findViewById(C0966R.C0970id.f4p);
            r5__o3.f281095n = (ImageView) inflate.findViewById(C0966R.C0970id.k0s);
            r5__o3.f281096o = (TextView) inflate.findViewById(C0966R.C0970id.kpq);
            r5__o3.f281097p = (TextView) inflate.findViewById(C0966R.C0970id.iub);
            r5__o3.f281076a.setOnClickListener(this.f281053q.f281127d);
            r5__o3.f281098q = inflate.findViewById(C0966R.C0970id.f358729gq2);
            r5__o3.f281085j = (LinearLayout) inflate.findViewById(C0966R.C0970id.eft);
            ((TextView) inflate.findViewById(C0966R.C0970id.jur)).setOnClickListener(new r5$$j(this));
            inflate.setTag(r5__o3);
            C102236a0.m134779x0(r5__o3.f281093l, this.f281043d);
            r5__o = r5__o3;
            view2 = inflate;
        } else {
            view2 = view;
            r5__o = (r5$$o) view.getTag();
        }
        r5__o.f281079d.setTag(Integer.valueOf(i));
        int intValue = ((HashMap) this.f281048i).get(Integer.valueOf(i)) != null ? ((Integer) ((HashMap) this.f281048i).get(Integer.valueOf(i))).intValue() : -1;
        r5__o.mo133869a();
        if (intValue >= this.f281052p || intValue == -1) {
            View view4 = view2;
            view4.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("createViewOthers", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return view4;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view6 = view2;
        C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i7 = intValue - 1;
        int head = i7 >= 0 ? ((SnsInfo) getItem(i7)).getHead() : -1;
        view2.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view7 = view2;
        C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsInfo snsInfo = (SnsInfo) getItem(intValue);
        TimeLineObject timeLine = snsInfo.getTimeLine();
        if ((this.f281054r && i6 == 0) || head == -1 || snsInfo.getHead() != head) {
            if (mo133846j(i6, snsInfo.field_snsId)) {
                mo133845i(r5__o.f281077b, r5__o.f281078c, (long) snsInfo.getCreateTime());
            }
            PInt pInt = new PInt();
            String t = mo133856t(intValue, snsInfo.getHead(), pInt);
            if (!Util.isNullOrNil(t)) {
                r5__o.f281082g.setText(t);
                r5__o.f281082g.setVisibility(0);
                if (pInt.value == 1 && snsInfo.getTimeLine().ContentObj.f298424e == 2) {
                    r5__o.f281082g.setMaxLines(1);
                }
            }
            View view8 = r5__o.f281084i;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view9 = view8;
            C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo133847k(r5__o.f281079d, head, snsInfo.getHead());
        long j = this.f281035E;
        if (j == 0 || snsInfo.field_snsId != j) {
            i2 = 8;
            r5__o.f281085j.setVisibility(8);
        } else {
            r5__o.f281085j.setVisibility(0);
            i2 = 8;
        }
        r5$$s.C96207i iVar = new r5$$s.C96207i();
        iVar.f281142b = snsInfo.localid;
        if (((HashMap) this.f281050n).get(Integer.valueOf(i)) != null) {
            iVar.f281141a = ((Integer) ((HashMap) this.f281050n).get(Integer.valueOf(i))).intValue();
        } else {
            iVar.f281141a = 0;
        }
        r5__o.f281076a.setTag(iVar);
        if (!Util.isNullOrNil(timeLine.ContentDesc)) {
            r5__o.f281092k.setVisibility(0);
            r5__o.f281092k.mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f281043d, timeLine.ContentDesc, r5__o.f281092k.getTextSize()));
        } else {
            r5__o.f281092k.setVisibility(i2);
        }
        r5__o.f281080e.setVisibility(0);
        r5__o.f281092k.setMaxLines(1);
        r5__o.f281092k.getWrappedTextView().setSingleLine(true);
        View view10 = r5__o.f281098q;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(0);
        View view11 = view10;
        C117292a.m165358d(view11, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view10.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view11, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C101789j00 j002 = timeLine.ContentObj;
        int i8 = j002.f298424e;
        C96983o3 o3Var = new C96983o3(this.f281045f.f284144a);
        o3Var.f284145b = snsInfo.field_createTime;
        if (i8 == 2) {
            r5__o.f281092k.setVisibility(0);
            r5__o.f281092k.getWrappedTextView().setSingleLine(false);
            r5__o.f281092k.setMaxLines(2);
            View view12 = r5__o.f281098q;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(Integer.valueOf(i2));
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r5__o2 = r5__o;
            str = "createViewOthers";
            view3 = view2;
        } else if (i8 != 4) {
            r5__o2 = r5__o;
            str = "createViewOthers";
            view3 = view2;
            r5__o2.f281096o.setTextColor(this.f281043d.getResources().getColor(C0966R.color.FG_0));
            SnsMethodCalculate.markStartTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            boolean z = (C5431p1.C5432a.m5339j() & 1) <= 0;
            SnsMethodCalculate.markEndTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            String o = z ? SnsTimeLineBaseAdapter.m122253o(timeLine.ContentObj.f298426g) : "";
            String str2 = timeLine.ContentObj.f298425f;
            if (str2 != null && str2.length() > 40) {
                boolean z2 = C96965r.f284067d;
                int g = C96965r.C44649c.f121057a.mo135555g(str2, 0, 40);
                str2 = str2.substring(0, g) + "...";
            }
            String str3 = str2;
            TagImageView tagImageView = r5__o2.f281093l;
            if (tagImageView != null) {
                tagImageView.setOnClickListener((View.OnClickListener) null);
            }
            r5__o2.f281095n.setVisibility(8);
            if (!timeLine.ContentObj.f298427h.isEmpty()) {
                r5__o2.f281093l.setVisibility(0);
                C101804kv2 kv22 = timeLine.ContentObj.f298427h.get(0);
                if (timeLine.ContentObj.f298424e == 5) {
                    String o2 = SnsTimeLineBaseAdapter.m122253o(kv22.f298692g);
                    String str4 = kv22.f298697o;
                    r5__o2.f281095n.setVisibility(0);
                    String str5 = str4;
                    C94866e1.Fx0().mo131099S(snsInfo.getSnsId(), kv22, r5__o2.f281093l, C0966R.raw.app_attach_file_icon_video, this.f281043d.hashCode(), hVar, o3Var);
                    o = o2;
                    str3 = str5;
                } else {
                    C94866e1.Fx0().mo131100T(snsInfo.getSnsId(), kv22, r5__o2.f281093l, this.f281043d.hashCode(), hVar, o3Var);
                }
            } else if (timeLine.ContentObj.f298424e != 26) {
                r5__o2.f281093l.setVisibility(8);
            } else {
                r5__o2.f281093l.setVisibility(0);
                r5__o2.f281093l.setImageResource(C0966R.raw.note_sns_link_default);
            }
            C101842st2 st22 = timeLine.ContentObj.f298430n;
            if (st22 != null && st22.f299453q == 1) {
                o = MMApplicationContext.getContext().getString(C0966R.string.gw8);
            }
            if (!Util.isNullOrNil(o)) {
                r5__o2.f281097p.setVisibility(0);
                r5__o2.f281097p.setText(o);
                i3 = 8;
            } else {
                i3 = 8;
                r5__o2.f281097p.setVisibility(8);
            }
            if (!Util.isNullOrNil(str3)) {
                if (r5__o2.f281097p.getVisibility() == i3) {
                    r5__o2.f281096o.setMaxLines(2);
                    i4 = 1;
                } else {
                    i4 = 1;
                    r5__o2.f281096o.setMaxLines(1);
                }
                r5__o2.f281096o.setVisibility(0);
                if ((timeLine.contentattr & i4) > 0) {
                    TextView textView = r5__o2.f281096o;
                    textView.setText(C102236a0.m134766r(str3, this.f281043d, textView));
                } else {
                    r5__o2.f281096o.setText(str3);
                }
            } else {
                r5__o2.f281096o.setVisibility(8);
            }
            if (timeLine.ContentObj.f298424e == 101 && timeLine.gameShareCardObject.f298869f != 0) {
                r5__o2.f281095n.setVisibility(0);
                ImageView imageView = r5__o2.f281095n;
                imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(C0966R.raw.shortvideo_play_btn));
            }
            d05 d05 = timeLine.weappInfo;
            if (d05 != null && d05.f298077n == 1) {
                r5__o2.f281095n.setVisibility(0);
                ImageView imageView2 = r5__o2.f281095n;
                imageView2.setImageDrawable(imageView2.getContext().getResources().getDrawable(C0966R.raw.shortvideo_play_btn));
            }
        } else if (!j002.f298427h.isEmpty()) {
            r5__o.f281093l.setVisibility(0);
            r5__o.f281095n.setVisibility(0);
            View view13 = r5__o.f281098q;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            View view14 = view13;
            C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r5__o.f281096o.setMaxLines(1);
            r5__o.f281096o.setTextColor(this.f281043d.getResources().getColor(C0966R.color.ad8));
            C101804kv2 kv23 = timeLine.ContentObj.f298427h.get(0);
            C101804kv2 kv24 = kv23;
            r5__o2 = r5__o;
            str = "createViewOthers";
            view3 = view2;
            C94866e1.Fx0().mo131099S(snsInfo.getSnsId(), kv23, r5__o.f281093l, C0966R.raw.app_attach_file_icon_music, this.f281043d.hashCode(), hVar, o3Var);
            r5__o2.f281095n.setPressed(false);
            if (mo133858v(timeLine.f283893Id)) {
                r5__o2.f281095n.setImageResource(C0966R.C0969drawable.ajq);
                r5__o2.f281095n.setContentDescription(this.f281043d.getString(C0966R.string.jhg));
            } else {
                r5__o2.f281095n.setImageResource(C0966R.C0969drawable.ajs);
                r5__o2.f281095n.setContentDescription(this.f281043d.getString(C0966R.string.f361384jg1));
            }
            r5__o2.f281093l.setTag(timeLine);
            r5__o2.f281093l.setOnClickListener(this.f281042L);
            C101804kv2 kv25 = kv24;
            kv25.f298701s = snsInfo.localid;
            r5__o2.f281098q.setTag(timeLine);
            String str6 = kv25.f298691f;
            if (!Util.isNullOrNil(str6)) {
                i5 = 0;
                r5__o2.f281097p.setVisibility(0);
                r5__o2.f281097p.setText(str6);
            } else {
                i5 = 0;
                r5__o2.f281097p.setVisibility(4);
            }
            String str7 = kv25.f298697o;
            if (!Util.isNullOrNil(str7)) {
                r5__o2.f281096o.setVisibility(i5);
                r5__o2.f281096o.setTag(iVar);
                r5__o2.f281096o.setOnTouchListener(new C71253l1());
                r5__o2.f281096o.setText(str7);
            } else {
                r5__o2.f281096o.setVisibility(8);
            }
        } else {
            r5__o2 = r5__o;
            str = "createViewOthers";
            view3 = view2;
            View view15 = r5__o2.f281098q;
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(8);
            View view16 = view15;
            C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter", "createViewOthers", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        String str8 = timeLine.ContentDesc;
        if (r5__o2.f281096o.getVisibility() == 0) {
            r5__o2.f281092k.setImportantForAccessibility(2);
            str8 = str8 + "," + this.f281043d.getString(C0966R.string.jea) + "," + r5__o2.f281096o.getText();
        }
        if (r5__o2.f281097p.getVisibility() == 0) {
            str8 = str8 + r5__o2.f281097p.getText();
        }
        mo133834D(r5__o2.f281083h, r5__o2.f281098q, mo133857u(r5__o2.f281078c), str8);
        if (r5__o2.f281096o.getVisibility() != 0) {
            r5__o2.f281092k.setImportantForAccessibility(1);
            r5__o2.f281083h.setContentDescription(r5__o2.f281092k.mo154968a());
            ((View) r5__o2.f281083h.getParent()).setImportantForAccessibility(2);
        }
        view3.setDrawingCacheEnabled(false);
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return view3;
    }

    /* renamed from: r */
    public SnsInfo mo133854r(SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("getLastestSnsInfoWithGroupData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (this.f281040J == snsInfo.localid) {
            SnsInfo b = C100416r.m131409b(snsInfo.getLocalid());
            this.f281040J = -1;
            if (b == null) {
                Log.m105921e("MicroMsg.SnsphotoAdapter", "getLastestSnsInfoWithGroupData failed to sight update snsInfo, fixPos:%d, localId:%s", Integer.valueOf(i), Integer.valueOf(snsInfo.localid));
                SnsMethodCalculate.markEndTimeMs("getLastestSnsInfoWithGroupData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return null;
            }
            Log.m105925i("MicroMsg.SnsphotoAdapter", "getLastestSnsInfoWithGroupData success to update snsInfo, fixPos:%d, localId:%s", Integer.valueOf(i), Integer.valueOf(snsInfo.localid));
            ((ArrayList) this.f281047h).set(i, b);
            SnsMethodCalculate.markEndTimeMs("getLastestSnsInfoWithGroupData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return b;
        }
        SnsMethodCalculate.markEndTimeMs("getLastestSnsInfoWithGroupData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return null;
    }

    /* renamed from: s */
    public String mo133855s() {
        SnsMethodCalculate.markStartTimeMs("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        String str = this.f281058v;
        SnsMethodCalculate.markEndTimeMs("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return str;
    }

    /* renamed from: t */
    public final String mo133856t(int i, int i2, PInt pInt) {
        TimeLineObject timeLine;
        C101802kr2 kr22;
        SnsMethodCalculate.markStartTimeMs("getNextShowLocation", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        String str = "";
        while (i < ((ArrayList) this.f281047h).size()) {
            SnsInfo snsInfo = (SnsInfo) getItem(i);
            if (snsInfo.getHead() != i2) {
                SnsMethodCalculate.markEndTimeMs("getNextShowLocation", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                return str;
            }
            pInt.value++;
            if (Util.isNullOrNil(str) && (kr22 = timeLine.Location) != null) {
                boolean isNullOrNil = Util.isNullOrNil(kr22.f298650g);
                C101802kr2 kr23 = (timeLine = snsInfo.getTimeLine()).Location;
                String str2 = isNullOrNil ? kr23.f298649f : kr23.f298650g;
                if (!Util.isNullOrNil(str2)) {
                    str = str2;
                }
            }
            i++;
        }
        SnsMethodCalculate.markEndTimeMs("getNextShowLocation", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return str;
    }

    /* renamed from: u */
    public final String mo133857u(View view) {
        String str;
        SnsMethodCalculate.markStartTimeMs("getTimeDesc", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        if (view.getContentDescription() != null) {
            str = view.getContentDescription().toString();
            view.setContentDescription("");
        } else {
            str = null;
        }
        SnsMethodCalculate.markEndTimeMs("getTimeDesc", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return str;
    }

    /* renamed from: v */
    public boolean mo133858v(String str) {
        SnsMethodCalculate.markStartTimeMs("isPlayingMusicAndTheSameId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        C101106m b = C101093a.m132480b();
        if (b == null || !C101093a.m132482d(b) || !str.equals(b.f295960e) || !C101093a.m132481c()) {
            SnsMethodCalculate.markEndTimeMs("isPlayingMusicAndTheSameId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isPlayingMusicAndTheSameId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return true;
    }

    /* renamed from: w */
    public boolean mo133859w() {
        SnsMethodCalculate.markStartTimeMs("isSearchMode", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        boolean z = this.f281036F;
        SnsMethodCalculate.markEndTimeMs("isSearchMode", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return z;
    }

    /* renamed from: x */
    public ArrayList<C101829pp1> mo133860x(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        ArrayList<C101829pp1> arrayList = new ArrayList<>();
        this.f281041K = i2;
        for (int i3 = 0; i3 < ((ArrayList) this.f281047h).size(); i3++) {
            SnsInfo snsInfo = (SnsInfo) ((ArrayList) this.f281047h).get(i3);
            int i4 = snsInfo.localid;
            if (!(snsInfo.getTimeLine() == null || snsInfo.getTimeLine().ContentObj == null || snsInfo.getTimeLine().ContentObj.f298427h.size() == 0 || (snsInfo.getTimeLine().ContentObj.f298424e != 1 && snsInfo.getTimeLine().ContentObj.f298424e != 15))) {
                if (i4 == i) {
                    this.f281041K = arrayList.size();
                }
                Iterator<C101804kv2> it = snsInfo.getTimeLine().ContentObj.f298427h.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    C101829pp1 pp12 = new C101829pp1();
                    pp12.f299180d = it.next();
                    pp12.f299181e = C100417r0.m131420i("sns_table_", (long) i4);
                    pp12.f299182f = snsInfo.getCreateTime();
                    pp12.f299183g = i5;
                    arrayList.add(pp12);
                    i5++;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        return arrayList;
    }

    /* renamed from: z */
    public void mo133861z(String str) {
        SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        mo133831A(true);
        SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        notifyDataSetChanged();
        SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
    }
}
