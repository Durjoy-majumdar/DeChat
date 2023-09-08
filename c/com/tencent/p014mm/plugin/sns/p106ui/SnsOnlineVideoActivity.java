package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import av2.C92126r;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent;
import com.tencent.p014mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C7250m;
import di3.C86312j;
import f40.C86709a0;
import f72.C97842b;
import gy3.C87412m;
import h81.C32735h;
import hi2.C32925e;
import hi2.C87514t;
import i21.C60242i;
import ih2.C60287a;
import java.util.ArrayList;
import java.util.List;
import k21.C60960c;
import ke3.C88144b;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C11184p0;
import nj3.C88989a;
import p682rz.C101488s;
import te3.C101804kv2;
import vo3.C90852c;
import vr2.C102236a0;
import zt3.C119157j;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity */
public class SnsOnlineVideoActivity extends MMActivity {

    /* renamed from: y0 */
    public static final /* synthetic */ int f278370y0 = 0;

    /* renamed from: A */
    public int f278371A = 0;

    /* renamed from: B */
    public int f278372B = 0;

    /* renamed from: C */
    public boolean f278373C;

    /* renamed from: D */
    public Button f278374D;

    /* renamed from: E */
    public boolean f278375E;

    /* renamed from: F */
    public boolean f278376F = false;

    /* renamed from: G */
    public boolean f278377G = true;

    /* renamed from: H */
    public boolean f278378H = false;

    /* renamed from: I */
    public boolean f278379I = false;

    /* renamed from: J */
    public String f278380J = "";

    /* renamed from: K */
    public String f278381K = "";

    /* renamed from: L */
    public long f278382L = 0;

    /* renamed from: M */
    public int f278383M = 2;

    /* renamed from: N */
    public boolean f278384N = false;

    /* renamed from: P */
    public String f278385P;

    /* renamed from: Q */
    public LinearLayout f278386Q;

    /* renamed from: R */
    public String f278387R;

    /* renamed from: S */
    public int f278388S;

    /* renamed from: T */
    public boolean f278389T = false;

    /* renamed from: U */
    public boolean f278390U = false;

    /* renamed from: V */
    public boolean f278391V = false;

    /* renamed from: W */
    public float f278392W = 1.0f;

    /* renamed from: X */
    public int f278393X = 0;

    /* renamed from: Y */
    public int f278394Y = 0;

    /* renamed from: Z */
    public GestureDetector f278395Z;

    /* renamed from: d */
    public boolean f278396d = true;

    /* renamed from: e */
    public String f278397e;

    /* renamed from: f */
    public String f278398f;

    /* renamed from: g */
    public String f278399g;

    /* renamed from: h */
    public int f278400h = 0;

    /* renamed from: i */
    public boolean f278401i;

    /* renamed from: j */
    public boolean f278402j;

    /* renamed from: n */
    public SnsInfo f278403n;

    /* renamed from: o */
    public C101804kv2 f278404o;

    /* renamed from: p */
    public RelativeLayout f278405p;

    /* renamed from: p0 */
    public VelocityTracker f278406p0;

    /* renamed from: q */
    public ImageView f278407q;

    /* renamed from: r */
    public OnlineVideoView f278408r;

    /* renamed from: s */
    public FrameLayout f278409s;

    /* renamed from: t */
    public Bundle f278410t;

    /* renamed from: u */
    public C92126r f278411u;

    /* renamed from: v */
    public boolean f278412v = false;

    /* renamed from: w */
    public boolean f278413w = false;

    /* renamed from: x */
    public C45059m0 f278414x;

    /* renamed from: x0 */
    public C11184p0 f278415x0 = new SnsOnlineVideoActivity$$g(this);

    /* renamed from: y */
    public int f278416y = 0;

    /* renamed from: z */
    public int f278417z = 0;

    /* renamed from: H7 */
    public static /* synthetic */ RelativeLayout m122193H7(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        RelativeLayout relativeLayout = snsOnlineVideoActivity.f278405p;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return relativeLayout;
    }

    /* renamed from: I7 */
    public static /* synthetic */ C92126r m122194I7(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        C92126r rVar = snsOnlineVideoActivity.f278411u;
        SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return rVar;
    }

    /* renamed from: J7 */
    public static /* synthetic */ SnsInfo m122195J7(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        SnsInfo snsInfo = snsOnlineVideoActivity.f278403n;
        SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return snsInfo;
    }

    /* renamed from: K7 */
    public static /* synthetic */ String m122196K7(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        String str = snsOnlineVideoActivity.f278397e;
        SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return str;
    }

    /* renamed from: L7 */
    public static /* synthetic */ OnlineVideoView m122197L7(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        OnlineVideoView onlineVideoView = snsOnlineVideoActivity.f278408r;
        SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return onlineVideoView;
    }

    /* renamed from: M7 */
    public static /* synthetic */ boolean m122198M7(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        boolean z = snsOnlineVideoActivity.f278389T;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return z;
    }

    /* renamed from: N7 */
    public static /* synthetic */ FrameLayout m122199N7(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        FrameLayout frameLayout = snsOnlineVideoActivity.f278409s;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return frameLayout;
    }

    /* renamed from: O7 */
    public static /* synthetic */ boolean m122200O7(SnsOnlineVideoActivity snsOnlineVideoActivity, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity.f278391V = z;
        SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return z;
    }

    /* renamed from: P7 */
    public static /* synthetic */ VelocityTracker m122201P7(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        VelocityTracker velocityTracker = snsOnlineVideoActivity.f278406p0;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return velocityTracker;
    }

