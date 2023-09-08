package com.tencent.p014mm.plugin.sns.p106ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import ap2.C27993a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OpenSnsAdFloatPageEvent;
import com.tencent.p014mm.autogen.events.SnsAdFloatPageLifecycleEvent;
import com.tencent.p014mm.autogen.events.SnsAdNativePageLifecycleEvent;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingHBCardComponent;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94625d;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94651l;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.view.AdLandingGeneralVideoWrapper;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.C94696a;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.floatpage.FloatJumpCompHelper;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.preload.PreloadInfo;
import com.tencent.p014mm.plugin.sns.p104ad.widget.advideo.AdLandingVideoPlayerToolBar;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.GLTwistRoateCardsView;
import com.tencent.p014mm.plugin.sns.p106ui.helper.FloatWebViewHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdLandingPageFloatView;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95046a0;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95066b0;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95074c0;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95081d0;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95084e0;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95094h;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95222u1;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95243v0;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95287y1;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95250a;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95251e;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e00.C45513i0;
import ea2.C31443g;
import eb0.C86493v0;
import eb0.C97621e;
import fp2.C87066b;
import fp2.C87067c;
import fp2.C87070f;
import fy3.C32226l;
import gv2.C98234i;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60194q2;
import i72.C98607d;
import ip2.C98778a;
import ir2.C98784a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jq2.C99001u;
import jt2.C99024c;
import jt2.C99027d;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import ko2.C46734a;
import lo2.C99520a0;
import lo2.C99544i0;
import lo2.C99577z;
import mp2.C34628a;
import nb0.C88912b;
import nb0.C88913c;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76879j;
import nj3.C88989a;
import org.json.JSONObject;
import p1208q3.C118144a;
import p749xh.C102646h;
import pb1.C47453t0;
import po2.C47515c;
import po2.C47516d;
import po2.C47517e;
import ps2.C100882l;
import ps2.C100894u;
import ps2.C100903z;
import ps2.C12004a;
import qo3.C77407n;
import qo3.C89779i0;
import qs2.C101253a;
import qs2.C101255a0;
import qs2.C101256b;
import qs2.C101262e;
import qs2.C101263e0;
import qs2.C101271i0;
import qs2.C101285q;
import qs2.C101287r;
import qs2.C101293t0;
import qs2.C101298y;
import rq2.C101425k;
import rq2.C101429o;
import rx3.C13598b0;
import so2.C101665a;
import so2.C101675j;
import so2.C101676k;
import so2.C101679m;
import te3.bb4;
import te3.cb4;
import vo3.C90852c;
import vr2.C102236a0;
import vr2.C102260r;
import vr2.C37817q;
import wo2.C102466d;
import wo2.C102474i;
import ws2.C102495c;
import xo2.C102702a;
import zo2.C103049a;
import zt3.C119157j;

@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI */
public class SnsAdNativeLandingPagesUI extends MMActivity implements C96067m3 {

    /* renamed from: D2 */
    public static List<C101255a0> f277498D2 = Collections.synchronizedList(new ArrayList());

    /* renamed from: A */
    public String f277499A;

    /* renamed from: A1 */
    public volatile boolean f277500A1 = false;

    /* renamed from: A2 */
    public FloatJumpCompHelper f277501A2;

    /* renamed from: B */
    public String f277502B;

    /* renamed from: B1 */
    public volatile boolean f277503B1 = false;

    /* renamed from: B2 */
    public View.OnClickListener f277504B2;

    /* renamed from: C */
    public String f277505C;

    /* renamed from: C1 */
    public MMHandler f277506C1 = new MMHandler();

    /* renamed from: C2 */
    public View.OnClickListener f277507C2;

    /* renamed from: D */
    public int f277508D;

    /* renamed from: D1 */
    public String f277509D1 = "";

    /* renamed from: E */
    public int f277510E;

    /* renamed from: E1 */
    public FloatWebViewHelper f277511E1;

    /* renamed from: F */
    public String f277512F;

    /* renamed from: F1 */
    public C77407n f277513F1;

    /* renamed from: G */
    public String f277514G;

    /* renamed from: G1 */
    public boolean f277515G1 = false;

    /* renamed from: H */
    public String f277516H;

    /* renamed from: H1 */
    public boolean f277517H1 = false;

    /* renamed from: I */
    public String f277518I;

    /* renamed from: I1 */
    public AdLandingPageEggCardHelper f277519I1;

    /* renamed from: J */
    public String f277520J;

    /* renamed from: J1 */
    public boolean f277521J1 = false;

    /* renamed from: K */
    public String f277522K;

    /* renamed from: K1 */
    public long f277523K1;

    /* renamed from: L */
    public boolean f277524L = false;

    /* renamed from: L1 */
    public boolean f277525L1;

    /* renamed from: M */
    public long f277526M;

    /* renamed from: M1 */
    public AdLandingGeneralVideoWrapper f277527M1;

    /* renamed from: N */
    public long f277528N = 0;

    /* renamed from: N1 */
    public boolean f277529N1;

    /* renamed from: O1 */
    public String f277530O1 = "";

    /* renamed from: P */
    public long f277531P = 0;

    /* renamed from: P1 */
    public C102466d.C102468b f277532P1 = new C102466d.C102468b();

    /* renamed from: Q */
    public String f277533Q;

    /* renamed from: Q0 */
    public boolean f277534Q0 = false;

    /* renamed from: Q1 */
    public String f277535Q1 = "";

    /* renamed from: R */
    public String f277536R;

    /* renamed from: R0 */
    public int f277537R0;

    /* renamed from: R1 */
    public String f277538R1 = "";

    /* renamed from: S */
    public String f277539S;

    /* renamed from: S0 */
    public String f277540S0;

    /* renamed from: S1 */
    public C47517e f277541S1;

    /* renamed from: T */
    public int f277542T;

    /* renamed from: T0 */
    public String f277543T0;

    /* renamed from: T1 */
    public C95243v0 f277544T1;

    /* renamed from: U */
    public String f277545U;

    /* renamed from: U0 */
    public String f277546U0;

    /* renamed from: U1 */
    public C54219z<Integer> f277547U1 = new C54219z<>(0);

    /* renamed from: V */
    public Map<String, String> f277548V = new HashMap();

    /* renamed from: V0 */
    public String f277549V0;

    /* renamed from: V1 */
    public C95066b0 f277550V1;

    /* renamed from: W */
    public C100903z f277551W = new C100903z();

    /* renamed from: W0 */
    public AdlandingDummyViewPager f277552W0;

    /* renamed from: W1 */
    public C54219z<Integer> f277553W1 = new C54219z<>();

    /* renamed from: X */
    public volatile boolean f277554X = false;

    /* renamed from: X0 */
    public C101293t0 f277555X0;

    /* renamed from: X1 */
    public boolean f277556X1 = false;

    /* renamed from: Y */
    public int f277557Y;

    /* renamed from: Y0 */
    public int f277558Y0;

    /* renamed from: Y1 */
    public String f277559Y1 = "";

    /* renamed from: Z */
    public boolean f277560Z = false;

    /* renamed from: Z0 */
    public int f277561Z0;

    /* renamed from: Z1 */
    public boolean f277562Z1 = false;

    /* renamed from: a1 */
    public MMHandler f277563a1 = new MMHandler();

    /* renamed from: a2 */
    public boolean f277564a2 = false;

    /* renamed from: b1 */
    public FrameLayout f277565b1;

    /* renamed from: b2 */
    public String f277566b2 = "";

    /* renamed from: c1 */
    public View f277567c1;

    /* renamed from: c2 */
    public String f277568c2 = "";

    /* renamed from: d */
    public LinkedList<C100882l> f277569d = new LinkedList<>();

    /* renamed from: d1 */
    public View f277570d1;

    /* renamed from: d2 */
    public boolean f277571d2 = false;

    /* renamed from: e */
    public C101263e0 f277572e;

    /* renamed from: e1 */
    public boolean f277573e1 = false;

    /* renamed from: e2 */
    public FrameLayout f277574e2;

    /* renamed from: f */
    public ImageView f277575f;

    /* renamed from: f1 */
    public int f277576f1;

    /* renamed from: f2 */
    public FrameLayout f277577f2;

    /* renamed from: g */
    public ImageView f277578g;

    /* renamed from: g1 */
    public int f277579g1;

    /* renamed from: g2 */
    public FrameLayout f277580g2;

    /* renamed from: h */
    public ImageView f277581h;

    /* renamed from: h1 */
    public SnsInfo f277582h1;

    /* renamed from: h2 */
    public C95295z f277583h2;

    /* renamed from: i */
    public TextView f277584i;

    /* renamed from: i1 */
    public Map<String, String> f277585i1;

    /* renamed from: i2 */
    public BroadcastReceiver f277586i2 = new C95431i();

    /* renamed from: j */
    public int f277587j = 0;

    /* renamed from: j1 */
    public List<C95295z> f277588j1;

    /* renamed from: j2 */
    public BroadcastReceiver f277589j2 = new C43074p();

    /* renamed from: k1 */
    public C99024c f277590k1;

    /* renamed from: k2 */
    public String f277591k2 = "";

    /* renamed from: l1 */
    public C99027d f277592l1;

    /* renamed from: l2 */
    public ContentFragment.C95272f f277593l2 = new C95441x();

    /* renamed from: m1 */
    public volatile boolean f277594m1;

    /* renamed from: m2 */
    public ViewPager.OnPageChangeListener f277595m2 = new C95442y();

    /* renamed from: n */
    public int f277596n = 0;

    /* renamed from: n1 */
    public boolean f277597n1;

    /* renamed from: n2 */
    public AdLandingPagesProxy.C94830p f277598n2 = new C95443z();

    /* renamed from: o */
    public int f277599o = 0;

    /* renamed from: o1 */
    public C101271i0 f277600o1;

    /* renamed from: o2 */
    public IListener<OpenSnsAdFloatPageEvent> f277601o2;

    /* renamed from: p */
    public int f277602p = 0;

    /* renamed from: p0 */
    public String f277603p0;

    /* renamed from: p1 */
    public Map<String, SnsAdLandingPageFloatView> f277604p1 = new HashMap();

    /* renamed from: p2 */
    public IListener<SnsAdFloatPageLifecycleEvent> f277605p2;

    /* renamed from: q */
    public ImageView f277606q;

    /* renamed from: q1 */
    public C102702a f277607q1;

    /* renamed from: q2 */
    public Runnable f277608q2;

    /* renamed from: r */
    public Bundle f277609r;

    /* renamed from: r1 */
    public AdLandingFloatBarCompWrapper f277610r1;

    /* renamed from: r2 */
    public ScreenShotUtil.ScreenShotCallback f277611r2;

    /* renamed from: s */
    public boolean f277612s = false;

    /* renamed from: s1 */
    public boolean f277613s1 = false;

    /* renamed from: s2 */
    public boolean f277614s2;

    /* renamed from: t */
    public boolean f277615t = false;

    /* renamed from: t1 */
    public boolean f277616t1 = false;

    /* renamed from: t2 */
    public Map<Integer, ContentFragment> f277617t2;

    /* renamed from: u */
    public boolean f277618u = false;

    /* renamed from: u1 */
    public boolean f277619u1 = false;

    /* renamed from: u2 */
    public boolean f277620u2;

    /* renamed from: v */
    public boolean f277621v = false;

    /* renamed from: v1 */
    public Collection<String> f277622v1 = new HashSet();

    /* renamed from: v2 */
    public C75018a.C75024d f277623v2;

    /* renamed from: w */
    public C94696a f277624w;

    /* renamed from: w1 */
    public String f277625w1;

    /* renamed from: w2 */
    public C74779i.C74781b f277626w2;

    /* renamed from: x */
    public String f277627x;

    /* renamed from: x0 */
    public String f277628x0;

    /* renamed from: x1 */
    public String f277629x1;

    /* renamed from: x2 */
    public BroadcastReceiver f277630x2;

    /* renamed from: y */
    public String f277631y;

    /* renamed from: y0 */
    public int f277632y0 = 0;

    /* renamed from: y1 */
    public volatile boolean f277633y1 = false;

    /* renamed from: y2 */
    public C95074c0 f277634y2;

    /* renamed from: z */
    public String f277635z;

    /* renamed from: z1 */
    public volatile boolean f277636z1 = false;

