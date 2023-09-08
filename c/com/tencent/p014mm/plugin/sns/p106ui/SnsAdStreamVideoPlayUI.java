package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91999u;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.sns.model.C94836a1;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdStreamVideoView;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.ITPPlayer;
import d62.C7250m;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C86493v0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jp2.C98960j;
import jp2.C98973p;
import jp2.C98977w;
import jr2.C99015i;
import ke3.C88144b;
import kp2.C99158b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C88989a;
import os2.C100400e0;
import p214om.C11502f;
import p740wo.C53193b;
import pb1.C100714h1;
import qo3.C77407n;
import te3.C101786i2;
import te3.C101804kv2;
import te3.C64509l2;
import um0.C22655d;
import vr2.C102236a0;
import vr2.C102268v;

@C88989a(35)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI */
public class SnsAdStreamVideoPlayUI extends MMActivity implements C96814a.C57541b, C96814a.C96815a, C96814a.C96816c {

    /* renamed from: K */
    public static final /* synthetic */ int f277700K = 0;

    /* renamed from: A */
    public long f277701A;

    /* renamed from: B */
    public int f277702B;

    /* renamed from: C */
    public int f277703C;

    /* renamed from: D */
    public boolean f277704D;

    /* renamed from: E */
    public String f277705E;

    /* renamed from: F */
    public String f277706F;

    /* renamed from: G */
    public String f277707G;

    /* renamed from: H */
    public String f277708H;

    /* renamed from: I */
    public SnsInfo f277709I;

    /* renamed from: J */
    public int f277710J;

    /* renamed from: d */
    public FrameLayout f277711d;

    /* renamed from: e */
    public SnsAdStreamVideoView f277712e;

    /* renamed from: f */
    public TextView f277713f;

    /* renamed from: g */
    public String f277714g;

    /* renamed from: h */
    public String f277715h;

    /* renamed from: i */
    public String f277716i;

    /* renamed from: j */
    public String f277717j;

    /* renamed from: n */
    public String f277718n;

    /* renamed from: o */
    public boolean f277719o;

    /* renamed from: p */
    public boolean f277720p;

    /* renamed from: q */
    public String f277721q;

    /* renamed from: r */
    public C98973p f277722r = new C98973p("SnsAdStreamVideoPlayUI");

    /* renamed from: s */
    public String f277723s = "";

    /* renamed from: t */
    public String f277724t;

    /* renamed from: u */
    public String f277725u;

    /* renamed from: v */
    public int f277726v;

    /* renamed from: w */
    public int f277727w;

    /* renamed from: x */
    public String f277728x;

    /* renamed from: y */
    public String f277729y;

