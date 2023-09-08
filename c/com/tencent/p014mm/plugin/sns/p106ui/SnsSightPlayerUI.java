package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.SnsAdLongVideoBrowseStatusChangedForDataReportEvent;
import com.tencent.p014mm.autogen.events.SnsFavFeedForDataReportEvent;
import com.tencent.p014mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent;
import com.tencent.p014mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent;
import com.tencent.p014mm.autogen.events.UIStatusChangedEvent;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83135z1;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81123l;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.decode.model.C94571a;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72932v1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96895y1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C7250m;
import di3.C86312j;
import eb0.C97621e;
import et2.C97707a;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import jp2.C98960j;
import jp2.C98973p;
import jp2.C98977w;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kp2.C99158b;
import nj3.C11184p0;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C89137b0;
import p158gt.C98201k;
import p206nj.C11171e;
import p206nj.C76861g;
import p214om.C11502f;
import p740wo.C53193b;
import pe3.C89349b;
import sn0.C90259e;
import te3.C101786i2;
import te3.C101804kv2;
import te3.C64509l2;
import te3.sc4;
import te3.tc4;
import vr2.C102236a0;
import vr2.C102268v;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI */
public class SnsSightPlayerUI extends MMActivity implements C97621e.C97622a, C94853e.C94861h {

    /* renamed from: Y */
    public static final /* synthetic */ int f278433Y = 0;

    /* renamed from: A */
    public ADInfo f278434A = null;

    /* renamed from: B */
    public C101804kv2 f278435B = null;

    /* renamed from: C */
    public TextView f278436C = null;

    /* renamed from: D */
    public boolean f278437D = false;

    /* renamed from: E */
    public ImageView f278438E;

    /* renamed from: F */
    public int f278439F = 0;

    /* renamed from: G */
    public int f278440G = 0;

    /* renamed from: H */
    public int f278441H = 0;

    /* renamed from: I */
    public int f278442I = 0;

    /* renamed from: J */
    public C45059m0 f278443J;

    /* renamed from: K */
    public Bundle f278444K;

    /* renamed from: L */
    public boolean f278445L = false;

    /* renamed from: M */
    public boolean f278446M = false;

    /* renamed from: N */
    public boolean f278447N = false;

    /* renamed from: P */
    public float f278448P = 1.0f;

    /* renamed from: Q */
    public int f278449Q = 0;

    /* renamed from: R */
    public int f278450R = 0;

    /* renamed from: S */
    public GestureDetector f278451S;

    /* renamed from: T */
    public VelocityTracker f278452T;

    /* renamed from: U */
    public boolean f278453U = false;

    /* renamed from: V */
    public View.OnCreateContextMenuListener f278454V = new C95598b();

    /* renamed from: W */
    public C11184p0 f278455W = new C95599c();

    /* renamed from: X */
    public int f278456X = 0;

    /* renamed from: d */
    public C98973p f278457d = new C98973p("SnsSightPlayerUI");

    /* renamed from: e */
    public String f278458e = "";

    /* renamed from: f */
    public String f278459f = "";

    /* renamed from: g */
    public String f278460g = "";

    /* renamed from: h */
    public boolean f278461h = false;

    /* renamed from: i */
    public C96875r0 f278462i = null;

    /* renamed from: j */
    public TextView f278463j = null;

    /* renamed from: n */
    public TextView f278464n = null;

    /* renamed from: o */
    public MMPinProgressBtn f278465o = null;

    /* renamed from: p */
    public int f278466p = 0;

    /* renamed from: q */
    public int f278467q = 0;

    /* renamed from: r */
    public boolean f278468r = false;

    /* renamed from: s */
    public C45082x0 f278469s;

    /* renamed from: t */
    public ViewGroup f278470t;

    /* renamed from: u */
    public int f278471u = 0;

    /* renamed from: v */
    public int f278472v = 0;

    /* renamed from: w */
    public boolean f278473w = false;

    /* renamed from: x */
    public C97621e f278474x;

    /* renamed from: y */
    public boolean f278475y = false;

    /* renamed from: z */
    public SnsInfo f278476z = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$a */
    public class C95596a implements C45059m0.C45068i {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$a$a */
        public class C95597a implements Runnable {
            public C95597a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12$1");
                SnsSightPlayerUI.this.finish();
                SnsSightPlayerUI.this.overridePendingTransition(0, 0);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12$1");
            }
        }

        public C95596a() {
        }

        public void onAnimationEnd() {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12");
            new MMHandler().post(new C95597a());
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12");
        }

