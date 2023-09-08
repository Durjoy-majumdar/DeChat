package com.tencent.p014mm.plugin.shake.p103ui;

import al3.C0086a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bh3.C113177k;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ShakeActionReportStruct;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.shake.shakecard.p321ui.ShakeCardDialog;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileHdHeadImg;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72991u4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31461f3;
import eb0.C97625j3;
import f12.C7970a;
import f40.C86709a0;
import fd0.C75743h;
import gc0.C20828a;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jn2.C21268a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kn2.C10366a;
import l20.C21388a;
import la2.C99364n;
import nc0.C76850a;
import nj3.C34861g1;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import nn2.C21685l;
import nn2.C34935h;
import nn2.C34936i;
import nn2.C47288f;
import nn2.C76942m;
import p140cw.C7138g;
import p182kk.C61104a;
import p196ln.C76705f;
import p214om.C11502f;
import p327ct.C30914c;
import p447aw.C103918d;
import p529fv.C59326j;
import p755xs.C102720b;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C77328l;
import qg0.C12215a;
import qn2.C22119d;
import qn2.C22120e;
import qn2.C22121g;
import qn2.C77376f;
import qo3.C77389a;
import qo3.C77390c0;
import qo3.C77398g;
import rn2.C77542a;
import sf0.C101594c0;
import sn2.C22376m;
import sn2.C22377p;
import sn2.C36746a0;
import sn2.C36747b0;
import sn2.C48438k;
import sn2.C48446r;
import sn2.C48447s;
import ud3.C101998d;
import un2.C78239b;
import vo3.C90852c;
import zt3.C119157j;
import zt3.C119179t;

@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeReportUI */
public class ShakeReportUI extends MMActivity implements C31461f3, C21685l.C21686a, MStorageEx.IOnStorageChange, MStorage.IOnStorageChange, C101594c0.C101595a, C77376f.C77377a {

    /* renamed from: I1 */
    public static List<C48438k.C48443e> f54068I1 = new CopyOnWriteArrayList();

    /* renamed from: A */
    public Animation f54069A;

    /* renamed from: A1 */
    public C92411b f54070A1;

    /* renamed from: B */
    public Animation f54071B;