    /* renamed from: Q7 */
    public final void mo132869Q7() {
        Button button;
        SnsMethodCalculate.markStartTimeMs("addNavBarMargin", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        boolean k = C85875k4.m106190k(this);
        int j = C85875k4.m106188j(this);
        if (this.f278373C && k && (button = this.f278374D) != null && button.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f278374D.getLayoutParams();
            marginLayoutParams.bottomMargin += j;
            this.f278374D.setLayoutParams(marginLayoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("addNavBarMargin", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    /* renamed from: R7 */
    public final void mo132870R7(String str) {
        SnsMethodCalculate.markStartTimeMs("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        TextView textView = (TextView) findViewById(C0966R.C0970id.kwx);
        if (textView == null) {
            Log.m105920e("MicroMsg.SnsOnlineVideoActivity", "tvWording is null");
            SnsMethodCalculate.markEndTimeMs("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return;
        }
        this.f278386Q.setVisibility(0);
        int i = C60287a.f171906a;
        int i2 = C60287a.f171907b;
        int bottomSafeHeight = this.f278408r.getBottomSafeHeight();
        int videoViewBottom = this.f278408r.getVideoViewBottom();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f278386Q.getLayoutParams();
        if (i2 - videoViewBottom <= bottomSafeHeight || videoViewBottom <= 0) {
            layoutParams.setMargins(0, 0, 0, bottomSafeHeight - C76577a.m92151b(getContext(), 40));
        } else {
            layoutParams.setMargins(0, videoViewBottom + C76577a.m92151b(getContext(), 16), 0, 0);
            layoutParams.gravity = 8388613;
        }
        this.f278386Q.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(str)) {
            SnsReportHelper.f275506m0.mo131375h(this.f278387R, 1);
            C87514t tVar = C87514t.f253524a;
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_second_cut_simple_style_wording, "");
            Log.m105924i("MicroMsg.SecondCutConfig", "SecondCutSimpleStyleLeftWording: " + Y60);
            if (!TextUtils.isEmpty(Y60)) {
                C87412m.m108593f(Y60, "result");
                Y60 = tVar.mo121967a(Y60);
                Log.m105924i("MicroMsg.SecondCutConfig", "PopupSecondCutSimpleStyleLeftWording: " + Y60);
            }
            C87412m.m108593f(Y60, "result");
            if (TextUtils.isEmpty(Y60)) {
                Y60 = C76577a.m92166q(getContext(), C0966R.string.jgr);
            }
            if (Y60.contains("X")) {
                SpannableString spannableString = new SpannableString(Y60);
                Drawable i3 = C76577a.m92158i(getContext(), C0966R.C0969drawable.cbd);
                int h = C76577a.m92157h(getContext(), C0966R.dimen.f3723cd);
                i3.setBounds(0, 0, (i3.getIntrinsicWidth() * h) / i3.getIntrinsicHeight(), h);
                ImageSpan imageSpan = new ImageSpan(i3, 2);
                int indexOf = Y60.indexOf("X");
                spannableString.setSpan(imageSpan, indexOf, indexOf + 1, 33);
                textView.setText(spannableString);
            } else {
                textView.setText(Y60);
            }
        } else {
            textView.setText(str);
        }
        SnsMethodCalculate.markEndTimeMs("dealCutSameJumpView", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    /* renamed from: S7 */
    public String mo132871S7() {
        SnsMethodCalculate.markStartTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (this.f278404o == null) {
            Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "getCurrentMaterialPath, media is null");
            SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return null;
        }
        String str = C94938q1.m120518e(C94866e1.m120262YO(), this.f278404o.f298689d) + C102236a0.m134725T(this.f278404o);
        if (TextUtils.isEmpty(str)) {
            Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "getCurrentMaterialPath, mediaPath is empty");
            SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return null;
        }
        SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return str;
    }

    /* renamed from: T7 */
    public final List<Integer> mo132872T7() {
        SnsMethodCalculate.markStartTimeMs("initMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        ArrayList arrayList = new ArrayList();
        if (Util.safeParseInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SIGHTCannotTransmitForFav")) == 0) {
            arrayList.add(1003);
        }
        C88144b.m109788f("favorite");
        arrayList.add(1006);
        SnsMethodCalculate.markEndTimeMs("initMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return arrayList;
    }

    /* renamed from: U7 */
    public final List<Integer> mo132873U7() {
        SnsMethodCalculate.markStartTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        ArrayList arrayList = new ArrayList();
        arrayList.add(1013);
        if (Util.safeParseInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SIGHTCannotTransmitForFav")) == 0) {
            String m = C94867e2.m120294m(this.f278397e, this.f278404o);
            if (!C86013q1.m106450k(m)) {
                m = C94867e2.m120292k(this.f278397e);
                Log.m105929w("MicroMsg.SnsOnlineVideoActivity", "initSecondMenu get relocated video path: %s", m);
            }
            boolean k = C86013q1.m106450k(this.f278398f);
            boolean z = !TextUtils.isEmpty(m) && C86013q1.m106450k(m);
            Log.m105925i("MicroMsg.SnsOnlineVideoActivity", "config can forward sight, thumb existed %B, video existed %B", Boolean.valueOf(k), Boolean.valueOf(z));
            if (k && z) {
                ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
                exDeviceHaveBindNetworkDeviceEvent.f236178d.f236181b = this.f278397e;
                exDeviceHaveBindNetworkDeviceEvent.publish();
                if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                    arrayList.add(1008);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return arrayList;
    }

    /* renamed from: V7 */
    public final void mo132874V7() {
        SnsMethodCalculate.markStartTimeMs("registerMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (this.f278401i) {
            Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "it is preview mode, don't register menu.");
            SnsMethodCalculate.markEndTimeMs("registerMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return;
        }
        this.f278409s.setOnLongClickListener(new SnsOnlineVideoActivity$$i(this));
        SnsMethodCalculate.markEndTimeMs("registerMenu", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    /* renamed from: W7 */
    public void mo132875W7() {
        int i;
        SnsMethodCalculate.markStartTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        Button button = this.f278374D;
        if (button != null && button.getVisibility() == 0) {
            this.f278374D.setVisibility(8);
        }
        LinearLayout linearLayout = this.f278386Q;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            this.f278386Q.setVisibility(8);
        }
        int width = this.f278405p.getWidth();
        int height = this.f278405p.getHeight();
        if (this.f278392W == 1.0f) {
            this.f278414x.f122238r = -(this.f278408r.getVideoVideoMoveMargin() * 2);
        }
        int i2 = this.f278371A;
        if (!(i2 == 0 || (i = this.f278372B) == 0)) {
            height = (int) ((((float) width) / ((float) i2)) * ((float) i));
        }
        C45059m0 m0Var = this.f278414x;
        if (m0Var != null) {
            m0Var.f122226f = width;
            m0Var.f122227g = height;
            m0Var.mo70410e(this.f278417z, this.f278416y, i2, this.f278372B);
            if (((double) this.f278392W) != 1.0d) {
                int videoVideoMoveMargin = this.f278408r.getVideoVideoMoveMargin();
                this.f278414x.f122234n = 1.0f / this.f278392W;
                if (!(this.f278393X == 0 && this.f278394Y == 0)) {
                    int width2 = ((int) (((float) (this.f278405p.getWidth() / 2)) * (1.0f - this.f278392W))) + this.f278393X;
                    C45059m0 m0Var2 = this.f278414x;
                    m0Var2.f122235o = width2;
                    m0Var2.f122236p = (int) (((float) ((this.f278405p.getHeight() / 2) + this.f278394Y)) - (((float) ((height / 2) + videoVideoMoveMargin)) * this.f278392W));
                }
            }
            this.f278414x.mo70409d(this.f278409s, this.f278407q, new SnsOnlineVideoActivity$$f(this), (C45059m0.C45066g) null);
        }
        SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            Log.m105918d("MicroMsg.SnsOnlineVideoActivity", "dispatchKeyEvent");
            mo132875W7();
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return dispatchKeyEvent;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return C0966R.C0971layout.f360018c51;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        SnsInfo DN;
        int i4 = i;
        Intent intent2 = intent;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        char c = 2;
        int i5 = 1;
        String str = "MicroMsg.SnsOnlineVideoActivity";
        Log.m105925i(str, "on activity result reqCode %d resultCode %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (4097 != i4) {
            String str2 = str;
            if (4098 == i4) {
                Log.m105924i(str2, "REQUEST_CODE_CUT_SAME callback ");
                Intent intent3 = intent;
                if (intent3 != null) {
                    String stringExtra = intent3.getStringExtra("key_export_video_path");
                    if (TextUtils.isEmpty(stringExtra)) {
                        Log.m105920e(str2, "template video path is null");
                        finish();
                        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                        return;
                    }
                    try {
                        Intent intent4 = new Intent();
                        intent4.putExtra("KSightPath", stringExtra);
                        String c2 = C32925e.f89499a.mo58863c("other", (String) null);
                        i3 = 1;
                        try {
                            BitmapUtil.saveBitmapToImage(C97842b.m126300q(stringExtra), 60, Bitmap.CompressFormat.JPEG, c2, true);
                            intent4.putExtra("KSightThumbPath", c2);
                            intent4.putExtra("Ksnsupload_type", 14);
                            intent4.putExtra("KSnsVideoTempalteInfo", intent3.getByteArrayExtra("key_video_template_info"));
                            intent4.putExtra("KSnsFrom", 19);
                            C88144b.m109791i(getContext(), "sns", ".ui.SnsUploadUI", intent4, (Bundle) null);
                            finish();
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        i3 = 1;
                    }
                    Object[] objArr = new Object[i3];
                    objArr[0] = stringExtra;
                    Log.m105925i(str2, "REQUEST_CODE_TEMPLATE_VIDEO path:%s", objArr);
                }
                super.onActivityResult(i, i2, intent);
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            }
        } else if (-1 == i2) {
            String stringExtra2 = intent2.getStringExtra("Select_Conv_User");
            String stringExtra3 = intent2.getStringExtra("custom_send_text");
            if (TextUtils.isEmpty(stringExtra2)) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                return;
            }
            for (String next : Util.stringsToList(stringExtra2.split(","))) {
                if (this.f278400h == 0 && (DN = C94866e1.Yx0().mo139798DN(this.f278397e)) != null) {
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
                TimeLineObject timeLine = this.f278403n.getTimeLine();
                String m = C94867e2.m120294m(this.f278397e, this.f278404o);
                int U = C102236a0.m134726U(m);
                String o = Util.isNullOrNil(this.f278398f) ? C94867e2.m120296o(this.f278404o) : this.f278398f;
                this.f278398f = o;
                Object[] objArr2 = new Object[6];
                objArr2[0] = next;
                objArr2[i5] = m;
                objArr2[c] = o;
                C101804kv2 kv22 = this.f278404o;
                objArr2[3] = kv22.f298706x;
                objArr2[4] = Integer.valueOf(kv22.f298668A);
                objArr2[5] = Integer.valueOf(U);
                Log.m105925i(str, "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", objArr2);
                if (!C86013q1.m106450k(m)) {
                    m = C94867e2.m120292k(this.f278397e);
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = m;
                    Log.m105929w(str, "shareSendVideo get relocated video path: %s", objArr3);
                }
                String str3 = m;
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(this.f278398f) || !C86013q1.m106450k(str3) || !C86013q1.m106450k(this.f278398f)) {
                    Log.m105920e(str, "send video error");
                    if (C94847c1.m120217e()) {
                        C75026b.m89951a(this, getString(C0966R.string.n4x));
                    }
                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                    return;
                }
                String str4 = next;
                String str5 = str;
                String str6 = stringExtra3;
                C7250m.m7431a().Ml0(this, next, str3, this.f278398f, 43, U, false, false, timeLine.statExtStr, (String) null);
                ((C101488s) C86312j.m106911c(C101488s.class)).gh0(this.f278403n.getLocalid());
                if (str6 != null) {
                    C7250m.m7431a().mo136252Ar(str6, str4);
                }
                C75026b.m89951a(this, getString(C0966R.string.fjh));
                int i6 = i2;
                stringExtra3 = str6;
                str = str5;
                i5 = 1;
                c = 2;
                Intent intent5 = intent;
            }
        }
        Intent intent6 = intent;
        super.onActivityResult(i, i2, intent);
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    public void onBackPressed() {
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        this.f278384N = true;
        super.onBackPressed();
        SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i == 1) {
            Log.m105918d("MicroMsg.SnsOnlineVideoActivity", "vertical orientation");
            SnsMethodCalculate.markStartTimeMs("handleVerticalUI", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            mo132869Q7();
            SnsMethodCalculate.markEndTimeMs("handleVerticalUI", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        } else if (i == 2) {
            Log.m105918d("MicroMsg.SnsOnlineVideoActivity", "horizontal orientation");
            SnsMethodCalculate.markStartTimeMs("handleHorizontalUI", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            Button button = this.f278374D;
            if (button != null && button.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f278374D.getLayoutParams();
                if (marginLayoutParams.bottomMargin != getResources().getDimensionPixelSize(C0966R.dimen.aod)) {
                    marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.aod);
                    this.f278374D.setLayoutParams(marginLayoutParams);
                }
            }
            SnsMethodCalculate.markEndTimeMs("handleHorizontalUI", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        } else {
            SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v74, resolved type: com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x04e2 A[SYNTHETIC, Splitter:B:100:0x04e2] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x062d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0649  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0652  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x06d9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x071a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0776  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x07d9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x046a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r2 = ""
            java.lang.String r3 = "onCreate"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            android.content.Intent r0 = r27.getIntent()
            java.lang.Class r5 = r27.getClass()
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r0.setExtrasClassLoader(r5)
            super.onCreate(r28)
            r0 = r28
            r1.f278410t = r0
            java.lang.String r5 = "initData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_thumbpath"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f278398f = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_localid"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f278397e = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_from_scene"
            r7 = -1
            int r0 = r0.getIntExtra(r6, r7)
            r1.f278400h = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_ispreview"
            r8 = 0
            boolean r0 = r0.getBooleanExtra(r6, r8)
            r1.f278401i = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_ismute"
            boolean r0 = r0.getBooleanExtra(r6, r8)
            r1.f278402j = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_fromplayingvideo"
            boolean r0 = r0.getBooleanExtra(r6, r8)
            r1.f278379I = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_fromplayingvideo_tlobjid"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f278380J = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_session_id"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f278381K = r0
            android.content.Intent r0 = r27.getIntent()
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r6 = "intent_session_timestamp"
            long r9 = r0.getLongExtra(r6, r9)
            r1.f278382L = r9
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "sns_video_scene"
            r9 = 2
            int r0 = r0.getIntExtra(r6, r9)
            r1.f278383M = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "KBlockAdd"
            boolean r0 = r0.getBooleanExtra(r6, r8)
            r1.f278378H = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_third_sdk_msg"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f278385P = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_publish_id"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f278387R = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_bottom_height"
            int r0 = r0.getIntExtra(r6, r8)
            r1.f278388S = r0
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r6 = "intent_videopath"
            java.lang.String r0 = r0.getStringExtra(r6)
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r10 = r1.f278398f
            r6[r8] = r10
            java.lang.String r10 = r1.f278397e
            r11 = 1
            r6[r11] = r10
            int r10 = r1.f278400h
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r9] = r10
            boolean r10 = r1.f278401i
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r12 = 3
            r6[r12] = r10
            boolean r10 = r1.f278402j
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r13 = 4
            r6[r13] = r10
            r10 = 5
            r6[r10] = r0
            java.lang.String r10 = "MicroMsg.SnsOnlineVideoActivity"
            java.lang.String r13 = "init data get intent info finish. thumbPath %s localId %s scene %d isPreView %b isMute %b videoPath %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r6)
            boolean r6 = r1.f278401i
            if (r6 != 0) goto L_0x0166
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ Exception -> 0x014c }
            java.lang.String r6 = r1.f278397e     // Catch:{ Exception -> 0x014c }
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.mo139798DN(r6)     // Catch:{ Exception -> 0x014c }
            r1.f278403n = r0     // Catch:{ Exception -> 0x014c }
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r0.getTimeLine()     // Catch:{ Exception -> 0x014c }
            te3.j00 r0 = r0.ContentObj     // Catch:{ Exception -> 0x014c }
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h     // Catch:{ Exception -> 0x014c }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ Exception -> 0x014c }
            te3.kv2 r0 = (te3.C101804kv2) r0     // Catch:{ Exception -> 0x014c }
            r1.f278404o = r0     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "init data finish, sns info local id %s "
            java.lang.Object[] r6 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x014c }
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r1.f278403n     // Catch:{ Exception -> 0x014c }
            java.lang.String r13 = r13.getLocalid()     // Catch:{ Exception -> 0x014c }
            r6[r8] = r13     // Catch:{ Exception -> 0x014c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r6)     // Catch:{ Exception -> 0x014c }
            te3.kv2 r0 = r1.f278404o     // Catch:{ Exception -> 0x014c }
            if (r0 == 0) goto L_0x0168
            l03.f r6 = l03.C99279f.f291124a     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = r0.f298689d     // Catch:{ Exception -> 0x014c }
            r6.mo138691d(r0)     // Catch:{ Exception -> 0x014c }
            goto L_0x0168
        L_0x014c:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "init data exception "
            r6.append(r13)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x0168
        L_0x0166:
            r1.f278399g = r0
        L_0x0168:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            r0 = 19
            boolean r0 = p206nj.C11171e.m11046c(r0)     // Catch:{ Exception -> 0x019d }
            if (r0 == 0) goto L_0x0184
            boolean r0 = r1.f278401i     // Catch:{ Exception -> 0x019d }
            if (r0 != 0) goto L_0x0181
            android.view.Window r0 = r27.getWindow()     // Catch:{ Exception -> 0x019d }
            r5 = 201327616(0xc000400, float:9.861965E-32)
            r0.setFlags(r5, r5)     // Catch:{ Exception -> 0x019d }
        L_0x0181:
            r1.f278373C = r11     // Catch:{ Exception -> 0x019d }
            goto L_0x0193
        L_0x0184:
            boolean r0 = r1.f278401i     // Catch:{ Exception -> 0x019d }
            if (r0 != 0) goto L_0x0191
            android.view.Window r0 = r27.getWindow()     // Catch:{ Exception -> 0x019d }
            r5 = 1024(0x400, float:1.435E-42)
            r0.setFlags(r5, r5)     // Catch:{ Exception -> 0x019d }
        L_0x0191:
            r1.f278373C = r8     // Catch:{ Exception -> 0x019d }
        L_0x0193:
            android.view.Window r0 = r27.getWindow()     // Catch:{ Exception -> 0x019d }
            r5 = 128(0x80, float:1.794E-43)
            r0.addFlags(r5)     // Catch:{ Exception -> 0x019d }
            goto L_0x01a3
        L_0x019d:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r2, r5)
        L_0x01a3:
            com.tencent.mm.pluginsdk.ui.a$e r0 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.DEFAULT
            com.tencent.mm.pluginsdk.ui.a$e r5 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.CONTAIN
            java.lang.String r6 = "initUIView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            com.tencent.mm.ui.tools.m0 r13 = new com.tencent.mm.ui.tools.m0
            androidx.appcompat.app.AppCompatActivity r14 = r27.getContext()
            r13.<init>(r14)
            r1.f278414x = r13
            r13 = 2131316243(0x7f094e13, float:1.8250962E38)
            android.view.View r13 = r1.findViewById(r13)
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            r1.f278405p = r13
            r13 = 2131316245(0x7f094e15, float:1.8250966E38)
            android.view.View r13 = r1.findViewById(r13)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r1.f278409s = r13
            com.tencent.mm.plugin.sns.ui.video.a r14 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r13 = r1.f278380J
            r14.getClass()
            java.lang.String r15 = "findAndReCreateVideoView"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r12)
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r16 == 0) goto L_0x01e7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r12)
            goto L_0x0216
        L_0x01e7:
            java.util.List<com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView> r9 = r14.f281267b
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x01ef:
            boolean r16 = r9.hasNext()
            if (r16 == 0) goto L_0x0210
            java.lang.Object r16 = r9.next()
            r7 = r16
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r7 = (com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView) r7
            java.lang.String r8 = r7.f281251K1
            boolean r8 = r13.equals(r8)
            if (r8 == 0) goto L_0x020d
            java.util.List<com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView> r8 = r14.f281267b
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.remove(r7)
            goto L_0x0211
        L_0x020d:
            r7 = -1
            r8 = 0
            goto L_0x01ef
        L_0x0210:
            r7 = 0
        L_0x0211:
            if (r7 != 0) goto L_0x0218
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r12)
        L_0x0216:
            r7 = 0
            goto L_0x022b
        L_0x0218:
            android.view.ViewParent r8 = r7.getParent()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto L_0x0224
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r12)
            goto L_0x022b
        L_0x0224:
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r9 = r14.f281270e
            if (r7 == r9) goto L_0x022f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r12)
        L_0x022b:
            r21 = r2
            goto L_0x02bf
        L_0x022f:
            java.lang.String r9 = "cloneNewOne"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r12)
            android.content.Context r11 = r7.getContext()
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r11 = r14.mo133931c(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r12)
            r9 = 1
            r7.f281255O1 = r9
            r8.removeView(r7)
            android.view.ViewParent r16 = r11.getParent()
            if (r16 == 0) goto L_0x0259
            r11.mo133915c0()
            r11.f281255O1 = r9
            android.view.ViewParent r9 = r11.getParent()
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r9.removeView(r11)
        L_0x0259:
            r9 = 0
            r11.setVisibility(r9)
            com.tencent.mm.pluginsdk.ui.a$e r9 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r11.setVideoScaleType(r9)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r21 = r2
            r2 = -1
            r9.<init>(r2, r2)
            r8.addView(r11, r9)
            com.tencent.mm.plugin.sns.ui.video.a$a r2 = new com.tencent.mm.plugin.sns.ui.video.a$a
            r2.<init>()
            r11.setTag(r2)
            bv2.f r2 = r7.f281250J1
            te3.kv2 r8 = r2.f264168a
            java.lang.String r9 = r2.f264169b
            int r2 = r2.f264170c
            r11.mo132324P(r8, r9, r2)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            r11.setThumbViewScaleType(r2)
            boolean r2 = r14.mo133929a()
            if (r2 == 0) goto L_0x029c
            java.lang.String r2 = r7.f281251K1
            r14.f281269d = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r11)
            r14.f281270e = r11
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$c r2 = com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView.C96252c.PLAYING
            r11.f281249I1 = r2
            r9 = r15
            goto L_0x02af
        L_0x029c:
            bv2.f r2 = r7.f281250J1
            r18 = 0
            r19 = 1
            java.lang.String r8 = r7.f281251K1
            java.lang.String r17 = ""
            r9 = r15
            r15 = r11
            r16 = r2
            r20 = r8
            r14.mo133939l(r15, r16, r17, r18, r19, r20)
        L_0x02af:
            r2 = 1
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r2 = 0
            r8[r2] = r13
            java.lang.String r2 = "MicroMsg.Sns.SnsVideoViewMgr"
            java.lang.String r11 = "findAndReCreateVideoView lxl reAttach succ %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r12)
        L_0x02bf:
            r1.f278408r = r7
            r2 = 2131314034(0x7f094572, float:1.8246482E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.f278386Q = r2
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r2 = r1.f278408r
            if (r2 != 0) goto L_0x02d8
            r2 = 0
            r1.f278379I = r2
            java.lang.String r2 = "fromplayingvideo but videoview is null, reset it"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
        L_0x02d8:
            boolean r2 = r1.f278379I
            r7 = 2131316244(0x7f094e14, float:1.8250964E38)
            r8 = 8
            if (r2 == 0) goto L_0x0380
            com.tencent.mm.plugin.sns.ui.video.a r2 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            r2.mo133935h()
            android.view.View r2 = r1.findViewById(r7)
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r2 = (com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView) r2
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r7 = r1.f278408r
            android.view.ViewParent r7 = r7.getParent()
            if (r7 == 0) goto L_0x0303
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r7 = r1.f278408r
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r9 = r1.f278408r
            r7.removeView(r9)
        L_0x0303:
            android.view.ViewGroup$LayoutParams r7 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r7 = (android.widget.FrameLayout.LayoutParams) r7
            android.widget.FrameLayout r9 = r1.f278409s
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r11 = r1.f278408r
            r9.addView(r11, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "initUIView videoViewContainer add videoView = "
            r7.append(r9)
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r9 = r1.f278408r
            java.lang.String r9 = r9.toString()
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)
            boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r7 != 0) goto L_0x033d
            boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r7 == 0) goto L_0x0337
            goto L_0x033d
        L_0x0337:
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r5 = r1.f278408r
            r5.setVideoScaleType(r0)
            goto L_0x0342
        L_0x033d:
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            r0.setVideoScaleType(r5)
        L_0x0342:
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r5 = r1.f278408r
            int r5 = r5.getCurrentPosition()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 0
            r0[r7] = r5
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r5 = r1.f278408r
            int r5 = r5.getDuration()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 1
            r0[r7] = r5
            java.lang.String r5 = "videoView position %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r0)
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            int r0 = r0.getCurrentPosition()
            int r0 = r0 + 500
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r5 = r1.f278408r
            int r5 = r5.getDuration()
            if (r0 < r5) goto L_0x037b
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            r5 = 0
            r0.mo132322N(r5, r7)
        L_0x037b:
            r2.setVisibility(r8)
            goto L_0x042e
        L_0x0380:
            android.view.View r2 = r1.findViewById(r7)
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r2 = (com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView) r2
            r1.f278408r = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            sg.q r7 = new sg.q
            f40.e r9 = f40.C86709a0.m107523b()
            int r9 = r9.mo121110g()
            r7.<init>((int) r9)
            java.lang.String r7 = r7.toString()
            r2.append(r7)
            java.lang.String r7 = "_"
            r2.append(r7)
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.f278381K = r2
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.f278382L = r11
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r2 = r1.f278408r
            java.lang.String r7 = r1.f278381K
            r2.setSessionId(r7)
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r2 = r1.f278408r
            long r11 = r1.f278382L
            r2.setSessionTimestamp(r11)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r1.f278403n
            if (r2 == 0) goto L_0x0416
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r7 = r1.f278408r
            long r11 = r2.field_snsId
            java.lang.String r2 = vr2.C102236a0.m134765q0(r11)
            r7.setSnsId(r2)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r1.f278403n
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r2.getTimeLine()
            te3.j00 r2 = r2.ContentObj
            if (r2 == 0) goto L_0x0416
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r1.f278403n
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r2.getTimeLine()
            te3.j00 r2 = r2.ContentObj
            java.util.LinkedList<te3.kv2> r2 = r2.f298427h
            if (r2 == 0) goto L_0x0416
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r1.f278403n
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r2.getTimeLine()
            te3.j00 r2 = r2.ContentObj
            java.util.LinkedList<te3.kv2> r2 = r2.f298427h
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0416
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r2 = r1.f278408r
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f278403n
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r7.getTimeLine()
            te3.j00 r7 = r7.ContentObj
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            r9 = 0
            java.lang.Object r7 = r7.get(r9)
            te3.kv2 r7 = (te3.C101804kv2) r7
            java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120295n(r7)
            r2.setFilePath(r7)
        L_0x0416:
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r2 != 0) goto L_0x0429
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r2 == 0) goto L_0x0423
            goto L_0x0429
        L_0x0423:
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r2 = r1.f278408r
            r2.setVideoScaleType(r0)
            goto L_0x042e
        L_0x0429:
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            r0.setVideoScaleType(r5)
        L_0x042e:
            boolean r0 = r1.f278402j
            if (r0 != 0) goto L_0x0438
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            r0.mo132319I()
            goto L_0x043e
        L_0x0438:
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            r2 = 0
            r0.mo132372y(r2)
        L_0x043e:
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            r0.getClass()
            java.lang.String r2 = "enableSnsEvent"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.OnlineVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            r0.f277202l1 = r1
            r7 = 1
            r0.f277203m1 = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            int r2 = r1.f278383M
            r0.setScene(r2)
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            r2 = 2
            r0.setWindowType(r2)
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            java.lang.String r2 = "initSeekBar"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f278403n
            if (r7 != 0) goto L_0x048f
            os2.e0 r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r9 = r1.f278397e
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r7.mo139798DN(r9)
            r1.f278403n = r7
            if (r7 != 0) goto L_0x047e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            r13 = 0
            goto L_0x0645
        L_0x047e:
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r7.getTimeLine()
            te3.j00 r7 = r7.ContentObj
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            r9 = 0
            java.lang.Object r7 = r7.get(r9)
            te3.kv2 r7 = (te3.C101804kv2) r7
            r1.f278404o = r7
        L_0x048f:
            te3.kv2 r7 = r1.f278404o
            float r7 = r7.f298684R
            int r7 = java.lang.Math.round(r7)
            int r7 = r7 * 1000
            java.lang.String r9 = "getSnsVideoShowSeekBarDurationMs"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r11)
            di3.d r12 = di3.C86312j.m106911c(r0)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_sns_video_show_seekbar_duration
            r14 = 16000(0x3e80, float:2.2421E-41)
            int r12 = r12.mo58779Qe(r13, r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "getSnsVideoShowSeekBarDurationMs: "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "MicroMsg.SnsVideoConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r9 = r1.f278408r
            int r11 = r1.f278388S
            r13 = 1
            r9.mo132355r(r11, r13)
            java.lang.String r9 = "handleThirdJumperMargin"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
            boolean r11 = r1.f278401i
            if (r11 != 0) goto L_0x056e
            java.lang.String r11 = r1.f278385P
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x04e2
            goto L_0x056e
        L_0x04e2:
            c30.g r11 = new c30.g     // Catch:{ f -> 0x0564 }
            java.lang.String r13 = r1.f278385P     // Catch:{ f -> 0x0564 }
            r11.<init>((java.lang.String) r13)     // Catch:{ f -> 0x0564 }
            java.lang.String r13 = "APP_TYPE"
            java.lang.String r13 = r11.optString(r13)     // Catch:{ f -> 0x0564 }
            java.lang.String r14 = "MSG_EXT"
            java.lang.String r11 = r11.optString(r14)     // Catch:{ f -> 0x0564 }
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto L_0x0560
            boolean r14 = android.text.TextUtils.isEmpty(r11)
            if (r14 == 0) goto L_0x0502
            goto L_0x0560
        L_0x0502:
            r13.getClass()
            java.lang.String r14 = "APP_TYPE_SECOND_CUP"
            boolean r14 = r13.equals(r14)
            if (r14 != 0) goto L_0x0511
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            goto L_0x0571
        L_0x0511:
            di3.d r14 = di3.C86312j.m106911c(r0)
            h81.h r14 = (h81.C32735h) r14
            h81.h$c r15 = h81.C32735h.C32737c.clicfg_second_cut_simple_style_entrance
            r8 = 0
            boolean r14 = r14.mo58784wf(r15, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "SecondCutSimpleStyleEntrance: "
            r8.append(r15)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            java.lang.String r15 = "MicroMsg.SecondCutConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r8)
            if (r14 != 0) goto L_0x053a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            goto L_0x0571
        L_0x053a:
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r8 = r1.f278408r
            androidx.appcompat.app.AppCompatActivity r14 = r27.getContext()
            r15 = 56
            int r14 = kg3.C76577a.m92151b(r14, r15)
            r15 = 0
            r8.mo132355r(r14, r15)
            java.lang.String r8 = "dealSecondCutJumpClick"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r4)
            android.widget.LinearLayout r14 = r1.f278386Q
            com.tencent.mm.plugin.sns.ui.m5 r15 = new com.tencent.mm.plugin.sns.ui.m5
            r15.<init>(r1, r11)
            r14.setOnClickListener(r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            goto L_0x0573
        L_0x0560:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            goto L_0x0571
        L_0x0564:
            java.lang.String r8 = "parse third msgJson error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            goto L_0x0571
        L_0x056e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
        L_0x0571:
            r13 = r21
        L_0x0573:
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r8 = r1.f278408r
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$c r9 = new com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$c
            r9.<init>(r1, r13)
            r8.getClass()
            java.lang.String r11 = "showSeekBarIfLessThanLimit"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r5)
            java.lang.String r13 = r8.f277187d
            r14 = 3
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r17 = 0
            r15[r17] = r14
            com.tencent.mm.pluginsdk.ui.tools.r0 r14 = r8.f277145A
            int r14 = r14.getDuration()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r17 = 1
            r15[r17] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            r17 = 2
            r15[r17] = r14
            java.lang.String r14 = "showSeekBarIfLessThanLimit limit:%d current:%d total:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r15)
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView r13 = r8.f277178V0
            long r14 = (long) r7
            r13.setTotalTimeMs(r14)
            if (r7 < r12) goto L_0x061d
            java.lang.String r7 = "enableShowSeekBar"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r5)
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r12 = h81.C32735h.C32737c.clicfg_sns_show_seek_bar
            r13 = 1
            boolean r0 = r0.mo58784wf(r12, r13)
            java.lang.String r12 = r8.f277187d
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            r15 = 0
            r14[r15] = r13
            java.lang.String r13 = "enableShowSeekBar:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r5)
            if (r0 == 0) goto L_0x061d
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView r0 = r8.f277178V0
            r0.setVisibility(r15)
            android.widget.ImageView r0 = r8.f277180W0
            r0.setVisibility(r15)
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView r0 = r8.f277178V0
            com.tencent.mm.plugin.sns.ui.OnlineVideoView$4 r7 = new com.tencent.mm.plugin.sns.ui.OnlineVideoView$4
            r7.<init>()
            r0.setVideoPlayDurationProvider(r7)
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView r0 = r8.f277178V0
            r7 = 1
            r0.f283697u = r7
            a14.n0 r7 = r0.f283696t
            be3.a r12 = new be3.a
            r13 = 0
            r12.<init>(r0, r13)
            r22 = 0
            r23 = 0
            r25 = 3
            r26 = 0
            r21 = r7
            r24 = r12
            a14.C53895h.m60466d(r21, r22, r23, r24, r25, r26)
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView r0 = r8.f277178V0
            com.tencent.mm.pluginsdk.ui.tools.r0 r7 = r8.f277145A
            java.lang.String r7 = r7.getVideoPath()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r12 = 1
            r7 = r7 ^ r12
            r0.setEnableDrag(r7)
            goto L_0x0621
        L_0x061d:
            r13 = 0
            r8.mo132370w()
        L_0x0621:
            java.lang.String r0 = "safeLayoutVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
            com.tencent.mm.pluginsdk.ui.tools.r0 r7 = r8.f277145A
            boolean r7 = r7 instanceof android.view.View
            if (r7 == 0) goto L_0x063c
            zt3.t r7 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.sns.ui.OnlineVideoView$28 r12 = new com.tencent.mm.plugin.sns.ui.OnlineVideoView$28
            r12.<init>(r9)
            zt3.j r7 = (zt3.C119157j) r7
            lu3.c r7 = r7.mo183870a(r12)
            r8.f277181X0 = r7
        L_0x063c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
        L_0x0645:
            boolean r0 = r1.f278379I
            if (r0 == 0) goto L_0x064e
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            r0.mo132330W()
        L_0x064e:
            boolean r0 = r1.f278401i
            if (r0 != 0) goto L_0x0676
            boolean r0 = r1.f278379I
            if (r0 != 0) goto L_0x06b8
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f278403n
            if (r0 == 0) goto L_0x06b8
            ds2.j r2 = ds2.C97540j.f286244a
            te3.kv2 r5 = r1.f278404o
            r7 = 0
            r2.mo136810b(r0, r5, r7)
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            te3.kv2 r2 = r1.f278404o
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f278403n
            java.lang.String r5 = r5.getLocalid()
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f278403n
            int r7 = r7.getCreateTime()
            r0.mo132324P(r2, r5, r7)
            goto L_0x06b8
        L_0x0676:
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            java.lang.String r2 = r1.f278399g
            java.lang.String r7 = r1.f278398f
            r0.getClass()
            java.lang.String r8 = "setPreviewVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
            r0.f277195h = r2
            r9 = 1
            r0.f277191f = r9
            android.widget.ImageView r11 = r0.f277231z
            r12 = 1065353216(0x3f800000, float:1.0)
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.decodeFile(r7, r12)
            r11.setImageBitmap(r7)
            java.lang.String r7 = r0.f277187d
            r11 = 3
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r12 = r0.hashCode()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14 = 0
            r11[r14] = r12
            r11[r9] = r2
            boolean r0 = r0.f277191f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 2
            r11[r2] = r0
            java.lang.String r0 = "%d set preview video %s isPreview %b "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
        L_0x06b8:
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            boolean r2 = r1.f278402j
            r0.setMute(r2)
            r0 = 2131305325(0x7f09236d, float:1.8228818E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f278407q = r0
            boolean r0 = r1.f278401i
            if (r0 == 0) goto L_0x06d9
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r0 = r1.f278408r
            com.tencent.mm.plugin.sns.ui.h5 r2 = new com.tencent.mm.plugin.sns.ui.h5
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            goto L_0x06f7
        L_0x06d9:
            r27.hideTitleView()
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120216d()
            if (r0 == 0) goto L_0x06ed
            android.widget.FrameLayout r0 = r1.f278409s
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$a r2 = new com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$a
            r2.<init>()
            r0.setOnClickListener(r2)
            goto L_0x06f7
        L_0x06ed:
            android.widget.RelativeLayout r0 = r1.f278405p
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$b r2 = new com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$b
            r2.<init>(r1)
            r0.setOnTouchListener(r2)
        L_0x06f7:
            android.view.GestureDetector r0 = new android.view.GestureDetector
            androidx.appcompat.app.AppCompatActivity r2 = r27.getContext()
            com.tencent.mm.plugin.sns.ui.i5 r5 = new com.tencent.mm.plugin.sns.ui.i5
            r5.<init>(r1)
            r0.<init>(r2, r5)
            r1.f278395Z = r0
            android.widget.FrameLayout r0 = r1.f278409s
            com.tencent.mm.plugin.sns.ui.j5 r2 = new com.tencent.mm.plugin.sns.ui.j5
            r2.<init>(r1)
            r0.setOnTouchListener(r2)
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f278403n
            java.lang.String r2 = "initGameMoreButton"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            if (r0 != 0) goto L_0x0724
            java.lang.String r0 = "snsInfo is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            goto L_0x0772
        L_0x0724:
            r5 = 2131305528(0x7f092438, float:1.822923E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r1.f278374D = r5
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r0.getTimeLine()
            if (r0 == 0) goto L_0x0738
            te3.k1 r9 = r0.actionInfo
            goto L_0x0739
        L_0x0738:
            r9 = r13
        L_0x0739:
            com.tencent.mm.plugin.sns.ui.w6 r5 = new com.tencent.mm.plugin.sns.ui.w6
            r5.<init>()
            te3.k1 r7 = r0.actionInfo
            com.tencent.p014mm.plugin.sns.p106ui.C96318y1.m123547a(r1, r5, r7)
            boolean r7 = r5.f281365Y
            if (r7 == 0) goto L_0x0768
            android.widget.Button r7 = r1.f278374D
            r8 = 0
            r7.setVisibility(r8)
            android.widget.Button r7 = r1.f278374D
            java.lang.String r5 = r5.f281366Z
            r7.setText(r5)
            android.widget.Button r5 = r1.f278374D
            com.tencent.mm.plugin.sns.ui.n5 r7 = new com.tencent.mm.plugin.sns.ui.n5
            r7.<init>(r1, r9, r0)
            r5.setOnClickListener(r7)
            int r0 = r27.getRequestedOrientation()
            if (r0 == 0) goto L_0x076f
            r27.mo132869Q7()
            goto L_0x076f
        L_0x0768:
            android.widget.Button r0 = r1.f278374D
            r5 = 8
            r0.setVisibility(r5)
        L_0x076f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
        L_0x0772:
            boolean r0 = r1.f278401i
            if (r0 == 0) goto L_0x0791
            boolean r0 = r1.f278378H
            if (r0 != 0) goto L_0x0789
            r0 = 2131821450(0x7f11038a, float:1.9275644E38)
            r2 = 2131756277(0x7f1004f5, float:1.9143457E38)
            com.tencent.mm.plugin.sns.ui.k5 r5 = new com.tencent.mm.plugin.sns.ui.k5
            r5.<init>(r1)
            r7 = 0
            r1.addIconOptionMenu((int) r7, (int) r0, (int) r2, (android.view.MenuItem.OnMenuItemClickListener) r5)
        L_0x0789:
            com.tencent.mm.plugin.sns.ui.l5 r0 = new com.tencent.mm.plugin.sns.ui.l5
            r0.<init>(r1)
            r1.setBackBtn(r0)
        L_0x0791:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120216d()
            if (r0 == 0) goto L_0x07d9
            androidx.appcompat.app.AppCompatActivity r0 = r27.getContext()
            android.view.View r2 = r27.getContentView()
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r5 = r1.f278408r
            android.view.View r5 = r5.getRoot()
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$h r6 = new com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$h
            r6.<init>(r1)
            java.lang.String r7 = "context"
            gy3.C87412m.m108594g(r0, r7)
            java.lang.String r7 = "contentView"
            gy3.C87412m.m108594g(r2, r7)
            java.lang.String r7 = "touchView"
            gy3.C87412m.m108594g(r5, r7)
            com.tencent.mm.ui.widget.TouchMediaPreviewLayout r7 = new com.tencent.mm.ui.widget.TouchMediaPreviewLayout
            r7.<init>(r0)
            r7.mo153909c(r2)
            go3.z r0 = new go3.z
            r0.<init>(r7, r5)
            r7.setDoubleTapListener(r0)
            go3.a0 r0 = new go3.a0
            r0.<init>(r5, r7)
            r7.setScaleListener(r0)
            r7.setLongPressListener(r6)
            goto L_0x07dc
        L_0x07d9:
            r27.mo132874V7()
        L_0x07dc:
            com.tencent.mm.autogen.events.UIStatusChangedEvent r0 = new com.tencent.mm.autogen.events.UIStatusChangedEvent
            r0.<init>()
            com.tencent.mm.autogen.events.UIStatusChangedEvent$a r2 = r0.f193971d
            r5 = 1
            r2.f193972a = r5
            r0.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        Log.m105925i("MicroMsg.SnsOnlineVideoActivity", "onDestroy fromPlayingVideo %s", Boolean.valueOf(this.f278379I));
        if (this.f278379I) {
            C96254a.m123394d().mo133936i(this);
            this.f278408r.mo130402D();
            OnlineVideoView onlineVideoView = this.f278408r;
            onlineVideoView.getClass();
            SnsMethodCalculate.markStartTimeMs("disableSnsEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            onlineVideoView.f277202l1 = null;
            onlineVideoView.f277203m1 = false;
            SnsMethodCalculate.markEndTimeMs("disableSnsEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            FrameLayout frameLayout = this.f278409s;
            if (frameLayout != null) {
                frameLayout.removeView(this.f278408r);
                Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "onDestroy remove videoView = " + this.f278408r.toString());
            } else {
                Log.m105920e("MicroMsg.SnsOnlineVideoActivity", "onDestroy videoViewContainer = null, undo remove videoView");
            }
            if (!this.f278384N) {
                C96254a.m123394d().mo133937j();
            }
        } else {
            this.f278408r.mo130402D();
        }
        try {
            getWindow().clearFlags(128);
        } catch (Exception unused) {
        }
        super.onDestroy();
        SnsInfo snsInfo = this.f278403n;
        if (snsInfo != null && snsInfo.getTimeLine().ContentObj.f298427h.size() > 0) {
            int playVideoDuration = this.f278408r.getPlayVideoDuration();
            String str = this.f278403n.getTimeLine().ContentObj.f298427h.get(0).f298692g;
            int i = this.f278403n.getTimeLine().sightFolded;
            ((C119157j) C119157j.f356862d).mo183884o(new SnsOnlineVideoActivity$$e(this, str, i, playVideoDuration));
        }
        C60960c.f173618a.mo85927k("SnsPublishProcess", "mediaPreviewPageStaytime_", Long.valueOf(getActivityBrowseTimeMs()), C60242i.APPEND);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        getWindow().setFlags(2048, 2048);
        if (this.f278379I) {
            ((SnsTimelineVideoView) this.f278408r).mo133923l0();
        } else {
            OnlineVideoView onlineVideoView = this.f278408r;
            onlineVideoView.getClass();
            SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            Log.m105919d(onlineVideoView.f277187d, "%d on pause %s ", Integer.valueOf(onlineVideoView.hashCode()), Util.getStack());
            onlineVideoView.mo132356s();
            C96875r0 r0Var = onlineVideoView.f277145A;
            if (r0Var != null) {
                r0Var.stop();
            }
            onlineVideoView.f277170R0 = false;
            onlineVideoView.f277169R = false;
            SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
        if (!this.f278412v) {
            SnsMethodCalculate.markStartTimeMs("closePopup", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            Log.m105918d("MicroMsg.SnsOnlineVideoActivity", "close Popup");
            if (this.f278375E) {
                new MMHandler().postDelayed(new C95768e5(this), 500);
            } else {
                new MMHandler().post(new C95781f5(this));
            }
            SnsMethodCalculate.markEndTimeMs("closePopup", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        super.onPause();
        C103928o.m138642b();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        getWindow().clearFlags(2048);
        if (this.f278379I) {
            this.f278408r.mo130404K();
        } else if (!this.f278396d) {
            this.f278408r.mo130403E();
        }
        this.f278396d = false;
        if (this.f278412v) {
            this.f278412v = false;
        }
        super.onResume();
        C103928o.m138641a(true, true, true);
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }

    public void onStart() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        Bundle bundle = this.f278410t;
        SnsMethodCalculate.markStartTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (this.f278413w) {
            SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        } else {
            this.f278413w = true;
            this.f278416y = getIntent().getIntExtra("img_gallery_top", 0);
            this.f278417z = getIntent().getIntExtra("img_gallery_left", 0);
            this.f278371A = getIntent().getIntExtra("img_gallery_width", 0);
            int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
            this.f278372B = intExtra;
            C45059m0 m0Var = this.f278414x;
            if (m0Var != null) {
                m0Var.mo70410e(this.f278417z, this.f278416y, this.f278371A, intExtra);
            }
            if (bundle == null) {
                this.f278409s.getViewTreeObserver().addOnPreDrawListener(new C95793g5(this));
            }
            SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        super.onStart();
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
    }
}