        public void onAnimationStart() {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12");
            if (SnsSightPlayerUI.m122217N7(SnsSightPlayerUI.this) != null) {
                SnsSightPlayerUI.m122217N7(SnsSightPlayerUI.this).setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$12");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$b */
    public class C95598b implements View.OnCreateContextMenuListener {
        public C95598b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x007b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCreateContextMenu(android.view.ContextMenu r10, android.view.View r11, android.view.ContextMenu.ContextMenuInfo r12) {
            /*
                r9 = this;
                java.lang.String r11 = "onCreateContextMenu"
                java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$13"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
                java.lang.Class<lc3.b> r0 = lc3.C10485b.class
                k40.a r0 = f40.C86709a0.m107533q(r0)
                lc3.b r0 = (lc3.C10485b) r0
                pj.f r0 = r0.vh0()
                java.lang.String r1 = "SIGHTCannotTransmitForFav"
                java.lang.String r0 = r0.mo107405c(r1)
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI"
                r2 = 0
                r3 = 1
                r4 = 2
                if (r0 != 0) goto L_0x0067
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                java.lang.String r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122220Q7(r0)
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                java.lang.String r6 = "access$2400"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
                java.lang.String r5 = r5.f278458e
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
                java.lang.Object[] r6 = new java.lang.Object[r4]
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                r6[r2] = r7
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
                r6[r3] = r7
                java.lang.String r7 = "MicroMsg.SnsSightPlayerUI"
                java.lang.String r8 = "config can forward sight, thumb existed %B, video existed %B"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
                if (r0 == 0) goto L_0x0067
                if (r5 == 0) goto L_0x0067
                r0 = 3
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                r6 = 2131836834(0x7f113fa2, float:1.9306846E38)
                java.lang.String r5 = r5.getString(r6)
                r10.add(r2, r0, r2, r5)
                r0 = 1
                goto L_0x0068
            L_0x0067:
                r0 = 0
            L_0x0068:
                java.lang.String r5 = "favorite"
                ke3.C88144b.m109788f(r5)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                r6 = 2131834033(0x7f1134b1, float:1.9301165E38)
                java.lang.String r5 = r5.getString(r6)
                r10.add(r2, r4, r2, r5)
                if (r0 == 0) goto L_0x00a0
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent r0 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent
                r0.<init>()
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$a r4 = r0.f236178d
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                java.lang.String r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122221R7(r5)
                r4.f236181b = r5
                r0.publish()
                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$b r0 = r0.f236179e
                boolean r0 = r0.f236182a
                if (r0 == 0) goto L_0x00a0
                r0 = 4
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                r5 = 2131821618(0x7f110432, float:1.9275984E38)
                java.lang.String r4 = r4.getString(r5)
                r10.add(r2, r0, r2, r4)
            L_0x00a0:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                int r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.f278433Y
                java.lang.String r4 = "access$900"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
                boolean r0 = r0.f278461h
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
                if (r0 != 0) goto L_0x00c0
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                r1 = 2131837197(0x7f11410d, float:1.9307582E38)
                java.lang.String r0 = r0.getString(r1)
                r10.add(r2, r3, r2, r0)
            L_0x00c0:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.C95598b.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$c */
    public class C95599c implements C11184p0 {
        public C95599c() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                Intent intent = new Intent();
                SnsInfo DN = C94866e1.Yx0().mo139798DN(SnsSightPlayerUI.m122221R7(SnsSightPlayerUI.this));
                if (DN != null) {
                    Log.m105924i("MicroMsg.SnsSightPlayerUI", "expose id " + DN.getSnsId());
                }
                intent.putExtra("k_expose_msg_id", DN == null ? 0 : DN.getSnsId());
                intent.putExtra("k_username", DN == null ? "" : DN.field_userName);
                intent.putExtra("showShare", false);
                intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{33}));
                C88144b.m109791i(SnsSightPlayerUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            } else if (itemId == 2) {
                SnsInfo DN2 = C94866e1.Yx0().mo139798DN(SnsSightPlayerUI.m122221R7(SnsSightPlayerUI.this));
                if (DN2 == null) {
                    SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
                    return;
                }
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                C97707a.m126006d(doFavoriteEvent, DN2);
                DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                aVar.f264684i = SnsSightPlayerUI.this;
                aVar.f264688m = 17;
                doFavoriteEvent.publish();
                SnsSightPlayerUI snsSightPlayerUI = SnsSightPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
                boolean z = snsSightPlayerUI.f278461h;
                SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
                if (z) {
                    C102236a0.m134773u0(new SnsAdClick(SnsSightPlayerUI.m122212I7(SnsSightPlayerUI.this), 5, DN2.field_snsId, 11, 0));
                    C98977w.m128888d(C98977w.C98981d.Sight, C98977w.C98980c.Fav, C98977w.C98982e.Full, 0, DN2, SnsSightPlayerUI.m122212I7(SnsSightPlayerUI.this));
                }
                if (SnsSightPlayerUI.m122212I7(SnsSightPlayerUI.this) == 0) {
                    SnsFavFeedForDataReportEvent snsFavFeedForDataReportEvent = new SnsFavFeedForDataReportEvent();
                    snsFavFeedForDataReportEvent.f265135d.f265137b = DN2.getLocalid();
                    snsFavFeedForDataReportEvent.f265135d.f265136a = C102236a0.m134728W(DN2);
                    snsFavFeedForDataReportEvent.publish();
                }
            } else if (itemId == 3) {
                SnsSightPlayerUI snsSightPlayerUI2 = SnsSightPlayerUI.this;
                int i2 = SnsSightPlayerUI.f278433Y;
                SnsMethodCalculate.markStartTimeMs("access$2502", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
                snsSightPlayerUI2.f278468r = true;
                SnsMethodCalculate.markEndTimeMs("access$2502", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
                Intent intent2 = new Intent();
                intent2.putExtra("Select_Conv_Type", 3);
                intent2.putExtra("select_is_ret", true);
                intent2.putExtra("mutil_select_is_ret", true);
                intent2.putExtra("image_path", SnsSightPlayerUI.m122220Q7(SnsSightPlayerUI.this));
                intent2.putExtra("Retr_Msg_Type", 11);
                C88144b.m109802t(SnsSightPlayerUI.this, ".ui.transmit.SelectConversationUI", intent2, 4097);
            } else if (itemId == 4) {
                SnsInfo DN3 = C94866e1.Yx0().mo139798DN(SnsSightPlayerUI.m122221R7(SnsSightPlayerUI.this));
                if (DN3 == null) {
                    SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
                    return;
                }
                Intent intent3 = new Intent();
                if (DN3.getTimeLine().ContentObj.f298424e == 15 && DN3.getTimeLine().ContentObj.f298427h.get(0) == null) {
                    Log.m105928w("MicroMsg.SnsSightPlayerUI", "send sight fail, mediaObj is null");
                    SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
                    return;
                }
                intent3.putExtra("exdevice_open_scene_type", 2);
                intent3.putExtra("sns_local_id", SnsSightPlayerUI.m122221R7(SnsSightPlayerUI.this));
                intent3.putExtra("sns_send_data_ui_activity", true);
                C88144b.m109801s(SnsSightPlayerUI.this, ".ui.chatting.ChattingSendDataToDeviceUI", intent3, (Bundle) null);
            }
            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$d */
    public class C95600d implements View.OnTouchListener {
        public C95600d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$1");
            SnsSightPlayerUI.this.mo132883V7();
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$1");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$e */
    public class C95601e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TimeLineObject f278482d;

        /* renamed from: e */
        public final /* synthetic */ String f278483e;

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$e$a */
        public class C95602a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Intent f278485d;

            public C95602a(Intent intent) {
                this.f278485d = intent;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2$1");
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(this.f278485d, SnsSightPlayerUI.this);
                SnsSightPlayerUI.this.finish();
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2$1");
            }
        }

        public C95601e(TimeLineObject timeLineObject, String str) {
            this.f278482d = timeLineObject;
            this.f278483e = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2");
            C98977w.C98978a aVar = C98977w.C98978a.DetailInVideo;
            String str = this.f278482d.f283893Id;
            String str2 = SnsSightPlayerUI.m122211H7(SnsSightPlayerUI.this) == null ? "" : SnsSightPlayerUI.m122211H7(SnsSightPlayerUI.this).uxInfo;
            TimeLineObject timeLineObject = this.f278482d;
            C98977w.m128886b(aVar, str, str2, 1, 1, timeLineObject.UserName, (String) null, timeLineObject.f283893Id, 0, 0, 0);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("key_snsad_statextstr", this.f278482d.statExtStr);
            String str3 = this.f278483e;
            if (SnsSightPlayerUI.m122211H7(SnsSightPlayerUI.this) != null) {
                str3 = C102236a0.m134734b(str3, SnsSightPlayerUI.m122211H7(SnsSightPlayerUI.this).uxInfo);
            }
            intent.putExtra("jsapiargs", bundle);
            intent.putExtra("rawUrl", str3);
            intent.putExtra("useJs", true);
            C102236a0.m134773u0(new SnsAdClick(SnsSightPlayerUI.m122212I7(SnsSightPlayerUI.this), 5, SnsSightPlayerUI.m122218O7(SnsSightPlayerUI.this).field_snsId, 18, 0));
            new MMHandler(Looper.getMainLooper()).post(new C95602a(intent));
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$f */
    public class C95603f implements View.OnClickListener {
        public C95603f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$3");
            if (SnsSightPlayerUI.m122218O7(SnsSightPlayerUI.this).isAd()) {
                C98977w.m128885a(C98977w.C98979b.Sight, C98977w.C98978a.EnterCompleteVideo, SnsSightPlayerUI.m122218O7(SnsSightPlayerUI.this), SnsSightPlayerUI.m122212I7(SnsSightPlayerUI.this));
            }
            Intent intent = new Intent();
            String e = C94938q1.m120518e(C94866e1.m120262YO(), SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298689d);
            String K = C102236a0.m134716K(SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this));
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
                intent.setClass(SnsSightPlayerUI.this, SnsAdStreamVideoPlayUI.class);
                Log.m105924i("MicroMsg.SnsSightPlayerUI", "use new stream video play UI");
            } else {
                intent.setClass(SnsSightPlayerUI.this, VideoAdPlayerUI.class);
            }
            intent.putExtra("KFullVideoPath", e + K);
            intent.putExtra("KThumbPath", SnsSightPlayerUI.m122220Q7(SnsSightPlayerUI.this));
            intent.putExtra("KFromTimeLine", true);
            intent.putExtra("KStremVideoUrl", SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298706x);
            intent.putExtra("KThumUrl", Util.isNullOrNil(SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298669B) ? SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298694i : SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298669B);
            intent.putExtra("KMediaId", SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298689d);
            intent.putExtra("KUrl", SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298692g);
            intent.putExtra("KViewId", SnsSightPlayerUI.m122211H7(SnsSightPlayerUI.this).viewId);
            TimeLineObject timeLine = SnsSightPlayerUI.m122218O7(SnsSightPlayerUI.this).getTimeLine();
            intent.putExtra("KSta_StremVideoAduxInfo", SnsSightPlayerUI.m122211H7(SnsSightPlayerUI.this) == null ? "" : SnsSightPlayerUI.m122211H7(SnsSightPlayerUI.this).uxInfo);
            intent.putExtra("KSta_StremVideoPublishId", timeLine.f283893Id);
            intent.putExtra("KSta_SourceType", 1);
            intent.putExtra("KSta_Scene", 1);
            intent.putExtra("KSta_FromUserName", timeLine.UserName);
            intent.putExtra("KSta_SnSId", timeLine.f283893Id);
            intent.putExtra("KSta_SnsStatExtStr", timeLine.statExtStr);
            intent.putExtra("KMediaVideoTime", SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298668A);
            intent.putExtra("KMediaTitle", Util.isNullOrNil(SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298670C) ? timeLine.ContentDesc : SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298670C);
            ADXml adXml = SnsSightPlayerUI.m122218O7(SnsSightPlayerUI.this).getAdXml();
            if (adXml != null && adXml.attachShareLinkIsHidden == 0) {
                intent.putExtra("StreamWording", adXml.attachShareLinkWording);
                intent.putExtra("StremWebUrl", adXml.attachShareLinkUrl);
            }
            SnsInfo DN = C94866e1.Yx0().mo139798DN(SnsSightPlayerUI.m122221R7(SnsSightPlayerUI.this));
            if (SnsSightPlayerUI.m122212I7(SnsSightPlayerUI.this) == 0) {
                C91998s.m115550d(C83135z1.CTRL_INDEX);
            } else {
                C91998s.m115549c(C83135z1.CTRL_INDEX);
            }
            C102236a0.m134728W(DN);
            int i = DN.field_type;
            DN.getUxinfo();
            int i2 = SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298668A;
            C91998s d = SnsSightPlayerUI.m122212I7(SnsSightPlayerUI.this) == 0 ? C91998s.m115550d(C81123l.CTRL_INDEX) : C91998s.m115549c(C81123l.CTRL_INDEX);
            C102236a0.m134728W(DN);
            DN.getUxinfo();
            int i3 = SnsSightPlayerUI.m122219P7(SnsSightPlayerUI.this).f298668A;
            d.mo125842g(intent);
            SnsSightPlayerUI snsSightPlayerUI = SnsSightPlayerUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SnsSightPlayerUI snsSightPlayerUI2 = snsSightPlayerUI;
            C117292a.m165358d(snsSightPlayerUI2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            snsSightPlayerUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(snsSightPlayerUI2, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C102236a0.m134773u0(new SnsAdClick(SnsSightPlayerUI.m122212I7(SnsSightPlayerUI.this), 5, DN.field_snsId, 14, 0));
            if (SnsSightPlayerUI.m122212I7(SnsSightPlayerUI.this) == 0) {
                SnsAdLongVideoBrowseStatusChangedForDataReportEvent snsAdLongVideoBrowseStatusChangedForDataReportEvent = new SnsAdLongVideoBrowseStatusChangedForDataReportEvent();
                snsAdLongVideoBrowseStatusChangedForDataReportEvent.f265123d.f265124a = true;
                snsAdLongVideoBrowseStatusChangedForDataReportEvent.publish();
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$g */
    public class C95604g implements C96875r0.C96876a {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$g$a */
        public class C5448a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f21192d;

            /* renamed from: e */
            public final /* synthetic */ String f21193e;

            public C5448a(Bitmap bitmap, String str) {
                this.f21192d = bitmap;
                this.f21193e = str;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4$1");
                ImageView imageView = (ImageView) SnsSightPlayerUI.this.findViewById(C0966R.C0970id.f359495l82);
                if (imageView != null) {
                    imageView.setImageBitmap(this.f21192d);
                    imageView.setVisibility(0);
                }
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                FileProviderHelper.setIntentDataAndType((Context) SnsSightPlayerUI.this.getContext(), intent, new C86009m1(this.f21193e), "video/*", false);
                try {
                    AppCompatActivity context = SnsSightPlayerUI.this.getContext();
                    Intent createChooser = Intent.createChooser(intent, SnsSightPlayerUI.this.getContext().getString(C0966R.string.cs8));
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(createChooser);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.SnsSightPlayerUI", "startActivity fail, activity not found");
                    C76879j.m92738i(SnsSightPlayerUI.this.getContext(), C0966R.string.cpc, C0966R.string.cpd);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$g$b */
        public class C95605b implements Runnable {
            public C95605b() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4$2");
                if (SnsSightPlayerUI.m122213J7(SnsSightPlayerUI.this).getVisibility() != 0) {
                    SnsSightPlayerUI.m122213J7(SnsSightPlayerUI.this).setVisibility(0);
                    SnsSightPlayerUI.m122213J7(SnsSightPlayerUI.this).startAnimation(AnimationUtils.loadAnimation(SnsSightPlayerUI.this.getContext(), C0966R.C0968anim.f2393bw));
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4$2");
            }
        }

        public C95604g() {
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
            SnsMethodCalculate.markEndTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
            return 0;
        }

        public void onCompletion() {
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
            Log.m105918d("MicroMsg.SnsSightPlayerUI", "on completion");
            SnsSightPlayerUI snsSightPlayerUI = SnsSightPlayerUI.this;
            int i = SnsSightPlayerUI.f278433Y;
            SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            boolean z = snsSightPlayerUI.f278461h;
            SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            if (!z) {
                SnsSightPlayerUI.m122213J7(SnsSightPlayerUI.this).post(new C95605b());
            }
            SnsSightPlayerUI.m122222S7(SnsSightPlayerUI.this).setLoop(true);
            SnsSightPlayerUI snsSightPlayerUI2 = SnsSightPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            C98973p pVar = snsSightPlayerUI2.f278457d;
            SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            pVar.f290185j.f290740b++;
            SnsSightPlayerUI snsSightPlayerUI3 = SnsSightPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            snsSightPlayerUI3.mo132884W7(false);
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
        }

        public void onError(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
            Log.m105921e("MicroMsg.SnsSightPlayerUI", "on play video error, what %d extra %d", Integer.valueOf(i), Integer.valueOf(i2));
            SnsSightPlayerUI.m122222S7(SnsSightPlayerUI.this).stop();
            SnsSightPlayerUI snsSightPlayerUI = SnsSightPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            boolean z = snsSightPlayerUI.f278475y;
            SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            if (z) {
                SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
                return;
            }
            SnsSightPlayerUI snsSightPlayerUI2 = SnsSightPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            snsSightPlayerUI2.f278475y = true;
            SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            CrashReportFactory.reportRawMessage(Base64.encodeToString((C94555d.m119566b() + "[SnsSightPlayerUI] on play video error, what " + i + " extra " + i2 + ", path=" + Util.nullAs(SnsSightPlayerUI.m122220Q7(SnsSightPlayerUI.this), "")).getBytes(), 2), "FullScreenPlaySight");
            String Q7 = SnsSightPlayerUI.m122220Q7(SnsSightPlayerUI.this);
            MMHandlerThread.postToMainThread(new C5448a(((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).fq0(Q7, C76577a.m92156g(SnsSightPlayerUI.this.getContext()), SnsSightPlayerUI.this.getContext(), -1), Q7));
            SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
        }

        public void onPrepared() {
            SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
            Log.m105918d("MicroMsg.SnsSightPlayerUI", C76861g.m92659b() + " onPrepared");
            SnsSightPlayerUI snsSightPlayerUI = SnsSightPlayerUI.this;
            int i = SnsSightPlayerUI.f278433Y;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            snsSightPlayerUI.mo132884W7(true);
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
            SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$h */
    public class C95606h implements View.OnClickListener {
        public C95606h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$5");
            SnsSightPlayerUI.this.mo132883V7();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$i */
    public class C95607i implements View.OnClickListener {
        public C95607i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$6");
            SnsSightPlayerUI.this.mo132883V7();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$6");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$j */
    public class C95608j extends GestureDetector.SimpleOnGestureListener {
        public C95608j() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$7", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$7", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$7", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$7", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$7", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$7");
            SnsSightPlayerUI.m122215L7(SnsSightPlayerUI.this, true);
            super.onLongPress(motionEvent);
            SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$7");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$7", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$7");
            float translationX = (((View) SnsSightPlayerUI.m122222S7(SnsSightPlayerUI.this)).getTranslationX() + motionEvent2.getX()) - motionEvent.getX();
            float translationY = (((View) SnsSightPlayerUI.m122222S7(SnsSightPlayerUI.this)).getTranslationY() + motionEvent2.getY()) - motionEvent.getY();
            if (SnsSightPlayerUI.m122214K7(SnsSightPlayerUI.this)) {
                ((View) SnsSightPlayerUI.m122222S7(SnsSightPlayerUI.this)).setTranslationX(translationX);
                ((View) SnsSightPlayerUI.m122222S7(SnsSightPlayerUI.this)).setTranslationY(translationY);
            }
            SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$7");
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$7", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$7", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$k */
    public class C95609k implements View.OnTouchListener {
        public C95609k() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00fc, code lost:
            if (r14 != false) goto L_0x00fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0129, code lost:
            if (r7 >= r10) goto L_0x012b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x012b, code lost:
            if (r13 < 0) goto L_0x012d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0132, code lost:
            if (((double) r7) < 0.5d) goto L_0x01bc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0134, code lost:
            r10 = r6.f278493d;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            r10.f278449Q = (int) r2;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            r2 = r6.f278493d;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2202", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            r2.f278450R = (int) r12;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2202", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            r2 = r6.f278493d;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2002", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            r2.f278448P = r7;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2002", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0160, code lost:
            if (com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122217N7(r6.f278493d) == null) goto L_0x016d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0162, code lost:
            com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122217N7(r6.f278493d).setVisibility(8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x016d, code lost:
            ((android.view.View) com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r6.f278493d)).setPivotX((float) (r6.f278493d.f278470t.getWidth() / 2));
            ((android.view.View) com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r6.f278493d)).setPivotY((float) (r6.f278493d.f278470t.getHeight() / 2));
            ((android.view.View) com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r6.f278493d)).setScaleX(r7);
            ((android.view.View) com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r6.f278493d)).setScaleY(r7);
            r2 = r6.f278493d;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            r2 = r2.f278438E;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            r2.setAlpha(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x01bc, code lost:
            r2 = r6.f278493d;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            r2.f278445L = true;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r18, android.view.MotionEvent r19) {
            /*
                r17 = this;
                r6 = r17
                r7 = r19
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r18
                r0.add(r1)
                r0.add(r7)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$8"
                java.lang.String r1 = "android/view/View$OnTouchListener"
                java.lang.String r2 = "onTouch"
                java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r4 = r17
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                java.lang.String r0 = "onTouch"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$8"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                int r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.f278433Y
                java.lang.String r3 = "access$1400"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                android.view.GestureDetector r2 = r2.f278451S
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                k20.a r3 = new k20.a
                r3.<init>()
                r3.mo10233c(r7)
                java.lang.Object[] r9 = r3.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$8"
                java.lang.String r11 = "onTouch"
                java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r13 = "android/view/GestureDetector_EXEC_"
                java.lang.String r14 = "onTouchEvent"
                java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
                r8 = r2
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                r5 = 0
                java.lang.Object r3 = r3.mo10231a(r5)
                android.view.MotionEvent r3 = (android.view.MotionEvent) r3
                boolean r9 = r2.onTouchEvent(r3)
                java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$8"
                java.lang.String r11 = "onTouch"
                java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                java.lang.String r13 = "android/view/GestureDetector_EXEC_"
                java.lang.String r14 = "onTouchEvent"
                java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
                j20.C117292a.m165360f(r8, r9, r10, r11, r12, r13, r14, r15)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.view.VelocityTracker r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122216M7(r2)
                java.lang.String r3 = "access$1502"
                if (r2 != 0) goto L_0x0090
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                r2.f278452T = r8
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            L_0x0090:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.view.VelocityTracker r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122216M7(r2)
                r2.addMovement(r7)
                int r2 = r19.getAction()
                r2 = r2 & 255(0xff, float:3.57E-43)
                if (r2 == 0) goto L_0x0323
                r7 = 1065353216(0x3f800000, float:1.0)
                r8 = 2
                r9 = 1
                java.lang.String r10 = "access$1300"
                java.lang.String r11 = "access$1202"
                if (r2 == r9) goto L_0x023c
                if (r2 == r8) goto L_0x00af
                goto L_0x0343
            L_0x00af:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                float r2 = r2.getTranslationX()
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r12 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r12 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r12)
                android.view.View r12 = (android.view.View) r12
                float r12 = r12.getTranslationY()
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.view.VelocityTracker r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122216M7(r13)
                r14 = 1000(0x3e8, float:1.401E-42)
                r13.computeCurrentVelocity(r14)
                float r14 = r13.getXVelocity()
                int r14 = (int) r14
                float r13 = r13.getYVelocity()
                int r13 = (int) r13
                float r15 = java.lang.Math.abs(r2)
                r16 = 1132068864(0x437a0000, float:250.0)
                int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
                if (r15 > 0) goto L_0x00fe
                int r15 = java.lang.Math.abs(r13)
                int r14 = java.lang.Math.abs(r14)
                if (r15 <= r14) goto L_0x00fe
                if (r13 <= 0) goto L_0x00fe
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r14 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r4)
                boolean r14 = r14.f278447N
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)
                if (r14 == 0) goto L_0x0106
            L_0x00fe:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r10 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                boolean r10 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122214K7(r10)
                if (r10 == 0) goto L_0x01c7
            L_0x0106:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r10 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.view.ViewGroup r10 = r10.f278470t
                int r10 = r10.getHeight()
                float r10 = (float) r10
                float r10 = r12 / r10
                float r10 = r7 - r10
                int r14 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r14 <= 0) goto L_0x0118
                goto L_0x0119
            L_0x0118:
                r7 = r10
            L_0x0119:
                if (r13 <= 0) goto L_0x012b
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r10 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                java.lang.String r14 = "access$2000"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r4)
                float r10 = r10.f278448P
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)
                int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
                if (r10 < 0) goto L_0x012d
            L_0x012b:
                if (r13 >= 0) goto L_0x01bc
            L_0x012d:
                double r13 = (double) r7
                r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r10 < 0) goto L_0x01bc
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r10 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                int r2 = (int) r2
                java.lang.String r13 = "access$2102"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r4)
                r10.f278449Q = r2
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                int r10 = (int) r12
                java.lang.String r13 = "access$2202"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r4)
                r2.f278450R = r10
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                java.lang.String r10 = "access$2002"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r4)
                r2.f278448P = r7
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.widget.TextView r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122217N7(r2)
                if (r2 == 0) goto L_0x016d
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.widget.TextView r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122217N7(r2)
                r10 = 8
                r2.setVisibility(r10)
            L_0x016d:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r10 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.view.ViewGroup r10 = r10.f278470t
                int r10 = r10.getWidth()
                int r10 = r10 / r8
                float r10 = (float) r10
                r2.setPivotX(r10)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r10 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.view.ViewGroup r10 = r10.f278470t
                int r10 = r10.getHeight()
                int r10 = r10 / r8
                float r8 = (float) r10
                r2.setPivotY(r8)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                r2.setScaleX(r7)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                r2.setScaleY(r7)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                java.lang.String r8 = "access$2300"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r4)
                android.widget.ImageView r2 = r2.f278438E
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r4)
                r2.setAlpha(r7)
            L_0x01bc:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r4)
                r2.f278445L = r9
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
                goto L_0x01d1
            L_0x01c7:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r4)
                r2.f278445L = r5
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
            L_0x01d1:
                r2 = 1128792064(0x43480000, float:200.0)
                java.lang.String r7 = "access$1802"
                int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x01e4
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
                r2.f278446M = r5
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
                goto L_0x01f4
            L_0x01e4:
                r2 = 1092616192(0x41200000, float:10.0)
                int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x01f4
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
                r2.f278446M = r9
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            L_0x01f4:
                r2 = 1112014848(0x42480000, float:50.0)
                r7 = 0
                int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x0206
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                r2.setOnLongClickListener(r7)
            L_0x0206:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.view.VelocityTracker r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122216M7(r2)
                if (r2 == 0) goto L_0x0221
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.view.VelocityTracker r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122216M7(r2)
                r2.recycle()
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                r2.f278452T = r7
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            L_0x0221:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                boolean r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122214K7(r2)
                if (r2 == 0) goto L_0x0343
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$8"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r17
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            L_0x023c:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                java.lang.String r3 = "access$1800"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                boolean r2 = r2.f278446M
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                if (r2 == 0) goto L_0x02ec
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.view.ViewGroup r3 = r3.f278470t
                int r3 = r3.getWidth()
                int r3 = r3 / r8
                float r3 = (float) r3
                r2.setPivotX(r3)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.view.ViewGroup r3 = r3.f278470t
                int r3 = r3.getHeight()
                int r3 = r3 / r8
                float r3 = (float) r3
                r2.setPivotY(r3)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                r2.setScaleX(r7)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                r2.setScaleY(r7)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                r3 = 0
                r2.setTranslationX(r3)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.mm.pluginsdk.ui.tools.r0 r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122222S7(r2)
                android.view.View r2 = (android.view.View) r2
                r2.setTranslationY(r3)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                r2.getClass()
                java.lang.String r3 = "registMenu"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                com.tencent.mm.ui.tools.x0 r7 = r2.f278469s
                if (r7 != 0) goto L_0x02bb
                com.tencent.mm.ui.tools.x0 r7 = new com.tencent.mm.ui.tools.x0
                androidx.appcompat.app.AppCompatActivity r8 = r2.getContext()
                r7.<init>(r8)
                r2.f278469s = r7
            L_0x02bb:
                com.tencent.mm.ui.tools.x0 r7 = r2.f278469s
                com.tencent.mm.pluginsdk.ui.tools.r0 r8 = r2.f278462i
                android.view.View r8 = (android.view.View) r8
                android.view.View$OnCreateContextMenuListener r9 = r2.f278454V
                nj3.p0 r2 = r2.f278455W
                r7.mo70438d(r8, r9, r2)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.widget.TextView r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122217N7(r2)
                if (r2 == 0) goto L_0x02dc
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                android.widget.TextView r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122217N7(r2)
                r2.setVisibility(r5)
            L_0x02dc:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r4)
                r2.f278445L = r5
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122215L7(r2, r5)
                goto L_0x0343
            L_0x02ec:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                boolean r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122214K7(r2)
                if (r2 == 0) goto L_0x031d
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r4)
                boolean r2 = r2.f278447N
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)
                if (r2 != 0) goto L_0x031d
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                r2.mo132883V7()
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122215L7(r2, r5)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$8"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r17
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r9
            L_0x031d:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.m122215L7(r2, r5)
                goto L_0x0343
            L_0x0323:
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                r19.getX()
                java.lang.String r3 = "access$1602"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                r2.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.this
                r19.getY()
                java.lang.String r3 = "access$1702"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                r2.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            L_0x0343:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                r0 = 0
                java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$8"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r1 = r17
                r8 = 0
                r5 = r7
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsSightPlayerUI.C95609k.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$l */
    public class C95610l implements Runnable {
        public C95610l() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$9");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            SnsSightPlayerUI.this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            if (SnsSightPlayerUI.m122222S7(SnsSightPlayerUI.this) instanceof VideoSightView) {
                ((VideoSightView) SnsSightPlayerUI.m122222S7(SnsSightPlayerUI.this)).setDrawableWidth(displayMetrics.widthPixels);
            }
            ((View) SnsSightPlayerUI.m122222S7(SnsSightPlayerUI.this)).requestLayout();
            ((View) SnsSightPlayerUI.m122222S7(SnsSightPlayerUI.this)).postInvalidate();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$9");
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ ADInfo m122211H7(SnsSightPlayerUI snsSightPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        ADInfo aDInfo = snsSightPlayerUI.f278434A;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return aDInfo;
    }

    /* renamed from: I7 */
    public static /* synthetic */ int m122212I7(SnsSightPlayerUI snsSightPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        int i = snsSightPlayerUI.f278466p;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return i;
    }

    /* renamed from: J7 */
    public static /* synthetic */ TextView m122213J7(SnsSightPlayerUI snsSightPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        TextView textView = snsSightPlayerUI.f278463j;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return textView;
    }

    /* renamed from: K7 */
    public static /* synthetic */ boolean m122214K7(SnsSightPlayerUI snsSightPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        boolean z = snsSightPlayerUI.f278445L;
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return z;
    }

    /* renamed from: L7 */
    public static /* synthetic */ boolean m122215L7(SnsSightPlayerUI snsSightPlayerUI, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        snsSightPlayerUI.f278447N = z;
        SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return z;
    }

    /* renamed from: M7 */
    public static /* synthetic */ VelocityTracker m122216M7(SnsSightPlayerUI snsSightPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        VelocityTracker velocityTracker = snsSightPlayerUI.f278452T;
        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return velocityTracker;
    }

    /* renamed from: N7 */
    public static /* synthetic */ TextView m122217N7(SnsSightPlayerUI snsSightPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        TextView textView = snsSightPlayerUI.f278436C;
        SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return textView;
    }

    /* renamed from: O7 */
    public static /* synthetic */ SnsInfo m122218O7(SnsSightPlayerUI snsSightPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        SnsInfo snsInfo = snsSightPlayerUI.f278476z;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return snsInfo;
    }

    /* renamed from: P7 */
    public static /* synthetic */ C101804kv2 m122219P7(SnsSightPlayerUI snsSightPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        C101804kv2 kv22 = snsSightPlayerUI.f278435B;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return kv22;
    }

    /* renamed from: Q7 */
    public static /* synthetic */ String m122220Q7(SnsSightPlayerUI snsSightPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        String str = snsSightPlayerUI.f278459f;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return str;
    }

    /* renamed from: R7 */
    public static /* synthetic */ String m122221R7(SnsSightPlayerUI snsSightPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        String str = snsSightPlayerUI.f278460g;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return str;
    }

    /* renamed from: S7 */
    public static /* synthetic */ C96875r0 m122222S7(SnsSightPlayerUI snsSightPlayerUI) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        C96875r0 r0Var = snsSightPlayerUI.f278462i;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return r0Var;
    }

    /* renamed from: I2 */
    public void mo23179I2() {
        SnsMethodCalculate.markStartTimeMs("gain", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        SnsMethodCalculate.markEndTimeMs("gain", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    /* renamed from: N3 */
    public void mo23180N3() {
        SnsMethodCalculate.markStartTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        SnsMethodCalculate.markEndTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    /* renamed from: R0 */
    public void mo23181R0() {
        SnsMethodCalculate.markStartTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        SnsMethodCalculate.markEndTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    /* renamed from: T7 */
    public final void mo132881T7() {
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        Log.m105924i("MicroMsg.SnsSightPlayerUI", "snsSightplayui pauseplay");
        this.f278462i.pause();
        this.f278462i.onDetach();
        this.f278474x.mo136889a();
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    /* renamed from: U7 */
    public final void mo132882U7(int i) {
        SnsMethodCalculate.markStartTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (!this.f278461h) {
            SnsMethodCalculate.markEndTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            return;
        }
        if (this.f278462i.isPlaying()) {
            if (this.f278467q == 0) {
                this.f278467q = this.f278462i.getDuration();
            }
            this.f278457d.mo138332e(this.f278467q);
            this.f278457d.f290185j.f290745g = Util.currentTicks();
            C99158b bVar = this.f278457d.f290185j;
            bVar.f290744f = i == 2 ? 2 : 1;
            bVar.f290743e = 2;
            Log.m105924i("MicroMsg.SnsSightPlayerUI", "duration " + this.f278467q + " orient " + this.f278457d.f290185j.f290744f);
        }
        SnsMethodCalculate.markEndTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    /* renamed from: V7 */
    public void mo132883V7() {
        int i;
        SnsMethodCalculate.markStartTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        int width = this.f278470t.getWidth();
        int height = this.f278470t.getHeight();
        int i2 = this.f278441H;
        if (!(i2 == 0 || (i = this.f278442I) == 0)) {
            height = (int) ((((float) width) / ((float) i2)) * ((float) i));
        }
        C45059m0 m0Var = this.f278443J;
        m0Var.f122226f = width;
        m0Var.f122227g = height;
        m0Var.mo70410e(this.f278440G, this.f278439F, i2, this.f278442I);
        if (((double) this.f278448P) != 1.0d) {
            int j = C85875k4.m106188j(getContext());
            this.f278443J.f122234n = 1.0f / this.f278448P;
            if (!(this.f278449Q == 0 && this.f278450R == 0)) {
                int width2 = ((int) (((float) (this.f278470t.getWidth() / 2)) * (1.0f - this.f278448P))) + this.f278449Q;
                C45059m0 m0Var2 = this.f278443J;
                m0Var2.f122235o = width2;
                m0Var2.f122236p = (int) ((((float) ((this.f278470t.getHeight() + j) / 2)) - (((float) (height / 2)) * this.f278448P)) + ((float) this.f278450R));
            }
        }
        this.f278443J.mo70409d(this.f278470t, this.f278438E, new C95596a(), (C45059m0.C45066g) null);
        SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    /* renamed from: W7 */
    public final void mo132884W7(boolean z) {
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        this.f278462i.start();
        this.f278467q = this.f278462i.getDuration();
        Log.m105924i("MicroMsg.SnsSightPlayerUI", "startplay get duration " + this.f278467q);
        this.f278474x.mo136891c(this);
        if (z) {
            this.f278457d.f290185j.f290744f = getResources().getConfiguration().orientation == 2 ? 2 : 1;
            this.f278457d.f290185j.f290745g = Util.currentTicks();
            this.f278457d.f290185j.f290743e = 2;
        }
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    /* renamed from: X7 */
    public final void mo132885X7(int i, boolean z) {
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("updateVideoView", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (this.f278472v == 0 || this.f278471u == 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.f278472v = displayMetrics.heightPixels;
            this.f278471u = displayMetrics.widthPixels;
        }
        ViewGroup.LayoutParams layoutParams = this.f278470t.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f278464n.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        if (i2 == 1) {
            int i3 = this.f278471u;
            layoutParams3.width = i3;
            layoutParams3.height = (int) (((((double) i3) * 1.0d) * 240.0d) / 320.0d);
            layoutParams2.addRule(12, 0);
            layoutParams2.addRule(1, 0);
            layoutParams2.addRule(11, -1);
            layoutParams2.addRule(3, this.f278470t.getId());
            View findViewById = findViewById(C0966R.C0970id.knp);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI", "updateVideoView", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI", "updateVideoView", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            int i4 = this.f278471u;
            layoutParams3.height = i4;
            layoutParams3.width = (int) (((((double) i4) * 1.0d) * 320.0d) / 240.0d);
            layoutParams2.addRule(11, 0);
            layoutParams2.addRule(3, 0);
            layoutParams2.addRule(12, -1);
            layoutParams2.addRule(1, this.f278470t.getId());
            View findViewById2 = findViewById(C0966R.C0970id.knp);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI", "updateVideoView", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI", "updateVideoView", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Log.m105924i("MicroMsg.SnsSightPlayerUI", "orientation " + i2 + " " + layoutParams3.width + " " + layoutParams3.height);
        ((View) this.f278462i).setLayoutParams(layoutParams3);
        C96875r0 r0Var = this.f278462i;
        if (r0Var instanceof C94571a) {
            ((C94571a) r0Var).mo130072c(layoutParams3.width, layoutParams3.height);
        }
        layoutParams.height = layoutParams3.height;
        layoutParams.width = layoutParams3.width;
        this.f278463j.setLayoutParams(layoutParams2);
        this.f278470t.setLayoutParams(layoutParams);
        ((View) this.f278462i).requestLayout();
        if (!z) {
            mo132882U7(i);
        }
        SnsMethodCalculate.markEndTimeMs("updateVideoView", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    /* renamed from: f2 */
    public void mo23185f2() {
        SnsMethodCalculate.markStartTimeMs("loss", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        SnsMethodCalculate.markEndTimeMs("loss", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public void finish() {
        SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (!this.f278453U) {
            super.finish();
            this.f278453U = true;
        }
        SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public int getForceOrientation() {
        SnsMethodCalculate.markStartTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return 7;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return C0966R.C0971layout.c48;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SnsInfo DN;
        Intent intent2 = intent;
        String str7 = "onActivityResult";
        String str8 = "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI";
        SnsMethodCalculate.markStartTimeMs(str7, str8);
        if (4097 == i) {
            if (-1 == i2) {
                String stringExtra = intent2.getStringExtra("Select_Conv_User");
                String stringExtra2 = intent2.getStringExtra("custom_send_text");
                for (String next : Util.stringsToList(stringExtra.split(","))) {
                    if (this.f278466p == 0 && (DN = C94866e1.Yx0().mo139798DN(this.f278460g)) != null) {
                        if (C72996z1.m85820U5(next)) {
                            SnsForwardFeedToChatRoomForDataReportEvent snsForwardFeedToChatRoomForDataReportEvent = new SnsForwardFeedToChatRoomForDataReportEvent();
                            snsForwardFeedToChatRoomForDataReportEvent.f265152d.f265153a = C102236a0.m134728W(DN);
                            snsForwardFeedToChatRoomForDataReportEvent.f265152d.f265154b = DN.getLocalid();
                            snsForwardFeedToChatRoomForDataReportEvent.publish();
                        } else {
                            SnsForwardFeedToSingleChatForDataReportEvent snsForwardFeedToSingleChatForDataReportEvent = new SnsForwardFeedToSingleChatForDataReportEvent();
                            snsForwardFeedToSingleChatForDataReportEvent.f265155d.f265156a = C102236a0.m134728W(DN);
                            snsForwardFeedToSingleChatForDataReportEvent.f265155d.f265157b = DN.getLocalid();
                            snsForwardFeedToSingleChatForDataReportEvent.publish();
                        }
                    }
                    TimeLineObject timeLine = this.f278476z.getTimeLine();
                    if (this.f278461h) {
                        ADXml adXml = this.f278476z.getAdXml();
                        tc4 tc4 = new tc4();
                        C101804kv2 kv22 = this.f278435B;
                        tc4.f299538e = kv22.f298668A;
                        tc4.f299537d = kv22.f298706x;
                        if (timeLine.ContentObj.f298424e == 15) {
                            tc4.f299543j = this.f278434A.uxInfo;
                            tc4.f299544n = timeLine.f283893Id;
                        } else {
                            sc4 sc4 = timeLine.streamvideo;
                            tc4.f299543j = sc4.f299431j;
                            tc4.f299544n = sc4.f299432n;
                        }
                        tc4.f299541h = Util.isNullOrNil(kv22.f298670C) ? timeLine.ContentDesc : this.f278435B.f298670C;
                        tc4.f299542i = Util.isNullOrNil(this.f278435B.f298669B) ? this.f278435B.f298694i : this.f278435B.f298669B;
                        if (adXml != null && adXml.attachShareLinkIsHidden == 0) {
                            tc4.f299540g = adXml.attachShareLinkUrl;
                            tc4.f299539f = adXml.attachShareLinkWording;
                        }
                        if (adXml != null) {
                            tc4.f299540g = adXml.adActionLink;
                        }
                        int U = C102236a0.m134726U(this.f278458e);
                        C101804kv2 kv23 = this.f278435B;
                        Log.m105925i("MicroMsg.SnsSightPlayerUI", "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d streamvideothumburl %s, duration: %s", next, this.f278458e, this.f278459f, kv23.f298706x, Integer.valueOf(kv23.f298668A), tc4.f299542i, Integer.valueOf(U));
                        str4 = stringExtra2;
                        str3 = str7;
                        str5 = str8;
                        C7250m.m7431a().mo136262bz(this, next, this.f278458e, this.f278459f, 43, U, tc4, false, false, timeLine.statExtStr, (String) null, 0);
                        str6 = next;
                    } else {
                        str4 = stringExtra2;
                        str3 = str7;
                        str5 = str8;
                        int U2 = C102236a0.m134726U(this.f278458e);
                        str6 = next;
                        Log.m105925i("MicroMsg.SnsSightPlayerUI", "send sight to %s, videopath %s, thumbpath %s, duration: %s", str6, this.f278458e, this.f278459f, Integer.valueOf(U2));
                        C7250m.m7431a().Ml0(this, str6, this.f278458e, this.f278459f, 43, U2, false, false, timeLine.statExtStr, (String) null);
                    }
                    String str9 = str4;
                    if (str9 != null) {
                        C7250m.m7431a().mo136252Ar(str9, str6);
                    }
                    C75026b.m89951a(this, getString(C0966R.string.fjh));
                    if (this.f278461h) {
                        C102236a0.m134773u0(new SnsAdClick(this.f278466p, 5, this.f278476z.field_snsId, 12, 0));
                        boolean U5 = C72996z1.m85820U5(str6);
                        C98977w.m128888d(C98977w.C98981d.Sight, U5 ? C98977w.C98980c.Chatroom : C98977w.C98980c.Chat, C98977w.C98982e.Full, U5 ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(str6) : 0, this.f278476z, this.f278466p);
                    }
                    int i3 = i;
                    int i4 = i2;
                    stringExtra2 = str9;
                    str8 = str5;
                    str7 = str3;
                    Intent intent3 = intent;
                }
            } else {
                str = str7;
                str2 = str8;
                if (this.f278461h) {
                    C102236a0.m134773u0(new SnsAdClick(this.f278466p, 5, this.f278476z.field_snsId, 13, 0));
                }
                super.onActivityResult(i, i2, intent);
                SnsMethodCalculate.markEndTimeMs(str, str2);
            }
        }
        str = str7;
        str2 = str8;
        super.onActivityResult(i, i2, intent);
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    public void onBackPressed() {
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        mo132883V7();
        SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        super.onConfigurationChanged(configuration);
        Log.m105924i("MicroMsg.SnsSightPlayerUI", "onConfigurationChanged " + configuration.orientation + " " + this.f278456X);
        int i = this.f278456X;
        int i2 = configuration.orientation;
        if (i == i2) {
            SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            return;
        }
        mo132885X7(i2, false);
        this.f278456X = configuration.orientation;
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public void onCreate(Bundle bundle) {
        ADInfo aDInfo;
        boolean z;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        getIntent().setExtrasClassLoader(getClass().getClassLoader());
        this.f278466p = getIntent().getIntExtra("intent_from_scene", -1);
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate(bundle);
        hideTitleView();
        C94866e1.Vx0().mo130978c(this);
        getWindow().setStatusBarColor(getResources().getColor(C0966R.color.f3131gg));
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f278444K = bundle;
        this.f278474x = new C97621e();
        this.f278458e = getIntent().getStringExtra("intent_videopath");
        this.f278459f = getIntent().getStringExtra("intent_thumbpath");
        this.f278460g = getIntent().getStringExtra("intent_localid");
        this.f278461h = getIntent().getBooleanExtra("intent_isad", false);
        this.f278476z = C94866e1.Yx0().mo139798DN(this.f278460g);
        if (this.f278461h) {
            SnsMethodCalculate.markStartTimeMs("initSightPath", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            SnsInfo snsInfo = this.f278476z;
            if (snsInfo == null) {
                SnsMethodCalculate.markEndTimeMs("initSightPath", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
                z = false;
            } else {
                this.f278435B = snsInfo.getTimeLine().ContentObj.f298427h.get(0);
                C94938q1.m120518e(C94866e1.m120262YO(), this.f278435B.f298689d);
                C102236a0.m134716K(this.f278435B);
                C102236a0.m134729X(this.f278435B);
                SnsMethodCalculate.markEndTimeMs("initSightPath", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
                z = true;
            }
            if (!z) {
                finish();
                SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
                return;
            }
        }
        if (C92614a.m116678c() != null) {
            ((C92614a) C92614a.m116678c()).mo126634a();
        }
        SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        SnsInfo snsInfo2 = this.f278476z;
        if (snsInfo2 == null) {
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            aDInfo = null;
        } else if (this.f278466p == 2) {
            aDInfo = snsInfo2.getAtAdInfo();
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        } else {
            aDInfo = snsInfo2.getAdInfo();
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        }
        this.f278434A = aDInfo;
        this.f278457d.f290179d = Util.currentTicks();
        ((RelativeLayout) findViewById(C0966R.C0970id.bsa)).setOnTouchListener(new C95600d());
        Log.m105918d("MicroMsg.SnsSightPlayerUI", C76861g.m92659b() + " initView: fullpath:" + this.f278458e + ", imagepath:" + this.f278459f);
        this.f278443J = new C45059m0(getContext());
        this.f278438E = (ImageView) findViewById(C0966R.C0970id.ehi);
        this.f278463j = (TextView) findViewById(C0966R.C0970id.knp);
        this.f278465o = (MMPinProgressBtn) findViewById(C0966R.C0970id.f359206jl2);
        this.f278470t = (ViewGroup) findViewById(C0966R.C0970id.f359485l50);
        C96875r0 a = C96895y1.m124471a(getContext());
        this.f278462i = a;
        if (a instanceof VideoSightView) {
            ((VideoSightView) a).setIsAdVideo(this.f278461h);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        TextView textView = (TextView) findViewById(C0966R.C0970id.jjx);
        this.f278436C = textView;
        textView.setTextColor(Color.parseColor("#888888"));
        this.f278470t.addView((View) this.f278462i, 0, layoutParams);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.kko);
        this.f278464n = textView2;
        textView2.setText("");
        if (!this.f278461h) {
            this.f278464n.setVisibility(8);
        }
        if (this.f278461h) {
            C101804kv2 kv22 = this.f278435B;
            if (kv22 == null) {
                this.f278436C.setVisibility(8);
            } else if (Util.isNullOrNil(kv22.f298706x)) {
                Log.m105924i("MicroMsg.SnsSightPlayerUI", "onCreate: there is no attachurl, show more info btn");
                TimeLineObject timeLine = this.f278476z.getTimeLine();
                ADXml adXml = this.f278476z.getAdXml();
                String str = adXml.attachShareLinkWording;
                String str2 = adXml.attachShareLinkUrl;
                if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
                    this.f278436C.setVisibility(8);
                } else {
                    this.f278436C.setVisibility(0);
                    this.f278436C.setText(str);
                    this.f278436C.setOnClickListener(new C95601e(timeLine, str2));
                }
            } else {
                String string = getResources().getString(C0966R.string.ja6);
                if (this.f278435B.f298668A / 60 > 0) {
                    string = string + getResources().getString(C0966R.string.ja8, new Object[]{Integer.valueOf(this.f278435B.f298668A / 60)});
                }
                if (this.f278435B.f298668A % 60 > 0) {
                    string = string + getResources().getString(C0966R.string.ja9, new Object[]{Integer.valueOf(this.f278435B.f298668A % 60)});
                }
                this.f278436C.setText(string + getResources().getString(C0966R.string.ja7));
                this.f278436C.setVisibility(0);
                this.f278436C.setOnClickListener(new C95603f());
            }
            C72932v1.m85535a(this.f278436C, (VideoSightView) this.f278462i);
        } else {
            this.f278436C.setVisibility(8);
        }
        this.f278462i.setVideoCallback(new C95604g());
        findViewById(C0966R.C0970id.f359485l50).setOnClickListener(new C95606h());
        ((View) this.f278462i).setOnClickListener(new C95607i());
        this.f278451S = new GestureDetector(getContext(), new C95608j());
        ((View) this.f278462i).setOnTouchListener(new C95609k());
        if (C86013q1.m106450k(this.f278458e)) {
            if (this.f278458e != null) {
                this.f278462i.stop();
                this.f278462i.setVideoPath(this.f278458e);
            }
            this.f278465o.setVisibility(8);
            this.f278457d.f290177b = 1;
        } else {
            C94866e1.Vx0().mo130979d(this.f278435B, 6, (C102268v) null, C96983o3.f284139k);
            this.f278465o.setVisibility(0);
            this.f278465o.mo153891a();
            this.f278457d.f290177b = 0;
        }
        Log.m105918d("MicroMsg.SnsSightPlayerUI", (System.currentTimeMillis() - currentTimeMillis) + " initView end");
        UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
        uIStatusChangedEvent.f193971d.f193972a = 1;
        uIStatusChangedEvent.publish();
        if (this.f278469s == null) {
            this.f278469s = new C45082x0(getContext());
        }
        this.f278469s.mo70438d((View) this.f278462i, this.f278454V, this.f278455W);
        ((View) this.f278462i).post(new C95610l());
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public void onDestroy() {
        SnsInfo snsInfo;
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        super.onDestroy();
        SnsMethodCalculate.markStartTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (!this.f278461h) {
            SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        } else {
            SnsInfo snsInfo2 = this.f278476z;
            String str = "";
            String str2 = snsInfo2 == null ? str : this.f278434A.viewId;
            if (snsInfo2 == null) {
                SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            } else {
                String d = this.f278457d.mo138331d();
                SnsInfo snsInfo3 = this.f278476z;
                int adRecSrc = snsInfo3 == null ? 0 : snsInfo3.getAdRecSrc();
                C98973p pVar = this.f278457d;
                int i = pVar.f290178c;
                long j = ((long) i) - pVar.f290180e;
                if (j < 0) {
                    Log.m105921e("MicroMsg.SnsSightPlayerUI", "reportVideo minus staytime found! totaltime[%d], offscreenTime[%ld]", Integer.valueOf(i), Long.valueOf(this.f278457d.f290180e));
                    j = (long) this.f278457d.f290178c;
                }
                int i2 = (int) j;
                ADInfo aDInfo = this.f278434A;
                if (aDInfo != null) {
                    str = aDInfo.waidPkg;
                }
                String str3 = str;
                C86709a0.m107528h();
                C89137b0 b0Var = C86709a0.m107529k().f251779b;
                int i3 = this.f278466p;
                int i4 = i3 == 0 ? 1 : 2;
                int i5 = this.f278457d.f290178c;
                C89349b atFriendRemindInfoSourceInfo = i3 == 2 ? this.f278476z.getAdSnsInfo().getAtFriendRemindInfoSourceInfo() : this.f278476z.getAdSnsInfo().getTimelineRemindInfoSourceInfo();
                C98960j jVar = r9;
                C98960j jVar2 = new C98960j(str2, i4, 2, i5, (C101786i2) null, (C64509l2) null, 2, d, -1, adRecSrc, i2, i2, 0, atFriendRemindInfoSourceInfo, this.f278466p == 2 ? this.f278476z.getAdSnsInfo().getAtFriendRemindInfoSelfInfo() : this.f278476z.getAdSnsInfo().getTimelineRemindInfoSelfInfo(), str3);
                b0Var.mo123460f(jVar);
                SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            }
        }
        Log.m105918d("MicroMsg.SnsSightPlayerUI", "on dismiss");
        if (this.f278461h && (snsInfo = this.f278476z) != null && snsInfo.isAd()) {
            C98977w.m128885a(C98977w.C98979b.Sight, C98977w.C98978a.LeavelFullScreen, this.f278476z, this.f278466p);
        }
        C94866e1.Vx0().mo130997v(this);
        if (C91998s.m115551f(getIntent()) != null && this.f278461h) {
            Util.isNullOrNil(this.f278435B.f298706x);
        }
        if (C92614a.m116678c() != null) {
            ((C92614a) C92614a.m116678c()).mo126635b();
        }
        C96875r0 r0Var = this.f278462i;
        if (r0Var != null) {
            r0Var.setVideoCallback((C96875r0.C96876a) null);
            this.f278462i.stop();
            this.f278462i.onDetach();
        }
        UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
        UIStatusChangedEvent.C67803a aVar = uIStatusChangedEvent.f193971d;
        aVar.f193972a = 0;
        aVar.f193973b = 0;
        aVar.f193974c = 0;
        aVar.f193975d = 0;
        uIStatusChangedEvent.publish();
        this.f278474x.mo136889a();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public void onImageFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        super.onPause();
        int i = getResources().getConfiguration().orientation;
        Log.m105924i("MicroMsg.SnsSightPlayerUI", "onpause  " + i);
        mo132882U7(i);
        if (!this.f278468r) {
            mo132881T7();
            SnsMethodCalculate.markStartTimeMs("closePopup", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            Log.m105926v("check", "onclick");
            new MMHandler().post(new C96274w5(this));
            SnsMethodCalculate.markEndTimeMs("closePopup", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        } else {
            mo132881T7();
        }
        C98973p pVar = this.f278457d;
        if (pVar != null) {
            pVar.mo138329b();
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        super.onResume();
        if (!this.f278473w) {
            int i = getResources().getConfiguration().orientation;
            Log.m105924i("MicroMsg.SnsSightPlayerUI", "initOrientation " + i);
            if (getResources().getConfiguration().orientation == 2) {
                mo132885X7(getResources().getConfiguration().orientation, true);
            }
            this.f278473w = true;
        }
        if (this.f278472v == 0 || this.f278471u == 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.f278472v = displayMetrics.heightPixels;
            this.f278471u = displayMetrics.widthPixels;
        }
        if (this.f278468r && C86013q1.m106450k(this.f278458e)) {
            mo132884W7(false);
            this.f278468r = false;
        }
        C98973p pVar = this.f278457d;
        if (pVar != null) {
            pVar.mo138330c();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public void onSetbg() {
        SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public void onSightFinish(String str, boolean z) {
        C101804kv2 kv22;
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        Log.m105924i("MicroMsg.SnsSightPlayerUI", "onSightFinish " + str);
        if (this.f278461h && !Util.isNullOrNil(str) && (kv22 = this.f278435B) != null && str.equals(kv22.f298689d) && C86013q1.m106450k(this.f278458e)) {
            this.f278457d.f290177b = 1;
            this.f278462i.setVideoPath(this.f278458e);
            mo132884W7(true);
            MMPinProgressBtn mMPinProgressBtn = this.f278465o;
            if (mMPinProgressBtn != null) {
                mMPinProgressBtn.setVisibility(8);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public void onStart() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        Bundle bundle = this.f278444K;
        SnsMethodCalculate.markStartTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (this.f278437D) {
            SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        } else {
            this.f278437D = true;
            this.f278439F = getIntent().getIntExtra("img_gallery_top", 0);
            this.f278440G = getIntent().getIntExtra("img_gallery_left", 0);
            this.f278441H = getIntent().getIntExtra("img_gallery_width", 0);
            int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
            this.f278442I = intExtra;
            this.f278443J.mo70410e(this.f278440G, this.f278439F, this.f278441H, intExtra);
            if (bundle == null) {
                this.f278470t.getViewTreeObserver().addOnPreDrawListener(new C96314x5(this));
            }
            SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        }
        super.onStart();
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public void onThumbFinish(String str) {
        SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }
}