    /* renamed from: z2 */
    public C89779i0 f277637z2;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$b */
    public class C43070b implements AdLandingPagesProxy.C94830p {
        public C43070b() {
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$11");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$11");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$11");
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doUpdateUxInfoScene end, errType=" + i + ", errNo=" + i2 + ", newUxInfo=" + obj);
            if (i == 0 && i2 == 0 && (obj instanceof String)) {
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
                List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
                SnsMethodCalculate.markStartTimeMs("access$3302", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                snsAdNativeLandingPagesUI.f277536R = (String) obj;
                SnsMethodCalculate.markEndTimeMs("access$3302", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$11");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$c */
    public class C43071c implements View.OnClickListener {
        public C43071c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$13");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
            SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            String str = snsAdNativeLandingPagesUI.f277502B;
            SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
            SnsMethodCalculate.markStartTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            String str2 = snsAdNativeLandingPagesUI2.f277505C;
            SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            snsAdNativeLandingPagesUI.mo132502K8(snsAdNativeLandingPagesUI, str, str2, 1, 14);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$13");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$d */
    public class C43072d implements View.OnClickListener {
        public C43072d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$14");
            SnsAdNativeLandingPagesUI.this.mo132501J8();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$14");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$n */
    public class C43073n implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public final /* synthetic */ long f116586a;

        /* renamed from: b */
        public final /* synthetic */ C32226l f116587b;

        public C43073n(long j, C32226l lVar) {
            this.f116586a = j;
            this.f116587b = lVar;
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
            try {
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
                List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
                SnsMethodCalculate.markStartTimeMs("access$6300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                C47517e eVar = snsAdNativeLandingPagesUI.f277541S1;
                SnsMethodCalculate.markEndTimeMs("access$6300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("isShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                View view = eVar.f127488b;
                boolean z = view != null && view.getVisibility() == 0;
                SnsMethodCalculate.markEndTimeMs("isShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                if (z) {
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
                    snsAdNativeLandingPagesUI2.getClass();
                    SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    C47517e eVar2 = snsAdNativeLandingPagesUI2.f277541S1;
                    eVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                    ((C119157j) C119157j.f356862d).mo183895z(new C47516d(eVar2));
                    SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                    SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                }
                if (obj instanceof String) {
                    String str = (String) obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append("doRequestDynamicCanvasXml callback, pageId is ");
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = SnsAdNativeLandingPagesUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$6400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    String str2 = snsAdNativeLandingPagesUI3.f277538R1;
                    SnsMethodCalculate.markEndTimeMs("access$6400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    sb.append(str2);
                    sb.append(", pageIdParam is ");
                    sb.append(this.f116586a);
                    Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", sb.toString());
                    C32226l lVar = this.f116587b;
                    if (lVar != null) {
                        lVar.invoke(str);
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "doRequestDynamicCanvasXml callback, exp is " + th);
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$27");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$p */
    public class C43074p extends BroadcastReceiver {
        public C43074p() {
        }

        public void onReceive(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$2");
            SnsAdNativeLandingPagesUI.this.mo132510S8();
            SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$s */
    public class C43075s extends BroadcastReceiver {
        public C43075s() {
        }

        public void onReceive(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$32");
            try {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "screenOnReceiver:" + intent.getAction());
                if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    SnsAdNativeLandingPagesUI.this.mo132510S8();
                }
            } catch (Exception e) {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "screenOnReceiver, exp=" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$32");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$v */
    public class C43076v implements View.OnClickListener {
        public C43076v() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$35", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$35");
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "mOnCloseClickListener, onClick");
            if (SnsAdNativeLandingPagesUI.this.keyboardState() == 1) {
                SnsAdNativeLandingPagesUI.this.hideVKB();
            }
            SnsAdNativeLandingPagesUI.this.mo132509R8();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$35");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$35", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$w */
    public class C43077w implements View.OnClickListener {
        public C43077w() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$36", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$36");
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "mOnBackClickListener, onClick");
            C115669n.INSTANCE.mo175911u(1667, 13);
            if (SnsAdNativeLandingPagesUI.this.keyboardState() == 1) {
                SnsAdNativeLandingPagesUI.this.hideVKB();
            }
            SnsAdNativeLandingPagesUI.this.mo132509R8();
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            SnsMethodCalculate.markStartTimeMs("access$7000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            snsAdNativeLandingPagesUI.mo132522Y7();
            SnsMethodCalculate.markEndTimeMs("access$7000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$36");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$36", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$a */
    public class C95424a implements Runnable {
        public C95424a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$10");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
            SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            snsAdNativeLandingPagesUI.mo132499H8();
            SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$10");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$a0 */
    public class C95425a0 implements Runnable {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$a0$a */
        public class C30431a implements Runnable {
            public C30431a(C95425a0 a0Var) {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$8$1");
                C102474i.m135260a();
                String name = PreloadInfo.class.getName();
                C27993a aVar = C27993a.f77262a;
                SnsMethodCalculate.markStartTimeMs("getProcessPreload", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                C32226l<Parcelable, C13598b0> lVar = C27993a.f77264c;
                SnsMethodCalculate.markEndTimeMs("getProcessPreload", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                C102474i.m135261b(name, lVar);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$8$1");
            }
        }

        public C95425a0() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$8");
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "after Connected");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            C102466d.C102468b bVar = snsAdNativeLandingPagesUI.f277532P1;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("ipcEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            bVar.f301740f = System.currentTimeMillis();
            SnsMethodCalculate.markEndTimeMs("ipcEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            if (SnsAdNativeLandingPagesUI.this.isFinishing() || SnsAdNativeLandingPagesUI.this.isDestroyed()) {
                C115669n.INSTANCE.mo175911u(1673, 31);
            }
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
            SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            snsAdNativeLandingPagesUI2.mo132549u8();
            SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            ((C119157j) C119157j.f356862d).mo183884o(new C30431a(this));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$b0 */
    public class C95426b0 {

        /* renamed from: a */
        public String f277642a = "";

        /* renamed from: b */
        public String f277643b = "";

        /* renamed from: c */
        public String f277644c = "";

        public C95426b0(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, C95431i iVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$e */
    public class C95427e implements C11182m0 {
        public C95427e() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
            if (r6 != false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x013f, code lost:
            if (r4 != false) goto L_0x014e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0131  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCreateMMMenu(nj3.C76874e0 r11) {
            /*
                r10 = this;
                java.lang.String r0 = "onCreateMMMenu"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$15"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                int r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.m121809P7(r2)
                r3 = 0
                r4 = 1
                r5 = 2
                if (r2 == 0) goto L_0x001f
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                int r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.m121809P7(r2)
                r2 = r2 & r5
                if (r2 != 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r2 = 0
                goto L_0x002f
            L_0x001f:
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                r6 = 2131834852(0x7f1137e4, float:1.9302826E38)
                java.lang.String r2 = r2.getString(r6)
                r6 = 2131755294(0x7f10011e, float:1.9141463E38)
                r11.mo107144g(r4, r2, r6)
                r2 = 1
            L_0x002f:
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                int r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.m121809P7(r6)
                if (r6 == 0) goto L_0x0040
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                int r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.m121809P7(r6)
                r6 = r6 & r4
                if (r6 != 0) goto L_0x0050
            L_0x0040:
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                r6 = 2131836835(0x7f113fa3, float:1.9306848E38)
                java.lang.String r2 = r2.getString(r6)
                r6 = 2131755285(0x7f100115, float:1.9141445E38)
                r11.mo107144g(r5, r2, r6)
                r2 = 1
            L_0x0050:
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                int r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.m121809P7(r6)
                r7 = 4
                java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
                if (r6 == 0) goto L_0x0064
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                int r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.m121809P7(r6)
                r6 = r6 & r7
                if (r6 != 0) goto L_0x0084
            L_0x0064:
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                java.lang.String r9 = "access$2700"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
                int r6 = r6.f277508D
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
                r9 = 7
                if (r6 == r9) goto L_0x0084
                r2 = 3
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                r9 = 2131823453(0x7f110b5d, float:1.9279706E38)
                java.lang.String r6 = r6.getString(r9)
                r9 = 2131755278(0x7f10010e, float:1.914143E38)
                r11.mo107144g(r2, r6, r9)
                r2 = 1
            L_0x0084:
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                int r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.m121809P7(r6)
                if (r6 == 0) goto L_0x009c
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                java.lang.String r9 = "access$3800"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
                boolean r6 = r6.mo132514U7()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
                if (r6 == 0) goto L_0x00d9
            L_0x009c:
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r6 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                java.lang.String r9 = "access$2600"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
                int r6 = r6.f277537R0
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
                if (r6 != r5) goto L_0x00d9
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                java.lang.String r6 = "access$3900"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
                boolean r5 = r5.mo132512T7()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
                if (r5 == 0) goto L_0x00d9
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                java.lang.String r5 = "access$4000"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
                java.lang.String r2 = r2.f277499A
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
                if (r2 == 0) goto L_0x00d3
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
                java.lang.String r2 = r2.f277499A
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
                goto L_0x00d5
            L_0x00d3:
                java.lang.String r2 = ""
            L_0x00d5:
                r11.mo107144g(r7, r2, r3)
                r2 = 1
            L_0x00d9:
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                int r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.m121809P7(r5)
                if (r5 == 0) goto L_0x00eb
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                int r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.m121809P7(r5)
                r5 = r5 & 32
                if (r5 != 0) goto L_0x0122
            L_0x00eb:
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                java.lang.String r6 = "access$4100"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
                com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper r5 = r5.f277511E1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
                if (r5 == 0) goto L_0x0122
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
                com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper r5 = r5.f277511E1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
                r5.getClass()
                java.lang.String r6 = "getFloatWebViewCompInfo"
                java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                qs2.e r5 = r5.f279562d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                if (r5 == 0) goto L_0x0122
                r2 = 5
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                r6 = 2131836833(0x7f113fa1, float:1.9306844E38)
                java.lang.String r5 = r5.getString(r6)
                r11.mo107144g(r2, r5, r3)
                goto L_0x0123
            L_0x0122:
                r4 = r2
            L_0x0123:
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                java.lang.String r5 = "access$4200"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
                boolean r2 = r2.f277562Z1
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
                if (r2 != 0) goto L_0x0141
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                java.lang.String r5 = "access$4300"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
                boolean r2 = r2.f277564a2
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
                if (r2 != 0) goto L_0x0141
                if (r4 != 0) goto L_0x014e
            L_0x0141:
                r2 = 6
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.this
                r5 = 2131836796(0x7f113f7c, float:1.9306769E38)
                java.lang.String r4 = r4.getString(r5)
                r11.mo107144g(r2, r4, r3)
            L_0x014e:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.C95427e.onCreateMMMenu(nj3.e0):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$f */
    public class C95428f implements C11184p0 {
        public C95428f() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str;
            String str2;
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$16");
            SnsAdNativeLandingPagesUI.this.mo132510S8();
            if (menuItem != null) {
                switch (menuItem.getItemId()) {
                    case 1:
                        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        snsAdNativeLandingPagesUI.getClass();
                        SnsMethodCalculate.markStartTimeMs("doShareToChat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        if (SnsAdNativeLandingPagesUI.m121800F8()) {
                            snsAdNativeLandingPagesUI.mo132525a8(new C95780f3(snsAdNativeLandingPagesUI));
                        } else {
                            snsAdNativeLandingPagesUI.mo132527b8(snsAdNativeLandingPagesUI.f277627x, (String) null);
                        }
                        SnsMethodCalculate.markEndTimeMs("doShareToChat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        SnsMethodCalculate.markEndTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        C115669n.INSTANCE.mo175911u(1929, 1);
                        break;
                    case 2:
                        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        snsAdNativeLandingPagesUI2.getClass();
                        SnsMethodCalculate.markStartTimeMs("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        if (SnsAdNativeLandingPagesUI.m121800F8()) {
                            snsAdNativeLandingPagesUI2.mo132525a8(new C95791g3(snsAdNativeLandingPagesUI2));
                        } else {
                            snsAdNativeLandingPagesUI2.mo132530c8(snsAdNativeLandingPagesUI2.f277627x, (String) null);
                        }
                        SnsMethodCalculate.markEndTimeMs("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        SnsMethodCalculate.markEndTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        C115669n.INSTANCE.mo175911u(1929, 2);
                        break;
                    case 3:
                        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = SnsAdNativeLandingPagesUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        snsAdNativeLandingPagesUI3.getClass();
                        SnsMethodCalculate.markStartTimeMs("doFav", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        snsAdNativeLandingPagesUI3.f277551W.f295493l++;
                        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doFav snsAdNativeLadingPagesUI");
                        long j = snsAdNativeLandingPagesUI3.getIntent().getExtras().getLong("msg_id", -2147483648L);
                        if (!Util.isNullOrNil(snsAdNativeLandingPagesUI3.f277520J)) {
                            SnsInfo snsInfo = AdLandingPagesProxy.getInstance().getSnsInfo(snsAdNativeLandingPagesUI3.f277520J);
                            if (snsInfo == null) {
                                SnsMethodCalculate.markEndTimeMs("doFav", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                                SnsMethodCalculate.markEndTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                                C115669n.INSTANCE.mo175911u(1929, 3);
                                break;
                            } else {
                                str = snsInfo.getLocalid();
                            }
                        } else {
                            str = null;
                        }
                        String nullAsNil = Util.nullAsNil(snsAdNativeLandingPagesUI3.getIntent().getStringExtra("prePublishId"));
                        C95426b0 o8 = snsAdNativeLandingPagesUI3.mo132542o8();
                        String i8 = snsAdNativeLandingPagesUI3.mo132536i8();
                        String g8 = snsAdNativeLandingPagesUI3.mo132535g8(new C95765e2(snsAdNativeLandingPagesUI3.f277627x, (String) null, true, true));
                        if (o8 != null) {
                            AdLandingPagesProxy.getInstance().doFavAdlanding(j, str, snsAdNativeLandingPagesUI3.f277508D, snsAdNativeLandingPagesUI3.f277518I, nullAsNil, o8.f277642a, o8.f277643b, g8, 34, snsAdNativeLandingPagesUI3.mo132544p8(o8.f277644c), i8);
                        } else {
                            AdLandingPagesProxy.getInstance().doFavAdlanding(j, str, snsAdNativeLandingPagesUI3.f277508D, snsAdNativeLandingPagesUI3.f277518I, nullAsNil, snsAdNativeLandingPagesUI3.f277514G, snsAdNativeLandingPagesUI3.f277516H, g8, 34, snsAdNativeLandingPagesUI3.mo132544p8(snsAdNativeLandingPagesUI3.f277512F), i8);
                        }
                        ((C47453t0) C86312j.m106911c(C47453t0.class)).mo72473I2(0, 34, snsAdNativeLandingPagesUI3, snsAdNativeLandingPagesUI3.f277623v2);
                        SnsMethodCalculate.markEndTimeMs("doFav", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        SnsMethodCalculate.markEndTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        C115669n.INSTANCE.mo175911u(1929, 3);
                    case 4:
                        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI4 = SnsAdNativeLandingPagesUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        String str3 = snsAdNativeLandingPagesUI4.f277502B;
                        SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI5 = SnsAdNativeLandingPagesUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        String str4 = snsAdNativeLandingPagesUI5.f277505C;
                        SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        snsAdNativeLandingPagesUI4.mo132502K8(snsAdNativeLandingPagesUI4, str3, str4, 1, 14);
                        C115669n.INSTANCE.mo175911u(1929, 4);
                        break;
                    case 5:
                        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI6 = SnsAdNativeLandingPagesUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        snsAdNativeLandingPagesUI6.getClass();
                        SnsMethodCalculate.markStartTimeMs("doOpenUrlInBrowser", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        FloatWebViewHelper floatWebViewHelper = snsAdNativeLandingPagesUI6.f277511E1;
                        if (floatWebViewHelper != null) {
                            SnsMethodCalculate.markStartTimeMs("getFloatWebViewCompInfo", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
                            C101262e eVar = floatWebViewHelper.f279562d;
                            SnsMethodCalculate.markEndTimeMs("getFloatWebViewCompInfo", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
                            if (eVar != null && !TextUtils.isEmpty(eVar.f296561z)) {
                                String str5 = eVar.f296561z;
                                String k = snsAdNativeLandingPagesUI6.mo132541n8().mo140744k();
                                if (TextUtils.isEmpty(k)) {
                                    k = snsAdNativeLandingPagesUI6.mo132541n8().mo140745l();
                                }
                                if (!TextUtils.isEmpty(k)) {
                                    str5 = C102236a0.m134734b(str5, k);
                                }
                                ((C45513i0) C86312j.m106911c(C45513i0.class)).mo70783f1(snsAdNativeLandingPagesUI6, str5);
                                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doOpenInBrowser, url=" + str5);
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("doOpenUrlInBrowser", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        SnsMethodCalculate.markEndTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        C115669n.INSTANCE.mo175911u(1929, 5);
                        break;
                    case 6:
                        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI7 = SnsAdNativeLandingPagesUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        snsAdNativeLandingPagesUI7.getClass();
                        SnsMethodCalculate.markStartTimeMs("doOpenLBSAuthManagerPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        Intent intent = new Intent();
                        C101271i0 n8 = snsAdNativeLandingPagesUI7.mo132541n8();
                        String h = n8.mo140741h();
                        SnsMethodCalculate.markStartTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                        try {
                            str2 = C102236a0.m134765q0(C102260r.m134863c0(h));
                            SnsMethodCalculate.markEndTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                        } catch (Throwable unused) {
                            SnsMethodCalculate.markEndTimeMs("convertSnsId", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                            str2 = "";
                        }
                        String l = n8.mo140745l();
                        intent.putExtra("sns_landig_pages_from_source", n8.mo140742i());
                        intent.putExtra("sns_landing_pages_rawSnsId", str2);
                        intent.putExtra("sns_landing_pages_ux_info", l);
                        C88144b.m109791i(snsAdNativeLandingPagesUI7, "sns", ".ui.SnsAdLBSAuthManagerUI", intent, (Bundle) null);
                        SnsMethodCalculate.markEndTimeMs("doOpenLBSAuthManagerPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        SnsMethodCalculate.markEndTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        C115669n.INSTANCE.mo175911u(1929, 6);
                        break;
                }
            }
            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$16");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$g */
    public class C95429g implements Runnable {
        public C95429g() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$17");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
            SnsMethodCalculate.markStartTimeMs("access$4902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            snsAdNativeLandingPagesUI.f277503B1 = true;
            SnsMethodCalculate.markEndTimeMs("access$4902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
            SnsMethodCalculate.markStartTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            boolean z = snsAdNativeLandingPagesUI2.f277500A1;
            SnsMethodCalculate.markEndTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (!z) {
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = SnsAdNativeLandingPagesUI.this;
                SnsMethodCalculate.markStartTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                boolean z2 = snsAdNativeLandingPagesUI3.f277633y1;
                SnsMethodCalculate.markEndTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                if (z2) {
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI4 = SnsAdNativeLandingPagesUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$5200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    snsAdNativeLandingPagesUI4.mo132508Q8();
                    SnsMethodCalculate.markEndTimeMs("access$5200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$17");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$h */
    public class C95430h implements ScreenShotUtil.ScreenShotCallback {
        public C95430h() {
        }

        public void onScreenShot(String str, long j) {
            SnsMethodCalculate.markStartTimeMs("onScreenShot", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$18");
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot", "onScreenShot， path = " + str + "， dateAdded = " + j);
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
            SnsMethodCalculate.markStartTimeMs("access$5300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            snsAdNativeLandingPagesUI.getClass();
            SnsMethodCalculate.markStartTimeMs("doScreenShotReport", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            try {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot", "uxInfo = " + snsAdNativeLandingPagesUI.f277533Q + ", canvasId = " + snsAdNativeLandingPagesUI.f277551W.f295499r);
                String a = C98784a.m128574a(String.valueOf(5), snsAdNativeLandingPagesUI.f277533Q, snsAdNativeLandingPagesUI.f277551W.f295499r);
                StringBuilder sb = new StringBuilder();
                sb.append("reportScreenShotParams = ");
                sb.append(a);
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot", sb.toString());
                C115669n.INSTANCE.kvStat(19213, a);
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("doScreenShotReport", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            SnsMethodCalculate.markEndTimeMs("access$5300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            SnsMethodCalculate.markEndTimeMs("onScreenShot", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$18");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$i */
    public class C95431i extends BroadcastReceiver {
        public C95431i() {
        }

        public void onReceive(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
            boolean z = false;
            int intExtra = IntentUtil.getIntExtra(intent, "show", 0);
            if (SnsAdNativeLandingPagesUI.m121801H7(SnsAdNativeLandingPagesUI.this) == null || !(SnsAdNativeLandingPagesUI.m121801H7(SnsAdNativeLandingPagesUI.this).getAdapter() instanceof C112968x)) {
                Log.m105928w("MicroMsg.SnsAdNativeLandingPagesUI", "videoProgressbarStatusChangeReceiver called ,but the viewpager or adapter is null!!");
                SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
                return;
            }
            C112968x xVar = (C112968x) SnsAdNativeLandingPagesUI.m121801H7(SnsAdNativeLandingPagesUI.this).getAdapter();
            int currentItem = SnsAdNativeLandingPagesUI.m121801H7(SnsAdNativeLandingPagesUI.this).getCurrentItem();
            int count = xVar.getCount();
            if (currentItem >= count) {
                Log.m105928w("MicroMsg.SnsAdNativeLandingPagesUI", "videoProgressbarStatusChangeReceiver called ,current index is larger than item count!!!");
                SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
                return;
            }
            Log.m105918d("MicroMsg.SnsAdNativeLandingPagesUI", "recv videoProgressbarStatusChangeReceiver show " + intExtra + "the index is " + currentItem + " the count is " + count);
            ContentFragment contentFragment = (ContentFragment) xVar.getItem(currentItem);
            if (intExtra == 1) {
                z = true;
            }
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            snsAdNativeLandingPagesUI.f277613s1 = z;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            SnsAdNativeLandingPagesUI.this.mo132526a9(500);
            contentFragment.getClass();
            SnsMethodCalculate.markStartTimeMs("videoCompProgressBarStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            contentFragment.f276508t = z;
            if (!contentFragment.mo131804O() || z) {
                contentFragment.mo131815a0();
            } else {
                contentFragment.mo131814Z();
            }
            SnsMethodCalculate.markEndTimeMs("videoCompProgressBarStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$j */
    public class C95432j implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ int f277650d;

        public C95432j(int i) {
            this.f277650d = i;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$20");
            try {
                Rect rect = new Rect();
                SnsAdNativeLandingPagesUI.this.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i9 = rect.top;
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "rect=" + rect.toString() + ", screenH=" + SnsAdNativeLandingPagesUI.m121810Q7(SnsAdNativeLandingPagesUI.this) + ", cutH=" + this.f277650d + ", statusBarH=" + i9 + ", isHalfScreen=" + SnsAdNativeLandingPagesUI.m121811R7(SnsAdNativeLandingPagesUI.this));
                if (i9 > 0) {
                    if (i9 != this.f277650d) {
                        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "cutH != statusBarH, reset height");
                        if (SnsAdNativeLandingPagesUI.m121811R7(SnsAdNativeLandingPagesUI.this)) {
                            View findViewById = SnsAdNativeLandingPagesUI.this.findViewById(C0966R.C0970id.n1d);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                            layoutParams.topMargin = i9;
                            findViewById.setLayoutParams(layoutParams);
                        } else {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) SnsAdNativeLandingPagesUI.m121807N7(SnsAdNativeLandingPagesUI.this).getLayoutParams();
                            layoutParams2.height = SnsAdNativeLandingPagesUI.m121810Q7(SnsAdNativeLandingPagesUI.this) - i9;
                            layoutParams2.topMargin = i9;
                            SnsAdNativeLandingPagesUI.m121807N7(SnsAdNativeLandingPagesUI.this).setLayoutParams(layoutParams2);
                            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$5500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            C54219z<Integer> zVar = snsAdNativeLandingPagesUI.f277553W1;
                            SnsMethodCalculate.markEndTimeMs("access$5500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            zVar.setValue(Integer.valueOf(layoutParams2.height));
                        }
                        int i15 = this.f277650d;
                        StringBuilder sb = new StringBuilder();
                        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        int i16 = snsAdNativeLandingPagesUI2.f277576f1;
                        SnsMethodCalculate.markEndTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        sb.append(i16);
                        sb.append("|");
                        sb.append(SnsAdNativeLandingPagesUI.m121810Q7(SnsAdNativeLandingPagesUI.this));
                        C37817q.m41545a("cut_height_error", "", i15, i9, sb.toString());
                    }
                    SnsAdNativeLandingPagesUI.m121807N7(SnsAdNativeLandingPagesUI.this).removeOnLayoutChangeListener(this);
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "onLayoutChange error:" + th.toString());
                SnsAdNativeLandingPagesUI.m121807N7(SnsAdNativeLandingPagesUI.this).removeOnLayoutChangeListener(this);
            }
            SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$20");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$k */
    public class C95433k implements Runnable {
        public C95433k() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$21");
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "hasCutOut, assistActivity, isHalfScreen=" + SnsAdNativeLandingPagesUI.m121811R7(SnsAdNativeLandingPagesUI.this));
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            new C74779i(snsAdNativeLandingPagesUI, SnsAdNativeLandingPagesUI.m121811R7(SnsAdNativeLandingPagesUI.this) ^ true, SnsAdNativeLandingPagesUI.m121807N7(snsAdNativeLandingPagesUI), SnsAdNativeLandingPagesUI.this.f277626w2);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$21");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$l */
    public class C95434l implements Runnable {
        public C95434l() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "noCutOut, assistActivity, isHalfScreen=" + SnsAdNativeLandingPagesUI.m121811R7(SnsAdNativeLandingPagesUI.this));
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            new C74779i(snsAdNativeLandingPagesUI, false, SnsAdNativeLandingPagesUI.m121807N7(snsAdNativeLandingPagesUI), SnsAdNativeLandingPagesUI.this.f277626w2);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$m */
    public class C95435m implements Runnable {
        public C95435m() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$24");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
            SnsMethodCalculate.markStartTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            snsAdNativeLandingPagesUI.getClass();
            SnsMethodCalculate.markStartTimeMs("doPlayExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (snsAdNativeLandingPagesUI.f277592l1 == null) {
                snsAdNativeLandingPagesUI.f277592l1 = new C99027d(snsAdNativeLandingPagesUI, snsAdNativeLandingPagesUI.f277581h, snsAdNativeLandingPagesUI.f277615t);
                AdLandingPagesProxy.getInstance().playTimelineBackAnimation(0);
                Bundle bundle = new Bundle();
                bundle.putInt("param_thumb_left", snsAdNativeLandingPagesUI.f277596n);
                bundle.putInt("param_thumb_top", snsAdNativeLandingPagesUI.f277587j);
                bundle.putInt("param_thumb_width", snsAdNativeLandingPagesUI.f277599o);
                bundle.putInt("param_thumb_height", snsAdNativeLandingPagesUI.f277602p);
                Drawable drawable = snsAdNativeLandingPagesUI.f277581h.getDrawable();
                bundle.putInt("param_target_width", drawable != null ? drawable.getIntrinsicWidth() : 0);
                bundle.putInt("param_target_height", drawable != null ? drawable.getIntrinsicHeight() : 0);
                snsAdNativeLandingPagesUI.f277592l1.mo138367a(bundle);
            }
            AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = snsAdNativeLandingPagesUI.f277610r1;
            if (adLandingFloatBarCompWrapper != null) {
                adLandingFloatBarCompWrapper.mo131501I();
            }
            C95287y1 l8 = snsAdNativeLandingPagesUI.mo132539l8();
            Bitmap bitmap = null;
            if (l8 != null) {
                SnsMethodCalculate.markStartTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                SnsMethodCalculate.markEndTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                SnsMethodCalculate.markStartTimeMs("doExitAnimForFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                if (l8.f276565u.getVisibility() == 0) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(l8.f276565u, "alpha", new float[]{1.0f, 0.0f});
                    ofFloat.setDuration(250);
                    ofFloat.start();
                }
                l8.mo131834G("com.tencent.mm.adlanding.sphereimage.next_page_view_hide");
                SnsMethodCalculate.markEndTimeMs("doExitAnimForFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                SnsMethodCalculate.markStartTimeMs("getCurFrameBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                try {
                    Bitmap bitmap2 = l8.f276563s.getBitmap();
                    StringBuilder sb = new StringBuilder();
                    sb.append("getCurFrameBitmap, w=");
                    sb.append(bitmap2 == null ? 0 : bitmap2.getWidth());
                    sb.append(", h=");
                    sb.append(bitmap2 == null ? 0 : bitmap2.getHeight());
                    Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", sb.toString());
                    SnsMethodCalculate.markEndTimeMs("getCurFrameBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                    bitmap = bitmap2;
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "getCurFrameBitmap exp:" + th.toString());
                    SnsMethodCalculate.markEndTimeMs("getCurFrameBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                }
            }
            if (bitmap == null && !snsAdNativeLandingPagesUI.f277615t) {
                bitmap = BitmapUtil.getBitmapFromView(snsAdNativeLandingPagesUI.f277570d1);
            }
            if (bitmap != null) {
                snsAdNativeLandingPagesUI.f277581h.setImageBitmap(bitmap);
            }
            C99027d dVar = snsAdNativeLandingPagesUI.f277592l1;
            C95766e3 e3Var = new C95766e3(snsAdNativeLandingPagesUI);
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setSnsAnimaListener", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
            dVar.f290304d = e3Var;
            SnsMethodCalculate.markEndTimeMs("setSnsAnimaListener", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
            snsAdNativeLandingPagesUI.f277592l1.mo138368b(0);
            SnsMethodCalculate.markEndTimeMs("doPlayExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            SnsMethodCalculate.markEndTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$24");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$o */
    public class C95436o implements C75018a.C75024d {
        public C95436o(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        }

        /* renamed from: a */
        public void mo7429a() {
            SnsMethodCalculate.markStartTimeMs("onMessageClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$29");
            try {
                AdLandingPagesProxy.getInstance().favEditTag();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "favorite edittag fail, ex = " + e.getMessage());
            }
            SnsMethodCalculate.markEndTimeMs("onMessageClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$29");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$q */
    public class C95437q implements C74779i.C74781b {
        public C95437q() {
        }

        /* renamed from: a */
        public void mo132562a(boolean z) {
            ViewGroup.LayoutParams layoutParams;
            SnsMethodCalculate.markStartTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$30");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
            SnsMethodCalculate.markStartTimeMs("access$6602", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            snsAdNativeLandingPagesUI.f277616t1 = z;
            SnsMethodCalculate.markEndTimeMs("access$6602", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "onKeyboardStateChanged, visiable=" + z);
            SnsAdNativeLandingPagesUI.this.mo132524Z8();
            if (SnsAdNativeLandingPagesUI.m121811R7(SnsAdNativeLandingPagesUI.this) && z) {
                if (SnsAdNativeLandingPagesUI.m121812S7(SnsAdNativeLandingPagesUI.this) != null) {
                    C94696a S7 = SnsAdNativeLandingPagesUI.m121812S7(SnsAdNativeLandingPagesUI.this);
                    S7.getClass();
                    SnsMethodCalculate.markStartTimeMs("slideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
                    S7.f274074b.mo130331e();
                    SnsMethodCalculate.markEndTimeMs("slideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
                } else {
                    Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "AdHalfScreenLandingPageHelper==null");
                }
            }
            if (SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this) != null && SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this).mo131506O()) {
                AdLandingFloatBarCompWrapper O7 = SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this);
                O7.getClass();
                SnsMethodCalculate.markStartTimeMs("isFinishing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                boolean z2 = O7.f275789F;
                SnsMethodCalculate.markEndTimeMs("isFinishing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                if (!z2) {
                    if (z && SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this).mo131508Q()) {
                        AdLandingFloatBarCompWrapper O72 = SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this);
                        O72.getClass();
                        SnsMethodCalculate.markStartTimeMs("hideAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                        try {
                            O72.mo131505N();
                            O72.mo124361D();
                        } catch (Throwable th) {
                            Log.m105920e("AdLandingFloatBarCompWrapper", th.toString());
                        }
                        SnsMethodCalculate.markEndTimeMs("hideAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                    } else if (!z) {
                        if (!SnsAdNativeLandingPagesUI.this.mo132495C8()) {
                            SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this).mo131511V();
                        } else if (SnsAdNativeLandingPagesUI.m121812S7(SnsAdNativeLandingPagesUI.this) != null && SnsAdNativeLandingPagesUI.m121812S7(SnsAdNativeLandingPagesUI.this).mo130351b()) {
                            SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this).mo131511V();
                        }
                    }
                }
            }
            if (SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this) != null) {
                AdLandingFloatBarCompWrapper O73 = SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this);
                O73.getClass();
                SnsMethodCalculate.markStartTimeMs("isForJs134", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                boolean z3 = O73.f275791H && !O73.f275788E;
                SnsMethodCalculate.markEndTimeMs("isForJs134", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                if (z3) {
                    AdLandingFloatBarCompWrapper O74 = SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this);
                    O74.getClass();
                    SnsMethodCalculate.markStartTimeMs("isFinishing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                    boolean z4 = O74.f275789F;
                    SnsMethodCalculate.markEndTimeMs("isFinishing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                    if (!z4) {
                        if (z && SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this).mo131508Q()) {
                            AdLandingFloatBarCompWrapper O75 = SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this);
                            O75.getClass();
                            SnsMethodCalculate.markStartTimeMs("hideAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                            try {
                                O75.mo131505N();
                                O75.mo124361D();
                            } catch (Throwable th4) {
                                Log.m105920e("AdLandingFloatBarCompWrapper", th4.toString());
                            }
                            SnsMethodCalculate.markEndTimeMs("hideAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                        } else if (!z) {
                            if (!SnsAdNativeLandingPagesUI.this.mo132495C8()) {
                                SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this).mo131511V();
                            } else if (SnsAdNativeLandingPagesUI.m121812S7(SnsAdNativeLandingPagesUI.this) != null && SnsAdNativeLandingPagesUI.m121812S7(SnsAdNativeLandingPagesUI.this).mo130351b()) {
                                SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this).mo131511V();
                            }
                        }
                    }
                }
            }
            if (!(SnsAdNativeLandingPagesUI.m121807N7(SnsAdNativeLandingPagesUI.this) == null || (layoutParams = SnsAdNativeLandingPagesUI.m121807N7(SnsAdNativeLandingPagesUI.this).getLayoutParams()) == null)) {
                int i = layoutParams.height;
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
                SnsMethodCalculate.markStartTimeMs("access$5500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                C54219z<Integer> zVar = snsAdNativeLandingPagesUI2.f277553W1;
                SnsMethodCalculate.markEndTimeMs("access$5500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                zVar.setValue(Integer.valueOf(i));
            }
            SnsMethodCalculate.markEndTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$30");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$r */
    public class C95438r implements Runnable {
        public C95438r() {
        }

        public void run() {
            C95251e eVar;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$31");
            if (SnsAdNativeLandingPagesUI.this.keyboardState() != 1) {
                SnsAdNativeLandingPagesUI.this.mo132510S8();
            }
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
            SnsMethodCalculate.markStartTimeMs("access$6700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            boolean z = snsAdNativeLandingPagesUI.f277597n1;
            SnsMethodCalculate.markEndTimeMs("access$6700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (!z) {
                new ArrayList();
                C102495c cVar = (C102495c) SnsAdNativeLandingPagesUI.m121801H7(SnsAdNativeLandingPagesUI.this).getAdapter();
                cVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
                List<Fragment> list2 = cVar.f301794i;
                SnsMethodCalculate.markEndTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
                Iterator<Fragment> it = list2.iterator();
                while (it.hasNext()) {
                    ContentFragment contentFragment = (ContentFragment) it.next();
                    SnsAdNativeLandingPagesUI.this.keyboardState();
                    contentFragment.getClass();
                    SnsMethodCalculate.markStartTimeMs("onKeyboardStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    if (contentFragment.f276499h && (eVar = contentFragment.f276497f) != null) {
                        eVar.mo131786e();
                    }
                    SnsMethodCalculate.markEndTimeMs("onKeyboardStatusChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$31");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$t */
    public class C95439t implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public final /* synthetic */ boolean f277657a;

        public C95439t(boolean z) {
            this.f277657a = z;
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$33");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$33");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$33");
            SnsAdNativeLandingPagesUI.this.mo132523Y8(false);
            if (this.f277657a) {
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
                SnsMethodCalculate.markStartTimeMs("access$6800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                C95074c0 c0Var = snsAdNativeLandingPagesUI.f277634y2;
                SnsMethodCalculate.markEndTimeMs("access$6800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                if (c0Var != null) {
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$6800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    C95074c0 c0Var2 = snsAdNativeLandingPagesUI2.f277634y2;
                    SnsMethodCalculate.markEndTimeMs("access$6800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    c0Var2.mo131584a();
                }
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = SnsAdNativeLandingPagesUI.this;
                SnsMethodCalculate.markStartTimeMs("access$6900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                C89779i0 i0Var = snsAdNativeLandingPagesUI3.f277637z2;
                SnsMethodCalculate.markEndTimeMs("access$6900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                if (i0Var != null) {
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI4 = SnsAdNativeLandingPagesUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$6900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    C89779i0 i0Var2 = snsAdNativeLandingPagesUI4.f277637z2;
                    SnsMethodCalculate.markEndTimeMs("access$6900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    i0Var2.dismiss();
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI5 = SnsAdNativeLandingPagesUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$6902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    snsAdNativeLandingPagesUI5.f277637z2 = null;
                    SnsMethodCalculate.markEndTimeMs("access$6902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$33");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$u */
    public class C95440u implements C95074c0.C95078d {

        /* renamed from: a */
        public final /* synthetic */ View f277659a;

        public C95440u(View view) {
            this.f277659a = view;
        }

        /* renamed from: a */
        public final void mo132564a() {
            SnsMethodCalculate.markStartTimeMs("onRemove", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$34");
            View view = this.f277659a;
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) this.f277659a.getParent()).removeView(this.f277659a);
            }
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
            SnsMethodCalculate.markStartTimeMs("access$6802", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            snsAdNativeLandingPagesUI.f277634y2 = null;
            SnsMethodCalculate.markEndTimeMs("access$6802", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            SnsMethodCalculate.markEndTimeMs("onRemove", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$34");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$x */
    public class C95441x implements ContentFragment.C95272f {
        public C95441x() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$y */
    public class C95442y extends ViewPager.C39631j {
        public C95442y() {
        }

        public void onPageScrollStateChanged(int i) {
            SnsMethodCalculate.markStartTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
            ContentFragment m8 = SnsAdNativeLandingPagesUI.this.mo132540m8();
            m8.getClass();
            SnsMethodCalculate.markStartTimeMs("setViewPagerScrollState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            m8.f276511w = i;
            SnsMethodCalculate.markEndTimeMs("setViewPagerScrollState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            int i2 = 0;
            if (i == 1) {
                while (i2 < SnsAdNativeLandingPagesUI.this.f277569d.size()) {
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    Map<Integer, ContentFragment> map = snsAdNativeLandingPagesUI.f277617t2;
                    SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    Fragment fragment = (Fragment) ((HashMap) map).get(Integer.valueOf(SnsAdNativeLandingPagesUI.this.f277569d.get(i2).f295432g));
                    if (fragment != null) {
                        ((ContentFragment) fragment).mo131815a0();
                    }
                    i2++;
                }
                C95198o2.m121132d(SnsAdNativeLandingPagesUI.this.getContext());
            } else if (i == 0) {
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                Map<Integer, ContentFragment> map2 = snsAdNativeLandingPagesUI2.f277617t2;
                SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = SnsAdNativeLandingPagesUI.this;
                Fragment fragment2 = (Fragment) ((HashMap) map2).get(Integer.valueOf(snsAdNativeLandingPagesUI3.f277569d.get(SnsAdNativeLandingPagesUI.m121801H7(snsAdNativeLandingPagesUI3).getCurrentItem()).f295432g));
                if (fragment2 != null) {
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI4 = SnsAdNativeLandingPagesUI.this;
                    ContentFragment contentFragment = (ContentFragment) fragment2;
                    SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    snsAdNativeLandingPagesUI4.getClass();
                    SnsMethodCalculate.markStartTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    SnsMethodCalculate.markStartTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = snsAdNativeLandingPagesUI4.f277610r1;
                    if (adLandingFloatBarCompWrapper != null) {
                        i2 = adLandingFloatBarCompWrapper.mo131508Q();
                        SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    } else {
                        SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    }
                    if (i2 == 0) {
                        contentFragment.mo131814Z();
                    }
                    SnsMethodCalculate.markEndTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
        }

        public void onPageScrolled(int i, float f, int i2) {
            C95251e eVar;
            SnsMethodCalculate.markStartTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
            if (SnsAdNativeLandingPagesUI.this.mo132540m8() != null) {
                ContentFragment m8 = SnsAdNativeLandingPagesUI.this.mo132540m8();
                m8.getClass();
                SnsMethodCalculate.markStartTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (m8.f276499h && (eVar = m8.f276497f) != null) {
                    eVar.mo131786e();
                }
                SnsMethodCalculate.markEndTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            }
            if (SnsAdNativeLandingPagesUI.this.keyboardState() == 1) {
                SnsAdNativeLandingPagesUI.this.hideVKB();
            }
            SnsMethodCalculate.markEndTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
        }

        public void onPageSelected(int i) {
            boolean z;
            SnsMethodCalculate.markStartTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
            SnsAdNativeLandingPagesUI.this.hideVKB();
            for (int i2 = 0; i2 < SnsAdNativeLandingPagesUI.this.f277569d.size(); i2++) {
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                Map<Integer, ContentFragment> map = snsAdNativeLandingPagesUI.f277617t2;
                SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                Fragment fragment = (Fragment) ((HashMap) map).get(Integer.valueOf(SnsAdNativeLandingPagesUI.this.f277569d.get(i2).f295432g));
                if (fragment != null) {
                    if (i2 == i) {
                        ContentFragment contentFragment = (ContentFragment) fragment;
                        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        snsAdNativeLandingPagesUI2.getClass();
                        SnsMethodCalculate.markStartTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        SnsMethodCalculate.markStartTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = snsAdNativeLandingPagesUI2.f277610r1;
                        if (adLandingFloatBarCompWrapper != null) {
                            z = adLandingFloatBarCompWrapper.mo131508Q();
                            SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        } else {
                            SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            z = false;
                        }
                        if (!z) {
                            contentFragment.mo131814Z();
                        }
                        SnsMethodCalculate.markEndTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    } else {
                        ((ContentFragment) fragment).mo131815a0();
                    }
                }
            }
            SnsAdNativeLandingPagesUI.this.mo132524Z8();
            SnsMethodCalculate.markEndTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$z */
    public class C95443z implements AdLandingPagesProxy.C94830p {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$z$a */
        public class C95444a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Object f277664d;

            /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$z$a$a */
            public class C95445a implements Runnable {
                public C95445a() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5$1$1");
                    SnsAdNativeLandingPagesUI.this.mo132500I8();
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5$1$1");
                }
            }

            public C95444a(Object obj) {
                this.f277664d = obj;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5$1");
                String L7 = SnsAdNativeLandingPagesUI.m121805L7(SnsAdNativeLandingPagesUI.this);
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
                SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                String str = snsAdNativeLandingPagesUI.f277631y;
                SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                String str2 = (String) this.f277664d;
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
                SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                String str3 = snsAdNativeLandingPagesUI2.f277603p0;
                SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = SnsAdNativeLandingPagesUI.this;
                SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                String str4 = snsAdNativeLandingPagesUI3.f277628x0;
                SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                SnsMethodCalculate.markStartTimeMs("getADLandingPageInfosStrByDynamicDataUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                String str5 = new String(L7);
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    Log.m105924i("AdLandingPagesParseHelper", "the jsonObject is " + jSONObject.toString());
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (next != null && (next instanceof String)) {
                            String str6 = next;
                            String string = jSONObject.getString(str6);
                            if (!Util.isNullOrNil(string)) {
                                str5 = str5.replace("{{" + str6 + "}}", "<![CDATA[" + string + "]]>");
                            }
                        }
                    }
                } catch (Exception unused) {
                    Log.m105920e("AdLandingPagesParseHelper", "the json is parsed error : " + L7);
                }
                SnsMethodCalculate.markEndTimeMs("getADLandingPageInfosStrByDynamicDataUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI4 = SnsAdNativeLandingPagesUI.this;
                SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                String str7 = snsAdNativeLandingPagesUI4.f277631y;
                SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                C100894u.C100895a aVar = new C100894u.C100895a(str5, str7, SnsAdNativeLandingPagesUI.this);
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI5 = SnsAdNativeLandingPagesUI.this;
                snsAdNativeLandingPagesUI5.f277569d = aVar.f295461a;
                snsAdNativeLandingPagesUI5.f277572e = aVar.f295462b;
                MMHandlerThread.postToMainThread(new C95445a());
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5$1");
            }
        }

        public C95443z() {
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
            SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            MMHandler mMHandler = snsAdNativeLandingPagesUI.f277563a1;
            SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            mMHandler.removeCallbacksAndMessages((Object) null);
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            MMHandler mMHandler2 = snsAdNativeLandingPagesUI2.f277563a1;
            SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            mMHandler2.post(new C95444a(obj));
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5");
        }
    }

    public SnsAdNativeLandingPagesUI() {
        C40008f fVar = C40008f.f107254d;
        this.f277601o2 = new IListener<OpenSnsAdFloatPageEvent>(fVar) {
            {
                this.__eventId = 509324304;
            }

            public boolean callback(IEvent iEvent) {
                String str;
                String str2;
                char c;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
                OpenSnsAdFloatPageEvent openSnsAdFloatPageEvent = (OpenSnsAdFloatPageEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
                ContentFragment m8 = SnsAdNativeLandingPagesUI.this.mo132540m8();
                m8.getClass();
                SnsMethodCalculate.markStartTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                C100882l lVar = m8.f276482B;
                SnsMethodCalculate.markEndTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (lVar.f295430e != null) {
                    ContentFragment m84 = SnsAdNativeLandingPagesUI.this.mo132540m8();
                    m84.getClass();
                    SnsMethodCalculate.markStartTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    C100882l lVar2 = m84.f276482B;
                    SnsMethodCalculate.markEndTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    if (lVar2.f295430e.containsKey(openSnsAdFloatPageEvent.f264978d.f264979a)) {
                        if (!((HashMap) SnsAdNativeLandingPagesUI.m121806M7(SnsAdNativeLandingPagesUI.this)).containsKey(openSnsAdFloatPageEvent.f264978d.f264979a)) {
                            SnsAdNativeLandingPagesUI.this.mo132540m8().onPause();
                            Bundle bundle = new Bundle();
                            bundle.putString("sns_landing_pages_xml", SnsAdNativeLandingPagesUI.m121805L7(SnsAdNativeLandingPagesUI.this));
                            bundle.putString("sns_float_component_id", openSnsAdFloatPageEvent.f264978d.f264979a);
                            ContentFragment m85 = SnsAdNativeLandingPagesUI.this.mo132540m8();
                            m85.getClass();
                            SnsMethodCalculate.markStartTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                            C100882l lVar3 = m85.f276482B;
                            SnsMethodCalculate.markEndTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                            bundle.putInt("sns_landing_page_index", lVar3.f295432g);
                            bundle.putString("sns_landing_page_snsId", SnsAdNativeLandingPagesUI.this.f277520J);
                            bundle.putString("sns_landing_pages_rawSnsId", SnsAdNativeLandingPagesUI.this.f277522K);
                            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            String str3 = snsAdNativeLandingPagesUI.f277533Q;
                            SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putString("sns_landing_pages_ux_info", str3);
                            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            String str4 = snsAdNativeLandingPagesUI2.f277603p0;
                            SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putString("sns_landing_pages_aid", str4);
                            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = SnsAdNativeLandingPagesUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            int i = snsAdNativeLandingPagesUI3.f277537R0;
                            SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putInt("sns_landing_pages_biz_id", i);
                            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI4 = SnsAdNativeLandingPagesUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            String str5 = snsAdNativeLandingPagesUI4.f277628x0;
                            SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putString("sns_landing_pages_traceid", str5);
                            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI5 = SnsAdNativeLandingPagesUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            int i2 = snsAdNativeLandingPagesUI5.f277508D;
                            SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putInt("sns_landig_pages_from_source", i2);
                            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI6 = SnsAdNativeLandingPagesUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            String str6 = snsAdNativeLandingPagesUI6.f277631y;
                            SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putString("sns_landing_pages_xml_prefix", str6);
                            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI7 = SnsAdNativeLandingPagesUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            boolean z = snsAdNativeLandingPagesUI7.f277524L;
                            SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putBoolean("sns_landing_is_native_sight_ad", z);
                            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI8 = SnsAdNativeLandingPagesUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            String str7 = snsAdNativeLandingPagesUI8.f277545U;
                            SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putString("sns_landing_pages_canvas_ext", str7);
                            SnsAdLandingPageFloatView snsAdLandingPageFloatView = new SnsAdLandingPageFloatView(SnsAdNativeLandingPagesUI.this);
                            SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            str2 = "callback";
                            SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            String string = bundle.getString("sns_landing_pages_xml");
                            snsAdLandingPageFloatView.f281472d = bundle.getString("sns_float_component_id");
                            int i3 = bundle.getInt("sns_landing_page_index", -1);
                            String string2 = bundle.getString("sns_landing_pages_ux_info");
                            String string3 = bundle.getString("sns_landing_pages_aid");
                            String string4 = bundle.getString("sns_landing_pages_traceid");
                            snsAdLandingPageFloatView.f281473e = bundle.getString("sns_landing_pages_canvas_ext");
                            str = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6";
                            if (Util.isNullOrNil(string, snsAdLandingPageFloatView.f281472d) || i3 == -1) {
                                Log.m105920e("MicroMsg.SnsAdLandingPageFloatView", "invalid landing float page data!");
                                SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            } else {
                                LinkedList<C100882l> linkedList = new C100894u.C100895a(string, Util.nullAs(bundle.getString("sns_landing_pages_xml_prefix"), C102646h.COL_ADXML)).f295461a;
                                if (linkedList == null || linkedList.size() <= i3) {
                                    c = 0;
                                } else {
                                    C100882l lVar4 = linkedList.get(i3);
                                    C100882l lVar5 = new C100882l();
                                    snsAdLandingPageFloatView.f281475g = lVar5;
                                    lVar5.f295427b = lVar4.f295427b;
                                    C101255a0 a0Var = (C101255a0) ((LinkedHashMap) lVar4.f295430e).get(snsAdLandingPageFloatView.f281472d);
                                    if (C100894u.m132236p(a0Var.f296505k)) {
                                        C101298y yVar = (C101298y) a0Var;
                                        snsAdLandingPageFloatView.f281474f = yVar;
                                        snsAdLandingPageFloatView.f281475g.f295429d.add(yVar);
                                        snsAdLandingPageFloatView.f281475g.f295430e.putAll(lVar4.f295430e);
                                    }
                                    C100882l lVar6 = snsAdLandingPageFloatView.f281475g;
                                    c = 0;
                                    lVar6.f295432g = 0;
                                    lVar6.f295431f = true;
                                }
                                Object[] objArr = new Object[4];
                                objArr[c] = string3;
                                objArr[1] = string4;
                                objArr[2] = string2;
                                objArr[3] = snsAdLandingPageFloatView.f281473e;
                                Log.m105925i("MicroMsg.SnsAdLandingPageFloatView", "[reportInfo] aid %s,traceId %s,uxInfo %s,adCanvasExtXml %s", objArr);
                                snsAdLandingPageFloatView.mo134021f();
                                SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            }
                            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            snsAdLandingPageFloatView.setBackgroundColor(SnsAdNativeLandingPagesUI.this.getResources().getColor(C0966R.color.f356978ac3));
                            SnsAdNativeLandingPagesUI.m121807N7(SnsAdNativeLandingPagesUI.this).addView(snsAdLandingPageFloatView, new FrameLayout.LayoutParams(-1, -1));
                            SnsMethodCalculate.markStartTimeMs("playEnterAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            if (!snsAdLandingPageFloatView.f281479n) {
                                snsAdLandingPageFloatView.f281482q.start();
                                snsAdLandingPageFloatView.f281479n = true;
                            }
                            SnsMethodCalculate.markEndTimeMs("playEnterAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            SnsAdNativeLandingPagesUI.this.mo132540m8().mo131815a0();
                            if (SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this) != null && !SnsAdNativeLandingPagesUI.m121808O7(SnsAdNativeLandingPagesUI.this).mo131506O()) {
                                SnsAdNativeLandingPagesUI.this.mo132547s8(false, 0);
                            }
                            ((HashMap) SnsAdNativeLandingPagesUI.m121806M7(SnsAdNativeLandingPagesUI.this)).put(openSnsAdFloatPageEvent.f264978d.f264979a, snsAdLandingPageFloatView);
                            String str8 = str2;
                            String str9 = str;
                            SnsMethodCalculate.markEndTimeMs(str8, str9);
                            SnsMethodCalculate.markEndTimeMs(str8, str9);
                            return false;
                        }
                    }
                }
                str2 = "callback";
                str = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6";
                String str82 = str2;
                String str92 = str;
                SnsMethodCalculate.markEndTimeMs(str82, str92);
                SnsMethodCalculate.markEndTimeMs(str82, str92);
                return false;
            }
        };
        this.f277605p2 = new IListener<SnsAdFloatPageLifecycleEvent>(fVar) {
            {
                this.__eventId = 1959790896;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
                SnsAdFloatPageLifecycleEvent.C92567a aVar = ((SnsAdFloatPageLifecycleEvent) iEvent).f265115d;
                String str = aVar.f265116a;
                if (aVar.f265117b == 123 && !Util.isNullOrNil(str) && ((HashMap) SnsAdNativeLandingPagesUI.m121806M7(SnsAdNativeLandingPagesUI.this)).containsKey(str)) {
                    SnsAdNativeLandingPagesUI.m121807N7(SnsAdNativeLandingPagesUI.this).removeView((View) ((HashMap) SnsAdNativeLandingPagesUI.m121806M7(SnsAdNativeLandingPagesUI.this)).get(str));
                    SnsAdNativeLandingPagesUI.this.onResume();
                    SnsAdNativeLandingPagesUI.this.mo132540m8().onResume();
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
                return false;
            }
        };
        this.f277608q2 = new C95429g();
        this.f277611r2 = new C95430h();
        this.f277614s2 = false;
        this.f277617t2 = new HashMap();
        this.f277620u2 = false;
        this.f277623v2 = new C95436o(this);
        this.f277626w2 = new C95437q();
        this.f277630x2 = new C43075s();
        this.f277634y2 = null;
        this.f277637z2 = null;
        this.f277504B2 = new C43076v();
        this.f277507C2 = new C43077w();
    }

    /* renamed from: A8 */
    public static boolean m121799A8(int i) {
        SnsMethodCalculate.markStartTimeMs("isFromTimeLine", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = true;
        if (!(i == 1 || i == 2 || i == 16)) {
            z = false;
        }
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "isFromTimeLine, source=" + i + ", ret=" + z);
        SnsMethodCalculate.markEndTimeMs("isFromTimeLine", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z;
    }

    /* renamed from: F8 */
    public static boolean m121800F8() {
        int i;
        SnsMethodCalculate.markStartTimeMs("isReqDynamicCanvasXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = false;
        try {
            i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_native_landing_page_share_do_request_page, 0);
            try {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "isReqDynamicCanvasXml value is " + i);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            i = 0;
        }
        if (i > 0) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isReqDynamicCanvasXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z;
    }

    /* renamed from: H7 */
    public static /* synthetic */ AdlandingDummyViewPager m121801H7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        AdlandingDummyViewPager adlandingDummyViewPager = snsAdNativeLandingPagesUI.f277552W0;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return adlandingDummyViewPager;
    }

    /* renamed from: I7 */
    public static /* synthetic */ View m121802I7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        View view = snsAdNativeLandingPagesUI.f277570d1;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return view;
    }

    /* renamed from: J7 */
    public static /* synthetic */ boolean m121803J7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = snsAdNativeLandingPagesUI.f277615t;
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z;
    }

    /* renamed from: K7 */
    public static /* synthetic */ ImageView m121804K7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        ImageView imageView = snsAdNativeLandingPagesUI.f277581h;
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return imageView;
    }

    /* renamed from: L7 */
    public static /* synthetic */ String m121805L7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        String str = snsAdNativeLandingPagesUI.f277627x;
        SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return str;
    }

    /* renamed from: M7 */
    public static /* synthetic */ Map m121806M7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Map<String, SnsAdLandingPageFloatView> map = snsAdNativeLandingPagesUI.f277604p1;
        SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return map;
    }

    /* renamed from: N7 */
    public static /* synthetic */ FrameLayout m121807N7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        FrameLayout frameLayout = snsAdNativeLandingPagesUI.f277565b1;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return frameLayout;
    }

    /* renamed from: O7 */
    public static /* synthetic */ AdLandingFloatBarCompWrapper m121808O7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = snsAdNativeLandingPagesUI.f277610r1;
        SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return adLandingFloatBarCompWrapper;
    }

    /* renamed from: P7 */
    public static /* synthetic */ int m121809P7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        int i = snsAdNativeLandingPagesUI.f277558Y0;
        SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return i;
    }

    /* renamed from: Q7 */
    public static /* synthetic */ int m121810Q7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        int i = snsAdNativeLandingPagesUI.f277579g1;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return i;
    }

    /* renamed from: R7 */
    public static /* synthetic */ boolean m121811R7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = snsAdNativeLandingPagesUI.f277618u;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z;
    }

    /* renamed from: S7 */
    public static /* synthetic */ C94696a m121812S7(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C94696a aVar = snsAdNativeLandingPagesUI.f277624w;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return aVar;
    }

    /* renamed from: Z7 */
    public static void m121813Z7(String str, String str2, String str3, int i) {
        SnsMethodCalculate.markStartTimeMs("doExposureReport", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewid", str);
            jSONObject.put("commInfo", str2);
            jSONObject.put("uxinfo", str3);
            jSONObject.put("exposureType", i);
            C102260r.m134858a("rewarded_canvas_exposure", jSONObject.toString());
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "doCanvasExposureReport exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doExposureReport", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: z8 */
    public static boolean m121814z8(int i) {
        SnsMethodCalculate.markStartTimeMs("isFromShare", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = i == 3 || i == 5 || i == 4;
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "isFromShare, source=" + i + ", ret=" + z);
        SnsMethodCalculate.markEndTimeMs("isFromShare", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z;
    }

    /* renamed from: B8 */
    public boolean mo132494B8() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("isHalfEggCardCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        AdLandingPageEggCardHelper adLandingPageEggCardHelper = this.f277519I1;
        if (adLandingPageEggCardHelper != null) {
            adLandingPageEggCardHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("isHalfEggCardCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            boolean z2 = adLandingPageEggCardHelper.f274088E;
            SnsMethodCalculate.markEndTimeMs("isHalfEggCardCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (z2) {
                z = true;
                SnsMethodCalculate.markEndTimeMs("isHalfEggCardCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return z;
            }
        }
        z = false;
        SnsMethodCalculate.markEndTimeMs("isHalfEggCardCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z;
    }

    /* renamed from: C8 */
    public boolean mo132495C8() {
        SnsMethodCalculate.markStartTimeMs("isHalfModeFloatLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C95243v0 v0Var = this.f277544T1;
        boolean z = false;
        if (v0Var != null) {
            SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            C101676k kVar = v0Var.f276410t;
            SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            if (kVar != null) {
                C95243v0 v0Var2 = this.f277544T1;
                v0Var2.getClass();
                SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                C101676k kVar2 = v0Var2.f276410t;
                SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                if (kVar2.f296504j == 2) {
                    z = true;
                }
                SnsMethodCalculate.markEndTimeMs("isHalfModeFloatLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return z;
            }
        }
        AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = this.f277610r1;
        if (adLandingFloatBarCompWrapper != null) {
            boolean P = adLandingFloatBarCompWrapper.mo131507P();
            SnsMethodCalculate.markEndTimeMs("isHalfModeFloatLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return P;
        }
        SnsMethodCalculate.markEndTimeMs("isHalfModeFloatLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return false;
    }

    /* renamed from: D8 */
    public boolean mo132496D8() {
        SnsMethodCalculate.markStartTimeMs("isKeyboardShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = this.f277616t1;
        SnsMethodCalculate.markEndTimeMs("isKeyboardShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z;
    }

    /* renamed from: E8 */
    public boolean mo132497E8() {
        SnsMethodCalculate.markStartTimeMs("isNeedAlphaBackground", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Intent intent = getIntent();
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("sns_landing_pages_is_from_jspi", false);
            int intExtra = intent.getIntExtra("sns_landig_pages_from_source", 0);
            boolean z = intExtra == 24;
            boolean booleanExtra2 = intent.getBooleanExtra("sns_landing_pages_need_alpha_bkg", false);
            boolean booleanExtra3 = intent.getBooleanExtra("sns_landing_page_open_from_half_screen_mode", false);
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "isNeedAlphaBackground, isFromJsapi=" + booleanExtra + ", openSource=" + intExtra + ", isFromLivingRoom=" + z + ", isNeedAlphaAnim=" + booleanExtra2 + ", isOpenFromHalfScreenMode=" + booleanExtra3);
            if ((booleanExtra || z || booleanExtra3) && !booleanExtra2) {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "isNeedAlphaBackground, false");
                SnsMethodCalculate.markEndTimeMs("isNeedAlphaBackground", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return false;
            }
        }
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "isNeedAlphaBackground, true");
        SnsMethodCalculate.markEndTimeMs("isNeedAlphaBackground", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return true;
    }

    /* renamed from: G8 */
    public void mo132498G8() {
        SnsMethodCalculate.markStartTimeMs("jumpNextPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            boolean q8 = mo132545q8();
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "jumpNextPage, hasNextPage=" + q8);
            if (q8) {
                AdlandingDummyViewPager adlandingDummyViewPager = this.f277552W0;
                adlandingDummyViewPager.mo151910B(adlandingDummyViewPager.getCurrentItem() + 1, true);
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "jumpNextPage exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("jumpNextPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: H8 */
    public final void mo132499H8() {
        SnsMethodCalculate.markStartTimeMs("loadFirstPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        mo132515U8();
        C102495c cVar = (C102495c) this.f277552W0.getAdapter();
        if (cVar == null) {
            cVar = new C102495c(getSupportFragmentManager(), new ArrayList());
            this.f277552W0.setAdapter(cVar);
        }
        ArrayList arrayList = (ArrayList) mo132538k8();
        if (arrayList.size() > 0) {
            C100882l lVar = (C100882l) arrayList.get(0);
            boolean z = true;
            Log.m105925i("MicroMsg.SnsAdNativeLandingPagesUI", "loadFirstPage load id %s", Integer.valueOf(lVar.f295432g));
            ContentFragment contentFragment = (ContentFragment) ((HashMap) this.f277617t2).get(Integer.valueOf(lVar.f295432g));
            if (contentFragment == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("pageInfo", lVar);
                hashMap.put("pageCount", Integer.valueOf(arrayList.size()));
                hashMap.put("viewPager", this.f277552W0);
                hashMap.put("pageDownIconInfo", this.f277555X0);
                Boolean bool = Boolean.TRUE;
                hashMap.put("is_first_show_page", bool);
                if (arrayList.size() == 1) {
                    hashMap.put("is_last_shown_page", bool);
                }
                hashMap.put("needEnterAnimation", Boolean.valueOf(this.f277612s));
                SnsMethodCalculate.markStartTimeMs("canShowDownArrow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                if ((this.f277558Y0 & 8) != 0) {
                    z = false;
                }
                SnsMethodCalculate.markEndTimeMs("canShowDownArrow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                hashMap.put("needDirectionAnimation", Boolean.valueOf(z));
                hashMap.put("groupListCompShowIndex", Integer.valueOf(this.f277632y0));
                ContentFragment contentFragment2 = new ContentFragment();
                SnsMethodCalculate.markStartTimeMs("putParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                contentFragment2.f276485E = hashMap;
                SnsMethodCalculate.markEndTimeMs("putParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                ContentFragment.C95272f fVar = this.f277593l2;
                SnsMethodCalculate.markStartTimeMs("setLifecycleLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                contentFragment2.f276481A = fVar;
                SnsMethodCalculate.markEndTimeMs("setLifecycleLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                ((HashMap) this.f277617t2).put(Integer.valueOf(lVar.f295432g), contentFragment2);
                contentFragment = contentFragment2;
            } else {
                SnsMethodCalculate.markStartTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (contentFragment.f276482B != lVar) {
                    contentFragment.f276482B = lVar;
                    contentFragment.mo131805P(lVar);
                    contentFragment.mo131811V();
                }
                SnsMethodCalculate.markEndTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            }
            cVar.mo142113b(contentFragment, 0);
            cVar.notifyDataSetChanged();
            this.f277552W0.setOffscreenPageLimit(arrayList.size());
        }
        SnsMethodCalculate.markEndTimeMs("loadFirstPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: I8 */
    public void mo132500I8() {
        SnsMethodCalculate.markStartTimeMs("loadLandingPages", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        mo132515U8();
        C102495c cVar = (C102495c) this.f277552W0.getAdapter();
        if (cVar == null) {
            cVar = new C102495c(getSupportFragmentManager(), new ArrayList());
            this.f277552W0.setAdapter(cVar);
        }
        List<C100882l> k8 = mo132538k8();
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) k8;
            if (i < arrayList.size()) {
                C100882l lVar = this.f277569d.get(i);
                boolean z = true;
                Log.m105925i("MicroMsg.SnsAdNativeLandingPagesUI", "loadLandingPages load id %s", Integer.valueOf(lVar.f295432g));
                ContentFragment contentFragment = (ContentFragment) ((HashMap) this.f277617t2).get(Integer.valueOf(lVar.f295432g));
                if (contentFragment == null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("pageInfo", lVar);
                    hashMap.put("pageCount", Integer.valueOf(arrayList.size()));
                    hashMap.put("viewPager", this.f277552W0);
                    hashMap.put("pageDownIconInfo", this.f277555X0);
                    hashMap.put("is_first_show_page", Boolean.valueOf(i == 0));
                    hashMap.put("is_last_shown_page", Boolean.valueOf(i == arrayList.size() - 1));
                    hashMap.put("needEnterAnimation", Boolean.valueOf(this.f277612s));
                    SnsMethodCalculate.markStartTimeMs("canShowDownArrow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    if ((this.f277558Y0 & 8) != 0) {
                        z = false;
                    }
                    SnsMethodCalculate.markEndTimeMs("canShowDownArrow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    hashMap.put("needDirectionAnimation", Boolean.valueOf(z));
                    hashMap.put("groupListCompShowIndex", Integer.valueOf(i == 0 ? this.f277632y0 : 0));
                    ContentFragment contentFragment2 = new ContentFragment();
                    SnsMethodCalculate.markStartTimeMs("putParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    contentFragment2.f276485E = hashMap;
                    SnsMethodCalculate.markEndTimeMs("putParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    if (i == 0) {
                        ContentFragment.C95272f fVar = this.f277593l2;
                        SnsMethodCalculate.markStartTimeMs("setLifecycleLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                        contentFragment2.f276481A = fVar;
                        SnsMethodCalculate.markEndTimeMs("setLifecycleLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    }
                    ((HashMap) this.f277617t2).put(Integer.valueOf(lVar.f295432g), contentFragment2);
                    contentFragment = contentFragment2;
                } else {
                    SnsMethodCalculate.markStartTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    if (contentFragment.f276482B != lVar) {
                        contentFragment.f276482B = lVar;
                        contentFragment.mo131805P(lVar);
                        contentFragment.mo131811V();
                    }
                    SnsMethodCalculate.markEndTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                }
                cVar.mo142113b(contentFragment, i);
                i++;
            } else {
                cVar.notifyDataSetChanged();
                this.f277552W0.setOffscreenPageLimit(arrayList.size());
                SnsMethodCalculate.markEndTimeMs("loadLandingPages", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return;
            }
        }
    }

    /* renamed from: J8 */
    public void mo132501J8() {
        SnsMethodCalculate.markStartTimeMs("onMoreBtnClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (this.f277578g.getVisibility() != 0) {
            SnsMethodCalculate.markEndTimeMs("onMoreBtnClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        mo132548t8();
        mo132504M8();
        C77407n nVar = new C77407n((Context) this, 1, false);
        this.f277513F1 = nVar;
        nVar.f225771i = new C95427e();
        nVar.f225779n1 = true;
        nVar.f225782p = new C95428f();
        hideVKB();
        this.f277513F1.mo107573q();
        SnsMethodCalculate.markEndTimeMs("onMoreBtnClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: K8 */
    public void mo132502K8(Context context, String str, String str2, int i, int i2) {
        String str3 = "";
        SnsMethodCalculate.markStartTimeMs("openUxCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Intent intent = new Intent();
        intent.putExtra("sns_landig_pages_from_source", i2);
        int i3 = this.f277510E;
        if (i3 == 0) {
            i3 = this.f277508D;
        }
        intent.putExtra("sns_landig_pages_origin_from_source", i3);
        intent.putExtra("sns_landing_pages_canvasid", str);
        intent.putExtra("sns_landing_pages_canvas_ext", str2);
        intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
        intent.putExtra("sns_landing_pages_no_store", i);
        Activity activity = (Activity) context;
        String stringExtra = activity.getIntent().getStringExtra("sns_landing_pages_sessionId");
        String stringExtra2 = activity.getIntent().getStringExtra("sns_landing_pages_ad_buffer");
        if (!Util.isNullOrNil(stringExtra)) {
            String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sessionId", valueOf);
                jSONObject.put("cid", str3);
                if (!Util.isNullOrNil(stringExtra2)) {
                    str3 = stringExtra2;
                }
                jSONObject.put("adBuffer", str3);
                jSONObject.put("preSessionId", stringExtra);
            } catch (Exception unused) {
            }
            intent.putExtra("sns_landing_pages_search_extra", jSONObject.toString());
            intent.putExtra("sns_landing_pages_sessionId", valueOf);
            intent.putExtra("sns_landing_pages_ad_buffer", stringExtra2);
        }
        C88144b.m109791i(context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, (Bundle) null);
        SnsMethodCalculate.markEndTimeMs("openUxCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: L8 */
    public void mo132503L8() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("pageLoaded", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        this.f277547U1.setValue(2);
        LinkedList<C100882l> linkedList = this.f277569d;
        if (linkedList == null) {
            SnsMethodCalculate.markEndTimeMs("pageLoaded", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        Iterator<C100882l> it = linkedList.iterator();
        while (it.hasNext()) {
            ContentFragment contentFragment = (ContentFragment) ((HashMap) this.f277617t2).get(Integer.valueOf(it.next().f295432g));
            if (contentFragment != null) {
                SnsMethodCalculate.markStartTimeMs("setMainPageLoaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                SnsMethodCalculate.markStartTimeMs("toggleFloatBarView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                SnsAdNativeLandingPagesUI U = contentFragment.mo131810U();
                if (U != null) {
                    U.mo132526a9(0);
                }
                SnsMethodCalculate.markEndTimeMs("toggleFloatBarView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                SnsMethodCalculate.markEndTimeMs("setMainPageLoaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            }
        }
        ContentFragment contentFragment2 = (ContentFragment) ((HashMap) this.f277617t2).get(Integer.valueOf(this.f277569d.getFirst().f295432g));
        SnsMethodCalculate.markStartTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        SnsMethodCalculate.markStartTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = this.f277610r1;
        if (adLandingFloatBarCompWrapper != null) {
            z = adLandingFloatBarCompWrapper.mo131508Q();
            SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        } else {
            z = false;
            SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        if (!z) {
            contentFragment2.mo131814Z();
        }
        SnsMethodCalculate.markEndTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        SnsMethodCalculate.markEndTimeMs("pageLoaded", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: M8 */
    public final void mo132504M8() {
        SnsMethodCalculate.markStartTimeMs("refreshAuthStatus", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("sns_ad_landing_page_key");
        if (mmkv != null) {
            this.f277562Z1 = mmkv.getBoolean("canAutoFillData", false);
            this.f277564a2 = mmkv.getBoolean("canRequestLBS", false);
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "mmkv read canAutoFillData = " + this.f277562Z1 + " canRequestLBS =" + this.f277564a2);
        }
        SnsMethodCalculate.markEndTimeMs("refreshAuthStatus", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010d  */
    /* renamed from: N8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo132505N8() {
        /*
            r9 = this;
            java.lang.String r0 = "refreshView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r9.f277537R0
            java.lang.String r3 = "canShowMaskBg"
            r4 = 0
            r5 = 1
            r6 = 2
            if (r2 != r6) goto L_0x0034
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            int r2 = r9.f277561Z0
            if (r2 != 0) goto L_0x001a
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            if (r2 != 0) goto L_0x0034
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager r2 = r9.f277552W0
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r7 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r9)
            r2.setMargins(r4, r4, r4, r7)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager r7 = r9.f277552W0
            r7.setLayoutParams(r2)
        L_0x0034:
            r2 = 2131101467(0x7f06071b, float:1.7815345E38)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            int r7 = r9.f277561Z0
            if (r7 != 0) goto L_0x0040
            r7 = 1
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            r3 = 2131101466(0x7f06071a, float:1.7815342E38)
            if (r7 != 0) goto L_0x0081
            android.content.res.Resources r2 = r9.getResources()
            int r2 = r2.getColor(r3)
            java.util.LinkedList<ps2.l> r7 = r9.f277569d
            if (r7 == 0) goto L_0x0079
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x0079
            java.util.LinkedList<ps2.l> r7 = r9.f277569d
            java.lang.Object r7 = r7.getFirst()
            ps2.l r7 = (ps2.C100882l) r7
            java.lang.String r7 = r7.f295427b
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0079
            java.util.LinkedList<ps2.l> r2 = r9.f277569d
            java.lang.Object r2 = r2.getFirst()
            ps2.l r2 = (ps2.C100882l) r2
            java.lang.String r2 = r2.f295427b
            int r2 = android.graphics.Color.parseColor(r2)
        L_0x0079:
            android.view.View r7 = r9.f277567c1
            r7.setBackgroundColor(r2)
            r2 = 2131101466(0x7f06071a, float:1.7815342E38)
        L_0x0081:
            android.widget.ImageView r3 = r9.f277575f
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            if (r3 == 0) goto L_0x0095
            int r7 = p385u2.C111105a.m151500b(r9, r2)
            r3.setTint(r7)
            android.widget.ImageView r7 = r9.f277575f
            r7.setImageDrawable(r3)
        L_0x0095:
            android.widget.ImageView r3 = r9.f277578g
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            if (r3 == 0) goto L_0x00a9
            int r2 = p385u2.C111105a.m151500b(r9, r2)
            r3.setTint(r2)
            android.widget.ImageView r2 = r9.f277578g
            r2.setImageDrawable(r3)
        L_0x00a9:
            boolean r2 = r9.mo132512T7()
            r3 = 8
            if (r2 == 0) goto L_0x00d8
            boolean r2 = r9.mo132514U7()
            if (r2 != 0) goto L_0x00d8
            int r2 = r9.f277537R0
            if (r2 != r6) goto L_0x00d8
            android.widget.ImageView r2 = r9.f277578g
            r2.setVisibility(r3)
            android.widget.TextView r2 = r9.f277584i
            r2.setVisibility(r4)
            android.widget.TextView r2 = r9.f277584i
            java.lang.String r3 = r9.f277499A
            r2.setText(r3)
            android.widget.TextView r2 = r9.f277584i
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$c r3 = new com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$c
            r3.<init>()
            r2.setOnClickListener(r3)
            goto L_0x0183
        L_0x00d8:
            java.lang.String r2 = "canShowMenuBtn"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            int r7 = r9.f277558Y0
            if (r7 == 0) goto L_0x0112
            r8 = r7 & 4
            if (r8 == 0) goto L_0x00ff
            r7 = r7 & r6
            if (r7 == 0) goto L_0x00ff
            boolean r7 = r9.mo132514U7()
            if (r7 == 0) goto L_0x00f2
            int r7 = r9.f277537R0
            if (r7 == r6) goto L_0x00ff
        L_0x00f2:
            int r6 = r9.f277558Y0
            r7 = r6 & 1
            if (r7 == 0) goto L_0x00ff
            r6 = r6 & 32
            if (r6 != 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r6 = 0
            goto L_0x0100
        L_0x00ff:
            r6 = 1
        L_0x0100:
            if (r6 != 0) goto L_0x010d
            boolean r6 = r9.f277564a2
            if (r6 != 0) goto L_0x010d
            boolean r6 = r9.f277562Z1
            if (r6 == 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r6 = 0
            goto L_0x010e
        L_0x010d:
            r6 = 1
        L_0x010e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x0116
        L_0x0112:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            r6 = 1
        L_0x0116:
            java.lang.String r2 = "MicroMsg.SnsAdNativeLandingPagesUI"
            if (r6 == 0) goto L_0x013b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "canShowMenuBtn=true, disableShareBitSet="
            r3.append(r4)
            int r4 = r9.f277558Y0
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            android.widget.ImageView r2 = r9.f277578g
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$d r3 = new com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$d
            r3.<init>()
            r2.setOnClickListener(r3)
            goto L_0x0183
        L_0x013b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "canShowMenuBtn=false, disableShareBitSet="
            r6.append(r7)
            int r7 = r9.f277558Y0
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            android.widget.ImageView r6 = r9.f277578g
            r6.setVisibility(r3)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b0 r6 = r9.f277550V1     // Catch:{ Exception -> 0x0178 }
            if (r6 == 0) goto L_0x0183
            r6 = 2131313874(0x7f0944d2, float:1.8246157E38)
            android.view.View r6 = r9.findViewById(r6)     // Catch:{ Exception -> 0x0178 }
            android.widget.ImageView r6 = (android.widget.ImageView) r6     // Catch:{ Exception -> 0x0178 }
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()     // Catch:{ Exception -> 0x0178 }
            boolean r7 = r6 instanceof android.widget.FrameLayout.LayoutParams     // Catch:{ Exception -> 0x0178 }
            if (r7 == 0) goto L_0x0183
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6     // Catch:{ Exception -> 0x0178 }
            androidx.appcompat.app.AppCompatActivity r7 = r9.getContext()     // Catch:{ Exception -> 0x0178 }
            int r3 = kg3.C76577a.m92151b(r7, r3)     // Catch:{ Exception -> 0x0178 }
            r6.rightMargin = r3     // Catch:{ Exception -> 0x0178 }
            goto L_0x0183
        L_0x0178:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r3
            java.lang.String r3 = "refreshView voiceBtn error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r5)
        L_0x0183:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.mo132505N8():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x04a2  */
    /* renamed from: O8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo132506O8() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "report"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.List r0 = r19.mo132537j8()
            java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView> r4 = r1.f277604p1
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x001a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0031
            java.lang.Object r5 = r4.next()
            com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView r5 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdLandingPageFloatView) r5
            java.util.List r5 = r5.getAllComp()
            r6 = r0
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.addAll(r5)
            goto L_0x001a
        L_0x0031:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper r4 = r1.f277610r1
            if (r4 == 0) goto L_0x0096
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r4)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper r4 = r1.f277610r1
            r4.getClass()
            java.lang.String r6 = "getBtnComponent"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h0 r4 = r4.f275785B
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            if (r4 == 0) goto L_0x0096
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper r6 = r1.f277610r1
            r6.getClass()
            java.lang.String r8 = "adJustBtnClickCount"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h0 r9 = r6.f275785B
            if (r9 == 0) goto L_0x0090
            int r10 = r9.mo131614H()
            int r11 = r6.f275787D
            int r10 = r10 - r11
            r9.mo131615I(r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "btn kv, clickCount="
            r9.append(r10)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h0 r10 = r6.f275785B
            int r10 = r10.mo131614H()
            r9.append(r10)
            java.lang.String r10 = ", stayTime="
            r9.append(r10)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h0 r6 = r6.f275785B
            long r10 = r6.mo131555o()
            r9.append(r10)
            java.lang.String r6 = r9.toString()
            java.lang.String r9 = "AdLandingFloatBarCompWrapper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
        L_0x0090:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            r5.add(r4)
        L_0x0096:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 r4 = r1.f277544T1
            if (r4 == 0) goto L_0x00b4
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r4)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 r4 = r1.f277544T1
            r4.getClass()
            java.lang.String r6 = "getBtnCompList"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            java.util.List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h0> r4 = r4.f276403A
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r5.addAll(r4)
        L_0x00b4:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b0 r4 = r1.f277550V1
            if (r4 == 0) goto L_0x00be
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r4)
        L_0x00be:
            xo2.a r4 = r1.f277607q1
            if (r4 == 0) goto L_0x00e1
            java.lang.String r5 = "getAllComponents"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.util.List r4 = r4.mo142509a()     // Catch:{ all -> 0x00d1 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            goto L_0x00d5
        L_0x00d1:
            r4 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L_0x00d5:
            boolean r5 = rq2.C101425k.m133100d(r4)
            if (r5 == 0) goto L_0x00e1
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.addAll(r4)
        L_0x00e1:
            long r4 = r1.f277528N
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r1.f277526M
            long r6 = r6 - r8
            long r4 = r4 + r6
            r1.f277528N = r4
            ps2.z r6 = r1.f277551W
            int r5 = (int) r4
            r6.f295490i = r5
            r4 = r0
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r0 = r4.size()
            r6.f295489h = r0
            java.lang.String r0 = r1.f277536R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r5 = "MicroMsg.SnsAdNativeLandingPagesUI"
            if (r0 != 0) goto L_0x0110
            java.lang.String r0 = "13387 report, use updatedUxInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            ps2.z r0 = r1.f277551W
            java.lang.String r6 = r1.f277536R
            r0.f295483b = r6
        L_0x0110:
            ps2.z r0 = r1.f277551W
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "adAntiAbuseState="
            r6.append(r7)
            boolean r7 = r1.f277571d2
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.mo140368a(r6)
            ps2.z r0 = r1.f277551W
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "pageId="
            r6.append(r7)
            java.lang.String r7 = r1.f277538R1
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.mo140368a(r6)
            ps2.z r0 = r1.f277551W
            r0.getClass()
            java.lang.String r6 = "genComponentStatStr"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesReportInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            java.util.Iterator r8 = r4.iterator()
        L_0x0151:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x017f
            java.lang.Object r9 = r8.next()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r9 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z) r9
            qs2.a0 r10 = r9.mo131850h()
            boolean r10 = r10.f296512r
            if (r10 == 0) goto L_0x0166
            goto L_0x0151
        L_0x0166:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            org.json.JSONArray r11 = r0.f295501t
            boolean r11 = r9.mo124366u(r11)
            if (r11 != 0) goto L_0x0151
            boolean r9 = r9.mo118822v(r10)
            if (r9 == 0) goto L_0x0151
            org.json.JSONArray r9 = r0.f295501t
            r9.put(r10)
            goto L_0x0151
        L_0x017f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            ps2.z r8 = r1.f277551W
            r8.getClass()
            java.lang.String r9 = "getComponentStatData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r7)
            org.json.JSONArray r8 = r8.f295501t
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r7)
            r9 = 0
            r0[r9] = r8
            java.lang.String r8 = "landingPage report json %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r0)
            ps2.z r8 = r1.f277551W
            r8.getClass()
            java.lang.String r10 = ""
            java.lang.String r11 = "genStatString"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r7)
            org.json.JSONArray r0 = r8.f295501t
            java.lang.String r0 = r0.toString()
            r8.f295494m = r0
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r9] = r0
            java.lang.String r13 = "MicroMsg.AdLandingPagesReportInfo"
            java.lang.String r0 = "componentsStatStr:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r0, r12)
            java.lang.String r0 = r8.f295494m
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01e9
            java.lang.String r0 = r8.f295494m     // Catch:{ UnsupportedEncodingException -> 0x01cf }
            java.lang.String r12 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r12)     // Catch:{ UnsupportedEncodingException -> 0x01cf }
            r8.f295494m = r0     // Catch:{ UnsupportedEncodingException -> 0x01cf }
            goto L_0x01e9
        L_0x01cf:
            r0 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "not support encode "
            r12.append(r14)
            java.lang.String r0 = r0.toString()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
        L_0x01e9:
            r12 = 0
            java.lang.String r0 = r8.f295482a     // Catch:{ Exception -> 0x01f2 }
            long r12 = vr2.C102236a0.m134706B0(r0)     // Catch:{ Exception -> 0x01f2 }
            goto L_0x01fc
        L_0x01f2:
            r0 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r6]
            r14[r9] = r0
            java.lang.String r0 = "AdLandingPagesReportInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r10, r14)
        L_0x01fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = vr2.C102236a0.m134765q0(r12)
            r0.append(r12)
            java.lang.String r12 = ","
            r0.append(r12)
            java.lang.String r13 = r8.f295483b
            r0.append(r13)
            r0.append(r12)
            int r13 = r8.f295484c
            r0.append(r13)
            r0.append(r12)
            int r13 = r8.f295485d
            r0.append(r13)
            r0.append(r12)
            int r13 = r8.f295486e
            r0.append(r13)
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            int r13 = r8.f295487f
            r0.append(r13)
            r0.append(r12)
            int r13 = r8.f295488g
            r0.append(r13)
            r0.append(r12)
            int r13 = r8.f295489h
            r0.append(r13)
            r0.append(r12)
            int r13 = r8.f295490i
            r0.append(r13)
            r0.append(r12)
            int r13 = r8.f295491j
            r0.append(r13)
            r0.append(r12)
            int r13 = r8.f295492k
            r0.append(r13)
            r0.append(r12)
            int r13 = r8.f295493l
            r0.append(r13)
            r0.append(r12)
            java.lang.String r13 = r8.f295494m
            r0.append(r13)
            r0.append(r12)
            long r13 = r8.f295500s
            r0.append(r13)
            r0.append(r12)
            java.lang.String r13 = r8.f295495n
            r0.append(r13)
            r0.append(r12)
            java.lang.String r13 = r8.f295496o
            if (r13 != 0) goto L_0x028e
            goto L_0x028f
        L_0x028e:
            r10 = r13
        L_0x028f:
            r0.append(r10)
            r0.append(r12)
            java.lang.String r10 = r8.f295497p
            r0.append(r10)
            r0.append(r12)
            int r10 = r8.f295498q
            r0.append(r10)
            r0.append(r12)
            java.lang.String r8 = r8.f295499r
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r7)
            int r7 = r1.f277537R0
            r8 = 2
            if (r7 != r8) goto L_0x02d5
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r7 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            r10 = 15041(0x3ac1, float:2.1077E-41)
            r7.doCgiReportCanvasBrowseInfo(r10, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "post cgi stat 15041 data: "
            r7.append(r10)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x031c
        L_0x02d5:
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r7 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            ps2.z r10 = r1.f277551W
            java.lang.String r10 = r10.f295482a
            boolean r7 = r7.isRecExpAd(r10)
            if (r7 == 0) goto L_0x0300
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 14650(0x393a, float:2.0529E-41)
            r7.kvStat(r10, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "post kv stat 14650 data: "
            r7.append(r10)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x031c
        L_0x0300:
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 13387(0x344b, float:1.8759E-41)
            r7.kvStat(r10, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "post kv stat 13387 data: "
            r7.append(r10)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x031c:
            wo2.d$b r0 = r1.f277532P1
            r0.getClass()
            java.lang.String r5 = "build"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r7)
            long r10 = r0.f301737c
            long r12 = r0.f301736b
            long r10 = r10 - r12
            long r14 = r0.f301741g
            long r14 = r14 - r12
            long r8 = r0.f301742h
            long r8 = r8 - r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "onCreateTime="
            r12.append(r13)
            r12.append(r10)
            java.lang.String r10 = "|viewCreate="
            r12.append(r10)
            r12.append(r14)
            java.lang.String r10 = "|firstFrame="
            r12.append(r10)
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r0.f301745k = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r0.f301745k
            r8.append(r9)
            java.lang.String r9 = "|snsId="
            r8.append(r9)
            java.lang.String r9 = r0.f301743i
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r0.f301745k = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r0.f301745k
            r8.append(r9)
            java.lang.String r9 = "|startActCount="
            r8.append(r9)
            int r9 = wo2.C102466d.f301721a
            java.lang.String r9 = "access$200"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            int r11 = wo2.C102466d.f301721a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r0.f301745k = r8
            java.lang.String r8 = "access$300"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r10)
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = wo2.C102466d.f301722b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
            java.lang.String r11 = r0.f301743i
            boolean r9 = r9.containsKey(r11)
            if (r9 == 0) goto L_0x03c4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r10)
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = wo2.C102466d.f301722b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
            java.lang.String r8 = r0.f301743i
            java.lang.Object r8 = r9.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L_0x03c4
            int r8 = r8.intValue()
            goto L_0x03c5
        L_0x03c4:
            r8 = 0
        L_0x03c5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r0.f301745k
            r9.append(r11)
            java.lang.String r11 = "|startSnsIdCount="
            r9.append(r11)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r0.f301745k = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
            long r8 = r0.f301736b
            long r11 = r0.f301735a
            long r8 = r8 - r11
            int r9 = (int) r8
            long r11 = r0.f301740f
            long r13 = r0.f301739e
            long r11 = r11 - r13
            int r8 = (int) r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "reportTime, ipcConnTime="
            r11.append(r12)
            r11.append(r8)
            java.lang.String r12 = "|processTime="
            r11.append(r12)
            r11.append(r9)
            java.lang.String r12 = "|"
            r11.append(r12)
            java.lang.String r12 = r0.f301745k
            r11.append(r12)
            java.lang.String r12 = ", clickStart="
            r11.append(r12)
            long r12 = r0.f301735a
            r11.append(r12)
            java.lang.String r12 = ", source="
            r11.append(r12)
            int r13 = r0.f301744j
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.String r13 = "AdLandingPageStaticHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r11)
            int r11 = r0.f301744j
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r14 = r0.f301745k
            java.lang.String r15 = "landing_page_cost"
            vr2.C37817q.m41545a(r15, r11, r9, r8, r14)
            boolean r8 = r0.f301746l
            int r0 = r0.f301744j
            java.lang.String r9 = "report13387Idkey"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r7)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "report13387Idkey, isRestart="
            r11.append(r14)
            r11.append(r8)
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r11)
            r11 = 1673(0x689, double:8.266E-321)
            r13 = 23
            wo2.C102466d.m135251a(r11, r13)
            r13 = 29
            if (r8 == 0) goto L_0x0479
            r14 = 26
            wo2.C102466d.m135251a(r11, r14)
            if (r0 != r13) goto L_0x0479
            r14 = 28
            wo2.C102466d.m135251a(r11, r14)
        L_0x0479:
            if (r0 != r13) goto L_0x0482
            r11 = 1667(0x683, double:8.236E-321)
            r13 = 12
            wo2.C102466d.m135251a(r11, r13)
        L_0x0482:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
            wo2.d$a r7 = new wo2.d$a
            r7.<init>()
            java.lang.String r0 = r1.f277533Q
            java.lang.String r8 = "AdLandingPageStaticHelper.ComponentStaticBuilder"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r9)
            int r11 = r4.size()
            if (r11 != 0) goto L_0x04a2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r9)
            r1 = r2
            goto L_0x06c5
        L_0x04a2:
            int r11 = r4.size()
            r7.f301727e = r11
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x06a5 }
            r11 = 0
            r12 = 0
        L_0x04ae:
            boolean r13 = r4.hasNext()     // Catch:{ all -> 0x06a5 }
            if (r13 == 0) goto L_0x0678
            java.lang.Object r13 = r4.next()     // Catch:{ all -> 0x06a5 }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r13 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z) r13     // Catch:{ all -> 0x06a5 }
            if (r13 != 0) goto L_0x04c0
            r17 = r2
            goto L_0x05fa
        L_0x04c0:
            java.lang.String r14 = "getComponentType"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)     // Catch:{ all -> 0x06a5 }
            qs2.a0 r6 = r13.f276580e     // Catch:{ all -> 0x06a5 }
            if (r6 == 0) goto L_0x04d1
            int r6 = r6.f296496b     // Catch:{ all -> 0x06a5 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)     // Catch:{ all -> 0x06a5 }
            goto L_0x04d5
        L_0x04d1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)     // Catch:{ all -> 0x06a5 }
            r6 = 0
        L_0x04d5:
            r14 = -1
            qs2.a0 r15 = r13.mo131850h()     // Catch:{ all -> 0x06a5 }
            if (r15 == 0) goto L_0x04ee
            qs2.a0 r14 = r13.mo131850h()     // Catch:{ all -> 0x06a5 }
            int r14 = r14.f296518x     // Catch:{ all -> 0x06a5 }
            qs2.a0 r13 = r13.mo131850h()     // Catch:{ all -> 0x06a5 }
            int r13 = r13.f296519y     // Catch:{ all -> 0x06a5 }
            r18 = r14
            r14 = r13
            r13 = r18
            goto L_0x04ef
        L_0x04ee:
            r13 = 0
        L_0x04ef:
            if (r14 != 0) goto L_0x04f9
            int r15 = r7.f301733k     // Catch:{ all -> 0x06a5 }
            r16 = 1
            int r15 = r15 + 1
            r7.f301733k = r15     // Catch:{ all -> 0x06a5 }
        L_0x04f9:
            boolean r15 = ps2.C100894u.m132237q(r6)     // Catch:{ all -> 0x06a5 }
            if (r15 != 0) goto L_0x050f
            int r15 = r7.f301728f     // Catch:{ all -> 0x06a5 }
            r16 = 1
            int r15 = r15 + 1
            r7.f301728f = r15     // Catch:{ all -> 0x06a5 }
            if (r14 != 0) goto L_0x050f
            int r15 = r7.f301734l     // Catch:{ all -> 0x06a5 }
            int r15 = r15 + 1
            r7.f301734l = r15     // Catch:{ all -> 0x06a5 }
        L_0x050f:
            r15 = 41
            r17 = r2
            if (r6 == r15) goto L_0x05fd
            r15 = 44
            if (r6 == r15) goto L_0x05fd
            r15 = 45
            if (r6 != r15) goto L_0x051f
            goto L_0x05fd
        L_0x051f:
            r15 = 61
            r1 = 3145728(0x300000, float:4.408104E-39)
            r2 = 5242880(0x500000, float:7.34684E-39)
            if (r6 != r15) goto L_0x0599
            int r6 = r7.f301724b     // Catch:{ all -> 0x06a3 }
            r15 = 1
            int r6 = r6 + r15
            r7.f301724b = r6     // Catch:{ all -> 0x06a3 }
            if (r14 != 0) goto L_0x0534
            int r6 = r7.f301730h     // Catch:{ all -> 0x06a3 }
            int r6 = r6 + r15
            r7.f301730h = r6     // Catch:{ all -> 0x06a3 }
        L_0x0534:
            if (r13 <= 0) goto L_0x058a
            int r6 = wo2.C102466d.f301721a     // Catch:{ all -> 0x06a3 }
            java.lang.String r6 = "access$500"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r10)     // Catch:{ all -> 0x06a3 }
            java.lang.String r14 = "getSightVideoFileSizeRange"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r13 >= r15) goto L_0x054c
            r1 = 8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x057f
        L_0x054c:
            r15 = 2097152(0x200000, float:2.938736E-39)
            if (r13 >= r15) goto L_0x0556
            r1 = 9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x057f
        L_0x0556:
            if (r13 >= r1) goto L_0x055e
            r1 = 10
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x057f
        L_0x055e:
            r1 = 4194304(0x400000, float:5.877472E-39)
            if (r13 >= r1) goto L_0x0568
            r1 = 11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x057f
        L_0x0568:
            if (r13 >= r2) goto L_0x0570
            r1 = 12
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x057f
        L_0x0570:
            r1 = 10485760(0xa00000, float:1.469368E-38)
            if (r13 >= r1) goto L_0x057a
            r1 = 13
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x057f
        L_0x057a:
            r1 = 14
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
        L_0x057f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r10)     // Catch:{ all -> 0x06a3 }
            long r1 = (long) r1     // Catch:{ all -> 0x06a3 }
            r13 = 1675(0x68b, double:8.276E-321)
            wo2.C102466d.m135251a(r13, r1)     // Catch:{ all -> 0x06a3 }
            goto L_0x05fa
        L_0x058a:
            r1 = 20
            r12 = 1675(0x68b, double:8.276E-321)
            wo2.C102466d.m135251a(r12, r1)     // Catch:{ all -> 0x06a3 }
            r1 = r19
            r2 = r17
            r6 = 1
            r12 = 1
            goto L_0x04ae
        L_0x0599:
            r15 = 62
            if (r6 != r15) goto L_0x05e9
            int r6 = r7.f301725c     // Catch:{ all -> 0x06a3 }
            r15 = 1
            int r6 = r6 + r15
            r7.f301725c = r6     // Catch:{ all -> 0x06a3 }
            if (r14 != 0) goto L_0x05aa
            int r6 = r7.f301731i     // Catch:{ all -> 0x06a3 }
            int r6 = r6 + r15
            r7.f301731i = r6     // Catch:{ all -> 0x06a3 }
        L_0x05aa:
            if (r13 <= 0) goto L_0x05e1
            int r6 = wo2.C102466d.f301721a     // Catch:{ all -> 0x06a3 }
            java.lang.String r6 = "access$600"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r10)     // Catch:{ all -> 0x06a3 }
            java.lang.String r14 = "getStreamVideoFileSizeRange"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
            if (r13 >= r1) goto L_0x05c0
            r1 = 15
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x05d7
        L_0x05c0:
            if (r13 >= r2) goto L_0x05c8
            r1 = 16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x05d7
        L_0x05c8:
            r1 = 10485760(0xa00000, float:1.469368E-38)
            if (r13 >= r1) goto L_0x05d2
            r1 = 17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x05d7
        L_0x05d2:
            r1 = 18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)     // Catch:{ all -> 0x06a3 }
        L_0x05d7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r10)     // Catch:{ all -> 0x06a3 }
            long r1 = (long) r1     // Catch:{ all -> 0x06a3 }
            r13 = 1675(0x68b, double:8.276E-321)
            wo2.C102466d.m135251a(r13, r1)     // Catch:{ all -> 0x06a3 }
            goto L_0x05fa
        L_0x05e1:
            r1 = 21
            r13 = 1675(0x68b, double:8.276E-321)
            wo2.C102466d.m135251a(r13, r1)     // Catch:{ all -> 0x06a3 }
            goto L_0x05fa
        L_0x05e9:
            r1 = 142(0x8e, float:1.99E-43)
            if (r6 != r1) goto L_0x05fa
            int r1 = r7.f301726d     // Catch:{ all -> 0x06a3 }
            r2 = 1
            int r1 = r1 + r2
            r7.f301726d = r1     // Catch:{ all -> 0x06a3 }
            if (r14 != 0) goto L_0x05fa
            int r1 = r7.f301732j     // Catch:{ all -> 0x06a3 }
            int r1 = r1 + r2
            r7.f301732j = r1     // Catch:{ all -> 0x06a3 }
        L_0x05fa:
            r16 = 1
            goto L_0x0662
        L_0x05fd:
            int r1 = r7.f301723a     // Catch:{ all -> 0x06a3 }
            r16 = 1
            int r1 = r1 + 1
            r7.f301723a = r1     // Catch:{ all -> 0x06a3 }
            if (r14 != 0) goto L_0x060d
            int r1 = r7.f301729g     // Catch:{ all -> 0x06a3 }
            int r1 = r1 + 1
            r7.f301729g = r1     // Catch:{ all -> 0x06a3 }
        L_0x060d:
            if (r13 <= 0) goto L_0x0669
            int r1 = wo2.C102466d.f301721a     // Catch:{ all -> 0x06a3 }
            java.lang.String r1 = "access$400"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r10)     // Catch:{ all -> 0x06a3 }
            java.lang.String r2 = "getImageFileSizeRange"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)     // Catch:{ all -> 0x06a3 }
            r6 = 20480(0x5000, float:2.8699E-41)
            if (r13 >= r6) goto L_0x0624
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)     // Catch:{ all -> 0x06a3 }
            r6 = 1
            goto L_0x0659
        L_0x0624:
            r6 = 51200(0xc800, float:7.1746E-41)
            if (r13 >= r6) goto L_0x062e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)     // Catch:{ all -> 0x06a3 }
            r6 = 2
            goto L_0x0659
        L_0x062e:
            r6 = 102400(0x19000, float:1.43493E-40)
            if (r13 >= r6) goto L_0x0638
            r6 = 3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x0659
        L_0x0638:
            r6 = 204800(0x32000, float:2.86986E-40)
            if (r13 >= r6) goto L_0x0642
            r6 = 4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x0659
        L_0x0642:
            r6 = 512000(0x7d000, float:7.17465E-40)
            if (r13 >= r6) goto L_0x064c
            r6 = 5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x0659
        L_0x064c:
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r13 >= r6) goto L_0x0655
            r6 = 6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)     // Catch:{ all -> 0x06a3 }
            goto L_0x0659
        L_0x0655:
            r6 = 7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)     // Catch:{ all -> 0x06a3 }
        L_0x0659:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r10)     // Catch:{ all -> 0x06a3 }
            long r1 = (long) r6     // Catch:{ all -> 0x06a3 }
            r13 = 1675(0x68b, double:8.276E-321)
            wo2.C102466d.m135251a(r13, r1)     // Catch:{ all -> 0x06a3 }
        L_0x0662:
            r1 = r19
            r2 = r17
            r6 = 1
            goto L_0x04ae
        L_0x0669:
            r1 = 19
            r13 = 1675(0x68b, double:8.276E-321)
            wo2.C102466d.m135251a(r13, r1)     // Catch:{ all -> 0x06a3 }
            r1 = r19
            r2 = r17
            r6 = 1
            r11 = 1
            goto L_0x04ae
        L_0x0678:
            r17 = r2
            if (r11 != 0) goto L_0x067e
            if (r12 == 0) goto L_0x06c0
        L_0x067e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06a3 }
            r1.<init>()     // Catch:{ all -> 0x06a3 }
            java.lang.String r2 = "imgNoFileSize="
            r1.append(r2)     // Catch:{ all -> 0x06a3 }
            r1.append(r11)     // Catch:{ all -> 0x06a3 }
            java.lang.String r2 = ", sightNoFileSize="
            r1.append(r2)     // Catch:{ all -> 0x06a3 }
            r1.append(r12)     // Catch:{ all -> 0x06a3 }
            java.lang.String r2 = ", uxInfo="
            r1.append(r2)     // Catch:{ all -> 0x06a3 }
            r1.append(r0)     // Catch:{ all -> 0x06a3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06a3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)     // Catch:{ all -> 0x06a3 }
            goto L_0x06c0
        L_0x06a3:
            r0 = move-exception
            goto L_0x06a8
        L_0x06a5:
            r0 = move-exception
            r17 = r2
        L_0x06a8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "build exp="
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x06c0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r9)
            r1 = r17
        L_0x06c5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r9)
            zt3.t r0 = zt3.C119157j.f356862d
            wo2.c r2 = new wo2.c
            r2.<init>(r7)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.mo132506O8():void");
    }

    /* renamed from: P8 */
    public final void mo132507P8() {
        SnsMethodCalculate.markStartTimeMs("reportOriginalExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "reportOriginalExposure viewId = " + this.f277625w1 + ", commInfo = " + this.f277629x1 + ", uxInfo = " + this.f277533Q + ", exposureType = 0");
        this.f277636z1 = true;
        m121813Z7(this.f277625w1, this.f277629x1, this.f277533Q, 0);
        SnsMethodCalculate.markEndTimeMs("reportOriginalExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: Q8 */
    public final void mo132508Q8() {
        SnsMethodCalculate.markStartTimeMs("reportValidExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "reportValidExposure viewId = " + this.f277625w1 + ", commInfo = " + this.f277629x1 + ", uxInfo = " + this.f277533Q + ", exposureType = 1");
        this.f277500A1 = true;
        m121813Z7(this.f277625w1, this.f277629x1, this.f277533Q, 1);
        SnsMethodCalculate.markEndTimeMs("reportValidExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: R8 */
    public void mo132509R8() {
        SnsMethodCalculate.markStartTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            this.f277547U1.setValue(3);
            for (SnsAdLandingPageFloatView snsAdLandingPageFloatView : ((HashMap) this.f277604p1).values()) {
                snsAdLandingPageFloatView.mo134022g();
                snsAdLandingPageFloatView.setVisibility(8);
            }
            hideVKB();
            mo132548t8();
            mo132532d8();
            mo132506O8();
            this.f277560Z = true;
            if (this.f277618u) {
                mo132518W7();
                mo132534f8();
                AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = this.f277610r1;
                if (adLandingFloatBarCompWrapper == null || !adLandingFloatBarCompWrapper.mo131506O()) {
                    mo132547s8(false, 0);
                } else {
                    this.f277610r1.mo131501I();
                }
                C94696a aVar = this.f277624w;
                if (aVar != null) {
                    SnsMethodCalculate.markStartTimeMs("runExitAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
                    aVar.f274074b.mo130329d();
                    SnsMethodCalculate.markEndTimeMs("runExitAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
                } else {
                    Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "AdHalfScreenLandingPageHelper==null");
                }
                SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return;
            }
            View view = this.f277567c1;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI", "runExitAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI", "runExitAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            AdLandingPageEggCardHelper adLandingPageEggCardHelper = this.f277519I1;
            if (adLandingPageEggCardHelper != null) {
                SnsMethodCalculate.markStartTimeMs("isShowSimpleShakeAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                boolean z = adLandingPageEggCardHelper.f274101l;
                SnsMethodCalculate.markEndTimeMs("isShowSimpleShakeAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                if (z && m121814z8(this.f277508D)) {
                    this.f277612s = false;
                }
            }
            if (!this.f277612s) {
                finish();
                SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            } else if (this.f277594m1) {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "is playing animation");
                SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            } else {
                Log.m105925i("MicroMsg.SnsAdNativeLandingPagesUI", "run exit animation, %s", Boolean.valueOf(this.f277612s));
                this.f277594m1 = true;
                if (isSupportNavigationSwipeBack()) {
                    getSwipeBackLayout().setEnableGesture(false);
                }
                mo132518W7();
                mo132534f8();
                MMHandlerThread.postToMainThreadDelayed(new C95435m(), 30);
                SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsAdNativeLandingPagesUI", e, "play exit animation error", new Object[0]);
            finish();
        }
    }

    /* renamed from: S8 */
    public void mo132510S8() {
        SnsMethodCalculate.markStartTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (this.f277618u) {
            C94696a.m119888c(this);
        } else {
            C95198o2.m121133e(this);
        }
        SnsMethodCalculate.markEndTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: T0 */
    public C101271i0 mo132511T0() {
        SnsMethodCalculate.markStartTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C101271i0 n8 = mo132541n8();
        SnsMethodCalculate.markEndTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return n8;
    }

    /* renamed from: T7 */
    public final boolean mo132512T7() {
        SnsMethodCalculate.markStartTimeMs("canShowRightBarTitle", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = !Util.isNullOrNil(this.f277499A) && !Util.isNullOrNil(this.f277502B);
        SnsMethodCalculate.markEndTimeMs("canShowRightBarTitle", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z;
    }

    /* renamed from: T8 */
    public final void mo132513T8(String str, String str2, String str3, String str4, String str5, String str6) {
        SnsMethodCalculate.markStartTimeMs("shareGiveHbCardInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        String str7 = str;
        String g8 = mo132535g8(new C95765e2(str, str2, false, false));
        if (!TextUtils.isEmpty(str3)) {
            g8 = g8.replace("<adCanvasInfo>", "<adCanvasInfo>" + str3);
        }
        String str8 = g8;
        SnsMethodCalculate.markStartTimeMs("doTransimtForHBCard", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        this.f277551W.f295492k++;
        String i8 = mo132536i8();
        String b = C102236a0.m134734b(this.f277518I, this.f277533Q);
        if (!b.contains("isInteractiveCanvas") && (this.f277525L1 || str8.contains("isInteractiveCanvas"))) {
            b = C102236a0.m134738d(b, "isInteractiveCanvas", "1");
        }
        String str9 = b;
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doTransimtForHBCard, shareUrl=" + str9);
        AdLandingPagesProxy.getInstance().doTransimt(this, str8, str4, str6, str5, str9, i8, Util.nullAsNil(this.f277533Q), Util.nullAsNil(this.f277551W.f295499r));
        SnsMethodCalculate.markEndTimeMs("doTransimtForHBCard", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        SnsMethodCalculate.markEndTimeMs("shareGiveHbCardInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: U7 */
    public final boolean mo132514U7() {
        SnsMethodCalculate.markStartTimeMs("canShowRightBarTitleInActionSheet", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = (this.f277558Y0 & 16) == 0;
        SnsMethodCalculate.markEndTimeMs("canShowRightBarTitleInActionSheet", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z;
    }

    /* renamed from: U8 */
    public final void mo132515U8() {
        SnsMethodCalculate.markStartTimeMs("showDownloadAppLawInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Log.m105918d("MicroMsg.SnsAdNativeLandingPagesUI", "showDownloadAppLawInfoView");
        FrameLayout frameLayout = this.f277577f2;
        if (frameLayout == null) {
            SnsMethodCalculate.markEndTimeMs("showDownloadAppLawInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        if (this.f277583h2 == null) {
            frameLayout.setVisibility(8);
        } else if (frameLayout.getChildCount() == 0) {
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "showDownloadAppLawInfoView, show downloadAppLawComp");
            this.f277577f2.addView(this.f277583h2.mo131855p());
            this.f277577f2.setVisibility(0);
            this.f277583h2.mo124360B();
            this.f277583h2.mo130145A();
        }
        SnsMethodCalculate.markEndTimeMs("showDownloadAppLawInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: V7 */
    public final void mo132516V7() {
        SnsMethodCalculate.markStartTimeMs("checkUpdateUxinfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        int i = this.f277508D;
        SnsMethodCalculate.markStartTimeMs("isNeedUpdateUxinfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = m121814z8(i) || C34628a.m40410c(i) || i == 33;
        SnsMethodCalculate.markEndTimeMs("isNeedUpdateUxinfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (!z || TextUtils.isEmpty(this.f277533Q)) {
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "checkUpdateUxinfo, no need, uxInfo=" + this.f277533Q);
        } else {
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doUpdateUxInfoScene, uxInfo=" + this.f277533Q + ", source=" + this.f277508D);
            AdLandingPagesProxy.getInstance().doUpdateUxInfoScene(this.f277533Q, this.f277508D, new C43070b());
            SnsMethodCalculate.markStartTimeMs("checkPreloadScanRes", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            try {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "checkPreloadScanRes, uxinfo=" + this.f277533Q);
                C99001u.m128923i(ADXml.C85461b.m105464a(this.f277585i1, ".adxml.adScanInfo"), this.f277533Q);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "checkPreloadScanRes exp=" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("checkPreloadScanRes", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        SnsMethodCalculate.markEndTimeMs("checkUpdateUxinfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: V8 */
    public void mo132517V8(String str) {
        SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C47517e eVar = this.f277541S1;
        eVar.getClass();
        SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        ((C119157j) C119157j.f356862d).mo183895z(new C47515c(eVar, str));
        SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: W7 */
    public final void mo132518W7() {
        SnsMethodCalculate.markStartTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        for (C95295z next : mo132540m8().mo131807R()) {
            if (next instanceof C101253a) {
                ((C101253a) next).mo130232G();
                next.mo130247t();
            } else if (next instanceof AdLandingHBCardComponent) {
                ((AdLandingHBCardComponent) next).mo130151Q();
            } else if (next instanceof C95250a) {
                mo132520X7((C95250a) next, 0);
            }
        }
        SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: W8 */
    public void mo132519W8() {
        SnsMethodCalculate.markStartTimeMs("signFirstSightVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        List<C95295z> j8 = mo132537j8();
        if (j8 != null && j8.size() > 0) {
            C95295z zVar = j8.get(0);
            if (zVar instanceof C95222u1) {
                ((C95222u1) zVar).f276357d1 = true;
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "snsId = " + this.f277520J + ", adSightVideoSeekTime = " + this.f277523K1 + ", isFirstSightVideoComp = " + true);
            } else if (zVar instanceof C94651l) {
                ((C94651l) zVar).f273895M = true;
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "snsId = " + this.f277520J + ", adVideoSeekTime = " + this.f277523K1 + ", isFirstVideoComp = " + true);
            }
        }
        SnsMethodCalculate.markEndTimeMs("signFirstSightVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: X7 */
    public void mo132520X7(C95250a aVar, int i) {
        SnsMethodCalculate.markStartTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (!AdLandingGeneralVideoWrapper.m119853k()) {
            SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        } else if (i > 100) {
            SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        } else if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        } else {
            List<C95295z> E = aVar.mo130196E();
            if (C101425k.m133097a(E)) {
                SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return;
            }
            for (C95295z next : E) {
                if (next instanceof C95250a) {
                    i++;
                    mo132520X7((C95250a) next, i);
                } else if (next instanceof C101253a) {
                    ((C101253a) next).mo130232G();
                    next.mo130247t();
                } else if (next instanceof AdLandingHBCardComponent) {
                    ((AdLandingHBCardComponent) next).mo130151Q();
                }
            }
            SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
    }

    /* renamed from: X8 */
    public final void mo132521X8() {
        SnsMethodCalculate.markStartTimeMs("startExposureCalculate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            if (!Util.isNullOrNil(this.f277625w1, this.f277629x1)) {
                if (!this.f277636z1) {
                    mo132507P8();
                    C115669n.INSTANCE.mo175911u(1673, 30);
                }
                if (!this.f277500A1 && this.f277506C1 != null) {
                    Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "execute mValidExposureRunnable onCreate");
                    this.f277506C1.removeCallbacks(this.f277608q2);
                    this.f277506C1.postDelayed(this.f277608q2, 1000);
                }
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("startExposureCalculate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: Y7 */
    public final void mo132522Y7() {
        SnsMethodCalculate.markStartTimeMs("doBackToThirdApp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        String a = C34628a.m40408a(this.f277530O1);
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doBackToThirdApp, appId=" + a);
        if (!TextUtils.isEmpty(a)) {
            AdLandingPagesProxy.getInstance().launchBackApp(a);
        }
        SnsMethodCalculate.markEndTimeMs("doBackToThirdApp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: Y8 */
    public void mo132523Y8(boolean z) {
        SnsMethodCalculate.markStartTimeMs("syncDynamicPageData", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (z && this.f277537R0 == 1) {
            AdLandingPagesProxy.getInstance().doDynamicUpdateScene(this.f277540S0, this.f277543T0, this.f277546U0, this.f277598n2);
        }
        if (this.f277537R0 == 2 && !Util.isNullOrNil(this.f277549V0)) {
            AdLandingPagesProxy.getInstance().doSearchDynamicUpdateScene(this.f277549V0, this.f277598n2);
        }
        this.f277534Q0 = true;
        SnsMethodCalculate.markEndTimeMs("syncDynamicPageData", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: Z8 */
    public void mo132524Z8() {
        SnsMethodCalculate.markStartTimeMs("toggleFloatBarView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        mo132526a9(300);
        SnsMethodCalculate.markEndTimeMs("toggleFloatBarView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: a8 */
    public final void mo132525a8(C32226l<String, C13598b0> lVar) {
        C32226l<String, C13598b0> lVar2 = lVar;
        SnsMethodCalculate.markStartTimeMs("doRequestDynamicCanvasXmlAndTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            C12004a aVar = new C12004a();
            aVar.f35001d = true;
            long B0 = C102236a0.m134706B0(this.f277538R1);
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doRequestDynamicCanvasXml, pageId is " + this.f277538R1 + ", pageIdParam is " + B0 + ", source is " + this.f277508D + ", uxInfo is " + this.f277533Q + ", canvasDynamicInfo is " + this.f277566b2 + ", adCanvasParams is " + aVar);
            long j = B0;
            String openForAd = AdLandingPagesProxy.getInstance().openForAd(B0, 0, 0, 0, this.f277508D, this.f277533Q, this.f277566b2, aVar);
            if (!Util.isNullOrNil(openForAd)) {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doRequestDynamicCanvasXml, canvasPageXml is existed");
                if (lVar2 != null) {
                    lVar2.invoke(openForAd);
                }
                SnsMethodCalculate.markEndTimeMs("doRequestDynamicCanvasXmlAndTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return;
            }
            mo132517V8(getString(C0966R.string.j_u));
            long j2 = j;
            AdLandingPagesProxy.getInstance().requestAdCanvasXmlFromNet(j2, 0, 0, this.f277508D, this.f277533Q, this.f277566b2, aVar, new C43073n(j2, lVar2));
            SnsMethodCalculate.markEndTimeMs("doRequestDynamicCanvasXmlAndTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "doRequestDynamicCanvasXml, exp is " + th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0229 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019a A[Catch:{ Exception -> 0x021d }] */
    /* renamed from: a9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo132526a9(long r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            java.lang.String r4 = "ContentFragment"
            java.lang.String r5 = "toggleFloatBarView"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            boolean r0 = r20.mo132495C8()
            if (r0 == 0) goto L_0x0022
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a r0 = r1.f277624w
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.mo130351b()
            if (r0 != 0) goto L_0x0022
        L_0x001e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x0022:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper r0 = r1.f277610r1
            if (r0 == 0) goto L_0x0337
            qs2.e0 r7 = r1.f277572e
            if (r7 != 0) goto L_0x002c
            goto L_0x0337
        L_0x002c:
            boolean r0 = r0.mo131506O()
            if (r0 == 0) goto L_0x0036
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x0036:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r7 = r20.mo132540m8()
            if (r7 != 0) goto L_0x0040
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x0040:
            java.lang.String r0 = "isFromSourceAllow"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            qs2.e0 r8 = r1.f277572e
            r10 = 1
            if (r8 == 0) goto L_0x005e
            int r8 = r8.f296571J
            if (r8 != r10) goto L_0x0059
            int r8 = r1.f277508D
            boolean r8 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp.m120808b0(r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            goto L_0x0062
        L_0x0059:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            r8 = 1
            goto L_0x0062
        L_0x005e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            r8 = 0
        L_0x0062:
            java.lang.String r0 = "isForbidFloatBar"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r11)
            ps2.l r12 = r7.f276482B
            if (r12 == 0) goto L_0x0074
            boolean r12 = r12.f295435j
            if (r12 == 0) goto L_0x0074
            r12 = 1
            goto L_0x0075
        L_0x0074:
            r12 = 0
        L_0x0075:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r11)
            boolean r13 = r20.mo132496D8()
            java.lang.String r0 = "isFirstPage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r11)
            boolean r14 = r7.f276502n
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r11)
            java.lang.String r0 = "isLastPage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r11)
            boolean r15 = r7.f276501j
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r11)
            java.lang.String r9 = "isFloatBarCoverVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r11)
            ws2.a r0 = r7.f276484D     // Catch:{ Exception -> 0x012d }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r0 = r0.mo142109G4()     // Catch:{ Exception -> 0x012d }
            if (r0 == 0) goto L_0x00ca
            qs2.a0 r10 = r0.mo131850h()     // Catch:{ Exception -> 0x012d }
            int r10 = r10.f296505k     // Catch:{ Exception -> 0x012d }
            r2 = 62
            if (r10 == r2) goto L_0x00be
            qs2.a0 r2 = r0.mo131850h()     // Catch:{ Exception -> 0x012d }
            int r2 = r2.f296505k     // Catch:{ Exception -> 0x012d }
            r3 = 61
            if (r2 == r3) goto L_0x00be
            qs2.a0 r2 = r0.mo131850h()     // Catch:{ Exception -> 0x012d }
            int r2 = r2.f296505k     // Catch:{ Exception -> 0x012d }
            r3 = 142(0x8e, float:1.99E-43)
            if (r2 != r3) goto L_0x00ca
        L_0x00be:
            java.lang.String r0 = "isFloatBarCoverVideo, ret=true, lastComp is Video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x012d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
        L_0x00c7:
            r0 = 1
            goto L_0x0151
        L_0x00ca:
            ws2.a r2 = r7.f276484D     // Catch:{ Exception -> 0x012d }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r2 = r2.mo142110O4()     // Catch:{ Exception -> 0x012d }
            if (r2 == 0) goto L_0x0147
            qs2.a0 r3 = r2.mo131850h()     // Catch:{ Exception -> 0x012d }
            int r3 = r3.f296505k     // Catch:{ Exception -> 0x012d }
            r10 = 62
            if (r3 == r10) goto L_0x00f0
            qs2.a0 r2 = r2.mo131850h()     // Catch:{ Exception -> 0x012d }
            int r2 = r2.f296505k     // Catch:{ Exception -> 0x012d }
            r3 = 61
            if (r2 == r3) goto L_0x00f0
            qs2.a0 r2 = r0.mo131850h()     // Catch:{ Exception -> 0x012d }
            int r2 = r2.f296505k     // Catch:{ Exception -> 0x012d }
            r3 = 142(0x8e, float:1.99E-43)
            if (r2 != r3) goto L_0x0147
        L_0x00f0:
            if (r0 == 0) goto L_0x0147
            android.view.View r0 = r0.mo131609i()     // Catch:{ Exception -> 0x012d }
            if (r0 == 0) goto L_0x0147
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ Exception -> 0x012d }
            r2.<init>()     // Catch:{ Exception -> 0x012d }
            r0.getLocalVisibleRect(r2)     // Catch:{ Exception -> 0x012d }
            android.content.Context r0 = r7.getContext()     // Catch:{ Exception -> 0x012d }
            r3 = 88
            int r0 = kg3.C76577a.m92151b(r0, r3)     // Catch:{ Exception -> 0x012d }
            int r3 = r2.bottom     // Catch:{ Exception -> 0x012d }
            if (r3 < 0) goto L_0x0147
            if (r3 >= r0) goto L_0x0147
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            r0.<init>()     // Catch:{ Exception -> 0x012d }
            java.lang.String r3 = "isFloatBarCoverVideo, ret=true, lastComp.rect="
            r0.append(r3)     // Catch:{ Exception -> 0x012d }
            java.lang.String r2 = r2.toShortString()     // Catch:{ Exception -> 0x012d }
            r0.append(r2)     // Catch:{ Exception -> 0x012d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x012d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x012d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            goto L_0x00c7
        L_0x012d:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isFloatBarCoverVideo, exp="
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0147:
            java.lang.String r0 = "isFloatBarCoverVideo, ret=false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            r0 = 0
        L_0x0151:
            java.lang.String r2 = "isVideoControlBarShow"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r6)
            boolean r3 = r1.f277613s1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r6)
            java.lang.String r2 = "isFloatBarTopAppearDistanceOk"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r11)
            qs2.e0 r9 = r7.mo131808S()     // Catch:{ Exception -> 0x0186 }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$g r10 = r7.f276483C     // Catch:{ Exception -> 0x0186 }
            androidx.recyclerview.widget.RecyclerView r10 = r10.f276527g     // Catch:{ Exception -> 0x0186 }
            int r10 = r10.computeVerticalScrollOffset()     // Catch:{ Exception -> 0x0186 }
            r16 = r5
            boolean r5 = r7.f276502n     // Catch:{ Exception -> 0x0188 }
            if (r5 == 0) goto L_0x0188
            if (r9 == 0) goto L_0x0188
            int r5 = r9.f296569H     // Catch:{ Exception -> 0x0188 }
            if (r5 == 0) goto L_0x0181
            if (r5 <= 0) goto L_0x017f
            if (r10 < r5) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r5 = 0
            goto L_0x0182
        L_0x0181:
            r5 = 1
        L_0x0182:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
            goto L_0x018c
        L_0x0186:
            r16 = r5
        L_0x0188:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
            r5 = 1
        L_0x018c:
            java.lang.String r2 = "isFloatBarBottomAppearDistanceOk"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r11)
            qs2.e0 r9 = r7.mo131808S()     // Catch:{ Exception -> 0x021d }
            boolean r10 = r7.f276501j     // Catch:{ Exception -> 0x021d }
            if (r10 == 0) goto L_0x0213
            if (r9 != 0) goto L_0x019e
            goto L_0x0213
        L_0x019e:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$g r10 = r7.f276483C     // Catch:{ Exception -> 0x021d }
            androidx.recyclerview.widget.RecyclerView r10 = r10.f276527g     // Catch:{ Exception -> 0x021d }
            if (r10 == 0) goto L_0x021d
            int r10 = r10.computeVerticalScrollOffset()     // Catch:{ Exception -> 0x021d }
            r17 = r6
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$g r6 = r7.f276483C     // Catch:{ Exception -> 0x020e }
            androidx.recyclerview.widget.RecyclerView r6 = r6.f276527g     // Catch:{ Exception -> 0x020e }
            int r6 = r6.computeVerticalScrollExtent()     // Catch:{ Exception -> 0x020e }
            r18 = r3
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$g r3 = r7.f276483C     // Catch:{ Exception -> 0x020b }
            androidx.recyclerview.widget.RecyclerView r3 = r3.f276527g     // Catch:{ Exception -> 0x020b }
            int r3 = r3.computeVerticalScrollRange()     // Catch:{ Exception -> 0x020b }
            int r3 = r3 - r10
            int r3 = r3 - r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020b }
            r6.<init>()     // Catch:{ Exception -> 0x020b }
            r19 = r0
            java.lang.String r0 = "bottomDis="
            r6.append(r0)     // Catch:{ Exception -> 0x0223 }
            r6.append(r3)     // Catch:{ Exception -> 0x0223 }
            java.lang.String r0 = ", appearBottom="
            r6.append(r0)     // Catch:{ Exception -> 0x0223 }
            int r0 = r9.f296570I     // Catch:{ Exception -> 0x0223 }
            r6.append(r0)     // Catch:{ Exception -> 0x0223 }
            java.lang.String r0 = ", topDis="
            r6.append(r0)     // Catch:{ Exception -> 0x0223 }
            r6.append(r10)     // Catch:{ Exception -> 0x0223 }
            java.lang.String r0 = ", appearTop="
            r6.append(r0)     // Catch:{ Exception -> 0x0223 }
            int r0 = r9.f296569H     // Catch:{ Exception -> 0x0223 }
            r6.append(r0)     // Catch:{ Exception -> 0x0223 }
            java.lang.String r0 = ", height="
            r6.append(r0)     // Catch:{ Exception -> 0x0223 }
            android.content.Context r0 = r7.getContext()     // Catch:{ Exception -> 0x0223 }
            int r0 = kg3.C76577a.m92159j(r0)     // Catch:{ Exception -> 0x0223 }
            r6.append(r0)     // Catch:{ Exception -> 0x0223 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0223 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)     // Catch:{ Exception -> 0x0223 }
            int r0 = r9.f296570I     // Catch:{ Exception -> 0x0223 }
            if (r0 <= 0) goto L_0x0223
            if (r3 >= r0) goto L_0x0223
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
            r0 = 0
            goto L_0x0227
        L_0x020b:
            r19 = r0
            goto L_0x0223
        L_0x020e:
            r19 = r0
            r18 = r3
            goto L_0x0223
        L_0x0213:
            r19 = r0
            r18 = r3
            r17 = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
            goto L_0x0226
        L_0x021d:
            r19 = r0
            r18 = r3
            r17 = r6
        L_0x0223:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
        L_0x0226:
            r0 = 1
        L_0x0227:
            if (r14 == 0) goto L_0x022f
            if (r5 == 0) goto L_0x022f
            r2 = 1
            r1.f277619u1 = r2
            goto L_0x0230
        L_0x022f:
            r2 = 1
        L_0x0230:
            if (r14 != 0) goto L_0x0234
            r1.f277619u1 = r2
        L_0x0234:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "toggleFloatBarView, isSourceAllow="
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = ", isForbid="
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = ", isKeybordShow="
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = ", isFirstPage="
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = ", isLastPage="
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = ", isCoverVideo="
            r2.append(r3)
            r3 = r19
            r2.append(r3)
            java.lang.String r4 = ", isVideoCtrlBarShow="
            r2.append(r4)
            r4 = r18
            r2.append(r4)
            java.lang.String r6 = ", isTopAppearOk="
            r2.append(r6)
            r2.append(r5)
            java.lang.String r6 = ", isBottomAppearOk="
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = ", IsTopAppearChecked="
            r2.append(r6)
            boolean r6 = r1.f277619u1
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "MicroMsg.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r2)
            r9 = 0
            if (r8 != 0) goto L_0x02a9
            r2 = 0
            r1.mo132547s8(r2, r9)
            r7 = r16
            r8 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return
        L_0x02a9:
            r7 = r16
            r8 = r17
            r2 = 0
            if (r12 == 0) goto L_0x02b8
            r11 = 1
            r1.mo132547s8(r11, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return
        L_0x02b8:
            r11 = 1
            if (r13 == 0) goto L_0x02c2
            r1.mo132547s8(r2, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return
        L_0x02c2:
            if (r3 == 0) goto L_0x02cf
            if (r4 == 0) goto L_0x02cf
            r2 = 200(0xc8, double:9.9E-322)
            r1.mo132547s8(r11, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return
        L_0x02cf:
            if (r15 == 0) goto L_0x02da
            if (r0 != 0) goto L_0x02da
            r1.mo132547s8(r11, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return
        L_0x02da:
            if (r14 == 0) goto L_0x02e6
            if (r5 != 0) goto L_0x02e6
            boolean r0 = r1.f277619u1
            if (r0 != 0) goto L_0x02e6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return
        L_0x02e6:
            boolean r0 = r20.isFinishing()
            if (r0 == 0) goto L_0x02f0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return
        L_0x02f0:
            java.lang.String r0 = "showFloatBarView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r8)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper r2 = r1.f277610r1
            if (r2 == 0) goto L_0x0330
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            boolean r2 = r20.mo132495C8()
            if (r2 == 0) goto L_0x031f
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.a r2 = r1.f277624w
            if (r2 == 0) goto L_0x0330
            boolean r2 = r2.mo130351b()
            if (r2 == 0) goto L_0x0330
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper r2 = r1.f277610r1
            r3 = r21
            r5 = 1
            r2.mo131510U(r5, r3)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r20.mo132540m8()
            if (r2 == 0) goto L_0x0330
            r2.mo131815a0()
            goto L_0x0330
        L_0x031f:
            r3 = r21
            r5 = 1
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper r2 = r1.f277610r1
            r2.mo131510U(r5, r3)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r20.mo132540m8()
            if (r2 == 0) goto L_0x0330
            r2.mo131815a0()
        L_0x0330:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return
        L_0x0337:
            r7 = r5
            r8 = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.mo132526a9(long):void");
    }

    /* renamed from: b8 */
    public final void mo132527b8(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("doShareToChatInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        String g8 = mo132535g8(new C95765e2(str, str2, true, false));
        SnsMethodCalculate.markStartTimeMs("doTransimt", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doTransimt snsAdNativeLadingPagesUI");
        this.f277551W.f295492k++;
        String i8 = mo132536i8();
        C95426b0 o8 = mo132542o8();
        String b = C102236a0.m134734b(this.f277518I, this.f277533Q);
        if (!b.contains("isInteractiveCanvas") && (this.f277525L1 || g8.contains("isInteractiveCanvas"))) {
            b = C102236a0.m134738d(b, "isInteractiveCanvas", "1");
        }
        String str3 = b;
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doTransimt, shareUrl=" + str3);
        if (o8 != null) {
            AdLandingPagesProxy.getInstance().doTransimt(this, g8, o8.f277642a, mo132544p8(o8.f277644c), o8.f277643b, str3, i8, Util.nullAsNil(this.f277533Q), Util.nullAsNil(this.f277551W.f295499r));
        } else {
            AdLandingPagesProxy.getInstance().doTransimt(this, g8, this.f277514G, mo132544p8(this.f277512F), this.f277516H, str3, i8, Util.nullAsNil(this.f277533Q), Util.nullAsNil(this.f277551W.f295499r));
        }
        SnsMethodCalculate.markEndTimeMs("doTransimt", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        SnsMethodCalculate.markEndTimeMs("doShareToChatInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0113  */
    /* renamed from: b9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo132528b9(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "tryInsertShareInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = rq2.C101429o.m133111d()
            if (r2 != 0) goto L_0x0012
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        L_0x0012:
            java.lang.String r2 = "MicroMsg.SnsAdNativeLandingPagesUI"
            java.lang.String r3 = "genForwardXml tryInsertShareInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            rq2.t r3 = rq2.C101433t.f297083a
            java.lang.String r3 = "findAdXml"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.utils.XMLUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 0
            if (r13 != 0) goto L_0x0029
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L_0x0036
        L_0x0029:
            rq2.t$a$a r6 = rq2.C101433t.m133136f(r13)
            if (r6 == 0) goto L_0x0033
            rq2.t$a$a r5 = rq2.C101433t.m133134b(r6)
        L_0x0033:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x0036:
            if (r5 == 0) goto L_0x0103
            rq2.C101433t.m133133a(r5, r14)
            r14 = 1
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.String r4 = r12.f277538R1
            r6 = 0
            r3[r6] = r4
            java.lang.String r4 = "<canvasId>%s</canvasId>"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.String r4 = r12.f277533Q
            if (r4 != 0) goto L_0x004f
            java.lang.String r4 = ""
        L_0x004f:
            java.lang.Object[] r7 = new java.lang.Object[r14]
            r7[r6] = r4
            java.lang.String r4 = "<uxInfo>%s</uxInfo>"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            java.lang.Object[] r7 = new java.lang.Object[r14]
            java.lang.String r8 = r12.f277566b2
            r7[r6] = r8
            java.lang.String r8 = "<canvasDynamicInfo>%s</canvasDynamicInfo>"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "<canvasShareInfo>"
            r8.append(r9)
            r8.append(r3)
            r8.append(r4)
            r8.append(r7)
            java.lang.String r3 = "</canvasShareInfo>"
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            rq2.t$a$a r3 = rq2.C101433t.m133136f(r3)
            if (r3 == 0) goto L_0x008b
            r5.mo140936a(r3)
            goto L_0x0090
        L_0x008b:
            java.lang.String r3 = "can not addTag !"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
        L_0x0090:
            java.lang.String r3 = "OpenAdCanvasHelper"
            java.lang.String r4 = "isDisableStaticXmlInShare"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r7)
            java.lang.Class<h81.h> r8 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r8)     // Catch:{ all -> 0x00c0 }
            h81.h r8 = (h81.C32735h) r8     // Catch:{ all -> 0x00c0 }
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_ad_disable_share_static_xml_cfg_android     // Catch:{ all -> 0x00c0 }
            int r8 = r8.mo58779Qe(r9, r6)     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r9.<init>()     // Catch:{ all -> 0x00be }
            java.lang.String r10 = "isDisableStaticXmlInShare called "
            r9.append(r10)     // Catch:{ all -> 0x00be }
            r9.append(r8)     // Catch:{ all -> 0x00be }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00be }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)     // Catch:{ all -> 0x00be }
            goto L_0x00d8
        L_0x00be:
            r9 = move-exception
            goto L_0x00c3
        L_0x00c0:
            r8 = move-exception
            r9 = r8
            r8 = 0
        L_0x00c3:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "isDisableStaticXmlInShare, exp="
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
        L_0x00d8:
            if (r8 <= 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r14 = 0
        L_0x00dc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r7)
            if (r14 == 0) goto L_0x00fe
            java.lang.String r14 = ".adxml.adCanvasInfo.PageList"
            rq2.C101433t.m133133a(r5, r14)
            java.lang.String r14 = "<PageList>\n            <Page>\n                <componentItemList>\n                    <componentItem>\n                        <type>2147483647</type>\n                    </componentItem>\n                </componentItemList>\n            </Page>\n        </PageList>"
            rq2.t$a$a r14 = rq2.C101433t.m133136f(r14)
            java.lang.String r3 = ".adxml.adCanvasInfo"
            rq2.t$a$a r3 = rq2.C101433t.m133135c(r5, r3)
            if (r14 == 0) goto L_0x00fe
            if (r3 == 0) goto L_0x00fe
            r3.mo140936a(r14)
            java.lang.String r14 = "add invalidTag !"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r14)
        L_0x00fe:
            java.lang.String r14 = rq2.C101433t.m133138h(r5)
            goto L_0x0109
        L_0x0103:
            java.lang.String r14 = "can not parse xml !"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r14)
            r14 = r13
        L_0x0109:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r2 == 0) goto L_0x0113
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        L_0x0113:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.mo132528b9(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: c3 */
    public LiveData<Integer> mo132529c3() {
        SnsMethodCalculate.markStartTimeMs("getRootViewHeight", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C54219z<Integer> zVar = this.f277553W1;
        SnsMethodCalculate.markEndTimeMs("getRootViewHeight", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return zVar;
    }

    /* renamed from: c8 */
    public final void mo132530c8(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("doShareToTimelineInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        String g8 = mo132535g8(new C95765e2(str, str2, true, false));
        SnsMethodCalculate.markStartTimeMs("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doShareToTimeline snsAdNativeLadingPagesUI");
        this.f277551W.f295491j++;
        String str3 = this.f277518I;
        C95426b0 o8 = mo132542o8();
        if (str3 == null || str3.length() == 0) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "doTimeline fail, link is null");
            SnsMethodCalculate.markEndTimeMs("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        } else {
            String b = C102236a0.m134734b(this.f277518I, this.f277533Q);
            if (!b.contains("isInteractiveCanvas") && (this.f277525L1 || g8.contains("isInteractiveCanvas"))) {
                b = C102236a0.m134738d(b, "isInteractiveCanvas", "1");
            }
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doShareToTimeline, shareUrl=" + b);
            int i = this.f277599o;
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doTimeline, init intent");
            Intent intent = new Intent();
            intent.putExtra("Ksnsupload_width", i);
            intent.putExtra("Ksnsupload_height", i);
            intent.putExtra("Ksnsupload_link", b);
            if (o8 != null) {
                intent.putExtra("Ksnsupload_title", o8.f277642a);
                intent.putExtra("Ksnsupload_imgurl", mo132544p8(o8.f277644c));
            } else {
                intent.putExtra("Ksnsupload_title", this.f277514G);
                intent.putExtra("Ksnsupload_imgurl", mo132544p8(this.f277512F));
            }
            intent.putExtra("Ksnsupload_canvas_info", g8);
            intent.putExtra("Ksnsupload_contentattribute", 0);
            intent.putExtra("Ksnsupload_source", 1);
            intent.putExtra("Ksnsupload_type", 1);
            String i8 = mo132536i8();
            if (!Util.isNullOrNil(i8)) {
                intent.putExtra("key_snsad_statextstr", i8);
            }
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "doTimeline, start activity");
            intent.putExtra("need_result", true);
            int i2 = this.f277508D;
            String str4 = "sns_";
            if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 9 || i2 == 10 || i2 == 11) {
                str4 = str4 + this.f277520J;
            } else if (i2 == 5 || i2 == 6) {
                str4 = "msg_" + getIntent().getExtras().getLong("msg_id", -2147483648L);
            } else if (i2 == 7) {
                str4 = "fav_" + getIntent().getExtras().getString("sns_landing_favid");
            }
            String a = C86493v0.m107223a(str4);
            C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", str4);
            intent.putExtra("reportSessionId", a);
            intent.putExtra("KSnsIsUploadAdLandingPage", true);
            C88144b.m109796n(getContext(), "sns", ".ui.SnsUploadUI", intent, 2001, false);
            SnsMethodCalculate.markEndTimeMs("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        SnsMethodCalculate.markEndTimeMs("doShareToTimelineInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: c9 */
    public void mo132531c9(C101255a0 a0Var, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C104428a aVar;
        C101255a0 a0Var2 = a0Var;
        boolean z4 = z3;
        SnsMethodCalculate.markStartTimeMs("tryRespondToBottomList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (this.f277634y2 == null || z4) {
            C95439t tVar = new C95439t(z4);
            if (!z4) {
                C95295z a = C96328z2.m123559a(getContext(), a0Var2, new LinearLayout(getContext()), !Util.isNullOrNil(a0Var2.f296506l) ? Color.parseColor(a0Var2.f296506l) : -1);
                this.f277634y2 = new C95074c0(getContext(), a, str, str2, str3, z, z2);
                View p = a.mo131855p();
                C95074c0 c0Var = this.f277634y2;
                C95440u uVar = new C95440u(p);
                c0Var.getClass();
                SnsMethodCalculate.markStartTimeMs("setCloseDialogCallBack", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
                c0Var.f275967h = uVar;
                SnsMethodCalculate.markEndTimeMs("setCloseDialogCallBack", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
                C95074c0 c0Var2 = this.f277634y2;
                c0Var2.getClass();
                SnsMethodCalculate.markStartTimeMs("tryShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
                if (c0Var2.f275962c == null || (aVar = c0Var2.f275961b) == null) {
                    SnsMethodCalculate.markEndTimeMs("tryShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
                } else {
                    aVar.getWindow().setFlags(8, 8);
                    c0Var2.f275961b.getWindow().addFlags(131200);
                    if (c0Var2.f275967h != null) {
                        c0Var2.f275961b.setOnDismissListener(new C95081d0(c0Var2));
                        c0Var2.f275961b.setOnCancelListener(new C95084e0(c0Var2));
                    }
                    c0Var2.f275961b.setContentView(c0Var2.f275962c);
                    BottomSheetBehavior.m139527y((View) c0Var2.f275962c.getParent()).mo146383A(C95198o2.m121130b(c0Var2.f275960a)[1]);
                    c0Var2.f275961b.show();
                    SnsMethodCalculate.markEndTimeMs("tryShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
                }
            }
            if (!Util.isNullOrNil(str)) {
                AdLandingPagesProxy.getInstance().doFavOfficialItemScene(str, tVar);
                if (z4) {
                    this.f277637z2 = C76879j.m92723Q(this, (String) null, getString(C0966R.string.jec), true, false, (DialogInterface.OnCancelListener) null);
                }
            }
            SnsMethodCalculate.markEndTimeMs("tryRespondToBottomList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        Log.m105928w("MicroMsg.SnsAdNativeLandingPagesUI", "bottom sheet appear several times");
        this.f277634y2.mo131584a();
        C89779i0 i0Var = this.f277637z2;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f277637z2 = null;
        }
        SnsMethodCalculate.markEndTimeMs("tryRespondToBottomList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public boolean convertActivityFromTranslucent() {
        SnsMethodCalculate.markStartTimeMs("convertActivityFromTranslucent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (!mo132497E8()) {
            SnsMethodCalculate.markEndTimeMs("convertActivityFromTranslucent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("convertActivityFromTranslucent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return false;
    }

    /* renamed from: d8 */
    public void mo132532d8() {
        SnsMethodCalculate.markStartTimeMs("endCompExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C102495c cVar = (C102495c) this.f277552W0.getAdapter();
        if (cVar == null) {
            SnsMethodCalculate.markEndTimeMs("endCompExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        List<Fragment> list = cVar.f301794i;
        SnsMethodCalculate.markEndTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        Iterator<Fragment> it = list.iterator();
        while (it.hasNext()) {
            ContentFragment contentFragment = (ContentFragment) it.next();
            contentFragment.getClass();
            SnsMethodCalculate.markStartTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            if (contentFragment.f276497f != null && contentFragment.getUserVisibleHint()) {
                contentFragment.f276497f.mo131783b();
            }
            SnsMethodCalculate.markEndTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        }
        AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = this.f277610r1;
        if (adLandingFloatBarCompWrapper != null) {
            adLandingFloatBarCompWrapper.mo124361D();
        }
        C95243v0 v0Var = this.f277544T1;
        if (v0Var != null) {
            v0Var.mo124361D();
        }
        C95066b0 b0Var = this.f277550V1;
        if (b0Var != null) {
            b0Var.mo124361D();
        }
        SnsMethodCalculate.markEndTimeMs("endCompExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: e8 */
    public void mo132533e8() {
        View view;
        SnsMethodCalculate.markStartTimeMs("exitFullScreenVideo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        this.f277529N1 = false;
        C103049a a = C103049a.m136281a();
        a.getClass();
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        C98607d dVar = a.f304040f;
        if (dVar != null) {
            dVar.disable();
            a.f304040f.f289116g = null;
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.f277527M1;
        if (adLandingGeneralVideoWrapper != null) {
            adLandingGeneralVideoWrapper.setFullScreen(this.f277529N1);
            AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper2 = this.f277527M1;
            adLandingGeneralVideoWrapper2.getClass();
            SnsMethodCalculate.markStartTimeMs("removeFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            C95094h hVar = adLandingGeneralVideoWrapper2.f274025J;
            if (hVar != null) {
                SnsMethodCalculate.markStartTimeMs("removeFromParent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                ViewGroup viewGroup = hVar.f276003x;
                if (viewGroup != null) {
                    viewGroup.removeView(hVar.f276000u);
                }
                SnsMethodCalculate.markEndTimeMs("removeFromParent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                adLandingGeneralVideoWrapper2.f274025J.mo67235C();
            }
            SnsMethodCalculate.markEndTimeMs("removeFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            ViewGroup videoCompContainer = this.f277527M1.getVideoCompContainer();
            AdLandingVideoPlayerToolBar toolBar = this.f277527M1.getToolBar();
            toolBar.mo130493b(false);
            this.f277527M1.setAnimImmediately(true);
            this.f277527M1.mo130308l(0);
            this.f277527M1.mo130290d(false);
            ViewGroup viewGroup2 = (ViewGroup) this.f277527M1.getParent();
            this.f277565b1.removeView(viewGroup2);
            viewGroup2.removeView(this.f277527M1);
            viewGroup2.removeView(toolBar);
            if (!this.f277515G1) {
                getSwipeBackLayout().setEnableGesture(true);
            }
            videoCompContainer.addView(this.f277527M1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            videoCompContainer.addView(toolBar, layoutParams);
            SnsMethodCalculate.markStartTimeMs("landingPagesFullScreenResume", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            C118144a.m166672a(this).mo182943b(this.f277586i2, new IntentFilter("com.tencent.mm.adlanding.video_progressbar_change"));
            this.f277601o2.alive();
            AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = this.f277610r1;
            if (adLandingFloatBarCompWrapper != null && adLandingFloatBarCompWrapper.mo131508Q()) {
                this.f277610r1.mo124360B();
            }
            C95243v0 v0Var = this.f277544T1;
            if (v0Var != null) {
                v0Var.mo124360B();
            }
            C95066b0 b0Var = this.f277550V1;
            if (b0Var != null) {
                b0Var.mo124360B();
            }
            ContentFragment m8 = mo132540m8();
            m8.getClass();
            SnsMethodCalculate.markStartTimeMs("fragmentFullScreenResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            m8.f276513y = false;
            m8.f276499h = true;
            ContentFragment.C95273g gVar = m8.f276483C;
            if (!(gVar == null || (view = gVar.f276521a) == null)) {
                ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                while (viewGroup3 != null && viewGroup3.getId() != C0966R.C0970id.iwc) {
                    viewGroup3 = (ViewGroup) viewGroup3.getParent();
                }
                if (viewGroup3 instanceof FrameLayout) {
                    int childCount = viewGroup3.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        if (viewGroup3.getChildAt(i) instanceof SnsAdLandingPageFloatView) {
                            m8.f276499h = false;
                        }
                    }
                }
            }
            m8.f276497f.mo131784c(m8.f276499h);
            if (m8.f276497f != null && m8.getUserVisibleHint()) {
                C95251e eVar = m8.f276497f;
                C100882l lVar = m8.f276482B;
                String str = m8.f276514z;
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("notifyOtherChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                if (!eVar.f276445e) {
                    SnsMethodCalculate.markEndTimeMs("notifyOtherChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                } else {
                    LinearLayoutManager linearLayoutManager = eVar.f276443c;
                    if (linearLayoutManager != null) {
                        int C = linearLayoutManager.mo16957C();
                        int E = eVar.f276443c.mo16959E();
                        Log.m105919d("RecyclerViewExposureMgr", "appear [%d, %d]", Integer.valueOf(C), Integer.valueOf(E));
                        if (C == E && C == -1) {
                            Log.m105924i("RecyclerViewExposureMgr", "no exposuring child");
                            SnsMethodCalculate.markEndTimeMs("notifyOtherChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                        } else {
                            SnsMethodCalculate.markStartTimeMs("startOtherItemsExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                            while (C <= E) {
                                if (!lVar.f295429d.get(C).f296495a.equals(str)) {
                                    C95251e.C95253b bVar = (C95251e.C95253b) ((HashMap) eVar.f276442b).get(Integer.valueOf(C));
                                    if (bVar == null) {
                                        bVar = new C95251e.C95253b(eVar, (C95251e.C95252a) null);
                                        ((HashMap) eVar.f276442b).put(Integer.valueOf(C), bVar);
                                    }
                                    if (eVar.f276444d.mo131789N(C)) {
                                        if (!bVar.f276446a) {
                                            eVar.f276444d.mo131790f0(C, eVar);
                                            bVar.mo131787a();
                                        } else if (eVar.f276444d.mo131794s0(C)) {
                                            eVar.f276444d.mo131791f3(C);
                                        }
                                    }
                                }
                                C++;
                            }
                            SnsMethodCalculate.markEndTimeMs("startOtherItemsExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("notifyOtherChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                }
            }
            SnsMethodCalculate.markEndTimeMs("fragmentFullScreenResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            SnsMethodCalculate.markEndTimeMs("landingPagesFullScreenResume", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        SnsMethodCalculate.markEndTimeMs("exitFullScreenVideo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A[Catch:{ all -> 0x00a2 }] */
    /* renamed from: f8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo132534f8() {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.SnsAdNativeLandingPagesUI"
            java.lang.String r1 = "fixActivityTranslucent"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            android.content.Context r3 = r10.getApplicationContext()     // Catch:{ all -> 0x00a2 }
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch:{ all -> 0x00a2 }
            int r3 = r3.targetSdkVersion     // Catch:{ all -> 0x00a2 }
            r4 = 29
            boolean r5 = p206nj.C11171e.m11046c(r4)     // Catch:{ all -> 0x00a2 }
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0029
            r5 = 30
            boolean r5 = p206nj.C11171e.m11046c(r5)     // Catch:{ all -> 0x00a2 }
            if (r5 != 0) goto L_0x0027
            if (r3 < r4) goto L_0x0029
        L_0x0027:
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            java.lang.String r5 = p156gj.C87203t.m108275k()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)     // Catch:{ all -> 0x00a2 }
            if (r4 != 0) goto L_0x0047
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00a2 }
            if (r8 != 0) goto L_0x0047
            java.lang.String r8 = "huawei nxt-al10|mix 2s|sm-g9350"
            java.lang.String r9 = r5.toLowerCase()     // Catch:{ all -> 0x00a2 }
            boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x00a2 }
            if (r8 == 0) goto L_0x0047
            r4 = 1
        L_0x0047:
            if (r4 != 0) goto L_0x0065
            r10.mo132550v8()     // Catch:{ all -> 0x00a2 }
            java.lang.String r8 = r10.f277591k2     // Catch:{ all -> 0x00a2 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x00a2 }
            if (r9 != 0) goto L_0x0065
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00a2 }
            if (r9 != 0) goto L_0x0065
            java.lang.String r9 = r5.toLowerCase()     // Catch:{ all -> 0x00a2 }
            boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x00a2 }
            if (r8 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r7 = r4
        L_0x0066:
            boolean r4 = r10.mo132497E8()     // Catch:{ all -> 0x00a2 }
            if (r4 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r6 = r7
        L_0x006e:
            if (r6 == 0) goto L_0x0073
            vr2.C102260r.m134870j(r10)     // Catch:{ all -> 0x00a2 }
        L_0x0073:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a2 }
            r4.<init>()     // Catch:{ all -> 0x00a2 }
            java.lang.String r7 = "fixActivityTranslucent, device="
            r4.append(r7)     // Catch:{ all -> 0x00a2 }
            r4.append(r5)     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = ", api="
            r4.append(r5)     // Catch:{ all -> 0x00a2 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a2 }
            r4.append(r5)     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = ", targetSdkVer="
            r4.append(r5)     // Catch:{ all -> 0x00a2 }
            r4.append(r3)     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = ", needFix="
            r4.append(r3)     // Catch:{ all -> 0x00a2 }
            r4.append(r6)     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x00a2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x00a2 }
            goto L_0x00bb
        L_0x00a2:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "fixActivityTranslucent exp="
            r4.append(r5)
            java.lang.String r3 = r3.toString()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
        L_0x00bb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.mo132534f8():void");
    }

    public void finish() {
        SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.finish();
        if (C34628a.m40410c(this.f277508D)) {
            C115669n.INSTANCE.mo175911u(1667, 15);
        }
        SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: g8 */
    public final String mo132535g8(C95765e2 e2Var) {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("genForwardXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (e2Var == null || (str = e2Var.f279386a) == null) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "genForwardXml, processForwardParams == null! " + e2Var);
            String str3 = this.f277627x;
            SnsMethodCalculate.markEndTimeMs("genForwardXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return str3;
        }
        try {
            if (!Util.isNullOrNil(e2Var.f279387b)) {
                str = C101429o.m133112f(e2Var.f279387b, e2Var.f279386a);
                if (Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "replaceAdCanvasInfo but forwardXml return null");
                    String str4 = e2Var.f279386a;
                    SnsMethodCalculate.markEndTimeMs("genForwardXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    return str4;
                }
            }
            String replaceAll = str.replaceAll("(?s)<adCanvasInfoLeft[^>]*>.*?</adCanvasInfoLeft>", "").replaceAll("(?s)<adCanvasInfoRight[^>]*>.*?</adCanvasInfoRight>", "");
            if (replaceAll.contains("<adFullCardGestureCanvasInfo>")) {
                replaceAll = replaceAll.replaceAll("(?s)<adFullCardGestureCanvasInfo[^>]*>.*?</adFullCardGestureCanvasInfo>", "");
            }
            if (e2Var.f279388c && replaceAll.contains("<shareAdCanvasInfo>")) {
                replaceAll = replaceAll.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replace("shareAdCanvasInfo", "adCanvasInfo");
            }
            if (replaceAll.contains("<giveHBCardInfo>")) {
                replaceAll = replaceAll.replaceAll("(?s)<giveHBCardInfo[^>]*>.*?</giveHBCardInfo>", "");
            }
            if (this.f277525L1 && !replaceAll.contains("isInteractiveCanvas")) {
                replaceAll = replaceAll.replace("<adCanvasInfo>", "<adCanvasInfo><isInteractiveCanvas>1</isInteractiveCanvas>");
            }
            if (!e2Var.f279389d) {
                replaceAll = mo132528b9(replaceAll, ".adxml.canvasShareInfo");
            }
            String str5 = "null";
            if (e2Var.f279386a == null) {
                str2 = str5;
            } else {
                str2 = "" + e2Var.f279386a.length();
            }
            if (e2Var.f279387b != null) {
                str5 = "" + e2Var.f279387b.length();
            }
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "before transmitXml, landingPagesXml length is " + str2 + ", dynamicXml length is " + str5 + ", forwardXml length is " + replaceAll.length());
            SnsMethodCalculate.markEndTimeMs("genForwardXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return replaceAll;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.SnsAdNativeLandingPagesUI", th, "genForwardXml, error ", new Object[0]);
            String str6 = e2Var.f279386a;
            SnsMethodCalculate.markEndTimeMs("genForwardXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return str6;
        }
    }

    public int getForceOrientation() {
        SnsMethodCalculate.markStartTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return 1;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return C0966R.C0971layout.c1p;
    }

    /* renamed from: i8 */
    public final String mo132536i8() {
        SnsMethodCalculate.markStartTimeMs("genStatExtString", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        bb4 bb4 = new bb4();
        cb4 cb4 = new cb4();
        bb4.f226992d = cb4;
        C100903z zVar = this.f277551W;
        cb4.f298024f = zVar.f295483b;
        cb4.f298023e = zVar.f295482a;
        cb4.f298022d = this.f277542T;
        try {
            String encodeToString = Base64.encodeToString(bb4.toByteArray(), 2);
            SnsMethodCalculate.markEndTimeMs("genStatExtString", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return encodeToString;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("genStatExtString", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x04a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r32 = this;
            r0 = r32
            java.lang.String r1 = "initView"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            super.initView()
            r3 = 2131312632(0x7f093ff8, float:1.8243638E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0.f277565b1 = r3
            r3 = 2131300384(0x7f091020, float:1.8218796E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.f277570d1 = r3
            r3 = 2131316123(0x7f094d9b, float:1.8250719E38)
            android.view.View r3 = r0.findViewById(r3)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager r3 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager) r3
            r0.f277552W0 = r3
            r3 = 2131316292(0x7f094e44, float:1.8251061E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0.f277580g2 = r3
            r3 = 2131309125(0x7f093245, float:1.8236525E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.f277567c1 = r3
            java.lang.String r3 = "MicroMsg.SnsAdNativeLandingPagesUI"
            java.lang.String r4 = "before, assistActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            androidx.appcompat.app.AppCompatActivity r3 = r32.getContext()
            r4 = 0
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106205t(r3, r4)
            r5 = 1500(0x5dc, double:7.41E-321)
            if (r3 == 0) goto L_0x00b2
            int r3 = com.tencent.p014mm.p136ui.C85875k4.m106198o(r32)
            boolean r7 = r0.f277618u
            if (r7 == 0) goto L_0x006e
            r7 = 2131305824(0x7f092560, float:1.822983E38)
            android.view.View r7 = r0.findViewById(r7)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r8 = (android.widget.FrameLayout.LayoutParams) r8
            r8.topMargin = r3
            r7.setLayoutParams(r8)
            goto L_0x009f
        L_0x006e:
            android.widget.FrameLayout r7 = r0.f277565b1
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r7 = (android.widget.FrameLayout.LayoutParams) r7
            int r8 = r0.f277579g1
            int r8 = r8 - r3
            r7.height = r8
            r7.topMargin = r3
            android.widget.FrameLayout r8 = r0.f277565b1
            r8.setLayoutParams(r7)
            androidx.lifecycle.z<java.lang.Integer> r8 = r0.f277553W1
            int r7 = r7.height
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.setValue(r7)
            com.tencent.mm.ui.MMActivityController r7 = r32.getController()
            android.content.res.Resources r8 = r32.getResources()
            r9 = 2131099991(0x7f060157, float:1.781235E38)
            int r8 = r8.getColor(r9)
            r7.mo177081j0(r8)
        L_0x009f:
            android.widget.FrameLayout r7 = r0.f277565b1
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$j r8 = new com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$j
            r8.<init>(r3)
            r7.addOnLayoutChangeListener(r8)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$k r3 = new com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$k
            r3.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r3, r5)
            goto L_0x00ba
        L_0x00b2:
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$l r3 = new com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$l
            r3.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r3, r5)
        L_0x00ba:
            r3 = 2131305325(0x7f09236d, float:1.8228818E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f277606q = r3
            r3 = 2131296984(0x7f0902d8, float:1.82119E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f277581h = r3
            r3 = 2131313850(0x7f0944ba, float:1.8246108E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f277575f = r3
            r3 = 2131313865(0x7f0944c9, float:1.8246139E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.widget.ImageView r5 = r0.f277575f
            android.view.View$OnClickListener r6 = r0.f277504B2
            r5.setOnClickListener(r6)
            android.view.View$OnClickListener r5 = r0.f277507C2
            r3.setOnClickListener(r5)
            int r5 = r0.f277508D
            boolean r5 = mp2.C34628a.m40410c(r5)
            r6 = 1
            r7 = 8
            if (r5 == 0) goto L_0x0157
            r3.setVisibility(r4)
            android.widget.ImageView r5 = r0.f277575f
            r5.setVisibility(r7)
            r0.f277515G1 = r6
            r0.f277612s = r4
            java.lang.String r5 = r0.f277530O1
            java.lang.String r8 = "setBackViewText"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            java.lang.String r10 = mp2.C34628a.m40408a(r5)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "initBackLayout, extra="
            r11.append(r12)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            java.lang.String r11 = "LandingPageOpenSdkBackHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r10)
            if (r5 == 0) goto L_0x013b
            java.lang.String r3 = "appId is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            goto L_0x01bd
        L_0x013b:
            r5 = 2131836744(0x7f113f48, float:1.9306663E38)
            java.lang.String r5 = r0.getString(r5)
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            r11.<init>(r3)
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r3 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            cp2.a r12 = new cp2.a
            r12.<init>(r11, r5)
            r3.getOpenSdkAppInfo(r10, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            goto L_0x01bd
        L_0x0157:
            boolean r5 = r0.f277618u
            if (r5 == 0) goto L_0x01b5
            r3 = 2131305834(0x7f09256a, float:1.822985E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r5 = 2131230889(0x7f0800a9, float:1.8077844E38)
            r3.setImageResource(r5)
            r3.setVisibility(r4)
            android.view.View$OnClickListener r5 = r0.f277504B2
            r3.setOnClickListener(r5)
            android.view.View r3 = r0.f277567c1
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5.mo10233c(r8)
            java.lang.Object[] r9 = r5.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI"
            java.lang.String r11 = "initView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r3
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r9 = "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI"
            java.lang.String r10 = "initView"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01bd
        L_0x01b5:
            r3.setVisibility(r7)
            android.widget.ImageView r3 = r0.f277575f
            r3.setVisibility(r4)
        L_0x01bd:
            r3 = 2131313866(0x7f0944ca, float:1.824614E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f277578g = r3
            r3 = 2131313867(0x7f0944cb, float:1.8246143E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f277584i = r3
            boolean r3 = r0.f277618u
            if (r3 == 0) goto L_0x01d9
            r0.f277612s = r4
        L_0x01d9:
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r3 = r0.f277519I1
            r3.getClass()
            java.lang.String r5 = "initBeforeAnimation"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
            boolean r9 = r3.f274093d
            r10 = 200(0xc8, double:9.9E-322)
            r12 = 2
            java.lang.String r13 = "alpha"
            r14 = 0
            java.lang.Float r15 = java.lang.Float.valueOf(r14)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            if (r9 == 0) goto L_0x0292
            android.view.View r9 = r3.f274105p
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            r6.mo10233c(r7)
            java.lang.Object[] r17 = r6.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r19 = "initBeforeAnimation"
            java.lang.String r20 = "()Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r9
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r6 = r6.mo10231a(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r9.setVisibility(r6)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r18 = "initBeforeAnimation"
            java.lang.String r19 = "()Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            boolean r6 = r3.f274112w
            if (r6 != 0) goto L_0x0288
            android.view.View r6 = r3.f274106q
            float[] r7 = new float[r12]
            r7 = {0, 1045220557} // fill-array
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r13, r7)
            r6.setDuration(r10)
            r6.start()
            android.view.View r6 = r3.f274107r
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r15)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r19 = "initBeforeAnimation"
            java.lang.String r20 = "()Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r4 = r7.mo10231a(r4)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r6.setAlpha(r4)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r18 = "initBeforeAnimation"
            java.lang.String r19 = "()Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0288:
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r3 = r3.f274090a
            vr2.C102260r.m134870j(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            goto L_0x0498
        L_0x0292:
            boolean r6 = r3.f274100k
            if (r6 == 0) goto L_0x0331
            android.view.View r6 = r3.f274105p
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            r9.mo10233c(r7)
            java.lang.Object[] r17 = r9.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r19 = "initBeforeAnimation"
            java.lang.String r20 = "()Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r7 = r9.mo10231a(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r18 = "initBeforeAnimation"
            java.lang.String r19 = "()Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            boolean r6 = r3.f274112w
            if (r6 != 0) goto L_0x0327
            android.view.View r6 = r3.f274106q
            float[] r7 = new float[r12]
            r7 = {0, 1045220557} // fill-array
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r13, r7)
            r6.setDuration(r10)
            r6.start()
            android.view.View r6 = r3.f274107r
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r15)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r19 = "initBeforeAnimation"
            java.lang.String r20 = "()Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r4 = r7.mo10231a(r4)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r6.setAlpha(r4)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r18 = "initBeforeAnimation"
            java.lang.String r19 = "()Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0327:
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r3 = r3.f274090a
            vr2.C102260r.m134870j(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            goto L_0x0498
        L_0x0331:
            boolean r6 = r3.f274101l
            if (r6 == 0) goto L_0x03cc
            android.view.View r6 = r3.f274105p
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            r9.mo10233c(r7)
            java.lang.Object[] r17 = r9.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r19 = "initBeforeAnimation"
            java.lang.String r20 = "()Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r7 = r9.mo10231a(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r18 = "initBeforeAnimation"
            java.lang.String r19 = "()Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r6 = r3.f274106q
            float[] r7 = new float[r12]
            r7 = {0, 1045220557} // fill-array
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r13, r7)
            r6.setDuration(r10)
            r6.start()
            android.view.View r6 = r3.f274107r
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r15)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r19 = "initBeforeAnimation"
            java.lang.String r20 = "()Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r4 = r7.mo10231a(r4)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r6.setAlpha(r4)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r18 = "initBeforeAnimation"
            java.lang.String r19 = "()Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r3 = r3.f274090a
            vr2.C102260r.m134870j(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            goto L_0x0498
        L_0x03cc:
            boolean r6 = r3.f274103n
            if (r6 == 0) goto L_0x049a
            java.lang.String r6 = "AdLandingPageEggCardHelper"
            java.lang.String r9 = "initBeforeAnimation, longpressAnim"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            android.view.View r6 = r3.f274105p
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r9.mo10233c(r7)
            java.lang.Object[] r17 = r9.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r19 = "initBeforeAnimation"
            java.lang.String r20 = "()Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r9 = r9.mo10231a(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r6.setVisibility(r9)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r18 = "initBeforeAnimation"
            java.lang.String r19 = "()Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r6 = r3.f274106q
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r7)
            java.lang.Object[] r25 = r9.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r27 = "initBeforeAnimation"
            java.lang.String r28 = "()Z"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r6
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r7 = r9.mo10231a(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r25 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r26 = "initBeforeAnimation"
            java.lang.String r27 = "()Z"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r6 = r3.f274107r
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r15)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r19 = "initBeforeAnimation"
            java.lang.String r20 = "()Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r4 = r7.mo10231a(r4)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r6.setAlpha(r4)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper"
            java.lang.String r18 = "initBeforeAnimation"
            java.lang.String r19 = "()Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r3 = r3.f274090a
            vr2.C102260r.m134870j(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
        L_0x0498:
            r4 = 1
            goto L_0x049d
        L_0x049a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
        L_0x049d:
            if (r4 == 0) goto L_0x04a3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x04a3:
            boolean r3 = r0.f277612s
            if (r3 == 0) goto L_0x04b5
            android.widget.FrameLayout r3 = r0.f277565b1
            r3.setAlpha(r14)
            android.widget.ImageView r3 = r0.f277606q
            r3.setAlpha(r14)
            vr2.C102260r.m134870j(r32)
            goto L_0x04c1
        L_0x04b5:
            boolean r3 = r0.f277618u
            if (r3 == 0) goto L_0x04c1
            android.widget.ImageView r3 = r0.f277606q
            r3.setAlpha(r14)
            vr2.C102260r.m134870j(r32)
        L_0x04c1:
            android.widget.FrameLayout r3 = r0.f277565b1
            fp2.f r4 = fp2.C87070f.f252656a
            java.lang.String r4 = "debugContainer"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.String r6 = "SnsAdMB"
            if (r3 != 0) goto L_0x04da
            java.lang.String r3 = "the container is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r3)     // Catch:{ all -> 0x0519 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch:{ all -> 0x0519 }
            goto L_0x051c
        L_0x04da:
            fp2.f r7 = fp2.C87070f.f252656a     // Catch:{ all -> 0x0519 }
            boolean r7 = r7.mo121543a()     // Catch:{ all -> 0x0519 }
            if (r7 == 0) goto L_0x0519
            boolean r7 = fp2.C32156g.m39639a()     // Catch:{ all -> 0x0519 }
            if (r7 == 0) goto L_0x0519
            android.content.Context r7 = r3.getContext()     // Catch:{ all -> 0x0519 }
            if (r7 == 0) goto L_0x0519
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0519 }
            r7.<init>()     // Catch:{ all -> 0x0519 }
            java.lang.String r8 = "the container is "
            r7.append(r8)     // Catch:{ all -> 0x0519 }
            r7.append(r3)     // Catch:{ all -> 0x0519 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0519 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x0519 }
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<android.widget.FrameLayout>> r6 = fp2.C87070f.f252658c     // Catch:{ all -> 0x0519 }
            android.content.Context r7 = r3.getContext()     // Catch:{ all -> 0x0519 }
            int r7 = r7.hashCode()     // Catch:{ all -> 0x0519 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0519 }
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0519 }
            r8.<init>(r3)     // Catch:{ all -> 0x0519 }
            r6.put(r7, r8)     // Catch:{ all -> 0x0519 }
        L_0x0519:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x051c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.initView():void");
    }

    /* renamed from: j8 */
    public List<C95295z> mo132537j8() {
        SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        this.f277588j1 = new ArrayList();
        C102495c cVar = (C102495c) this.f277552W0.getAdapter();
        if (cVar != null) {
            SnsMethodCalculate.markStartTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
            List<Fragment> list = cVar.f301794i;
            SnsMethodCalculate.markEndTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
            Iterator<Fragment> it = list.iterator();
            while (it.hasNext()) {
                ((ArrayList) this.f277588j1).addAll(((ContentFragment) it.next()).mo131807R());
            }
        }
        C100894u.m132225e(this.f277588j1);
        List<C95295z> list2 = this.f277588j1;
        SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return list2;
    }

    /* renamed from: k8 */
    public final List<C100882l> mo132538k8() {
        SnsMethodCalculate.markStartTimeMs("getAllShowPageInfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        ArrayList arrayList = new ArrayList();
        Iterator<C100882l> it = this.f277569d.iterator();
        while (it.hasNext()) {
            C100882l next = it.next();
            if (next.f295431f) {
                arrayList.add(next);
            }
        }
        SnsMethodCalculate.markStartTimeMs("preProcessAllComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Iterator<C101255a0> it5 = ((C100882l) it4.next()).f295429d.iterator();
                while (it5.hasNext()) {
                    C101255a0 next2 = it5.next();
                    if (next2 instanceof C101256b) {
                        ((C101256b) next2).f296543v0 = i;
                        i++;
                    }
                    if (next2 instanceof C101287r) {
                        String str = ((C101287r) next2).f296689A;
                        if (!TextUtils.isEmpty(str)) {
                            ((HashSet) this.f277622v1).add(str);
                        }
                    }
                    if (next2 instanceof C101285q) {
                        String str2 = ((C101285q) next2).f296683z;
                        if (!TextUtils.isEmpty(str2)) {
                            ((HashSet) this.f277622v1).add(str2);
                        }
                    }
                    try {
                        if (next2 instanceof C101679m) {
                            Iterator it6 = ((ArrayList) ((C101679m) next2).mo141128c()).iterator();
                            while (it6.hasNext()) {
                                C101679m.C101680a aVar = (C101679m.C101680a) it6.next();
                                aVar.getClass();
                                SnsMethodCalculate.markStartTimeMs("getBtnCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                                C101255a0 a0Var = aVar.f297667h;
                                SnsMethodCalculate.markEndTimeMs("getBtnCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                                if (a0Var instanceof C101287r) {
                                    String str3 = ((C101287r) a0Var).f296689A;
                                    if (!TextUtils.isEmpty(str3)) {
                                        ((HashSet) this.f277622v1).add(str3);
                                        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "preload halfEggCard H5Btn");
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "preload halfEggCard H5Btn exp=" + th.toString());
                    }
                    if (!f277498D2.contains(next2)) {
                        f277498D2.add(next2);
                        C99544i0.m129920g(this.f277520J, this.f277508D, next2);
                    }
                    if (!this.f277620u2) {
                        C99520a0.m129873c(next2, arrayList2);
                    }
                }
            }
            if (!this.f277620u2) {
                this.f277620u2 = true;
                if (!arrayList2.isEmpty()) {
                    boolean z = this.f277521J1;
                    HashSet<String> hashSet = C99520a0.f291755a;
                    SnsMethodCalculate.markStartTimeMs("checkPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                    ((C119157j) C119157j.f356862d).mo183875f(new C99577z(arrayList2, z));
                    SnsMethodCalculate.markEndTimeMs("checkPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                }
            }
            if (!C101425k.m133097a(this.f277622v1)) {
                String[] d = C46734a.m52031d(this.f277622v1, this.f277628x0, this.f277603p0, this.f277536R, this.f277533Q);
                if (!C101425k.m133099c(d)) {
                    AdLandingPagesProxy.getInstance().prefetchH5Url(TextUtils.isEmpty(this.f277520J) ? this.f277522K : this.f277520J, d);
                }
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "giveIdxForApkBtnInfo, exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("preProcessAllComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        SnsMethodCalculate.markEndTimeMs("getAllShowPageInfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return arrayList;
    }

    /* renamed from: l8 */
    public final C95287y1 mo132539l8() {
        SnsMethodCalculate.markStartTimeMs("getCurPageSphereImageComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        for (C95295z next : mo132540m8().mo131807R()) {
            if (next instanceof C95287y1) {
                C95287y1 y1Var = (C95287y1) next;
                SnsMethodCalculate.markEndTimeMs("getCurPageSphereImageComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return y1Var;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getCurPageSphereImageComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return null;
    }

    /* renamed from: m8 */
    public ContentFragment mo132540m8() {
        ContentFragment contentFragment;
        SnsMethodCalculate.markStartTimeMs("getCurrentPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (this.f277569d.size() > 0) {
            contentFragment = (ContentFragment) ((HashMap) this.f277617t2).get(Integer.valueOf(this.f277569d.get(this.f277552W0.getCurrentItem()).f295432g));
        } else {
            contentFragment = null;
        }
        SnsMethodCalculate.markEndTimeMs("getCurrentPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return contentFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x018b  */
    /* renamed from: n8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qs2.C101271i0 mo132541n8() {
        /*
            r9 = this;
            java.lang.String r0 = "getLandingPageData"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            qs2.i0 r2 = r9.f277600o1
            if (r2 != 0) goto L_0x0012
            qs2.i0 r2 = new qs2.i0
            r2.<init>()
            r9.f277600o1 = r2
        L_0x0012:
            qs2.i0 r2 = r9.f277600o1
            int r3 = r9.f277510E
            if (r3 != 0) goto L_0x001a
            int r3 = r9.f277508D
        L_0x001a:
            r2.getClass()
            java.lang.String r4 = "setOriginScene"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296616a = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            int r3 = r9.f277508D
            r2.getClass()
            java.lang.String r4 = "setSource"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296617b = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            boolean r3 = r9.f277524L
            r2.getClass()
            java.lang.String r4 = "setNativeAd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296618c = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            java.lang.String r3 = r9.f277533Q
            r2.getClass()
            java.lang.String r4 = "setUxInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296619d = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            java.lang.String r3 = r9.f277536R
            r2.getClass()
            java.lang.String r4 = "setUpdatedUxInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296620e = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            java.lang.String r3 = r9.f277539S
            r2.getClass()
            java.lang.String r4 = "setUin"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296621f = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            int r3 = r9.f277537R0
            r2.getClass()
            java.lang.String r4 = "setBizId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296622g = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            java.lang.String r3 = r9.f277603p0
            r2.getClass()
            java.lang.String r4 = "setAid"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296623h = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            java.lang.String r3 = r9.f277628x0
            r2.getClass()
            java.lang.String r4 = "setTraceId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296624i = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            java.util.Map<java.lang.String, java.lang.String> r3 = r9.f277548V
            r2.getClass()
            java.lang.String r4 = "setMappedCanvasCardExt"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f296636u
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.putAll(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            ps2.z r3 = r9.f277551W
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x00dc
            java.lang.String r3 = r3.f295499r
            goto L_0x00dd
        L_0x00dc:
            r3 = r4
        L_0x00dd:
            r2.getClass()
            java.lang.String r6 = "setCanvasId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            r2.f296625j = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            qs2.i0 r2 = r9.f277600o1
            qs2.e0 r3 = r9.f277572e
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x00f5
            r3 = 1
            goto L_0x00f6
        L_0x00f5:
            r3 = 0
        L_0x00f6:
            r2.getClass()
            java.lang.String r8 = "setHasFloatBar"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
            r2.f296626k = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
            qs2.i0 r2 = r9.f277600o1
            java.lang.String r3 = r9.f277530O1
            r2.getClass()
            java.lang.String r8 = "setOutExtraParam"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
            r2.f296633r = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
            qs2.i0 r2 = r9.f277600o1
            java.lang.String r3 = r9.f277538R1
            r2.getClass()
            java.lang.String r8 = "setPageId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
            r2.f296635t = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
            qs2.i0 r2 = r9.f277600o1
            boolean r3 = r9.f277618u
            r2.getClass()
            java.lang.String r8 = "setIsHalfScreenMode"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
            r2.f296637v = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
            qs2.i0 r2 = r9.f277600o1
            boolean r3 = r9.f277621v
            r2.getClass()
            java.lang.String r8 = "setIsOpenFromHalfScreenMode"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
            r2.f296638w = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
            qs2.i0 r2 = r9.f277600o1     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = r9.f277520J     // Catch:{ all -> 0x0170 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x0170 }
            if (r3 == 0) goto L_0x0165
            ps2.z r3 = r9.f277551W     // Catch:{ all -> 0x0170 }
            if (r3 == 0) goto L_0x016c
            java.lang.String r3 = r3.f295482a     // Catch:{ all -> 0x0170 }
            long r3 = vr2.C102260r.m134863c0(r3)     // Catch:{ all -> 0x0170 }
        L_0x0160:
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0170 }
            goto L_0x016c
        L_0x0165:
            java.lang.String r3 = r9.f277520J     // Catch:{ all -> 0x0170 }
            long r3 = vr2.C102260r.m134863c0(r3)     // Catch:{ all -> 0x0170 }
            goto L_0x0160
        L_0x016c:
            r2.mo140748o(r4)     // Catch:{ all -> 0x0170 }
            goto L_0x017a
        L_0x0170:
            r2 = move-exception
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x017a:
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = r9.f277625w1
            r2[r7] = r3
            java.lang.String r3 = r9.f277629x1
            r2[r6] = r3
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r2)
            if (r2 != 0) goto L_0x01af
            qs2.i0 r2 = r9.f277600o1
            java.lang.String r3 = r9.f277625w1
            r2.getClass()
            java.lang.String r4 = "setViewId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296629n = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            java.lang.String r3 = r9.f277629x1
            r2.getClass()
            java.lang.String r4 = "setCommInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296630o = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x01af:
            qs2.i0 r2 = r9.f277600o1
            java.lang.String r3 = r9.f277509D1
            r2.getClass()
            java.lang.String r4 = "setAdExtInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296631p = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            long r3 = r9.f277523K1
            r2.getClass()
            java.lang.String r6 = "setAdSightVideoSeekTime"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            r2.f296632q = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            qs2.i0 r2 = r9.f277600o1
            java.lang.String r3 = r9.f277535Q1
            r2.getClass()
            java.lang.String r4 = "setpId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f296634s = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            qs2.i0 r2 = r9.f277600o1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.mo132541n8():qs2.i0");
    }

    /* renamed from: o8 */
    public final C95426b0 mo132542o8() {
        int adVoteIndex;
        SnsMethodCalculate.markStartTimeMs("getOptionalShareContent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        ADXml aDXml = new ADXml(this.f277627x);
        if (!aDXml.hasVoteInfo() || (adVoteIndex = AdLandingPagesProxy.getInstance().getAdVoteIndex(aDXml.adVoteInfo.f275731a, this.f277533Q, this.f277539S)) <= 0 || adVoteIndex > aDXml.adVoteInfo.f275733c.size()) {
            SnsMethodCalculate.markEndTimeMs("getOptionalShareContent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return null;
        }
        ADXml.C95026m mVar = aDXml.adVoteInfo.f275733c.get(adVoteIndex - 1);
        C95426b0 b0Var = new C95426b0(this, (C95431i) null);
        if (!Util.isNullOrNil(mVar.f275735b)) {
            b0Var.f277642a = mVar.f275735b;
        } else {
            b0Var.f277642a = this.f277514G;
        }
        if (!Util.isNullOrNil(mVar.f275736c)) {
            b0Var.f277643b = mVar.f275736c;
        } else {
            b0Var.f277643b = this.f277516H;
        }
        if (!Util.isNullOrNil(mVar.f275737d)) {
            b0Var.f277644c = mVar.f275737d;
        } else {
            b0Var.f277644c = this.f277512F;
        }
        SnsMethodCalculate.markEndTimeMs("getOptionalShareContent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return b0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0166, code lost:
        r9 = r4.getIntExtra("KComponentVideoType", 0);
        r14 = r4.getIntExtra("KComponentCurrentTime", 0);
        r15 = r4.getBooleanExtra("KComponentVoiceType", false);
        r12 = r4.getBooleanExtra("KComponentProgressType", false);
        r13 = r4.getIntExtra("KComponentClickPlayControlCount", 0);
        r10 = r4.getIntExtra("KComponentDoubleClickCount", 0);
        r2 = r4.getIntExtra("KComponentClickVoiceControlCount", 0);
        r3 = r4.getIntExtra("KComponentPlayCompletedCount", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0196, code lost:
        r29 = "onActivityResult";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a0, code lost:
        r30 = r5;
        r21 = r4.getIntExtra("KComponentPlayCount", 0);
        r31 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r7 = r4.getLongExtra("KComponentPlayTimeInterval", 0);
        r24 = r4.getBooleanExtra("KComponentIsWaiting", false);
        r25 = r4.getIntExtra("KComponentSeekTimeDueWaiting", 0);
        r5 = r4.getStringExtra("KComponentFullVideoFloatBarReportInfo");
        r6 = r4.getLongExtra("KComponentFullScreenStayTime", 0);
        r8 = r5;
        r1.f277528N += r6;
        r4 = new java.lang.StringBuilder();
        r4.append("videoType = ");
        r4.append(r9);
        r4.append(", cid = ");
        r4.append(r0);
        r4.append(", currPosSec = ");
        r4.append(r14);
        r4.append(", bNoVoice = ");
        r4.append(r15);
        r4.append(", isPlaying = ");
        r4.append(r12);
        r4.append(", clickPlayControlCount = ");
        r4.append(r13);
        r4.append(", doubleClickCount = ");
        r4.append(r10);
        r4.append(", clickVoiceControlCount = ");
        r4.append(r2);
        r4.append(", playCompletedCount = ");
        r4.append(r3);
        r4.append(", playCount = ");
        r0 = r21;
        r4.append(r0);
        r4.append(", playTimeInterval = ");
        r21 = r0;
        r0 = r7;
        r4.append(r0);
        r4.append(", floatBarReportInfo = ");
        r4.append(r8);
        r4.append(", fullScreenStayTime = ");
        r4.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0247, code lost:
        r5 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x024c, code lost:
        if (r9 != 0) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x024e, code lost:
        ((com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95222u1) r11).mo131733o0(r14, r15, r12, r13, r10, r2, r3, r21, r0, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0266, code lost:
        r17 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0269, code lost:
        if (r9 != 1) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x026b, code lost:
        ((com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95050a2) r11).mo131551e0(r14, r15, r12, r17, r10, r2, r3, r21, r0, r24, r25, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0280, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0282, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0283, code lost:
        r5 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0286, code lost:
        r0 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r33, int r34, android.content.Intent r35) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            java.lang.String r5 = "VideoFullScreenActivity"
            java.lang.String r6 = "onActivityResult"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r2 != r0) goto L_0x0083
            r0 = -1
            if (r3 != r0) goto L_0x007d
            java.lang.String r0 = "MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot"
            java.lang.String r5 = "share to timeLine success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            java.lang.String r0 = r1.f277533Q
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            ps2.z r5 = r1.f277551W
            java.lang.String r5 = r5.f295499r
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            java.lang.String r8 = "AntiCheatingReportUtils"
            java.lang.String r9 = "doShareReportToTimeLine"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.adutils.AntiCheatingReportUtils"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            r11 = 3
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0060 }
            java.lang.String r12 = ""
            java.lang.String r0 = ir2.C98784a.m128575b(r11, r12, r0, r5)     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r5.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r11 = "reportScreenShotParams = "
            r5.append(r11)     // Catch:{ all -> 0x0060 }
            r5.append(r0)     // Catch:{ all -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0060 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)     // Catch:{ all -> 0x0060 }
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0060 }
            r11 = 19214(0x4b0e, float:2.6925E-41)
            r5.kvStat(r11, r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0068
        L_0x0060:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x0068:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            androidx.appcompat.app.AppCompatActivity r0 = r32.getContext()
            androidx.appcompat.app.AppCompatActivity r5 = r32.getContext()
            r8 = 2131821690(0x7f11047a, float:1.927613E38)
            java.lang.String r5 = r5.getString(r8)
            nj3.C76879j.m92726T(r0, r5)
        L_0x007d:
            r29 = r6
            r31 = r7
            goto L_0x02a0
        L_0x0083:
            r0 = 202(0xca, float:2.83E-43)
            if (r2 != r0) goto L_0x00aa
            java.lang.Class<e00.i0> r0 = e00.C45513i0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            e00.i0 r0 = (e00.C45513i0) r0
            boolean r0 = r0.mo70782e0(r1, r2, r3, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "handleOpenInBrowserResult, ret="
            r5.append(r8)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "MicroMsg.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x007d
        L_0x00aa:
            r0 = 2002(0x7d2, float:2.805E-42)
            r8 = 0
            if (r2 != r0) goto L_0x00d0
            java.lang.String r0 = "kfavorite"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.getBooleanExtra(r4, r0, r8)
            if (r0 == 0) goto L_0x007d
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r0 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            r5 = 42
            int r0 = r0.doFav(r4, r5)
            java.lang.Class<pb1.t0> r8 = pb1.C47453t0.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            pb1.t0 r8 = (pb1.C47453t0) r8
            com.tencent.mm.ui.widget.snackbar.a$d r9 = r1.f277623v2
            r8.mo72473I2(r0, r5, r1, r9)
            goto L_0x007d
        L_0x00d0:
            r0 = 2004(0x7d4, float:2.808E-42)
            java.lang.String r9 = "KComponentCid"
            if (r2 != r0) goto L_0x0127
            java.lang.String r0 = r4.getStringExtra(r9)     // Catch:{ Exception -> 0x007d }
            java.util.List r5 = r32.mo132537j8()     // Catch:{ Exception -> 0x007d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x007d }
        L_0x00e2:
            boolean r9 = r5.hasNext()     // Catch:{ Exception -> 0x007d }
            if (r9 == 0) goto L_0x007d
            java.lang.Object r9 = r5.next()     // Catch:{ Exception -> 0x007d }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r9 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z) r9     // Catch:{ Exception -> 0x007d }
            java.lang.String r10 = r9.mo131857r()     // Catch:{ Exception -> 0x007d }
            boolean r10 = r10.equals(r0)     // Catch:{ Exception -> 0x007d }
            if (r10 == 0) goto L_0x00e2
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1 r9 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95222u1) r9     // Catch:{ Exception -> 0x007d }
            java.lang.String r0 = "KStreamVideoPlayCount"
            int r0 = r4.getIntExtra(r0, r8)     // Catch:{ Exception -> 0x007d }
            java.lang.String r5 = "KStreamVideoPlayCompleteCount"
            int r5 = r4.getIntExtra(r5, r8)     // Catch:{ Exception -> 0x007d }
            java.lang.String r10 = "KStreamVideoTotalPlayTimeInMs"
            int r8 = r4.getIntExtra(r10, r8)     // Catch:{ Exception -> 0x007d }
            java.lang.String r10 = "increaseStreamVideoPlayStatistics"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)     // Catch:{ Exception -> 0x007d }
            int r12 = r9.f276327I     // Catch:{ Exception -> 0x007d }
            int r12 = r12 + r0
            r9.f276327I = r12     // Catch:{ Exception -> 0x007d }
            int r0 = r9.f276328J     // Catch:{ Exception -> 0x007d }
            int r0 = r0 + r5
            r9.f276328J = r0     // Catch:{ Exception -> 0x007d }
            int r0 = r9.f276329K     // Catch:{ Exception -> 0x007d }
            int r0 = r0 + r8
            r9.f276329K = r0     // Catch:{ Exception -> 0x007d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)     // Catch:{ Exception -> 0x007d }
            goto L_0x007d
        L_0x0127:
            r0 = 2003(0x7d3, float:2.807E-42)
            r10 = 1
            if (r2 != r0) goto L_0x0140
            com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent r0 = new com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent
            r0.<init>()
            com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent$a r5 = r0.f107758d
            r5.f107759a = r10
            r5.f107760b = r2
            r5.f107761c = r3
            r5.f107762d = r4
            r0.publish()
            goto L_0x007d
        L_0x0140:
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 != r0) goto L_0x007d
            java.lang.String r0 = r4.getStringExtra(r9)     // Catch:{ all -> 0x0294 }
            java.util.List r9 = r32.mo132537j8()     // Catch:{ all -> 0x0294 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0294 }
        L_0x0150:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0294 }
            if (r11 == 0) goto L_0x007d
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0294 }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r11 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z) r11     // Catch:{ all -> 0x0294 }
            java.lang.String r12 = r11.mo131857r()     // Catch:{ all -> 0x0294 }
            boolean r12 = r12.equals(r0)     // Catch:{ all -> 0x0294 }
            if (r12 == 0) goto L_0x0288
            java.lang.String r9 = "KComponentVideoType"
            int r9 = r4.getIntExtra(r9, r8)     // Catch:{ all -> 0x0294 }
            java.lang.String r12 = "KComponentCurrentTime"
            int r14 = r4.getIntExtra(r12, r8)     // Catch:{ all -> 0x0294 }
            java.lang.String r12 = "KComponentVoiceType"
            boolean r15 = r4.getBooleanExtra(r12, r8)     // Catch:{ all -> 0x0294 }
            java.lang.String r12 = "KComponentProgressType"
            boolean r12 = r4.getBooleanExtra(r12, r8)     // Catch:{ all -> 0x0294 }
            java.lang.String r13 = "KComponentClickPlayControlCount"
            int r13 = r4.getIntExtra(r13, r8)     // Catch:{ all -> 0x0294 }
            java.lang.String r10 = "KComponentDoubleClickCount"
            int r10 = r4.getIntExtra(r10, r8)     // Catch:{ all -> 0x0294 }
            java.lang.String r2 = "KComponentClickVoiceControlCount"
            int r2 = r4.getIntExtra(r2, r8)     // Catch:{ all -> 0x0294 }
            java.lang.String r3 = "KComponentPlayCompletedCount"
            int r3 = r4.getIntExtra(r3, r8)     // Catch:{ all -> 0x0294 }
            r29 = r6
            java.lang.String r6 = "KComponentPlayCount"
            int r6 = r4.getIntExtra(r6, r8)     // Catch:{ all -> 0x0286 }
            java.lang.String r8 = "KComponentPlayTimeInterval"
            r30 = r5
            r21 = r6
            r5 = 0
            r31 = r7
            long r7 = r4.getLongExtra(r8, r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "KComponentIsWaiting"
            r6 = 0
            boolean r24 = r4.getBooleanExtra(r5, r6)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "KComponentSeekTimeDueWaiting"
            int r25 = r4.getIntExtra(r5, r6)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "KComponentFullVideoFloatBarReportInfo"
            java.lang.String r5 = r4.getStringExtra(r5)     // Catch:{ all -> 0x0282 }
            java.lang.String r6 = "KComponentFullScreenStayTime"
            r22 = r7
            r7 = 0
            long r6 = r4.getLongExtra(r6, r7)     // Catch:{ all -> 0x0282 }
            r8 = r5
            long r4 = r1.f277528N     // Catch:{ all -> 0x0282 }
            long r4 = r4 + r6
            r1.f277528N = r4     // Catch:{ all -> 0x0282 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0282 }
            r4.<init>()     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = "videoType = "
            r4.append(r5)     // Catch:{ all -> 0x0282 }
            r4.append(r9)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = ", cid = "
            r4.append(r5)     // Catch:{ all -> 0x0282 }
            r4.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ", currPosSec = "
            r4.append(r0)     // Catch:{ all -> 0x0282 }
            r4.append(r14)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ", bNoVoice = "
            r4.append(r0)     // Catch:{ all -> 0x0282 }
            r4.append(r15)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ", isPlaying = "
            r4.append(r0)     // Catch:{ all -> 0x0282 }
            r4.append(r12)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ", clickPlayControlCount = "
            r4.append(r0)     // Catch:{ all -> 0x0282 }
            r4.append(r13)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ", doubleClickCount = "
            r4.append(r0)     // Catch:{ all -> 0x0282 }
            r4.append(r10)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ", clickVoiceControlCount = "
            r4.append(r0)     // Catch:{ all -> 0x0282 }
            r4.append(r2)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ", playCompletedCount = "
            r4.append(r0)     // Catch:{ all -> 0x0282 }
            r4.append(r3)     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = ", playCount = "
            r4.append(r0)     // Catch:{ all -> 0x0282 }
            r0 = r21
            r4.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = ", playTimeInterval = "
            r4.append(r5)     // Catch:{ all -> 0x0282 }
            r21 = r0
            r0 = r22
            r4.append(r0)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = ", floatBarReportInfo = "
            r4.append(r5)     // Catch:{ all -> 0x0282 }
            r4.append(r8)     // Catch:{ all -> 0x0282 }
            java.lang.String r5 = ", fullScreenStayTime = "
            r4.append(r5)     // Catch:{ all -> 0x0282 }
            r4.append(r6)     // Catch:{ all -> 0x0282 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0282 }
            r5 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)     // Catch:{ all -> 0x0280 }
            if (r9 != 0) goto L_0x0266
            r4 = r11
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u1 r4 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95222u1) r4     // Catch:{ all -> 0x0280 }
            r17 = r13
            r13 = r4
            r16 = r12
            r18 = r10
            r19 = r2
            r20 = r3
            r22 = r0
            r24 = r8
            r25 = r6
            r13.mo131733o0(r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25)     // Catch:{ all -> 0x0280 }
            goto L_0x02a0
        L_0x0266:
            r17 = r13
            r4 = 1
            if (r9 != r4) goto L_0x02a0
            r13 = r11
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 r13 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95050a2) r13     // Catch:{ all -> 0x0280 }
            r16 = r12
            r18 = r10
            r19 = r2
            r20 = r3
            r22 = r0
            r26 = r8
            r27 = r6
            r13.mo131551e0(r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0280 }
            goto L_0x02a0
        L_0x0280:
            r0 = move-exception
            goto L_0x0299
        L_0x0282:
            r0 = move-exception
            r5 = r30
            goto L_0x0299
        L_0x0286:
            r0 = move-exception
            goto L_0x0297
        L_0x0288:
            r29 = r6
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            goto L_0x0150
        L_0x0294:
            r0 = move-exception
            r29 = r6
        L_0x0297:
            r31 = r7
        L_0x0299:
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x02a0:
            super.onActivityResult(r33, r34, r35)
            r2 = r29
            r1 = r31
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onAttachedToWindow();
        mo132534f8();
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void onBackPressed() {
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (!this.f277618u || !((C60194q2) C86312j.m106911c(C60194q2.class)).mo75417Ua(this)) {
            C47517e eVar = this.f277541S1;
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("isShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            View view = eVar.f127488b;
            boolean z = view != null && view.getVisibility() == 0;
            SnsMethodCalculate.markEndTimeMs("isShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            if (z) {
                C47517e eVar2 = this.f277541S1;
                eVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                ((C119157j) C119157j.f356862d).mo183895z(new C47516d(eVar2));
                SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            } else if (this.f277529N1) {
                mo132533e8();
                SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            } else {
                mo132509R8();
                if (C34628a.m40410c(this.f277508D)) {
                    C115669n.INSTANCE.mo175911u(1667, 14);
                    mo132522Y7();
                }
                SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            }
        } else {
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "onBackPressed, checkHideH5Dialog true");
            SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x0747  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0876  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x087e  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x088e  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x08e4  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0937  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0942  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0b33  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0ba0  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0bf8  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0c00  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0c07  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0c12  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0c83  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0cac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.String r2 = "onCreate"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            super.onCreate(r24)
            java.lang.String r4 = "SnsMMKV"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r4)
            java.lang.String r5 = "SnsMMKVSnsUI"
            r6 = 1
            r4.encode((java.lang.String) r5, (boolean) r6)
            android.content.Intent r4 = r23.getIntent()
            java.lang.String r5 = "sns_landig_pages_from_source"
            r7 = 0
            int r4 = r4.getIntExtra(r5, r7)
            r1.f277508D = r4
            android.content.Intent r4 = r23.getIntent()
            java.lang.String r5 = "sns_landig_pages_origin_from_source"
            int r4 = r4.getIntExtra(r5, r7)
            r1.f277510E = r4
            wo2.d$b r4 = r1.f277532P1
            if (r0 == 0) goto L_0x003c
            r5 = 1
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            int r8 = r1.f277508D
            r4.getClass()
            java.lang.String r9 = "onCreateStart"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            r4.f301746l = r5
            long r11 = java.lang.System.currentTimeMillis()
            r4.f301736b = r11
            java.lang.String r5 = "source"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r10)
            r4.f301744j = r8
            int r11 = wo2.C102466d.f301721a
            java.lang.String r11 = "access$000"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            java.lang.String r13 = "getSourceForReport"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)
            r15 = 2
            r7 = 3
            r14 = 5
            if (r8 == r6) goto L_0x00d0
            if (r8 == r15) goto L_0x00ca
            if (r8 == r7) goto L_0x00c4
            r7 = 4
            if (r8 == r7) goto L_0x00ca
            if (r8 == r14) goto L_0x00bf
            r7 = 13
            if (r8 == r7) goto L_0x00b9
            r7 = 16
            if (r8 == r7) goto L_0x00b3
            r7 = 24
            if (r8 == r7) goto L_0x00ad
            r7 = 33
            if (r8 == r7) goto L_0x00a7
            switch(r8) {
                case 27: goto L_0x00b9;
                case 28: goto L_0x00a1;
                case 29: goto L_0x009b;
                case 30: goto L_0x0095;
                case 31: goto L_0x008f;
                default: goto L_0x0089;
            }
        L_0x0089:
            r7 = 14
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x00d4
        L_0x008f:
            r7 = 20
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x00d4
        L_0x0095:
            r7 = 18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x00d4
        L_0x009b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            r7 = 13
            goto L_0x00d4
        L_0x00a1:
            r7 = 11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x00d4
        L_0x00a7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            r7 = 16
            goto L_0x00d4
        L_0x00ad:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            r7 = 17
            goto L_0x00d4
        L_0x00b3:
            r7 = 9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x00d4
        L_0x00b9:
            r7 = 12
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x00d4
        L_0x00bf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            r7 = 7
            goto L_0x00d4
        L_0x00c4:
            r7 = 8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x00d4
        L_0x00ca:
            r7 = 10
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L_0x00d4
        L_0x00d0:
            r7 = 6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
        L_0x00d4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            long r7 = (long) r7
            r11 = 1673(0x689, double:8.266E-321)
            wo2.C102466d.m135251a(r11, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r10)
            boolean r5 = r4.f301746l
            int r4 = r4.f301744j
            java.lang.String r7 = "reportOnCreateIdkey"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r10)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r13 = "reportOnCreateIdkey, isRestart="
            r8.append(r13)
            r8.append(r5)
            java.lang.String r13 = ", source="
            r8.append(r13)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            java.lang.String r14 = "AdLandingPageStaticHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r8)
            r14 = r7
            r6 = 21
            wo2.C102466d.m135251a(r11, r6)
            if (r5 == 0) goto L_0x011f
            r5 = 24
            wo2.C102466d.m135251a(r11, r5)
            r5 = 29
            if (r4 != r5) goto L_0x011f
            r4 = 27
            wo2.C102466d.m135251a(r11, r4)
        L_0x011f:
            r4 = r14
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onCreate, source="
            r4.append(r5)
            int r5 = r1.f277508D
            r4.append(r5)
            java.lang.String r5 = ", originScene="
            r4.append(r5)
            int r5 = r1.f277510E
            r4.append(r5)
            java.lang.String r5 = ", savedInstanceState="
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ", hash="
            r4.append(r5)
            int r5 = r23.hashCode()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r4 = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper
            r4.<init>(r1)
            r1.f277519I1 = r4
            po2.e r4 = new po2.e
            r4.<init>(r1)
            r1.f277541S1 = r4
            r23.mo132504M8()
            long r6 = java.lang.System.currentTimeMillis()
            r1.f277526M = r6
            long r6 = java.lang.System.currentTimeMillis()
            r1.f277531P = r6
            ps2.z r4 = r1.f277551W
            r4.f295500s = r6
            android.content.Intent r4 = r23.getIntent()
            java.lang.String r6 = "sns_landing_page_half_screen_mode"
            r7 = 0
            boolean r4 = r4.getBooleanExtra(r6, r7)
            r1.f277618u = r4
            if (r4 != 0) goto L_0x01bd
            boolean r4 = vr2.C102260r.m134844M()
            if (r4 == 0) goto L_0x01bd
            bp3.p r4 = bp3.C79758p.f233760a
            lf3.a r6 = new lf3.a
            r6.<init>()
            int r4 = r4.mo109883f(r6)
            r6 = 1
            if (r4 != r6) goto L_0x01a4
            r4 = 1
            goto L_0x01a5
        L_0x01a4:
            r4 = 0
        L_0x01a5:
            r1.f277618u = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "debugEnv, mIsHalfScreenMode="
            r4.append(r6)
            boolean r6 = r1.f277618u
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
        L_0x01bd:
            android.content.Intent r4 = r23.getIntent()
            java.lang.String r6 = "sns_landing_page_open_from_half_screen_mode"
            r7 = 0
            boolean r4 = r4.getBooleanExtra(r6, r7)
            r1.f277621v = r4
            boolean r4 = r1.f277618u
            if (r4 == 0) goto L_0x01d8
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1673(0x689, float:2.344E-42)
            r7 = 19
            r4.mo175911u(r6, r7)
        L_0x01d8:
            r23.mo132510S8()
            int[] r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2.m121130b(r23)
            r6 = 0
            r7 = r4[r6]
            r1.f277576f1 = r7
            r7 = 1
            r4 = r4[r7]
            r1.f277579g1 = r4
            r1.f277609r = r0
            com.tencent.mm.ui.MMActivityController r0 = r1.mController
            r0.mo177043E()
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r4 = "img_gallery_top"
            int r0 = r0.getIntExtra(r4, r6)
            r1.f277587j = r0
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106205t(r1, r6)
            if (r0 == 0) goto L_0x0229
            int r0 = com.tencent.p014mm.p136ui.C85875k4.m106198o(r23)
            int r4 = r1.f277587j
            int r4 = r4 - r0
            r1.f277587j = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "hasCutOut, h="
            r4.append(r6)
            r4.append(r0)
            java.lang.String r0 = ", thumbTop="
            r4.append(r0)
            int r0 = r1.f277587j
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x0229:
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r4 = "img_gallery_left"
            r6 = 0
            int r0 = r0.getIntExtra(r4, r6)
            r1.f277596n = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r4 = "img_gallery_width"
            int r0 = r0.getIntExtra(r4, r6)
            r1.f277599o = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r4 = "img_gallery_height"
            int r0 = r0.getIntExtra(r4, r6)
            r1.f277602p = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r4 = "sns_landing_page_start_time"
            r6 = 0
            long r11 = r0.getLongExtra(r4, r6)
            android.content.Intent r0 = r23.getIntent()
            r0.putExtra(r4, r6)
            wo2.d$b r0 = r1.f277532P1
            r0.getClass()
            java.lang.String r4 = "start"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r10)
            r0.f301735a = r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r10)
            android.view.Window r0 = r23.getWindow()
            r4 = 128(0x80, float:1.794E-43)
            r0.addFlags(r4)
            java.lang.String r0 = "resetExposureParam"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            r4 = 0
            r1.f277633y1 = r4
            r1.f277636z1 = r4
            r1.f277500A1 = r4
            r1.f277503B1 = r4
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r1.f277506C1
            if (r4 == 0) goto L_0x0293
            java.lang.Runnable r9 = r1.f277608q2
            r4.removeCallbacks(r9)
        L_0x0293:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            java.lang.String r4 = "initParams"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r9 = "sns_landing_pages_xml"
            java.lang.String r0 = r0.getStringExtra(r9)
            r1.f277627x = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r9 = "sns_landing_pages_extra_param"
            java.lang.String r0 = r0.getStringExtra(r9)
            r1.f277530O1 = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r9 = "sns_landing_pages_too_large_xml_path"
            java.lang.String r0 = r0.getStringExtra(r9)
            java.lang.String r9 = r1.f277627x
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            java.lang.String r11 = ""
            if (r9 == 0) goto L_0x030a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 != 0) goto L_0x030a
            java.lang.String r9 = "readTempCanvasXmlFromLocalAndDeleteIt"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r12)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r14 == 0) goto L_0x02e2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r12)
            goto L_0x0307
        L_0x02e2:
            com.tencent.mm.vfs.m1 r14 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x02fc }
            r14.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x02fc }
            boolean r16 = r14.mo119967g()     // Catch:{ Exception -> 0x02fc }
            if (r16 != 0) goto L_0x02f1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r12)
            goto L_0x0307
        L_0x02f1:
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106432N(r0)     // Catch:{ Exception -> 0x02fc }
            r14.mo119966f()     // Catch:{ Exception -> 0x02fc }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r12)
            goto L_0x0308
        L_0x02fc:
            java.lang.String r0 = "LandingPageUtil"
            java.lang.String r14 = "readTempCanvasXmlFromLocalAndDeleteIt fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r12)
        L_0x0307:
            r0 = r11
        L_0x0308:
            r1.f277627x = r0
        L_0x030a:
            java.lang.String r0 = r1.f277627x
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x031f
            r23.finish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            r17 = r2
            r4 = r5
            r18 = r10
            goto L_0x0c6f
        L_0x031f:
            java.lang.String r0 = r1.f277627x
            java.lang.String r9 = "</*RecXml[\\s|\\S]*?>"
            java.lang.String r0 = r0.replaceAll(r9, r11)
            r1.f277627x = r0
            ps2.z r0 = r1.f277551W
            android.content.Intent r9 = r23.getIntent()
            java.lang.String r12 = "sns_landing_pages_expid"
            java.lang.String r9 = r9.getStringExtra(r12)
            r0.f295496o = r9
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r9 = "sns_landing_pages_xml_prefix"
            java.lang.String r0 = r0.getStringExtra(r9)
            r1.f277631y = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r9 = "sns_landing_pages_share_sns_id"
            java.lang.String r0 = r0.getStringExtra(r9)
            r1.f277520J = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r9 = "sns_landing_pages_rawSnsId"
            java.lang.String r0 = r0.getStringExtra(r9)
            r1.f277522K = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r9 = "sns_landing_pages_ux_info"
            java.lang.String r0 = r0.getStringExtra(r9)
            r1.f277533Q = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r9 = "sns_landing_pages_aid"
            java.lang.String r0 = r0.getStringExtra(r9)
            r1.f277603p0 = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r9 = "sns_landing_pages_traceid"
            java.lang.String r0 = r0.getStringExtra(r9)
            r1.f277628x0 = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r9 = "sns_landing_pages_search_extra"
            java.lang.String r0 = r0.getStringExtra(r9)
            ps2.z r9 = r1.f277551W
            r9.getClass()
            java.lang.String r12 = "setSearchExtra"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesReportInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r14)
            boolean r16 = android.text.TextUtils.isEmpty(r0)
            if (r16 != 0) goto L_0x03de
            java.lang.String r8 = r9.f295497p
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x03c1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = r9.f295497p
            r8.append(r15)
            java.lang.String r15 = "&"
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            r9.f295497p = r8
        L_0x03c1:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = r9.f295497p
            r8.append(r15)
            java.lang.String r15 = "searchextra="
            r8.append(r15)
            java.lang.String r0 = java.net.URLEncoder.encode(r0)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r9.f295497p = r0
        L_0x03de:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r14)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r8 = "sns_landing_pages_extra"
            java.lang.String r0 = r0.getStringExtra(r8)
            r1.f277568c2 = r0
            ps2.z r8 = r1.f277551W
            r8.mo140368a(r0)
            ps2.z r0 = r1.f277551W
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "halfScreenMode="
            r8.append(r9)
            boolean r9 = r1.f277618u
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r0.mo140368a(r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "initParams, extraData="
            r0.append(r8)
            java.lang.String r8 = r1.f277568c2
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "openAdCanvasPage initParams, get uxInfo from adCanvasPage is "
            r0.append(r8)
            java.lang.String r8 = r1.f277533Q
            r0.append(r8)
            java.lang.String r8 = ", source is "
            r0.append(r8)
            int r8 = r1.f277508D
            r0.append(r8)
            java.lang.String r8 = ", extraData is "
            r0.append(r8)
            java.lang.String r8 = r1.f277568c2
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "MicroMsg.SnsAdNativeLandingPagesUI.uxInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r8 = "sns_landing_is_native_sight_ad"
            r9 = 0
            boolean r0 = r0.getBooleanExtra(r8, r9)
            r1.f277524L = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r8 = "sns_landing_pages_rec_src"
            int r0 = r0.getIntExtra(r8, r9)
            r1.f277557Y = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r8 = "sns_landing_pages_from_outer_index"
            int r0 = r0.getIntExtra(r8, r9)
            r1.f277632y0 = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r8 = "sns_landing_pages_ad_info"
            java.lang.String r0 = r0.getStringExtra(r8)
            r1.f277635z = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r8 = "sns_landing_pages_need_enter_and_exit_animation"
            boolean r0 = r0.getBooleanExtra(r8, r9)
            r1.f277612s = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r8 = "sns_landing_pages_is_normal_ad_animation"
            boolean r0 = r0.getBooleanExtra(r8, r9)
            r1.f277615t = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r12 = "sns_landing_page_is_interactive_canvas"
            boolean r0 = r0.getBooleanExtra(r12, r9)
            r1.f277525L1 = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r8 = "sns_landing_page_sight_video_seek_time"
            long r6 = r0.getLongExtra(r8, r6)
            r1.f277523K1 = r6
            ps2.z r0 = r1.f277551W
            int r6 = r1.f277508D
            r0.f295486e = r6
            r6 = 1
            r0.f295487f = r6
            r0.f295488g = r9
            int r6 = r1.f277510E
            r0.f295498q = r6
            java.lang.String r0 = r1.f277631y
            if (r0 == 0) goto L_0x04d2
            java.lang.String r0 = r1.f277627x
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x04d6
        L_0x04d2:
            java.lang.String r0 = "adxml"
            r1.f277631y = r0
        L_0x04d6:
            java.lang.String r0 = r1.f277627x
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0c42
            java.lang.String r0 = r1.f277631y
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x04e8
            goto L_0x0c42
        L_0x04e8:
            boolean r0 = r1.f277525L1
            java.lang.String r6 = "isInteractiveCanvas"
            if (r0 != 0) goto L_0x04fa
            java.lang.String r0 = r1.f277627x
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x04fa
            r7 = 1
            r1.f277525L1 = r7
        L_0x04fa:
            java.lang.String r0 = r1.f277627x
            java.lang.String r7 = r1.f277631y
            r9 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r7, r9)
            r1.f277585i1 = r0
            java.lang.String r7 = "."
            if (r0 == 0) goto L_0x0649
            ps2.z r14 = r1.f277551W
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r7)
            java.lang.String r8 = r1.f277631y
            r15.append(r8)
            java.lang.String r8 = ".adCanvasInfo.id"
            r15.append(r8)
            java.lang.String r8 = r15.toString()
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r11)
            r14.f295499r = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r14 = r1.f277631y
            r8.append(r14)
            java.lang.String r14 = ".adExtInfo"
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r11)
            java.lang.String r0 = vr2.C102259p.m134828a(r0)
            r1.f277509D1 = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r11 = r1.f277631y
            r8.append(r11)
            java.lang.String r11 = ".forbiddenLeftSwipe"
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r8 = 1
            if (r0 != r8) goto L_0x057c
            r0 = 1
            goto L_0x057d
        L_0x057c:
            r0 = 0
        L_0x057d:
            r1.f277515G1 = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            java.lang.String r14 = r1.f277631y
            r11.append(r14)
            java.lang.String r14 = ".forbiddenCustomAnimation"
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r8 = 1
            if (r0 != r8) goto L_0x05a6
            r0 = 1
            goto L_0x05a7
        L_0x05a6:
            r0 = 0
        L_0x05a7:
            r1.f277517H1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r11 = r1.f277631y
            r0.append(r11)
            java.lang.String r11 = ".adCanvasInfo.forceOpenVoice"
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, java.lang.String> r11 = r1.f277585i1
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r8 = 1
            if (r0 != r8) goto L_0x05d0
            r0 = 1
            goto L_0x05d1
        L_0x05d0:
            r0 = 0
        L_0x05d1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "isForceOpenVoice="
            r11.append(r14)
            r11.append(r0)
            java.lang.String r14 = ", isNativeSightAd="
            r11.append(r14)
            boolean r14 = r1.f277524L
            r11.append(r14)
            r11.append(r13)
            int r13 = r1.f277508D
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            if (r0 == 0) goto L_0x05fc
            r1.f277524L = r0
        L_0x05fc:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            java.lang.String r13 = r1.f277631y
            r11.append(r13)
            java.lang.String r13 = ".adCanvasInfo.pageID"
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r1.f277538R1 = r0
            ps2.z r0 = r1.f277551W
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = "pageId="
            r0.append(r11)
            java.lang.String r11 = r1.f277538R1
            r0.append(r11)
            java.lang.String r11 = ", canvasId="
            r0.append(r11)
            ps2.z r11 = r1.f277551W
            java.lang.String r11 = r11.f295499r
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x064e
        L_0x0649:
            java.lang.String r0 = "initParams, values is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x064e:
            boolean r0 = r1.f277618u
            if (r0 == 0) goto L_0x0658
            r8 = 1
            r1.f277515G1 = r8
            r11 = 0
            r1.f277612s = r11
        L_0x0658:
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r11 = r1.f277519I1
            r11.getClass()
            java.lang.String r13 = "AdLandingPageEggCardHelper"
            java.lang.String r14 = "init"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            r8 = 2131305325(0x7f09236d, float:1.8228818E38)
            android.view.View r0 = r0.findViewById(r8)
            r11.f274106q = r0
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            r8 = 2131296984(0x7f0902d8, float:1.82119E38)
            android.view.View r0 = r0.findViewById(r8)
            r11.f274105p = r0
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            r8 = 2131300384(0x7f091020, float:1.8218796E38)
            android.view.View r0 = r0.findViewById(r8)
            r11.f274107r = r0
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            r8 = 2131309125(0x7f093245, float:1.8236525E38)
            android.view.View r0 = r0.findViewById(r8)
            r11.f274108s = r0
            java.lang.String r8 = "isTwistAnimUseGL"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r15)
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x06cd }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x06cd }
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_ad_twist_anim_gl     // Catch:{ all -> 0x06cd }
            r17 = r2
            r2 = 0
            int r0 = r0.mo58779Qe(r9, r2)     // Catch:{ all -> 0x06cb }
            if (r0 <= 0) goto L_0x06ad
            r2 = 1
            goto L_0x06ae
        L_0x06ad:
            r2 = 0
        L_0x06ae:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x06cb }
            r9.<init>()     // Catch:{ all -> 0x06cb }
            r18 = r2
            java.lang.String r2 = "isTwistAnimUseGL, exptValue="
            r9.append(r2)     // Catch:{ all -> 0x06cb }
            r9.append(r0)     // Catch:{ all -> 0x06cb }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x06cb }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)     // Catch:{ all -> 0x06cb }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r15)
            r0 = r18
            goto L_0x06ed
        L_0x06cb:
            r0 = move-exception
            goto L_0x06d0
        L_0x06cd:
            r0 = move-exception
            r17 = r2
        L_0x06d0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "isTwistAnimUseGL, exp="
            r2.append(r9)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r15)
            r0 = 0
        L_0x06ed:
            r11.f274109t = r0
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r2 = "sns_landing_page_is_gesture_twist_card_id"
            java.lang.String r0 = r0.getStringExtra(r2)
            r11.f274097h = r0
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            qs2.i0 r0 = r0.mo132541n8()
            boolean r0 = r0.mo140747n()
            r11.f274115z = r0
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            qs2.i0 r0 = r0.mo132541n8()
            int r0 = r0.mo140742i()
            r11.f274114y = r0
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = r11.f274090a
            r2.getClass()
            java.lang.String r8 = "getAdXmlValues"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f277585i1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r8 = r11.f274090a
            r8.getClass()
            java.lang.String r9 = "getLandingPagesXmlPrex"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r3)
            java.lang.String r8 = r8.f277631y
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r3)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r9 = r11.f274090a
            r9.getClass()
            r18 = r10
            java.lang.String r10 = "getLandingPagesXml"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r3)
            java.lang.String r9 = r9.f277627x
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r3)
            if (r2 == 0) goto L_0x087e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            r19 = r5
            r5 = 2
            co2.h r10 = co2.C92435h.m116268b(r2, r10, r5)
            r11.f274110u = r10
            r5 = 5
            if (r0 != r5) goto L_0x087b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r8)
            java.lang.String r10 = ".adCanvasInfo"
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "parseFromXml"
            r20 = r8
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
            int r21 = r2.size()
            if (r21 == 0) goto L_0x0869
            boolean r21 = android.text.TextUtils.isEmpty(r5)
            if (r21 == 0) goto L_0x078e
            goto L_0x0869
        L_0x078e:
            r21 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r5 = ".giveHBCardInfo"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r5 = r2.containsKey(r4)
            if (r5 != 0) goto L_0x07af
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            r4 = r13
            r22 = r14
            goto L_0x0871
        L_0x07af:
            mo2.c r5 = new mo2.c
            r5.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r22 = r14
            java.lang.String r14 = ".twistCardId"
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r5.f292834a = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r14 = ".giveCardId"
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r5.f292835b = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r14 = ".senderUserName"
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r5.f292836c = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r14 = ".senderNickName"
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r5.f292837d = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r14 = ".subCardType"
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r5.f292838e = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = ".shareTime"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r4 = r13
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r1)
            r5.f292839f = r13
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            goto L_0x0872
        L_0x0869:
            r21 = r4
            r4 = r13
            r22 = r14
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
        L_0x0871:
            r5 = 0
        L_0x0872:
            r11.f274113x = r5
            if (r5 == 0) goto L_0x0887
            java.lang.String r1 = r5.f292834a
            r11.f274097h = r1
            goto L_0x0887
        L_0x087b:
            r21 = r4
            goto L_0x0882
        L_0x087e:
            r21 = r4
            r19 = r5
        L_0x0882:
            r20 = r8
            r4 = r13
            r22 = r14
        L_0x0887:
            co2.h r1 = r11.f274110u
            java.lang.String r5 = "setNeedEnterAndExitAnimtation"
            if (r1 == 0) goto L_0x0942
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            android.content.Intent r0 = r0.getIntent()
            r1 = 0
            boolean r0 = r0.getBooleanExtra(r12, r1)
            r11.f274111v = r0
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            r0.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            boolean r0 = r0.f277525L1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            if (r0 != 0) goto L_0x08d6
            int r0 = r11.f274114y
            java.lang.String r1 = "isSupportEggCardSource"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r15)
            r2 = 26
            if (r0 < r2) goto L_0x08ba
            r2 = 33
            if (r0 <= r2) goto L_0x08cd
        L_0x08ba:
            r2 = 13
            if (r0 == r2) goto L_0x08cd
            r2 = 5
            if (r0 == r2) goto L_0x08cd
            r2 = 3
            if (r0 == r2) goto L_0x08cd
            r2 = 4
            if (r0 == r2) goto L_0x08cd
            r2 = 7
            if (r0 != r2) goto L_0x08cb
            goto L_0x08cd
        L_0x08cb:
            r0 = 0
            goto L_0x08ce
        L_0x08cd:
            r0 = 1
        L_0x08ce:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r15)
            if (r0 == 0) goto L_0x08d4
            goto L_0x08d6
        L_0x08d4:
            r0 = 0
            goto L_0x08d7
        L_0x08d6:
            r0 = 1
        L_0x08d7:
            boolean r1 = r11.f274111v
            r2 = r1 ^ 1
            r11.f274112w = r2
            co2.h r2 = r11.f274110u
            int r6 = r2.f264511a
            r8 = 1
            if (r6 == r8) goto L_0x0937
            r9 = 2
            if (r6 == r9) goto L_0x092c
            r9 = 3
            if (r6 == r9) goto L_0x0921
            r9 = 4
            if (r6 == r9) goto L_0x0909
            r9 = 5
            if (r6 == r9) goto L_0x08f2
            goto L_0x0b2f
        L_0x08f2:
            if (r0 == 0) goto L_0x0b2f
            if (r1 == 0) goto L_0x0b2f
            co2.h$c r0 = r2.f264516f
            if (r0 == 0) goto L_0x0b2f
            r11.f274103n = r8
            java.lang.String r0 = r0.f264527d
            boolean r0 = r11.mo130362s(r0)
            if (r0 != 0) goto L_0x0b2f
            r1 = 0
            r11.f274103n = r1
            goto L_0x0b2f
        L_0x0909:
            if (r0 == 0) goto L_0x0b2f
            co2.h$b r0 = r2.f264515e
            if (r0 == 0) goto L_0x0b2f
            r6 = 1
            r11.f274101l = r6
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            r0.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            r0.f277612s = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L_0x0b2f
        L_0x0921:
            r6 = 1
            if (r0 == 0) goto L_0x0b2f
            co2.h$a r0 = r2.f264514d
            if (r0 == 0) goto L_0x0b2f
            r11.f274100k = r6
            goto L_0x0b2f
        L_0x092c:
            r6 = 1
            if (r1 == 0) goto L_0x0b2f
            co2.h$d r0 = r2.f264513c
            if (r0 == 0) goto L_0x0b2f
            r11.f274094e = r6
            goto L_0x0b2f
        L_0x0937:
            r6 = 1
            if (r0 == 0) goto L_0x0b2f
            co2.h$e r0 = r2.f264512b
            if (r0 == 0) goto L_0x0b2f
            r11.f274093d = r6
            goto L_0x0b2f
        L_0x0942:
            r1 = r20
            if (r2 == 0) goto L_0x098f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r1)
            java.lang.String r12 = ".adTwistInfo"
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            com.tencent.mm.plugin.sns.storage.ADXml$k r10 = com.tencent.p014mm.plugin.sns.storage.ADXml.C95024k.m120766a(r2, r10)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r12.append(r1)
            java.lang.String r13 = ".adShakeInfo"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            fr2.a r12 = fr2.C97952a.m126505a(r2, r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r7)
            r13.append(r1)
            java.lang.String r1 = ".adFullCardInfo.adLongPressGestureInfo"
            r13.append(r1)
            java.lang.String r1 = r13.toString()
            com.tencent.mm.plugin.sns.storage.ADXml$p r1 = com.tencent.p014mm.plugin.sns.storage.ADXml.C95028p.m120769a(r2, r1)
            goto L_0x0992
        L_0x098f:
            r1 = 0
            r10 = 0
            r12 = 0
        L_0x0992:
            boolean r2 = com.tencent.p014mm.plugin.sns.storage.ADXml.isTwistAdCanvas(r9)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r13 = r11.f274090a
            android.content.Intent r13 = r13.getIntent()
            java.lang.String r14 = "sns_landing_page_is_gesture_twist_ad"
            r8 = 0
            boolean r13 = r13.getBooleanExtra(r14, r8)
            java.lang.String r14 = "mIsSharedTypeAnim="
            if (r10 == 0) goto L_0x0a25
            if (r2 == 0) goto L_0x09d3
            if (r13 == 0) goto L_0x09b3
            r1 = 1
            r11.f274093d = r1
            r11.f274112w = r8
            goto L_0x09be
        L_0x09b3:
            r1 = 1
            boolean r0 = m121799A8(r0)
            if (r0 != 0) goto L_0x09be
            r11.f274093d = r1
            r11.f274112w = r1
        L_0x09be:
            co2.h r0 = new co2.h
            r0.<init>()
            r11.f274110u = r0
            r0.f264511a = r1
            co2.h$e r2 = new co2.h$e
            r2.<init>()
            r0.f264512b = r2
            boolean r0 = r10.f275727i
            r2.f264529a = r0
            goto L_0x09f1
        L_0x09d3:
            r1 = 1
            if (r13 == 0) goto L_0x09f1
            boolean r0 = r10.f275730o
            if (r0 == 0) goto L_0x09f1
            r11.f274094e = r1
            co2.h r0 = new co2.h
            r0.<init>()
            r11.f274110u = r0
            r1 = 2
            r0.f264511a = r1
            co2.h$d r1 = new co2.h$d
            r1.<init>()
            r0.f264513c = r1
            boolean r0 = r10.f275727i
            r1.f264528a = r0
        L_0x09f1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            boolean r1 = r11.f274112w
            r0.append(r1)
            java.lang.String r1 = ", isTwistAdAnim="
            r0.append(r1)
            boolean r1 = r11.f274093d
            r0.append(r1)
            java.lang.String r1 = ", intent twistCardId="
            r0.append(r1)
            java.lang.String r1 = r11.f274097h
            r0.append(r1)
            java.lang.String r1 = ", isSimpleTwistAnim="
            r0.append(r1)
            boolean r1 = r11.f274094e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0b2f
        L_0x0a25:
            if (r12 == 0) goto L_0x0aec
            boolean r1 = com.tencent.p014mm.plugin.sns.storage.ADXml.isShakeAdCanvas(r9)
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = r11.f274090a
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r9 = "sns_landing_page_is_gesture_shake_ad"
            r10 = 0
            boolean r2 = r2.getBooleanExtra(r9, r10)
            if (r1 == 0) goto L_0x0a59
            if (r2 == 0) goto L_0x0a43
            r1 = 1
            r11.f274100k = r1
            r11.f274112w = r10
            goto L_0x0a4e
        L_0x0a43:
            r1 = 1
            boolean r0 = m121799A8(r0)
            if (r0 != 0) goto L_0x0a4e
            r11.f274100k = r1
            r11.f274112w = r1
        L_0x0a4e:
            co2.h r0 = new co2.h
            r0.<init>()
            r11.f274110u = r0
            r1 = 3
            r0.f264511a = r1
            goto L_0x0ab9
        L_0x0a59:
            if (r2 != 0) goto L_0x0a61
            boolean r0 = m121814z8(r0)
            if (r0 == 0) goto L_0x0ab9
        L_0x0a61:
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            r0.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            boolean r0 = r0.f277525L1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            if (r0 == 0) goto L_0x0ab9
            java.lang.String r0 = "isSimpleAnimType"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.shakead.AdShakeInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = r12.f287308j
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0a8a
            java.lang.String r2 = r12.f287309n
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0a8a
            r2 = 1
            goto L_0x0a8b
        L_0x0a8a:
            r2 = 0
        L_0x0a8b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            if (r2 == 0) goto L_0x0ab9
            r1 = 1
            r11.f274101l = r1
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            r0.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            r0.f277612s = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            co2.h r0 = new co2.h
            r0.<init>()
            r11.f274110u = r0
            r1 = 4
            r0.f264511a = r1
            co2.h$b r1 = new co2.h$b
            r1.<init>()
            r0.f264515e = r1
            java.lang.String r0 = r12.f287308j
            r1.f264522a = r0
            java.lang.String r0 = r12.f287309n
            r1.f264523b = r0
        L_0x0ab9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            boolean r1 = r11.f274112w
            r0.append(r1)
            java.lang.String r1 = ", isShakeAdAnim="
            r0.append(r1)
            boolean r1 = r11.f274100k
            r0.append(r1)
            java.lang.String r1 = ", intent shakeCardId="
            r0.append(r1)
            java.lang.String r1 = r11.f274097h
            r0.append(r1)
            java.lang.String r1 = ", isSimpleShakeAnim="
            r0.append(r1)
            boolean r1 = r11.f274101l
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0b2f
        L_0x0aec:
            if (r1 == 0) goto L_0x0b2f
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r2 = "sns_landing_page_is_longpress_ad"
            r5 = 0
            boolean r0 = r0.getBooleanExtra(r2, r5)
            r11.f274103n = r0
            if (r0 == 0) goto L_0x0b2f
            java.lang.String r0 = r1.f275746d
            boolean r0 = r11.mo130362s(r0)
            if (r0 != 0) goto L_0x0b0a
            r11.f274103n = r5
        L_0x0b0a:
            boolean r0 = r11.f274103n
            if (r0 == 0) goto L_0x0b2f
            co2.h r0 = new co2.h
            r0.<init>()
            r11.f274110u = r0
            r2 = 5
            r0.f264511a = r2
            co2.h$c r2 = new co2.h$c
            r2.<init>()
            r0.f264516f = r2
            int r0 = r1.f275747e
            r2.f264524a = r0
            int r0 = r1.f275749g
            r2.f264526c = r0
            java.lang.String r0 = r1.f275746d
            r2.f264527d = r0
            int r0 = r1.f275748f
            r2.f264525b = r0
        L_0x0b2f:
            boolean r0 = r11.f274093d
            if (r0 == 0) goto L_0x0ba0
            java.lang.String r1 = "inflateTwistCardView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r15)
            boolean r0 = r11.f274109t
            if (r0 != 0) goto L_0x0b70
            com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView r0 = r11.f274091b     // Catch:{ all -> 0x0b56 }
            if (r0 != 0) goto L_0x0b9c
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a     // Catch:{ all -> 0x0b56 }
            r2 = 2131315877(0x7f094ca5, float:1.825022E38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ all -> 0x0b56 }
            android.view.ViewStub r0 = (android.view.ViewStub) r0     // Catch:{ all -> 0x0b56 }
            if (r0 == 0) goto L_0x0b9c
            android.view.View r0 = r0.inflate()     // Catch:{ all -> 0x0b56 }
            com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView r0 = (com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistRoateCardsView) r0     // Catch:{ all -> 0x0b56 }
            r11.f274091b = r0     // Catch:{ all -> 0x0b56 }
            goto L_0x0b9c
        L_0x0b56:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "inflateTwistCardView, exp="
            r2.append(r5)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x0b9c
        L_0x0b70:
            com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView r0 = r11.f274092c
            if (r0 != 0) goto L_0x0b9c
            com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView r0 = new com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r2 = r11.f274090a
            r0.<init>(r2)
            r11.f274092c = r0
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a
            r2 = 2131312632(0x7f093ff8, float:1.8243638E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView r2 = r11.f274092c
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            r0.addView(r2, r4)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1572(0x624, float:2.203E-42)
            r4 = 17
            r0.mo175911u(r2, r4)
        L_0x0b9c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r15)
            goto L_0x0bec
        L_0x0ba0:
            boolean r0 = r11.f274100k
            if (r0 == 0) goto L_0x0ba8
            r11.mo130360q()
            goto L_0x0bec
        L_0x0ba8:
            boolean r0 = r11.f274103n
            if (r0 == 0) goto L_0x0bec
            java.lang.String r1 = "inflateLongPressSphereAnimView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r15)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)     // Catch:{ all -> 0x0bd0 }
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView r0 = r11.f274102m     // Catch:{ all -> 0x0bd0 }
            if (r0 != 0) goto L_0x0be9
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI r0 = r11.f274090a     // Catch:{ all -> 0x0bd0 }
            r2 = 2131308200(0x7f092ea8, float:1.8234649E38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ all -> 0x0bd0 }
            android.view.ViewStub r0 = (android.view.ViewStub) r0     // Catch:{ all -> 0x0bd0 }
            android.view.View r0 = r0.inflate()     // Catch:{ all -> 0x0bd0 }
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView r0 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdSphereAnimView) r0     // Catch:{ all -> 0x0bd0 }
            r11.f274102m = r0     // Catch:{ all -> 0x0bd0 }
            r2 = 0
            r0.setVisibility(r2)     // Catch:{ all -> 0x0bd0 }
            goto L_0x0be9
        L_0x0bd0:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "inflateShakeCardView, exp="
            r2.append(r5)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0be9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r15)
        L_0x0bec:
            r1 = r22
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r15)
            r1 = r23
            boolean r0 = r1.f277517H1
            r2 = 0
            if (r0 == 0) goto L_0x0bfc
            r1.f277612s = r2
            r1.f277615t = r2
        L_0x0bfc:
            boolean r0 = r1.f277612s
            if (r0 == 0) goto L_0x0c07
            ps2.z r0 = r1.f277551W
            r0.f295484c = r2
            r0.f295485d = r2
            goto L_0x0c0e
        L_0x0c07:
            ps2.z r0 = r1.f277551W
            r4 = 1
            r0.f295484c = r4
            r0.f295485d = r4
        L_0x0c0e:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            if (r0 == 0) goto L_0x0c3a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r5 = r1.f277631y
            r4.append(r5)
            java.lang.String r5 = ".preloadWeAppPkg"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r4 = 1
            if (r0 != r4) goto L_0x0c37
            r6 = 1
            goto L_0x0c38
        L_0x0c37:
            r6 = 0
        L_0x0c38:
            r1.f277521J1 = r6
        L_0x0c3a:
            r2 = r21
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r4 = r19
            goto L_0x0c6f
        L_0x0c42:
            r17 = r2
            r2 = r4
            r19 = r5
            r18 = r10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "landingPagesXml is "
            r0.append(r4)
            java.lang.String r4 = r1.f277627x
            r0.append(r4)
            java.lang.String r4 = ",landingPagesXmlPrex is "
            r0.append(r4)
            java.lang.String r4 = r1.f277631y
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r4 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x0c6f:
            r23.initView()
            java.lang.String r0 = "MicroMsg.SnsAdNativeLandingPagesUI.launch"
            java.lang.String r2 = "before AdLandingPagesProxy connect"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r0 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            boolean r0 = r0.isConnected()
            if (r0 != 0) goto L_0x0cac
            wo2.d$b r0 = r1.f277532P1
            r0.getClass()
            java.lang.String r2 = "ipcStart"
            r5 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            long r6 = java.lang.System.currentTimeMillis()
            r0.f301739e = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            java.lang.String r0 = "isConnected==false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r0 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$a0 r2 = new com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$a0
            r2.<init>()
            r0.connect(r2)
            goto L_0x0cb7
        L_0x0cac:
            r5 = r18
            java.lang.String r0 = "isConnected==true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r23.mo132549u8()
        L_0x0cb7:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent> r0 = r1.f277605p2
            r0.alive()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0ccd }
            android.content.BroadcastReceiver r2 = r1.f277630x2     // Catch:{ Exception -> 0x0ccd }
            android.content.IntentFilter r6 = new android.content.IntentFilter     // Catch:{ Exception -> 0x0ccd }
            java.lang.String r7 = "android.intent.action.SCREEN_ON"
            r6.<init>(r7)     // Catch:{ Exception -> 0x0ccd }
            r0.registerReceiver(r2, r6)     // Catch:{ Exception -> 0x0ccd }
            goto L_0x0ce7
        L_0x0ccd:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "registerReceiver, exp="
            r2.append(r6)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0ce7:
            wo2.d$b r0 = r1.f277532P1
            r0.mo142078a()
            wo2.d$b r0 = r1.f277532P1
            java.lang.String r2 = r1.f277522K
            r0.getClass()
            java.lang.String r4 = "setSnsId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r0.f301743i = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.lang.String r0 = r1.f277522K
            wo2.C102466d.m135254d(r0)
            wo2.C102477l.m135266d()
            r2 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "SnsAdNativeLadingPagesUI onDestroy, isConnected=" + this.f277573e1 + ", bHandleExit=" + this.f277560Z + ", hash=" + hashCode());
        MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVSnsUI", false);
        C102466d.C102468b bVar = this.f277532P1;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        boolean z = bVar.f301746l;
        int i = bVar.f301744j;
        SnsMethodCalculate.markStartTimeMs("reportOnDestroyIdkey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        Log.m105924i("AdLandingPageStaticHelper", "reportOnDestroyIdkey, isRestart=" + z + ", source=" + i);
        C102466d.m135251a(1673, 22);
        if (z) {
            C102466d.m135251a(1673, 25);
        }
        if (i == 29) {
            C102466d.m135251a(1667, 11);
        }
        SnsMethodCalculate.markEndTimeMs("reportOnDestroyIdkey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        getWindow().clearFlags(128);
        MMHandler mMHandler = this.f277506C1;
        if (mMHandler != null) {
            mMHandler.removeCallbacks(this.f277608q2);
        }
        AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = this.f277610r1;
        if (adLandingFloatBarCompWrapper != null) {
            adLandingFloatBarCompWrapper.mo67235C();
        }
        C95295z zVar = this.f277583h2;
        if (zVar != null) {
            zVar.mo67235C();
        }
        C95243v0 v0Var = this.f277544T1;
        if (v0Var != null) {
            v0Var.mo67235C();
        }
        C95066b0 b0Var = this.f277550V1;
        if (b0Var != null) {
            b0Var.mo67235C();
        }
        AdLandingPageEggCardHelper adLandingPageEggCardHelper = this.f277519I1;
        C13598b0 b0Var2 = null;
        if (adLandingPageEggCardHelper != null) {
            SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            try {
                Log.m105924i("AdLandingPageEggCardHelper", "clear");
                adLandingPageEggCardHelper.f274087D.removeCallbacksAndMessages((Object) null);
                SnsMethodCalculate.markStartTimeMs("stopListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                adLandingPageEggCardHelper.f274086C.dead();
                SnsMethodCalculate.markEndTimeMs("stopListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                C94625d dVar = adLandingPageEggCardHelper.f274096g;
                if (dVar != null) {
                    dVar.mo130211b0(false);
                }
                GLTwistRoateCardsView gLTwistRoateCardsView = adLandingPageEggCardHelper.f274092c;
                if (gLTwistRoateCardsView != null) {
                    SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                    gLTwistRoateCardsView.f274535I.quitSafely();
                    gLTwistRoateCardsView.f274534H.removeCallbacksAndMessages((Object) null);
                    SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingPageEggCardHelper", "clear, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        }
        for (SnsAdLandingPageFloatView snsAdLandingPageFloatView : ((HashMap) this.f277604p1).values()) {
            snsAdLandingPageFloatView.getClass();
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            if (snsAdLandingPageFloatView.f281474f != null && !snsAdLandingPageFloatView.f281480o) {
                snsAdLandingPageFloatView.f281480o = true;
                snsAdLandingPageFloatView.f281476h.mo67235C();
            }
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            snsAdLandingPageFloatView.setVisibility(8);
        }
        if (this.f277573e1) {
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "the SnsAdNativeLadingPagesUI is destroy, bHandleExit=" + this.f277560Z);
            if (!this.f277560Z) {
                mo132532d8();
                mo132506O8();
            }
        } else {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "onDestroy, isConnected=false");
        }
        C103049a a = C103049a.m136281a();
        a.getClass();
        SnsMethodCalculate.markStartTimeMs("clearViewsMap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        ((HashMap) a.f304038d).clear();
        a.f304040f = null;
        SnsMethodCalculate.markEndTimeMs("clearViewsMap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        ((HashMap) this.f277604p1).clear();
        C102495c cVar = (C102495c) this.f277552W0.getAdapter();
        if (cVar != null) {
            SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
            cVar.f301794i.clear();
            SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        }
        try {
            MMApplicationContext.getContext().unregisterReceiver(this.f277630x2);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "unregisterReceiver, exp=" + e.toString());
        }
        this.f277605p2.dead();
        SnsMethodCalculate.markStartTimeMs("publishDestroyEvent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            SnsAdNativePageLifecycleEvent snsAdNativePageLifecycleEvent = new SnsAdNativePageLifecycleEvent();
            snsAdNativePageLifecycleEvent.f265125d.f265126a = 5;
            snsAdNativePageLifecycleEvent.publish();
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("publishDestroyEvent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        AdLandingPagesProxy.getInstance().clearCallback();
        if (this.f277618u && !this.f277621v) {
            AdLandingPagesProxy.getInstance().setHalfScreenLandingPageShow(false);
        }
        C87070f fVar = C87070f.f252656a;
        SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        try {
            C87066b remove = C87070f.f252657b.remove(Integer.valueOf(hashCode()));
            if (remove != null) {
                SnsMethodCalculate.markStartTimeMs("getBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                C87067c cVar2 = remove.f252648b;
                SnsMethodCalculate.markEndTimeMs("getBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                if (cVar2 != null) {
                    cVar2.mo118861j0();
                }
                C98778a a2 = remove.mo121532a();
                if (a2 != null) {
                    SnsMethodCalculate.markStartTimeMs("clear$plugin_sns_release", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                    ((LinkedHashMap) a2.f289593b).clear();
                    ((LinkedHashMap) a2.f289592a).clear();
                    ((LinkedHashMap) a2.f289594c).clear();
                    SnsMethodCalculate.markEndTimeMs("clear$plugin_sns_release", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                }
                Log.m105924i("SnsAdMB", "the biz is destroying");
                b0Var2 = C13598b0.f38549a;
            }
            if (b0Var2 == null) {
                Log.m105924i("SnsAdMB", "the magic brush data is null, need not destroy");
            }
            C87070f.f252658c.remove(Integer.valueOf(hashCode()));
        } catch (Exception e2) {
            Log.m105920e("SnsAdMB", "there is an exception in destroy: " + e2.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void onKeyboardStateChanged() {
        SnsMethodCalculate.markStartTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onKeyboardStateChanged();
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "onKeyboardStateChanged, state=" + keyboardState());
        AdlandingDummyViewPager adlandingDummyViewPager = this.f277552W0;
        if (adlandingDummyViewPager != null) {
            adlandingDummyViewPager.postDelayed(new C95438r(), 500);
        }
        SnsMethodCalculate.markEndTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void onPause() {
        AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper;
        AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper;
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onPause();
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "onPause, hash=" + hashCode());
        this.f277597n1 = true;
        if (this.f277618u && !isFinishing() && !mo132494B8()) {
            this.f277614s2 = true;
            AdLandingPagesProxy.getInstance().notifyFinderVideoPlayStateToChange(false);
        }
        if (this.f277573e1) {
            this.f277528N += System.currentTimeMillis() - this.f277526M;
        }
        try {
            ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
            this.f277554X = false;
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot", th.toString());
        }
        if (mo132546r8()) {
            SnsMethodCalculate.markStartTimeMs("pauseFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            for (SnsAdLandingPageFloatView g : ((HashMap) this.f277604p1).values()) {
                g.mo134022g();
            }
            SnsMethodCalculate.markEndTimeMs("pauseFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        AdlandingDummyViewPager adlandingDummyViewPager = this.f277552W0;
        ViewPager.OnPageChangeListener onPageChangeListener = this.f277595m2;
        adlandingDummyViewPager.getClass();
        SnsMethodCalculate.markStartTimeMs("removePageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
        ((HashSet) adlandingDummyViewPager.f276457c1).remove(onPageChangeListener);
        SnsMethodCalculate.markEndTimeMs("removePageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
        if (!this.f277529N1) {
            C118144a.m166672a(this).mo182945d(this.f277586i2);
        }
        C118144a.m166672a(this).mo182945d(this.f277589j2);
        if (!this.f277529N1) {
            this.f277601o2.dead();
        }
        C95074c0 c0Var = this.f277634y2;
        if (c0Var != null) {
            c0Var.mo131584a();
        }
        if (!this.f277529N1 && (adLandingFloatBarCompWrapper = this.f277610r1) != null && adLandingFloatBarCompWrapper.mo131508Q()) {
            this.f277610r1.mo124361D();
        }
        C95243v0 v0Var = this.f277544T1;
        if (v0Var != null) {
            v0Var.mo124361D();
        }
        C95066b0 b0Var = this.f277550V1;
        if (b0Var != null) {
            b0Var.mo124361D();
        }
        if (this.f277529N1 && (adLandingGeneralVideoWrapper = this.f277527M1) != null && adLandingGeneralVideoWrapper.mo130306i()) {
            AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper2 = this.f277527M1;
            adLandingGeneralVideoWrapper2.getClass();
            SnsMethodCalculate.markStartTimeMs("disappearFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            C95094h hVar = adLandingGeneralVideoWrapper2.f274025J;
            if (hVar != null) {
                hVar.mo124361D();
            }
            SnsMethodCalculate.markEndTimeMs("disappearFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        }
        AdLandingPageEggCardHelper adLandingPageEggCardHelper = this.f277519I1;
        if (adLandingPageEggCardHelper != null) {
            SnsMethodCalculate.markStartTimeMs("stopListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            adLandingPageEggCardHelper.f274086C.dead();
            SnsMethodCalculate.markEndTimeMs("stopListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void onResume() {
        AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper;
        AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper;
        SnsAdLandingPageFloatView snsAdLandingPageFloatView;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "onResume");
        super.onResume();
        C102466d.C102468b bVar = this.f277532P1;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        if (bVar.f301738d == 0) {
            bVar.f301738d = System.currentTimeMillis();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        if (this.f277515G1 && isSupportNavigationSwipeBack()) {
            getSwipeBackLayout().setEnableGesture(false);
        }
        try {
            if (!this.f277554X) {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot", "onResume callback");
                ScreenShotUtil.setScreenShotCallback(this, this.f277611r2);
                this.f277554X = true;
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot", th.toString());
        }
        mo132510S8();
        if (mo132546r8()) {
            SnsMethodCalculate.markStartTimeMs("getTopFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            int childCount = this.f277565b1.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    snsAdLandingPageFloatView = null;
                    SnsMethodCalculate.markEndTimeMs("getTopFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    break;
                }
                View childAt = this.f277565b1.getChildAt(childCount);
                if (childAt instanceof SnsAdLandingPageFloatView) {
                    snsAdLandingPageFloatView = (SnsAdLandingPageFloatView) childAt;
                    SnsMethodCalculate.markEndTimeMs("getTopFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    break;
                }
            }
            snsAdLandingPageFloatView.getClass();
            SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            if (snsAdLandingPageFloatView.f281475g != null) {
                snsAdLandingPageFloatView.f281476h.mo124360B();
                snsAdLandingPageFloatView.post(new C98234i(snsAdLandingPageFloatView));
            }
            SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        this.f277597n1 = false;
        AdlandingDummyViewPager adlandingDummyViewPager = this.f277552W0;
        ViewPager.OnPageChangeListener onPageChangeListener = this.f277595m2;
        adlandingDummyViewPager.getClass();
        SnsMethodCalculate.markStartTimeMs("addOnPageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
        ((HashSet) adlandingDummyViewPager.f276457c1).add(onPageChangeListener);
        SnsMethodCalculate.markEndTimeMs("addOnPageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
        if (!this.f277529N1) {
            C118144a.m166672a(this).mo182943b(this.f277586i2, new IntentFilter("com.tencent.mm.adlanding.video_progressbar_change"));
        }
        C118144a.m166672a(this).mo182943b(this.f277589j2, new IntentFilter("com.tencent.mm.adlanding.set_uioption"));
        if (this.f277573e1) {
            this.f277526M = System.currentTimeMillis();
        }
        if (!this.f277529N1) {
            this.f277601o2.alive();
        }
        if (this.f277534Q0) {
            mo132523Y8(false);
        }
        if (!this.f277529N1 && (adLandingFloatBarCompWrapper = this.f277610r1) != null && adLandingFloatBarCompWrapper.mo131508Q()) {
            this.f277610r1.mo124360B();
        }
        if (this.f277529N1 && (adLandingGeneralVideoWrapper = this.f277527M1) != null && adLandingGeneralVideoWrapper.mo130306i()) {
            AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper2 = this.f277527M1;
            adLandingGeneralVideoWrapper2.getClass();
            SnsMethodCalculate.markStartTimeMs("appearFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            C95094h hVar = adLandingGeneralVideoWrapper2.f274025J;
            if (hVar != null) {
                hVar.mo124360B();
            }
            SnsMethodCalculate.markEndTimeMs("appearFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        }
        C95243v0 v0Var = this.f277544T1;
        if (v0Var != null) {
            v0Var.mo124360B();
        }
        C95066b0 b0Var = this.f277550V1;
        if (b0Var != null) {
            b0Var.mo124360B();
        }
        AdLandingPageEggCardHelper adLandingPageEggCardHelper = this.f277519I1;
        if (adLandingPageEggCardHelper != null) {
            SnsMethodCalculate.markStartTimeMs("startListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (adLandingPageEggCardHelper.f274100k || adLandingPageEggCardHelper.f274093d) {
                adLandingPageEggCardHelper.f274086C.alive();
            }
            SnsMethodCalculate.markEndTimeMs("startListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        }
        if (this.f277614s2) {
            this.f277614s2 = false;
            AdLandingPagesProxy.getInstance().notifyFinderVideoPlayStateToChange(true);
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void onStart() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onStart();
        this.f277633y1 = true;
        if (this.f277573e1) {
            SnsMethodCalculate.markStartTimeMs("validExposureOneMoreCheck", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            try {
                if (!Util.isNullOrNil(this.f277625w1, this.f277629x1) && !this.f277500A1) {
                    if (this.f277503B1) {
                        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "execute mValidExposure onStart immediately");
                        mo132508Q8();
                    } else if (this.f277506C1 != null) {
                        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "execute mValidExposureRunnable onStart");
                        this.f277506C1.removeCallbacks(this.f277608q2);
                        this.f277506C1.postDelayed(this.f277608q2, 1000);
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("validExposureOneMoreCheck", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onStop();
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "onStop, hash=" + hashCode());
        this.f277633y1 = false;
        MMHandler mMHandler = this.f277506C1;
        if (mMHandler != null) {
            mMHandler.removeCallbacks(this.f277608q2);
        }
        if (this.f277618u && !isFinishing() && mo132494B8()) {
            this.f277614s2 = true;
            AdLandingPagesProxy.getInstance().notifyFinderVideoPlayStateToChange(false);
        }
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void onSwipeBack() {
        SnsMethodCalculate.markStartTimeMs("onSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C100903z zVar = this.f277551W;
        zVar.f295485d = 2;
        zVar.f295488g++;
        super.onSwipeBack();
        try {
            hideVKB();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "onSwipeBack hideVKB exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void onWindowFocusChanged(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onWindowFocusChanged(z);
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot", "hasFocus = " + z);
        if (!z) {
            try {
                ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
                this.f277554X = false;
            } catch (Throwable th) {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot", "hasFocus = " + z);
                Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot", th.toString());
            }
        } else {
            mo132534f8();
            if (!this.f277554X) {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.ScreenShot", "onWindowFocusChanged callback");
                ScreenShotUtil.setScreenShotCallback(this, this.f277611r2);
                this.f277554X = true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: p8 */
    public final String mo132544p8(String str) {
        SnsMethodCalculate.markStartTimeMs("getPrivilegeShareThumbUrl", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Map<String, String> map = this.f277585i1;
        String nullAs = Util.nullAs(map.get("." + this.f277631y + ".adCanvasInfo.shareThumbUrl"), "");
        if (!Util.isNullOrNil(nullAs)) {
            SnsMethodCalculate.markEndTimeMs("getPrivilegeShareThumbUrl", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return nullAs;
        }
        SnsMethodCalculate.markEndTimeMs("getPrivilegeShareThumbUrl", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return str;
    }

    /* renamed from: q8 */
    public boolean mo132545q8() {
        SnsMethodCalculate.markStartTimeMs("hasNextPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z = true;
        try {
            C102495c cVar = (C102495c) this.f277552W0.getAdapter();
            int currentItem = this.f277552W0.getCurrentItem();
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "hasNextPage, curPage=" + currentItem + ", pageCount=" + cVar.getCount());
            if (currentItem >= cVar.getCount() - 1) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("hasNextPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return z;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "hasNextPage exp:" + e.toString());
            SnsMethodCalculate.markEndTimeMs("hasNextPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return true;
        }
    }

    /* renamed from: r8 */
    public final boolean mo132546r8() {
        SnsMethodCalculate.markStartTimeMs("hasShowFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        int childCount = this.f277565b1.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.f277565b1.getChildAt(i) instanceof SnsAdLandingPageFloatView) {
                SnsMethodCalculate.markEndTimeMs("hasShowFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("hasShowFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return false;
    }

    /* renamed from: s8 */
    public void mo132547s8(boolean z, long j) {
        SnsMethodCalculate.markStartTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (this.f277610r1 != null) {
            Log.m105918d("MicroMsg.SnsAdNativeLandingPagesUI", "hideFloatBarView");
            this.f277610r1.mo131504M(z, j);
        }
        SnsMethodCalculate.markEndTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: t8 */
    public final void mo132548t8() {
        SnsMethodCalculate.markStartTimeMs("hideMoreOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            C77407n nVar = this.f277513F1;
            if (nVar != null && nVar.mo107563h()) {
                this.f277513F1.mo107572p();
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "hideMoreOptionMenu exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("hideMoreOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:159|160|161|(3:163|(1:165)|166)(1:167)|168|169) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:168:0x0af1 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0962  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x09e1  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0a32  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0a36  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0a96 A[Catch:{ all -> 0x0ab9, all -> 0x0a9e }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0aa7 A[Catch:{ all -> 0x0ab9, all -> 0x0a9e }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0b09  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0b10  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0b19  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0b37  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0b42  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0b51  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0601 A[EDGE_INSN: B:240:0x0601->B:75:0x0601 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x05b2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x079f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x07a7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x08f4  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0920  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x094c  */
    /* renamed from: u8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo132549u8() {
        /*
            r29 = this;
            r1 = r29
            java.lang.String r2 = "initAfterConnectToMM"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r0 = "MicroMsg.SnsAdNativeLandingPagesUI.launch"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            q3.a r0 = p1208q3.C118144a.m166672a(r29)
            int r4 = com.tencent.p014mm.plugin.sns.model.AdlandingRemoteServiceConnectedReceiver.f82002a
            java.lang.String r4 = "send"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.AdlandingRemoteServiceConnectedReceiver"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r7 = "com.tencnet.mm.action.adlanding.connected"
            r6.<init>(r7)
            r0.mo182944c(r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.lang.String r4 = "initData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r0 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            java.lang.String r5 = r1.f277520J
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.getSnsInfo(r5)
            r1.f277582h1 = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.String r11 = ""
            java.lang.String r12 = "MicroMsg.SnsAdNativeLandingPagesUI"
            if (r0 != 0) goto L_0x0063
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = "parse landingpagexml is error,landingpagexml is "
            r0.append(r13)
            java.lang.String r13 = r1.f277627x
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            r16 = r2
            r5 = r3
            r7 = r11
            r3 = r12
            goto L_0x0c2c
        L_0x0063:
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r0 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            java.lang.String r0 = r0.getSelfUserName()
            int r13 = r1.f277508D
            java.lang.String r14 = "openAdCanvasPage initData, get uxInfo from adCanvasPage is "
            java.lang.String r15 = "<originTraceId>%s</originTraceId>"
            java.lang.String r6 = "<originAid>%s</originAid>"
            java.lang.String r7 = "<originUxInfo>%s</originUxInfo>"
            java.lang.String r5 = ".originUxInfo"
            java.lang.String r9 = ".originSnsId"
            java.lang.String r8 = ", extraData is "
            java.lang.String r10 = ", selfUserName is "
            r16 = r2
            java.lang.String r2 = ", source is "
            r17 = r4
            java.lang.String r4 = "MicroMsg.SnsAdNativeLandingPagesUI.uxInfo"
            r18 = r3
            java.lang.String r3 = ">"
            r19 = r6
            java.lang.String r6 = "<"
            r20 = r15
            java.lang.String r15 = "."
            r21 = r7
            java.lang.String r7 = ", traceId="
            r22 = r3
            java.lang.String r3 = ".originAid"
            r23 = r6
            java.lang.String r6 = ".originTraceId"
            r24 = r7
            r25 = r8
            r8 = 1
            if (r13 == r8) goto L_0x0388
            r8 = 2
            if (r13 == r8) goto L_0x0388
            r8 = 16
            if (r13 == r8) goto L_0x0388
            r8 = 14
            if (r13 == r8) goto L_0x0388
            r8 = 9
            if (r13 == r8) goto L_0x0388
            r8 = 10
            if (r13 != r8) goto L_0x00ce
            r27 = r3
            r26 = r6
            r7 = r19
            r8 = r20
            r13 = r21
            r3 = r23
            r6 = r25
            r20 = r4
            r19 = r12
            r12 = r22
            goto L_0x039c
        L_0x00ce:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            java.lang.String r8 = r1.f277631y
            r13.append(r8)
            r13.append(r6)
            java.lang.String r8 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            java.lang.String r7 = r1.f277631y
            r13.append(r7)
            r13.append(r3)
            java.lang.String r7 = r13.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            r26 = r6
            java.lang.String r6 = r1.f277631y
            r13.append(r6)
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            ps2.z r6 = r1.f277551W
            java.util.Map<java.lang.String, java.lang.String> r13 = r1.f277585i1
            r27 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            r28 = r11
            java.lang.String r11 = r1.f277631y
            r3.append(r11)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r13.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r6.f295482a = r3
            ps2.z r3 = r1.f277551W
            java.util.Map<java.lang.String, java.lang.String> r6 = r1.f277585i1
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            r3.f295483b = r6
            ps2.z r3 = r1.f277551W
            java.lang.String r6 = r3.f295483b
            r1.f277533Q = r6
            java.lang.String r3 = r3.f295482a
            r1.f277522K = r3
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.f277585i1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r15)
            java.lang.String r9 = r1.f277631y
            r6.append(r9)
            java.lang.String r9 = ".originAdType"
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
            r1.f277542T = r3
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.f277585i1
            java.lang.Object r3 = r3.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            r1.f277603p0 = r3
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.f277585i1
            java.lang.Object r3 = r3.get(r8)
            java.lang.String r3 = (java.lang.String) r3
            r1.f277628x0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r14)
            java.lang.String r6 = r1.f277533Q
            r3.append(r6)
            r3.append(r2)
            int r6 = r1.f277508D
            r3.append(r6)
            r3.append(r10)
            r3.append(r0)
            r6 = r25
            r3.append(r6)
            java.lang.String r9 = r1.f277568c2
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.lang.String r3 = r1.f277635z
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0358
            java.lang.String r3 = r1.f277635z
            java.lang.String r9 = "ADInfo"
            r11 = 0
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r9, r11)
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.String r9 = r1.f277635z
            r13 = 0
            r11[r13] = r9
            java.lang.String r9 = "adInfoXml %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r9, r11)
            if (r3 == 0) goto L_0x0358
            java.lang.String r9 = ".ADInfo.uxInfo"
            java.lang.Object r9 = r3.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r11 = r28
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r11)
            r1.f277533Q = r9
            ps2.z r13 = r1.f277551W
            r13.f295483b = r9
            java.lang.String r9 = ".ADInfo.session_data.aid"
            java.lang.Object r9 = r3.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r11)
            r1.f277603p0 = r9
            java.lang.String r9 = ".ADInfo.session_data.trace_id"
            java.lang.Object r9 = r3.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r11)
            r1.f277628x0 = r9
            java.lang.String r9 = ".ADInfo.viewid"
            java.lang.Object r9 = r3.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r11)
            r1.f277625w1 = r9
            java.lang.String r9 = ".ADInfo.commInfo"
            java.lang.Object r3 = r3.get(r9)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r11)
            r1.f277629x1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "adInfoXml, aid = "
            r3.append(r9)
            java.lang.String r9 = r1.f277603p0
            r3.append(r9)
            java.lang.String r9 = ", uxInfo = "
            r3.append(r9)
            java.lang.String r9 = r1.f277533Q
            r3.append(r9)
            java.lang.String r9 = ", commInfo = "
            r3.append(r9)
            java.lang.String r9 = r1.f277629x1
            r3.append(r9)
            r13 = r24
            r3.append(r13)
            java.lang.String r9 = r1.f277628x0
            r3.append(r9)
            java.lang.String r9 = ", viewId="
            r3.append(r9)
            java.lang.String r9 = r1.f277625w1
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "openAdCanvasPage initData from adInfoXml, get uxInfo from adCanvasPage  is "
            r3.append(r9)
            java.lang.String r9 = r1.f277533Q
            r3.append(r9)
            r3.append(r2)
            int r2 = r1.f277508D
            r3.append(r2)
            r3.append(r10)
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = r1.f277568c2
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x033d }
            r0.<init>()     // Catch:{ all -> 0x033d }
            r3 = r23
            r0.append(r3)     // Catch:{ all -> 0x033d }
            java.lang.String r2 = r1.f277631y     // Catch:{ all -> 0x033d }
            r0.append(r2)     // Catch:{ all -> 0x033d }
            r2 = r22
            r0.append(r2)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x033d }
            java.lang.String r4 = r1.f277533Q     // Catch:{ all -> 0x033d }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x033d }
            if (r4 != 0) goto L_0x02c6
            java.util.Map<java.lang.String, java.lang.String> r4 = r1.f277585i1     // Catch:{ all -> 0x033d }
            boolean r4 = r4.containsKey(r5)     // Catch:{ all -> 0x033d }
            if (r4 != 0) goto L_0x02c6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x033d }
            r4.<init>()     // Catch:{ all -> 0x033d }
            r4.append(r0)     // Catch:{ all -> 0x033d }
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x033d }
            java.lang.String r5 = r1.f277533Q     // Catch:{ all -> 0x033d }
            r6 = 0
            r0[r6] = r5     // Catch:{ all -> 0x033d }
            r5 = r21
            java.lang.String r0 = java.lang.String.format(r5, r0)     // Catch:{ all -> 0x033d }
            r4.append(r0)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x033d }
        L_0x02c6:
            java.lang.String r4 = r1.f277628x0     // Catch:{ all -> 0x033d }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x033d }
            if (r4 != 0) goto L_0x02f3
            java.util.Map<java.lang.String, java.lang.String> r4 = r1.f277585i1     // Catch:{ all -> 0x033d }
            boolean r4 = r4.containsKey(r8)     // Catch:{ all -> 0x033d }
            if (r4 != 0) goto L_0x02f3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x033d }
            r4.<init>()     // Catch:{ all -> 0x033d }
            r4.append(r0)     // Catch:{ all -> 0x033d }
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x033d }
            java.lang.String r5 = r1.f277628x0     // Catch:{ all -> 0x033d }
            r6 = 0
            r0[r6] = r5     // Catch:{ all -> 0x033d }
            r8 = r20
            java.lang.String r0 = java.lang.String.format(r8, r0)     // Catch:{ all -> 0x033d }
            r4.append(r0)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x033d }
        L_0x02f3:
            java.lang.String r4 = r1.f277603p0     // Catch:{ all -> 0x033d }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x033d }
            if (r4 != 0) goto L_0x0320
            java.util.Map<java.lang.String, java.lang.String> r4 = r1.f277585i1     // Catch:{ all -> 0x033d }
            boolean r4 = r4.containsKey(r7)     // Catch:{ all -> 0x033d }
            if (r4 != 0) goto L_0x0320
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x033d }
            r4.<init>()     // Catch:{ all -> 0x033d }
            r4.append(r0)     // Catch:{ all -> 0x033d }
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x033d }
            java.lang.String r5 = r1.f277603p0     // Catch:{ all -> 0x033d }
            r6 = 0
            r0[r6] = r5     // Catch:{ all -> 0x033d }
            r7 = r19
            java.lang.String r0 = java.lang.String.format(r7, r0)     // Catch:{ all -> 0x033d }
            r4.append(r0)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x033d }
        L_0x0320:
            java.lang.String r4 = r1.f277627x     // Catch:{ all -> 0x033d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x033d }
            r5.<init>()     // Catch:{ all -> 0x033d }
            r5.append(r3)     // Catch:{ all -> 0x033d }
            java.lang.String r3 = r1.f277631y     // Catch:{ all -> 0x033d }
            r5.append(r3)     // Catch:{ all -> 0x033d }
            r5.append(r2)     // Catch:{ all -> 0x033d }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x033d }
            java.lang.String r0 = r4.replace(r2, r0)     // Catch:{ all -> 0x033d }
            r1.f277627x = r0     // Catch:{ all -> 0x033d }
            goto L_0x035c
        L_0x033d:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "replace landingPagesXml exp="
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x035c
        L_0x0358:
            r13 = r24
            r11 = r28
        L_0x035c:
            java.lang.String r0 = "<originAdCanvasExt>[\\s\\S]*</originAdCanvasExt>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.lang.String r2 = r1.f277627x
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r2 = r0.find()
            if (r2 == 0) goto L_0x0380
            java.lang.String r0 = r0.group()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0380
            java.lang.String r2 = "</?originAdCanvasExt>"
            java.lang.String r0 = r0.replaceAll(r2, r11)
            r1.f277545U = r0
        L_0x0380:
            r28 = r11
            r19 = r12
            r24 = r13
            goto L_0x0549
        L_0x0388:
            r27 = r3
            r26 = r6
            r7 = r19
            r8 = r20
            r13 = r21
            r3 = r23
            r6 = r25
            r19 = r12
            r12 = r22
            r20 = r4
        L_0x039c:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r1.f277582h1
            if (r4 == 0) goto L_0x03e7
            r25 = r6
            r21 = r7
            long r6 = r4.field_snsId
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r4 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            r22 = r6
            java.lang.String r6 = r1.f277520J
            java.lang.String r4 = r4.getSnsAid(r6)
            r1.f277603p0 = r4
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r4 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            java.lang.String r6 = r1.f277520J
            java.lang.String r4 = r4.getSnsTraceid(r6)
            r1.f277628x0 = r4
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r4 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            java.lang.String r6 = r1.f277520J
            int r4 = r4.getSnsAdType(r6)
            r1.f277542T = r4
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r4 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            java.lang.String r6 = r1.f277520J
            java.lang.String r4 = r4.getSnsUxInfo(r6)
            r1.f277533Q = r4
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r4 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            java.lang.String r6 = r1.f277520J
            java.lang.String r4 = r4.getSnsAdCanvasExtXml(r6)
            r1.f277545U = r4
            r6 = r22
            goto L_0x03ed
        L_0x03e7:
            r25 = r6
            r21 = r7
            r6 = 0
        L_0x03ed:
            java.lang.String r4 = r1.f277522K
            if (r4 == 0) goto L_0x03f2
            goto L_0x0401
        L_0x03f2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
        L_0x0401:
            java.util.Map<java.lang.String, java.lang.String> r6 = r1.f277585i1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r15)
            r28 = r11
            java.lang.String r11 = r1.f277631y
            r7.append(r11)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r6.put(r7, r4)
            java.util.Map<java.lang.String, java.lang.String> r6 = r1.f277585i1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r15)
            java.lang.String r9 = r1.f277631y
            r7.append(r9)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = r1.f277533Q
            r6.put(r5, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r6 = r1.f277631y
            r5.append(r6)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r9 = 0
            r7[r9] = r4
            java.lang.String r11 = "<originSnsId>%s</originSnsId>"
            java.lang.String r7 = java.lang.String.format(r11, r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r11 = r1.f277533Q
            r6[r9] = r11
            java.lang.String r6 = java.lang.String.format(r13, r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            int r11 = r1.f277542T
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6[r9] = r11
            java.lang.String r11 = "<originAdType>%d</originAdType>"
            java.lang.String r6 = java.lang.String.format(r11, r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r11 = r1.f277603p0
            r6[r9] = r11
            r11 = r21
            java.lang.String r6 = java.lang.String.format(r11, r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = r1.f277628x0
            r6[r9] = r5
            java.lang.String r5 = java.lang.String.format(r8, r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = r1.f277545U
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x04f7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r5 = r1.f277545U
            r8 = 0
            r7[r8] = r5
            java.lang.String r5 = "<originAdCanvasExt>%s</originAdCanvasExt>"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L_0x04f7:
            java.lang.String r6 = r1.f277627x
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = r1.f277631y
            r7.append(r3)
            r7.append(r12)
            java.lang.String r3 = r7.toString()
            java.lang.String r3 = r6.replace(r3, r5)
            r1.f277627x = r3
            ps2.z r3 = r1.f277551W
            java.lang.String r5 = r1.f277533Q
            r3.f295483b = r5
            r3.f295482a = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r14)
            java.lang.String r4 = r1.f277533Q
            r3.append(r4)
            r3.append(r2)
            int r2 = r1.f277508D
            r3.append(r2)
            r3.append(r10)
            r3.append(r0)
            r0 = r25
            r3.append(r0)
            java.lang.String r0 = r1.f277568c2
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x0549:
            r2 = 5
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r1.f277603p0
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = r1.f277628x0
            r3 = 1
            r0[r3] = r2
            int r2 = r1.f277542T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = r1.f277533Q
            r3 = 3
            r0[r3] = r2
            java.lang.String r2 = r1.f277545U
            r3 = 4
            r0[r3] = r2
            java.lang.String r2 = "reportInfo aid [%s],traceId [%s],adType [%s],uxInfo [%s],adCanvasExtXml [%s]"
            r3 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            java.lang.String r0 = r1.f277545U
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0601
            java.lang.String r0 = ".adCardItemList.cardItem"
            java.lang.String r2 = r1.f277545U
            java.lang.String r4 = "adCardItemList"
            r5 = 0
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r4, r5)
            if (r2 == 0) goto L_0x0601
            r4 = 0
        L_0x0587:
            if (r4 <= 0) goto L_0x0599
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            goto L_0x059a
        L_0x0599:
            r5 = r0
        L_0x059a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r7 = ".cardTpId"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            boolean r6 = r2.containsKey(r6)
            if (r6 != 0) goto L_0x05b2
            goto L_0x0601
        L_0x05b2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r7 = r28
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = ".cardExt"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r7)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 != 0) goto L_0x05fc
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r8 == 0) goto L_0x05f5
            goto L_0x05fc
        L_0x05f5:
            java.util.Map<java.lang.String, java.lang.String> r8 = r1.f277548V
            java.util.HashMap r8 = (java.util.HashMap) r8
            r8.put(r6, r5)
        L_0x05fc:
            int r4 = r4 + 1
            r28 = r7
            goto L_0x0587
        L_0x0601:
            r7 = r28
            ps2.z r0 = r1.f277551W
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r2 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            ps2.z r4 = r1.f277551W
            java.lang.String r4 = r4.f295482a
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r4)
            java.lang.String r2 = r2.getSnsStatExtBySnsId(r4)
            r0.f295495n = r2
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.shareTitle"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277514G = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.shareWebUrl"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277518I = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.shareDesc"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277516H = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.bizId"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r1.f277537R0 = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.shareAppId"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277540S0 = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.shareType"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277543T0 = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.userInfo"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277546U0 = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.disableShareBitSet"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r1.f277558Y0 = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.statusBarStyle"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r1.f277561Z0 = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "parsePageDownIconInfo"
            r5 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r8 = ".adCanvasInfo.arrowDownIconStyle.iconUrl"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L_0x07a7
            r8 = 0
            r1.f277555X0 = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            goto L_0x0880
        L_0x07a7:
            qs2.t0 r8 = r1.f277555X0
            if (r8 != 0) goto L_0x07b2
            qs2.t0 r8 = new qs2.t0
            r8.<init>()
            r1.f277555X0 = r8
        L_0x07b2:
            qs2.t0 r8 = r1.f277555X0
            r8.f296735a = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r8 = ".adCanvasInfo.sizeType"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            java.lang.String r9 = ".adCanvasInfo.basicRootFontSize"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.String r10 = ".adCanvasInfo.basicWidth"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r9)
            r10 = 1
            if (r8 != 0) goto L_0x080e
            if (r6 != r10) goto L_0x080e
            r8 = 10
        L_0x080e:
            if (r9 != 0) goto L_0x0814
            if (r6 != r10) goto L_0x0814
            r9 = 750(0x2ee, float:1.051E-42)
        L_0x0814:
            qs2.t0 r10 = r1.f277555X0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r12 = ".adCanvasInfo.arrowDownIconStyle.paddingBottom"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Object r11 = r0.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            double r11 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r11)
            float r11 = ps2.C100894u.m132234n(r11, r6, r9, r8)
            r10.f296738d = r11
            qs2.t0 r10 = r1.f277555X0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r12 = ".adCanvasInfo.arrowDownIconStyle.layoutWidth"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Object r11 = r0.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            double r11 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r11)
            float r11 = ps2.C100894u.m132234n(r11, r6, r9, r8)
            r10.f296736b = r11
            qs2.t0 r10 = r1.f277555X0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r2 = ".adCanvasInfo.arrowDownIconStyle.layoutHeight"
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            double r11 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)
            float r0 = ps2.C100894u.m132234n(r11, r6, r9, r8)
            r10.f296737c = r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x0880:
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r0 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            java.lang.String r0 = r0.getUin()
            r1.f277539S = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.officialSyncBuffer"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277549V0 = r0
            android.content.Intent r0 = r29.getIntent()
            int r2 = r1.f277542T
            java.lang.String r4 = "sns_landing_pages_adType"
            r0.putExtra(r4, r2)
            android.content.Intent r0 = r29.getIntent()
            ps2.z r2 = r1.f277551W
            java.lang.String r2 = r2.f295482a
            java.lang.String r4 = "sns_landing_pages_rawSnsId"
            r0.putExtra(r4, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.canvasDynamicInfo"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277566b2 = r0
            java.lang.String r0 = r1.f277603p0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0918
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            r4 = r27
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277603p0 = r0
        L_0x0918:
            java.lang.String r0 = r1.f277628x0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0944
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            r4 = r26
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277628x0 = r0
        L_0x0944:
            java.lang.String r0 = r1.f277603p0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x095a
            java.lang.String r0 = "try get aid from uxinfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.String r0 = r1.f277533Q
            java.lang.String r0 = vr2.C102260r.m134880t(r0)
            r1.f277603p0 = r0
        L_0x095a:
            java.lang.String r0 = r1.f277628x0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0970
            java.lang.String r0 = "try get traceId from uxinfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.String r0 = r1.f277533Q
            java.lang.String r0 = vr2.C102260r.m134834C(r0)
            r1.f277628x0 = r0
        L_0x0970:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "aid="
            r0.append(r2)
            java.lang.String r2 = r1.f277603p0
            r0.append(r2)
            r2 = r24
            r0.append(r2)
            java.lang.String r2 = r1.f277628x0
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.String r0 = r1.f277533Q
            java.lang.String r0 = vr2.C102260r.m134833B(r0)
            r1.f277535Q1 = r0
            ps2.u$a r0 = new ps2.u$a
            java.lang.String r2 = r1.f277627x
            java.lang.String r4 = r1.f277631y
            r0.<init>(r2, r4, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            int r4 = r1.f277508D
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            long r8 = r0.f295469i
            int r4 = (int) r8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "snsId="
            r6.append(r8)
            java.lang.String r8 = r1.f277522K
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "landing_page_parse_xml_cost"
            r9 = 0
            vr2.C37817q.m41546b(r8, r2, r4, r9, r6)
            java.util.LinkedList<ps2.l> r2 = r0.f295461a
            r1.f277569d = r2
            qs2.e0 r2 = r0.f295462b
            r1.f277572e = r2
            qs2.q0 r2 = r0.f295468h
            java.lang.String r4 = "initDownloadAppLawInfoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            if (r2 == 0) goto L_0x0a03
            android.widget.FrameLayout r6 = r1.f277577f2
            if (r6 != 0) goto L_0x09f8
            r6 = 2131304943(0x7f0921ef, float:1.8228043E38)
            android.view.View r6 = r1.findViewById(r6)
            android.view.ViewStub r6 = (android.view.ViewStub) r6
            if (r6 == 0) goto L_0x09f8
            android.view.View r6 = r6.inflate()
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r1.f277577f2 = r6
        L_0x09f8:
            android.widget.FrameLayout r6 = r1.f277577f2
            if (r6 == 0) goto L_0x0a03
            r8 = 0
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r2 = com.tencent.p014mm.plugin.sns.p106ui.C96328z2.m123559a(r1, r2, r6, r8)
            r1.f277583h2 = r2
        L_0x0a03:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.lang.String r2 = "initFloatBarView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            qs2.e0 r4 = r1.f277572e
            if (r4 == 0) goto L_0x0a66
            android.widget.FrameLayout r4 = r1.f277565b1
            if (r4 == 0) goto L_0x0a66
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper r4 = r1.f277610r1
            if (r4 != 0) goto L_0x0a66
            android.widget.FrameLayout r4 = r1.f277574e2
            if (r4 != 0) goto L_0x0a2e
            r4 = 2131304986(0x7f09221a, float:1.822813E38)
            android.view.View r4 = r1.findViewById(r4)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            if (r4 == 0) goto L_0x0a2e
            android.view.View r4 = r4.inflate()
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r1.f277574e2 = r4
        L_0x0a2e:
            android.widget.FrameLayout r4 = r1.f277574e2
            if (r4 != 0) goto L_0x0a36
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            goto L_0x0a69
        L_0x0a36:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper r6 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper
            qs2.e0 r8 = r1.f277572e
            r6.<init>(r1, r8, r4)
            r1.f277610r1 = r6
            boolean r4 = r6.mo131506O()
            if (r4 != 0) goto L_0x0a4b
            r4 = 0
            r8 = 0
            r1.mo132547s8(r4, r8)
        L_0x0a4b:
            qs2.e0 r4 = r1.f277572e
            qs2.a0 r4 = r4.f296572K
            boolean r6 = r4 instanceof qs2.C101287r
            if (r6 == 0) goto L_0x0a66
            qs2.r r4 = (qs2.C101287r) r4
            java.lang.String r6 = r4.f296689A
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0a66
            java.util.Collection<java.lang.String> r6 = r1.f277622v1
            java.lang.String r4 = r4.f296689A
            java.util.HashSet r6 = (java.util.HashSet) r6
            r6.add(r4)
        L_0x0a66:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
        L_0x0a69:
            java.lang.String r2 = "initFloatWebView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            qs2.e r4 = r0.f295463c     // Catch:{ all -> 0x0a85 }
            if (r4 == 0) goto L_0x0a85
            android.widget.FrameLayout r6 = r1.f277580g2     // Catch:{ all -> 0x0a85 }
            if (r6 == 0) goto L_0x0a85
            com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper r4 = com.tencent.p014mm.plugin.sns.p106ui.helper.FloatWebViewHelper.m122670b(r4, r6)     // Catch:{ all -> 0x0a85 }
            r1.f277511E1 = r4     // Catch:{ all -> 0x0a85 }
            androidx.lifecycle.j r4 = r29.getLifecycle()     // Catch:{ all -> 0x0a85 }
            com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper r6 = r1.f277511E1     // Catch:{ all -> 0x0a85 }
            r4.addObserver(r6)     // Catch:{ all -> 0x0a85 }
        L_0x0a85:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            java.lang.String r2 = "initFloatPageView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            java.lang.String r4 = "ensureFloatCompHelperManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)     // Catch:{ all -> 0x0a9e }
            xo2.a r6 = r1.f277607q1     // Catch:{ all -> 0x0a9e }
            if (r6 != 0) goto L_0x0aa0
            xo2.a r6 = new xo2.a     // Catch:{ all -> 0x0a9e }
            r6.<init>()     // Catch:{ all -> 0x0a9e }
            r1.f277607q1 = r6     // Catch:{ all -> 0x0a9e }
            goto L_0x0aa0
        L_0x0a9e:
            goto L_0x0af4
        L_0x0aa0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch:{ all -> 0x0a9e }
            xo2.a r4 = r1.f277607q1     // Catch:{ all -> 0x0a9e }
            if (r4 == 0) goto L_0x0af4
            java.lang.String r6 = "createFloatPageViewHelper"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)     // Catch:{ all -> 0x0a9e }
            xo2.b r11 = new xo2.b     // Catch:{ all -> 0x0ab9 }
            r11.<init>(r0)     // Catch:{ all -> 0x0ab9 }
            r4.f303324b = r11     // Catch:{ all -> 0x0ab9 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)     // Catch:{ all -> 0x0a9e }
            goto L_0x0abd
        L_0x0ab9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)     // Catch:{ all -> 0x0a9e }
            r11 = 0
        L_0x0abd:
            if (r11 == 0) goto L_0x0af4
            android.widget.FrameLayout r4 = r1.f277580g2     // Catch:{ all -> 0x0a9e }
            r6 = 0
            r11.mo142510a(r4, r6)     // Catch:{ all -> 0x0a9e }
            java.lang.String r4 = "showFloatPageViewIfAttached"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)     // Catch:{ all -> 0x0a9e }
            com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView r8 = r11.f303327c     // Catch:{ all -> 0x0af1 }
            if (r8 == 0) goto L_0x0ae9
            java.lang.String r9 = "playEnterAnimation"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)     // Catch:{ all -> 0x0af1 }
            boolean r11 = r8.f281479n     // Catch:{ all -> 0x0af1 }
            if (r11 != 0) goto L_0x0ae5
            android.animation.AnimatorSet r11 = r8.f281482q     // Catch:{ all -> 0x0af1 }
            r11.start()     // Catch:{ all -> 0x0af1 }
            r11 = 1
            r8.f281479n = r11     // Catch:{ all -> 0x0af1 }
        L_0x0ae5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)     // Catch:{ all -> 0x0af1 }
            goto L_0x0af1
        L_0x0ae9:
            java.lang.String r8 = "SnsAd.FloatPageHelper"
            java.lang.String r9 = "the float view is null, is it attached??"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r9)     // Catch:{ all -> 0x0af1 }
        L_0x0af1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)     // Catch:{ all -> 0x0a9e }
        L_0x0af4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            r1.mo132551w8(r0)
            r1.mo132552x8(r0)
            r1.mo132553y8(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            qs2.e0 r4 = r0.f295462b
            if (r4 == 0) goto L_0x0b0c
            lo2.C99520a0.m129873c(r4, r2)
        L_0x0b0c:
            so2.j r4 = r0.f295464d
            if (r4 == 0) goto L_0x0b13
            lo2.C99520a0.m129873c(r4, r2)
        L_0x0b13:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0b33
            boolean r4 = r1.f277521J1
            java.util.HashSet<java.lang.String> r6 = lo2.C99520a0.f291755a
            java.lang.String r6 = "checkPreloadWeAppEnvForNativeLandingPage"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
            zt3.t r9 = zt3.C119157j.f356862d
            lo2.z r10 = new lo2.z
            r10.<init>(r2, r4)
            zt3.j r9 = (zt3.C119157j) r9
            r9.mo183875f(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
        L_0x0b33:
            qs2.e0 r2 = r0.f295462b
            if (r2 == 0) goto L_0x0b3e
            java.lang.String r4 = r1.f277520J
            int r6 = r1.f277508D
            lo2.C99544i0.m129920g(r4, r6, r2)
        L_0x0b3e:
            so2.j r0 = r0.f295464d
            if (r0 == 0) goto L_0x0b49
            java.lang.String r2 = r1.f277520J
            int r4 = r1.f277508D
            lo2.C99544i0.m129920g(r2, r4, r0)
        L_0x0b49:
            java.util.LinkedList<ps2.l> r0 = r1.f277569d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0bbb
            java.util.LinkedList<ps2.l> r0 = r1.f277569d
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            ps2.l r0 = (ps2.C100882l) r0
            java.util.LinkedList<qs2.a0> r4 = r0.f295429d
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0bbb
            java.util.LinkedList<qs2.a0> r0 = r0.f295429d
            java.lang.Object r0 = r0.get(r2)
            qs2.a0 r0 = (qs2.C101255a0) r0
            boolean r2 = r0 instanceof qs2.C101294u
            if (r2 == 0) goto L_0x0b75
            qs2.u r0 = (qs2.C101294u) r0
            java.lang.String r0 = r0.f296747z
            r1.f277512F = r0
            goto L_0x0bbb
        L_0x0b75:
            boolean r2 = r0 instanceof qs2.C101292t
            if (r2 == 0) goto L_0x0b80
            qs2.t r0 = (qs2.C101292t) r0
            java.lang.String r0 = r0.f296734z
            r1.f277512F = r0
            goto L_0x0bbb
        L_0x0b80:
            boolean r2 = r0 instanceof qs2.C101297w
            if (r2 == 0) goto L_0x0b8b
            qs2.w r0 = (qs2.C101297w) r0
            java.lang.String r0 = r0.f296754A
            r1.f277512F = r0
            goto L_0x0bbb
        L_0x0b8b:
            boolean r2 = r0 instanceof qs2.C101280m0
            if (r2 == 0) goto L_0x0bbb
            qs2.m0 r0 = (qs2.C101280m0) r0
            java.util.LinkedList<qs2.s> r2 = r0.f296664z
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0bbb
            java.util.LinkedList<qs2.s> r0 = r0.f296664z
            java.lang.Object r0 = r0.getFirst()
            qs2.s r0 = (qs2.C101290s) r0
            java.util.LinkedList<qs2.a0> r2 = r0.f296728z
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0bbb
            java.util.LinkedList<qs2.a0> r0 = r0.f296728z
            java.lang.Object r0 = r0.getFirst()
            qs2.a0 r0 = (qs2.C101255a0) r0
            boolean r2 = r0 instanceof qs2.C101294u
            if (r2 == 0) goto L_0x0bbb
            qs2.u r0 = (qs2.C101294u) r0
            java.lang.String r0 = r0.f296747z
            r1.f277512F = r0
        L_0x0bbb:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.rightBarTitle"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277499A = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.rightBarCanvasId"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277502B = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f277585i1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r4 = r1.f277631y
            r2.append(r4)
            java.lang.String r4 = ".adCanvasInfo.rightBarCanvasExt"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
            r1.f277505C = r0
            r2 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
        L_0x0c2c:
            boolean r0 = r1.f277612s
            if (r0 == 0) goto L_0x0c7d
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = r1.f277519I1
            boolean r0 = r0.mo130358l()
            if (r0 == 0) goto L_0x0c79
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = r1.f277519I1
            r0.getClass()
            java.lang.String r2 = "isShowSimpleShakeAnim"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            boolean r0 = r0.f274101l
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0c4f
            goto L_0x0c68
        L_0x0c4f:
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = r1.f277519I1
            r0.getClass()
            java.lang.String r2 = "isLongPressAnim"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            boolean r0 = r0.f274103n
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            if (r0 == 0) goto L_0x0c68
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper r0 = r1.f277519I1
            int r0 = r0.mo130359p()
            long r8 = (long) r0
        L_0x0c68:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$a r2 = new com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$a
            r2.<init>()
            zt3.j r0 = (zt3.C119157j) r0
            r0.getClass()
            r4 = 0
            r0.mo183892w(r2, r8, r4)
            goto L_0x0c80
        L_0x0c79:
            r29.mo132499H8()
            goto L_0x0c80
        L_0x0c7d:
            r29.mo132500I8()
        L_0x0c80:
            r29.mo132505N8()
            java.lang.String r0 = "reportEnter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
            int r2 = r1.f277557Y
            r4 = 2
            if (r2 == r4) goto L_0x0ce0
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 14655(0x393f, float:2.0536E-41)
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]
            ps2.z r8 = r1.f277551W
            java.lang.String r8 = r8.f295482a
            long r8 = vr2.C102236a0.m134706B0(r8)
            java.lang.String r8 = vr2.C102236a0.m134765q0(r8)
            r9 = 0
            r6[r9] = r8
            java.lang.String r8 = r1.f277533Q
            if (r8 != 0) goto L_0x0caa
            r11 = r7
            goto L_0x0cab
        L_0x0caa:
            r11 = r8
        L_0x0cab:
            r7 = 1
            r6[r7] = r11
            ps2.z r7 = r1.f277551W
            int r7 = r7.f295484c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 2
            r6[r8] = r7
            ps2.z r7 = r1.f277551W
            int r7 = r7.f295486e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 3
            r6[r8] = r7
            long r7 = r1.f277531P
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 4
            r6[r8] = r7
            int r7 = r1.f277510E
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 5
            r6[r8] = r7
            r7 = 6
            ps2.z r8 = r1.f277551W
            java.lang.String r8 = r8.f295499r
            r6[r7] = r8
            r2.mo160131h(r4, r6)
        L_0x0ce0:
            int r2 = r1.f277508D
            boolean r2 = mp2.C34628a.m40410c(r2)
            if (r2 == 0) goto L_0x0cf9
            android.os.Bundle r2 = r1.f277609r
            if (r2 != 0) goto L_0x0cf4
            java.lang.String r2 = r1.f277530O1
            r3 = 8
            mp2.C34628a.m40411d(r2, r3)
            goto L_0x0cf9
        L_0x0cf4:
            java.lang.String r2 = "OpenSdkAdHelper, skip adOpenSucc report, for re open"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x0cf9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
            r29.mo132521X8()
            r2 = 1
            r1.mo132523Y8(r2)
            r1.f277573e1 = r2
            r29.mo132516V7()
            java.lang.String r0 = "checkNativeLandingPageAbuse"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r6 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            ps2.z r2 = r1.f277551W
            java.lang.String r7 = r2.f295499r
            java.lang.String r8 = r1.f277538R1
            java.lang.String r9 = r1.f277533Q
            int r10 = r1.f277508D
            java.lang.String r11 = r1.f277509D1
            com.tencent.mm.plugin.sns.ui.b3 r12 = new com.tencent.mm.plugin.sns.ui.b3
            r12.<init>(r1)
            r6.doAdNativeAntiAbuseScene(r7, r8, r9, r10, r11, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
            boolean r0 = r1.f277618u
            if (r0 == 0) goto L_0x0d38
            boolean r0 = r1.f277621v
            if (r0 != 0) goto L_0x0d38
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r0 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            r2 = 1
            r0.setHalfScreenLandingPageShow(r2)
        L_0x0d38:
            r2 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.mo132549u8():void");
    }

    /* renamed from: v8 */
    public void mo132550v8() {
        SnsMethodCalculate.markStartTimeMs("initCfgBlackFixDevList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (!TextUtils.isEmpty(this.f277591k2)) {
            SnsMethodCalculate.markEndTimeMs("initCfgBlackFixDevList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        try {
            this.f277591k2 = Util.nullAsNil(((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_ad_landing_black_fix_device_list, "").toLowerCase());
            Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "initCfgBlackFixDevList, devList=" + this.f277591k2);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "initCfgBlackFixDevList, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initCfgBlackFixDevList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: w8 */
    public final void mo132551w8(C100894u.C100895a aVar) {
        C101675j jVar;
        FrameLayout frameLayout;
        C102702a aVar2;
        SnsMethodCalculate.markStartTimeMs("initFloatJump", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            SnsMethodCalculate.markStartTimeMs("ensureFloatCompHelperManager", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (this.f277607q1 == null) {
                this.f277607q1 = new C102702a();
            }
            SnsMethodCalculate.markEndTimeMs("ensureFloatCompHelperManager", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (!(aVar == null || (jVar = aVar.f295464d) == null || (frameLayout = this.f277580g2) == null || (aVar2 = this.f277607q1) == null)) {
                SnsMethodCalculate.markStartTimeMs("createFloatJumpCompHelper", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperManager");
                FloatJumpCompHelper floatJumpCompHelper = null;
                FloatJumpCompHelper floatJumpCompHelper2 = new FloatJumpCompHelper(jVar, frameLayout);
                int i = jVar.f296505k;
                ((ConcurrentHashMap) aVar2.f303323a).put(Integer.valueOf(i), floatJumpCompHelper2);
                SnsMethodCalculate.markEndTimeMs("createFloatJumpCompHelper", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperManager");
                floatJumpCompHelper = floatJumpCompHelper2;
                if (floatJumpCompHelper != null) {
                    this.f277501A2 = floatJumpCompHelper;
                    getLifecycle().addObserver(floatJumpCompHelper);
                    C101287r rVar = aVar.f295464d.f297627C;
                    if (rVar != null) {
                        String str = rVar.f296689A;
                        if (!TextUtils.isEmpty(str)) {
                            ((HashSet) this.f277622v1).add(str);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("initFloatJump", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* renamed from: x8 */
    public final void mo132552x8(C100894u.C100895a aVar) {
        SnsMethodCalculate.markStartTimeMs("initFloatLinearLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            if (aVar.f295466f == null) {
                SnsMethodCalculate.markEndTimeMs("initFloatLinearLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return;
            }
            Map<String, String> map = this.f277585i1;
            int safeParseInt = Util.safeParseInt(map.get("." + this.f277631y + ".adCanvasInfo.sizeType"));
            Map<String, String> map2 = this.f277585i1;
            int safeParseInt2 = Util.safeParseInt(map2.get("." + this.f277631y + ".adCanvasInfo.basicRootFontSize"));
            Map<String, String> map3 = this.f277585i1;
            int safeParseInt3 = Util.safeParseInt(map3.get("." + this.f277631y + ".adCanvasInfo.basicWidth"));
            C95243v0 v0Var = new C95243v0(this, aVar.f295466f, this.f277580g2, safeParseInt, (safeParseInt3 == 0 && safeParseInt == 1) ? 750 : safeParseInt3, (safeParseInt2 == 0 && safeParseInt == 1) ? 10 : safeParseInt2, this.f277547U1);
            this.f277544T1 = v0Var;
            v0Var.mo131765G();
            SnsMethodCalculate.markEndTimeMs("initFloatLinearLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        } catch (Throwable th) {
            Log.m105918d("MicroMsg.SnsAdNativeLandingPagesUI", "initFloatLinearLayout error with: t = [" + th + "]");
        }
    }

    /* renamed from: y8 */
    public final void mo132553y8(C100894u.C100895a aVar) {
        int i;
        SnsMethodCalculate.markStartTimeMs("initToolBarVoiceBtn", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C101665a aVar2 = aVar.f295467g;
        if (aVar2 == null) {
            SnsMethodCalculate.markEndTimeMs("initToolBarVoiceBtn", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        String str = null;
        this.f277550V1 = new C95066b0(this, aVar2, (ViewGroup) null, this.f277524L);
        Drawable drawable = this.f277578g.getDrawable();
        int i2 = 102;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            i2 = drawable.getIntrinsicHeight();
            i = intrinsicWidth;
        } else {
            Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "initToolBarVoiceBtn() get drawable wh error!");
            i = 102;
        }
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "initToolBarVoiceBtn() moreBtnHeight = " + i2 + " , moreBtnWidth = " + i);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.mj_);
        imageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams.height = i2;
            layoutParams.width = i;
            ((FrameLayout.LayoutParams) layoutParams).rightMargin = i + C76577a.m92151b(getContext(), 12);
        }
        C95066b0 b0Var = this.f277550V1;
        b0Var.getClass();
        SnsMethodCalculate.markStartTimeMs("initComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        b0Var.f275932A = new C97621e();
        Context context = b0Var.f275940s;
        C0125s sVar = context instanceof C0125s ? (C0125s) context : null;
        if (sVar == null) {
            SnsMethodCalculate.markEndTimeMs("initComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        } else {
            if (b0Var.mo131575H()) {
                imageView.setImageDrawable(C76577a.m92158i(context, C0966R.raw.icon_volume_on));
            } else {
                imageView.setImageDrawable(C76577a.m92158i(context, C0966R.raw.icon_volume_off));
            }
            imageView.setOnClickListener(new C95046a0(b0Var, imageView, context));
            String a = C88913c.m111003a("sns_ad_landing_page_ui", C31443g.m39405a());
            C87412m.m108593f(a, "createAudioPlayer(appid,…rator.genAudioPlayerId())");
            b0Var.f275944w = a;
            String str2 = b0Var.f275939H;
            Log.m105924i(str2, "snsvoice  create mBgmVoiceAudioPlayerId = [" + b0Var.f275944w + ']');
            if (b0Var.mo131575H()) {
                C88912b bVar = new C88912b();
                bVar.f256416a = b0Var.f275944w;
                try {
                    C101665a aVar3 = b0Var.f275941t;
                    if (aVar3 != null) {
                        str = aVar3.f297593z;
                    }
                    if (str == null) {
                        str = "";
                    }
                    bVar.f256417b = str;
                    bVar.f256423h = false;
                    bVar.f256422g = true;
                    C88913c.m111010h(bVar);
                } catch (Exception e) {
                    Log.m105921e(b0Var.f275939H, "snsvoice initToolBarVoiceBtn() called", e);
                }
            } else {
                b0Var.f275947z = true;
            }
            AdLandingPageBgmVoiceComponent$initComp$2 adLandingPageBgmVoiceComponent$initComp$2 = new AdLandingPageBgmVoiceComponent$initComp$2(sVar, b0Var, imageView, context);
            b0Var.f275933B = adLandingPageBgmVoiceComponent$initComp$2;
            adLandingPageBgmVoiceComponent$initComp$2.alive();
            if (b0Var.mo131575H()) {
                b0Var.f275945x = true;
            }
            SnsMethodCalculate.markEndTimeMs("initComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        }
        SnsMethodCalculate.markEndTimeMs("initToolBarVoiceBtn", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }
}