    /* renamed from: B1 */
    public C92411b.C92412a f54072B1 = new C92411b.C92412a() {
        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            if (z) {
                Log.m105918d("MicroMsg.ShakeReportUI", "on location get ok");
                C85801v1 u = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SHAKE_TV_LATITUDE_STRING;
                StringBuilder sb = new StringBuilder();
                float f3 = f2;
                sb.append(f2);
                sb.append("");
                u.mo119677K(aVar, sb.toString());
                C85801v1 u2 = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_SHAKE_TV_LONGTITUDE_STRING;
                StringBuilder sb4 = new StringBuilder();
                float f4 = f;
                sb4.append(f);
                sb4.append("");
                u2.mo119677K(aVar2, sb4.toString());
                C85801v1 u3 = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_SHAKE_TV_ACCURACY_STRING;
                u3.mo119677K(aVar3, d2 + "");
                ShakeReportUI shakeReportUI = ShakeReportUI.this;
                shakeReportUI.f54160z1 = true;
                C92411b bVar = shakeReportUI.f54070A1;
                if (bVar == null) {
                    return false;
                }
                bVar.mo126408b(shakeReportUI.f54072B1);
                return false;
            }
            if (!ShakeReportUI.this.f54158y1 && !LocationUtil.isGpsEnable()) {
                ShakeReportUI shakeReportUI2 = ShakeReportUI.this;
                shakeReportUI2.f54158y1 = true;
                C76879j.m92709C(shakeReportUI2, shakeReportUI2.getString(C0966R.string.fez), ShakeReportUI.this.getString(C0966R.string.a3h), ShakeReportUI.this.getString(C0966R.string.fyd), ShakeReportUI.this.getString(C0966R.string.f7926wf), false, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        LocationUtil.jumpToOpenGps(ShakeReportUI.this);
                    }
                }, (DialogInterface.OnClickListener) null);
            }
            Log.m105928w("MicroMsg.ShakeReportUI", "getLocation fail");
            return false;
        }
    };

    /* renamed from: C */
    public Animation f54073C;

    /* renamed from: C1 */
    public C101106m f54074C1;

    /* renamed from: D */
    public Animation f54075D;

    /* renamed from: D1 */
    public int f54076D1;

    /* renamed from: E */
    public Animation f54077E;

    /* renamed from: E1 */
    public boolean f54078E1;

    /* renamed from: F */
    public Animation f54079F;

    /* renamed from: F1 */
    public long f54080F1;

    /* renamed from: G */
    public Animation f54081G;

    /* renamed from: G1 */
    public IListener f54082G1;

    /* renamed from: H */
    public Animation f54083H;

    /* renamed from: H1 */
    public View.OnClickListener f54084H1;

    /* renamed from: I */
    public boolean f54085I = false;

    /* renamed from: J */
    public int f54086J = 1;

    /* renamed from: K */
    public View f54087K;

    /* renamed from: L */
    public View f54088L;

    /* renamed from: M */
    public View f54089M;

    /* renamed from: N */
    public View f54090N;

    /* renamed from: P */
    public View f54091P;

    /* renamed from: Q */
    public AnimatorSet f54092Q;

    /* renamed from: Q0 */
    public WeImageView f54093Q0;

    /* renamed from: R */
    public AnimatorSet f54094R;

    /* renamed from: R0 */
    public WeImageView f54095R0;

    /* renamed from: S */
    public AnimatorSet f54096S;

    /* renamed from: S0 */
    public WeImageView f54097S0;

    /* renamed from: T */
    public Boolean f54098T = Boolean.FALSE;

    /* renamed from: T0 */
    public View f54099T0 = null;

    /* renamed from: U */
    public C22376m f54100U;

    /* renamed from: U0 */
    public View f54101U0 = null;

    /* renamed from: V */
    public MMAnimateView f54102V;

    /* renamed from: V0 */
    public MMImageView f54103V0 = null;

    /* renamed from: W */
    public MMAnimateView f54104W;

    /* renamed from: W0 */
    public TextView f54105W0 = null;

    /* renamed from: X */
    public ImageView f54106X;

    /* renamed from: X0 */
    public ImageView f54107X0 = null;

    /* renamed from: Y */
    public boolean f54108Y;

    /* renamed from: Y0 */
    public String f54109Y0 = "";

    /* renamed from: Z */
    public TextView f54110Z;

    /* renamed from: Z0 */
    public Bitmap f54111Z0 = null;

    /* renamed from: a1 */
    public Dialog f54112a1;

    /* renamed from: b1 */
    public C47288f f54113b1 = null;

    /* renamed from: c1 */
    public WeImageView f54114c1;

    /* renamed from: d */
    public boolean f54115d = false;

    /* renamed from: d1 */
    public TextView f54116d1;

    /* renamed from: e */
    public boolean f54117e = false;

    /* renamed from: e1 */
    public WeImageView f54118e1;

    /* renamed from: f */
    public boolean f54119f;

    /* renamed from: f1 */
    public TextView f54120f1;

    /* renamed from: g */
    public boolean f54121g = false;

    /* renamed from: g1 */
    public ImageView f54122g1;

    /* renamed from: h */
    public boolean f54123h = false;

    /* renamed from: h1 */
    public int f54124h1 = 1;

    /* renamed from: i */
    public boolean f54125i = false;

    /* renamed from: i1 */
    public ImageView f54126i1;

    /* renamed from: j */
    public int f54127j = 22;

    /* renamed from: j1 */
    public View f54128j1;

    /* renamed from: k1 */
    public ImageView f54129k1;

    /* renamed from: l1 */
    public ImageView f54130l1;

    /* renamed from: m1 */
    public ImageView f54131m1;

    /* renamed from: n */
    public C101998d f54132n;

    /* renamed from: n1 */
    public ImageView f54133n1;

    /* renamed from: o */
    public C19235c f54134o;

    /* renamed from: o1 */
    public View f54135o1;

    /* renamed from: p */
    public C21685l f54136p = new C21685l();

    /* renamed from: p0 */
    public TextView f54137p0;

    /* renamed from: p1 */
    public View f54138p1;

    /* renamed from: q */
    public View f54139q;

    /* renamed from: q1 */
    public View f54140q1;

    /* renamed from: r */
    public View f54141r;

    /* renamed from: r1 */
    public View f54142r1;

    /* renamed from: s */
    public TextView f54143s;

    /* renamed from: s1 */
    public int f54144s1 = 0;

    /* renamed from: t */
    public TextView f54145t;

    /* renamed from: t1 */
    public ShakeCardDialog f54146t1;

    /* renamed from: u */
    public TextView f54147u;

    /* renamed from: u1 */
    public boolean f54148u1 = false;

    /* renamed from: v */
    public View f54149v;

    /* renamed from: v1 */
    public Map<Integer, Boolean> f54150v1 = new HashMap();

    /* renamed from: w */
    public View f54151w;

    /* renamed from: w1 */
    public boolean f54152w1 = true;

    /* renamed from: x */
    public View f54153x;

    /* renamed from: x0 */
    public int f54154x0;

    /* renamed from: x1 */
    public boolean f54155x1 = false;

    /* renamed from: y */
    public View f54156y;

    /* renamed from: y0 */
    public WeImageView f54157y0;

    /* renamed from: y1 */
    public boolean f54158y1;

    /* renamed from: z */
    public Animation f54159z;

    /* renamed from: z1 */
    public boolean f54160z1 = false;

    /* renamed from: com.tencent.mm.plugin.shake.ui.ShakeReportUI$SensorListener */
    public static class SensorListener extends C101998d.C101999a {

        /* renamed from: d */
        public long f54181d = Util.currentTicks();

        /* renamed from: e */
        public WeakReference<ShakeReportUI> f54182e;

        /* renamed from: f */
        public Vibrator f54183f;

        /* renamed from: g */
        public final long[] f54184g = {300, 200, 300, 200};

        public SensorListener(ShakeReportUI shakeReportUI) {
            this.f54182e = new WeakReference<>(shakeReportUI);
        }

        public void onRelease() {
        }

        public void onShake(boolean z) {
            Animation animation;
            Animation animation2;
            TextView textView;
            ShakeReportUI shakeReportUI = this.f54182e.get();
            if (shakeReportUI != null) {
                if (shakeReportUI.isFinishing()) {
                    Log.m105920e("MicroMsg.ShakeReportUI", "ui finished");
                } else if (!shakeReportUI.f54125i) {
                    Log.m105924i("MicroMsg.ShakeReportUI", "tryShake the status is can's shake");
                } else {
                    ShakeCardDialog shakeCardDialog = shakeReportUI.f54146t1;
                    if (shakeCardDialog != null && shakeCardDialog.isShowing()) {
                        shakeReportUI.f54146t1.dismiss();
                    }
                    shakeReportUI.f54146t1 = null;
                    int i = shakeReportUI.f54124h1;
                    if (i == 1 ? shakeReportUI.mo24629I7() : (i == 2 || i == 3) ? shakeReportUI.mo24630J7() : true) {
                        long ticksToNow = Util.ticksToNow(this.f54181d);
                        if (ticksToNow < 1200) {
                            Log.m105924i("MicroMsg.ShakeReportUI", "tryStartShake delay too short:" + ticksToNow);
                            return;
                        }
                        Log.m105928w("MicroMsg.ShakeReportUI", "tryStartShake delaytoo enough:" + ticksToNow);
                        this.f54181d = Util.currentTicks();
                        C19235c cVar = shakeReportUI.f54134o;
                        if (cVar != null) {
                            View view = cVar.f54198a;
                            if (view != null) {
                                view.setKeepScreenOn(true);
                            }
                            cVar.f54199b.startTimer(30000);
                        }
                        if (!shakeReportUI.f54123h) {
                            if (shakeReportUI.f54119f) {
                                ShakeReportUI shakeReportUI2 = this.f54182e.get();
                                if (shakeReportUI2 != null) {
                                    PlaySound.play(shakeReportUI2, C0966R.string.j5q);
                                }
                            } else {
                                ShakeReportUI shakeReportUI3 = this.f54182e.get();
                                if (shakeReportUI3 != null) {
                                    if (this.f54183f == null) {
                                        this.f54183f = (Vibrator) shakeReportUI3.getSystemService("vibrator");
                                    }
                                    Vibrator vibrator = this.f54183f;
                                    if (vibrator != null) {
                                        vibrator.vibrate(this.f54184g, -1);
                                    }
                                }
                            }
                        }
                        reset();
                        if (!shakeReportUI.f54123h) {
                            shakeReportUI.f54137p0.setText(shakeReportUI.f54154x0);
                            shakeReportUI.f54110Z.setText(shakeReportUI.f54154x0);
                            int i2 = shakeReportUI.f54124h1;
                            if (i2 == 2) {
                                shakeReportUI.f54153x = shakeReportUI.f54149v;
                            } else {
                                shakeReportUI.f54153x = shakeReportUI.f54156y;
                            }
                            C1921414 r1 = new Animation.AnimationListener() {
                                public void onAnimationEnd(Animation animation) {
                                    C21685l.C21687b bVar;
                                    ShakeReportUI shakeReportUI = ShakeReportUI.this;
                                    List<C48438k.C48443e> list = ShakeReportUI.f54068I1;
                                    shakeReportUI.mo24647Z7(true);
                                    ShakeReportUI.this.f54080F1 = System.currentTimeMillis();
                                    ShakeReportUI shakeReportUI2 = ShakeReportUI.this;
                                    if (!shakeReportUI2.f54115d) {
                                        shakeReportUI2.f54121g = true;
                                        shakeReportUI2.mo24643V7();
                                        C21685l lVar = ShakeReportUI.this.f54136p;
                                        int i = lVar.f61388a;
                                        if (i == 2) {
                                            if (C101093a.m132481c()) {
                                                ShakeReportUI.this.f54074C1 = C101093a.m132480b();
                                                ShakeReportUI.this.f54076D1 = C99364n.m129616h().mo138822a().getPlayPosition();
                                                ShakeReportUI.this.f54078E1 = true;
                                            } else {
                                                ShakeReportUI shakeReportUI3 = ShakeReportUI.this;
                                                shakeReportUI3.f54074C1 = null;
                                                shakeReportUI3.f54076D1 = 0;
                                                shakeReportUI3.f54078E1 = false;
                                            }
                                            C101093a.m132490l();
                                        } else if (i == 4 && (bVar = lVar.f61389b) != null && (bVar instanceof C48438k)) {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.addAll(ShakeReportUI.f54068I1);
                                            ((C48438k) bVar).f129619f = arrayList;
                                        }
                                        C21685l lVar2 = ShakeReportUI.this.f54136p;
                                        lVar2.getClass();
                                        lVar2.f61390c = System.currentTimeMillis();
                                        ShakeActionReportStruct shakeActionReportStruct = new ShakeActionReportStruct();
                                        C119179t tVar = C119157j.f356862d;
                                        C21268a aVar = new C21268a(shakeActionReportStruct, 2);
                                        C119157j jVar = (C119157j) tVar;
                                        jVar.getClass();
                                        jVar.mo183889t(aVar, 100, (String) null);
                                        ShakeReportUI.this.f54136p.f61389b.mo33954e();
                                    }
                                }

                                public void onAnimationRepeat(Animation animation) {
                                }

                                public void onAnimationStart(Animation animation) {
                                    ShakeReportUI shakeReportUI = ShakeReportUI.this;
                                    shakeReportUI.f54115d = false;
                                    shakeReportUI.mo24647Z7(false);
                                    ShakeReportUI shakeReportUI2 = ShakeReportUI.this;
                                    shakeReportUI2.f54123h = true;
                                    shakeReportUI2.mo24652e8(true);
                                    ShakeReportUI shakeReportUI3 = ShakeReportUI.this;
                                    int i = shakeReportUI3.f54124h1;
                                    if (i != 2) {
                                        shakeReportUI3.f54117e = true;
                                    }
                                    if (i == 2) {
                                        if (shakeReportUI3.f54108Y) {
                                            shakeReportUI3.f54106X.setVisibility(8);
                                            shakeReportUI3.f54137p0.setVisibility(8);
                                        }
                                        View view = shakeReportUI3.f54087K;
                                        C9556a aVar = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar.mo10233c(0);
                                        View view2 = view;
                                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                        C117292a.m165359e(view2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        shakeReportUI3.f54104W.mo129236w();
                                        if (shakeReportUI3.f54092Q == null) {
                                            shakeReportUI3.f54092Q = new AnimatorSet();
                                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(shakeReportUI3.f54090N, "scaleX", new float[]{1.0f, 0.7f});
                                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(shakeReportUI3.f54090N, "scaleY", new float[]{1.0f, 0.7f});
                                            ofFloat.setRepeatCount(-1);
                                            ofFloat2.setRepeatCount(-1);
                                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(shakeReportUI3.f54090N, "alpha", new float[]{0.0f, 1.0f, 0.0f});
                                            ofFloat3.setRepeatCount(-1);
                                            shakeReportUI3.f54092Q.setInterpolator(new LinearInterpolator());
                                            shakeReportUI3.f54092Q.play(ofFloat3).with(ofFloat).with(ofFloat2);
                                            shakeReportUI3.f54092Q.setDuration(3000);
                                        }
                                        shakeReportUI3.f54092Q.start();
                                    } else if (!shakeReportUI3.f54108Y) {
                                        View view3 = shakeReportUI3.f54089M;
                                        C9556a aVar2 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                        aVar2.mo10233c(0);
                                        View view4 = view3;
                                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                        C117292a.m165359e(view4, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        shakeReportUI3.f54102V.mo129236w();
                                    }
                                }
                            };
                            shakeReportUI.f54085I = true;
                            shakeReportUI.f54086J = i2;
                            if (i2 != 2 || !C77328l.m93194c()) {
                                if (shakeReportUI.f54159z == null) {
                                    Animation loadAnimation = AnimationUtils.loadAnimation(shakeReportUI.getContext(), C0966R.C0968anim.f2527fg);
                                    shakeReportUI.f54159z = loadAnimation;
                                    loadAnimation.setAnimationListener(r1);
                                }
                                if (shakeReportUI.f54069A == null) {
                                    shakeReportUI.f54069A = AnimationUtils.loadAnimation(shakeReportUI.getContext(), C0966R.C0968anim.f2521fa);
                                }
                                animation = shakeReportUI.f54069A;
                                animation2 = shakeReportUI.f54159z;
                            } else {
                                if (shakeReportUI.f54077E == null) {
                                    Animation loadAnimation2 = AnimationUtils.loadAnimation(shakeReportUI.getContext(), C0966R.C0968anim.f2528fh);
                                    shakeReportUI.f54077E = loadAnimation2;
                                    loadAnimation2.setAnimationListener(r1);
                                }
                                if (shakeReportUI.f54081G == null) {
                                    shakeReportUI.f54081G = AnimationUtils.loadAnimation(shakeReportUI.getContext(), C0966R.C0968anim.f2522fb);
                                }
                                animation2 = shakeReportUI.f54077E;
                                animation = shakeReportUI.f54081G;
                            }
                            Animation animation3 = shakeReportUI.f54071B;
                            if (!(animation3 == null || (textView = shakeReportUI.f54145t) == null)) {
                                BackwardSupportUtil.AnimationHelper.cancelAnimation(textView, animation3);
                            }
                            shakeReportUI.mo24648a8(3);
                            shakeReportUI.f54143s.setVisibility(4);
                            shakeReportUI.f54153x.startAnimation(animation2);
                            shakeReportUI.f54151w.startAnimation(animation);
                            View view2 = shakeReportUI.f54139q;
                            if (view2 != null && view2.getVisibility() == 0) {
                                Animation loadAnimation3 = AnimationUtils.loadAnimation(shakeReportUI.getContext(), C0966R.C0968anim.f2489ed);
                                loadAnimation3.setFillAfter(true);
                                shakeReportUI.f54139q.startAnimation(loadAnimation3);
                                new MMHandler().postDelayed(new Runnable() {
                                    public void run() {
                                        View view = ShakeReportUI.this.f54139q;
                                        if (view != null) {
                                            C9556a aVar = new C9556a();
                                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                            aVar.mo10233c(8);
                                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                            C117292a.m165359e(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        }
                                    }
                                }, loadAnimation3.getDuration());
                            }
                            new MMHandler().postDelayed(new Runnable() {
                                public void run() {
                                    TextView textView = ShakeReportUI.this.f54143s;
                                    if (textView != null) {
                                        textView.setVisibility(0);
                                    }
                                }
                            }, 1200);
                        }
                    }
                }
            }
        }
    }

    public ShakeReportUI() {
        new ConcurrentHashMap();
        this.f54078E1 = false;
        this.f54082G1 = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1155728636;
            }

            public boolean callback(IEvent iEvent) {
                if (((MusicPlayerEvent) iEvent).f9336d.f9337a != 0) {
                    return false;
                }
                ShakeReportUI shakeReportUI = ShakeReportUI.this;
                if (!shakeReportUI.f54078E1) {
                    return false;
                }
                C101093a.m132487i(shakeReportUI.f54076D1);
                return false;
            }
        };
        this.f54084H1 = new View.OnClickListener() {
            public void onClick(View view) {
                Class cls = C11502f.class;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (Util.isNullOrNil((String) ShakeReportUI.this.f54139q.getTag())) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C47288f fVar = ShakeReportUI.this.f54113b1;
                if (fVar == null) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                String str = fVar.field_username;
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                String str2 = "(Landroid/view/View;)V";
                if (z1Var.mo62927s3()) {
                    Intent intent = new Intent();
                    intent.putExtra("Contact_User", str);
                    intent.putExtra("Sns_from_Scene", 22);
                    if (str != null && str.length() > 0) {
                        if (z1Var.mo62916m3()) {
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.kvStat(10298, str + "," + ShakeReportUI.this.f54127j);
                            intent.putExtra("Contact_Scene", ShakeReportUI.this.f54127j);
                        }
                        intent.putExtra("CONTACT_INFO_UI_SOURCE", 31);
                        intent.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 3102);
                        ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent, ShakeReportUI.this);
                    }
                } else {
                    if ((fVar.field_reserved1 & 8) > 0) {
                        C115669n nVar2 = C115669n.INSTANCE;
                        nVar2.kvStat(10298, fVar.field_username + "," + ShakeReportUI.this.f54127j);
                    }
                    Intent intent2 = new Intent();
                    intent2.putExtra("Contact_User", fVar.field_username);
                    intent2.putExtra("Contact_Nick", fVar.field_nickname);
                    intent2.putExtra("Contact_Distance", fVar.field_distance);
                    intent2.putExtra("Contact_Signature", fVar.field_signature);
                    intent2.putExtra("Contact_Province", fVar.getProvince());
                    intent2.putExtra("Contact_City", fVar.getCity());
                    intent2.putExtra("Contact_Sex", fVar.field_sex);
                    intent2.putExtra("Contact_IsLBSFriend", true);
                    intent2.putExtra("Contact_VUser_Info", fVar.field_reserved3);
                    intent2.putExtra("Contact_VUser_Info_Flag", fVar.field_reserved1);
                    intent2.putExtra("Contact_KSnsIFlag", fVar.field_snsFlag);
                    intent2.putExtra("Contact_KSnsBgUrl", fVar.field_sns_bgurl);
                    intent2.putExtra("Contact_Scene", ShakeReportUI.this.f54127j);
                    intent2.putExtra("Sns_from_Scene", 22);
                    intent2.putExtra("CONTACT_INFO_UI_SOURCE", 31);
                    intent2.putExtra("CONTACT_INFO_UI_SUB_SOURCE", 3102);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent2, ShakeReportUI.this);
                }
                ShakeActionReportStruct shakeActionReportStruct = new ShakeActionReportStruct();
                shakeActionReportStruct.f48565f = shakeActionReportStruct.mo86045b("ToUsername", fVar.field_username, true);
                shakeActionReportStruct.f48568i = (long) ShakeReportUI.this.f54113b1.field_sex;
                shakeActionReportStruct.f48570k = Util.isNullOrNil(fVar.field_signature) ? 1 : 2;
                shakeActionReportStruct.f48569j = shakeActionReportStruct.mo86045b("ToUinDistanceStr", fVar.field_distance, true);
                shakeActionReportStruct.f48567h = 1;
                C119179t tVar = C119157j.f356862d;
                C21268a aVar = new C21268a(shakeActionReportStruct, 4);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183889t(aVar, 100, (String) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$25", "android/view/View$OnClickListener", "onClick", str2);
            }
        };
    }

    /* renamed from: H7 */
    public final void mo24628H7(int i, boolean z) {
        String format = String.format("%1$s-shaketype-%2$d", new Object[]{getClass().getName(), Integer.valueOf(i)});
        Log.m105918d("MicroMsg.ShakeReportUI", "activate change report , class name=" + format + ", isActive=" + z);
        C34861g1.m40517a(z, new Intent().putExtra("classname", format));
    }

    /* renamed from: I7 */
    public final boolean mo24629I7() {
        Class cls = C103918d.class;
        if (this.f54155x1) {
            return false;
        }
        this.f54155x1 = true;
        if (!this.f54152w1) {
            this.f54155x1 = false;
        } else if (!C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            boolean z = ((C103918d) C86312j.m106911c(cls)).mo125788z1(this, "android.permission.ACCESS_FINE_LOCATION", 64, "", getString(C0966R.string.j5e)) && !((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.LOCAION, C113177k.C113178a.SHAKE, new C113177k.C113181e() {
                public void onOp(Boolean bool) {
                    ShakeReportUI.this.f54155x1 = false;
                }
            });
            Log.m105925i("MicroMsg.ShakeReportUI", "summerper checkPermission checkposition[%b], stack[%s], activity[%s]", Boolean.valueOf(z), Util.getStack(), this);
            if (z) {
                this.f54155x1 = false;
            }
            return z;
        } else if (((C103918d) C86312j.m106911c(cls)).Lb0(this, "android.permission.ACCESS_FINE_LOCATION")) {
            this.f54155x1 = false;
        } else if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
            C12215a.m11778c(this, getString(C0966R.string.gbq, new Object[]{LocaleUtil.getApplicationLanguage()}), 30764, true);
        } else {
            ((C103918d) C86312j.m106911c(cls)).mo125790zt(this, "android.permission.ACCESS_FINE_LOCATION", 64);
        }
        return true;
    }

    /* renamed from: J7 */
    public final boolean mo24630J7() {
        if (this.f54155x1) {
            return false;
        }
        this.f54155x1 = true;
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.RECORD_AUDIO", 80, "", getString(C0966R.string.j6_));
        Log.m105925i("MicroMsg.ShakeReportUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this);
        if (z1) {
            this.f54155x1 = false;
        }
        return z1;
    }

    /* renamed from: K7 */
    public final void mo24631K7(View view) {
        int i;
        C92411b bVar;
        if (view != null) {
            mo24641T7("", false);
            if (this.f54085I) {
                mo24637P7();
            }
            if (view.getId() == C0966R.C0970id.jgr) {
                mo24629I7();
                C115669n.INSTANCE.mo160131h(11722, 1);
                int i2 = this.f54124h1;
                if (i2 != 1) {
                    if (i2 == 3) {
                        mo24628H7(3, false);
                    }
                    this.f54124h1 = 1;
                    mo24643V7();
                    mo24649b8(false);
                    View view2 = this.f54139q;
                    if (view2 != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "doTabClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "doTabClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else if (view.getId() == C0966R.C0970id.f359182jh0) {
                mo24630J7();
                C115669n.INSTANCE.mo160131h(11722, 2);
                if (!this.f54160z1 && (bVar = this.f54070A1) != null) {
                    bVar.mo126409c(this.f54072B1, true, false);
                    C5139t.m5183e(22, 10);
                }
                if (!C61104a.m71669y(this) && !C61104a.m71665u(this) && !C61104a.m71649e(this) && (i = this.f54124h1) != 2) {
                    if (i == 3) {
                        mo24628H7(3, false);
                    }
                    this.f54124h1 = 2;
                    mo24643V7();
                    mo24649b8(false);
                    View view4 = this.f54139q;
                    if (view4 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "doTabClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "doTabClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                if (C77328l.m93193b() && C97625j3.m125812b().mo105906u().mo119688i(4118, 0) == 0) {
                    AppCompatActivity context = getContext();
                    C77389a aVar3 = new C77389a();
                    aVar3.f225644a = C0086a.m38a(context).getString(C0966R.string.a3h);
                    aVar3.f225660q = C0086a.m38a(context).getString(C0966R.string.j4_);
                    aVar3.f225663t = C0086a.m38a(context).getString(C0966R.string.j49);
                    aVar3.f225620C = new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Dialog dialog = ShakeReportUI.this.f54112a1;
                            if (dialog != null) {
                                dialog.cancel();
                            }
                        }
                    };
                    aVar3.f225668y = true;
                    aVar3.f225622E = new DialogInterface.OnCancelListener() {
                        public void onCancel(DialogInterface dialogInterface) {
                            C97625j3.m125812b().mo105906u().mo119679M(4118, 1);
                            ShakeReportUI.this.f54122g1.setVisibility(8);
                        }
                    };
                    C77398g gVar = new C77398g(context, C0966R.style.a66);
                    gVar.mo107525e(aVar3);
                    this.f54112a1 = gVar;
                    gVar.show();
                }
                C119179t tVar = C119157j.f356862d;
                C21268a aVar4 = new C21268a((ShakeActionReportStruct) null, 251);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183889t(aVar4, 100, (String) null);
            }
            mo24647Z7(true);
            mo24644W7(false);
            mo24652e8(true);
        }
    }

    /* renamed from: L7 */
    public final void mo24632L7() {
        int nullAs = Util.nullAs((Integer) C97625j3.m125812b().mo105906u().mo119684e(12290, (Object) null), 0);
        Bitmap bitmap = this.f54111Z0;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f54111Z0.recycle();
        }
        if (!Util.nullAsTrue((Boolean) C97625j3.m125812b().mo105906u().mo119684e(4110, (Object) null))) {
            this.f54108Y = true;
            this.f54106X.setVisibility(0);
            this.f54111Z0 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142105Ou((String) C97625j3.m125812b().mo105906u().mo119684e(4111, (Object) null));
            this.f54106X.setImageDrawable(new BitmapDrawable(this.f54111Z0));
            this.f54137p0.setVisibility(0);
        } else {
            this.f54108Y = false;
            this.f54106X.setVisibility(8);
            this.f54137p0.setVisibility(8);
        }
        this.f54104W.mo129233t(C86013q1.m106433O("assets:///flower_song.wxam", 0, -1), "");
        this.f54102V.mo129233t(C86013q1.m106433O("assets:///flower_people_and_tv.wxam", 0, -1), "");
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.jfu);
        WeImageView weImageView2 = (WeImageView) findViewById(C0966R.C0970id.jft);
        weImageView.setImageResource(nullAs == 2 ? C0966R.C0969drawable.cc4 : C0966R.C0969drawable.cbx);
        weImageView2.setImageResource(nullAs == 2 ? C0966R.C0969drawable.f357351cc3 : C0966R.C0969drawable.cbw);
        C1921111 r0 = new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ShakeReportUI shakeReportUI = ShakeReportUI.this;
                if (!shakeReportUI.f54117e) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                shakeReportUI.f54125i = false;
                shakeReportUI.f54115d = true;
                shakeReportUI.mo24644W7(false);
                C76879j.m92735f(ShakeReportUI.this.getContext(), (String) null, new String[]{ShakeReportUI.this.getString(C0966R.string.j4d)}, "", "", true, new C76879j.C11180n() {
                    /* renamed from: j */
                    public void mo782j(int i) {
                        ShakeReportUI.this.f54125i = true;
                        if (i == 0) {
                            C119179t tVar = C119157j.f356862d;
                            C21268a aVar = new C21268a((ShakeActionReportStruct) null, 13);
                            C119157j jVar = (C119157j) tVar;
                            jVar.getClass();
                            jVar.mo183889t(aVar, 100, (String) null);
                            ((C7138g) C86312j.m106911c(C7138g.class)).mo8329zT(ShakeReportUI.this, 1, (Intent) null);
                        }
                    }
                }, new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialogInterface) {
                        ShakeReportUI.this.f54125i = true;
                    }
                });
                C119179t tVar = C119157j.f356862d;
                C21268a aVar = new C21268a((ShakeActionReportStruct) null, 12);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183889t(aVar, 100, (String) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        weImageView.setOnClickListener(r0);
        weImageView2.setOnClickListener(r0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* renamed from: M7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24633M7() {
        /*
            r7 = this;
            r7.mo24632L7()
            eb0.c r0 = eb0.C97625j3.m125812b()
            r0.mo105886a(r7)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r0.add(r7)
            nn2.g r0 = nn2.C76942m.zx0()
            r0.add(r7)
            nn2.l r0 = r7.f54136p
            nn2.l$b r0 = r0.f61389b
            if (r0 == 0) goto L_0x0025
            r0.mo33953d()
        L_0x0025:
            r0 = 1
            r7.f54125i = r0
            com.tencent.mm.plugin.shake.shakecard.ui.ShakeCardDialog r1 = r7.f54146t1
            r2 = 0
            if (r1 == 0) goto L_0x003b
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x003b
            com.tencent.mm.plugin.shake.shakecard.ui.ShakeCardDialog r1 = r7.f54146t1
            boolean r1 = r1.f54039z
            if (r1 != 0) goto L_0x003b
            r7.f54125i = r2
        L_0x003b:
            java.lang.String r1 = "MicroMsg.ShakeReportUI"
            java.lang.String r3 = "tryStartShake"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            ud3.d r3 = r7.f54132n
            if (r3 == 0) goto L_0x0092
            ud3.d$a r4 = r3.f300320b
            if (r4 == 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 != 0) goto L_0x0092
            com.tencent.mm.plugin.shake.ui.ShakeReportUI$SensorListener r4 = new com.tencent.mm.plugin.shake.ui.ShakeReportUI$SensorListener
            r4.<init>(r7)
            r3.mo141497a(r4)
            ud3.d r3 = r7.f54132n
            android.hardware.SensorManager r3 = r3.f300319a
            if (r3 != 0) goto L_0x0066
            java.lang.String r3 = "MicroMsg.ShakeSensorService"
            java.lang.String r4 = "cannot init sensor manager"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            goto L_0x0074
        L_0x0066:
            java.util.List r3 = r3.getSensorList(r0)
            if (r3 == 0) goto L_0x0074
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0074
            r3 = 1
            goto L_0x0075
        L_0x0074:
            r3 = 0
        L_0x0075:
            if (r3 == 0) goto L_0x0086
            android.widget.TextView r3 = r7.f54143s
            if (r3 == 0) goto L_0x0086
            r4 = 2131836500(0x7f113e54, float:1.9306169E38)
            java.lang.String r4 = r7.getString(r4)
            r3.setText(r4)
            goto L_0x0092
        L_0x0086:
            android.widget.TextView r3 = r7.f54143s
            r4 = 2131836572(0x7f113e9c, float:1.9306315E38)
            java.lang.String r4 = r7.getString(r4)
            r3.setText(r4)
        L_0x0092:
            com.tencent.mm.sdk.platformtools.MMHandler r3 = new com.tencent.mm.sdk.platformtools.MMHandler
            r3.<init>()
            com.tencent.mm.plugin.shake.ui.ShakeReportUI$3 r4 = new com.tencent.mm.plugin.shake.ui.ShakeReportUI$3
            r4.<init>()
            r5 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r4, r5)
            ud3.d r3 = r7.f54132n
            if (r3 == 0) goto L_0x00ac
            ud3.d$a r3 = r3.f300320b
            if (r3 == 0) goto L_0x00ac
            r3.reset()
        L_0x00ac:
            r7.mo24642U7(r2)
            r7.mo24644W7(r2)
            r7.mo24655g8()
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            r4 = 327696(0x50010, float:4.592E-40)
            java.lang.String r5 = "1"
            java.lang.Object r3 = r3.mo119684e(r4, r5)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "2"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x00db
            r3 = 2131313397(0x7f0942f5, float:1.824519E38)
            android.view.View r3 = r7.findViewById(r3)
            r7.mo24631K7(r3)
            goto L_0x00eb
        L_0x00db:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00eb
            r3 = 2131313394(0x7f0942f2, float:1.8245184E38)
            android.view.View r3 = r7.findViewById(r3)
            r7.mo24631K7(r3)
        L_0x00eb:
            java.lang.Class<ct.c> r3 = p327ct.C30914c.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ct.c r3 = (p327ct.C30914c) r3
            ct.d r3 = r3.mo17862sM()
            r4 = 262154(0x4000a, float:3.67356E-40)
            r5 = 266258(0x41012, float:3.73107E-40)
            l20.a r3 = (l20.C21388a) r3
            r3.mo33494b(r4, r5)
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r4 = "shake_music"
            boolean r3 = r3.getBooleanExtra(r4, r2)
            if (r3 == 0) goto L_0x0129
            boolean r3 = qc0.C77328l.m93194c()
            if (r3 == 0) goto L_0x0129
            nn2.l r3 = r7.f54136p
            int r3 = r3.f61388a
            r5 = 2
            if (r3 == r5) goto L_0x0129
            android.content.Intent r3 = r7.getIntent()
            r3.putExtra(r4, r2)
            r7.f54124h1 = r5
            r7.mo24643V7()
            goto L_0x012c
        L_0x0129:
            r7.mo24643V7()
        L_0x012c:
            r7.mo24647Z7(r0)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            boolean r4 = sf0.C90188n0.f258942j
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3[r2] = r4
            java.lang.String r2 = "isShakeGetConfigList = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r3)
            boolean r1 = sf0.C90188n0.f258942j
            if (r1 == 0) goto L_0x014f
            uc0.u r1 = new uc0.u
            r2 = 7
            r1.<init>(r2)
            ob0.b0 r2 = eb0.C97625j3.m125815e()
            r2.mo123460f(r1)
        L_0x014f:
            r7.mo24652e8(r0)
            r7.mo24654f8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.shake.p103ui.ShakeReportUI.mo24633M7():void");
    }

    /* renamed from: N7 */
    public void mo24634N7(int i, final C22120e eVar, long j) {
        C21685l.C21687b bVar;
        this.f54148u1 = true;
        if (i == 1251) {
            if (eVar != null) {
                Log.m105924i("MicroMsg.ShakeReportUI", "onShakeCardReturn MMFunc_Biz_GetLbsCard");
                C77542a.m93500a();
                mo24654f8();
                mo24651d8();
                this.f54144s1 = 4;
                C22119d xx02 = C76942m.xx0();
                xx02.getClass();
                if (!TextUtils.isEmpty("key_shake_card_item")) {
                    ((HashMap) xx02.f62537a).put("key_shake_card_item", eVar);
                }
            }
        } else if (i != 1250) {
        } else {
            if (eVar == null) {
                this.f54113b1 = null;
                mo24645X7((String) null);
                return;
            }
            boolean z = this.f54121g;
            if (z && !z) {
                this.f54113b1 = null;
                mo24645X7((String) null);
                return;
            }
            this.f54121g = false;
            Log.m105924i("MicroMsg.ShakeReportUI", "onShakeCardReturn MMFunc_Biz_ShakeCard");
            C21685l lVar = this.f54136p;
            if (lVar.f61388a == 5 && (bVar = lVar.f61389b) != null && (bVar instanceof C22121g)) {
                C22121g gVar = (C22121g) bVar;
                int i2 = (int) j;
                if (i2 == 1) {
                    Log.m105924i("MicroMsg.ShakeReportUI", "onShakeGetReturn() ShakeCardService RETURN_OK");
                    if (gVar.f62561f == 3) {
                        Log.m105924i("MicroMsg.ShakeReportUI", "onShakeGetReturn() actionType is  MMBIZ_SHAKE_CARD_ACTION_TYPE_NO_CARD");
                        if (!TextUtils.isEmpty(eVar.f62555m)) {
                            mo24645X7(eVar.f62555m);
                        } else {
                            mo24645X7(getString(C0966R.string.j3j));
                        }
                    } else {
                        Log.m105924i("MicroMsg.ShakeReportUI", "onShakeGetReturn() actionType is " + gVar.f62561f);
                        mo24648a8(3);
                        if (eVar.f62543a == 1) {
                            this.f54125i = false;
                        }
                        ShakeCardDialog shakeCardDialog = this.f54146t1;
                        if (shakeCardDialog != null && shakeCardDialog.isShowing()) {
                            return;
                        }
                        if (eVar.f62558p) {
                            ViewStub viewStub = (ViewStub) findViewById(C0966R.C0970id.f359498l90);
                            if (viewStub != null) {
                                viewStub.inflate();
                            }
                            ((ShakeEggAnimFrame) findViewById(C0966R.C0970id.b1l)).mo130020a(this, 30);
                            new MMHandler().postDelayed(new Runnable() {
                                public void run() {
                                    ShakeReportUI shakeReportUI = ShakeReportUI.this;
                                    C22120e eVar = eVar;
                                    List<C48438k.C48443e> list = ShakeReportUI.f54068I1;
                                    shakeReportUI.mo24646Y7(eVar);
                                }
                            }, 1000);
                            return;
                        }
                        mo24646Y7(eVar);
                    }
                } else if (i2 == 2) {
                    Log.m105924i("MicroMsg.ShakeReportUI", "onShakeGetReturn() ShakeCardService RETURN_ERR_REPORT");
                    mo24645X7(getString(C0966R.string.j3j));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x05b2 A[Catch:{ IOException -> 0x067d }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24635O7(java.util.List<nn2.C47288f> r31, long r32) {
        /*
            r30 = this;
            r8 = r30
            r0 = r31
            r30.mo24637P7()
            r1 = 1
            r8.mo24652e8(r1)
            r2 = 0
            r3 = 6
            if (r0 == 0) goto L_0x067e
            boolean r5 = r8.f54121g
            if (r5 == 0) goto L_0x067e
            int r5 = (r32 > r3 ? 1 : (r32 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x001a
            goto L_0x067e
        L_0x001a:
            r9 = 0
            r8.f54121g = r9
            int r3 = r31.size()
            if (r3 <= 0) goto L_0x002b
            java.lang.Object r3 = r0.get(r9)
            nn2.f r3 = (nn2.C47288f) r3
            r8.f54113b1 = r3
        L_0x002b:
            nn2.l r3 = r8.f54136p
            int r3 = r3.f61388a
            java.lang.String r4 = ""
            java.lang.String r5 = "MicroMsg.ShakeReportUI"
            r6 = 2131836560(0x7f113e90, float:1.930629E38)
            r7 = 2
            r12 = 1
            r10 = 3
            if (r3 != r1) goto L_0x03cc
            int r3 = r31.size()
            if (r3 <= 0) goto L_0x0050
            java.lang.Object r3 = r0.get(r9)
            nn2.f r3 = (nn2.C47288f) r3
            int r3 = r3.field_type
            if (r3 == 0) goto L_0x0050
            r8.mo24645X7(r2)
            return
        L_0x0050:
            java.lang.Object r3 = r0.get(r9)
            nn2.f r3 = (nn2.C47288f) r3
            int r3 = r3.f126949x0
            r8.f54127j = r3
            int r3 = r31.size()
            if (r3 != 0) goto L_0x0064
            r8.mo24645X7(r2)
            return
        L_0x0064:
            if (r3 != r1) goto L_0x0364
            java.lang.Object r0 = r0.get(r9)
            nn2.f r0 = (nn2.C47288f) r0
            java.lang.String r3 = r0.field_username
            java.lang.String r11 = r0.field_nickname
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r14 = "1 u:"
            r2.append(r14)
            r2.append(r3)
            java.lang.String r3 = " n:"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " d:"
            r2.append(r3)
            java.lang.String r3 = r0.field_distance
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            boolean r2 = r8.f54119f
            if (r2 == 0) goto L_0x00a1
            androidx.appcompat.app.AppCompatActivity r2 = r30.getContext()
            com.tencent.p014mm.sdk.platformtools.PlaySound.play(r2, r6)
        L_0x00a1:
            r8.mo24648a8(r10)
            java.lang.String r2 = r0.field_username
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x00ae
            goto L_0x067d
        L_0x00ae:
            android.view.View r2 = r8.f54139q
            java.lang.String r3 = r0.field_username
            r2.setTag(r3)
            android.view.View r2 = r8.f54139q
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r3.mo10233c(r6)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r19 = "displayResultByMatchCard"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r18 = "displayResultByMatchCard"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r2 = r2.mo105907v()
            java.lang.String r3 = r0.field_username
            com.tencent.mm.storage.z1 r2 = r2.get(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r0.field_nickname
            r3.append(r6)
            boolean r6 = r2.mo62927s3()
            r11 = 2131836561(0x7f113e91, float:1.9306292E38)
            if (r6 == 0) goto L_0x011e
            java.lang.String r6 = r8.getString(r11)
            goto L_0x011f
        L_0x011e:
            r6 = r4
        L_0x011f:
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            int r6 = r0.field_sex
            if (r6 != r1) goto L_0x014f
            android.view.View r6 = r8.f54139q
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r14 = r0.field_distance
            r7.append(r14)
            androidx.appcompat.app.AppCompatActivity r14 = r30.getContext()
            r15 = 2131836597(0x7f113eb5, float:1.9306365E38)
            java.lang.String r14 = r14.getString(r15)
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            r6.setContentDescription(r7)
            goto L_0x018c
        L_0x014f:
            if (r6 != r7) goto L_0x0176
            android.view.View r6 = r8.f54139q
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r14 = r0.field_distance
            r7.append(r14)
            androidx.appcompat.app.AppCompatActivity r14 = r30.getContext()
            r15 = 2131836596(0x7f113eb4, float:1.9306363E38)
            java.lang.String r14 = r14.getString(r15)
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            r6.setContentDescription(r7)
            goto L_0x018c
        L_0x0176:
            android.view.View r6 = r8.f54139q
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r14 = r0.field_distance
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            r6.setContentDescription(r7)
        L_0x018c:
            android.view.View r6 = r8.f54139q
            r7 = 2131313367(0x7f0942d7, float:1.8245129E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Class<ny.h> r7 = p629ny.C76979h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ny.h r7 = (p629ny.C76979h) r7
            androidx.appcompat.app.AppCompatActivity r14 = r30.getContext()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r10 = r0.field_nickname
            r15.append(r10)
            boolean r2 = r2.mo62927s3()
            if (r2 == 0) goto L_0x01b8
            java.lang.String r2 = r8.getString(r11)
            goto L_0x01b9
        L_0x01b8:
            r2 = r4
        L_0x01b9:
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            float r10 = r6.getTextSize()
            android.text.SpannableString r2 = r7.yp0(r14, r2, r10)
            r6.setText(r2)
            android.widget.ImageView r2 = r8.f54126i1
            if (r2 == 0) goto L_0x01f6
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 != 0) goto L_0x01ea
            android.widget.ImageView r2 = r8.f54126i1
            r6 = 2131836509(0x7f113e5d, float:1.9306187E38)
            java.lang.String r6 = r8.getString(r6)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r9] = r3
            java.lang.String r3 = java.lang.String.format(r6, r7)
            r2.setContentDescription(r3)
            goto L_0x01f6
        L_0x01ea:
            android.widget.ImageView r2 = r8.f54126i1
            r3 = 2131836510(0x7f113e5e, float:1.9306189E38)
            java.lang.String r3 = r8.getString(r3)
            r2.setContentDescription(r3)
        L_0x01f6:
            android.view.View r2 = r8.f54139q
            r3 = 2131313365(0x7f0942d5, float:1.8245125E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = r0.field_distance
            r2.setText(r3)
            java.lang.Class<ln.f> r2 = p196ln.C76705f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ln.f r2 = (p196ln.C76705f) r2
            android.view.View r3 = r8.f54139q
            r6 = 2131313366(0x7f0942d6, float:1.8245127E38)
            android.view.View r3 = r3.findViewById(r6)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.String r6 = r0.field_username
            r2.mo106849z(r3, r6)
            android.view.View r2 = r8.f54139q
            r3 = 2131313369(0x7f0942d9, float:1.8245133E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r3 = r0.field_reserved1
            if (r3 != 0) goto L_0x035f
            r3 = 8
            r2.setVisibility(r3)
            int r2 = r0.field_reserved1
            r6 = 2131313368(0x7f0942d8, float:1.824513E38)
            if (r2 != 0) goto L_0x029b
            int r2 = r0.field_sex
            if (r2 == 0) goto L_0x029b
            if (r2 != r1) goto L_0x0243
            r2 = 2131755869(0x7f10035d, float:1.914263E38)
            goto L_0x0246
        L_0x0243:
            r2 = 2131755868(0x7f10035c, float:1.9142627E38)
        L_0x0246:
            android.graphics.drawable.Drawable r2 = kg3.C76577a.m92158i(r8, r2)
            android.view.View r3 = r8.f54139q
            android.view.View r3 = r3.findViewById(r6)
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r7.mo10233c(r10)
            java.lang.Object[] r18 = r7.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r20 = "displayResultByMatchCard"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r7 = r7.mo10231a(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r18 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r19 = "displayResultByMatchCard"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.view.View r3 = r8.f54139q
            android.view.View r3 = r3.findViewById(r6)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3.setImageDrawable(r2)
            goto L_0x02e0
        L_0x029b:
            android.view.View r2 = r8.f54139q
            android.view.View r2 = r2.findViewById(r6)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.mo10233c(r3)
            java.lang.Object[] r18 = r6.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r20 = "displayResultByMatchCard"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r6.mo10231a(r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r18 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r19 = "displayResultByMatchCard"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/shake/model/ShakeItem;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x02e0:
            java.lang.String r2 = r0.getProvince()
            if (r2 != 0) goto L_0x02ed
            java.lang.String r2 = "PROVINCE NULL"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            r0.field_province = r4
        L_0x02ed:
            java.lang.String r2 = r0.getCity()
            if (r2 != 0) goto L_0x02fa
            java.lang.String r2 = "CITY NULL"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            r0.field_city = r4
        L_0x02fa:
            android.view.View r2 = r8.f54139q
            androidx.appcompat.app.AppCompatActivity r3 = r30.getContext()
            r4 = 2130772167(0x7f0100c7, float:1.7147445E38)
            android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r4)
            r2.startAnimation(r3)
            com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct
            r2.<init>()
            nn2.l r3 = r8.f54136p
            long r3 = r3.mo33949a()
            r2.f48573n = r3
            java.lang.String r3 = r0.field_username
            java.lang.String r4 = "ToUsername"
            java.lang.String r3 = r2.mo86045b(r4, r3, r1)
            r2.f48565f = r3
            nn2.f r3 = r8.f54113b1
            int r4 = r3.field_sex
            long r4 = (long) r4
            r2.f48568i = r4
            java.lang.String r3 = r3.field_signature
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0332
            r10 = r12
            goto L_0x0334
        L_0x0332:
            r10 = 2
        L_0x0334:
            r2.f48570k = r10
            java.lang.String r0 = r0.field_distance
            java.lang.String r3 = "ToUinDistanceStr"
            java.lang.String r0 = r2.mo86045b(r3, r0, r1)
            r2.f48569j = r0
            r2.f48567h = r12
            nn2.l r0 = r8.f54136p
            long r0 = r0.mo33949a()
            r2.f48573n = r0
            zt3.t r0 = zt3.C119157j.f356862d
            jn2.a r1 = new jn2.a
            r3 = 3
            r1.<init>(r2, r3)
            zt3.j r0 = (zt3.C119157j) r0
            r0.getClass()
            r2 = 100
            r4 = 0
            r0.mo183889t(r1, r2, r4)
            goto L_0x067d
        L_0x035f:
            r4 = 0
            r2.setVisibility(r9)
            throw r4
        L_0x0364:
            boolean r0 = r8.f54119f
            if (r0 == 0) goto L_0x036f
            androidx.appcompat.app.AppCompatActivity r0 = r30.getContext()
            com.tencent.p014mm.sdk.platformtools.PlaySound.play(r0, r6)
        L_0x036f:
            r0 = 3
            r8.mo24648a8(r0)
            r8.mo24649b8(r9)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.shake.ui.ShakeItemListUI> r1 = com.tencent.p014mm.plugin.shake.p103ui.ShakeItemListUI.class
            r0.<init>(r8, r1)
            r1 = -1
            java.lang.String r2 = "_key_show_type_"
            r0.putExtra(r2, r1)
            r1 = 2131836555(0x7f113e8b, float:1.930628E38)
            java.lang.String r1 = r8.getString(r1)
            java.lang.String r2 = "_key_title_"
            r0.putExtra(r2, r1)
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r1 = r10.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r3 = "onShakeGetReturn"
            java.lang.String r4 = "(Ljava/util/List;J)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r30
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r10.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r2 = "onShakeGetReturn"
            java.lang.String r3 = "(Ljava/util/List;J)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r30
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x067d
        L_0x03cc:
            if (r3 != r7) goto L_0x061a
            int r2 = r31.size()
            if (r2 != 0) goto L_0x03df
            r0 = 2131836567(0x7f113e97, float:1.9306304E38)
            java.lang.String r0 = r8.getString(r0)
            r8.mo24645X7(r0)
            return
        L_0x03df:
            if (r2 != r1) goto L_0x067d
            boolean r2 = r8.f54119f
            if (r2 == 0) goto L_0x03ec
            androidx.appcompat.app.AppCompatActivity r2 = r30.getContext()
            com.tencent.p014mm.sdk.platformtools.PlaySound.play(r2, r6)
        L_0x03ec:
            r2 = 3
            r8.mo24648a8(r2)
            java.lang.Object r2 = r0.get(r9)
            nn2.f r2 = (nn2.C47288f) r2
            int r2 = r2.field_type
            r3 = 4
            if (r2 != r3) goto L_0x0614
            te3.rt2 r2 = new te3.rt2
            r2.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r10 = java.lang.System.currentTimeMillis()
            r5.append(r10)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct r6 = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct
            r6.<init>()
            nn2.l r10 = r8.f54136p
            long r10 = r10.mo33949a()
            r6.f48573n = r10
            java.lang.String r10 = "SharkSessionID"
            java.lang.String r10 = r6.mo86045b(r10, r5, r1)
            r6.f48575p = r10
            java.lang.Object r0 = r0.get(r9)     // Catch:{ IOException -> 0x067d }
            nn2.f r0 = (nn2.C47288f) r0     // Catch:{ IOException -> 0x067d }
            byte[] r0 = r0.field_lvbuffer     // Catch:{ IOException -> 0x067d }
            r2.parseFrom(r0)     // Catch:{ IOException -> 0x067d }
            java.util.LinkedList<te3.pt2> r0 = r2.f141139i     // Catch:{ IOException -> 0x067d }
            java.lang.String r10 = "key_hasPre"
            java.lang.String r11 = "mv"
            java.lang.String r14 = "shake_sessionid"
            java.lang.String r15 = "report_sessionid"
            java.lang.String r7 = "key_duration"
            java.lang.String r3 = "key_byuser"
            java.lang.String r12 = "key_pure"
            java.lang.String r13 = "key_offset"
            java.lang.String r9 = "key_copyright_report"
            java.lang.String r1 = ".ui.shake.MusicMainUINew"
            if (r0 == 0) goto L_0x0501
            int r0 = r0.size()     // Catch:{ IOException -> 0x067d }
            r23 = r4
            r4 = 1
            if (r0 != r4) goto L_0x04fe
            java.util.LinkedList<te3.pt2> r0 = r2.f141139i     // Catch:{ IOException -> 0x067d }
            r4 = 0
            java.lang.Object r0 = r0.get(r4)     // Catch:{ IOException -> 0x067d }
            te3.pt2 r0 = (te3.C50874pt2) r0     // Catch:{ IOException -> 0x067d }
            qc0.m r4 = sn2.C64057o.m75410a(r0)     // Catch:{ IOException -> 0x067d }
            r24 = r2
            android.content.Intent r2 = new android.content.Intent     // Catch:{ IOException -> 0x067d }
            r2.<init>()     // Catch:{ IOException -> 0x067d }
            long r25 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x067d }
            r31 = r10
            r27 = r11
            long r10 = r8.f54080F1     // Catch:{ IOException -> 0x067d }
            long r25 = r25 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r25)     // Catch:{ IOException -> 0x067d }
            java.lang.String r11 = r0.f139963q     // Catch:{ IOException -> 0x067d }
            if (r11 == 0) goto L_0x04a0
            qc0.C101093a.m132489k(r4)     // Catch:{ IOException -> 0x067d }
            java.lang.String r11 = "key_copyright"
            r25 = r1
            r1 = 1
            r2.putExtra(r11, r1)     // Catch:{ IOException -> 0x067d }
            long r10 = r10.longValue()     // Catch:{ IOException -> 0x067d }
            r28 = 700(0x2bc, double:3.46E-321)
            long r10 = r10 + r28
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x067d }
            r2.putExtra(r9, r1)     // Catch:{ IOException -> 0x067d }
            r32 = r10
            r9 = 1
            r6.f48580u = r9     // Catch:{ IOException -> 0x067d }
            goto L_0x04bb
        L_0x04a0:
            r25 = r1
            qc0.C101093a.m132489k(r4)     // Catch:{ IOException -> 0x067d }
            long r10 = r10.longValue()     // Catch:{ IOException -> 0x067d }
            r19 = 800(0x320, double:3.953E-321)
            long r10 = r10 + r19
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x067d }
            r1 = 3
            r2.putExtra(r9, r1)     // Catch:{ IOException -> 0x067d }
            r32 = r10
            r9 = 3
            r6.f48580u = r9     // Catch:{ IOException -> 0x067d }
        L_0x04bb:
            r10 = r32
            float r1 = r4.f295961f     // Catch:{ IOException -> 0x067d }
            java.lang.String r9 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x067d }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ IOException -> 0x067d }
            float r1 = r1 + r9
            r2.putExtra(r13, r1)     // Catch:{ IOException -> 0x067d }
            int r1 = r0.f139971y     // Catch:{ IOException -> 0x067d }
            r2.putExtra(r12, r1)     // Catch:{ IOException -> 0x067d }
            int r1 = r0.f139953d     // Catch:{ IOException -> 0x067d }
            r2.putExtra(r3, r1)     // Catch:{ IOException -> 0x067d }
            int r0 = r0.f139962p     // Catch:{ IOException -> 0x067d }
            r2.putExtra(r7, r0)     // Catch:{ IOException -> 0x067d }
            java.lang.String r0 = "key_music_wrapper"
            r2.putExtra(r0, r4)     // Catch:{ IOException -> 0x067d }
            java.lang.String r0 = jn2.C21269b.f60082a     // Catch:{ IOException -> 0x067d }
            r2.putExtra(r15, r0)     // Catch:{ IOException -> 0x067d }
            r2.putExtra(r14, r5)     // Catch:{ IOException -> 0x067d }
            qc0.m r0 = r8.f54074C1     // Catch:{ IOException -> 0x067d }
            if (r0 == 0) goto L_0x04f1
            r0 = r31
            r1 = 1
            r2.putExtra(r0, r1)     // Catch:{ IOException -> 0x067d }
        L_0x04f1:
            r4 = r25
            r1 = r27
            r0 = 4
            ke3.C88144b.m109795m(r8, r1, r4, r2, r0)     // Catch:{ IOException -> 0x067d }
            r0 = r6
            r2 = r24
            goto L_0x05a7
        L_0x04fe:
            r4 = r1
            r0 = r10
            goto L_0x0505
        L_0x0501:
            r23 = r4
            r0 = r10
            r4 = r1
        L_0x0505:
            r1 = r11
            java.util.LinkedList<te3.pt2> r10 = r2.f141139i     // Catch:{ IOException -> 0x067d }
            if (r10 == 0) goto L_0x05a6
            int r10 = r10.size()     // Catch:{ IOException -> 0x067d }
            r11 = 1
            if (r10 <= r11) goto L_0x05a6
            java.util.LinkedList<te3.pt2> r10 = r2.f141139i     // Catch:{ IOException -> 0x067d }
            r11 = 0
            java.lang.Object r10 = r10.get(r11)     // Catch:{ IOException -> 0x067d }
            te3.pt2 r10 = (te3.C50874pt2) r10     // Catch:{ IOException -> 0x067d }
            qc0.m r11 = sn2.C64057o.m75410a(r10)     // Catch:{ IOException -> 0x067d }
            qc0.C101093a.m132489k(r11)     // Catch:{ IOException -> 0x067d }
            r19 = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IOException -> 0x067d }
            r6.<init>()     // Catch:{ IOException -> 0x067d }
            r27 = r1
            r25 = r4
            r1 = 1
        L_0x052d:
            java.util.LinkedList<te3.pt2> r4 = r2.f141139i     // Catch:{ IOException -> 0x067d }
            int r4 = r4.size()     // Catch:{ IOException -> 0x067d }
            if (r1 >= r4) goto L_0x0549
            java.util.LinkedList<te3.pt2> r4 = r2.f141139i     // Catch:{ IOException -> 0x067d }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ IOException -> 0x067d }
            te3.pt2 r4 = (te3.C50874pt2) r4     // Catch:{ IOException -> 0x067d }
            qc0.m r4 = sn2.C64057o.m75410a(r4)     // Catch:{ IOException -> 0x067d }
            if (r11 == 0) goto L_0x0546
            r6.add(r4)     // Catch:{ IOException -> 0x067d }
        L_0x0546:
            int r1 = r1 + 1
            goto L_0x052d
        L_0x0549:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ IOException -> 0x067d }
            r1.<init>()     // Catch:{ IOException -> 0x067d }
            long r28 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x067d }
            r20 = r5
            long r4 = r8.f54080F1     // Catch:{ IOException -> 0x067d }
            long r28 = r28 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r28)     // Catch:{ IOException -> 0x067d }
            float r5 = r11.f295961f     // Catch:{ IOException -> 0x067d }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x067d }
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ IOException -> 0x067d }
            float r5 = r5 + r4
            r4 = 1145569280(0x44480000, float:800.0)
            float r5 = r5 + r4
            r1.putExtra(r13, r5)     // Catch:{ IOException -> 0x067d }
            int r4 = r10.f139971y     // Catch:{ IOException -> 0x067d }
            r1.putExtra(r12, r4)     // Catch:{ IOException -> 0x067d }
            java.lang.String r4 = "key_recommend_list"
            r1.putExtra(r4, r6)     // Catch:{ IOException -> 0x067d }
            int r4 = r10.f139953d     // Catch:{ IOException -> 0x067d }
            r1.putExtra(r3, r4)     // Catch:{ IOException -> 0x067d }
            int r3 = r10.f139962p     // Catch:{ IOException -> 0x067d }
            r1.putExtra(r7, r3)     // Catch:{ IOException -> 0x067d }
            java.lang.String r3 = jn2.C21269b.f60082a     // Catch:{ IOException -> 0x067d }
            r1.putExtra(r15, r3)     // Catch:{ IOException -> 0x067d }
            r3 = r20
            r1.putExtra(r14, r3)     // Catch:{ IOException -> 0x067d }
            r3 = 2
            r1.putExtra(r9, r3)     // Catch:{ IOException -> 0x067d }
            qc0.m r3 = r8.f54074C1     // Catch:{ IOException -> 0x067d }
            if (r3 == 0) goto L_0x0597
            r3 = 1
            r1.putExtra(r0, r3)     // Catch:{ IOException -> 0x067d }
        L_0x0597:
            r3 = r25
            r0 = r27
            r4 = 4
            ke3.C88144b.m109795m(r8, r0, r3, r1, r4)     // Catch:{ IOException -> 0x067d }
            r0 = r19
            r3 = 2
            r0.f48580u = r3     // Catch:{ IOException -> 0x067d }
            goto L_0x05a7
        L_0x05a6:
            r0 = r6
        L_0x05a7:
            java.util.LinkedList<te3.pt2> r1 = r2.f141139i     // Catch:{ IOException -> 0x067d }
            if (r1 == 0) goto L_0x067d
            int r1 = r1.size()     // Catch:{ IOException -> 0x067d }
            r3 = 1
            if (r1 < r3) goto L_0x067d
            java.util.LinkedList<te3.pt2> r1 = r2.f141139i     // Catch:{ IOException -> 0x067d }
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch:{ IOException -> 0x067d }
            te3.pt2 r1 = (te3.C50874pt2) r1     // Catch:{ IOException -> 0x067d }
            java.lang.String r2 = r1.f139963q     // Catch:{ IOException -> 0x067d }
            java.lang.String r3 = "ToSongDataurl"
            r4 = 1
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)     // Catch:{ IOException -> 0x067d }
            r0.f48579t = r2     // Catch:{ IOException -> 0x067d }
            java.lang.String r2 = r1.f139963q     // Catch:{ IOException -> 0x067d }
            java.lang.String r3 = "ToSongWeburl"
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)     // Catch:{ IOException -> 0x067d }
            r0.f48578s = r2     // Catch:{ IOException -> 0x067d }
            java.lang.String r2 = r1.f139956g     // Catch:{ IOException -> 0x067d }
            java.lang.String r3 = "ToSongName"
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)     // Catch:{ IOException -> 0x067d }
            r0.f48576q = r2     // Catch:{ IOException -> 0x067d }
            java.lang.String r2 = r1.f139957h     // Catch:{ IOException -> 0x067d }
            java.lang.String r3 = "ToSongSinger"
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)     // Catch:{ IOException -> 0x067d }
            r0.f48577r = r2     // Catch:{ IOException -> 0x067d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x067d }
            r2.<init>()     // Catch:{ IOException -> 0x067d }
            int r1 = r1.f139954e     // Catch:{ IOException -> 0x067d }
            r2.append(r1)     // Catch:{ IOException -> 0x067d }
            r1 = r23
            r2.append(r1)     // Catch:{ IOException -> 0x067d }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x067d }
            java.lang.String r2 = "ToSongOrTv"
            r3 = 1
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)     // Catch:{ IOException -> 0x067d }
            r0.f48566g = r1     // Catch:{ IOException -> 0x067d }
            zt3.t r1 = zt3.C119157j.f356862d     // Catch:{ IOException -> 0x067d }
            jn2.a r2 = new jn2.a     // Catch:{ IOException -> 0x067d }
            r3 = 3
            r2.<init>(r0, r3)     // Catch:{ IOException -> 0x067d }
            zt3.j r1 = (zt3.C119157j) r1     // Catch:{ IOException -> 0x067d }
            r1.getClass()     // Catch:{ IOException -> 0x067d }
            r0 = 0
            r3 = 100
            r1.mo183889t(r2, r3, r0)     // Catch:{ IOException -> 0x067d }
            goto L_0x067d
        L_0x0614:
            java.lang.String r0 = "Unexpected type, ignore."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            goto L_0x067d
        L_0x061a:
            r1 = 3
            if (r3 != r1) goto L_0x067d
            r1 = 1
            r8.mo24652e8(r1)
            int r2 = r31.size()
            if (r2 != 0) goto L_0x0632
            r0 = 2131836619(0x7f113ecb, float:1.930641E38)
            java.lang.String r0 = r8.getString(r0)
            r8.mo24645X7(r0)
            return
        L_0x0632:
            if (r2 != r1) goto L_0x067d
            boolean r1 = r8.f54119f
            if (r1 == 0) goto L_0x063f
            androidx.appcompat.app.AppCompatActivity r1 = r30.getContext()
            com.tencent.p014mm.sdk.platformtools.PlaySound.play(r1, r6)
        L_0x063f:
            r1 = 3
            r8.mo24648a8(r1)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            nn2.f r0 = (nn2.C47288f) r0
            com.tencent.mm.sdk.platformtools.MMHandler r1 = new com.tencent.mm.sdk.platformtools.MMHandler
            r1.<init>()
            sn2.q r2 = new sn2.q
            r2.<init>(r0, r8)
            r3 = 100
            r1.postDelayed(r2, r3)
            com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct
            r0.<init>()
            r1 = 1
            r0.f48567h = r1
            nn2.l r1 = r8.f54136p
            long r1 = r1.mo33949a()
            r0.f48573n = r1
            zt3.t r1 = zt3.C119157j.f356862d
            jn2.a r2 = new jn2.a
            r3 = 3
            r2.<init>(r0, r3)
            zt3.j r1 = (zt3.C119157j) r1
            r1.getClass()
            r0 = 0
            r3 = 100
            r1.mo183889t(r2, r3, r0)
        L_0x067d:
            return
        L_0x067e:
            r0 = r2
            r8.f54113b1 = r0
            int r0 = (r32 > r3 ? 1 : (r32 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0690
            r0 = 2131836542(0x7f113e7e, float:1.9306254E38)
            java.lang.String r0 = r8.getString(r0)
            r8.mo24645X7(r0)
            return
        L_0x0690:
            r0 = 7
            int r2 = (r32 > r0 ? 1 : (r32 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x06a1
            r0 = 2131836540(0x7f113e7c, float:1.930625E38)
            java.lang.String r0 = r8.getString(r0)
            r8.mo24645X7(r0)
            return
        L_0x06a1:
            r0 = 8
            int r2 = (r32 > r0 ? 1 : (r32 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x06b2
            r0 = 2131836538(0x7f113e7a, float:1.9306246E38)
            java.lang.String r0 = r8.getString(r0)
            r8.mo24645X7(r0)
            return
        L_0x06b2:
            r0 = 9
            int r2 = (r32 > r0 ? 1 : (r32 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x06c3
            r0 = 2131836537(0x7f113e79, float:1.9306244E38)
            java.lang.String r0 = r8.getString(r0)
            r8.mo24645X7(r0)
            return
        L_0x06c3:
            r0 = 10
            int r2 = (r32 > r0 ? 1 : (r32 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x06d4
            r0 = 2131836541(0x7f113e7d, float:1.9306252E38)
            java.lang.String r0 = r8.getString(r0)
            r8.mo24645X7(r0)
            return
        L_0x06d4:
            r0 = 0
            r8.mo24645X7(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.shake.p103ui.ShakeReportUI.mo24635O7(java.util.List, long):void");
    }

    /* renamed from: P2 */
    public void mo24636P2() {
        C77542a.m93500a();
        mo24650c8();
        mo24654f8();
        mo24651d8();
    }

    /* renamed from: P7 */
    public final void mo24637P7() {
        if (this.f54123h) {
            C1921618 r0 = new Animation.AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    ShakeReportUI shakeReportUI = ShakeReportUI.this;
                    if (shakeReportUI.f54086J == 2) {
                        if (shakeReportUI.f54108Y) {
                            shakeReportUI.f54106X.setVisibility(0);
                            shakeReportUI.f54137p0.setVisibility(0);
                        }
                        View view = shakeReportUI.f54087K;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "stopShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "stopShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        shakeReportUI.f54104W.mo129237x();
                        shakeReportUI.f54092Q.cancel();
                        AnimatorSet animatorSet = shakeReportUI.f54094R;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                    } else if (!shakeReportUI.f54108Y) {
                        View view3 = shakeReportUI.f54089M;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "stopShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "stopShakeAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        shakeReportUI.f54102V.mo129237x();
                    }
                    ShakeReportUI shakeReportUI2 = ShakeReportUI.this;
                    shakeReportUI2.f54117e = false;
                    shakeReportUI2.f54123h = false;
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            };
            this.f54085I = false;
            if (this.f54124h1 != 2 || !C77328l.m93194c()) {
                if (this.f54075D == null) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2523fc);
                    this.f54075D = loadAnimation;
                    loadAnimation.setAnimationListener(r0);
                }
                if (this.f54073C == null) {
                    this.f54073C = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2532fk);
                }
                this.f54153x.startAnimation(this.f54073C);
                this.f54151w.startAnimation(this.f54075D);
                return;
            }
            if (this.f54083H == null) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2524fd);
                this.f54083H = loadAnimation2;
                loadAnimation2.setAnimationListener(r0);
            }
            if (this.f54079F == null) {
                this.f54079F = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2529fi);
            }
            this.f54153x.startAnimation(this.f54079F);
            this.f54151w.startAnimation(this.f54083H);
        }
    }

    /* renamed from: Q7 */
    public final void mo24638Q7(boolean z) {
        int d = z ? C76577a.m92153d(this, C0966R.color.BW_100_Alpha_0_8) : C76577a.m92153d(this, C0966R.color.BW_100_Alpha_0_3);
        this.f54114c1.setIconColor(d);
        this.f54116d1.setTextColor(d);
    }

    /* renamed from: R7 */
    public final void mo24639R7(boolean z) {
        if (z) {
            C76577a.m92153d(this, C0966R.color.BW_100_Alpha_0_8);
        } else {
            C76577a.m92153d(this, C0966R.color.BW_100_Alpha_0_3);
        }
    }

    /* renamed from: S7 */
    public final void mo24640S7(boolean z) {
        int d = z ? C76577a.m92153d(this, C0966R.color.f2975b6) : C76577a.m92153d(this, C0966R.color.BW_100_Alpha_0_3);
        this.f54120f1.setTextColor(d);
        this.f54118e1.setIconColor(d);
    }

    /* renamed from: T7 */
    public final void mo24641T7(String str, boolean z) {
        this.f54121g = false;
        if (this.f54071B == null) {
            this.f54071B = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2388bp);
        }
        mo24648a8(2);
        mo24642U7(true);
        if (str != null && str.length() > 1) {
            this.f54145t.setText(str);
        } else if (z) {
            this.f54145t.setText(C0966R.string.j3k);
        } else {
            this.f54145t.setText("");
            mo24642U7(false);
        }
    }

    /* renamed from: U7 */
    public final void mo24642U7(boolean z) {
        TextView textView = this.f54145t;
        if (textView == null) {
            return;
        }
        if (z) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        this.f54145t.cancelLongPress();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0292, code lost:
        if (r7 != null) goto L_0x02e9;
     */
    /* renamed from: V7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24643V7() {
        /*
            r27 = this;
            r0 = r27
            int r1 = r0.f54124h1
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "MicroMsg.ShakeReportUI"
            r5 = 4
            r6 = 11720(0x2dc8, float:1.6423E-41)
            r7 = 2131313388(0x7f0942ec, float:1.8245171E38)
            r8 = 5
            r9 = 2
            r10 = 3
            r11 = 1
            if (r1 != r9) goto L_0x00b5
            boolean r1 = qc0.C77328l.m93194c()
            if (r1 == 0) goto L_0x00b5
            r0.f54124h1 = r9
            android.widget.TextView r1 = r0.f54147u
            r12 = 2131836589(0x7f113ead, float:1.930635E38)
            r1.setText(r12)
            r0.f54154x0 = r12
            r0.mo24640S7(r11)
            r0.mo24638Q7(r2)
            r0.mo24639R7(r2)
            boolean r1 = r0.f54123h
            if (r1 == 0) goto L_0x0049
            android.os.Looper r1 = r27.getMainLooper()
            android.os.Handler r1 = com.tencent.p014mm.sdk.platformtools.MMHandler.createFreeHandler(r1)
            com.tencent.mm.plugin.shake.ui.ShakeReportUI$$a r12 = new com.tencent.mm.plugin.shake.ui.ShakeReportUI$$a
            r12.<init>(r0)
            r13 = 400(0x190, double:1.976E-321)
            r1.postDelayed(r12, r13)
            goto L_0x0059
        L_0x0049:
            android.view.View r1 = r0.f54149v
            androidx.appcompat.app.AppCompatActivity r12 = r27.getContext()
            r13 = 2131101435(0x7f0606fb, float:1.781528E38)
            int r12 = kg3.C76577a.m92153d(r12, r13)
            r1.setBackgroundColor(r12)
        L_0x0059:
            android.view.View r1 = r0.findViewById(r7)
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r7.mo10233c(r3)
            java.lang.Object[] r14 = r7.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r16 = "setShakeService"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r3 = r7.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r14 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r15 = "setShakeService"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r3[r2] = r7
            r1.mo160131h(r6, r3)
            r21 = 834(0x342, double:4.12E-321)
            r23 = 2
            r25 = 1
            r20 = r1
            r20.mo175913w(r21, r23, r25)
            goto L_0x0286
        L_0x00b5:
            int r1 = r0.f54124h1
            r12 = 1500(0x5dc, double:7.41E-321)
            if (r1 != r10) goto L_0x0151
            boolean r1 = sn2.C48447s.m53803e()
            if (r1 == 0) goto L_0x0151
            r0.f54124h1 = r10
            android.widget.TextView r1 = r0.f54147u
            r14 = 2131836590(0x7f113eae, float:1.9306351E38)
            r1.setText(r14)
            r0.f54154x0 = r14
            r0.mo24640S7(r2)
            r0.mo24638Q7(r2)
            r0.mo24639R7(r2)
            boolean r1 = r0.f54123h
            if (r1 == 0) goto L_0x00eb
            android.os.Looper r1 = r27.getMainLooper()
            android.os.Handler r1 = com.tencent.p014mm.sdk.platformtools.MMHandler.createFreeHandler(r1)
            com.tencent.mm.plugin.shake.ui.ShakeReportUI$$b r14 = new com.tencent.mm.plugin.shake.ui.ShakeReportUI$$b
            r14.<init>(r0)
            r1.postDelayed(r14, r12)
            goto L_0x00f0
        L_0x00eb:
            android.view.View r1 = r0.f54149v
            r1.setBackgroundColor(r2)
        L_0x00f0:
            android.view.View r1 = r0.findViewById(r7)
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r7.mo10233c(r3)
            java.lang.Object[] r13 = r7.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r15 = "setShakeService"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r3 = r7.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r13 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r14 = "setShakeService"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r3[r2] = r7
            r1.mo160131h(r6, r3)
            r20 = 834(0x342, double:4.12E-321)
            r22 = 3
            r24 = 1
            r19 = r1
            r19.mo175913w(r20, r22, r24)
            com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct
            r1.<init>()
            goto L_0x0286
        L_0x0151:
            int r1 = r0.f54124h1
            if (r1 != r5) goto L_0x0179
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r14 = "[shakezb] isChineseAppLang :"
            r1.append(r14)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isChineseAppLang()
            r1.append(r14)
            java.lang.String r14 = " ,getApplicationLanguage[en or zh_CN or zh_HK or zh_TW is avaliable] :"
            r1.append(r14)
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
        L_0x0179:
            int r1 = r0.f54124h1
            if (r1 != r8) goto L_0x01f7
            boolean r1 = rn2.C77542a.m93507h()
            if (r1 == 0) goto L_0x01f7
            r0.f54124h1 = r8
            android.widget.TextView r1 = r0.f54147u
            r12 = 2131836587(0x7f113eab, float:1.9306345E38)
            r1.setText(r12)
            r0.f54154x0 = r12
            r0.mo24640S7(r2)
            r0.mo24638Q7(r2)
            r0.mo24639R7(r2)
            android.view.View r1 = r0.findViewById(r7)
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r7.mo10233c(r3)
            java.lang.Object[] r14 = r7.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r16 = "setShakeService"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r3 = r7.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r14 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r15 = "setShakeService"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            r27.mo24650c8()
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3[r2] = r7
            r1.mo160131h(r6, r3)
            r21 = 834(0x342, double:4.12E-321)
            r23 = 5
            r25 = 1
            r20 = r1
            r20.mo175913w(r21, r23, r25)
            goto L_0x0286
        L_0x01f7:
            r0.f54124h1 = r11
            android.widget.TextView r1 = r0.f54147u
            r14 = 2131836527(0x7f113e6f, float:1.9306223E38)
            r1.setText(r14)
            r0.f54154x0 = r14
            r0.mo24638Q7(r11)
            r0.mo24640S7(r2)
            r0.mo24639R7(r2)
            boolean r1 = r0.f54123h
            if (r1 == 0) goto L_0x0221
            android.os.Looper r1 = r27.getMainLooper()
            android.os.Handler r1 = com.tencent.p014mm.sdk.platformtools.MMHandler.createFreeHandler(r1)
            com.tencent.mm.plugin.shake.ui.ShakeReportUI$$c r14 = new com.tencent.mm.plugin.shake.ui.ShakeReportUI$$c
            r14.<init>(r0)
            r1.postDelayed(r14, r12)
            goto L_0x0226
        L_0x0221:
            android.view.View r1 = r0.f54149v
            r1.setBackgroundColor(r2)
        L_0x0226:
            boolean r1 = qc0.C77328l.m93194c()
            if (r1 == 0) goto L_0x026e
            android.view.View r1 = r0.findViewById(r7)
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r7.mo10233c(r3)
            java.lang.Object[] r13 = r7.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r15 = "setShakeService"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r3 = r7.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r13 = "com/tencent/mm/plugin/shake/ui/ShakeReportUI"
            java.lang.String r14 = "setShakeService"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x026e:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r3[r2] = r7
            r1.mo160131h(r6, r3)
            r20 = 834(0x342, double:4.12E-321)
            r22 = 1
            r24 = 1
            r19 = r1
            r19.mo175913w(r20, r22, r24)
        L_0x0286:
            nn2.l r1 = r0.f54136p
            int r3 = r0.f54124h1
            int r6 = r1.f61388a
            if (r3 != r6) goto L_0x0295
            nn2.l$b r6 = r1.f61389b
            nn2.l$a r7 = r6.f61391d
            if (r7 == 0) goto L_0x0295
            goto L_0x02e9
        L_0x0295:
            nn2.l$b r6 = r1.f61389b
            if (r6 == 0) goto L_0x02a0
            nn2.l$a r7 = r6.f61391d
            if (r7 == 0) goto L_0x02a0
            r6.mo33950a()
        L_0x02a0:
            if (r3 == r11) goto L_0x02d7
            if (r3 == r9) goto L_0x02c3
            if (r3 == r10) goto L_0x02bb
            if (r3 == r5) goto L_0x02b3
            if (r3 == r8) goto L_0x02ab
            goto L_0x02de
        L_0x02ab:
            qn2.g r5 = new qn2.g
            r5.<init>(r0)
            r1.f61389b = r5
            goto L_0x02de
        L_0x02b3:
            sn2.k r5 = new sn2.k
            r5.<init>(r0)
            r1.f61389b = r5
            goto L_0x02de
        L_0x02bb:
            sn2.t r5 = new sn2.t
            r5.<init>(r0, r0)
            r1.f61389b = r5
            goto L_0x02de
        L_0x02c3:
            sn2.p r5 = sn2.C22377p.f63447g
            if (r5 == 0) goto L_0x02cb
            nn2.l$a r5 = r5.f61391d
            if (r5 != 0) goto L_0x02d2
        L_0x02cb:
            sn2.p r5 = new sn2.p
            r5.<init>(r0, r0)
            sn2.C22377p.f63447g = r5
        L_0x02d2:
            sn2.p r5 = sn2.C22377p.f63447g
            r1.f61389b = r5
            goto L_0x02de
        L_0x02d7:
            nn2.e r5 = new nn2.e
            r5.<init>(r0, r0)
            r1.f61389b = r5
        L_0x02de:
            r1.f61388a = r3
            jn2.C21269b.f60083b = r3
            nn2.l$b r3 = r1.f61389b
            r3.mo33951b()
            nn2.l$b r6 = r1.f61389b
        L_0x02e9:
            boolean r1 = r0.f54121g
            if (r1 != 0) goto L_0x02f0
            r0.mo24644W7(r2)
        L_0x02f0:
            boolean r1 = r6 instanceof sn2.C22377p
            if (r1 == 0) goto L_0x02fb
            r1 = r6
            sn2.p r1 = (sn2.C22377p) r1
            sn2.m r2 = r0.f54100U
            r1.f63449f = r2
        L_0x02fb:
            boolean r1 = rn2.C77542a.m93507h()
            if (r1 == 0) goto L_0x036c
            boolean r1 = r6 instanceof qn2.C22121g
            if (r1 == 0) goto L_0x036c
            qn2.g r6 = (qn2.C22121g) r6
            int r1 = r0.f54144s1
            r6.f62565j = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ShakeCardService from_scene:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MicroMsg.ShakeCardService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            int r1 = r0.f54144s1
            if (r1 != r10) goto L_0x036c
            java.lang.String r1 = "open shake card from specialview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            android.content.Intent r1 = r27.getIntent()
            java.lang.String r3 = "key_shake_card_ext_info"
            java.lang.String r1 = r1.getStringExtra(r3)
            if (r1 == 0) goto L_0x0358
            int r3 = r1.length()
            r4 = 256(0x100, float:3.59E-43)
            if (r3 > r4) goto L_0x0358
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ShakeCardService mExtInfo:"
            r3.append(r4)
            java.lang.String r4 = r6.f62566n
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r6.f62566n = r1
            goto L_0x036c
        L_0x0358:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ShakeCardService ext_info size > 256 byte, extinfo:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x036c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.shake.p103ui.ShakeReportUI.mo24643V7():void");
    }

    /* renamed from: W7 */
    public final void mo24644W7(boolean z) {
        View view = this.f54141r;
        if (view == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "setShakeWaitingTVVisiblility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "setShakeWaitingTVVisiblility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(4);
        View view3 = view;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "setShakeWaitingTVVisiblility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "setShakeWaitingTVVisiblility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: X7 */
    public final void mo24645X7(String str) {
        this.f54121g = false;
        if (this.f54119f) {
            PlaySound.play(getContext(), C0966R.string.f361353j50);
        }
        if (this.f54071B == null) {
            this.f54071B = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2388bp);
        }
        mo24648a8(2);
        if (str == null || str.length() <= 1) {
            this.f54145t.setText(C0966R.string.f361349j40);
        } else {
            this.f54145t.setText(str);
        }
        this.f54145t.startAnimation(this.f54071B);
        MMHandlerThread.postToMainThreadDelayed(new Runnable() {
            public void run() {
                ShakeReportUI shakeReportUI = ShakeReportUI.this;
                List<C48438k.C48443e> list = ShakeReportUI.f54068I1;
                shakeReportUI.mo24642U7(false);
                ShakeReportUI.this.mo24644W7(false);
            }
        }, this.f54071B.getDuration());
        ShakeActionReportStruct shakeActionReportStruct = new ShakeActionReportStruct();
        shakeActionReportStruct.f48573n = this.f54136p.mo33949a();
        C119179t tVar = C119157j.f356862d;
        C21268a aVar = new C21268a(shakeActionReportStruct, 14);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183889t(aVar, 100, (String) null);
    }

    /* renamed from: Y7 */
    public final void mo24646Y7(C22120e eVar) {
        ShakeCardDialog shakeCardDialog;
        C1922021 r0 = new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                dialogInterface.dismiss();
                ShakeReportUI shakeReportUI = ShakeReportUI.this;
                shakeReportUI.f54125i = true;
                shakeReportUI.f54146t1 = null;
                shakeReportUI.f54147u.setText("");
            }
        };
        C1922122 r1 = new ShakeCardDialog.C19199c() {
            /* renamed from: a */
            public void mo24617a() {
                ShakeReportUI shakeReportUI = ShakeReportUI.this;
                shakeReportUI.f54125i = true;
                shakeReportUI.f54147u.setText("");
            }
        };
        String str = ShakeCardDialog.f54009K;
        if (isFinishing()) {
            shakeCardDialog = null;
        } else {
            ShakeCardDialog shakeCardDialog2 = new ShakeCardDialog(this, C0966R.style.a67);
            shakeCardDialog2.setOnCancelListener(r0);
            shakeCardDialog2.setCancelable(true);
            shakeCardDialog2.f54012C = eVar;
            if (eVar == null) {
                Log.m105920e("MicroMsg.ShakeCardDialog", "updateView() mCardItem == null");
            } else {
                if (TextUtils.isEmpty(eVar.f62546d)) {
                    shakeCardDialog2.f54023g.setText(shakeCardDialog2.f54012C.f62546d);
                }
                Log.m105924i("MicroMsg.ShakeCardDialog", "updateView() action_type is has card");
                shakeCardDialog2.f54016G = ShakeCardDialog.C19198b.PRE_ACCEPT;
                shakeCardDialog2.mo24612f();
                shakeCardDialog2.mo24611e();
                if (shakeCardDialog2.f54011B == 0) {
                    shakeCardDialog2.f54021e.setBackgroundResource(C0966R.C0969drawable.ar_);
                    shakeCardDialog2.f54030q.setBackgroundResource(C0966R.C0969drawable.ara);
                    shakeCardDialog2.f54023g.setTextColor(shakeCardDialog2.f54015F.getColor(C0966R.color.a7f));
                    shakeCardDialog2.f54024h.setTextColor(shakeCardDialog2.f54015F.getColor(C0966R.color.a6z));
                    shakeCardDialog2.f54025i.setTextColor(shakeCardDialog2.f54015F.getColor(C0966R.color.a6z));
                    shakeCardDialog2.f54038y.setTextColor(shakeCardDialog2.getContext().getResources().getColor(C0966R.color.a7f));
                    shakeCardDialog2.f54026j.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                    shakeCardDialog2.f54026j.setTextColor(shakeCardDialog2.getContext().getResources().getColor(C0966R.color.al_));
                    shakeCardDialog2.f54027n.setTextColor(shakeCardDialog2.getContext().getResources().getColor(C0966R.color.a79));
                }
            }
            shakeCardDialog2.f54017H = r1;
            shakeCardDialog2.show();
            C76879j.m92730a(this, shakeCardDialog2);
            shakeCardDialog = shakeCardDialog2;
        }
        this.f54146t1 = shakeCardDialog;
    }

    /* renamed from: Z7 */
    public final void mo24647Z7(boolean z) {
        mo24649b8(z);
        if (this.f54101U0 == null) {
            this.f54101U0 = findViewById(C0966R.C0970id.eqh);
        }
        if (!z) {
            View view = this.f54101U0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int jo = C76942m.Ax0().mo59792jo();
        if (jo <= 0) {
            View view3 = this.f54101U0;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f54105W0 == null) {
            this.f54105W0 = (TextView) this.f54101U0.findViewById(C0966R.C0970id.f359178jg0);
        }
        this.f54105W0.setText(getString(C0966R.string.j4r, new Object[]{Integer.valueOf(jo)}));
        this.f54101U0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Intent intent = new Intent(ShakeReportUI.this, ShakeMsgListUI.class);
                intent.putExtra("shake_msg_from", 1);
                intent.putExtra("shake_msg_list_title", ShakeReportUI.this.getString(C0966R.string.j69));
                ShakeReportUI shakeReportUI = ShakeReportUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                ShakeReportUI shakeReportUI2 = shakeReportUI;
                C117292a.m165358d(shakeReportUI2, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                shakeReportUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(shakeReportUI2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (this.f54103V0 == null) {
            this.f54103V0 = (MMImageView) findViewById(C0966R.C0970id.jg6);
        }
        C34936i Ax0 = C76942m.Ax0();
        Ax0.getClass();
        C34935h hVar = null;
        Cursor rawQuery = Ax0.f93791d.rawQuery("SELECT * FROM " + Ax0.getTableName() + " where status != " + 1 + " ORDER BY " + "rowid" + " DESC LIMIT 1", (String[]) null, 2);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                hVar = new C34935h();
                hVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        if (hVar != null) {
            String str = hVar.field_thumburl;
            if (!Util.isNullOrNil(str)) {
                C78239b bVar = new C78239b(str);
                Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(bVar);
                this.f54103V0.setTag(bVar.mo94820d());
                if (N6 == null || N6.isRecycled()) {
                    this.f54103V0.setImageResource(C0966R.raw.app_attach_file_icon_webpage);
                } else {
                    this.f54103V0.setImageBitmap(N6);
                }
            } else {
                this.f54103V0.setImageResource(C0966R.raw.app_attach_file_icon_webpage);
            }
        }
        View view5 = this.f54101U0;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showShakeMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: a8 */
    public final void mo24648a8(int i) {
        mo24644W7(i == 1);
        if (i == 2) {
            mo24642U7(true);
        } else {
            mo24642U7(false);
        }
    }

    /* renamed from: b8 */
    public final void mo24649b8(boolean z) {
        if (this.f54099T0 == null) {
            this.f54099T0 = findViewById(C0966R.C0970id.eqg);
        }
        int i = this.f54136p.f61388a;
        if (i == 2 || i == 3 || i == 4 || i == 5 || !z) {
            View view = this.f54099T0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int Ow = C75743h.yx0().mo101222Ow();
        if (Ow <= 0) {
            View view2 = this.f54099T0;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view4 = this.f54099T0;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showSayHiMsgLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) this.f54099T0.findViewById(C0966R.C0970id.j0x)).setText(getResources().getQuantityString(C0966R.plurals.f7246a3, Ow, new Object[]{Integer.valueOf(Ow)}));
        this.f54099T0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Intent intent = new Intent(ShakeReportUI.this, ShakeSayHiListUI.class);
                intent.putExtra("IntentSayHiType", 1);
                intent.putExtra("IntentNewSayHiMsg", true);
                ShakeReportUI shakeReportUI = ShakeReportUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                ShakeReportUI shakeReportUI2 = shakeReportUI;
                C117292a.m165358d(shakeReportUI2, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                shakeReportUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(shakeReportUI2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$12", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (this.f54107X0 == null) {
            this.f54107X0 = (ImageView) findViewById(C0966R.C0970id.gpl);
        }
        C72991u4 Lo = C75743h.yx0().mo101221Lo();
        if (Lo != null) {
            this.f54109Y0 = Lo.field_sayhiuser;
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f54107X0, this.f54109Y0);
        }
    }

    /* renamed from: c8 */
    public final void mo24650c8() {
        Class cls = C30914c.class;
        if (this.f54124h1 == 5 && C77542a.m93507h()) {
            boolean b = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262154, 266258);
            boolean b2 = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262155, 266259);
            if (b) {
                mo24641T7((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, ""), true);
            } else if (b2) {
                mo24641T7((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_CARD_TAB_RED_DOT_DESC_STRING_SYNC, ""), true);
            } else if (!this.f54148u1) {
                C85801v1 u = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_TIP_STRING_SYNC;
                if (!TextUtils.isEmpty((String) u.mo119685f(aVar, ""))) {
                    mo24641T7((String) C97625j3.m125812b().mo105906u().mo119685f(aVar, ""), true);
                } else {
                    mo24641T7(getString(C0966R.string.j3k), true);
                }
            }
        }
    }

    /* renamed from: d8 */
    public final void mo24651d8() {
        Class cls = C30914c.class;
        boolean g = C77542a.m93506g();
        boolean b = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262154, 266258);
        boolean b2 = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262155, 266259);
        int intExtra = getIntent().getBooleanExtra("shake_card", false) ? getIntent().getIntExtra("shake_card", 0) : 0;
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(11668, 1, Integer.valueOf(intExtra), Integer.valueOf(b ? 1 : 0), Integer.valueOf(g ? 1 : 0), C77542a.m93503d(), Integer.valueOf(C77542a.m93502c()));
        nVar.mo160131h(11668, 2, Integer.valueOf(intExtra), Integer.valueOf(b2 ? 1 : 0), Integer.valueOf(g), C77542a.m93503d(), Integer.valueOf(C77542a.m93502c()));
    }

    /* renamed from: e8 */
    public final void mo24652e8(boolean z) {
        if (this.f54124h1 != 3 || z) {
            View view = this.f54128j1;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C36747b0 Bx0 = C76942m.Bx0();
        Bx0.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = Bx0.f97613d.rawQuery("SELECT * FROM shaketvhistory ORDER BY createtime DESC LIMIT 4", (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C36746a0 a0Var = new C36746a0();
            a0Var.convertFrom(rawQuery);
            arrayList.add(a0Var);
        }
        rawQuery.close();
        int size = arrayList.size();
        if (size == 0) {
            View view2 = this.f54128j1;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view4 = this.f54135o1;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view6 = this.f54138p1;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view8 = this.f54140q1;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        View view9 = view8;
        C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view9, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view10 = this.f54142r1;
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(8);
        View view11 = view10;
        C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view11, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (size >= 1) {
            C19239e.m20384b(this.f54129k1, ((C36746a0) arrayList.get(0)).field_iconurl, 0, true);
            ImageView imageView = this.f54129k1;
            C36746a0 a0Var2 = (C36746a0) arrayList.get(0);
            AppCompatActivity context = getContext();
            if (imageView != null) {
                imageView.setOnClickListener(new C48446r(a0Var2, context));
            }
            View view12 = this.f54135o1;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (size >= 2) {
            C19239e.m20384b(this.f54130l1, ((C36746a0) arrayList.get(1)).field_iconurl, 0, true);
            ImageView imageView2 = this.f54130l1;
            C36746a0 a0Var3 = (C36746a0) arrayList.get(1);
            AppCompatActivity context2 = getContext();
            if (imageView2 != null) {
                imageView2.setOnClickListener(new C48446r(a0Var3, context2));
            }
            View view13 = this.f54138p1;
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(0);
            C117292a.m165358d(view13, aVar8.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view13, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (size >= 3) {
            C19239e.m20384b(this.f54131m1, ((C36746a0) arrayList.get(2)).field_iconurl, 0, true);
            ImageView imageView3 = this.f54131m1;
            C36746a0 a0Var4 = (C36746a0) arrayList.get(2);
            AppCompatActivity context3 = getContext();
            if (imageView3 != null) {
                imageView3.setOnClickListener(new C48446r(a0Var4, context3));
            }
            View view14 = this.f54140q1;
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(0);
            View view15 = view14;
            C117292a.m165358d(view15, aVar9.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view15, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (size >= 4) {
            this.f54133n1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$26", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    C115669n.INSTANCE.mo160131h(12108, "", 1, 3);
                    Intent intent = new Intent();
                    intent.setClass(ShakeReportUI.this.getContext(), ShakeTvHistoryListUI.class);
                    ShakeReportUI shakeReportUI = ShakeReportUI.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    ShakeReportUI shakeReportUI2 = shakeReportUI;
                    C117292a.m165358d(shakeReportUI2, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI$26", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    shakeReportUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(shakeReportUI2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$26", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$26", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            View view16 = this.f54142r1;
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(0);
            View view17 = view16;
            C117292a.m165358d(view17, aVar10.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view16.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view17, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view18 = this.f54128j1;
        C9556a aVar11 = new C9556a();
        aVar11.mo10233c(0);
        View view19 = view18;
        C117292a.m165358d(view19, aVar11.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view18.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
        C117292a.m165359e(view19, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateShakeTVHistoryLl", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: f4 */
    public void mo24653f4() {
        this.f54136p.getClass();
        mo24643V7();
        if (this.f54121g) {
            this.f54136p.getClass();
        }
    }

    /* renamed from: f8 */
    public final void mo24654f8() {
        if (C77328l.m93194c()) {
            Log.m105924i("MicroMsg.ShakeReportUI", "is not oversea user, show shake music");
            ((HashMap) this.f54150v1).put(2, Boolean.TRUE);
            View findViewById = findViewById(C0966R.C0970id.f359182jh0);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateTabView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateTabView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (C77328l.m93193b()) {
                if (C97625j3.m125812b().mo105906u().mo119688i(4118, 0) == 0) {
                    this.f54122g1.setVisibility(0);
                } else {
                    this.f54122g1.setVisibility(8);
                }
            }
        } else {
            ((HashMap) this.f54150v1).put(2, Boolean.FALSE);
            View findViewById2 = findViewById(C0966R.C0970id.f359182jh0);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateTabView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "updateTabView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105924i("MicroMsg.ShakeReportUI", "is oversea user, hide shake music");
        }
        if (C48447s.m53803e()) {
            ((HashMap) this.f54150v1).put(3, Boolean.TRUE);
            Log.m105924i("MicroMsg.ShakeReportUI", "show shake tv tab");
        } else {
            ((HashMap) this.f54150v1).put(3, Boolean.FALSE);
            Log.m105924i("MicroMsg.ShakeReportUI", "hide shake tv tab");
        }
        if (C77542a.m93507h()) {
            ((HashMap) this.f54150v1).put(5, Boolean.TRUE);
            Log.m105924i("MicroMsg.ShakeReportUI", "show shake card tab");
        } else {
            ((HashMap) this.f54150v1).put(5, Boolean.FALSE);
            Log.m105924i("MicroMsg.ShakeReportUI", "hide shake card tab");
        }
        int i = 0;
        for (Boolean booleanValue : ((HashMap) this.f54150v1).values()) {
            if (booleanValue.booleanValue()) {
                i++;
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.jgh);
        if (i == 1) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        if (i > 4) {
            Log.m105924i("MicroMsg.ShakeReportUI", "show tab count is > 4 and beaconMap.size() <= 0.");
        }
    }

    /* renamed from: g8 */
    public final void mo24655g8() {
        boolean nullAsTrue = Util.nullAsTrue((Boolean) C97625j3.m125812b().mo105906u().mo119684e(4112, (Object) null));
        this.f54119f = nullAsTrue;
        if (nullAsTrue) {
            setTitleMuteIconVisibility(8);
        } else {
            setTitleMuteIconVisibility(0);
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bym;
    }

    public void initView() {
        C77542a.m93500a();
        Map<Integer, Boolean> map = this.f54150v1;
        Boolean bool = Boolean.TRUE;
        ((HashMap) map).put(1, bool);
        Map<Integer, Boolean> map2 = this.f54150v1;
        Boolean bool2 = Boolean.FALSE;
        ((HashMap) map2).put(2, bool2);
        ((HashMap) this.f54150v1).put(3, bool2);
        ((HashMap) this.f54150v1).put(4, bool2);
        ((HashMap) this.f54150v1).put(5, bool2);
        new C20828a((Context) this);
        this.f54143s = (TextView) findViewById(C0966R.C0970id.jgl);
        this.f54141r = findViewById(C0966R.C0970id.jh6);
        this.f54145t = (TextView) findViewById(C0966R.C0970id.jgc);
        this.f54147u = (TextView) findViewById(C0966R.C0970id.jgk);
        this.f54128j1 = findViewById(C0966R.C0970id.jhj);
        this.f54129k1 = (ImageView) findViewById(C0966R.C0970id.jh8);
        this.f54130l1 = (ImageView) findViewById(C0966R.C0970id.jh_);
        this.f54131m1 = (ImageView) findViewById(C0966R.C0970id.jhb);
        this.f54133n1 = (ImageView) findViewById(C0966R.C0970id.jhd);
        this.f54135o1 = findViewById(C0966R.C0970id.jh9);
        this.f54138p1 = findViewById(C0966R.C0970id.jha);
        this.f54140q1 = findViewById(C0966R.C0970id.jhc);
        this.f54142r1 = findViewById(C0966R.C0970id.jhe);
        this.f54089M = findViewById(C0966R.C0970id.jgb);
        this.f54102V = (MMAnimateView) findViewById(C0966R.C0970id.jgd);
        this.f54088L = findViewById(C0966R.C0970id.jg7);
        this.f54087K = findViewById(C0966R.C0970id.h77);
        this.f54104W = (MMAnimateView) findViewById(C0966R.C0970id.jgj);
        this.f54090N = findViewById(C0966R.C0970id.jg9);
        this.f54091P = findViewById(C0966R.C0970id.jg8);
        this.f54149v = findViewById(C0966R.C0970id.jhk);
        this.f54151w = findViewById(C0966R.C0970id.jfk);
        this.f54156y = findViewById(C0966R.C0970id.jga);
        this.f54157y0 = (WeImageView) findViewById(C0966R.C0970id.hhp);
        this.f54093Q0 = (WeImageView) findViewById(C0966R.C0970id.hhq);
        this.f54095R0 = (WeImageView) findViewById(C0966R.C0970id.h76);
        this.f54097S0 = (WeImageView) findViewById(C0966R.C0970id.h7h);
        View findViewById = findViewById(C0966R.C0970id.jgi);
        this.f54139q = findViewById;
        findViewById.setOnClickListener(this.f54084H1);
        this.f54106X = (ImageView) findViewById(C0966R.C0970id.jge);
        this.f54110Z = (TextView) findViewById(C0966R.C0970id.jgg);
        this.f54137p0 = (TextView) findViewById(C0966R.C0970id.jgf);
        ImageView imageView = (ImageView) this.f54139q.findViewById(C0966R.C0970id.jfw);
        this.f54126i1 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (ShakeReportUI.this.f54124h1 != 4) {
                    Intent intent = new Intent(ShakeReportUI.this.getContext(), ProfileHdHeadImg.class);
                    intent.putExtra("username", (String) ShakeReportUI.this.f54139q.getTag());
                    ShakeReportUI shakeReportUI = ShakeReportUI.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    ShakeReportUI shakeReportUI2 = shakeReportUI;
                    C117292a.m165358d(shakeReportUI2, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    shakeReportUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(shakeReportUI2, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C119179t tVar = C119157j.f356862d;
                    C21268a aVar2 = new C21268a((ShakeActionReportStruct) null, 5);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183889t(aVar2, 100, (String) null);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        mo24632L7();
        View inflate = View.inflate(getContext(), C0966R.C0971layout.byg, (ViewGroup) null);
        C77390c0 c0Var = new C77390c0(getContext(), C0966R.style.a66);
        this.f54112a1 = c0Var;
        c0Var.setContentView(inflate);
        this.f54112a1.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
                    public boolean queueIdle() {
                        ShakeReportUI shakeReportUI = ShakeReportUI.this;
                        C76912y0.m92776o(shakeReportUI, 0, shakeReportUI.getString(C0966R.string.j5l), 2000);
                        C97625j3.m125812b().mo105906u().mo119676J(4117, Boolean.TRUE);
                        return false;
                    }
                });
            }
        });
        ((Button) inflate.findViewById(C0966R.C0970id.jfo)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ShakeReportUI.this.f54112a1.cancel();
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        boolean nullAsFalse = Util.nullAsFalse((Boolean) C97625j3.m125812b().mo105906u().mo119684e(4108, bool));
        boolean nullAsFalse2 = Util.nullAsFalse((Boolean) C97625j3.m125812b().mo105906u().mo119684e(4117, (Object) null));
        if (!nullAsFalse) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = inflate;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showIntroInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/shake/ui/ShakeReportUI", "showIntroInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f54112a1.show();
            C97625j3.m125812b().mo105906u().mo119676J(4108, bool);
        } else if (!nullAsFalse2) {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
                public boolean queueIdle() {
                    ShakeReportUI shakeReportUI = ShakeReportUI.this;
                    C76912y0.m92776o(shakeReportUI, 0, shakeReportUI.getString(C0966R.string.j5l), 2000);
                    C97625j3.m125812b().mo105906u().mo119676J(4117, Boolean.TRUE);
                    return false;
                }
            });
        }
        int j = C76577a.m92159j(getContext());
        int A = C76577a.m92145A(getContext());
        int f = C75044y4.m89994f(this);
        int i = A - 50;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f54102V.getLayoutParams();
        double d = (double) j;
        int i2 = (int) (0.35d * d);
        layoutParams.setMargins(0, i2, 0, 0);
        this.f54102V.setLayoutParams(layoutParams);
        int f2 = C76577a.m92155f(getContext(), C0966R.dimen.f3713c6);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f54110Z.getLayoutParams();
        int i3 = i2 + f2;
        layoutParams2.setMargins(0, i3, 0, 0);
        this.f54110Z.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f54088L.getLayoutParams();
        layoutParams3.setMargins(0, (int) (d * 0.2d), 0, 0);
        layoutParams3.height = i;
        this.f54088L.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f54137p0.getLayoutParams();
        layoutParams4.setMargins(0, i3, 0, 0);
        this.f54137p0.setLayoutParams(layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f54090N.getLayoutParams();
        layoutParams5.width = i;
        layoutParams5.height = i;
        this.f54090N.setLayoutParams(layoutParams5);
        this.f54149v.setPadding(0, f, 0, 0);
        this.f54087K.setPadding(0, f, 0, 0);
        ShakeReportUI$$d shakeReportUI$$d = new ShakeReportUI$$d(this);
        ShakeReportUI$$e shakeReportUI$$e = new ShakeReportUI$$e(this);
        this.f54157y0.setOnClickListener(shakeReportUI$$d);
        this.f54095R0.setOnClickListener(shakeReportUI$$d);
        this.f54093Q0.setOnClickListener(shakeReportUI$$e);
        this.f54097S0.setOnClickListener(shakeReportUI$$e);
        C54205 r0 = new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/shake/ui/ShakeReportUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ShakeReportUI shakeReportUI = ShakeReportUI.this;
                List<C48438k.C48443e> list = ShakeReportUI.f54068I1;
                shakeReportUI.mo24631K7(view);
                C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/ShakeReportUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        this.f54114c1 = (WeImageView) findViewById(C0966R.C0970id.jgq);
        this.f54116d1 = (TextView) findViewById(C0966R.C0970id.jgs);
        this.f54118e1 = (WeImageView) findViewById(C0966R.C0970id.jgz);
        this.f54120f1 = (TextView) findViewById(C0966R.C0970id.f359184jh2);
        this.f54122g1 = (ImageView) findViewById(C0966R.C0970id.f359183jh1);
        findViewById(C0966R.C0970id.jgr).setOnClickListener(r0);
        findViewById(C0966R.C0970id.f359182jh0).setOnClickListener(r0);
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        MMImageView mMImageView;
        if (str != null && bitmap != null && !bitmap.isRecycled() && (mMImageView = this.f54103V0) != null && mMImageView.getTag() != null && str.equals((String) this.f54103V0.getTag())) {
            this.f54103V0.setImageBitmap(bitmap);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C101106m mVar;
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 30764) {
                        if (intent != null) {
                            Bundle bundleExtra = intent.getBundleExtra("result_data");
                            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
                                this.f54152w1 = true;
                                finish();
                                return;
                            }
                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.TRUE);
                            ((C103918d) C86312j.m106911c(C103918d.class)).mo125790zt(this, "android.permission.ACCESS_FINE_LOCATION", 64);
                            this.f54152w1 = false;
                            return;
                        }
                        this.f54152w1 = true;
                        finish();
                    }
                } else if (i2 == 1 && (mVar = this.f54074C1) != null) {
                    C101093a.m132488j(mVar);
                    C101106m mVar2 = this.f54074C1;
                    Class cls = C59326j.class;
                    ((C59326j) C86312j.m106911c(cls)).mo84431a8(mVar2.f295976x);
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_mv_song_name", mVar2.f295962g);
                    intent2.putExtra("key_mv_song_lyric", mVar2.f295969q);
                    intent2.putExtra("key_mv_album_cover_url", mVar2.f295965j);
                    ((C59326j) C86312j.m106911c(cls)).mo84429HI(intent2.getExtras());
                    Log.printDebugStack("MicroMsg.GlobalMusicMvFloatBallUtil", "alvinluo Mv onPause hideAllFloatBall: %s, resumeFloatBall: %b", Boolean.FALSE, Boolean.TRUE);
                }
            } else if (intent != null) {
                String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                C97625j3.m125812b().mo105906u().mo119676J(4110, Boolean.FALSE);
                C97625j3.m125812b().mo105906u().mo119676J(4111, stringExtra);
                mo24632L7();
            }
        } else if (intent != null) {
            Intent intent3 = new Intent();
            intent3.putExtra("CropImageMode", 4);
            intent3.putExtra("CropImage_Filter", true);
            intent3.putExtra("CropImage_DirectlyIntoFilter", true);
            StringBuilder sb = new StringBuilder();
            C97625j3.m125812b().getClass();
            sb.append(C7970a.m8127a());
            sb.append("custom_shake_img_filename.jpg");
            intent3.putExtra("CropImage_OutputPath", sb.toString());
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93180m(intent3, 2, this, intent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = 109(0x6d, float:1.53E-43)
            r10.supportRequestWindowFeature(r0)
            super.onCreate(r11)
            r11 = 0
            r10.setActionbarColor(r11)
            android.view.Window r0 = r10.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 1792(0x700, float:2.511E-42)
            r0.setSystemUiVisibility(r1)
            android.view.Window r0 = r10.getWindow()
            in3.C87773e.m109211d(r0)
            r10.hideActionbarLine()
            r10.hideActionBarOperationArea()
            androidx.appcompat.app.ActionBar r0 = r10.getSupportActionBar()
            if (r0 == 0) goto L_0x0033
            androidx.appcompat.app.ActionBar r0 = r10.getSupportActionBar()
            r0.mo91104o()
        L_0x0033:
            r10.setNavigationbarColor(r11)
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r1 = "enter_from_scene"
            r2 = 1
            int r0 = r0.getIntExtra(r1, r2)
            jn2.C21269b.f60084c = r0
            r10.hideTitleView()
            r10.hideActionbarLine()
            java.lang.Class<ts.c> r0 = p702ts.C78085c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ts.c r0 = (p702ts.C78085c) r0
            cc0.b r0 = r0.mo108056ms()
            r10.f54070A1 = r0
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_TV_LATITUDE_STRING
            java.lang.String r3 = ""
            r0.mo119677K(r1, r3)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_TV_LONGTITUDE_STRING
            r0.mo119677K(r1, r3)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_TV_ACCURACY_STRING
            r0.mo119677K(r1, r3)
            qn2.f r0 = nn2.C76942m.yx0()
            java.util.List<java.lang.ref.WeakReference<qn2.f$a>> r1 = r0.f225595a
            if (r1 != 0) goto L_0x008f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f225595a = r1
        L_0x008f:
            java.util.List<java.lang.ref.WeakReference<qn2.f$a>> r0 = r0.f225595a
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r10)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
            r10.initView()
            com.tencent.mm.plugin.shake.ui.c r0 = new com.tencent.mm.plugin.shake.ui.c
            android.view.View r1 = r10.getBodyView()
            r0.<init>(r1)
            r10.f54134o = r0
            ud3.d r0 = new ud3.d
            r0.<init>(r10)
            r10.f54132n = r0
            android.hardware.SensorManager r0 = r0.f300319a
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = "MicroMsg.ShakeSensorService"
            java.lang.String r1 = "cannot init sensor manager"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x00ca
        L_0x00bc:
            java.util.List r0 = r0.getSensorList(r2)
            if (r0 == 0) goto L_0x00ca
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00ca
            r0 = 1
            goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            if (r0 != 0) goto L_0x00db
            r0 = 2131836572(0x7f113e9c, float:1.9306315E38)
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            com.tencent.mm.plugin.shake.ui.ShakeReportUI$2 r3 = new com.tencent.mm.plugin.shake.ui.ShakeReportUI$2
            r3.<init>()
            nj3.C76879j.m92742m(r10, r0, r1, r3)
        L_0x00db:
            java.lang.Class<om.f> r0 = p214om.C11502f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.y r0 = r0.mo11461Sr()
            r0.mo93136Bk()
            java.lang.Class<xs.b> r0 = p755xs.C102720b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xs.b r0 = (p755xs.C102720b) r0
            r0.U70(r10)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            android.content.res.Resources r1 = r10.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            java.lang.String r1 = r1.toString()
            r0[r11] = r1
            java.lang.String r1 = "MicroMsg.ShakeReportUI"
            java.lang.String r3 = "%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            nn2.i r0 = nn2.C76942m.Ax0()
            int r0 = r0.mo59792jo()
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 11317(0x2c35, float:1.5858E-41)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r11] = r0
            java.lang.String r0 = com.tencent.p014mm.plugin.shake.p103ui.C19239e.m20383a()
            r4[r2] = r0
            r3.mo160131h(r1, r4)
            r0 = 11710(0x2dbe, float:1.6409E-41)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1[r11] = r4
            r3.mo160131h(r0, r1)
            r4 = 834(0x342, double:4.12E-321)
            r6 = 0
            r8 = 1
            r3.mo175913w(r4, r6, r8)
            zt3.t r11 = zt3.C119157j.f356862d
            jn2.a r0 = new jn2.a
            r1 = 0
            r0.<init>(r1, r2)
            zt3.j r11 = (zt3.C119157j) r11
            r11.getClass()
            r2 = 100
            r11.mo183889t(r0, r2, r1)
            com.tencent.mm.plugin.shake.ui.ShakeReportUI$$f r11 = new com.tencent.mm.plugin.shake.ui.ShakeReportUI$$f
            r11.<init>(r10)
            r10.f54100U = r11
            java.lang.Class<l31.e> r11 = l31.C61212e.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            l31.e r11 = (l31.C61212e) r11
            o31.b r0 = o31.C11345b.ShakeReportUI
            l31.e r11 = r11.mo86178qr(r10, r0)
            o31.a r0 = o31.C76986a.Shake
            r11.mo86179qs(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.shake.p103ui.ShakeReportUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C77376f.C77377a aVar;
        Bitmap bitmap = this.f54111Z0;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f54111Z0.recycle();
        }
        Dialog dialog = this.f54112a1;
        if (dialog != null && dialog.isShowing()) {
            this.f54112a1.dismiss();
            this.f54112a1 = null;
        }
        C21685l.C21687b bVar = this.f54136p.f61389b;
        if (bVar != null) {
            bVar.mo33950a();
        }
        C101998d dVar = this.f54132n;
        if (dVar != null) {
            dVar.mo141498b();
            this.f54132n = null;
        }
        C22377p pVar = C22377p.f63447g;
        if (pVar == null || pVar.f61391d == null) {
            C22377p.f63447g = new C22377p(this, (C21685l.C21686a) null);
        }
        C22377p.f63447g.getClass();
        C22377p.f63447g = null;
        ((C102720b) C86312j.m106911c(C102720b.class)).Bm0(this);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IBEACON_PUSH_IS_IN_SHAKEUI_BOOLEAN, Boolean.FALSE);
        int i = 0;
        if (C77542a.m93507h()) {
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33507p(262154, false);
        }
        ShakeCardDialog shakeCardDialog = this.f54146t1;
        if (shakeCardDialog != null && shakeCardDialog.isShowing()) {
            this.f54146t1.dismiss();
        }
        this.f54146t1 = null;
        C77376f yx02 = C76942m.yx0();
        if (yx02.f225595a != null) {
            while (true) {
                if (i < ((ArrayList) yx02.f225595a).size()) {
                    WeakReference weakReference = (WeakReference) ((ArrayList) yx02.f225595a).get(i);
                    if (weakReference != null && (aVar = (C77376f.C77377a) weakReference.get()) != null && aVar.equals(this)) {
                        ((ArrayList) yx02.f225595a).remove(weakReference);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        C22119d xx02 = C76942m.xx0();
        xx02.f62540d = -85.0f;
        xx02.f62541e = -1000.0f;
        C92411b bVar2 = this.f54070A1;
        if (bVar2 != null) {
            bVar2.mo126408b(this.f54072B1);
        }
        this.f54082G1.dead();
        super.onDestroy();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        mo24655g8();
        if (!this.f54123h) {
            mo24647Z7(true);
        }
    }

    public void onPause() {
        C97625j3.m125812b().mo105885K(this);
        C97625j3.m125812b().mo105906u().remove(this);
        C76942m.zx0().remove(this);
        C21685l.C21687b bVar = this.f54136p.f61389b;
        if (bVar != null) {
            bVar.mo33952c();
        }
        this.f54125i = false;
        C101998d dVar = this.f54132n;
        if (dVar != null) {
            dVar.mo141498b();
        }
        View view = this.f54134o.f54198a;
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        if (this.f54124h1 != 4) {
            C85801v1 u = C97625j3.m125812b().mo105906u();
            u.mo119676J(327696, this.f54124h1 + "");
        }
        if (this.f54124h1 == 3) {
            mo24628H7(3, false);
        }
        this.f54082G1.dead();
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.ShakeReportUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.ShakeReportUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 64) {
            if (i == 80) {
                if (iArr[0] == 0) {
                    this.f54155x1 = false;
                    return;
                }
                C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(ShakeReportUI.this.getContext());
                        ShakeReportUI.this.f54155x1 = false;
                    }
                }, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        ShakeReportUI.this.f54155x1 = false;
                    }
                });
            }
        } else if (iArr[0] == 0) {
            mo24633M7();
            this.f54155x1 = false;
        } else {
            this.f54152w1 = false;
            C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(ShakeReportUI.this.getContext());
                    ShakeReportUI shakeReportUI = ShakeReportUI.this;
                    shakeReportUI.f54152w1 = true;
                    shakeReportUI.f54155x1 = false;
                }
            }, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    ShakeReportUI shakeReportUI = ShakeReportUI.this;
                    shakeReportUI.f54152w1 = true;
                    shakeReportUI.f54155x1 = false;
                }
            });
        }
    }

    public void onResume() {
        super.onResume();
        this.f54082G1.alive();
        mo24633M7();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C10366a.class);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        onNotifyChange("", (MStorageEventData) null);
    }
}