    /* renamed from: z */
    public String f277730z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$a */
    public class C95460a implements C11182m0 {
        public C95460a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$1");
            if (e0Var.mo107176v()) {
                e0Var.mo107125a(1002, C0966R.string.jah);
                e0Var.mo107125a(1003, C0966R.string.jai);
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI = SnsAdStreamVideoPlayUI.this;
                int i = SnsAdStreamVideoPlayUI.f277700K;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                boolean z = snsAdStreamVideoPlayUI.f277720p;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                if (!z) {
                    e0Var.mo107125a(1004, C0966R.string.jaf);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$b */
    public class C95461b implements C11184p0 {
        public C95461b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str;
            String str2;
            String str3;
            String str4;
            int i2;
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2");
            switch (menuItem.getItemId()) {
                case 1002:
                    str3 = "onMMMenuItemSelected";
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                    SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI = SnsAdStreamVideoPlayUI.this;
                    int i3 = SnsAdStreamVideoPlayUI.f277700K;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    snsAdStreamVideoPlayUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("doTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    Intent intent = new Intent();
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("select_is_ret", true);
                    intent.putExtra("mutil_select_is_ret", true);
                    intent.putExtra("ad_video_title", snsAdStreamVideoPlayUI.f277721q);
                    intent.putExtra("Retr_Msg_Type", 2);
                    C88144b.m109802t(snsAdStreamVideoPlayUI, ".ui.transmit.SelectConversationUI", intent, 999);
                    SnsMethodCalculate.markEndTimeMs("doTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    break;
                case 1003:
                    str3 = "onMMMenuItemSelected";
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                    SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI2 = SnsAdStreamVideoPlayUI.this;
                    int i4 = SnsAdStreamVideoPlayUI.f277700K;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    snsAdStreamVideoPlayUI2.getClass();
                    SnsMethodCalculate.markStartTimeMs("shareToSns", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    Intent intent2 = new Intent();
                    intent2.putExtra("Ksnsupload_link", snsAdStreamVideoPlayUI2.f277715h);
                    intent2.putExtra("Ksnsupload_type", 11);
                    intent2.putExtra("Ksnsupload_title", snsAdStreamVideoPlayUI2.f277721q);
                    intent2.putExtra("Ksnsupload_imgurl", snsAdStreamVideoPlayUI2.f277716i);
                    intent2.putExtra("KSnsStreamVideoTotalTime", snsAdStreamVideoPlayUI2.f277710J);
                    intent2.putExtra("KSnsStreamVideoWroding", snsAdStreamVideoPlayUI2.f277707G);
                    intent2.putExtra("KSnsStreamVideoWebUrl", snsAdStreamVideoPlayUI2.f277708H);
                    intent2.putExtra("KSnsStreamVideoAduxInfo", snsAdStreamVideoPlayUI2.f277724t);
                    intent2.putExtra("KSnsStreamVideoPublishId", snsAdStreamVideoPlayUI2.f277725u);
                    intent2.putExtra("need_result", true);
                    intent2.putExtra("key_snsad_statextstr", snsAdStreamVideoPlayUI2.f277705E);
                    int i5 = snsAdStreamVideoPlayUI2.f277727w;
                    String str5 = "sns_";
                    if (i5 == 1 || i5 == 2) {
                        str5 = str5 + snsAdStreamVideoPlayUI2.f277730z;
                    } else if (i5 == 3 || i5 == 4) {
                        str5 = "msg_" + snsAdStreamVideoPlayUI2.f277701A;
                    } else if (i5 == 5) {
                        str5 = "fav_" + C75592q0.m90789s() + "_" + snsAdStreamVideoPlayUI2.f277702B;
                    }
                    String a = C86493v0.m107223a(str5);
                    C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", str5);
                    intent2.putExtra("reportSessionId", a);
                    intent2.setClass(snsAdStreamVideoPlayUI2, SnsUploadUI.class);
                    snsAdStreamVideoPlayUI2.startActivityForResult(intent2, (int) C22655d.CTRL_INDEX);
                    SnsMethodCalculate.markEndTimeMs("shareToSns", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    break;
                case 1004:
                    SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI3 = SnsAdStreamVideoPlayUI.this;
                    int i6 = SnsAdStreamVideoPlayUI.f277700K;
                    SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    snsAdStreamVideoPlayUI3.getClass();
                    SnsMethodCalculate.markStartTimeMs("doFavorite", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    int i7 = snsAdStreamVideoPlayUI3.f277710J;
                    String str6 = snsAdStreamVideoPlayUI3.f277721q;
                    String str7 = snsAdStreamVideoPlayUI3.f277715h;
                    String str8 = snsAdStreamVideoPlayUI3.f277707G;
                    String str9 = snsAdStreamVideoPlayUI3.f277708H;
                    String str10 = snsAdStreamVideoPlayUI3.f277716i;
                    String str11 = snsAdStreamVideoPlayUI3.f277717j;
                    String str12 = snsAdStreamVideoPlayUI3.f277728x;
                    String str13 = str12;
                    String str14 = str10;
                    String str15 = str9;
                    ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135056NB(doFavoriteEvent, 0, i7, str6, "", str7, str8, str15, str14, str11, str13, snsAdStreamVideoPlayUI3.f277724t, snsAdStreamVideoPlayUI3.f277725u, snsAdStreamVideoPlayUI3.f277705E);
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264684i = snsAdStreamVideoPlayUI3;
                    aVar.f264688m = 24;
                    doFavoriteEvent.publish();
                    if (doFavoriteEvent.f264675e.f9046a != 0 || (i2 = snsAdStreamVideoPlayUI3.f277727w) == 0) {
                        str3 = "onMMMenuItemSelected";
                        str4 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                    } else {
                        str3 = "onMMMenuItemSelected";
                        str4 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                        C98977w.m128889e(C98977w.C98980c.Fav, snsAdStreamVideoPlayUI3.f277725u, snsAdStreamVideoPlayUI3.f277724t, snsAdStreamVideoPlayUI3.f277726v, i2, snsAdStreamVideoPlayUI3.f277728x, snsAdStreamVideoPlayUI3.f277729y, snsAdStreamVideoPlayUI3.f277730z, snsAdStreamVideoPlayUI3.f277701A, snsAdStreamVideoPlayUI3.f277702B, snsAdStreamVideoPlayUI3.f277703C, 0);
                    }
                    if (snsAdStreamVideoPlayUI3.f277704D) {
                        C102236a0.m134773u0(new SnsAdClick(0, 6, snsAdStreamVideoPlayUI3.f277709I.field_snsId, 11, 0));
                    }
                    SnsMethodCalculate.markEndTimeMs("doFavorite", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    break;
                default:
                    str = "onMMMenuItemSelected";
                    str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$2";
                    break;
            }
            str = str3;
            str2 = str4;
            SnsMethodCalculate.markEndTimeMs(str, str2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$c */
    public class C95462c implements C77407n.C47880p {
        public C95462c(SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI) {
        }

        public void onDismiss() {
            SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$3");
            SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$d */
    public class C95463d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77407n f277733d;

        public C95463d(SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI, C77407n nVar) {
            this.f277733d = nVar;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$4");
            this.f277733d.mo107573q();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$4");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$e */
    public class C95464e implements MenuItem.OnMenuItemClickListener {
        public C95464e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$5");
            SnsAdStreamVideoPlayUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$5");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$f */
    public class C95465f implements View.OnClickListener {
        public C95465f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdStreamVideoPlayUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$6");
            SnsAdStreamVideoPlayUI.m121899H7(SnsAdStreamVideoPlayUI.this).setIsShowBasicControls(true);
            if (SnsAdStreamVideoPlayUI.m121899H7(SnsAdStreamVideoPlayUI.this).isPlaying()) {
                SnsAdStreamVideoView H7 = SnsAdStreamVideoPlayUI.m121899H7(SnsAdStreamVideoPlayUI.this);
                H7.getClass();
                SnsMethodCalculate.markStartTimeMs("stopHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
                H7.f281511g1.stopTimer();
                SnsMethodCalculate.markEndTimeMs("stopHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
                SnsAdStreamVideoPlayUI.m121899H7(SnsAdStreamVideoPlayUI.this).mo134041j0();
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$6");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdStreamVideoPlayUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$g */
    public class C95466g implements View.OnClickListener {
        public C95466g() {
        }

        public void onClick(View view) {
            String str;
            String str2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdStreamVideoPlayUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$7");
            SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI = SnsAdStreamVideoPlayUI.this;
            int i = SnsAdStreamVideoPlayUI.f277700K;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            int i2 = snsAdStreamVideoPlayUI.f277727w;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            if (i2 != 0) {
                C98977w.C98978a aVar = C98977w.C98978a.DetailInVideo;
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI2 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                String str3 = snsAdStreamVideoPlayUI2.f277725u;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI3 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                String str4 = snsAdStreamVideoPlayUI3.f277724t;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI4 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                int i3 = snsAdStreamVideoPlayUI4.f277726v;
                SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI5 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                int i4 = snsAdStreamVideoPlayUI5.f277727w;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI6 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                String str5 = snsAdStreamVideoPlayUI6.f277728x;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI7 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                String str6 = snsAdStreamVideoPlayUI7.f277729y;
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI8 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                String str7 = snsAdStreamVideoPlayUI8.f277730z;
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI9 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                str = "onClick";
                str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$7";
                long j = snsAdStreamVideoPlayUI9.f277701A;
                SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI10 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                int i5 = snsAdStreamVideoPlayUI10.f277702B;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI11 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                int i6 = snsAdStreamVideoPlayUI11.f277703C;
                SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                int i7 = i5;
                C98977w.m128886b(aVar, str3, str4, i3, i4, str5, str6, str7, j, i7, i6);
            } else {
                str = "onClick";
                str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$7";
            }
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI12 = SnsAdStreamVideoPlayUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            String str8 = snsAdStreamVideoPlayUI12.f277705E;
            SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            bundle.putString("key_snsad_statextstr", str8);
            SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI13 = SnsAdStreamVideoPlayUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            String str9 = snsAdStreamVideoPlayUI13.f277708H;
            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI14 = SnsAdStreamVideoPlayUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            boolean z = snsAdStreamVideoPlayUI14.f277704D;
            SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            if (z) {
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI15 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                String str10 = snsAdStreamVideoPlayUI15.f277724t;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                if (!TextUtils.isEmpty(str10)) {
                    SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI16 = SnsAdStreamVideoPlayUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    String str11 = snsAdStreamVideoPlayUI16.f277724t;
                    SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                    str9 = C102236a0.m134734b(str9, str11);
                }
            }
            intent.putExtra("jsapiargs", bundle);
            intent.putExtra("rawUrl", str9);
            intent.putExtra("useJs", true);
            SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI17 = SnsAdStreamVideoPlayUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            boolean z2 = snsAdStreamVideoPlayUI17.f277704D;
            SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            if (z2) {
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI18 = SnsAdStreamVideoPlayUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsInfo snsInfo = snsAdStreamVideoPlayUI18.f277709I;
                SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                C102236a0.m134773u0(new SnsAdClick(0, 6, snsInfo.field_snsId, 18, 0));
            }
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, SnsAdStreamVideoPlayUI.this);
            SnsAdStreamVideoPlayUI.this.finish();
            String str12 = str;
            SnsMethodCalculate.markEndTimeMs(str12, str2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdStreamVideoPlayUI$7", "android/view/View$OnClickListener", str12, "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$h */
    public class C95467h implements C94853e.C94861h {

        /* renamed from: d */
        public String f277737d;

        public C95467h(String str) {
            this.f277737d = str;
        }

        public void onImageFinish(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
            if (!Util.isNullOrNil(str, this.f277737d) && str.equals(this.f277737d)) {
                Log.m105925i("MicroMsg.SnsAdStreamVideoPlayUI", "download image finish %s", str);
                SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI = SnsAdStreamVideoPlayUI.this;
                int i = SnsAdStreamVideoPlayUI.f277700K;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                String str2 = snsAdStreamVideoPlayUI.f277717j;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                Bitmap decodeFile = BitmapUtil.decodeFile(str2, (BitmapFactory.Options) null);
                if (decodeFile != null) {
                    SnsAdStreamVideoPlayUI.m121899H7(SnsAdStreamVideoPlayUI.this).setCover(decodeFile);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        }

        public void onSetbg() {
            SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
            SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        }

        public void onSightFinish(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
            SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        }

        public void onThumbFinish(String str) {
            SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
            SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ SnsAdStreamVideoView m121899H7(SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsAdStreamVideoView snsAdStreamVideoView = snsAdStreamVideoPlayUI.f277712e;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return snsAdStreamVideoView;
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markEndTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markEndTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    /* renamed from: I3 */
    public void mo22957I3(String str, String str2, Boolean bool) {
        SnsMethodCalculate.markStartTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markEndTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        Log.m105925i("MicroMsg.SnsAdStreamVideoPlayUI", "%s video ended", str2);
        this.f277722r.f290185j.f290740b++;
        this.f277712e.stop();
        SnsAdStreamVideoView snsAdStreamVideoView = this.f277712e;
        snsAdStreamVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        snsAdStreamVideoView.f283589h.setVisibility(0);
        SnsMethodCalculate.markEndTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        SnsAdStreamVideoView snsAdStreamVideoView2 = this.f277712e;
        snsAdStreamVideoView2.getClass();
        SnsMethodCalculate.markStartTimeMs("stopHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        snsAdStreamVideoView2.f281511g1.stopTimer();
        SnsMethodCalculate.markEndTimeMs("stopHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        this.f277712e.setIsShowBasicControls(true);
        SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        Log.m105925i("MicroMsg.SnsAdStreamVideoPlayUI", "%s prepared, video total time %d", str2, Integer.valueOf(this.f277712e.getVideoDurationSec()));
        this.f277712e.mo134041j0();
        if (this.f277710J == 0) {
            this.f277710J = this.f277712e.getVideoDurationSec();
        }
        this.f277722r.f290185j.f290744f = getResources().getConfiguration().orientation == 2 ? 2 : 1;
        this.f277722r.f290185j.f290745g = Util.currentTicks();
        C99158b bVar = this.f277722r.f290185j;
        bVar.f290743e = 2;
        bVar.f290741c = 0;
        bVar.f290739a++;
        bVar.f290745g = Util.currentTicks();
        SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        Log.m105919d("MicroMsg.SnsAdStreamVideoPlayUI", "%s video paused", str2);
        C99158b bVar = this.f277722r.f290185j;
        bVar.f290741c += (int) Util.ticksToNow(bVar.f290745g);
        SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    public void finish() {
        String str;
        SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markStartTimeMs("stopPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        Log.m105924i("MicroMsg.SnsAdStreamVideoPlayUI", "stop play");
        this.f277712e.mo79616c();
        this.f277712e.mo134041j0();
        C94866e1.Vx0().mo130998w(this.f277718n, (Object[]) null);
        SnsMethodCalculate.markEndTimeMs("stopPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (!(this.f277722r == null || (str = this.f277723s) == null || str.length() <= 0)) {
            this.f277722r.mo138333f();
            Intent intent = new Intent();
            intent.putExtra("KComponentCid", this.f277723s);
            intent.putExtra("KStreamVideoPlayCount", this.f277722r.f290181f);
            intent.putExtra("KStreamVideoPlayCompleteCount", this.f277722r.f290182g);
            intent.putExtra("KStreamVideoTotalPlayTimeInMs", this.f277722r.f290183h);
            setResult(-1, intent);
        }
        int i = this.f277727w;
        if (i != 0) {
            C98977w.m128886b(C98977w.C98978a.LeaveCompleteVideo, this.f277725u, this.f277724t, this.f277726v, i, this.f277728x, this.f277729y, this.f277730z, this.f277701A, this.f277702B, this.f277703C);
        }
        if (this.f277704D) {
            SnsMethodCalculate.markStartTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            SnsInfo snsInfo = this.f277709I;
            int adRecSrc = snsInfo == null ? 0 : snsInfo.getAdRecSrc();
            if (this.f277709I == null) {
                SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            } else {
                String d = this.f277722r.mo138331d();
                C98973p pVar = this.f277722r;
                int i2 = pVar.f290178c;
                long j = ((long) i2) - pVar.f290180e;
                if (j < 0) {
                    Log.m105921e("MicroMsg.SnsAdStreamVideoPlayUI", "reportVideo minus staytime found! totaltime[%d], offscreenTime[%ld]", Integer.valueOf(i2), Long.valueOf(this.f277722r.f290180e));
                    j = (long) this.f277722r.f290178c;
                }
                int i3 = (int) j;
                ADInfo adInfo = this.f277709I.getAdInfo();
                String str2 = adInfo == null ? "" : adInfo.waidPkg;
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C98960j(this.f277706F, 6, 2, this.f277722r.f290178c, (C101786i2) null, (C64509l2) null, 2, d, -1, adRecSrc, i3, i3, 0, this.f277709I.getAdSnsInfo().getTimelineRemindInfoSourceInfo(), this.f277709I.getAdSnsInfo().getTimelineRemindInfoSelfInfo(), str2));
                SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            }
        }
        super.finish();
        SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    public int getForceOrientation() {
        SnsMethodCalculate.markStartTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (this.f277719o) {
            SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            return 0;
        }
        SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return 4;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return C0966R.C0971layout.c1w;
    }

    public void idkeyStat(long j, long j2, long j3, boolean z) {
        SnsMethodCalculate.markStartTimeMs("idkeyStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markEndTimeMs("idkeyStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    public void initView() {
        Bitmap decodeFile;
        Class cls = C99015i.class;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        this.f277711d = (FrameLayout) findViewById(C0966R.C0970id.iwf);
        this.f277712e = (SnsAdStreamVideoView) findViewById(C0966R.C0970id.l7x);
        this.f277711d.setOnClickListener(new C95465f());
        this.f277711d.setPadding(0, 0, 0, C85875k4.m106188j(this));
        this.f277713f = (TextView) findViewById(C0966R.C0970id.jjx);
        if (!Util.isNullOrNil(this.f277707G, this.f277708H)) {
            this.f277713f.setVisibility(0);
            this.f277713f.setText(this.f277707G);
            this.f277713f.setOnClickListener(new C95466g());
        } else {
            this.f277713f.setVisibility(8);
        }
        SnsMethodCalculate.markStartTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        this.f277712e.setReporter(this);
        this.f277712e.setIMMVideoViewCallback(this);
        this.f277712e.setIMMDownloadFinish(this);
        SnsAdStreamVideoView snsAdStreamVideoView = this.f277712e;
        int i = C94866e1.f274866V;
        SnsMethodCalculate.markStartTimeMs("getSnsAdPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        String t102 = ((C99015i) C86312j.m106911c(cls)).t10();
        SnsMethodCalculate.markEndTimeMs("getSnsAdPath", "com.tencent.mm.plugin.sns.model.SnsCore");
        snsAdStreamVideoView.setRootPath(t102);
        this.f277712e.mo76636h(false, this.f277715h, 0);
        this.f277712e.setScaleType(C96814a.C96817e.CONTAIN);
        this.f277712e.setIOnlineVideoProxy(new C94836a1());
        SnsMethodCalculate.markEndTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markStartTimeMs("initThumb", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (Util.isNullOrNil(this.f277717j) || !C86013q1.m106450k(this.f277717j) || (decodeFile = BitmapUtil.decodeFile(this.f277717j, (BitmapFactory.Options) null)) == null) {
            String str = "attach" + this.f277718n;
            SnsMethodCalculate.markStartTimeMs("getSnsAdPath", "com.tencent.mm.plugin.sns.model.SnsCore");
            String t103 = ((C99015i) C86312j.m106911c(cls)).t10();
            SnsMethodCalculate.markEndTimeMs("getSnsAdPath", "com.tencent.mm.plugin.sns.model.SnsCore");
            String e = C94938q1.m120518e(t103, str);
            String Y = C102236a0.m134730Y(str);
            String str2 = e + Y;
            this.f277717j = str2;
            Log.m105925i("MicroMsg.SnsAdStreamVideoPlayUI", "try download thumb img %s, save to %s", this.f277718n, str2);
            String str3 = this.f277717j;
            String str4 = this.f277716i;
            C101804kv2 h = C91999u.m115562h(str3, 2, str4, str4, 1, 1, "");
            C102268v vVar = new C102268v(h);
            vVar.mo141832d(3);
            vVar.mo141833e(h.f298689d);
            C94866e1.Vx0().mo130978c(new C95467h(h.f298689d));
            C94853e Vx0 = C94866e1.Vx0();
            C96983o3 c = C96983o3.m124651c();
            c.f284145b = (int) (System.currentTimeMillis() / 1000);
            Vx0.mo130982g(h, 8, vVar, c, e, Y);
            SnsMethodCalculate.markEndTimeMs("initThumb", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        } else {
            this.f277712e.setCover(decodeFile);
            SnsMethodCalculate.markEndTimeMs("initThumb", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        }
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        Log.m105924i("MicroMsg.SnsAdStreamVideoPlayUI", "start play");
        if (!this.f277712e.isPlaying()) {
            if (this.f277712e.getCurrPosSec() == this.f277712e.getVideoDurationSec()) {
                SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsAdStreamVideoView snsAdStreamVideoView2 = this.f277712e;
                if (snsAdStreamVideoView2 != null) {
                    snsAdStreamVideoView2.mo79613a((double) 0, true);
                }
                SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            } else {
                int currPosSec = this.f277712e.getCurrPosSec();
                SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                SnsAdStreamVideoView snsAdStreamVideoView3 = this.f277712e;
                if (snsAdStreamVideoView3 != null) {
                    snsAdStreamVideoView3.mo79613a((double) currPosSec, true);
                }
                SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            }
            this.f277712e.start();
        }
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    public void kvStat(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsAdStreamVideoView snsAdStreamVideoView = this.f277712e;
        snsAdStreamVideoView.getClass();
        SnsMethodCalculate.markStartTimeMs("hideThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        snsAdStreamVideoView.f283589h.setVisibility(4);
        SnsMethodCalculate.markEndTimeMs("hideThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    /* renamed from: o */
    public void mo129208o(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        Log.m105925i("MicroMsg.SnsAdStreamVideoPlayUI", "%s download finish", str);
        this.f277722r.f290177b = 1;
        SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Iterator<String> it;
        String str6;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        String str7 = "onActivityResult";
        String str8 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI";
        SnsMethodCalculate.markStartTimeMs(str7, str8);
        int i5 = -1;
        if (999 != i3) {
            str2 = str7;
            str = str8;
        } else if (-1 == i4) {
            String stringExtra = intent2.getStringExtra("Select_Conv_User");
            String stringExtra2 = intent2.getStringExtra("custom_send_text");
            Iterator<String> it4 = Util.stringsToList(stringExtra.split(",")).iterator();
            while (it4.hasNext()) {
                String next = it4.next();
                Log.m105925i("MicroMsg.SnsAdStreamVideoPlayUI", "send sight to %s", next);
                SnsMethodCalculate.markStartTimeMs("sendAppMsg", str8);
                C68070l.C68072b bVar = new C68070l.C68072b();
                bVar.f195570f = this.f277721q;
                bVar.f195582i = 4;
                if (!Util.isNullOrNil(this.f277714g)) {
                    bVar.f195586j = this.f277714g;
                } else {
                    bVar.f195586j = this.f277715h;
                }
                String str9 = this.f277716i;
                bVar.f195646y = str9;
                bVar.f195541W1 = this.f277715h;
                bVar.f195544X1 = this.f277710J;
                bVar.f195547Y1 = this.f277721q;
                bVar.f195553a2 = this.f277708H;
                bVar.f195550Z1 = this.f277707G;
                bVar.f195557b2 = str9;
                bVar.f195561c2 = this.f277724t;
                bVar.f195565d2 = this.f277725u;
                bVar.f195535U1 = this.f277705E;
                byte[] O = C86013q1.m106433O(this.f277717j, 0, i5);
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(O == null ? 0 : O.length);
                Log.m105925i("MicroMsg.SnsAdStreamVideoPlayUI", "read buf size %d", objArr);
                if (C80996q.C1279a.m1369a() != null) {
                    str3 = "sendAppMsg";
                    C80996q.C1279a.m1369a().mo112827qE(bVar, "", "", next, "", O);
                } else {
                    str3 = "sendAppMsg";
                }
                SnsMethodCalculate.markEndTimeMs(str3, str8);
                C7250m.m7431a().mo136252Ar(stringExtra2, next);
                if (this.f277704D) {
                    C102236a0.m134773u0(new SnsAdClick(0, 6, this.f277709I.field_snsId, 12, 0));
                }
                if (this.f277727w != 0) {
                    boolean U5 = C72996z1.m85820U5(next);
                    it = it4;
                    str6 = stringExtra2;
                    str5 = str7;
                    str4 = str8;
                    C98977w.m128889e(U5 ? C98977w.C98980c.Chatroom : C98977w.C98980c.Chat, this.f277725u, this.f277724t, this.f277726v, this.f277727w, this.f277728x, this.f277729y, this.f277730z, this.f277701A, this.f277702B, this.f277703C, U5 ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(next) : 0);
                } else {
                    str5 = str7;
                    str4 = str8;
                    it = it4;
                    str6 = stringExtra2;
                }
                Intent intent3 = intent;
                stringExtra2 = str6;
                it4 = it;
                str7 = str5;
                str8 = str4;
                i5 = -1;
            }
            str2 = str7;
            str = str8;
            C75026b.m89951a(this, getString(C0966R.string.fjh));
        } else {
            str2 = str7;
            str = str8;
            if (this.f277704D) {
                C102236a0.m134773u0(new SnsAdClick(0, 6, this.f277709I.field_snsId, 13, 0));
            }
        }
        if (998 == i3) {
            int i6 = this.f277727w;
            if (i6 != 0) {
                C98977w.m128889e(C98977w.C98980c.Sns, this.f277725u, this.f277724t, this.f277726v, i6, this.f277728x, this.f277729y, this.f277730z, this.f277701A, this.f277702B, this.f277703C, 0);
            }
            if (-1 == i4) {
                if (this.f277704D) {
                    C102236a0.m134773u0(new SnsAdClick(0, 6, this.f277709I.field_snsId, 15, 0));
                }
            } else if (this.f277704D) {
                C102236a0.m134773u0(new SnsAdClick(0, 6, this.f277709I.field_snsId, 16, 0));
            }
        }
        super.onActivityResult(i, i2, intent);
        SnsMethodCalculate.markEndTimeMs(str2, str);
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        super.onCreate(bundle);
        this.f277714g = getIntent().getStringExtra("KUrl");
        this.f277715h = getIntent().getStringExtra("KStremVideoUrl");
        this.f277716i = getIntent().getStringExtra("KThumUrl");
        this.f277717j = getIntent().getStringExtra("KThumbPath");
        this.f277718n = getIntent().getStringExtra("KMediaId");
        this.f277719o = getIntent().getBooleanExtra("ForceLandscape", false);
        this.f277720p = getIntent().getBooleanExtra("KBlockFav", false);
        this.f277721q = Util.nullAs(getIntent().getStringExtra("KMediaTitle"), "");
        this.f277710J = getIntent().getIntExtra("KMediaVideoTime", 0);
        String stringExtra = getIntent().getStringExtra("KSta_SnSId");
        C100400e0 Yx0 = C94866e1.Yx0();
        this.f277709I = Yx0.mo139807TE("" + C102236a0.m134706B0(stringExtra));
        this.f277704D = getIntent().getBooleanExtra("KFromTimeLine", false);
        this.f277722r.f290179d = Util.currentTicks();
        this.f277723s = getIntent().getStringExtra("KComponentCid");
        this.f277724t = getIntent().getStringExtra("KSta_StremVideoAduxInfo");
        this.f277725u = getIntent().getStringExtra("KSta_StremVideoPublishId");
        this.f277726v = getIntent().getIntExtra("KSta_SourceType", 0);
        this.f277727w = getIntent().getIntExtra("KSta_Scene", 0);
        this.f277728x = getIntent().getStringExtra("KSta_FromUserName");
        this.f277729y = getIntent().getStringExtra("KSta_ChatName");
        this.f277730z = getIntent().getStringExtra("KSta_SnSId");
        this.f277701A = getIntent().getLongExtra("KSta_MsgId", 0);
        this.f277702B = getIntent().getIntExtra("KSta_FavID", 0);
        this.f277703C = getIntent().getIntExtra("KSta_ChatroomMembercount", 0);
        this.f277705E = getIntent().getStringExtra("KSta_SnsStatExtStr");
        this.f277706F = Util.nullAs(getIntent().getStringExtra("KViewId"), "");
        this.f277707G = getIntent().getStringExtra("StreamWording");
        this.f277708H = getIntent().getStringExtra("StremWebUrl");
        setMMTitle("");
        C77407n nVar = new C77407n((Context) this, 1, false);
        nVar.f225771i = new C95460a();
        nVar.f225782p = new C95461b();
        nVar.f225761d = new C95462c(this);
        addIconOptionMenu(1001, C0966R.C0969drawable.f357091bt3, new C95463d(this, nVar));
        setBackBtn(new C95464e(), C0966R.C0969drawable.f357090bt2);
        SnsMethodCalculate.markStartTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        getWindow().getDecorView().setSystemUiVisibility(1792);
        SnsMethodCalculate.markEndTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        setActionbarColor(getResources().getColor(C0966R.color.ahf));
        setNavigationbarColor(getResources().getColor(C0966R.color.ahf));
        initView();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (i == 4) {
            finish();
            SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return false;
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        super.onResume();
        C98973p pVar = this.f277722r;
        if (pVar != null) {
            pVar.mo138330c();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
        SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        super.onStop();
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        Log.m105924i("MicroMsg.SnsAdStreamVideoPlayUI", "pause play");
        this.f277712e.pause();
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (this.f277704D) {
            int i = getResources().getConfiguration().orientation;
            SnsMethodCalculate.markStartTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            this.f277722r.mo138332e(this.f277712e.getCurrPosSec());
            this.f277722r.f290185j.f290745g = Util.currentTicks();
            C99158b bVar = this.f277722r.f290185j;
            bVar.f290744f = i == 2 ? 2 : 1;
            bVar.f290743e = 2;
            SnsMethodCalculate.markEndTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        }
        C98973p pVar = this.f277722r;
        if (pVar != null) {
            pVar.mo138329b();
        }
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }
}
