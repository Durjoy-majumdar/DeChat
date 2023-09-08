package sn3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C97182r4;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.wework.api.IWWAPI;
import d62.C7250m;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p682rz.C101488s;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C78065p;
import tm3.C78069w;
import um3.C78236a;
import um3.C78238c;
import wd3.C78575u;
import yb2.C15946a;

/* renamed from: sn3.g */
public final class C77745g extends C15946a {

    /* renamed from: d */
    public final C13601g f226560d = C36568h.m40985a(new C77749d(this));

    /* renamed from: e */
    public final C13601g f226561e = C36568h.m40985a(new C77748c(this));

    /* renamed from: f */
    public final C13601g f226562f = C36568h.m40985a(new C77746a(this));

    /* renamed from: g */
    public final String f226563g = "";

    /* renamed from: h */
    public final int f226564h = 2;

    /* renamed from: h4 */
    public final C13601g f226565h4 = C36568h.m40985a(new C27674e(this));

    /* renamed from: sn3.g$e */
    public static final class C27674e extends C87413o implements C32224a<String> {

        /* renamed from: B */
        public final /* synthetic */ C77745g f76610B;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27674e(C77745g gVar) {
            super(0);
            this.f76610B = gVar;
        }

        public Object invoke() {
            return this.f76610B.getIntent().getStringExtra("KEY_FORWARD_SOURCE_ID");
        }
    }

    /* renamed from: sn3.g$a */
    public static final class C77746a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C77745g f226566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77746a(C77745g gVar) {
            super(0);
            this.f226566d = gVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f226566d.getIntent().getIntExtra("KEY_DURATION", -1));
        }
    }

    /* renamed from: sn3.g$b */
    public static final class C77747b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C77745g f226567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77747b(C77745g gVar) {
            super(1);
            this.f226567d = gVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (pVar != null) {
                C77745g gVar = this.f226567d;
                Log.m105924i("MicroMsg.ForwardVideoUIC", "SelectConfirmAction usernameList:" + pVar.f228813a + ": ");
                List<String> list = pVar.f228813a;
                Bitmap bitmap = null;
                if (list.size() == 1) {
                    String str = list.get(0);
                    C78575u.C78583h hVar = new C78575u.C78583h(gVar.getContext());
                    hVar.mo108578p(str);
                    String str2 = gVar.f226563g;
                    String j3 = gVar.mo107875j3();
                    if (j3 != null) {
                        bitmap = BitmapUtil.getBitmapNative(j3);
                    }
                    if (bitmap != null) {
                        hVar.mo108566d(bitmap, gVar.f226564h);
                    }
                    hVar.mo108571i(str2);
                    hVar.mo108572j(2);
                    hVar.mo108564b(new C77750h(gVar, gVar.f226563g));
                    hVar.mo108569g(Boolean.TRUE);
                    hVar.f230208d = gVar.mo107874i3();
                    hVar.mo108563a(new C77744f(gVar, str));
                    hVar.mo108574l();
                } else {
                    C78575u.C78583h hVar2 = new C78575u.C78583h(gVar.getContext());
                    hVar2.mo108578p(list);
                    String str3 = gVar.f226563g;
                    String j35 = gVar.mo107875j3();
                    if (j35 != null) {
                        bitmap = BitmapUtil.getBitmapNative(j35);
                    }
                    if (bitmap != null) {
                        hVar2.mo108566d(bitmap, gVar.f226564h);
                    }
                    hVar2.mo108571i(str3);
                    hVar2.mo108572j(2);
                    hVar2.mo108564b(new C77750h(gVar, gVar.f226563g));
                    hVar2.mo108569g(Boolean.TRUE);
                    hVar2.f230208d = gVar.mo107874i3();
                    hVar2.mo108563a(new C77743e(gVar, list));
                    hVar2.mo108574l();
                }
            }
            if (((C78238c) wVar.checkAction(C78238c.class)) != null) {
                C77745g gVar2 = this.f226567d;
                C97182r4.m125144g(gVar2.getActivity(), gVar2.mo107876k3(), IWWAPI.WWAppType.WwAppTypeWxwork);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sn3.g$c */
    public static final class C77748c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C77745g f226568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77748c(C77745g gVar) {
            super(0);
            this.f226568d = gVar;
        }

        public Object invoke() {
            return this.f226568d.getIntent().getStringExtra("KEY_THUMB_PATH");
        }
    }

    /* renamed from: sn3.g$d */
    public static final class C77749d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C77745g f226569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77749d(C77745g gVar) {
            super(0);
            this.f226569d = gVar;
        }

        public Object invoke() {
            return this.f226569d.getIntent().getStringExtra("KEY_VIDEO_PATH");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77745g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static final boolean m93801g3(C77745g gVar, String str) {
        C77745g gVar2 = gVar;
        gVar.getClass();
        boolean z = false;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ForwardVideoUIC", "processForwardVideo: toUser empty");
        } else {
            Log.m105924i("MicroMsg.ForwardVideoUIC", "processForwardVideo: videoPath:" + gVar.mo107876k3() + " thumbPath:" + gVar.mo107875j3() + " duration:" + ((Number) ((C36570n) gVar2.f226562f).getValue()).intValue());
            if (TextUtils.isEmpty(gVar.mo107876k3()) || TextUtils.isEmpty(gVar.mo107875j3()) || !C86013q1.m106450k(gVar.mo107876k3()) || !C86013q1.m106450k(gVar.mo107875j3())) {
                Log.m105920e("MicroMsg.ForwardVideoUIC", "send video error");
                if (C94847c1.m120217e()) {
                    C75026b.m89951a(gVar.getActivity(), gVar2.getString(C0966R.string.n4x));
                }
            } else {
                C7250m.m7431a().Ml0(gVar.getActivity(), str, gVar.mo107876k3(), gVar.mo107875j3(), 43, ((Number) ((C36570n) gVar2.f226562f).getValue()).intValue(), false, false, "", (String) null);
                String str2 = (String) ((C36570n) gVar2.f226565h4).getValue();
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    ((C101488s) C86312j.m106911c(C101488s.class)).gh0((String) ((C36570n) gVar2.f226565h4).getValue());
                }
                UIStateCenter e3 = gVar.mo14599e3();
                if (e3 == null) {
                    return true;
                }
                e3.dispatch(new C78236a(str));
                return true;
            }
        }
        return false;
    }

    /* renamed from: i3 */
    public final String mo107874i3() {
        Intent intent = getContext().getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("KSendWording") : null;
        return Util.isNullOrNil(stringExtra) ? getString(C0966R.string.a2s) : stringExtra;
    }

    /* renamed from: j3 */
    public final String mo107875j3() {
        return (String) ((C36570n) this.f226561e).getValue();
    }

    /* renamed from: k3 */
    public final String mo107876k3() {
        return (String) ((C36570n) this.f226560d).getValue();
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C77747b(this));
        }
    }
}
